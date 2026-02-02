/*    */ package eu.shoroa.notro.mixin.client.entiy;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.notro.client.feature.a.i;
/*    */ import net.minecraft.class_966;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ @Mixin({class_966.class})
/*    */ public class MixinEntityTNTPrimed
/*    */ {
/*    */   @Inject(method = {"onUpdate"}, at = {@At("HEAD")})
/*    */   public void inject$onUpdate(CallbackInfo ci) {
/* 18 */     class_966 e = (class_966)this;
/* 19 */     i mod = (i)BridgeClient.a.b().moduleManager().a(i.class);
/* 20 */     e.method_10962(mod.b());
/* 21 */     e.method_5411(mod.a(e));
/*    */   }
/*    */   
/*    */   @Shadow
/*    */   public int field_3913;
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\entiy\MixinEntityTNTPrimed.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */