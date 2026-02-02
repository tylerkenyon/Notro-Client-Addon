/*    */ package eu.shoroa.notro.mixin.lwjgl;
/*    */ 
/*    */ import eu.shoroa.notro.c.a;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin(targets = {"org.lwjgl.nanovg.NanoVGGLConfig"})
/*    */ public abstract class MixinNanoVGGLConfig
/*    */ {
/*    */   @Inject(method = {"getFunctionProvider"}, at = {@At("HEAD")}, cancellable = true, remap = false)
/*    */   private static void getFunctionProvider(String className, CallbackInfoReturnable cir) {
/* 14 */     cir.setReturnValue(new a());
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\lwjgl\MixinNanoVGGLConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */