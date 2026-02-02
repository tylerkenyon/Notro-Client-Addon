/*    */ package eu.shoroa.notro.bridge;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_518;
/*    */ import org.joml.Vector3d;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\017\020\005\032\0020\004H\026¢\006\004\b\005\020\006R\034\020\t\032\n \b*\004\030\0010\0070\0078\002X\004¢\006\006\n\004\b\t\020\n¨\006\013"}, d2 = {"Leu/shoroa/notro/bridge/IPlayerImpl;", "Leu/shoroa/bridge/feature/bridges/impl/IPlayer;", "<init>", "()V", "Lorg/joml/Vector3d;", "position", "()Lorg/joml/Vector3d;", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "NotroClient"})
/*    */ public final class IPlayerImpl implements f {
/*  8 */   private final class_1600 mc = class_1600.method_2965(); @NotNull
/*    */   public Vector3d position() {
/* 10 */     class_518 it = this.mc.field_10310; int $i$a$-let-IPlayerImpl$position$1 = 0; return (this.mc.field_10310 != null) ? 
/* 11 */       new Vector3d(it.field_3252, it.field_3253, it.field_3254) : 
/* 12 */       new Vector3d();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\IPlayerImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */