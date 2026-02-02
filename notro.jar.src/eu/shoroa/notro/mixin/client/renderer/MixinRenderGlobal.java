/*    */ package eu.shoroa.notro.mixin.client.renderer;
/*    */ 
/*    */ import eu.shoroa.notro.client.Client;
/*    */ import eu.shoroa.notro.client.feature.a.c;
/*    */ import java.awt.Color;
/*    */ import net.minecraft.class_1150;
/*    */ import net.minecraft.class_1158;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_197;
/*    */ import net.minecraft.class_234;
/*    */ import net.minecraft.class_2403;
/*    */ import net.minecraft.class_2552;
/*    */ import net.minecraft.class_478;
/*    */ import net.minecraft.class_530;
/*    */ import net.minecraft.class_63;
/*    */ import net.minecraft.class_988;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyArg;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyArgs;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
/*    */ import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
/*    */ 
/*    */ @Mixin({class_530.class})
/*    */ public abstract class MixinRenderGlobal {
/*    */   @Shadow
/*    */   private class_478 field_1909;
/*    */   
/*    */   @ModifyArg(method = {"drawSelectionBox"}, at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glLineWidth(F)V"))
/*    */   public float notro$inject$drawSelectionBox$outlineWidth(float width) {
/* 35 */     c m = (c)Client.a.b().moduleManager().a(c.class);
/* 36 */     return (m.b() && ((Boolean)m.d().b()).booleanValue()) ? ((Float)m.s().b()).floatValue() : width; } @Shadow
/*    */   @Final
/*    */   private class_1600 field_1918; @ModifyArgs(method = {"drawSelectionBox"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V"))
/*    */   public void notro$inject$drawSelectionBox$outlineColor(Args args) {
/* 40 */     c m = (c)Client.a.b().moduleManager().a(c.class);
/* 41 */     if (m.b()) {
/* 42 */       args.set(0, Float.valueOf(0.0F));
/* 43 */       args.set(1, Float.valueOf(0.0F));
/* 44 */       args.set(2, Float.valueOf(0.0F));
/* 45 */       args.set(3, Float.valueOf(0.0F));
/*    */     } 
/*    */   }
/*    */   
/*    */   @Inject(method = {"drawSelectionBox"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;depthMask(Z)V", ordinal = 0, shift = At.Shift.AFTER)})
/*    */   private void notro$inject$drawSelectionBox$disableDepth(class_988 player, class_234 movingObjectPositionIn, int execute, float partialTicks, CallbackInfo ci) {
/* 51 */     c m = (c)Client.a.b().moduleManager().a(c.class);
/* 52 */     if (m.b() && !((Boolean)m.v().b()).booleanValue()) class_2403.method_9838(); 
/*    */   }
/*    */   
/*    */   @Inject(method = {"drawSelectionBox"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;depthMask(Z)V", ordinal = 1)})
/*    */   private void notro$inject$drawSelectionBox$enableDepth(class_988 player, class_234 movingObjectPositionIn, int execute, float partialTicks, CallbackInfo ci) {
/* 57 */     c m = (c)Client.a.b().moduleManager().a(c.class);
/* 58 */     if (m.b() && !((Boolean)m.v().b()).booleanValue()) class_2403.method_9840(); 
/*    */   }
/*    */   
/*    */   @Inject(method = {"drawSelectionBox"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;drawSelectionBoundingBox(Lnet/minecraft/util/AxisAlignedBB;)V", shift = At.Shift.BEFORE)}, locals = LocalCapture.CAPTURE_FAILEXCEPTION)
/*    */   private void notro$inject$drawSelectionBoxFill$fill(class_988 p_72731_0_, class_234 player, int movingObjectPositionIn, float execute, CallbackInfo ci) {
/* 63 */     c m = (c)Client.a.b().moduleManager().a(c.class);
/* 64 */     if (m.b()) {
/*    */       
/* 66 */       if (((Boolean)m.c().b()).booleanValue()) {
/* 67 */         class_2552 blockPos = player.method_9344();
/* 68 */         class_197 block = this.field_1909.method_8580(blockPos).method_9028();
/* 69 */         if (block.method_6456() != class_63.field_123 && this.field_1909.method_8524().method_9098(blockPos)) {
/* 70 */           block.method_8652((class_1158)this.field_1909, blockPos);
/* 71 */           double d = p_72731_0_.field_3211 + (p_72731_0_.field_3252 - p_72731_0_.field_3211) * execute;
/* 72 */           double e = p_72731_0_.field_3212 + (p_72731_0_.field_3253 - p_72731_0_.field_3212) * execute;
/* 73 */           double g = p_72731_0_.field_3213 + (p_72731_0_.field_3254 - p_72731_0_.field_3213) * execute;
/* 74 */           m.a((Color)m.t().b());
/* 75 */           m.a(block.method_8657((class_1150)this.field_1909, blockPos).method_587(0.0020000000949949026D, 0.0020000000949949026D, 0.0020000000949949026D).method_596(-d, -e, -g));
/*    */         } 
/*    */       } 
/* 78 */       m.a((Color)m.u().b());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\MixinRenderGlobal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */