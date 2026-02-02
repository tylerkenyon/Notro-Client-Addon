/*     */ package eu.shoroa.notro.mixin.client;
/*     */ 
/*     */ import eu.shoroa.bridge.a.d;
/*     */ import eu.shoroa.bridge.a.e;
/*     */ import eu.shoroa.bridge.a.f;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.feature.c.a.j;
/*     */ import eu.shoroa.notro.a.c;
/*     */ import eu.shoroa.notro.client.Client;
/*     */ import eu.shoroa.notro.client.feature.a.f;
/*     */ import net.minecraft.class_1600;
/*     */ import net.minecraft.class_234;
/*     */ import net.minecraft.class_2532;
/*     */ import net.minecraft.class_347;
/*     */ import net.minecraft.class_354;
/*     */ import net.minecraft.class_355;
/*     */ import net.minecraft.class_388;
/*     */ import net.minecraft.class_478;
/*     */ import net.minecraft.class_518;
/*     */ import net.minecraft.class_63;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.spongepowered.asm.mixin.Final;
/*     */ import org.spongepowered.asm.mixin.Mixin;
/*     */ import org.spongepowered.asm.mixin.Mutable;
/*     */ import org.spongepowered.asm.mixin.Shadow;
/*     */ import org.spongepowered.asm.mixin.injection.At;
/*     */ import org.spongepowered.asm.mixin.injection.Inject;
/*     */ import org.spongepowered.asm.mixin.injection.ModifyArg;
/*     */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Mixin({class_1600.class})
/*     */ public abstract class MixinMinecraft
/*     */   implements c
/*     */ {
/*     */   @Shadow
/*     */   private int field_3781;
/*     */   @Shadow
/*     */   public class_234 field_3822;
/*     */   @Shadow
/*     */   public class_478 field_3803;
/*     */   @Shadow
/*     */   public class_518 field_10310;
/*     */   @Shadow
/*     */   public class_388 field_3816;
/*     */   
/*     */   @Inject(method = {"startGame"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiIngame;<init>(Lnet/minecraft/client/Minecraft;)V", shift = At.Shift.AFTER)})
/*     */   public void notro$inject$init_IngameGui(CallbackInfo ci) {
/*  59 */     Client.a.b().start(); } @Shadow private class_354 field_3778; @Mutable @Shadow
/*     */   @Final
/*     */   private class_355 field_3808; @Shadow
/*     */   private class_2532 field_10304; @Shadow
/*     */   public class_347 field_3823; @Shadow
/*     */   public abstract int method_4498(); @Inject(method = {"shutdown"}, at = {@At("HEAD")})
/*  65 */   public void notro$inject$shutdown(CallbackInfo ci) { Client.a.b().stop(); }
/*     */   
/*     */   @Inject(method = {"runTick"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/settings/KeyBinding;onTick(I)V", ordinal = 0)})
/*     */   public void notro$inject$runTickMouseInput(CallbackInfo ci) {
/*  69 */     Client.a.b().getBus().publish(new e(Mouse.getEventButton()));
/*     */   }
/*     */   @Inject(method = {"runTick"}, at = {@At("HEAD")})
/*     */   public void notro$inject$runTick$head(CallbackInfo ci) {
/*  73 */     Client.a.b().getBus().publish(new f());
/*     */   }
/*     */   
/*     */   @Inject(method = {"runTick"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/settings/KeyBinding;onTick(I)V", ordinal = 1)})
/*     */   public void notro$inject$runTickKeyInput(CallbackInfo ci) {
/*  78 */     Client.a.b().getBus().publish(new d(Keyboard.getEventKey()));
/*     */   }
/*     */   @Inject(method = {"sendClickBlockToController"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;isUsingItem()Z", shift = At.Shift.BEFORE)}, cancellable = true)
/*     */   public void notro$inject$sendClickBlockToController(boolean bool, CallbackInfo ci) {
/*  82 */     if (this.field_3781 <= 0 && this.field_10310.method_3193() && bool && this.field_3822 != null && this.field_3822.field_595 == class_234.class_235.field_7609) {
/*  83 */       if (this.field_3803.method_8580(this.field_3822.method_9344()).method_9028().method_6456() != class_63.field_123) {
/*  84 */         this.field_10310.method_3207();
/*     */       }
/*  86 */       ci.cancel();
/*     */     } 
/*     */   }
/*     */   @Inject(method = {"runGameLoop"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;updateDisplay()V")})
/*     */   public void notro$inject$runGameLoop(CallbackInfo ci) {
/*  91 */     f mmm = (f)Client.a.b().moduleManager().a(f.class);
/*  92 */     if (this.field_3816 != null)
/*  93 */     { if (mmm.c().b() == j.GUI) { mmm.e(((Float)mmm.d().b()).floatValue()); }
/*  94 */       else if (mmm.c().b() == j.BOTH) { mmm.e(((Float)mmm.s().b()).floatValue()); }
/*     */        }
/*  96 */     else if (mmm.c().b() == j.GAME) { mmm.e(((Float)mmm.d().b()).floatValue()); }
/*  97 */     else if (mmm.c().b() == j.BOTH) { mmm.e(((Float)mmm.t().b()).floatValue()); }
/*     */   
/*     */   }
/*     */   @Inject(method = {"resize"}, at = {@At("TAIL")})
/*     */   public void notro$inject$resize(CallbackInfo ci) {
/* 102 */     d.a.a().b();
/* 103 */     d.a.b().c();
/*     */   }
/*     */   @ModifyArg(method = {"runGameLoop"}, at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/Display;sync(I)V"))
/*     */   public int ma$runGameLoop$Display$sync(int in) {
/* 107 */     return (this.field_3816 != null && this.field_3816 instanceof eu.shoroa.notro.bridge.HolderScreen) ? this.field_3823.field_978 : method_4498();
/*     */   }
/*     */ 
/*     */   
/*     */   public class_354 getTimer() {
/* 112 */     return this.field_3778;
/*     */   }
/*     */ 
/*     */   
/*     */   public class_2532 getModelManager() {
/* 117 */     return this.field_10304;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSession(class_355 session) {
/* 122 */     this.field_3808 = session;
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\MixinMinecraft.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */