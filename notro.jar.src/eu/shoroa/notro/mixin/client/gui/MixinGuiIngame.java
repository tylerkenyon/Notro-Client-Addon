/*    */ package eu.shoroa.notro.mixin.client.gui;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.bridge.a.c;
/*    */ import eu.shoroa.bridge.b.c.a;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.notro.bridge.HolderScreen;
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import eu.shoroa.notro.client.feature.a.a.c;
/*    */ import eu.shoroa.notro.client.feature.a.a.g;
/*    */ import java.util.Objects;
/*    */ import kotlin.Unit;
/*    */ import net.minecraft.class_1467;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_2403;
/*    */ import net.minecraft.class_371;
/*    */ import net.minecraft.class_389;
/*    */ import org.lwjgl.opengl.Display;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.Unique;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.Redirect;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ @Mixin({class_371.class})
/*    */ public abstract class MixinGuiIngame
/*    */ {
/*    */   @Shadow
/*    */   @Final
/*    */   private class_1600 field_1166;
/*    */   
/*    */   @Inject(method = {"renderGameOverlay"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V", shift = At.Shift.BEFORE, ordinal = 2)})
/*    */   public void notro$inject$renderGameOverlay(CallbackInfo ci) {
/* 40 */     ((a)Objects.<a>requireNonNull(d.a.a())).c();
/*    */ 
/*    */     
/* 43 */     Client.a.b().moduleManager().a((
/* 44 */         !((class_1600.method_2965()).field_3816 instanceof HolderScreen) || 
/*    */         
/* 46 */         !(((HolderScreen)(class_1600.method_2965()).field_3816).getScreen() instanceof eu.shoroa.bridge.ui.a)));
/*    */     
/* 48 */     d.a.a(() -> {
/*    */           Client.a.b().getBus().publish(new c(Display.getWidth(), Display.getHeight(), true));
/*    */           return Unit.INSTANCE;
/*    */         });
/* 52 */     float scaleFactor = getScale();
/*    */     
/* 54 */     GL11.glPushAttrib(1048575);
/* 55 */     GL11.glPushMatrix();
/* 56 */     GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/* 57 */     Client.a.b().getBus().publish(new c(Display.getWidth(), Display.getHeight(), false));
/* 58 */     GL11.glScalef(1.0F / scaleFactor, 1.0F / scaleFactor, 1.0F / scaleFactor);
/* 59 */     GL11.glPopMatrix();
/* 60 */     GL11.glPopAttrib();
/*    */   }
/*    */   
/*    */   @Redirect(method = {"renderGameOverlay"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiIngame;showCrosshair()Z"))
/*    */   public boolean redirectRenderCrosshair(class_371 instance) {
/* 65 */     c crs = (c)((BridgeClient)Objects.<BridgeClient>requireNonNull(Client.a.b())).moduleManager().a(c.class);
/* 66 */     if (crs.b()) {
/* 67 */       class_2403.method_9805(775, 769, 1, 0);
/* 68 */       class_2403.method_9828();
/* 69 */       return false;
/* 70 */     }  return method_9429();
/*    */   }
/*    */   
/*    */   @Unique
/*    */   float getScale() {
/* 75 */     class_389 sr = new class_389(class_1600.method_2965());
/* 76 */     return 1.0F / sr.method_1049() / 2.0F;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Overwrite
/*    */   public void method_9423(class_1467 p_180475_0_, class_389 objective) {
/* 85 */     g m = (g)((BridgeClient)Objects.<BridgeClient>requireNonNull(BridgeClient.a.b())).moduleManager().a(g.class);
/* 86 */     if (m.b()) {
/* 87 */       m.a(p_180475_0_);
/* 88 */       m.a(objective);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Shadow
/*    */   protected abstract boolean method_9429();
/*    */   
/*    */   @Shadow
/*    */   public abstract void method_9431(class_389 paramclass_389);
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\gui\MixinGuiIngame.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */