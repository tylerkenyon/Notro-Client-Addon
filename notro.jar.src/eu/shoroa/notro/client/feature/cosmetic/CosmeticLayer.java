/*    */ package eu.shoroa.notro.client.feature.cosmetic;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.bridge.feature.cosmetic.b;
/*    */ import net.minecraft.class_1631;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\007\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\006\030\0002\b\022\004\022\0020\0020\001B\017\022\006\020\004\032\0020\003¢\006\004\b\005\020\006JQ\020\021\032\0020\0202\b\020\007\032\004\030\0010\0022\006\020\t\032\0020\b2\006\020\n\032\0020\b2\006\020\013\032\0020\b2\006\020\f\032\0020\b2\006\020\r\032\0020\b2\006\020\016\032\0020\b2\006\020\017\032\0020\bH\026¢\006\004\b\021\020\022J\017\020\024\032\0020\023H\026¢\006\004\b\024\020\025R\027\020\004\032\0020\0038\006¢\006\f\n\004\b\004\020\026\032\004\b\027\020\030¨\006\031"}, d2 = {"Leu/shoroa/notro/client/feature/cosmetic/CosmeticLayer;", "Lnet/minecraft/class_2508;", "Lnet/minecraft/class_1631;", "Lnet/minecraft/class_570;", "renderPlayer", "<init>", "(Lnet/minecraft/class_570;)V", "player", "", "handSwing", "handSwingAmount", "tickDelta", "age", "headYaw", "headPitch", "scale", "", "doRenderLayer", "(Lnet/minecraft/class_1631;FFFFFFF)V", "", "shouldCombineTextures", "()Z", "Lnet/minecraft/class_570;", "getRenderPlayer", "()Lnet/minecraft/class_570;", "NotroClient"})
/*    */ @SourceDebugExtension({"SMAP\nCosmeticLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CosmeticLayer.kt\neu/shoroa/notro/client/feature/cosmetic/CosmeticLayer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1855#2,2:48\n*S KotlinDebug\n*F\n+ 1 CosmeticLayer.kt\neu/shoroa/notro/client/feature/cosmetic/CosmeticLayer\n*L\n23#1:48,2\n*E\n"})
/*    */ public final class CosmeticLayer implements class_2508<class_1631> {
/* 10 */   public CosmeticLayer(class_570 renderPlayer) { this.renderPlayer = renderPlayer; } @NotNull private final class_570 renderPlayer; @NotNull public final class_570 getRenderPlayer() { return this.renderPlayer; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void doRenderLayer(class_1631 player, float handSwing, float handSwingAmount, float tickDelta, float age, float headYaw, float headPitch, float scale) {
/*    */     Iterator iterator;
/* 21 */     class_2403.method_9791();
/* 22 */     Intrinsics.checkNotNull(player); class_2403.method_9814(0.0D, player.method_2513() ? 0.225D : 0.0D, 0.0D);
/* 23 */     if (BridgeClient.a.b() != null && (BridgeClient.a.b()).cosmeticManager != null && (BridgeClient.a.b()).cosmeticManager.all() != null) { Iterable $this$forEach$iv = (BridgeClient.a.b()).cosmeticManager.all(); int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 48 */       iterator = $this$forEach$iv.iterator(); } else { (BridgeClient.a.b()).cosmeticManager.all(); class_2403.method_9792(); }  if (iterator.hasNext()) { Object element$iv = iterator.next(); b cosmetic = (b)element$iv; int $i$a$-forEach-CosmeticLayer$doRenderLayer$1 = 0;
/*    */       if (!Intrinsics.areEqual(cosmetic.f(), "cape") && cosmetic.h() && cosmetic instanceof c) {
/*    */         if (((c)cosmetic).i().a() == null)
/*    */           ((c)cosmetic).i().a(this.renderPlayer); 
/*    */         ((c)cosmetic).i().method_1176((class_864)player, handSwing, handSwingAmount, tickDelta, headYaw, headPitch, scale);
/*    */       }  }
/*    */   
/*    */   }
/*    */   
/*    */   public boolean method_10296() {
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\cosmetic\CosmeticLayer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */