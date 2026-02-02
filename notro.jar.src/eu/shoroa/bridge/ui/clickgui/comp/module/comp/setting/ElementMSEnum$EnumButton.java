/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting;
/*    */ 
/*    */ import eu.shoroa.bridge.b.a.a;
/*    */ import eu.shoroa.bridge.b.a.b;
/*    */ import eu.shoroa.bridge.b.b.d;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.d.e.a;
/*    */ import eu.shoroa.bridge.ui.b.d;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmName;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020\020\n\002\b\006\b\004\030\0002\0020\001B\023\022\n\020\003\032\006\022\002\b\0030\022¢\006\004\b\027\020\030J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ'\020\n\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\n\020\tJ'\020\013\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\013\020\fR\036\020\016\032\006*\0020\r0\r8\007X\004¢\006\f\n\004\b\016\020\017\032\004\b\020\020\021R\036\020\023\032\006\022\002\b\0030\0228\007X\004¢\006\f\n\004\b\023\020\024\032\004\b\025\020\026"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum$EnumButton;", "Leu/shoroa/bridge/ui/b/d;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "release", "render", "(FFF)V", "Leu/shoroa/bridge/b/a/a;", "anim", "Leu/shoroa/bridge/b/a/a;", "getAnim", "()Leu/shoroa/bridge/b/a/a;", "", "enum", "Ljava/lang/Enum;", "getEnum", "()Ljava/lang/Enum;", "<init>", "(Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum;Ljava/lang/Enum;)V"})
/*    */ final class EnumButton
/*    */   extends d
/*    */ {
/*    */   @NotNull
/*    */   private final Enum<?> enum;
/*    */   private final a anim;
/*    */   
/*    */   @NotNull
/*    */   @JvmName(name = "getEnum")
/*    */   public final Enum<?> getEnum() {
/*    */     return this.enum;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Object clone() {
/*    */     return super.clone();
/*    */   }
/*    */   
/*    */   public EnumButton(Enum<?> enum) {
/* 54 */     super(0.0F, 0.0F, 0.0F, 0.0F); this.enum = enum;
/* 55 */     this.anim = a.a(EnumButton::anim$lambda$0, EnumButton::anim$lambda$1); } @JvmName(name = "getAnim") public final a getAnim() { return this.anim; } private static final Float anim$lambda$0() { return Float.valueOf(200.0F); } private static final b anim$lambda$1() { return b.LINEAR; }
/*    */    public void render(float mx, float my, float delta) {
/* 57 */     this.anim.a(this.enum.equals(ElementMSEnum.this.getSelected()));
/* 58 */     d.a(d.a, getX() - 2, getY() - 2, getW() + 4, getH() + 4, 10.0F, d.a.a(a.a.k().c()), 0.0F, 64, null);
/* 59 */     d.a(d.a, this, 8.0F, d.a.a(a.a.k().b()), 0.0F, 8, null);
/* 60 */     Intrinsics.checkNotNullExpressionValue(this.anim.a(a.a.k().e(), a.a.k().f()), ""); d.b(d.a, this.enum.name(), getX() + getW() / 2.0F, getY() + getH() / 2.0F + true, "semibold", 16.0F, this.anim.a(a.a.k().e(), a.a.k().f()), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 64 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 65 */       ElementMSEnum.this.setSelected(this.enum);
/* 66 */       ElementMSEnum.this.getSetting().a(ElementMSEnum.this.getSelected());
/* 67 */       ElementMSEnum.this.getSetting().g();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\ElementMSEnum$EnumButton.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */