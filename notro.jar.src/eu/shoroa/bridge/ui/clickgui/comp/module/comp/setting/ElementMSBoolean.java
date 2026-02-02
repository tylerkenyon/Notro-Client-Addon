/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting;
/*    */ 
/*    */ import eu.shoroa.bridge.b.a.a;
/*    */ import eu.shoroa.bridge.b.b.d;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.d.e.a;
/*    */ import eu.shoroa.bridge.ui.b.d;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\025\022\f\020\004\032\b\022\004\022\0020\0020\025¢\006\004\b\026\020\027J'\020\t\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\t\020\nJ\017\020\013\032\0020\003H\026¢\006\004\b\013\020\fJ'\020\r\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\r\020\nJ'\020\016\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\003H\026¢\006\004\b\016\020\017R\033\020\021\032\006*\0020\0200\0208\007¢\006\f\n\004\b\021\020\022\032\004\b\023\020\024"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSBoolean;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/b;", "", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "offset", "()F", "release", "render", "(FFF)V", "Leu/shoroa/bridge/b/a/a;", "toggle", "Leu/shoroa/bridge/b/a/a;", "getToggle", "()Leu/shoroa/bridge/b/a/a;", "Leu/shoroa/bridge/feature/c/b;", "<init>", "(Leu/shoroa/bridge/feature/c/b;)V"})
/*    */ public final class ElementMSBoolean extends b<Boolean> {
/* 11 */   public ElementMSBoolean(b setting) { super(setting);
/* 12 */     this.toggle = a.a(ElementMSBoolean::toggle$lambda$0, ElementMSBoolean::toggle$lambda$1); } private final a toggle; @NotNull public Object clone() { return super.clone(); } @JvmName(name = "getToggle") public final a getToggle() { return this.toggle; } private static final Float toggle$lambda$0() { return Float.valueOf(180.0F); } private static final b toggle$lambda$1() { return b.SINE_IN_OUT; } public float offset() {
/* 13 */     return 40.0F;
/*    */   }
/*    */   public void render(float mx, float my, float delta) {
/* 16 */     this.toggle.a(((Boolean)getSetting().b()).booleanValue());
/*    */     
/* 18 */     d.a(d.a, (d)this, 8.0F, d.a.a(a.a.k().c()), 0.0F, 8, null);
/* 19 */     d.b(d.a, getSetting().a(), getX() + 10, getY() + getH() / 2.0F, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/* 20 */     d.a(d.a, getX() + getW() - 72.0F, getY() + getH() / 2.0F - 13.0F, 54.0F, 26.0F, 12.0F, d.a.a(a.a.k().c()), 0.0F, 64, null);
/* 21 */     d.a(d.a, getX() + getW() - 70.0F, getY() + getH() / 2.0F - 11.0F, 50.0F, 22.0F, 11.0F, d.a.a(a.a.k().b()), 0.0F, 64, null);
/* 22 */     Intrinsics.checkNotNullExpressionValue(this.toggle.a(a.a.k().c(), a.a.k().f()), ""); d.a(d.a, getX() + getW() - 66.0F + 28.0F * this.toggle.a(), getY() + getH() / 2.0F - 7.0F, 14.0F, 14.0F, 7.0F, d.a.a(this.toggle.a(a.a.k().c(), a.a.k().f())), 0.0F, 64, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 26 */     if (d.hovered$default((d)this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 27 */       getSetting().a(Boolean.valueOf(!((Boolean)getSetting().b()).booleanValue()));
/* 28 */       getSetting().g();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\ElementMSBoolean.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */