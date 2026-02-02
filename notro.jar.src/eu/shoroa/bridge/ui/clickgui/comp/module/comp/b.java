/*   */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\030\002\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\007\b&\030\000*\004\b\000\020\0012\0020\002B\025\022\f\020\013\032\b\022\004\022\0028\0000\006¢\006\004\b\f\020\rJ\017\020\004\032\0020\003H&¢\006\004\b\004\020\005R \020\007\032\b\022\004\022\0028\0000\0068\007X\004¢\006\f\n\004\b\007\020\b\032\004\b\t\020\n"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/b;", "T", "Leu/shoroa/bridge/ui/b/d;", "", "offset", "()F", "Leu/shoroa/bridge/feature/c/b;", "setting", "Leu/shoroa/bridge/feature/c/b;", "getSetting", "()Leu/shoroa/bridge/feature/c/b;", "p0", "<init>", "(Leu/shoroa/bridge/feature/c/b;)V"})
/*   */ public abstract class b<T> extends d {
/* 6 */   public b(eu.shoroa.bridge.feature.c.b<T> setting) { super(0.0F, 0.0F, 0.0F, 0.0F); this.setting = setting; } @NotNull private final eu.shoroa.bridge.feature.c.b<T> setting; @NotNull @JvmName(name = "getSetting") public final eu.shoroa.bridge.feature.c.b<T> getSetting() { return this.setting; } public abstract float offset(); @NotNull public Object clone() { return super.clone(); }
/*   */ 
/*   */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */