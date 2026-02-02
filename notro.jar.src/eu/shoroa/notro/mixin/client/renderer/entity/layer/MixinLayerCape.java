/*     */ package eu.shoroa.notro.mixin.client.renderer.entity.layer;
/*     */ 
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.ServerUser;
/*     */ import eu.shoroa.notro.a;
/*     */ import eu.shoroa.notro.client.feature.cosmetic.b;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import net.minecraft.class_1631;
/*     */ import net.minecraft.class_1653;
/*     */ import net.minecraft.class_2496;
/*     */ import org.spongepowered.asm.mixin.Mixin;
/*     */ import org.spongepowered.asm.mixin.injection.At;
/*     */ import org.spongepowered.asm.mixin.injection.ModifyArg;
/*     */ import org.spongepowered.asm.mixin.injection.Redirect;
/*     */ 
/*     */ @Mixin({class_2496.class})
/*     */ public class MixinLayerCape {
/*     */   private class_1631 acp;
/*  23 */   private static final Map<String, UUID> UUID_CACHE = new ConcurrentHashMap<>();
/*  24 */   private static final Set<String> PENDING_LOOKUPS = ConcurrentHashMap.newKeySet();
/*     */ 
/*     */   
/*  27 */   private static final Map<String, class_1653> LAST_RENDERED_CAPE = new ConcurrentHashMap<>();
/*  28 */   private static final Map<String, class_1653> PENDING_CAPE = new ConcurrentHashMap<>();
/*  29 */   private static final Map<String, Integer> LAST_CAPE_CHANGE_TICK = new ConcurrentHashMap<>();
/*     */   
/*     */   private static final int CAPE_UPDATE_DELAY = 3;
/*     */   
/*  33 */   private static final Map<String, Boolean> SELECTED_CAPE_CACHE = new ConcurrentHashMap<>();
/*  34 */   private static final Map<String, Long> LAST_SELECTED_UPDATE = new ConcurrentHashMap<>();
/*     */   private static final int SELECTED_UPDATE_DELAY_MS = 1000;
/*     */   
/*     */   private static UUID getCachedUUID(String name) {
/*  38 */     if (UUID_CACHE.containsKey(name)) return UUID_CACHE.get(name);
/*     */     
/*  40 */     UUID offlineUuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + name).getBytes());
/*  41 */     UUID_CACHE.put(name, offlineUuid);
/*     */     
/*  43 */     if (!PENDING_LOOKUPS.contains(name)) {
/*  44 */       PENDING_LOOKUPS.add(name);
/*  45 */       (new Thread(() -> {
/*     */             
/*     */             try { UUID real = a.a(name); if (real != null)
/*     */                 UUID_CACHE.put(name, real);  }
/*  49 */             catch (Exception exception) {  }
/*     */             finally
/*     */             { PENDING_LOOKUPS.remove(name); }
/*     */           
/*  53 */           }"UUID-Lookup-" + name)).start();
/*     */     } 
/*     */     
/*  56 */     return offlineUuid;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void updateSelectedCapeAsync(String name) {
/*  61 */     long now = System.currentTimeMillis();
/*  62 */     long last = ((Long)LAST_SELECTED_UPDATE.getOrDefault(name, Long.valueOf(0L))).longValue();
/*     */     
/*  64 */     if (now - last < 1000L)
/*  65 */       return;  LAST_SELECTED_UPDATE.put(name, Long.valueOf(now));
/*     */     
/*  67 */     CompletableFuture.runAsync(() -> {
/*     */           try {
/*     */             ServerUser user = (BridgeClient.a.b()).socketClient.getUser(name);
/*     */ 
/*     */ 
/*     */             
/*     */             boolean selected = false;
/*     */ 
/*     */ 
/*     */             
/*     */             if (user != null && user.getCosmetics() != null) {
/*     */               selected = ((Boolean)user.getCosmetics().stream().filter(()).findFirst().map(()).orElse(Boolean.valueOf(false))).booleanValue();
/*     */             }
/*     */ 
/*     */ 
/*     */             
/*     */             SELECTED_CAPE_CACHE.put(name, Boolean.valueOf(selected));
/*  84 */           } catch (Exception e) {
/*     */             BridgeClient.a.b().log("Error fetching cape selection for " + name + ": " + e.getMessage());
/*     */             e.printStackTrace();
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Redirect(method = {"doRenderLayer(Lnet/minecraft/client/entity/AbstractClientPlayer;FFFFFFF)V"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;getLocationCape()Lnet/minecraft/util/ResourceLocation;", ordinal = 0))
/*     */   public class_1653 notro$redirect$getLocationCape(class_1631 instance) {
/* 100 */     this.acp = instance;
/*     */ 
/*     */     
/* 103 */     b.a.b();
/*     */     
/* 105 */     String name = instance.method_8429().getName();
/* 106 */     UUID uuid = getCachedUUID(name);
/* 107 */     int currentTick = instance.field_3220;
/*     */ 
/*     */     
/* 110 */     updateSelectedCapeAsync(name);
/* 111 */     boolean selected = ((Boolean)SELECTED_CAPE_CACHE.getOrDefault(name, Boolean.valueOf(false))).booleanValue();
/*     */ 
/*     */     
/* 114 */     if (!selected) return null;
/*     */ 
/*     */     
/* 117 */     class_1653 newCape = b.a.a(name, null);
/* 118 */     class_1653 lastCape = LAST_RENDERED_CAPE.get(name);
/* 119 */     class_1653 pending = PENDING_CAPE.get(name);
/* 120 */     int lastChange = ((Integer)LAST_CAPE_CHANGE_TICK.getOrDefault(name, Integer.valueOf(-100))).intValue();
/*     */     
/* 122 */     if (newCape != null && (lastCape == null || !lastCape.equals(newCape))) {
/* 123 */       if (pending == null || !pending.equals(newCape)) {
/* 124 */         PENDING_CAPE.put(name, newCape);
/* 125 */         LAST_CAPE_CHANGE_TICK.put(name, Integer.valueOf(currentTick));
/* 126 */         return (lastCape != null) ? lastCape : instance.method_5726();
/*     */       } 
/*     */       
/* 129 */       if (currentTick - lastChange < 3) {
/* 130 */         return (lastCape != null) ? lastCape : instance.method_5726();
/*     */       }
/*     */       
/* 133 */       LAST_RENDERED_CAPE.put(name, newCape);
/* 134 */       PENDING_CAPE.remove(name);
/* 135 */       LAST_CAPE_CHANGE_TICK.remove(name);
/*     */     } 
/*     */     
/* 138 */     return (newCape != null) ? 
/* 139 */       LAST_RENDERED_CAPE.getOrDefault(name, newCape) : (
/* 140 */       (lastCape != null) ? lastCape : instance.method_5726());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Redirect(method = {"doRenderLayer(Lnet/minecraft/client/entity/AbstractClientPlayer;FFFFFFF)V"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;hasPlayerInfo()Z", ordinal = 0))
/*     */   public boolean notro$redirect$hasPlayerInfo(class_1631 instance) {
/* 150 */     return instance.method_6867();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ModifyArg(method = {"doRenderLayer(Lnet/minecraft/client/entity/AbstractClientPlayer;FFFFFFF)V"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderPlayer;bindTexture(Lnet/minecraft/util/ResourceLocation;)V"))
/*     */   public class_1653 notro$modifyArg$bindTexture(class_1653 in) {
/* 159 */     String name = this.acp.method_2518();
/* 160 */     boolean selected = ((Boolean)SELECTED_CAPE_CACHE.getOrDefault(name, Boolean.valueOf(false))).booleanValue();
/*     */     
/* 162 */     if (!selected) return null;
/*     */     
/* 164 */     class_1653 stableCape = LAST_RENDERED_CAPE.getOrDefault(name, in);
/* 165 */     return (stableCape != null) ? stableCape : in;
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\entity\layer\MixinLayerCape.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */