/*   */ package eu.shoroa.bridge.ui;
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\005\n\002\020\f\n\002\b\017\b&\030\0002\0020\001B\007¢\006\004\b\034\020\013J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H&¢\006\004\b\b\020\tJ\017\020\n\032\0020\007H&¢\006\004\b\n\020\013J\017\020\f\032\0020\007H&¢\006\004\b\f\020\013J\037\020\016\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\rH\026¢\006\004\b\016\020\017J'\020\020\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H&¢\006\004\b\020\020\tJ'\020\021\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H&¢\006\004\b\021\020\022R\"\020\023\032\0020\0058\007@\007X\016¢\006\022\n\004\b\023\020\024\032\004\b\025\020\026\"\004\b\027\020\030R\"\020\031\032\0020\0058\007@\007X\016¢\006\022\n\004\b\031\020\024\032\004\b\032\020\026\"\004\b\033\020\030"}, d2 = {"Leu/shoroa/bridge/ui/Screen;", "", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "exit", "()V", "init", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "height", "I", "getHeight", "()I", "setHeight", "(I)V", "width", "getWidth", "setWidth", "<init>"})
/*   */ public abstract class Screen { private int width; @JvmName(name = "getWidth")
/* 4 */   public final int getWidth() { return this.width; } private int height; @JvmName(name = "setWidth") public final void setWidth(int <set-?>) { this.width = <set-?>; } @JvmName(name = "getHeight")
/* 5 */   public final int getHeight() { return this.height; } @JvmName(name = "setHeight") public final void setHeight(int <set-?>) { this.height = <set-?>; }
/*   */ 
/*   */   
/*   */   public abstract void init();
/*   */   
/*   */   public abstract void render(float paramFloat1, float paramFloat2, float paramFloat3);
/*   */   
/*   */   public abstract void click(float paramFloat1, float paramFloat2, int paramInt);
/*   */   
/*   */   public abstract void release(float paramFloat1, float paramFloat2, int paramInt);
/*   */   
/*   */   public void onKey(int code, char char) {}
/*   */   
/*   */   public abstract void exit(); }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\Screen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */