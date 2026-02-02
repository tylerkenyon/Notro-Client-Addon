/*    */ package eu.shoroa.notro.bridge;
/*    */ import kotlin.Metadata;
/*    */ import net.minecraft.class_1600;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\002\n\002\020\013\n\002\b\t\n\002\030\002\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\017\020\005\032\0020\004H\026¢\006\004\b\005\020\006J\017\020\b\032\0020\007H\026¢\006\004\b\b\020\tJ\017\020\n\032\0020\007H\026¢\006\004\b\n\020\tJ\017\020\013\032\0020\007H\026¢\006\004\b\013\020\tJ\017\020\f\032\0020\007H\026¢\006\004\b\f\020\tJ\017\020\r\032\0020\007H\026¢\006\004\b\r\020\tJ\017\020\016\032\0020\007H\026¢\006\004\b\016\020\tJ\017\020\017\032\0020\007H\026¢\006\004\b\017\020\tJ\017\020\020\032\0020\004H\026¢\006\004\b\020\020\006R\034\020\023\032\n \022*\004\030\0010\0210\0218\002X\004¢\006\006\n\004\b\023\020\024¨\006\025"}, d2 = {"Leu/shoroa/notro/bridge/IInputImpl;", "Leu/shoroa/bridge/feature/bridges/impl/IInput;", "<init>", "()V", "", "forward", "()F", "", "leftClick", "()Z", "moveBackwards", "moveForward", "moveJump", "moveLeft", "moveRight", "rightClick", "strafe", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "NotroClient"})
/*    */ public final class IInputImpl implements b {
/*  7 */   private final class_1600 mc = class_1600.method_2965();
/*  8 */   public boolean moveForward() { return this.mc.field_3823.field_993.method_6619(); }
/*  9 */   public boolean moveBackwards() { return this.mc.field_3823.field_995.method_6619(); }
/* 10 */   public boolean moveLeft() { return this.mc.field_3823.field_994.method_6619(); }
/* 11 */   public boolean moveRight() { return this.mc.field_3823.field_934.method_6619(); }
/* 12 */   public boolean moveJump() { return this.mc.field_3823.field_935.method_6619(); }
/* 13 */   public boolean leftClick() { return this.mc.field_3823.field_940.method_6619(); } public boolean rightClick() {
/* 14 */     return this.mc.field_3823.field_941.method_6619();
/*    */   }
/* 16 */   public float forward() { return (this.mc.field_10310 == null) ? 0.0F : this.mc.field_10310.field_6781; } public float strafe() {
/* 17 */     return (this.mc.field_10310 == null) ? 0.0F : this.mc.field_10310.field_6780;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\IInputImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */