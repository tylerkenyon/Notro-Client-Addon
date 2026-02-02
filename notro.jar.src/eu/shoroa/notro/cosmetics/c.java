/*     */ package eu.shoroa.notro.cosmetics;
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.ServerUser;
/*     */ import eu.shoroa.notro.a;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import net.minecraft.class_1653;
/*     */ 
/*     */ public class c {
/*  13 */   private static final Map<String, UUID> a = new ConcurrentHashMap<>();
/*  14 */   private static final Set<String> b = ConcurrentHashMap.newKeySet();
/*     */   
/*  16 */   private static final Map<String, class_1653> c = new ConcurrentHashMap<>();
/*  17 */   private static final Map<String, class_1653> d = new ConcurrentHashMap<>();
/*  18 */   private static final Map<String, Integer> e = new ConcurrentHashMap<>();
/*     */   
/*     */   private static final int f = 3;
/*  21 */   private static final Map<String, Boolean> g = new ConcurrentHashMap<>();
/*  22 */   private static final Map<String, Long> h = new ConcurrentHashMap<>();
/*     */   
/*     */   private static final int i = 1000;
/*     */   
/*     */   public static UUID a(String name) {
/*  27 */     if (a.containsKey(name)) return a.get(name);
/*     */     
/*  29 */     UUID offlineUuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + name).getBytes());
/*  30 */     a.put(name, offlineUuid);
/*     */     
/*  32 */     if (!b.contains(name)) {
/*  33 */       b.add(name);
/*  34 */       (new Thread(() -> {
/*     */             
/*     */             try { UUID real = a.a(name); if (real != null)
/*     */                 a.put(name, real);  }
/*  38 */             catch (Exception exception) {  }
/*     */             finally
/*     */             { b.remove(name); }
/*     */           
/*  42 */           }"UUID-Lookup-" + name)).start();
/*     */     } 
/*     */     
/*  45 */     return offlineUuid;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void b(String name) {
/*  50 */     long now = System.currentTimeMillis();
/*  51 */     long last = ((Long)h.getOrDefault(name, Long.valueOf(0L))).longValue();
/*  52 */     if (now - last < 1000L)
/*     */       return; 
/*  54 */     h.put(name, Long.valueOf(now));
/*     */     
/*  56 */     CompletableFuture.runAsync(() -> {
/*     */           try {
/*     */             ServerUser user = (BridgeClient.a.b()).socketClient.getUser(name);
/*     */ 
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
/*     */             g.put(name, Boolean.valueOf(selected));
/*  74 */           } catch (Exception e) {
/*     */             BridgeClient.a.b().log("Error fetching wings selection for " + name + ": " + e.getMessage());
/*     */             e.printStackTrace();
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean c(String name) {
/*  83 */     return ((Boolean)g.getOrDefault(name, Boolean.valueOf(false))).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public static class_1653 d(String name) {
/*  88 */     return c.get(name);
/*     */   }
/*     */   
/*     */   public static class_1653 e(String name) {
/*  92 */     return d.get(name);
/*     */   }
/*     */   
/*     */   public static void a(String name, class_1653 texture, int tick) {
/*  96 */     d.put(name, texture);
/*  97 */     e.put(name, Integer.valueOf(tick));
/*     */   }
/*     */   
/*     */   public static int f(String name) {
/* 101 */     return ((Integer)e.getOrDefault(name, Integer.valueOf(-100))).intValue();
/*     */   }
/*     */   
/*     */   public static void a(String name, class_1653 texture) {
/* 105 */     c.put(name, texture);
/* 106 */     d.remove(name);
/* 107 */     e.remove(name);
/*     */   }
/*     */   
/*     */   public static int a() {
/* 111 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void g(String uuid) {
/* 116 */     g.remove(uuid);
/* 117 */     h.remove(uuid);
/* 118 */     d.remove(uuid);
/* 119 */     c.remove(uuid);
/* 120 */     e.remove(uuid);
/* 121 */     BridgeClient.a.b().log("[WingCache] Cache reset for " + uuid);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\cosmetics\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */