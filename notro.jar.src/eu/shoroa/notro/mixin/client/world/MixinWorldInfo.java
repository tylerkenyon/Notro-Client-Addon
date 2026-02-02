/*    */ package eu.shoroa.notro.mixin.client.world;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.bridge.feature.b.a.f;
/*    */ import java.util.Objects;
/*    */ import net.minecraft.class_100;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_100.class})
/*    */ public class MixinWorldInfo
/*    */ {
/*    */   @Shadow
/*    */   private long field_238;
/*    */   
/*    */   @Overwrite
/*    */   public long method_220() {
/* 24 */     f tchm = (f)((BridgeClient)Objects.<BridgeClient>requireNonNull(BridgeClient.a.b())).moduleManager().a(f.class);
/* 25 */     return tchm.b() ? tchm.v() : this.field_238;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\world\MixinWorldInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */