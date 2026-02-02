/*    */ package eu.shoroa.notro.mixin.client.gui;
/*    */ import eu.shoroa.bridge.ui.Screen;
/*    */ import eu.shoroa.bridge.ui.c.b;
/*    */ import eu.shoroa.notro.bridge.HolderScreen;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_388;
/*    */ import net.minecraft.class_624;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ 
/*    */ @Mixin({class_624.class})
/*    */ public class MixinGuiMainMenu {
/*    */   @Inject(method = {"initGui"}, at = {@At("RETURN")})
/*    */   public void initGui(CallbackInfo ci) {
/* 16 */     class_1600.method_2965().method_2928((class_388)new HolderScreen((Screen)new b()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\gui\MixinGuiMainMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */