#version 120

uniform sampler2D srcTex;
uniform vec2 texelSize;
uniform float outline;
uniform vec4 color;

void main() {
    vec2 st = gl_TexCoord[0].xy;
    float scrAlpha = texture2D(srcTex, st).a;
    float alphaMax = 0.0;

    for(float i = outline; i > 0.0; i -= 0.5) {
        if(i < 0.0) break;
        for(float ang = 0.0; ang < 6.28; ang += 0.5) {
            if(ang > 6.28) break;
            float alphaSample = texture2D(srcTex, st + vec2(cos(ang), sin(ang)) * i * texelSize).a;
            alphaMax = max(alphaMax, alphaSample);
        }
    }

    gl_FragColor = vec4(color.rgb, ((1.0 - scrAlpha) * alphaMax) * color.a);
}
