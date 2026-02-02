/*    */ package eu.shoroa.bridge.ui.a.a;
/*    */ public final class a extends d {
/*    */   private int a;
/*    */   private boolean b;
/*    */   private final eu.shoroa.bridge.b.a.a c;
/*    */   @NotNull
/*    */   private Function1<? super a, Unit> d;
/*    */   private boolean e;
/*    */   private int f;
/*    */   @NotNull
/*    */   private String g;
/*    */   @NotNull
/*    */   private String h;
/*    */   
/* 15 */   public a(float x, float y, float w, float h) { super(x, y, w, h);
/* 16 */     this.a = 40;
/*    */     
/* 18 */     this.c = eu.shoroa.bridge.b.a.a.a(a::f, a::g);
/* 19 */     this.d = null.a;
/*    */ 
/*    */     
/* 22 */     this.g = "";
/* 23 */     this.h = ""; } @NotNull public Object clone() { return super.clone(); } public final boolean a() { return this.b; } public final void a(boolean <set-?>) { this.b = <set-?>; } private static final Float f() { return Float.valueOf(180.0F); } @NotNull public final String d() { return this.h; } private static final b g() { return b.CUBIC_IN_OUT; } public final int b() { return this.f; } public final void a(int <set-?>) { this.f = <set-?>; } @NotNull public final String c() { return this.g; } public final void a(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.g = <set-?>; } public final void b(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.h = <set-?>; }
/*    */    public void render(float mx, float my, float delta) {
/* 25 */     eu.shoroa.bridge.ui.a.a.a.b(getX(), getY(), getW(), getH());
/* 26 */     eu.shoroa.bridge.ui.a.a.a(eu.shoroa.bridge.ui.a.a.a, this.g, getX() + 12.0F, getY() + getH() / 4.0F, 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), null, 32, null);
/*    */     
/* 28 */     float timer1s = (float)(System.currentTimeMillis() % 500L) / 500.0F;
/* 29 */     Intrinsics.checkNotNullExpressionValue(this.g.substring(0, this.f), ""); float cursorX = getX() + d.a.a(this.g.substring(0, this.f), "console", 16.0F) + 12.0F;
/* 30 */     if (this.b)
/* 31 */       d.a(d.a, cursorX, getY() + 10.0F, 2.0F, getH() - 20.0F, 0.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.a(eu.shoroa.bridge.d.e.a.a.k().e(), (float)Math.sin((timer1s * 2) * Math.PI) * 0.5F + 0.5F)), 0.0F, 64, null); 
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 35 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 36 */       this.b = true;
/* 37 */       this.f = this.g.length();
/*    */     } else {
/* 39 */       this.b = false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */   
/*    */   public void onKey(int code, char char) {
/*    */     try {
/* 47 */       if (this.b) {
/* 48 */         if (code == eu.shoroa.bridge.d.d.a.e()) {
/* 49 */           if ((this.g.length() > 0)) {
/* 50 */             Intrinsics.checkNotNullExpressionValue(this.g.substring(0, Math.max(0, this.f - 1)), ""); Intrinsics.checkNotNullExpressionValue(this.g.substring(this.f), ""); this.g = this.g.substring(0, Math.max(0, this.f - 1)) + this.g.substring(0, Math.max(0, this.f - 1));
/* 51 */             int i = this.f; this.f = i + -1;
/*    */           } 
/* 53 */         } else if (code == eu.shoroa.bridge.d.d.a.f()) {
/* 54 */           this.d.invoke(this);
/* 55 */           this.h = this.g;
/* 56 */         } else if (this.g.length() < this.a && char != '§' && char >= ' ' && char != '') {
/* 57 */           Intrinsics.checkNotNullExpressionValue(this.g.substring(0, this.f), ""); Intrinsics.checkNotNullExpressionValue(this.g.substring(this.f), ""); this.g = this.g.substring(0, this.f) + this.g.substring(0, this.f) + char;
/* 58 */           int i = this.f; this.f = i + 1;
/*    */         } 
/*    */         
/* 61 */         if (code == eu.shoroa.bridge.d.d.a.g()) {
/* 62 */           this.f = Math.max(0, this.f - 1);
/* 63 */         } else if (code == eu.shoroa.bridge.d.d.a.h()) {
/* 64 */           this.f = Math.min(this.g.length(), this.f + 1);
/*    */         } 
/*    */       } 
/* 67 */     } catch (Exception exception) {}
/*    */   }
/*    */   @NotNull
/*    */   public final a b(int maxChars) {
/* 71 */     this.a = maxChars;
/* 72 */     return this;
/*    */   }
/*    */   @NotNull
/*    */   public final a a(Function1<? super a, Unit> onEnter) {
/* 76 */     Intrinsics.checkNotNullParameter(onEnter, ""); this.d = onEnter;
/* 77 */     return this;
/*    */   }
/*    */   @NotNull
/*    */   public final a e() {
/* 81 */     this.e = true;
/* 82 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */