/*    */ package eu.shoroa.notro.mixin.client.model;
/*    */ 
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import eu.shoroa.notro.client.feature.a.a;
/*    */ import net.minecraft.class_440;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.Constant;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyConstant;
/*    */ 
/*    */ @Mixin({class_440.class})
/*    */ public class MixinModelBiped {
/*    */   @ModifyConstant(method = {"setRotationAngles"}, constant = {@Constant(floatValue = -0.5235988F)})
/*    */   private float notro$Inject$cancelRotation(float original) {
/* 14 */     return ((Boolean)((a)Client.a.b().moduleManager().a(a.class)).c().b()).booleanValue() ? 0.0F : original;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\model\MixinModelBiped.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */