/*    */ package eu.shoroa.bridge.feature.cosmetic;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\023\b\026\030\0002\0020\001B7\022\006\020\021\032\0020\002\022\006\020\022\032\0020\002\022\006\020\023\032\0020\002\022\006\020\024\032\0020\002\022\006\020\025\032\0020\005\022\006\020\026\032\0020\005¢\006\004\b\027\020\030J\017\020\003\032\0020\002H\027¢\006\004\b\003\020\004R\027\020\n\032\0020\0058\007¢\006\f\n\004\b\006\020\007\032\004\b\b\020\tR\032\020\r\032\0020\0028\007X\004¢\006\f\n\004\b\n\020\013\032\004\b\f\020\004R\032\020\f\032\0020\0028\007X\004¢\006\f\n\004\b\r\020\013\032\004\b\016\020\004R\032\020\016\032\0020\0058\007X\004¢\006\f\n\004\b\017\020\007\032\004\b\020\020\tR\032\020\006\032\0020\0028\007X\004¢\006\f\n\004\b\f\020\013\032\004\b\006\020\004R\032\020\017\032\0020\0028\007X\004¢\006\f\n\004\b\016\020\013\032\004\b\017\020\004"}, d2 = {"Leu/shoroa/bridge/feature/cosmetic/b;", "Leu/shoroa/bridge/feature/a;", "", "toString", "()Ljava/lang/String;", "", "e", "Z", "g", "()Z", "a", "Ljava/lang/String;", "c", "b", "d", "f", "h", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V"})
/*    */ public class b extends a {
/*    */   @NotNull
/*    */   private final String a;
/*    */   @NotNull
/*    */   private final String b;
/*    */   @SerializedName("resource")
/*    */   @NotNull
/*    */   private final String c;
/*    */   
/*    */   @NotNull
/*    */   @JvmName(name = "c")
/* 14 */   public final String c() { return this.a; } @NotNull private final String d; private final boolean e; private final boolean f; @NotNull @JvmName(name = "d")
/* 15 */   public final String d() { return this.b; } @NotNull @JvmName(name = "e")
/* 16 */   public final String e() { return this.c; } @NotNull @JvmName(name = "f")
/* 17 */   public final String f() { return this.d; } @JvmName(name = "g")
/* 18 */   public final boolean g() { return this.e; } @JvmName(name = "h")
/* 19 */   public final boolean h() { return this.f; } public b(String id, String name, String texture, String type, boolean animated, boolean selected) { this.a = id; this.b = name; this.c = texture; this.d = type; this.e = animated; this.f = selected; }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 23 */     return "Cosmetic(id='" + this.a + "', name='" + this.b + "', type=" + this.d + ", animated=" + this.e + ", selected=" + this.f + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\cosmetic\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */