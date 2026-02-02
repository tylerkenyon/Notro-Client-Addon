/*    */ package eu.shoroa.notro.mixin.fucknetty;
/*    */ 
/*    */ import com.google.common.base.Predicate;
/*    */ import com.mojang.patchy.BlockingDC;
/*    */ import javax.naming.directory.DirContext;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Mutable;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({BlockingDC.class})
/*    */ public class BlockingDCMixin
/*    */ {
/*    */   @Inject(method = {"<init>"}, at = {@At("TAIL")})
/*    */   private void noBlockList(Predicate blockList, DirContext parent, CallbackInfo ci) {
/* 21 */     this.blockList = null;
/*    */   }
/*    */   
/*    */   @Shadow
/*    */   @Final
/*    */   @Mutable
/*    */   private Predicate<String> blockList;
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\fucknetty\BlockingDCMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */