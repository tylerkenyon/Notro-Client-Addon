/*    */ package eu.shoroa.notro.mixin.client.renderer;
/*    */ 
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import eu.shoroa.notro.client.feature.a.a;
/*    */ import net.minecraft.class_1069;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_1631;
/*    */ import net.minecraft.class_2403;
/*    */ import net.minecraft.class_529;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyArg;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_529.class})
/*    */ public class MixinItemRenderer
/*    */ {
/*    */   private float swingProgress;
/* 23 */   private class_1600 mc = class_1600.method_2965();
/*    */   
/*    */   @ModifyArg(method = {"renderItemInFirstPerson"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;doItemUsedTransformations(F)V"))
/*    */   public float modifyItemUsedTransformations(float prog) {
/* 27 */     a m = (a)Client.a.b().moduleManager().a(a.class);
/* 28 */     return (m.b() && ((Boolean)m.t().b()).booleanValue()) ? 0.0F : prog;
/*    */   }
/*    */   @Inject(method = {"renderItemInFirstPerson"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getItemUseAction()Lnet/minecraft/item/EnumAction;", shift = At.Shift.AFTER)}, locals = LocalCapture.CAPTURE_FAILEXCEPTION)
/*    */   private void modifySwingProgress(float partialTicks, CallbackInfo ci, float f, class_1631 player, float f1, float f2, float f3) {
/* 32 */     this.swingProgress = f1;
/*    */   }
/*    */   @ModifyArg(method = {"renderItemInFirstPerson"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V", ordinal = 1), index = 1)
/*    */   public float modifyTransformDrink(float prog) {
/* 36 */     return ((a)Client.a.b().moduleManager().a(a.class)).b() ? this.swingProgress : 0.0F;
/*    */   }
/*    */   @ModifyArg(method = {"renderItemInFirstPerson"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V", ordinal = 2), index = 1)
/*    */   public float modifyTransformBlock(float prog) {
/* 40 */     return ((a)Client.a.b().moduleManager().a(a.class)).b() ? this.swingProgress : 0.0F;
/*    */   }
/*    */   @ModifyArg(method = {"renderItemInFirstPerson"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V", ordinal = 3), index = 1)
/*    */   public float modifyTransformBow(float prog) {
/* 44 */     return ((a)Client.a.b().moduleManager().a(a.class)).b() ? this.swingProgress : 0.0F;
/*    */   }
/*    */   
/*    */   @Inject(method = {"renderItemInFirstPerson"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;doBlockTransformations()V", shift = At.Shift.AFTER)})
/*    */   private void injectSwingAnimation(float ticks, CallbackInfo ci) {
/* 49 */     if (((a)Client.a.b().moduleManager().a(a.class)).b()) {
/* 50 */       class_2403.method_9800(0.83F, 0.88F, 0.85F);
/* 51 */       class_2403.method_9816(-0.3F, 0.1F, 0.0F);
/*    */     } 
/*    */   }
/*    */   @Inject(method = {"renderItemInFirstPerson"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V", ordinal = 1, shift = At.Shift.AFTER)})
/*    */   private void injectEatingAnimation(float ticks, CallbackInfo ci) {
/* 56 */     if (((a)Client.a.b().moduleManager().a(a.class)).b()) {
/* 57 */       class_2403.method_9800(0.8F, 1.0F, 1.0F);
/* 58 */       class_2403.method_9816(-0.2F, -0.1F, 0.0F);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Inject(method = {"transformFirstPersonItem"}, at = {@At("HEAD")})
/*    */   private void transformFirstPersonItem(float equipProgress, float swingProgress, CallbackInfo ci) {
/* 64 */     if (((a)Client.a.b().moduleManager().a(a.class)).b()) {
/* 65 */       if (this.mc != null && this.mc.field_10310 != null && this.mc.field_10310.method_3191() != null && this.mc.field_10310.method_3191().method_3421() != null && class_1069.method_6364(this.mc.field_10310.method_3191().method_3421()) == 261) {
/* 66 */         class_2403.method_9816(-0.01F, 0.05F, -0.06F);
/*    */       }
/* 68 */       if (this.mc != null && this.mc.field_10310 != null && this.mc.field_10310.method_3179() != null && this.mc.field_10310.method_3179().method_3421() != null && (class_1069.method_6364(this.mc.field_10310.method_3179().method_3421()) == 346 || class_1069.method_6364(this.mc.field_10310.method_3179().method_3421()) == 398)) {
/* 69 */         class_2403.method_9816(0.08F, -0.027F, -0.33F);
/* 70 */         class_2403.method_9800(0.93F, 1.0F, 1.0F);
/*    */       } 
/* 72 */       if (this.mc != null && this.mc.field_10310 != null && this.mc.field_10310.field_6769 && this.mc.field_10310.method_3179() != null && !this.mc.field_10310.method_2515() && !this.mc.field_10310.method_2611()) {
/* 73 */         class_2403.method_9800(0.85F, 0.85F, 0.85F);
/* 74 */         class_2403.method_9816(-0.078F, 0.003F, 0.05F);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\MixinItemRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */