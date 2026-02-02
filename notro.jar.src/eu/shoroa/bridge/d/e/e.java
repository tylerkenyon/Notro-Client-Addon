/*   */ package eu.shoroa.bridge.d.e;
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\020\n\002\020\016\n\002\b\b\b\001\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\006\032\0020\002¢\006\004\b\007\020\bR\032\020\003\032\0020\0028\007X\004¢\006\f\n\004\b\003\020\004\032\004\b\003\020\005j\002\b\tj\002\b\n"}, d2 = {"Leu/shoroa/bridge/d/e/e;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CLASSIC", "BRAND"})
/*   */ public enum e {
/* 4 */   CLASSIC("solid"),
/* 5 */   BRAND("brands");
/*   */   @NotNull
/*   */   private final String a;
/*   */   
/*   */   e(String font) {
/*   */     this.a = font;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   @JvmName(name = "a")
/*   */   public final String a() {
/*   */     return this.a;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static EnumEntries<e> b() {
/*   */     return c;
/*   */   }
/*   */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\e\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */