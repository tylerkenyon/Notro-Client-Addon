/*    */ package eu.shoroa.bridge.ui.b.a;
/*    */ 
/*    */ 
/*    */ public final class a extends d {
/*    */   @NotNull
/*    */   private final a<Color> b;
/*    */   @NotNull
/*    */   private final eu.shoroa.bridge.ui.b.a c;
/*    */   
/* 10 */   public a(a<Color> holder) { super(360.0F, 360.0F, "Color Picker"); this.b = holder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 17 */     float tileW = getW() / 2 - 20;
/* 18 */     Float[] arrayOfFloat1 = new Float[2]; arrayOfFloat1[0] = Float.valueOf(290.0F); arrayOfFloat1[1] = Float.valueOf(230.0F); Float[] pickerSize = arrayOfFloat1;
/* 19 */     this.d = new c((Color)this.b.a(), getX() + getW() / 2.0F - pickerSize[0].floatValue() / 2.0F, getY() + 60, pickerSize[0].floatValue(), pickerSize[1].floatValue());
/* 20 */     this.c = eu.shoroa.bridge.ui.b.a.a.a("Apply", getX() + getW() / 2 - tileW - 6.0F, getY() + getH() - 50, tileW, 40.0F).b(new Function0<Unit>(this) { public final void a() { a.a(this.a); } }
/* 21 */       ).c("");
/* 22 */     this.e = h.a.a("hex", getX() + getW() / 2.0F + 6.0F, getY() + getH() - 50.0F, tileW, 40.0F).a(9).d().a(new Function1<h, Unit>(this) { private static final int a(String colorString, int start, int end) {
/*    */             boolean bool;
/*    */             
/* 25 */             try { Intrinsics.checkNotNullExpressionValue(colorString.substring(start, end), ""); bool = Integer.parseInt(colorString.substring(start, end), CharsKt.checkRadix(16)); }
/* 26 */             catch (Exception e)
/* 27 */             { bool = false; }  return bool;
/*    */           }
/*    */           
/*    */           public final void a(h it) {
/* 31 */             Intrinsics.checkNotNullParameter(it, ""); String t = it.b();
/* 32 */             int r = a(t, 1, 3);
/* 33 */             int g = a(t, 3, 5);
/* 34 */             int b = a(t, 5, 7);
/* 35 */             int i = (t.length() > 7) ? a(t, 7, 9) : 255;
/* 36 */             a.b(this.a).b(new Color(r, g, b, i)); } }
/*    */       );
/* 38 */     b();
/*    */     
/* 40 */     d[] arrayOfD = new d[3]; arrayOfD[0] = (d)this.c; arrayOfD[1] = (d)this.d; arrayOfD[2] = (d)this.e; getElements().addAll(CollectionsKt.listOf((Object[])arrayOfD)); }
/*    */   @NotNull
/*    */   private final c d; @NotNull
/*    */   private final h e; @NotNull
/* 44 */   public Object clone() { return super.clone(); } public void render(float mx, float my, float delta) { super.render(mx, my, delta);
/* 45 */     if (!this.e.a()) b();  }
/*    */ 
/*    */   
/*    */   private final void a() {
/* 49 */     this.b.b(this.d.b());
/*    */   }
/*    */ 
/*    */   
/*    */   private final void b() {
/* 54 */     String str = "#%02x%02x%02x%02x";
/* 55 */     Object[] arrayOfObject = new Object[4]; arrayOfObject[0] = Integer.valueOf(this.d.b().getRed()); arrayOfObject[1] = 
/* 56 */       Integer.valueOf(this.d.b().getGreen());
/* 57 */     arrayOfObject[2] = Integer.valueOf(this.d.b().getBlue());
/* 58 */     arrayOfObject[3] = Integer.valueOf(this.d.b().getAlpha());
/*    */     arrayOfObject = arrayOfObject;
/*    */     Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "");
/*    */     this.e.a(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */