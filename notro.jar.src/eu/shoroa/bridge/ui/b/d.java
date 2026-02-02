/*    */ package eu.shoroa.bridge.ui.b;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\032\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\f\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020!\n\002\b\032\b&\030\0002\0020\001B'\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\002\022\006\020\n\032\0020\002¢\006\004\b7\0208J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H&¢\006\004\b\b\020\tJ5\020\f\032\0020\0132\b\b\002\020\003\032\0020\0022\b\b\002\020\004\032\0020\0022\b\b\002\020\006\032\0020\0022\b\b\002\020\n\032\0020\002¢\006\004\b\f\020\rJ\030\020\016\032\0020\0002\006\020\003\032\0020\002H\002¢\006\004\b\016\020\017J\037\020\021\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\020H\026¢\006\004\b\021\020\022J'\020\023\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H&¢\006\004\b\023\020\tJ'\020\024\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H&¢\006\004\b\024\020\025J\027\020\027\032\0020\0002\006\020\003\032\0020\026H\007¢\006\004\b\027\020\030R\032\020\032\032\0020\0318\005X\004¢\006\f\n\004\b\032\020\033\032\004\b\034\020\035R \020\037\032\b\022\004\022\0020\0000\0368\007X\004¢\006\f\n\004\b\037\020 \032\004\b!\020\"R\"\020#\032\0020\0028\007@\007X\016¢\006\022\n\004\b#\020$\032\004\b%\020&\"\004\b'\020(R\"\020\027\032\0020\0268\005@\005X\016¢\006\022\n\004\b\027\020)\032\004\b*\020+\"\004\b,\020-R\"\020.\032\0020\0028\007@\007X\016¢\006\022\n\004\b.\020$\032\004\b/\020&\"\004\b0\020(R\"\0201\032\0020\0028\007@\007X\016¢\006\022\n\004\b1\020$\032\004\b2\020&\"\004\b3\020(R\"\0204\032\0020\0028\007@\007X\016¢\006\022\n\004\b4\020$\032\004\b5\020&\"\004\b6\020("}, d2 = {"Leu/shoroa/bridge/ui/b/d;", "", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "p3", "", "hovered", "(FFFF)Z", "minus", "(F)Leu/shoroa/bridge/ui/b/d;", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "Leu/shoroa/bridge/ui/b/g;", "style", "(Leu/shoroa/bridge/ui/b/g;)Leu/shoroa/bridge/ui/b/d;", "Leu/shoroa/bridge/feature/a/b$a;", "bridge", "Leu/shoroa/bridge/feature/a/b$a;", "getBridge", "()Leu/shoroa/bridge/feature/a/b$a;", "", "elements", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "h", "F", "getH", "()F", "setH", "(F)V", "Leu/shoroa/bridge/ui/b/g;", "getStyle", "()Leu/shoroa/bridge/ui/b/g;", "setStyle", "(Leu/shoroa/bridge/ui/b/g;)V", "w", "getW", "setW", "x", "getX", "setX", "y", "getY", "setY", "<init>", "(FFFF)V"})
/*    */ public abstract class d implements Cloneable { private float x; private float y; private float w; private float h; @NotNull
/*    */   private final b.a bridge; @NotNull
/*    */   private g style; @NotNull
/*    */   private final List<d> elements;
/*    */   
/*  7 */   public d(float x, float y, float w, float h) { this.x = x; this.y = y; this.w = w; this.h = h;
/*  8 */     this.bridge = b.a;
/*  9 */     this.style = new g();
/* 10 */     this.elements = new ArrayList<>(); } @JvmName(name = "getX") public final float getX() { return this.x; } @JvmName(name = "setX") public final void setX(float <set-?>) { this.x = <set-?>; } @JvmName(name = "getY") public final float getY() { return this.y; } @JvmName(name = "setY") public final void setY(float <set-?>) { this.y = <set-?>; } @JvmName(name = "getW") public final float getW() { return this.w; } @JvmName(name = "setW") public final void setW(float <set-?>) { this.w = <set-?>; } @NotNull @JvmName(name = "getElements") public final List<d> getElements() { return this.elements; }
/*    */   @JvmName(name = "getH") public final float getH() { return this.h; }
/*    */   @JvmName(name = "setH") public final void setH(float <set-?>) { this.h = <set-?>; }
/*    */   @NotNull public Object clone() { return super.clone(); }
/*    */   @NotNull @JvmName(name = "getBridge") protected final b.a getBridge() { return this.bridge; }
/*    */   @NotNull @JvmName(name = "getStyle") protected final g getStyle() { return this.style; }
/* 16 */   @JvmName(name = "setStyle") protected final void setStyle(g <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.style = <set-?>; } public void onKey(int code, char char) {} public final boolean hovered(float x, float y, float w, float h) { Intrinsics.checkNotNull(b.a.c()); float mx = b.a.c().mouseX();
/* 17 */     Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); float my = b.a.e().height() - b.a.c().mouseY();
/* 18 */     return (mx >= x && mx <= x + w && my >= y && my <= y + h); }
/*    */   
/*    */   @NotNull
/*    */   public final d minus(float fl) {
/* 22 */     Intrinsics.checkNotNull(clone()); d ele = (d)clone();
/* 23 */     ele.x -= fl;
/* 24 */     ele.y -= fl;
/* 25 */     ele.w += fl * 2;
/* 26 */     ele.h += fl * 2;
/* 27 */     return ele;
/*    */   }
/*    */   @NotNull
/*    */   public final d style(g style) {
/* 31 */     Intrinsics.checkNotNullParameter(style, ""); this.style = style;
/* 32 */     return this;
/*    */   }
/*    */   
/*    */   public abstract void render(float paramFloat1, float paramFloat2, float paramFloat3);
/*    */   
/*    */   public abstract void click(float paramFloat1, float paramFloat2, int paramInt);
/*    */   
/*    */   public abstract void release(float paramFloat1, float paramFloat2, int paramInt); }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */