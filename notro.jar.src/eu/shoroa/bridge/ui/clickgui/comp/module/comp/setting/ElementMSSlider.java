/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting;
/*    */ 
/*    */ import eu.shoroa.bridge.b.a.b;
/*    */ import eu.shoroa.bridge.b.b.d;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.d.e.a;
/*    */ import eu.shoroa.bridge.d.e.g;
/*    */ import eu.shoroa.bridge.ui.b.d;
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\020\004\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\025\022\f\020\004\032\b\022\004\022\0020\0020\026¢\006\004\b\027\020\030J'\020\t\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\t\020\nJ\017\020\013\032\0020\003H\026¢\006\004\b\013\020\fJ'\020\r\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\r\020\nJ'\020\016\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\003H\026¢\006\004\b\016\020\017R\032\020\021\032\006*\0020\0200\0208\002@\002X\016¢\006\006\n\004\b\021\020\022R\024\020\024\032\0020\0238\002X\004¢\006\006\n\004\b\024\020\025"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSSlider;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/b;", "", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "offset", "()F", "release", "render", "(FFF)V", "Leu/shoroa/bridge/b/a/a;", "sliding", "Leu/shoroa/bridge/b/a/a;", "Leu/shoroa/bridge/d/e/g;", "smoothedRender", "Leu/shoroa/bridge/d/e/g;", "Leu/shoroa/bridge/feature/c/b;", "<init>", "(Leu/shoroa/bridge/feature/c/b;)V"})
/*    */ public final class ElementMSSlider extends b<Number> {
/*    */   private a sliding;
/*    */   @NotNull
/*    */   private final g smoothedRender;
/*    */   
/* 19 */   public ElementMSSlider(b setting) { super(setting);
/* 20 */     this.sliding = a.a(ElementMSSlider::sliding$lambda$0, ElementMSSlider::sliding$lambda$1);
/* 21 */     this.smoothedRender = new g(0.0F); }
/* 22 */   @NotNull public Object clone() { return super.clone(); } public float offset() { return 64.0F; }
/*    */   private static final Float sliding$lambda$0() { return Float.valueOf(180.0F); }
/*    */   private static final b sliding$lambda$1() { return b.LINEAR; } public void render(float mx, float my, float delta) {
/* 25 */     d.a(d.a, (d)this, 8.0F, d.a.a(a.a.k().c()), 0.0F, 8, null);
/*    */     
/* 27 */     float sliderX = getX() + 13;
/* 28 */     float sliderW = getW() - 26;
/* 29 */     Intrinsics.checkNotNull(b.a.c()); float dragPos = Math.max(0.0F, Math.min(sliderW, b.a.c().mouseX() - sliderX));
/* 30 */     Intrinsics.checkNotNull(getSetting().c()); double min = ((Number)getSetting().c()).doubleValue();
/* 31 */     Intrinsics.checkNotNull(getSetting().d()); double max = ((Number)getSetting().d()).doubleValue();
/* 32 */     double current = ((Number)getSetting().b()).doubleValue();
/* 33 */     Intrinsics.checkNotNull(getSetting().e()); double step = ((Number)getSetting().e()).doubleValue();
/*    */     
/* 35 */     float rawRender = (float)(sliderW * (current - min) / (max - min));
/* 36 */     this.smoothedRender.a(rawRender, 10.0F);
/* 37 */     if (this.sliding.c()) {
/* 38 */       double value = (dragPos / sliderW) * (max - min) + min; value = Math.round(Math.max(min, Math.min(max, value)) * 1.0D / step) / 1.0D / step;
/*    */ 
/*    */       
/* 41 */       if (!Intrinsics.areEqual(Double.valueOf(value), getSetting().b())) {
/* 42 */         Number number = (Number)getSetting().b();
/* 43 */         if (number instanceof Double) { getSetting().a(Double.valueOf(value)); }
/* 44 */         else if (number instanceof Float) { getSetting().a(Float.valueOf((float)value)); }
/* 45 */         else if (number instanceof Integer) { getSetting().a(Integer.valueOf((int)value)); }
/* 46 */         else if (number instanceof Long) { getSetting().a(Long.valueOf((long)value)); }
/* 47 */         else if (number instanceof Short) { getSetting().a(Short.valueOf((short)(int)value)); }
/* 48 */         else if (number instanceof Byte) { getSetting().a(Byte.valueOf((byte)(int)value)); }
/*    */         
/* 50 */         getSetting().g();
/*    */       } 
/*    */     } 
/*    */     
/* 54 */     d.b(d.a, getSetting().a(), getX() + 10, getY() + 20, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/* 55 */     d.b(d.a, "" + 
/* 56 */         (int)(((Number)getSetting().b()).floatValue() * 100) / 100.0F, 
/* 57 */         getX() + getW() - 10, 
/* 58 */         getY() + 20, 
/* 59 */         "semibold", 
/* 60 */         18.0F, 
/* 61 */         a.a.k().e(), 
/* 62 */         d.a.RIGHT_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */ 
/*    */     
/* 65 */     float sphereSize = 18.0F;
/* 66 */     d.a(d.a, sliderX - 2, getY() + getH() - 24, sliderW + 4, 10.0F, 5.0F, d.a.a(a.a.k().c()), 0.0F, 64, null);
/* 67 */     d.a(d.a, sliderX + this.smoothedRender.a() - sphereSize / 2.0F, getY() + getH() - 22 - sphereSize / 2.0F + 3, sphereSize, sphereSize, sphereSize, d.a.a(a.a.k().c()), 0.0F, 64, null);
/* 68 */     sphereSize -= 4.0F;
/* 69 */     d.a(d.a, sliderX, getY() + getH() - 22, sliderW, 6.0F, 4.0F, d.a.a(a.a.k().b()), 0.0F, 64, null);
/* 70 */     d.a(d.a, sliderX, getY() + getH() - 22, this.smoothedRender.a(), 6.0F, 4.0F, d.a.a(a.a.k().f()), 0.0F, 64, null);
/*    */     
/* 72 */     double total = (max + Math.abs(min)) / step;
/* 73 */     if (total <= 20.0D) {
/* 74 */       int i = 0, j = (int)total; if (i <= j)
/* 75 */         while (true) { double x = sliderX + (i * (float)step) / (max - min) * sliderW;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 82 */           Intrinsics.checkNotNullExpressionValue(this.sliding.a(new Color(0, 0, 0, 0), a.a.k().c()), ""); d.a(d.a, (float)x, getY() + getH() - 22, 1.0F, 6.0F, 0.0F, d.a.a(this.sliding.a(new Color(0, 0, 0, 0), a.a.k().c())), 0.0F, 64, null); if (i != j) {
/*    */             i++; continue;
/*    */           }  break; }
/*    */          
/*    */     } 
/* 87 */     d.a(d.a, sliderX + this.smoothedRender.a() - sphereSize / 2.0F, getY() + getH() - 22 - sphereSize / 2.0F + 3, sphereSize, sphereSize, sphereSize, d.a.a(a.a.k().f()), 0.0F, 64, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 91 */     if (d.hovered$default((d)this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 92 */       this.sliding.a(true);
/*    */     }
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {
/* 97 */     this.sliding.a(false);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\ElementMSSlider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */