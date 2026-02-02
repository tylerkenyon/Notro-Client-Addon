/*    */ package eu.shoroa.notro.bridge;
/*    */ 
/*    */ import org.lwjgl.input.Mouse;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\020\007\n\002\b\006\030\0002\0020\001B\007¢\006\004\b\f\020\rJ\027\020\005\032\0020\0042\006\020\003\032\0020\002H\026¢\006\004\b\005\020\006J\017\020\b\032\0020\007H\026¢\006\004\b\b\020\tJ\017\020\n\032\0020\007H\026¢\006\004\b\n\020\tJ\017\020\013\032\0020\007H\026¢\006\004\b\013\020\t"}, d2 = {"Leu/shoroa/notro/bridge/IMouseImpl;", "Leu/shoroa/bridge/feature/a/a/e;", "", "p0", "", "buttonDown", "(I)Z", "", "mouseX", "()F", "mouseY", "scrollY", "<init>", "()V"})
/*    */ public final class IMouseImpl implements e {
/*  7 */   public float scrollY() { return Mouse.getDWheel(); }
/*  8 */   public float mouseX() { return Mouse.getX(); }
/*  9 */   public float mouseY() { return Mouse.getY(); } public boolean buttonDown(int btn) {
/* 10 */     return Mouse.isButtonDown(btn);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\IMouseImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */