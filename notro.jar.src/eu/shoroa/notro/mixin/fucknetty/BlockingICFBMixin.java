/*    */ package eu.shoroa.notro.mixin.fucknetty;
/*    */ 
/*    */ import com.google.common.base.Predicate;
/*    */ import com.mojang.patchy.BlockingICFB;
/*    */ import javax.naming.spi.InitialContextFactoryBuilder;
/*    */ import javax.naming.spi.NamingManager;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({BlockingICFB.class})
/*    */ public class BlockingICFBMixin
/*    */ {
/*    */   @Overwrite(remap = false)
/*    */   public static void install() {
/*    */     try {
/* 21 */       System.getProperties().setProperty("sun.net.spi.nameservice.provider.1", "dns,sun");
/* 22 */       NamingManager.setInitialContextFactoryBuilder((InitialContextFactoryBuilder)new BlockingICFB(new Predicate<String>() {
/*    */               public boolean apply(String input) {
/* 24 */                 return false;
/*    */               }
/*    */             }));
/* 27 */     } catch (Throwable var1) {
/* 28 */       System.out.println("Block failed :(");
/* 29 */       var1.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\fucknetty\BlockingICFBMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */