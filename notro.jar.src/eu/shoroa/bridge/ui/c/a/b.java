/*    */ package eu.shoroa.bridge.ui.c.a;
/*    */ public final class b extends d {
/*    */   @NotNull
/*    */   private final String a;
/*    */   private final float b;
/*    */   @NotNull
/*    */   private final a c;
/*    */   
/*    */   @NotNull
/* 10 */   public final String a() { return this.a; } private Function0<Unit> d; private boolean e; private final a f; private final a g; public final float b() { return this.b; } @NotNull public Object clone() { return super.clone(); }
/* 11 */   public b(String icon, float x, float y, float size) { super(x, y, size, size); this.a = icon; this.b = size;
/* 12 */     Intrinsics.checkNotNull(getBridge().e()); this.c = getBridge().e();
/*    */ 
/*    */     
/* 15 */     this.f = a.a(b::c, b::d);
/* 16 */     this.g = a.a(b::e, b::f); } private static final Float c() { return Float.valueOf(180.0F); } private static final eu.shoroa.bridge.b.a.b d() { return eu.shoroa.bridge.b.a.b.LINEAR; } private static final Float e() { return Float.valueOf(100.0F); } private static final eu.shoroa.bridge.b.a.b f() { return eu.shoroa.bridge.b.a.b.LINEAR; }
/*    */    public void render(float mx, float my, float delta) {
/* 18 */     this.f.a(d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/* 19 */     this.g.a(this.e);
/*    */     
/* 21 */     float nativeImgW = 1920.0F;
/* 22 */     float nativeImgH = 1165.0F;
/*    */     
/* 24 */     float rationH = this.c.height() / nativeImgH;
/* 25 */     float rationW = this.c.width() / nativeImgW;
/*    */     
/* 27 */     float ratio = (rationH < rationW) ? rationW : rationH;
/*    */     
/* 29 */     float imgW = nativeImgW * ratio;
/* 30 */     float imgH = nativeImgH * ratio;
/*    */     
/* 32 */     float imgX = (this.c.width() - imgW) / 2;
/* 33 */     float imgY = (this.c.height() - imgH) / 2;
/* 34 */     d.a.a(getX(), getY(), getW(), getH(), 30.0F, "bg1-blur-a", imgX, imgY, imgW, imgH);
/*    */ 
/*    */ 
/*    */     
/* 38 */     Intrinsics.checkNotNullExpressionValue(this.g.a(
/* 39 */           this.f.a(
/* 40 */             new Color(0.0F, 0.0F, 0.0F, 0.2F), 
/* 41 */             new Color(1.0F, 1.0F, 1.0F, 0.05F)), 
/* 42 */           new Color(1.0F, 1.0F, 1.0F, 0.2F)), ""); d.a(d.a, this, 15.0F, d.a.a(this.g.a(this.f.a(new Color(0.0F, 0.0F, 0.0F, 0.2F), new Color(1.0F, 1.0F, 1.0F, 0.05F)), new Color(1.0F, 1.0F, 1.0F, 0.2F))), 0.0F, 8, null);
/*    */ 
/*    */ 
/*    */     
/* 46 */     d.a(d.a, this, 15.0F, d.a.a(new Color(1.0F, 1.0F, 1.0F, 0.5F)).a(1.0F), 0.0F, 8, null);
/* 47 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.b(d.a, this.a, getX() + this.b / 2.0F, getY() + this.b / 2.0F, "solid", 28.0F, Color.WHITE, d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 51 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 52 */       this.e = true;
/*    */     }
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {
/* 57 */     if (this.e && d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 58 */       if (this.d == null) Intrinsics.throwUninitializedPropertyAccessException("");  null.invoke();
/*    */     } 
/* 60 */     this.e = false;
/*    */   }
/*    */   @NotNull
/*    */   public final b a(Function0<Unit> onClick) {
/* 64 */     Intrinsics.checkNotNullParameter(onClick, ""); this.d = onClick;
/* 65 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\c\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */