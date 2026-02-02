/*    */ package eu.shoroa.bridge.ui.clickgui.comp;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\f\n\002\b\005\n\002\020\016\n\002\b\004\030\0002\0020\001B7\022\006\020\003\032\0020\020\022\b\b\002\020\004\032\0020\002\022\b\b\002\020\006\032\0020\002\022\b\b\002\020\021\032\0020\002\022\b\b\002\020\022\032\0020\002¢\006\004\b\023\020\024J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\037\020\013\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\nH\026¢\006\004\b\013\020\fJ'\020\r\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\r\020\tJ'\020\016\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\016\020\017"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/c;", "Leu/shoroa/bridge/ui/clickgui/comp/b;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "", "p3", "p4", "<init>", "(Ljava/lang/String;FFFF)V"})
/*    */ public final class c extends b {
/*  6 */   public c(String text, float x, float y, float w, float h) { super("modules", text, text, x, y, w, h); } @NotNull public Object clone() { return super.clone(); }
/*    */   
/*    */   public void render(float mx, float my, float delta) {
/*  9 */     d.b(d.a, 
/* 10 */         b(), 
/* 11 */         getX() + getW() / 2.0F, 
/* 12 */         getY() + getH() / 2.0F, 
/* 13 */         "bold", 
/* 14 */         20.0F, 
/* 15 */         a.a.k().e(), 
/* 16 */         d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {}
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */   
/*    */   public void onKey(int code, char char) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */