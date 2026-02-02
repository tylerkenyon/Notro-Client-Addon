/*     */ package eu.shoroa.bridge;
/*     */ import java.io.Closeable;
/*     */ import java.util.Map;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import okhttp3.Request;
/*     */ import okhttp3.Response;
/*     */ import org.json.JSONObject;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\006\n\002\b\003\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\030\0002\0020\001B\007¢\006\004\b\034\020\035J\031\020\005\032\004\030\0010\0042\006\020\003\032\0020\002H\007¢\006\004\b\005\020\006J\025\020\b\032\0020\0072\006\020\003\032\0020\002¢\006\004\b\b\020\tJ\035\020\f\032\0020\n2\006\020\003\032\0020\n2\006\020\013\032\0020\n¢\006\004\b\f\020\rJ\035\020\017\032\0020\0162\006\020\003\032\0020\0022\006\020\013\032\0020\002¢\006\004\b\017\020\020J#\020\021\032\004\030\0010\0012\006\020\003\032\0020\0022\b\020\013\032\004\030\0010\001H\007¢\006\004\b\021\020\022J\025\020\023\032\0020\0072\006\020\003\032\0020\002¢\006\004\b\023\020\tR\024\020\025\032\0020\0248\002X\004¢\006\006\n\004\b\025\020\026R\024\020\030\032\0020\0278\002X\004¢\006\006\n\004\b\030\020\031R\024\020\032\032\0020\0028\002XD¢\006\006\n\004\b\032\020\033"}, d2 = {"Leu/shoroa/bridge/SocketClient;", "", "", "p0", "Leu/shoroa/bridge/ServerUser;", "getUser", "(Ljava/lang/String;)Leu/shoroa/bridge/ServerUser;", "", "isUser", "(Ljava/lang/String;)Z", "", "p1", "randomNumber", "(DD)D", "", "selectCosmetic", "(Ljava/lang/String;Ljava/lang/String;)V", "sendRequest", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "startTutorial", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "host", "Ljava/lang/String;", "<init>", "()V"})
/*     */ public final class SocketClient {
/*     */   @NotNull
/*  13 */   private final String host = "https://socket-final.vercel.app/api";
/*     */   @NotNull
/*  15 */   private final OkHttpClient client = (new OkHttpClient.Builder())
/*  16 */     .followRedirects(false)
/*  17 */     .build();
/*     */   @NotNull
/*  19 */   private final Gson gson = new Gson();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object sendRequest(String endpoint, Object payload) {
/*  26 */     Intrinsics.checkNotNullParameter(endpoint, ""); try {
/*  27 */       Response response; String jsonPayload = this.gson.toJson(payload);
/*  28 */       Intrinsics.checkNotNull(jsonPayload); RequestBody body = RequestBody.Companion.create(jsonPayload, MediaType.Companion.parse("application/json"));
/*  29 */       Request request = (new Request.Builder())
/*  30 */         .url(this.host + "/" + this.host)
/*  31 */         .post(body)
/*  32 */         .build();
/*     */       
/*  34 */       Closeable closeable = (Closeable)this.client.newCall(request).execute(); Throwable throwable = null; try { String respBody; Response response1 = (Response)closeable; int $i$a$-use-SocketClient$sendRequest$1 = 0;
/*  35 */         if (!response1.isSuccessful()) {
/*  36 */           if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("HTTP error: " + response1.code()); } else { BridgeClient.a.b(); }
/*  37 */            return null;
/*     */         } 
/*  39 */         if (response1.body() == null || response1.body().string() == null) { response1.body().string(); return null; }
/*  40 */          return new JSONObject(respBody); } catch (Throwable response1) { response = response1 = null; throw response1; } finally { CloseableKt.closeFinally(closeable, (Throwable)response); }
/*     */     
/*  42 */     } catch (Exception e) {
/*  43 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Error in sendRequest: " + e.getMessage()); } else { BridgeClient.a.b(); }
/*  44 */        e.printStackTrace();
/*  45 */       return null;
/*     */     } 
/*     */   }
/*     */   public final boolean startTutorial(String mcName) {
/*  49 */     Intrinsics.checkNotNullParameter(mcName, ""); try {
/*  50 */       Object response; Map payload = MapsKt.mapOf(TuplesKt.to("mcName", mcName));
/*  51 */       if (sendRequest("start_tutorial", payload) == null) { sendRequest("start_tutorial", payload); SocketClient $this$startTutorial_u24lambda_u241 = this; int $i$a$-run-SocketClient$startTutorial$response$1 = 0;
/*  52 */         if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("No response from server for start_tutorial"); } else { BridgeClient.a.b(); }
/*  53 */          return false; }
/*     */ 
/*     */       
/*  56 */       JSONObject jsonObject = 
/*  57 */         (response instanceof JSONObject) ? (JSONObject)response : 
/*  58 */         new JSONObject(response.toString());
/*     */ 
/*     */       
/*  61 */       if (jsonObject.optBoolean("success", false)) {
/*  62 */         if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Tutorial started for " + mcName); } else { BridgeClient.a.b(); }
/*  63 */          return true;
/*     */       } 
/*  65 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Failed to start tutorial: " + jsonObject); } else { BridgeClient.a.b(); }
/*  66 */        return false;
/*     */     }
/*  68 */     catch (Exception e) {
/*  69 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Error starting tutorial: " + e.getMessage()); } else { BridgeClient.a.b(); }
/*  70 */        e.printStackTrace();
/*  71 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isUser(String username) {
/*  79 */     Intrinsics.checkNotNullParameter(username, ""); try {
/*  80 */       Response response; Request request = (new Request.Builder())
/*  81 */         .url(this.host + "/isUser/?mcName=" + this.host)
/*  82 */         .get()
/*  83 */         .build();
/*     */       
/*  85 */       Closeable closeable = (Closeable)this.client.newCall(request).execute(); Throwable throwable = null; try { String respBody; Response response1 = (Response)closeable; int $i$a$-use-SocketClient$isUser$1 = 0;
/*  86 */         if (!response1.isSuccessful()) return false; 
/*  87 */         if (response1.body() == null || response1.body().string() == null) { response1.body().string(); return false; }
/*  88 */          JSONObject json = new JSONObject(respBody);
/*  89 */         return json.optBoolean("exists", false); } catch (Throwable response1) { response = response1 = null; throw response1; } finally { CloseableKt.closeFinally(closeable, (Throwable)response); }
/*     */     
/*  91 */     } catch (Exception e) {
/*  92 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Error checking user: " + e.getMessage()); } else { BridgeClient.a.b(); }
/*  93 */        return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final ServerUser getUser(String username) {
/* 101 */     Intrinsics.checkNotNullParameter(username, ""); try {
/* 102 */       Response response; Request request = (new Request.Builder())
/* 103 */         .url(this.host + "/getUser/?mcName=" + this.host)
/* 104 */         .get()
/* 105 */         .build();
/*     */       
/* 107 */       Closeable closeable = (Closeable)this.client.newCall(request).execute(); Throwable throwable = null; try { String respBody; Response response1 = (Response)closeable; int $i$a$-use-SocketClient$getUser$1 = 0;
/* 108 */         if (!response1.isSuccessful()) return null; 
/* 109 */         if (response1.body() == null || response1.body().string() == null) { response1.body().string(); return null; }
/* 110 */          return (ServerUser)this.gson.fromJson(respBody, ServerUser.class); } catch (Throwable response1) { response = response1 = null; throw response1; } finally { CloseableKt.closeFinally(closeable, (Throwable)response); }
/*     */     
/* 112 */     } catch (Exception e) {
/* 113 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Failed to fetch user: " + e.getMessage()); } else { BridgeClient.a.b(); }
/* 114 */        return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void selectCosmetic(String mcName, String cosmeticId) {
/* 122 */     Intrinsics.checkNotNullParameter(mcName, ""); Intrinsics.checkNotNullParameter(cosmeticId, ""); try {
/* 123 */       Object response; Pair[] arrayOfPair = new Pair[2]; arrayOfPair[0] = TuplesKt.to("mcName", mcName); arrayOfPair[1] = TuplesKt.to("cosmeticId", cosmeticId); Map payload = MapsKt.mapOf(arrayOfPair);
/* 124 */       if (sendRequest("select_cosmetic", payload) == null) { sendRequest("select_cosmetic", payload); SocketClient $this$selectCosmetic_u24lambda_u244 = this; int $i$a$-run-SocketClient$selectCosmetic$response$1 = 0;
/* 125 */         if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("No response from server for select_cosmetic."); } else { BridgeClient.a.b(); }
/*     */         
/*     */         return; }
/*     */       
/* 129 */       JSONObject jsonObject = 
/* 130 */         (response instanceof JSONObject) ? (JSONObject)response : 
/* 131 */         new JSONObject(response.toString());
/*     */ 
/*     */       
/* 134 */       if (jsonObject.optBoolean("success", false))
/* 135 */       { jsonObject.optJSONObject("selectedCosmetic"); String str1 = (jsonObject.optJSONObject("selectedCosmetic") != null) ? jsonObject.optJSONObject("selectedCosmetic").optString("id") : null, selectedCosmetic = (str1 == null) ? 
/* 136 */           cosmeticId : str1;
/* 137 */         if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Successfully selected cosmetic '" + selectedCosmetic + "' for " + mcName + "."); } else { BridgeClient.a.b(); }
/*     */         
/*     */         try {
/* 140 */           if (BridgeClient.a.b() != null) { BridgeClient.a.b().clearWingCache(mcName); } else { BridgeClient.a.b(); }
/* 141 */            if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Cache reset for " + mcName + ". Will re-fetch cosmetics instantly."); } else { BridgeClient.a.b(); } 
/* 142 */         } catch (Exception ignored) {
/* 143 */           if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Warning: Failed to reset cache for " + mcName + "."); } else { BridgeClient.a.b(); }
/*     */         
/*     */         }  }
/* 146 */       else if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Failed to select cosmetic. Server response: " + jsonObject); } else { BridgeClient.a.b(); }
/*     */     
/* 148 */     } catch (Exception e) {
/* 149 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("Error while selecting cosmetic: " + e.getMessage()); } else { BridgeClient.a.b(); }
/* 150 */        e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final double randomNumber(double max, double min) {
/* 158 */     return Math.random() * (max - min) + min;
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\SocketClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */