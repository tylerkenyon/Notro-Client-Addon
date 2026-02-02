/*    */ package eu.shoroa.bridge.ui.c.a;
/*    */ 
/*    */ public final class a extends d {
/*    */   @NotNull
/*    */   private final String a;
/*    */   @NotNull
/*    */   private final String b;
/*    */   private Function0<Unit> c;
/*    */   
/*    */   @NotNull
/* 11 */   public final String a() { return this.a; } private boolean d; private final eu.shoroa.bridge.b.a.a e; private final eu.shoroa.bridge.b.a.a f; @NotNull public final String b() { return this.b; } @NotNull public Object clone() { return super.clone(); }
/* 12 */   public a(String text, String icon, float x, float y, float w, float h) { super(x, y, w, h);
/*    */     this.a = text;
/*    */     this.b = icon;
/* 15 */     this.e = eu.shoroa.bridge.b.a.a.a(a::c, a::d);
/* 16 */     this.f = eu.shoroa.bridge.b.a.a.a(a::e, a::f); } private static final Float c() { return Float.valueOf(120.0F); } private static final b d() { return b.LINEAR; } private static final Float e() { return Float.valueOf(100.0F); } private static final b f() { return b.LINEAR; }
/*    */    public void render(float mx, float my, float delta) {
/* 18 */     this.e.a(d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/* 19 */     this.f.a(this.d);
/*    */ 
/*    */ 
/*    */     
/* 23 */     Intrinsics.checkNotNullExpressionValue(this.f.a(
/* 24 */           this.e.a(
/* 25 */             new Color(0.0F, 0.0F, 0.0F, 0.2F), 
/* 26 */             new Color(1.0F, 1.0F, 1.0F, 0.05F)), 
/* 27 */           new Color(1.0F, 1.0F, 1.0F, 0.2F)), ""); d.a(d.a, this, 15.0F, d.a.a(this.f.a(this.e.a(new Color(0.0F, 0.0F, 0.0F, 0.2F), new Color(1.0F, 1.0F, 1.0F, 0.05F)), new Color(1.0F, 1.0F, 1.0F, 0.2F))), 0.0F, 8, null);
/*    */ 
/*    */ 
/*    */     
/* 31 */     d.a(d.a, this, 15.0F, d.a.a(new Color(1.0F, 1.0F, 1.0F, 0.5F)).a(1.0F), 0.0F, 8, null);
/* 32 */     Intrinsics.checkNotNullExpressionValue(this.a.toUpperCase(Locale.ROOT), ""); Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.b(d.a, this.a.toUpperCase(Locale.ROOT), getX() + getW() / 2.0F, getY() + getH() / 2.0F, "semibold", 20.0F, Color.WHITE, d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/* 33 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.b(d.a, this.b, getX() + getH() / 2.0F, getY() + getH() / 2.0F, "solid", 28.0F, Color.WHITE, d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 37 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 38 */       this.d = true;
/*    */     }
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {
/* 43 */     if (this.d && d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 44 */       if (this.c == null) Intrinsics.throwUninitializedPropertyAccessException("");  null.invoke();
/*    */     } 
/* 46 */     this.d = false;
/*    */   }
/*    */   @NotNull
/*    */   public final a a(Function0<Unit> onClick) {
/* 50 */     Intrinsics.checkNotNullParameter(onClick, ""); this.c = onClick;
/* 51 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\c\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */