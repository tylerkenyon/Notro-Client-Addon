/*    */ package eu.shoroa.notro.mixin.client.entiy;
/*    */ 
/*    */ import eu.shoroa.bridge.a.g;
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import net.minecraft.class_518;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_518.class})
/*    */ public class MixinEntityPlayerSP {
/*    */   @Inject(method = {"onUpdate"}, at = {@At("HEAD")})
/*    */   public void notro$inject$onUpdate(CallbackInfo ci) {
/* 15 */     Client.a.b().getBus().publish(new g());
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\entiy\MixinEntityPlayerSP.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */