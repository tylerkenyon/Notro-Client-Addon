/*    */ package eu.shoroa.bridge.ui.a;
/*    */ import eu.shoroa.bridge.ui.a.a.b;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\005\n\002\020\f\n\002\b\005\n\002\030\002\n\002\b\005\030\0002\0020\001B\007¢\006\004\b\030\020\013J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\017\020\n\032\0020\007H\026¢\006\004\b\n\020\013J\017\020\f\032\0020\007H\026¢\006\004\b\f\020\013J\037\020\016\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\rH\026¢\006\004\b\016\020\017J'\020\020\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\020\020\tJ'\020\021\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\021\020\022R\"\020\024\032\0020\0238\007@\007X\016¢\006\022\n\004\b\024\020\025\032\004\b\024\020\026\"\004\b\024\020\027"}, d2 = {"Leu/shoroa/bridge/ui/a/b;", "Leu/shoroa/bridge/ui/Screen;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "exit", "()V", "init", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "Leu/shoroa/bridge/ui/a/a/b;", "a", "Leu/shoroa/bridge/ui/a/a/b;", "()Leu/shoroa/bridge/ui/a/a/b;", "(Leu/shoroa/bridge/ui/a/a/b;)V", "<init>"})
/*    */ public final class b extends Screen {
/*    */   @NotNull
/*  7 */   private b a = new b(40.0F, 40.0F, 500.0F, 400.0F); @NotNull @JvmName(name = "a") public final b a() { return this.a; } @JvmName(name = "a") public final void a(b <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.a = <set-?>; }
/*    */    public void init() {
/*  9 */     this.a = new b(40.0F, 40.0F, 500.0F, 400.0F);
/*    */   }
/*    */   
/*    */   public void render(float mx, float my, float delta) {
/* 13 */     this.a.render(mx, my, delta);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 17 */     this.a.click(mx, my, button);
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {
/* 21 */     this.a.release(mx, my, button);
/*    */   }
/*    */   
/*    */   public void onKey(int code, char char) {
/* 25 */     this.a.onKey(code, char);
/*    */   }
/*    */   
/*    */   public void exit() {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */