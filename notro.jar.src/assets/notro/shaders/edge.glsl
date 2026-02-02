#version 130

uniform sampler2D originalTexture;
uniform float edgeTreshold;

void main() {
    vec2 st = gl_TexCoord[0].st;
    float grayscale = dot(texture2D(originalTexture, st).rgb, vec3(0.299, 0.587, 0.114));
    float isEdge = 1.-step(edgeTreshold, grayscale);
    gl_FragColor = vec4(isEdge, isEdge, isEdge, isEdge);
}
