/*    */ package eu.shoroa.bridge.ui.clickgui.comp.d.a;
/*    */ 
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.ui.clickgui.comp.d.b;
/*    */ import java.awt.Color;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public final class a extends d {
/*    */   @NotNull
/*    */   private final b a;
/*    */   @NotNull
/*    */   private final b b;
/*    */   private final eu.shoroa.bridge.b.a.a c;
/*    */   
/*    */   @NotNull
/* 16 */   public Object clone() { return super.clone(); } private final float d; private final float e; private final float f; @NotNull
/* 17 */   public final b a() { return this.a; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public a(b profile, float x, float y, float w, float h, b popup) {
/* 23 */     super(x, y, w, h); this.a = profile;
/*    */     this.b = popup;
/* 25 */     this.c = eu.shoroa.bridge.b.a.a.a(a::b, a::c);
/* 26 */     this.d = 10.0F;
/* 27 */     this.e = 16.0F;
/* 28 */     this.f = 6.0F;
/*    */   } private static final Float b() { return Float.valueOf(0.0F); } private static final b c() { return b.LINEAR; }
/*    */   public void render(float mx, float my, float delta) {
/* 31 */     boolean hovered = d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null);
/* 32 */     this.c.a(hovered);
/* 33 */     float anim = this.c.a();
/*    */     
/* 35 */     Color baseColor = new Color(32, 32, 32);
/* 36 */     Color hoverOutline = new Color(90, 160, 255, (int)(anim * 'ÿ'));
/* 37 */     Color textPrimary = Color.WHITE;
/* 38 */     Color textSecondary = new Color(160, 160, 160);
/*    */ 
/*    */     
/* 41 */     d.a(d.a, getX(), getY(), getW(), getH(), this.d, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 64, null);
/*    */ 
/*    */     
/* 44 */     if (hovered || anim > 0.0F) {
/* 45 */       d.a(d.a, getX(), getY(), getW(), getH(), this.d, d.a.a(hoverOutline).a(2.0F), 0.0F, 64, null);
/*    */     }
/*    */ 
/*    */     
/* 49 */     float previewSize = 64.0F;
/* 50 */     d.a.a(this.a.c(), getX() + 12.0F, getY() + getH() / 2.0F - previewSize / 2.0F, previewSize, previewSize, 8.0F, 1.0F);
/*    */ 
/*    */     
/* 53 */     Intrinsics.checkNotNull(textPrimary); d.b(d.a, this.a.a(), getX() + 70.0F, getY() + 18.0F, "semibold", 15.0F, textPrimary, d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/* 54 */     d.b(d.a, this.a.b(), getX() + 70.0F, getY() + 38.0F, "regular", 13.0F, textSecondary, d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*    */ 
/*    */     
/* 57 */     float iconY = getY() + getH() - this.e - this.f;
/* 58 */     float iconX = getX() + getW() - this.e + this.f;
/* 59 */     List icons = CollectionsKt.listOf("modules");
/*    */     
/* 61 */     for (String iconPath : icons) {
/* 62 */       d.a.a(iconPath, iconX, iconY, this.e, this.e, 4.0F, 1.0F);
/* 63 */       iconX -= this.e + 8.0F;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 68 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 1)
/* 69 */       this.b.a(mx, my, this); 
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\d\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */