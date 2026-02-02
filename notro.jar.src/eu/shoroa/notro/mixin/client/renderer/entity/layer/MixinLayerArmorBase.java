/*    */ package eu.shoroa.notro.mixin.client.renderer.entity.layer;
/*    */ 
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import eu.shoroa.notro.client.feature.a.a;
/*    */ import net.minecraft.class_2494;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({class_2494.class})
/*    */ public class MixinLayerArmorBase {
/*    */   @Inject(method = {"shouldCombineTextures"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void notro$inject$shouldCombineTextures(CallbackInfoReturnable cir) {
/* 15 */     cir.setReturnValue(((a)Client.a.b().moduleManager().a(a.class)).d().b());
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\entity\layer\MixinLayerArmorBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */