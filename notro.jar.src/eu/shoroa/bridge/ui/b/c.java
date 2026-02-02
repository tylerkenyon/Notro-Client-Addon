/*    */ package eu.shoroa.bridge.ui.b;
/*    */ public final class c extends d {
/*    */   @NotNull
/*    */   private final Color a;
/*    */   private float b;
/*    */   private float c;
/*    */   private float d;
/*    */   private float e;
/*    */   @NotNull
/*    */   private final eu.shoroa.bridge.d.e.c f;
/*    */   
/* 12 */   public c(Color initialColor, float x, float y, float w, float h) { super(x, y, w, h); this.a = initialColor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     this.f = new eu.shoroa.bridge.d.e.c();
/* 19 */     this.g = new eu.shoroa.bridge.d.e.c();
/* 20 */     this.h = new eu.shoroa.bridge.d.e.c();
/*    */     
/* 22 */     this.i = new g(0.0F);
/* 23 */     this.j = new g(0.0F);
/* 24 */     this.k = new g(0.0F);
/* 25 */     this.l = new g(0.0F);
/*    */     
/* 27 */     this.m = this.a;
/*    */ 
/*    */     
/* 30 */     float[] hsb = Color.RGBtoHSB(this.a.getRed(), this.a.getGreen(), this.a.getBlue(), null);
/* 31 */     this.b = hsb[0]; this.c = hsb[1]; this.d = true - hsb[2];
/* 32 */     this.e = 1.0F - this.a.getAlpha() / 255.0F; }
/*    */   @NotNull private final eu.shoroa.bridge.d.e.c g;
/*    */   @NotNull private final eu.shoroa.bridge.d.e.c h;
/*    */   @NotNull private final g i;
/* 36 */   @NotNull private final g j; @NotNull private final g k; @NotNull private final g l; @NotNull private Color m; @NotNull public final Color a() { return this.a; } @NotNull public Object clone() { return super.clone(); } @NotNull public final Color b() { return this.m; } public final void a(Color <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.m = <set-?>; } public void render(float mx, float my, float delta) { this.f.a(new Function1<Float, Unit>(this) {
/* 37 */           public final void a(float x) { c.a(this.a, Math.max(0.0F, Math.min(1.0F, (x - this.a.getX() + 40.0F) / (this.a.getW() - 80.0F)))); }
/*    */         }new Function1<Float, Unit>(this) { public final void a(float y) {
/* 39 */             c.b(this.a, Math.max(0.0F, Math.min(1.0F, (y - this.a.getY() + 10) / (this.a.getH() - 20))));
/*    */           } }
/*    */       );
/* 42 */     eu.shoroa.bridge.d.e.c.a(this.g, null, new Function1<Float, Unit>(this) {
/* 43 */           public final void a(float y) { c.c(this.a, Math.max(0.0F, Math.min(1.0F, (y - this.a.getY() + 10) / (this.a.getH() - 20)))); }
/*    */         }1, null);
/* 45 */     eu.shoroa.bridge.d.e.c.a(this.h, null, new Function1<Float, Unit>(this) { public final void a(float y) {
/* 46 */             c.d(this.a, Math.max(0.0F, Math.min(1.0F, (y - this.a.getY() + 10) / (this.a.getH() - 20))));
/*    */           } }
/*    */         1, null);
/* 49 */     this.k.a(this.c * (getW() - 80.0F), 15.0F);
/* 50 */     this.j.a(this.d * (getH() - 20.0F), 15.0F);
/* 51 */     this.i.a(this.b * (getH() - 20.0F), 15.0F);
/* 52 */     this.l.a(this.e * (getH() - 20.0F), 15.0F);
/*    */     
/* 54 */     this.m = new Color(Color.HSBtoRGB(this.i.a() / (getH() - 20.0F), this.k.a() / (getW() - 80.0F), true - this.j.a() / (getH() - 20.0F)));
/*    */     
/* 56 */     int colors = 10;
/* 57 */     Color[] hues = new Color[colors + 2];
/* 58 */     for (int i = 1, j = colors + 1; i < j; i++) {
/* 59 */       float hue = 1.1F / hues.length * i;
/* 60 */       hues[i] = new Color(Color.HSBtoRGB(hue, 1.0F, 1.0F));
/*    */     } 
/* 62 */     hues[0] = new Color(Color.HSBtoRGB(0.0F, 1.0F, 1.0F));
/* 63 */     hues[11] = new Color(Color.HSBtoRGB(0.0F, 1.0F, 1.0F));
/*    */     
/* 65 */     d.b.a.a(getX(), getY(), 20.0F, getH(), 10.0F, this.m);
/* 66 */     d.a(d.a, getX() + 3.0F, getY() + this.l.a() + 3.0F, 14.0F, 14.0F, 7.0F, d.a.a(a.a.k().d()), 0.0F, 64, null);
/*    */     
/* 68 */     d.b.a.a(getX() + 30.0F, getY(), getW() - 60, getH(), this.i.a() / (getH() - 20.0F));
/* 69 */     d.a(d.a, getX() + 30.0F - true, getY() - true, getW() - 60 + 2, getH() + 2, 10.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 64, null);
/* 70 */     d.a(d.a, getX() + 30.0F + this.k.a() + 3.0F, getY() + this.j.a() + 3.0F, 14.0F, 14.0F, 7.0F, d.a.a(this.m), 0.0F, 64, null);
/* 71 */     d.a(d.a, getX() + 30.0F + this.k.a() + 3.0F, getY() + this.j.a() + 3.0F, 14.0F, 14.0F, 7.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 64, null);
/*    */     
/* 73 */     d.b.a.a(getX() + getW() - 20.0F, getY(), 20.0F, getH(), 10.0F, Arrays.<Color>copyOf(hues, hues.length));
/* 74 */     d.a(d.a, getX() + getW() - 20.0F - true, getY() - true, 22.0F, getH() + 2, 10.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 64, null);
/* 75 */     d.a(d.a, getX() + getW() - 20.0F + 3.0F, getY() + this.i.a() + 3.0F, 14.0F, 14.0F, 7.0F, d.a.a(a.a.k().d()), 0.0F, 64, null);
/*    */     
/* 77 */     this.m = a.a.a(new Color(Color.HSBtoRGB(this.i.a() / (getH() - 20.0F), this.k.a() / (getW() - 80.0F), true - this.j.a() / (getH() - 20.0F))), 1.0F - this.e); }
/*    */ 
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 81 */     if (d.hovered$default(this, getX() + 30.0F, getY(), getW() - 60, 0.0F, 8, null) && button == 0) this.f.b(); 
/* 82 */     if (hovered(getX() + getW() - 20.0F, getY(), 20.0F, getH()) && button == 0) this.g.b(); 
/* 83 */     if (hovered(getX(), getY(), 20.0F, getH()) && button == 0) this.h.b(); 
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {
/* 87 */     this.f.c();
/* 88 */     this.g.c();
/* 89 */     this.h.c();
/*    */   }
/*    */   
/*    */   public final void b(Color newColor) {
/* 93 */     Intrinsics.checkNotNullParameter(newColor, ""); float[] hsb = Color.RGBtoHSB(newColor.getRed(), newColor.getGreen(), newColor.getBlue(), null);
/* 94 */     this.b = hsb[0]; this.c = hsb[1]; this.d = true - hsb[2];
/* 95 */     this.e = 1.0F - newColor.getAlpha() / 255.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */