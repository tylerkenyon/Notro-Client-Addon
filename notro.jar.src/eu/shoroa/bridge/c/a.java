/*     */ package eu.shoroa.bridge.c;
/*     */ 
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.json.JSONObject;
/*     */ 
/*     */ public final class a extends WebSocketClient {
/*     */   @NotNull
/*     */   public static final a a = new a(null);
/*     */   @NotNull
/*     */   private Function2<? super String, Object, Unit> b;
/*     */   @NotNull
/*     */   private final CountDownLatch c;
/*     */   @NotNull
/*     */   private final CosmeticManager d;
/*     */   
/*  19 */   public a(URI serverUri, Function2<? super String, Object, Unit> onMessageReceived) { super(serverUri);
/*     */     this.b = onMessageReceived;
/*  21 */     this.c = new CountDownLatch(1);
/*  22 */     this.d = new CosmeticManager();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  27 */     this.h = new CountDownLatch(1); } @Nullable
/*     */   private String e; @Nullable
/*     */   private String f; @Nullable
/*     */   private JSONObject g; @NotNull
/*  31 */   private final CountDownLatch h; public void a(ServerHandshake handshakedata) { System.out.println("WebSocket connection opened");
/*  32 */     this.c.countDown(); }
/*     */ 
/*     */   
/*     */   public void a(String message) {
/*  36 */     String it = message; int $i$a$-let-Websocket$onMessage$1 = 0;
/*     */     try {
/*  38 */       JSONObject jsonObject = new JSONObject(it);
/*  39 */       String type = jsonObject.getString("type");
/*  40 */       Object data = jsonObject.has("data") ? jsonObject.get("data") : null;
/*  41 */       Intrinsics.checkNotNull(type); this.b.invoke(type, data);
/*  42 */     } catch (Exception e) {
/*  43 */       System.out.println("Error parsing message: " + e.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int code, String reason, boolean remote) {
/*  49 */     System.out.println("WebSocket connection closed: Code=" + code + ", Reason=" + reason);
/*     */   }
/*     */   
/*     */   public void a(Exception ex) {
/*  53 */     System.out.println("WebSocket error: " + ((ex != null) ? ex.getMessage() : null));
/*     */   }
/*     */   
/*     */   public final void a() {
/*  57 */     this.b = new Function2<String, Object, Unit>(this) { public final void a(String type, Object data) { JSONObject cosmetic, category; String cosmeticId; Pair[] arrayOfPair;
/*  58 */           Intrinsics.checkNotNullParameter(type, ""); String str1 = type; switch (str1.hashCode()) { case -1704678544: if (!str1.equals("COSMETIC_ADDED")) {
/*     */                 break;
/*     */               }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  79 */               cosmetic = new JSONObject(String.valueOf(data));
/*  80 */               cosmeticId = cosmetic.getString("id");
/*     */               
/*  82 */               this.a.b("Player Ranks", "Ranks for players");
/*     */               return;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             case -1670732769:
/*     */               if (!str1.equals("USER_COSMETICS_DETAILED")) {
/*     */                 break;
/*     */               }
/* 102 */               a.a(this.a, new JSONObject(String.valueOf(data)));
/* 103 */               a.c(this.a).countDown(); return;case 511875668: if (!str1.equals("USER_CREATED")) break;  System.out.println("User Created: " + data); this.a.a("Hats", "Various hat cosmetics"); return;case 496172090: if (!str1.equals("RANK_CATEGORY_CREATED"))
/*     */                 break;  category = new JSONObject(String.valueOf(data)); a.b(this.a, category.getString("id")); Intrinsics.checkNotNull(a.b(this.a)); arrayOfPair = new Pair[5]; arrayOfPair[0] = TuplesKt.to("name", "Default"); arrayOfPair[1] = TuplesKt.to("displayName", "Default Rank"); arrayOfPair[2] = TuplesKt.to("color", "#00FF00"); arrayOfPair[3] = TuplesKt.to("permissions", CollectionsKt.listOf("basic_access")); arrayOfPair[4] = TuplesKt.to("hierarchy", Integer.valueOf(1)); this.a.b(a.b(this.a), MapsKt.mapOf(arrayOfPair)); return;case 66247144: if (!str1.equals("ERROR"))
/* 105 */                 break;  System.out.println("Error: " + data); return;case 1666941943: if (!str1.equals("COSMETIC_CATEGORY_CREATED")) break;  category = new JSONObject(String.valueOf(data)); a.a(this.a, category.getString("id")); Intrinsics.checkNotNull(a.a(this.a)); arrayOfPair = new Pair[4]; arrayOfPair[0] = TuplesKt.to("name", "Legendary Hat"); arrayOfPair[1] = TuplesKt.to("description", "A legendary hat"); arrayOfPair[2] = TuplesKt.to("texture", "legendary_hat_texture.png"); arrayOfPair[3] = TuplesKt.to("rarity", "LEGENDARY"); this.a.a(a.a(this.a), MapsKt.mapOf(arrayOfPair)); return;case -1139776610: if (!str1.equals("USER_DATA")) break;  System.out.println("User Data Received:"); System.out.println((new JSONObject(String.valueOf(data))).toString(4)); return;case 698836473: if (!str1.equals("USER_COSMETICS_RETRIEVED")) break;  System.out.println(new JSONObject(new Function0<String>(data) { @NotNull public final String a() { return String.valueOf(this.$a); } }
/* 106 */                   )); return; }  System.out.println("Received message type: " + type); }
/*     */          }
/*     */       ;
/*     */   }
/*     */   
/* 111 */   public final void b() { BuildersKt.runBlocking$default(null, new b(this, null), 1, null); } @DebugMetadata(f = "Websocket.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "eu.shoroa.bridge.socket.Websocket$initializeConnection$1") static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int a; b(a $receiver, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.a) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           
/* 113 */           this.b.e();
/*     */           
/* 115 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(Object value, Continuation<? super b> $completion) { return (Continuation<Unit>)new b(this.b, $completion); }
/*     */     @Nullable public final Object a(CoroutineScope p1, Continuation<?> p2) { return ((b)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 119 */   public final void a(String name, String description) { Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(description, ""); JSONObject jSONObject1 = new JSONObject(), $this$createCosmeticCategory_u24lambda_u242 = jSONObject1; int $i$a$-apply-Websocket$createCosmeticCategory$payload$1 = 0;
/* 120 */     $this$createCosmeticCategory_u24lambda_u242.put("type", "CREATE_COSMETIC_CATEGORY");
/* 121 */     JSONObject jSONObject2 = new JSONObject(), jSONObject3 = jSONObject2; String str = "data"; JSONObject jSONObject4 = $this$createCosmeticCategory_u24lambda_u242; int $i$a$-apply-Websocket$createCosmeticCategory$payload$1$1 = 0;
/* 122 */     jSONObject3.put("name", name);
/* 123 */     jSONObject3.put("description", description);
/* 124 */     Unit unit = Unit.INSTANCE; jSONObject4.put(str, jSONObject2);
/*     */     JSONObject payload = jSONObject1;
/* 126 */     System.out.println("Sending Create Cosmetic Category Payload: " + payload);
/* 127 */     send(payload.toString()); }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void a(String categoryId, Map cosmeticData) {
/* 132 */     Intrinsics.checkNotNullParameter(categoryId, ""); Intrinsics.checkNotNullParameter(cosmeticData, ""); JSONObject jSONObject1 = new JSONObject(), $this$createCosmetic_u24lambda_u244 = jSONObject1; int $i$a$-apply-Websocket$createCosmetic$payload$1 = 0;
/* 133 */     $this$createCosmetic_u24lambda_u244.put("type", "ADD_COSMETIC_TO_CATEGORY");
/* 134 */     JSONObject jSONObject2 = new JSONObject(), jSONObject3 = jSONObject2; String str = "data"; JSONObject jSONObject4 = $this$createCosmetic_u24lambda_u244; int $i$a$-apply-Websocket$createCosmetic$payload$1$1 = 0;
/* 135 */     jSONObject3.put("categoryId", categoryId);
/* 136 */     jSONObject3.put("cosmeticData", new JSONObject(cosmeticData));
/* 137 */     Unit unit = Unit.INSTANCE; jSONObject4.put(str, jSONObject2);
/*     */     JSONObject payload = jSONObject1;
/* 139 */     System.out.println("Sending Create Cosmetic Payload: " + payload);
/* 140 */     send(payload.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void a(Map userData) {
/* 145 */     Intrinsics.checkNotNullParameter(userData, ""); JSONObject jSONObject1 = new JSONObject(), $this$createUser_u24lambda_u245 = jSONObject1; int $i$a$-apply-Websocket$createUser$payload$1 = 0;
/* 146 */     $this$createUser_u24lambda_u245.put("type", "CREATE_USER");
/* 147 */     $this$createUser_u24lambda_u245.put("data", new JSONObject(userData));
/*     */     JSONObject payload = jSONObject1;
/* 149 */     System.out.println("Sending Create User Payload: " + payload);
/* 150 */     send(payload.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void b(String uuid) {
/* 155 */     Intrinsics.checkNotNullParameter(uuid, ""); JSONObject jSONObject1 = new JSONObject(), $this$getUser_u24lambda_u246 = jSONObject1; int $i$a$-apply-Websocket$getUser$payload$1 = 0;
/* 156 */     $this$getUser_u24lambda_u246.put("type", "GET_USER");
/* 157 */     $this$getUser_u24lambda_u246.put("data", (new JSONObject()).put("uuid", uuid));
/*     */     JSONObject payload = jSONObject1;
/* 159 */     System.out.println("Sending Get User Payload: " + payload);
/* 160 */     send(payload.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void a(String userId, String categoryId, String cosmeticId) {
/* 165 */     Intrinsics.checkNotNullParameter(userId, ""); Intrinsics.checkNotNullParameter(categoryId, ""); Intrinsics.checkNotNullParameter(cosmeticId, ""); JSONObject jSONObject1 = new JSONObject(), $this$addCosmeticToUser_u24lambda_u248 = jSONObject1; int $i$a$-apply-Websocket$addCosmeticToUser$payload$1 = 0;
/* 166 */     $this$addCosmeticToUser_u24lambda_u248.put("type", "ADD_COSMETIC_TO_USER");
/* 167 */     JSONObject jSONObject2 = new JSONObject(), jSONObject3 = jSONObject2; String str = "data"; JSONObject jSONObject4 = $this$addCosmeticToUser_u24lambda_u248; int $i$a$-apply-Websocket$addCosmeticToUser$payload$1$1 = 0;
/* 168 */     jSONObject3.put("userId", userId);
/* 169 */     jSONObject3.put("categoryId", categoryId);
/* 170 */     jSONObject3.put("cosmeticId", cosmeticId);
/* 171 */     Unit unit = Unit.INSTANCE; jSONObject4.put(str, jSONObject2);
/*     */     JSONObject payload = jSONObject1;
/* 173 */     System.out.println("Sending Add Cosmetic to User Payload: " + payload);
/* 174 */     send(payload.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void b(String name, String description) {
/* 179 */     Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(description, ""); JSONObject jSONObject1 = new JSONObject(), $this$createRankCategory_u24lambda_u2410 = jSONObject1; int $i$a$-apply-Websocket$createRankCategory$payload$1 = 0;
/* 180 */     $this$createRankCategory_u24lambda_u2410.put("type", "CREATE_RANK_CATEGORY");
/* 181 */     JSONObject jSONObject2 = new JSONObject(), jSONObject3 = jSONObject2; String str = "data"; JSONObject jSONObject4 = $this$createRankCategory_u24lambda_u2410; int $i$a$-apply-Websocket$createRankCategory$payload$1$1 = 0;
/* 182 */     jSONObject3.put("name", name);
/* 183 */     jSONObject3.put("description", description);
/* 184 */     Unit unit = Unit.INSTANCE; jSONObject4.put(str, jSONObject2);
/*     */     JSONObject payload = jSONObject1;
/* 186 */     System.out.println("Sending Create Rank Category Payload: " + payload);
/* 187 */     send(payload.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void b(String categoryId, Map rankData) {
/* 192 */     Intrinsics.checkNotNullParameter(categoryId, ""); Intrinsics.checkNotNullParameter(rankData, ""); JSONObject jSONObject1 = new JSONObject(), $this$createRank_u24lambda_u2412 = jSONObject1; int $i$a$-apply-Websocket$createRank$payload$1 = 0;
/* 193 */     $this$createRank_u24lambda_u2412.put("type", "ADD_RANK_TO_CATEGORY");
/* 194 */     JSONObject jSONObject2 = new JSONObject(), jSONObject3 = jSONObject2; String str = "data"; JSONObject jSONObject4 = $this$createRank_u24lambda_u2412; int $i$a$-apply-Websocket$createRank$payload$1$1 = 0;
/* 195 */     jSONObject3.put("categoryId", categoryId);
/* 196 */     jSONObject3.put("rankData", new JSONObject(rankData));
/* 197 */     Unit unit = Unit.INSTANCE; jSONObject4.put(str, jSONObject2);
/*     */     JSONObject payload = jSONObject1;
/* 199 */     System.out.println("Sending Create Rank Payload: " + payload);
/* 200 */     send(payload.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void c() {
/* 205 */     JSONObject jSONObject1 = new JSONObject(), $this$getAllCosmeticCategories_u24lambda_u2413 = jSONObject1; int $i$a$-apply-Websocket$getAllCosmeticCategories$payload$1 = 0;
/* 206 */     $this$getAllCosmeticCategories_u24lambda_u2413.put("type", "GET_ALL_COSMETIC_CATEGORIES");
/*     */     JSONObject payload = jSONObject1;
/* 208 */     System.out.println("Sending Get All Cosmetic Categories Payload: " + payload);
/* 209 */     send(payload.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void d() {
/* 214 */     JSONObject jSONObject1 = new JSONObject(), $this$getAllRankCategories_u24lambda_u2414 = jSONObject1; int $i$a$-apply-Websocket$getAllRankCategories$payload$1 = 0;
/* 215 */     $this$getAllRankCategories_u24lambda_u2414.put("type", "GET_ALL_RANK_CATEGORIES");
/*     */     JSONObject payload = jSONObject1;
/* 217 */     System.out.println("Sending Get All Rank Categories Payload: " + payload);
/* 218 */     send(payload.toString());
/*     */   }
/*     */   @Nullable
/*     */   public final JSONObject c(String uuid) {
/* 222 */     Intrinsics.checkNotNullParameter(uuid, ""); JSONObject jSONObject1 = new JSONObject(), $this$getUserCosmetics_u24lambda_u2415 = jSONObject1; int $i$a$-apply-Websocket$getUserCosmetics$payload$1 = 0;
/* 223 */     $this$getUserCosmetics_u24lambda_u2415.put("type", "GET_USER_COSMETICS_DETAILED");
/* 224 */     $this$getUserCosmetics_u24lambda_u2415.put("data", (new JSONObject()).put("userId", uuid));
/*     */     JSONObject payload = jSONObject1;
/* 226 */     System.out.println("Sending Get User Cosmetics Detailed Payload: " + payload);
/* 227 */     send(payload.toString());
/* 228 */     this.h.await(10L, TimeUnit.SECONDS);
/* 229 */     return this.g;
/*     */   }
/*     */   
/*     */   public final void e() {
/* 233 */     connectBlocking();
/* 234 */     this.c.await();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\t\020\nJ!\020\007\032\0020\0062\006\020\003\032\0020\0022\b\b\002\020\005\032\0020\004H\007¢\006\004\b\007\020\b"}, d2 = {"Leu/shoroa/bridge/c/a$a;", "", "", "p0", "", "p1", "Leu/shoroa/bridge/c/a;", "a", "(Ljava/lang/String;Z)Leu/shoroa/bridge/c/a;", "<init>", "()V"})
/*     */   public static final class a { private a() {}
/*     */     
/*     */     @NotNull
/*     */     public final a a(String uri, boolean setupDefaultFlow) {
/* 242 */       Intrinsics.checkNotNullParameter(uri, ""); a websocket = new a(new URI(uri), null.a);
/*     */       
/* 244 */       if (setupDefaultFlow) {
/* 245 */         websocket.a();
/*     */       }
/*     */       
/* 248 */       return websocket;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\c\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */