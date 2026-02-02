/*    */ package eu.shoroa.notro.mixin.client.settings;
/*    */ 
/*    */ import eu.shoroa.notro.a.b;
/*    */ import net.minecraft.class_327;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ 
/*    */ @Mixin({class_327.class})
/*    */ public class MixinKeyBinding
/*    */   implements b {
/*    */   @Shadow
/*    */   private boolean field_908;
/*    */   
/*    */   public void notro$setPressed(boolean state) {
/* 15 */     this.field_908 = state;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\settings\MixinKeyBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */