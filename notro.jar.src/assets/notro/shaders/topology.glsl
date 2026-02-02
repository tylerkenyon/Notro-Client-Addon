#version 120

uniform vec2 resolution;
uniform vec4 color1;
uniform vec4 color2;
uniform float time;

float topologize(float noise) {
    float smoothFloor = noise*12.0;
    vec2 fracU = vec2(smoothFloor,fwidth(smoothFloor)*1.3);
    fracU.x = fract(fracU.x);
    fracU += (1.0 - 2.0*fracU)*step(fracU.y,fracU.x);
    smoothFloor = smoothFloor - clamp(1.0 - fracU.x/fracU.y,0.0,1.0);
    return noise*0.25 + smoothFloor*0.75/11.0;
}

vec3 hash33(vec3 p) {
    float n = sin(dot(p,vec3(7.0,157.0,113.0)));
    return fract(32768.0*n*vec3(64.0,8.0,1.0))*2.0 - 1.0;
}

float tetraNoise(vec2 o) {
    vec3 p = vec3(o.x + 0.008*time, o.y + 0.004*time,0.005*time);
    vec3 i = floor(p + dot(p, vec3(0.33333,0.33333,0.33333)));
    p -= i - dot(i, vec3(0.16666,0.16666,0.16666));
    vec3 i1 = step(p.yzx, p);
    vec3 i2 = max(i1, 1.0-i1.zxy);
    i1 = min(i1, 1.0-i1.zxy);
    vec3 p1 = p - i1 + 0.16666, p2 = p - i2 + 0.33333, p3 = p - 0.5;
    vec4 v = max(0.5 - vec4(dot(p,p), dot(p1,p1), dot(p2,p2), dot(p3,p3)), 0.0);
    vec4 d = vec4(dot(p, hash33(i)), dot(p1, hash33(i + i1)), dot(p2, hash33(i + i2)), dot(p3, hash33(i + 1.0)));
    float n = clamp(dot(d,v*v*v*8.)*1.732 + 0.5, 0., 1.);
    return n;
}

void main() {
    vec2 st = gl_TexCoord[0].st;

    vec2 p = st*resolution/(100.0*resolution/vec2(850.,474.));
    vec2 e = vec2(10.0/(resolution.y+resolution.x),0.0);
    float fxl = topologize(tetraNoise(p + e.xy));
    float fxr = topologize(tetraNoise(p - e.xy));
    float fyu = topologize(tetraNoise(p + e.yx));
    float fyd = topologize(tetraNoise(p - e.yx));
    float weight =  clamp((max(abs(fxl-fxr),abs(fyu - fyd))-0.01)*12.0,0.0,1.0);

    gl_FragColor = vec4(mix(color1,color2,weight));
}
