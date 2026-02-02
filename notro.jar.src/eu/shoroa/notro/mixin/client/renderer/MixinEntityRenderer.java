/*    */ package eu.shoroa.notro.mixin.client.renderer;
/*    */ 
/*    */ import eu.shoroa.bridge.a.b;
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_524;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_524.class})
/*    */ public class MixinEntityRenderer
/*    */ {
/*    */   @Shadow
/*    */   private boolean field_1832;
/*    */   @Shadow
/*    */   private class_1600 field_1860;
/*    */   @Shadow
/*    */   private float field_1814;
/*    */   @Shadow
/*    */   private float field_1813;
/*    */   
/*    */   @Inject(method = {"renderWorldPass"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", ordinal = 18, shift = At.Shift.BEFORE)})
/*    */   public void notro$inject$renderWorldPass(CallbackInfo ci) {
/* 41 */     Client.a.b().getBus().publish(new b());
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\MixinEntityRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */