/*    */ package eu.shoroa.notro.mixin.client.renderer;
/*    */ 
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import eu.shoroa.notro.client.feature.a.a;
/*    */ import net.minecraft.class_1071;
/*    */ import net.minecraft.class_1099;
/*    */ import net.minecraft.class_1699;
/*    */ import net.minecraft.class_2403;
/*    */ import net.minecraft.class_2462;
/*    */ import net.minecraft.class_2528;
/*    */ import net.minecraft.class_560;
/*    */ import net.minecraft.class_988;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_560.class})
/*    */ public class MixinRenderItem {
/* 20 */   private class_1699 entity = null;
/*    */   @Inject(method = {"renderItemModelForEntity"}, at = {@At("HEAD")})
/*    */   public void notro$inject$renderItemModelForEntity(class_1071 stack, class_1699 entity, class_2462.class_2464 cameraTransformType, CallbackInfo ci) {
/* 23 */     this.entity = entity;
/*    */   }
/*    */   @Inject(method = {"renderItemModelTransform"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V")})
/*    */   public void notro$inject$thirdPersonBlockAnimation(class_1071 stack, class_2528 model, class_2462.class_2464 cameraTransformType, CallbackInfo ci) {
/* 27 */     a m = (a)Client.a.b().moduleManager().a(a.class);
/* 28 */     if (cameraTransformType == class_2462.class_2464.field_10993 && this.entity instanceof class_988) {
/* 29 */       class_988 p = (class_988)this.entity;
/* 30 */       class_1071 heldStack = p.method_2640();
/* 31 */       if (heldStack != null && p.method_3192() > 0 && heldStack.method_3444() == class_1099.field_9159 && 
/* 32 */         m.b() && ((Boolean)m.s().b()).booleanValue()) {
/* 33 */         class_2403.method_9816(-0.15F, -0.2F, 0.0F);
/* 34 */         class_2403.method_9817(70.0F, 1.0F, 0.0F, 0.0F);
/* 35 */         class_2403.method_9816(0.119F, 0.2F, -0.024F);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\MixinRenderItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */