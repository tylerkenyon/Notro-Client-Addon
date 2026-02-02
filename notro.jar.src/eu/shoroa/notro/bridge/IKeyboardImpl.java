/*   */ package eu.shoroa.notro.bridge;
/*   */ 
/*   */ import org.lwjgl.input.Keyboard;
/*   */ 
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\n\020\013J\027\020\005\032\0020\0042\006\020\003\032\0020\002H\026¢\006\004\b\005\020\006J\027\020\b\032\0020\0072\006\020\003\032\0020\002H\027¢\006\004\b\b\020\t"}, d2 = {"Leu/shoroa/notro/bridge/IKeyboardImpl;", "Leu/shoroa/bridge/feature/a/a/c;", "", "p0", "", "keyDown", "(I)Z", "", "keyName", "(I)Ljava/lang/String;", "<init>", "()V"})
/*   */ public final class IKeyboardImpl implements c {
/* 7 */   public boolean keyDown(int code) { return Keyboard.isKeyDown(code); } @NotNull
/* 8 */   public String keyName(int code) { Intrinsics.checkNotNullExpressionValue(Keyboard.getKeyName(code), ""); return Keyboard.getKeyName(code); }
/*   */ 
/*   */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\IKeyboardImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */