/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting;
/*    */ 
/*    */ import eu.shoroa.bridge.b.a.a;
/*    */ import eu.shoroa.bridge.b.b.d;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.d.e.a;
/*    */ import eu.shoroa.bridge.ui.b.a.a.a;
/*    */ import java.awt.Color;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\b\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\b\030\0002\b\022\004\022\0020\0020\001B\025\022\f\020\004\032\b\022\004\022\0020\0020\003¢\006\004\b\005\020\006J'\020\r\032\0020\f2\006\020\b\032\0020\0072\006\020\t\032\0020\0072\006\020\013\032\0020\nH\026¢\006\004\b\r\020\016J\017\020\017\032\0020\007H\026¢\006\004\b\017\020\020J'\020\021\032\0020\f2\006\020\b\032\0020\0072\006\020\t\032\0020\0072\006\020\013\032\0020\nH\026¢\006\004\b\021\020\016J'\020\023\032\0020\f2\006\020\b\032\0020\0072\006\020\t\032\0020\0072\006\020\022\032\0020\007H\026¢\006\004\b\023\020\024R\035\020\026\032\b\022\004\022\0020\0020\0258\006¢\006\f\n\004\b\026\020\027\032\004\b\030\020\031R*\020\034\032\n \033*\004\030\0010\0320\0328\006@\006X\016¢\006\022\n\004\b\034\020\035\032\004\b\036\020\037\"\004\b \020!¨\006\""}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSColor;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/ElementModuleSetting;", "Ljava/awt/Color;", "Leu/shoroa/bridge/feature/setting/Setting;", "setting", "<init>", "(Leu/shoroa/bridge/feature/setting/Setting;)V", "", "mx", "my", "", "button", "", "click", "(FFI)V", "offset", "()F", "release", "delta", "render", "(FFF)V", "Leu/shoroa/bridge/ui/internal/widget/util/ValueHolder;", "holder", "Leu/shoroa/bridge/ui/internal/widget/util/ValueHolder;", "getHolder", "()Leu/shoroa/bridge/ui/internal/widget/util/ValueHolder;", "Leu/shoroa/bridge/render/animation/Animation;", "kotlin.jvm.PlatformType", "hoverEdit", "Leu/shoroa/bridge/render/animation/Animation;", "getHoverEdit", "()Leu/shoroa/bridge/render/animation/Animation;", "setHoverEdit", "(Leu/shoroa/bridge/render/animation/Animation;)V", "bridge"})
/*    */ public final class ElementMSColor extends b<Color> {
/*    */   private a hoverEdit;
/*    */   @NotNull
/*    */   private final a<Color> holder;
/*    */   
/* 17 */   public ElementMSColor(b setting) { super(setting);
/* 18 */     this.hoverEdit = a.a(ElementMSColor::hoverEdit$lambda$0, ElementMSColor::hoverEdit$lambda$1);
/* 19 */     this.holder = new a(setting.b()); } @NotNull public Object clone() { return super.clone(); } public final a getHoverEdit() { return this.hoverEdit; } @NotNull public final a<Color> getHolder() { return this.holder; }
/*    */   public final void setHoverEdit(a <set-?>) { this.hoverEdit = <set-?>; }
/* 21 */   private static final Float hoverEdit$lambda$0() { return Float.valueOf(180.0F); } private static final b hoverEdit$lambda$1() { return b.LINEAR; } public float offset() { return 40.0F; }
/*    */    public void render(float mx, float my, float delta) {
/* 23 */     getSetting().a(this.holder.b());
/* 24 */     this.hoverEdit.a(hovered(getX() + getW() - getH() + 6, getY() + getH() / 2 - 16.0F, 32.0F, 32.0F));
/* 25 */     d.a(d.a, (d)this, 8.0F, d.a.a(a.a.k().c()), 0.0F, 8, null);
/* 26 */     d.b(d.a, getSetting().a(), getX() + 10, getY() + getH() / 2.0F, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/* 27 */     d.a(d.a, getX() + getW() - getH() + 6, getY() + getH() / 2 - 16.0F, 32.0F, 32.0F, 13.0F, d.a.a(a.a.k().c()), 0.0F, 64, null);
/* 28 */     d.a(d.a, getX() + getW() - getH() + 6 + 2, getY() + getH() / 2 - 14.0F, 28.0F, 28.0F, 11.0F, d.a.a(a.a.k().b()), 0.0F, 64, null);
/* 29 */     d.a(d.a, getX() + getW() - getH() + 6 + 4, getY() + getH() / 2 - 12.0F, 24.0F, 24.0F, 9.0F, d.a.a((Color)getSetting().b()), 0.0F, 64, null);
/*    */     
/* 31 */     Intrinsics.checkNotNullExpressionValue(this.hoverEdit.a(new Color(0.0F, 0.0F, 0.0F, 0.0F), a.a.k().d(), 0.6F), ""); d.a(d.a, getX() + getW() - getH() + 6 + 4, getY() + getH() / 2 - 12.0F, 24.0F, 24.0F, 9.0F, d.a.a(this.hoverEdit.a(new Color(0.0F, 0.0F, 0.0F, 0.0F), a.a.k().d(), 0.6F)), 0.0F, 64, null);
/* 32 */     Intrinsics.checkNotNullExpressionValue(this.hoverEdit.a(new Color(0.0F, 0.0F, 0.0F, 0.0F), a.a.k().c(), 0.8F), ""); d.b(d.a, "", getX() + getW() - getH() + 6 + 16, getY() + getH() / 2.0F + true, "solid", 22.0F, this.hoverEdit.a(new Color(0.0F, 0.0F, 0.0F, 0.0F), a.a.k().c(), 0.8F), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 36 */     if (this.hoverEdit.c() && button == 0)
/* 37 */       d.a.a((d)new a(this.holder)); 
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\ElementMSColor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */