/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting;
/*    */ 
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.feature.c.a.i;
/*    */ import eu.shoroa.bridge.ui.b.d;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\025\022\f\020\004\032\b\022\004\022\0020\0020\032¢\006\004\b\033\020\034J'\020\t\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\t\020\nJ\017\020\013\032\0020\003H\026¢\006\004\b\013\020\fJ'\020\r\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\r\020\nJ'\020\016\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\003H\026¢\006\004\b\016\020\017R\032\020\021\032\0020\0208\007X\004¢\006\f\n\004\b\021\020\022\032\004\b\023\020\024R \020\026\032\b\022\004\022\0020\0020\0258\007X\004¢\006\f\n\004\b\026\020\027\032\004\b\030\020\031"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElemetMSShape;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/b;", "Leu/shoroa/bridge/feature/c/a/i;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "offset", "()F", "release", "render", "(FFF)V", "Leu/shoroa/bridge/ui/b/d;", "btn", "Leu/shoroa/bridge/ui/b/d;", "getBtn", "()Leu/shoroa/bridge/ui/b/d;", "Leu/shoroa/bridge/ui/b/a/a/a;", "holder", "Leu/shoroa/bridge/ui/b/a/a/a;", "getHolder", "()Leu/shoroa/bridge/ui/b/a/a/a;", "Leu/shoroa/bridge/feature/c/b;", "<init>", "(Leu/shoroa/bridge/feature/c/b;)V"})
/*    */ public final class ElemetMSShape extends b<i> {
/*    */   @NotNull
/*    */   private final a<i> holder;
/*    */   @NotNull
/*    */   private final d btn;
/*    */   
/* 16 */   public ElemetMSShape(b setting) { super(setting);
/* 17 */     this.holder = new a(setting.b());
/*    */ 
/*    */     
/* 20 */     this.btn = a.a.a("Edit Shape", getX(), getY(), 140.0F, 30.0F).c("").b(new ElemetMSShape$btn$1()).style((new g()).a(ElemetMSShape$btn$2.INSTANCE)); } @NotNull public Object clone() { return super.clone(); } @NotNull @JvmName(name = "getHolder") public final a<i> getHolder() { return this.holder; } @NotNull @JvmName(name = "getBtn") public final d getBtn() { return this.btn; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "invoke", "()V"}) static final class ElemetMSShape$btn$1 extends Lambda implements Function0<Unit> { public final void invoke() { d.a.a((d)new c(ElemetMSShape.this.getHolder())); } ElemetMSShape$btn$1() { super(0); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/ui/b/d;", "p0", "", "invoke", "(Leu/shoroa/bridge/ui/b/d;)V"}) static final class ElemetMSShape$btn$2 extends Lambda implements Function1<d, Unit> { public static final ElemetMSShape$btn$2 INSTANCE = new ElemetMSShape$btn$2(); public final void invoke(d it) { Intrinsics.checkNotNullParameter(it, ""); d.a(d.a, it, 8.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 8, null); } ElemetMSShape$btn$2() { super(1); } }
/* 21 */    public float offset() { return 40.0F; }
/*    */   
/*    */   public void render(float mx, float my, float delta) {
/* 24 */     this.btn.setX(getX() + getW() - 145.0F);
/* 25 */     this.btn.setY(getY() + getH() / 2.0F - 15.0F);
/*    */     
/* 27 */     d.a(d.a, (d)this, 8.0F, d.a.a(a.a.k().c()), 0.0F, 8, null);
/* 28 */     d.b(d.a, getSetting().a(), getX() + 10, getY() + getH() / 2.0F, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/* 29 */     d.b(d.a, "" + ((i)getSetting().b()).a() + "x" + ((i)getSetting().b()).a(), getX() + getW() - 'ª', getY() + getH() / 2.0F + true, "semibold", 18.0F, a.a.k().e(), d.a.RIGHT_MIDDLE, 0.0F, 0.0F, 384, null);
/* 30 */     this.btn.render(mx, my, delta);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 34 */     this.btn.click(mx, my, button);
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\ElemetMSShape.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */