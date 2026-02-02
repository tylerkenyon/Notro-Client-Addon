#version 120
uniform sampler2D texture;
uniform vec2 texelSize, direction;
uniform int radius = 25;
uniform float kernels[128];
void main() {
    vec3 color = texture2D(texture, gl_TexCoord[0].st).rgb * kernels[0];
    for(int i = 1; i <= radius; i++) {
        color += texture2D(texture, gl_TexCoord[0].st + i * texelSize * direction).rgb * kernels[i];
        color += texture2D(texture, gl_TexCoord[0].st - i * texelSize * direction).rgb * kernels[i];
    }
    gl_FragColor = vec4(color, 1.0);
}