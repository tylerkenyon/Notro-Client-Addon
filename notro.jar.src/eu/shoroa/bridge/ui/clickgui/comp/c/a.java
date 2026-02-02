/*    */ package eu.shoroa.bridge.ui.clickgui.comp.c;public final class a { @NotNull
/*    */   private final String a; @NotNull
/*    */   private final String b; @NotNull
/*    */   private final Function0<Unit> c;
/*    */   @NotNull
/*    */   private final Function0<Unit> d;
/*    */   
/*    */   public a(String title, String message, Function0<Unit> onConfirm, Function0<Unit> onCancel) {
/*  9 */     this.a = title;
/* 10 */     this.b = message;
/* 11 */     this.c = onConfirm;
/* 12 */     this.d = onCancel;
/*    */     
/* 14 */     this.e = 300.0F;
/* 15 */     this.f = 140.0F;
/* 16 */     this.g = 100.0F;
/* 17 */     this.h = 30.0F;
/*    */   }
/*    */   private final float e; private final float f; private final float g; private final float h; private boolean i;
/*    */   public final boolean a() {
/* 21 */     return true;
/*    */   }
/*    */   public final void a(float mx, float my, float panelX, float panelY, float panelW, float panelH, boolean clickedMouse) {
/* 24 */     float centerX = panelX + (panelW - this.e) / 2.0F;
/* 25 */     float centerY = panelY + (panelH - this.f) / 2.0F;
/*    */     
/* 27 */     float yesX = centerX + 30.0F;
/* 28 */     float noX = centerX + this.e - this.g - 30.0F;
/* 29 */     float btnY = centerY + this.f - this.h - 20.0F;
/*    */ 
/*    */     
/* 32 */     d.a(d.a, centerX, centerY, this.e, this.f, 6.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 64, null);
/*    */ 
/*    */     
/* 35 */     d.b(d.a, this.a, centerX + 20.0F, centerY + 15.0F, "semibold", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*    */ 
/*    */     
/* 38 */     d.b(d.a, this.b, centerX + 20.0F, centerY + 45.0F, "regular", 14.0F, eu.shoroa.bridge.d.e.a.a.k().d(), d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*    */ 
/*    */     
/* 41 */     d.a(d.a, yesX, btnY, this.g, this.h, 5.0F, d.a.a(new Color(60, 150, 60)), 0.0F, 64, null);
/* 42 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.b(d.a, "Yes", yesX + this.g / 2, btnY + 8.0F, "regular", 14.0F, Color.WHITE, d.a.CENTER_TOP, 0.0F, 0.0F, 384, null);
/*    */ 
/*    */     
/* 45 */     d.a(d.a, noX, btnY, this.g, this.h, 5.0F, d.a.a(new Color(150, 60, 60)), 0.0F, 64, null);
/* 46 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.b(d.a, "No", noX + this.g / 2, btnY + 8.0F, "regular", 14.0F, Color.WHITE, d.a.CENTER_TOP, 0.0F, 0.0F, 384, null);
/*    */ 
/*    */     
/* 49 */     if (clickedMouse && !this.i) {
/* 50 */       this.i = true;
/* 51 */       if (a(mx, my, yesX, btnY, this.g, this.h)) {
/* 52 */         this.c.invoke();
/* 53 */       } else if (a(mx, my, noX, btnY, this.g, this.h)) {
/* 54 */         this.d.invoke();
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     if (!clickedMouse) this.i = false; 
/*    */   }
/*    */   
/*    */   private final boolean a(float mx, float my, float x, float y, float w, float h) {
/* 62 */     if ((x <= mx) ? ((mx <= x + w)) : false) if ((y <= my) ? ((my <= y + h)) : false);  return false;
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */