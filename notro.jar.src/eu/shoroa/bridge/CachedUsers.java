/*    */ package eu.shoroa.bridge;
/*    */ import java.util.Collections;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.ConcurrentHashMap;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class CachedUsers {
/*  9 */   private static final Map<String, a> USER_CACHE = new ConcurrentHashMap<>();
/* 10 */   private static final Set<String> FETCH_PENDING = Collections.newSetFromMap(new ConcurrentHashMap<>());
/*    */   
/*    */   public static class a {
/*    */     public final long a;
/*    */     public final ServerUser b;
/*    */     public final int c;
/*    */     
/*    */     public a(ServerUser user) {
/* 18 */       this.b = user;
/* 19 */       this.a = System.currentTimeMillis();
/* 20 */       this.c = CachedUsers.computeUserHash(user);
/*    */     }
/*    */   }
/*    */   
/*    */   private static int computeUserHash(ServerUser user) {
/* 25 */     if (user == null) return 0; 
/* 26 */     return Objects.hash(new Object[] { user
/* 27 */           .getMcName(), 
/* 28 */           (user.getRank() != null) ? user.getRank().get("name") : "", 
/* 29 */           Integer.valueOf((user.getCosmetics() != null) ? user.getCosmetics().hashCode() : 0) });
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static ServerUser getCachedUser(String name) {
/* 34 */     a cached = USER_CACHE.get(name);
/* 35 */     if (cached == null) return null;
/*    */ 
/*    */     
/* 38 */     if (System.currentTimeMillis() - cached.a > 10000L) {
/* 39 */       USER_CACHE.remove(name);
/* 40 */       return null;
/*    */     } 
/*    */     
/* 43 */     return cached.b;
/*    */   }
/*    */   
/*    */   public static boolean isFetchPending(String name) {
/* 47 */     return FETCH_PENDING.contains(name);
/*    */   }
/*    */   
/*    */   public static void asyncFetchUser(String name) {
/* 51 */     if (FETCH_PENDING.contains(name))
/* 52 */       return;  FETCH_PENDING.add(name);
/*    */     
/* 54 */     (new Thread(() -> {
/*    */           try {
/*    */             BridgeClient client = BridgeClient.a.a();
/*    */             if (client == null || client.socketClient == null) {
/*    */               return;
/*    */             }
/*    */             ServerUser latest = client.socketClient.getUser(name);
/*    */             if (latest == null)
/*    */               return; 
/*    */             a cached = USER_CACHE.get(name);
/*    */             int latestHash = computeUserHash(latest);
/*    */             if (cached == null || cached.c != latestHash) {
/*    */               USER_CACHE.put(name, new a(latest));
/*    */               System.out.println("[Cache] Updated user cache for " + name);
/*    */             } 
/* 69 */           } catch (Exception e) {
/*    */             System.err.println("[Cache] Failed to fetch user " + name + ": " + e.getMessage());
/*    */           } finally {
/*    */             FETCH_PENDING.remove(name);
/*    */           } 
/* 74 */         }"User-Fetch-" + name)).start();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\CachedUsers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */