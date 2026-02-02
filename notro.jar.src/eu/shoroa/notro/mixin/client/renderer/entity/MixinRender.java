/*     */ package eu.shoroa.notro.mixin.client.renderer.entity;
/*     */ 
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.CachedUsers;
/*     */ import eu.shoroa.bridge.ServerUser;
/*     */ import eu.shoroa.notro.a;
/*     */ import eu.shoroa.notro.client.feature.a.g;
/*     */ import java.util.Collections;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import net.minecraft.class_1600;
/*     */ import net.minecraft.class_1653;
/*     */ import net.minecraft.class_2403;
/*     */ import net.minecraft.class_2520;
/*     */ import net.minecraft.class_520;
/*     */ import net.minecraft.class_533;
/*     */ import net.minecraft.class_551;
/*     */ import net.minecraft.class_864;
/*     */ import net.minecraft.class_988;
/*     */ import org.spongepowered.asm.mixin.Mixin;
/*     */ import org.spongepowered.asm.mixin.injection.At;
/*     */ import org.spongepowered.asm.mixin.injection.Inject;
/*     */ import org.spongepowered.asm.mixin.injection.ModifyArg;
/*     */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*     */ 
/*     */ @Mixin({class_551.class})
/*     */ public class MixinRender<T extends class_864> {
/*  30 */   private static final Map<String, String> PENDING_TEXTURE = new ConcurrentHashMap<>();
/*  31 */   private static final Map<String, Integer> LAST_ICON_CHANGE_TICK = new ConcurrentHashMap<>();
/*     */   
/*  33 */   private static final Map<String, UUID> UUID_CACHE = new ConcurrentHashMap<>();
/*  34 */   private static final Set<String> PENDING_LOOKUPS = Collections.newSetFromMap(new ConcurrentHashMap<>());
/*  35 */   private static final Map<String, String> LAST_RENDERED_TEXTURE = new ConcurrentHashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  40 */   private static final Map<String, Boolean> IS_USER_CACHE = new ConcurrentHashMap<>();
/*  41 */   private static final Map<String, Long> IS_USER_CACHE_TIME = new ConcurrentHashMap<>();
/*     */   private static final long IS_USER_CACHE_TTL = 5000L;
/*     */   
/*     */   private boolean isUserCached(String playerName) {
/*  45 */     long now = System.currentTimeMillis();
/*  46 */     Boolean cached = IS_USER_CACHE.get(playerName);
/*  47 */     Long lastCheck = IS_USER_CACHE_TIME.get(playerName);
/*     */ 
/*     */     
/*  50 */     if (cached != null && lastCheck != null && now - lastCheck.longValue() < 5000L) {
/*  51 */       return cached.booleanValue();
/*     */     }
/*     */ 
/*     */     
/*  55 */     if (!IS_USER_CACHE_TIME.containsKey(playerName) || now - ((Long)IS_USER_CACHE_TIME.get(playerName)).longValue() >= 5000L) {
/*  56 */       IS_USER_CACHE_TIME.put(playerName, Long.valueOf(now));
/*     */       
/*  58 */       (new Thread(() -> {
/*     */             try {
/*     */               boolean result = BridgeClient.a.b().getWebSocket().isUser(playerName);
/*     */               IS_USER_CACHE.put(playerName, Boolean.valueOf(result));
/*     */               IS_USER_CACHE_TIME.put(playerName, Long.valueOf(System.currentTimeMillis()));
/*  63 */             } catch (Exception e) {
/*     */               IS_USER_CACHE.put(playerName, Boolean.valueOf(false));
/*     */             } 
/*  66 */           }"IsUserCache-" + playerName)).start();
/*     */     } 
/*     */ 
/*     */     
/*  70 */     return (cached != null && cached.booleanValue());
/*     */   }
/*     */   
/*     */   private static UUID getCachedUUID(String name) {
/*  74 */     if (UUID_CACHE.containsKey(name)) return UUID_CACHE.get(name);
/*     */     
/*  76 */     UUID offlineUuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + name).getBytes());
/*  77 */     UUID_CACHE.put(name, offlineUuid);
/*     */     
/*  79 */     if (!PENDING_LOOKUPS.contains(name)) {
/*  80 */       PENDING_LOOKUPS.add(name);
/*  81 */       (new Thread(() -> {
/*     */             
/*     */             try { UUID real = a.a(name); if (real != null)
/*     */                 UUID_CACHE.put(name, real);  }
/*  85 */             catch (Exception exception) {  }
/*     */             finally
/*     */             { PENDING_LOOKUPS.remove(name); }
/*     */           
/*  89 */           }"UUID-Lookup-" + name)).start();
/*     */     } 
/*  91 */     return offlineUuid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ModifyArg(method = {"renderLivingLabel"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;", ordinal = 0), index = 3)
/*     */   public float notro$alpha1(float in) {
/*  99 */     g m = (g)BridgeClient.a.b().moduleManager().a(g.class);
/* 100 */     return (m != null && !((Boolean)m.d().b()).booleanValue()) ? 0.0F : in;
/*     */   }
/*     */   @ModifyArg(method = {"renderLivingLabel"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;", ordinal = 1), index = 3)
/*     */   public float notro$alpha2(float in) {
/* 104 */     g m = (g)BridgeClient.a.b().moduleManager().a(g.class);
/* 105 */     return (m != null && !((Boolean)m.d().b()).booleanValue()) ? 0.0F : in;
/*     */   }
/*     */   @ModifyArg(method = {"renderLivingLabel"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;", ordinal = 2), index = 3)
/*     */   public float notro$alpha3(float in) {
/* 109 */     g m = (g)BridgeClient.a.b().moduleManager().a(g.class);
/* 110 */     return (m != null && !((Boolean)m.d().b()).booleanValue()) ? 0.0F : in;
/*     */   }
/*     */   @ModifyArg(method = {"renderLivingLabel"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;", ordinal = 3), index = 3)
/*     */   public float notro$alpha4(float in) {
/* 114 */     g m = (g)BridgeClient.a.b().moduleManager().a(g.class);
/* 115 */     return (m != null && !((Boolean)m.d().b()).booleanValue()) ? 0.0F : in;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Inject(method = {"renderLivingLabel"}, at = {@At("HEAD")}, cancellable = true)
/*     */   private void notro$renderRankIcon(class_864 entity, String str, double x, double y, double z, int maxDistance, CallbackInfo ci) {
/* 123 */     if (!(entity instanceof class_988))
/*     */       return; 
/* 125 */     class_988 player = (class_988)entity;
/* 126 */     String playerName = player.method_8429().getName();
/*     */ 
/*     */     
/* 129 */     if (!str.contains(playerName))
/*     */       return; 
/* 131 */     g m = (g)BridgeClient.a.b().moduleManager().a(g.class);
/* 132 */     if (m == null)
/*     */       return; 
/* 134 */     class_1600 mc = class_1600.method_2965();
/*     */ 
/*     */     
/* 137 */     if (!m.b() && entity != mc.field_10310) {
/* 138 */       ci.cancel();
/*     */       
/*     */       return;
/*     */     } 
/* 142 */     if (!str.contains(playerName))
/*     */       return; 
/* 144 */     double distance = entity.method_2548((class_864)mc.field_10310);
/* 145 */     if (distance > (maxDistance * maxDistance))
/*     */       return; 
/* 147 */     class_2403.method_9791();
/*     */     try {
/* 149 */       class_2403.method_9816((float)x, (float)y + entity.field_3207 + 0.5F, (float)z);
/* 150 */       class_2403.method_9817(-(mc.method_9390()).field_2102, 0.0F, 1.0F, 0.0F);
/* 151 */       class_2403.method_9817((mc.method_9390()).field_2103, 1.0F, 0.0F, 0.0F);
/* 152 */       float scale = 0.016666668F;
/* 153 */       class_2403.method_9800(-scale, -scale, scale);
/*     */       
/* 155 */       class_2403.method_9832();
/* 156 */       class_2403.method_9838();
/* 157 */       class_2403.method_9843();
/*     */       
/* 159 */       int textWidth = mc.field_3814.method_954(str);
/* 160 */       int logoX = -(textWidth / 2) - 35;
/* 161 */       int logoY = -3;
/*     */       
/* 163 */       if (entity instanceof net.minecraft.class_1631 && 
/* 164 */         player.field_3220 > 20 && isUserCached(playerName)) {
/* 165 */         ServerUser user = CachedUsers.getCachedUser(playerName);
/* 166 */         String lastStableIcon = LAST_RENDERED_TEXTURE.get(playerName);
/*     */         
/* 168 */         if (user == null) {
/* 169 */           if (!CachedUsers.isFetchPending(playerName)) {
/* 170 */             CachedUsers.asyncFetchUser(playerName);
/*     */           }
/* 172 */           if (lastStableIcon != null) {
/* 173 */             drawIcon(mc, lastStableIcon, logoX, logoY);
/*     */           }
/*     */           
/*     */           return;
/*     */         } 
/* 178 */         if (user.getRank() != null && user.getRank().get("resource") != null) {
/* 179 */           String resource = (String)user.getRank().get("resource");
/* 180 */           String last = LAST_RENDERED_TEXTURE.get(playerName);
/* 181 */           int currentTick = player.field_3220;
/* 182 */           Integer lastChangeTick = LAST_ICON_CHANGE_TICK.getOrDefault(playerName, Integer.valueOf(-100));
/* 183 */           String pending = PENDING_TEXTURE.get(playerName);
/*     */           
/* 185 */           if (last == null || !last.equals(resource)) {
/* 186 */             if (pending == null || !pending.equals(resource)) {
/* 187 */               PENDING_TEXTURE.put(playerName, resource);
/* 188 */               LAST_ICON_CHANGE_TICK.put(playerName, Integer.valueOf(currentTick));
/* 189 */               if (last != null) drawIcon(mc, last, logoX, logoY);
/*     */               
/*     */               return;
/*     */             } 
/* 193 */             if (currentTick - lastChangeTick.intValue() < 3) {
/* 194 */               if (last != null) drawIcon(mc, last, logoX, logoY);
/*     */               
/*     */               return;
/*     */             } 
/* 198 */             LAST_RENDERED_TEXTURE.put(playerName, resource);
/* 199 */             PENDING_TEXTURE.remove(playerName);
/* 200 */             LAST_ICON_CHANGE_TICK.remove(playerName);
/*     */           } 
/*     */           
/* 203 */           drawIcon(mc, resource, logoX, logoY);
/* 204 */         } else if (lastStableIcon != null) {
/* 205 */           drawIcon(mc, lastStableIcon, logoX, logoY);
/*     */         } 
/*     */       } 
/*     */     } finally {
/*     */       
/* 210 */       class_2403.method_9840();
/* 211 */       class_2403.method_9830();
/* 212 */       class_2403.method_9842();
/* 213 */       class_2403.method_9792();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void drawIcon(class_1600 mc, String resource, int x, int y) {
/* 218 */     class_1653 rl = new class_1653("notro", "icons/" + resource + ".png");
/*     */     
/*     */     try {
/* 221 */       mc.method_5570().method_5847(rl);
/* 222 */     } catch (Exception e) {
/* 223 */       BridgeClient.a.b().log("[RankIcon] Missing texture: " + String.valueOf(rl));
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 228 */     class_2403.method_9832();
/* 229 */     class_2403.method_9838();
/* 230 */     class_2403.method_9811(false);
/* 231 */     class_2403.method_9822();
/* 232 */     class_2403.method_9843();
/* 233 */     class_2403.method_9819(770, 771);
/*     */     
/* 235 */     class_533 tess = class_533.method_9926();
/* 236 */     class_520 wr = tess.method_9928();
/*     */     
/* 238 */     wr.method_9737(7, class_2520.field_11208);
/* 239 */     wr.method_9742(x, y, 0.0D).method_9728(0.0D, 0.0D).method_9750();
/* 240 */     wr.method_9742(x, (y + 16), 0.0D).method_9728(0.0D, 1.0D).method_9750();
/* 241 */     wr.method_9742((x + 16), (y + 16), 0.0D).method_9728(1.0D, 1.0D).method_9750();
/* 242 */     wr.method_9742((x + 16), y, 0.0D).method_9728(1.0D, 0.0D).method_9750();
/* 243 */     tess.method_9927();
/*     */ 
/*     */     
/* 246 */     class_2403.method_9828();
/* 247 */     class_2403.method_9811(true);
/* 248 */     class_2403.method_9840();
/* 249 */     class_2403.method_9830();
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\entity\MixinRender.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */