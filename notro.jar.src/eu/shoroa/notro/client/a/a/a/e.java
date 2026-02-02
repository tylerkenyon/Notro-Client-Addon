/*    */ package eu.shoroa.notro.client.a.a.a;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\b\b\026\030\000 \0072\0020\001:\001\007B\021\022\b\020\b\032\004\030\0010\002¢\006\004\b\t\020\nR\034\020\007\032\004\030\0010\0028\007X\004¢\006\f\n\004\b\003\020\004\032\004\b\005\020\006"}, d2 = {"Leu/shoroa/notro/client/a/a/a/e;", "", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "p0", "<init>", "(Ljava/lang/String;)V"})
/*    */ public class e { @NotNull
/*    */   public static final a a = new a(null);
/*    */   
/*  6 */   public e(String name) { this.b = name; } @Nullable private final String b; @Nullable @JvmName(name = "c") public final String c() { return this.b; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\037\020\t\032\0020\b2\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\006¢\006\004\b\t\020\nJ\037\020\016\032\0020\r2\b\020\005\032\004\030\0010\0042\006\020\f\032\0020\013¢\006\004\b\016\020\017J\037\020\022\032\0020\0212\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\020¢\006\004\b\022\020\023J\037\020\027\032\0020\0262\b\020\005\032\004\030\0010\0042\006\020\025\032\0020\024¢\006\004\b\027\020\030J\037\020\032\032\0020\0312\b\020\005\032\004\030\0010\0042\006\020\025\032\0020\024¢\006\004\b\032\020\033J'\020\037\032\0020\0362\b\020\005\032\004\030\0010\0042\006\020\034\032\0020\0202\006\020\035\032\0020\020¢\006\004\b\037\020 J'\020#\032\0020\"2\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\0062\006\020!\032\0020\006¢\006\004\b#\020$J/\020&\032\0020\0262\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\0062\006\020!\032\0020\0062\006\020%\032\0020\006¢\006\004\b&\020'J7\020)\032\0020\0312\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\0062\006\020!\032\0020\0062\006\020%\032\0020\0062\006\020(\032\0020\006¢\006\004\b)\020*¨\006+"}, d2 = {"Leu/shoroa/notro/client/render/shader/uniforms/Uniform$Companion;", "", "<init>", "()V", "", "name", "", "x", "Leu/shoroa/notro/client/render/shader/uniforms/UFloat;", "float", "(Ljava/lang/String;F)Leu/shoroa/notro/client/render/shader/uniforms/UFloat;", "Ljava/nio/FloatBuffer;", "buffer", "Leu/shoroa/notro/client/render/shader/uniforms/UFloatBuffer;", "floatBuffer", "(Ljava/lang/String;Ljava/nio/FloatBuffer;)Leu/shoroa/notro/client/render/shader/uniforms/UFloatBuffer;", "", "Leu/shoroa/notro/client/render/shader/uniforms/UInt;", "int", "(Ljava/lang/String;I)Leu/shoroa/notro/client/render/shader/uniforms/UInt;", "Ljava/awt/Color;", "c", "Leu/shoroa/notro/client/render/shader/uniforms/Vec3;", "rgb", "(Ljava/lang/String;Ljava/awt/Color;)Leu/shoroa/notro/client/render/shader/uniforms/Vec3;", "Leu/shoroa/notro/client/render/shader/uniforms/Vec4;", "rgba", "(Ljava/lang/String;Ljava/awt/Color;)Leu/shoroa/notro/client/render/shader/uniforms/Vec4;", "target", "slot", "Leu/shoroa/notro/client/render/shader/uniforms/Sampler2D;", "sampler2D", "(Ljava/lang/String;II)Leu/shoroa/notro/client/render/shader/uniforms/Sampler2D;", "y", "Leu/shoroa/notro/client/render/shader/uniforms/Vec2;", "vec2", "(Ljava/lang/String;FF)Leu/shoroa/notro/client/render/shader/uniforms/Vec2;", "z", "vec3", "(Ljava/lang/String;FFF)Leu/shoroa/notro/client/render/shader/uniforms/Vec3;", "w", "vec4", "(Ljava/lang/String;FFFF)Leu/shoroa/notro/client/render/shader/uniforms/Vec4;", "NotroClient"})
/*    */   public static final class a { private a() {} @NotNull
/*    */     public final a a(String name, int target, int slot) {
/*  9 */       return new a(name, target, slot);
/*    */     }
/*    */     @NotNull
/*    */     public final f a(String name, float x, float y) {
/* 13 */       return new f(name, x, y);
/*    */     }
/*    */     @NotNull
/*    */     public final g a(String name, float x, float y, float z) {
/* 17 */       return new g(name, x, y, z);
/*    */     }
/*    */     @NotNull
/*    */     public final h a(String name, float x, float y, float z, float w) {
/* 21 */       return new h(name, x, y, z, w);
/*    */     }
/*    */     @NotNull
/*    */     public final g a(String name, Color c) {
/* 25 */       Intrinsics.checkNotNullParameter(c, ""); return new g(name, c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F);
/*    */     }
/*    */     @NotNull
/*    */     public final h b(String name, Color c) {
/* 29 */       Intrinsics.checkNotNullParameter(c, ""); return new h(name, c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F, c.getAlpha() / 255.0F);
/*    */     }
/*    */     @NotNull
/*    */     public final b a(String name, float x) {
/* 33 */       return new b(name, x);
/*    */     }
/*    */     @NotNull
/*    */     public final d a(String name, int x) {
/* 37 */       return new d(name, x);
/*    */     }
/*    */     @NotNull
/*    */     public final c a(String name, FloatBuffer buffer) {
/* 41 */       Intrinsics.checkNotNullParameter(buffer, ""); return new c(name, buffer);
/*    */     } }
/*    */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\a\a\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */