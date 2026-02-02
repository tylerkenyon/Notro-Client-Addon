/*    */ package eu.shoroa.notro.mixin.client.renderer;
/*    */ 
/*    */ import eu.shoroa.notro.a.g;
/*    */ import java.util.Map;
/*    */ import net.minecraft.class_1532;
/*    */ import net.minecraft.class_1653;
/*    */ import net.minecraft.class_319;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ 
/*    */ @Mixin({class_1532.class})
/*    */ public class MixinTextureManager implements g {
/*    */   @Final
/*    */   @Shadow
/*    */   private Map<class_1653, class_319> field_6575;
/*    */   
/*    */   public int getTextureObject(class_1653 rl) {
/* 19 */     return ((class_319)this.field_6575.get(rl)).method_5855();
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<class_1653, class_319> getTextureMap() {
/* 24 */     return this.field_6575;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\MixinTextureManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */