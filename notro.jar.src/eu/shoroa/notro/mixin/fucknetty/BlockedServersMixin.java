/*    */ package eu.shoroa.notro.mixin.fucknetty;
/*    */ 
/*    */ import com.mojang.patchy.BlockedServers;
/*    */ import java.io.IOException;
/*    */ import java.net.URL;
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.Objects;
/*    */ import java.util.Set;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({BlockedServers.class})
/*    */ public class BlockedServersMixin
/*    */ {
/*    */   @Shadow
/*    */   @Final
/*    */   private static Set<String> BLOCKED_SERVERS;
/*    */   
/*    */   @Overwrite(remap = false)
/*    */   public static boolean isBlockedServer(String server) {
/* 27 */     return false; } @Shadow
/*    */   @Final
/*    */   private static Charset HASH_CHARSET; @Inject(method = {"<clinit>"}, at = {@At("TAIL")})
/*    */   private static void setListEmpty(CallbackInfo ci) {
/*    */     try {
/* 32 */       Objects.requireNonNull(BLOCKED_SERVERS); IOUtils.readLines((new URL("https://sessionserver.mojang.com/blockedservers")).openConnection().getInputStream(), HASH_CHARSET).forEach(BLOCKED_SERVERS::remove);
/* 33 */     } catch (IOException iOException) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\fucknetty\BlockedServersMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */