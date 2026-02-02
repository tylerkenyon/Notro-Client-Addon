/*    */ package eu.shoroa.notro.mixin.client.renderer.entity;
/*    */ 
/*    */ import eu.shoroa.notro.client.feature.cosmetic.CosmeticLayer;
/*    */ import eu.shoroa.notro.cosmetics.LayerWings;
/*    */ import net.minecraft.class_550;
/*    */ import net.minecraft.class_570;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_570.class})
/*    */ public abstract class MixinRenderPlayer
/*    */   extends MixinRendererLivingEntity {
/*    */   @Inject(method = {"<init>(Lnet/minecraft/client/renderer/entity/RenderManager;Z)V"}, at = {@At("RETURN")})
/*    */   public void notro$inject$init(class_550 renderManager, boolean useSmallArms, CallbackInfo ci) {
/* 17 */     method_10250(new CosmeticLayer((class_570)this));
/* 18 */     method_10250(new LayerWings((class_570)this));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\entity\MixinRenderPlayer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */