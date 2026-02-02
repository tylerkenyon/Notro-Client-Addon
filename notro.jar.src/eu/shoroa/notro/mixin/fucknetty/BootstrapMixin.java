/*    */ package eu.shoroa.notro.mixin.fucknetty;
/*    */ 
/*    */ import io.netty.bootstrap.Bootstrap;
/*    */ import io.netty.channel.ChannelFuture;
/*    */ import java.net.SocketAddress;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Redirect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({Bootstrap.class})
/*    */ public class BootstrapMixin
/*    */ {
/*    */   @Overwrite(remap = false)
/*    */   ChannelFuture checkAddress(SocketAddress remoteAddress) {
/* 19 */     return null;
/*    */   }
/*    */   
/*    */   @Redirect(method = {"<clinit>"}, at = @At(value = "INVOKE", target = "Lcom/mojang/patchy/BlockingICFB;install()V"))
/*    */   private static void noBlocking() {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\fucknetty\BootstrapMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */