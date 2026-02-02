/*    */ package eu.shoroa.bridge.ui.b.a;
/*    */ 
/*    */ 
/*    */ public final class b extends d {
/*    */   @NotNull
/*    */   private final a<String> b;
/*    */   @NotNull
/*    */   private eu.shoroa.bridge.d.a.b.a c;
/*    */   private float d;
/*    */   
/* 11 */   public b(a<String> valueHolder, String title, String extension, Function0<Unit> onSuccessfulOpen) { super(200.0F, 200.0F, title); this.b = valueHolder;
/* 12 */     this.c = eu.shoroa.bridge.d.a.b.INSTANCE.a(extension, title);
/*    */     
/* 14 */     getElements().add(a.a.a("Select File", getX() + getW() / 2.0F - 90.0F, getY() + getH() - 50.0F, 180.0F, 40.0F).b(new Function0<Unit>(this, extension, title, onSuccessfulOpen) {
/* 15 */             public final void a() { this.a.a(eu.shoroa.bridge.d.a.b.INSTANCE.a(this.$b, this.$c));
/* 16 */               String path = this.a.b().c();
/* 17 */               if (path != null) {
/* 18 */                 this.a.a().a(path);
/* 19 */                 this.$d.invoke();
/*    */               } else {
/* 21 */                 this.a.a().a("");
/*    */               }  }
/* 23 */           }).c("")); }
/*    */   @NotNull public final a<String> a() { return this.b; }
/* 25 */   @NotNull public Object clone() { return super.clone(); } public final float c() { return this.d; } @NotNull public final eu.shoroa.bridge.d.a.b.a b() { return this.c; } public final void a(eu.shoroa.bridge.d.a.b.a <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.c = <set-?>; } public final void a(float <set-?>) { this.d = <set-?>; }
/*    */    public void render(float mx, float my, float delta) {
/* 27 */     this.d += delta * 200.0F;
/* 28 */     super.render(mx, my, delta);
/* 29 */     if (!this.c.d()) {
/* 30 */       if ((((CharSequence)this.b.a()).length() > 0)) {
/* 31 */         Intrinsics.checkNotNull(this.b.a()); d.b(d.a, (String)this.b.a(), getX() + getW() / 2.0F, getY() + getH() / 2.0F, "semibold", 20.0F, a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */       } else {
/* 33 */         d.b(d.a, "No file selected", getX() + getW() / 2.0F, getY() + getH() / 2.0F, "semibold", 20.0F, a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */       } 
/*    */     } else {
/* 36 */       d.b(d.a, "File Dialog Open...", getX() + getW() / 2.0F, getY() + getH() / 2.0F, "semibold", 20.0F, a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/* 37 */       d.a.a(getX() + getW() / 2.0F, getY() + getH() / 2.0F, 20.0F, 90.0F + this.d, 30.0F + this.d, d.a.a(a.a.k().f()).a(4.0F));
/*    */     } 
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 42 */     super.click(mx, my, button);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */