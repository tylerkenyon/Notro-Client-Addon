/*    */ package eu.shoroa.bridge.ui.clickgui.comp.e;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.bridge.b.a.b;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.feature.b.a.e;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public final class a extends d {
/*    */   @NotNull
/*    */   private final eu.shoroa.bridge.d.e.a a;
/*    */   private final eu.shoroa.bridge.b.a.a b;
/*    */   
/* 14 */   public a(eu.shoroa.bridge.d.e.a theme, float x, float y, float w, float h) { super(x, y, w, h); this.a = theme;
/* 15 */     this.b = eu.shoroa.bridge.b.a.a.a(a::a, a::b); } private static final Float a() { return Float.valueOf(180.0F); } @NotNull public Object clone() { return super.clone(); } private static final b b() { return b.LINEAR; }
/*    */   
/*    */   public void render(float mx, float my, float delta) {
/* 18 */     this.b.a(Intrinsics.areEqual(this.a.a(), eu.shoroa.bridge.d.e.a.a.k().a()));
/*    */ 
/*    */     
/* 21 */     float padding = 6.0F;
/* 22 */     float previewSize = (getW() - padding * 2) / 1.2F;
/* 23 */     float previewX = getX() + getW() - previewSize - padding;
/* 24 */     float previewY = getY() + padding;
/*    */     
/* 26 */     d.a(d.a, previewX, previewY, previewSize, previewSize, 8.0F, 
/* 27 */         d.a.a(this.a.c(), this.a.b(), b.a.b()), 0.0F, 64, null);
/*    */ 
/*    */     
/* 30 */     d.a(d.a, previewX, previewY, previewSize, previewSize, 8.0F, 
/* 31 */         d.a.a(this.a.f()).a(this.b.a() * 2.0F), 0.0F, 64, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 36 */     float padding = 6.0F;
/* 37 */     float previewSize = (getW() - padding * 2) / 1.2F;
/* 38 */     float previewX = getX() + getW() - previewSize - padding;
/* 39 */     float previewY = getY() + padding;
/*    */     
/* 41 */     if ((previewX <= mx) ? ((mx <= previewX + previewSize)) : false)
/* 42 */       if (((previewY <= my) ? ((my <= previewY + previewSize)) : false) && 
/* 43 */         button == 0) {
/*    */         
/* 45 */         eu.shoroa.bridge.d.e.a.a.a(this.a);
/* 46 */         e e1 = (e)BridgeClient.a.b().moduleManager().a(e.class), $this$click_u24lambda_u242 = e1; int $i$a$-apply-ElementTheme$click$1 = 0;
/* 47 */         $this$click_u24lambda_u242.t().a(this.a.f());
/* 48 */         $this$click_u24lambda_u242.s().a(this.a.b());
/*    */         (e)BridgeClient.a.b().moduleManager().a(e.class);
/*    */       }  
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\e\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */