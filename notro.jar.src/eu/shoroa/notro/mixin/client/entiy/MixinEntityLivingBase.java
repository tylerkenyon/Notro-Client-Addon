/*    */ package eu.shoroa.notro.mixin.client.entiy;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.notro.b.a;
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import eu.shoroa.notro.client.feature.a.h;
/*    */ import net.minecraft.class_1071;
/*    */ import net.minecraft.class_1127;
/*    */ import net.minecraft.class_1129;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_1699;
/*    */ import net.minecraft.class_2562;
/*    */ import net.minecraft.class_856;
/*    */ import net.minecraft.class_864;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ 
/*    */ @Mixin({class_1699.class})
/*    */ public abstract class MixinEntityLivingBase
/*    */ {
/*    */   @Inject(method = {"handleStatusUpdate"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;playSound(Ljava/lang/String;FF)V", ordinal = 0, shift = At.Shift.BEFORE)})
/*    */   public void notro$inject$injectHandleHealthUpdateB1(CallbackInfo ci) {
/* 27 */     Client.a.b().getBus().publish(new a((class_864)this));
/*    */   }
/*    */   @Inject(method = {"attackEntityFrom"}, at = {@At("RETURN")})
/*    */   private void onAttack(class_856 source, float amount, CallbackInfoReturnable cir) {
/* 31 */     class_1699 entity = (class_1699)this;
/* 32 */     class_1600 mc = class_1600.method_2965();
/*    */ 
/*    */     
/* 35 */     if (mc.field_10310 == null) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 41 */     h module = (h)BridgeClient.a.b().moduleManager().a().get(h.class);
/*    */ 
/*    */     
/* 44 */     if (module.b()) {
/*    */       
/* 46 */       boolean forceSharpness = ((Boolean)module.c().b()).booleanValue();
/* 47 */       float multiplyBy = ((Float)module.d().b()).floatValue();
/*    */ 
/*    */       
/* 50 */       if (forceSharpness) {
/* 51 */         spawnParticles(class_2562.field_11513, entity, multiplyBy);
/*    */         
/*    */         return;
/*    */       } 
/* 55 */       if (mc.field_10310.field_3197) {
/* 56 */         spawnParticles(class_2562.field_11512, entity, multiplyBy);
/*    */       }
/*    */       
/* 59 */       class_1071 heldItem = mc.field_10310.method_2640();
/* 60 */       if (heldItem != null && heldItem.method_3421() instanceof net.minecraft.class_1101) {
/* 61 */         int sharpnessLevel = class_1129.method_3519(class_1127.field_9173.field_4476, heldItem);
/* 62 */         if (sharpnessLevel >= 1) {
/* 63 */           spawnParticles(class_2562.field_11513, entity, multiplyBy);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void spawnParticles(class_2562 type, class_1699 entity, float multiplyBy) {
/* 70 */     class_1600 mc = class_1600.method_2965();
/* 71 */     int amount = (int)(5.0F * multiplyBy);
/* 72 */     for (int i = 0; i < amount; i++)
/* 73 */       mc.field_3807.method_9707((class_864)entity, type); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\entiy\MixinEntityLivingBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */