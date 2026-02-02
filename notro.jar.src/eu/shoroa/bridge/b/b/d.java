/*    */ package eu.shoroa.bridge.b.b;
/*    */ public final class d { @NotNull
/*    */   public static final a a = new a(null); @NotNull
/*    */   private c b; @NotNull
/*    */   private Color c;
/*    */   @NotNull
/*  7 */   public final c a() { return this.b; } @Nullable private Color d; @Nullable private b e; private float f; @NotNull
/*  8 */   public final Color b() { return this.c; } @Nullable
/*  9 */   public final Color c() { return this.d; } @Nullable
/*    */   public final b d() {
/* 11 */     return this.e;
/*    */   } public final float e() {
/* 13 */     return this.f;
/*    */   }
/*    */   
/*    */   private d(Color color, c mode) {
/* 17 */     this.c = color;
/* 18 */     this.b = mode;
/*    */   }
/*    */   
/*    */   private d(Color from, Color to, b constrain, c mode) {
/* 22 */     this.c = from;
/* 23 */     this.d = to;
/* 24 */     this.b = mode;
/* 25 */     this.e = constrain;
/*    */   }
/*    */   @NotNull
/*    */   public final d a(float width) {
/* 29 */     this.b = c.STROKE;
/* 30 */     this.f = width;
/* 31 */     return this;
/*    */   }
/*    */   public static final class a { private a() {}
/*    */     @NotNull
/*    */     public final d a(Color color) {
/* 36 */       Intrinsics.checkNotNullParameter(color, ""); return new d(color, c.SOLID, null);
/*    */     } @NotNull
/*    */     public final d a(Color from, Color to, b constrain) {
/* 39 */       Intrinsics.checkNotNullParameter(from, ""); Intrinsics.checkNotNullParameter(to, ""); Intrinsics.checkNotNullParameter(constrain, ""); return new d(from, to, constrain, c.SOLID, null);
/*    */     } @NotNull
/*    */     public final d a() {
/* 42 */       Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); return new d(Color.BLACK, c.BLUR, null);
/*    */     } @NotNull
/*    */     public final d b() {
/* 45 */       Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); return new d(Color.BLACK, c.TOPOLOGY, null);
/*    */     } }
/*    */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\b\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */