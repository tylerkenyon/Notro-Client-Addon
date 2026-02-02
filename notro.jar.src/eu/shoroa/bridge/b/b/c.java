/*   */ package eu.shoroa.bridge.b.b;
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\020\n\002\020\b\n\002\b\n\b\001\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\006\032\0020\002¢\006\004\b\007\020\bR\027\020\003\032\0020\0028\007¢\006\f\n\004\b\003\020\004\032\004\b\003\020\005j\002\b\tj\002\b\nj\002\b\013j\002\b\f"}, d2 = {"Leu/shoroa/bridge/b/b/c;", "", "", "a", "I", "()I", "p0", "<init>", "(Ljava/lang/String;II)V", "STROKE", "SOLID", "BLUR", "TOPOLOGY"})
/*   */ public enum c {
/* 4 */   STROKE(0),
/* 5 */   SOLID(1),
/* 6 */   BLUR(-10),
/* 7 */   TOPOLOGY(-10);
/*   */   private final int a;
/*   */   
/*   */   c(int mode) {
/*   */     this.a = mode;
/*   */   }
/*   */   
/*   */   @JvmName(name = "a")
/*   */   public final int a() {
/*   */     return this.a;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static EnumEntries<c> b() {
/*   */     return c;
/*   */   }
/*   */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\b\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */