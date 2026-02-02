/*     */ package eu.shoroa.bridge;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\b'\030\000 62\0020\001:\0016B\007¢\006\004\b5\020\021J\027\020\005\032\0020\0042\006\020\003\032\0020\002H&¢\006\004\b\005\020\006J\021\020\007\032\004\030\0010\002H\007¢\006\004\b\007\020\bJ\017\020\n\032\0020\tH\007¢\006\004\b\n\020\013J\027\020\f\032\0020\0042\006\020\003\032\0020\002H&¢\006\004\b\f\020\006J\017\020\016\032\0020\rH\007¢\006\004\b\016\020\017J\r\020\020\032\0020\004¢\006\004\b\020\020\021J\027\020\023\032\0020\0042\006\020\003\032\0020\022H\026¢\006\004\b\023\020\024J\025\020\025\032\0020\0042\006\020\003\032\0020\002¢\006\004\b\025\020\006J\017\020\026\032\0020\004H&¢\006\004\b\026\020\021J\017\020\027\032\0020\004H&¢\006\004\b\027\020\021J\017\020\031\032\0020\030H'¢\006\004\b\031\020\032R\026\020\034\032\0020\0338\006@\006X\016¢\006\006\n\004\b\034\020\035R\026\020\037\032\0020\0368\006@\006X\016¢\006\006\n\004\b\037\020 R \020#\032\b\022\004\022\0020\"0!8\007X\004¢\006\f\n\004\b#\020$\032\004\b%\020&R\026\020(\032\0020'8\006@\006X\016¢\006\006\n\004\b(\020)R\024\020+\032\0020*8\006X\004¢\006\006\n\004\b+\020,R\026\020\016\032\0020\r8\002@\002X\016¢\006\006\n\004\b\016\020-R\030\020.\032\004\030\0010\0028\002@\002X\016¢\006\006\n\004\b.\020/R\024\0201\032\002008\002X\004¢\006\006\n\004\b1\0202R\024\0203\032\0020\t8\006X\004¢\006\006\n\004\b3\0204"}, d2 = {"Leu/shoroa/bridge/BridgeClient;", "", "", "p0", "", "clearWingCache", "(Ljava/lang/String;)V", "getPlayerUuid", "()Ljava/lang/String;", "Leu/shoroa/bridge/SocketClient;", "getWebSocket", "()Leu/shoroa/bridge/SocketClient;", "log", "Leu/shoroa/bridge/feature/b/c;", "moduleManager", "()Leu/shoroa/bridge/feature/b/c;", "postInit", "()V", "", "preInit", "(Z)V", "setPlayerUuid", "start", "stop", "Leu/shoroa/bridge/b/e;", "vanillaRenderer", "()Leu/shoroa/bridge/b/e;", "Leu/shoroa/bridge/ui/a/b;", "Console", "Leu/shoroa/bridge/ui/a/b;", "Lorg/slf4j/Logger;", "LOG", "Lorg/slf4j/Logger;", "Lio/github/nevalackin/radbus/PubSub;", "Leu/shoroa/bridge/a/a;", "bus", "Lio/github/nevalackin/radbus/PubSub;", "getBus", "()Lio/github/nevalackin/radbus/PubSub;", "Leu/shoroa/bridge/ui/clickgui/b;", "clickgui", "Leu/shoroa/bridge/ui/clickgui/b;", "Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;", "cosmeticManager", "Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;", "Leu/shoroa/bridge/feature/b/c;", "playerUuid", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "socketClient", "Leu/shoroa/bridge/SocketClient;", "<init>", "a"})
/*     */ @SourceDebugExtension({"SMAP\nBridgeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeClient.kt\neu/shoroa/bridge/BridgeClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/*     */ public abstract class BridgeClient {
/*     */   @NotNull
/*     */   public static final a a = new a(null);
/*     */   @JvmField
/*     */   @NotNull
/*     */   public Logger LOG;
/*     */   @NotNull
/*     */   private final PubSub<a> bus;
/*     */   @JvmField
/*     */   @NotNull
/*     */   public b clickgui;
/*     */   @JvmField
/*     */   @NotNull
/*     */   public b Console;
/*     */   
/*  21 */   public BridgeClient() { Intrinsics.checkNotNullExpressionValue(LoggerFactory.getLogger("notro"), ""); this.LOG = LoggerFactory.getLogger("notro");
/*  22 */     Intrinsics.checkNotNullExpressionValue(PubSub.newInstance(this::bus$lambda$0), ""); this.bus = PubSub.newInstance(this::bus$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  28 */     this.clickgui = new b();
/*     */     
/*  30 */     this.Console = new b();
/*  31 */     this.moduleManager = c.INSTANCE;
/*     */     
/*  33 */     this.cosmeticManager = new CosmeticManager();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  39 */     this.socketClient = new SocketClient();
/*     */ 
/*     */     
/*  42 */     this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus((CoroutineContext)SupervisorKt.SupervisorJob$default(null, 1, null))); }
/*     */   @NotNull private c moduleManager;
/*     */   @JvmField @NotNull public final CosmeticManager cosmeticManager; @Nullable private String playerUuid; @JvmField @NotNull public final SocketClient socketClient; @NotNull private final CoroutineScope scope; @Nullable private static BridgeClient client; @NotNull @JvmName(name = "getBus") public final PubSub<a> getBus() { return this.bus; } private static final void bus$lambda$0(BridgeClient this$0, String x) { Intrinsics.checkNotNullParameter(this$0, "");
/*     */     if (x != null)
/*  46 */       this$0.log(x);  } public final void postInit() { this.bus.subscribe(this);
/*  47 */     log("Initializing UI...");
/*  48 */     d.a.d();
/*  49 */     log("Initializing Bridge-Side modules...");
/*  50 */     this.moduleManager.a((b)new d());
/*  51 */     this.moduleManager.a((b)new c());
/*  52 */     this.moduleManager.a((b)new e());
/*  53 */     this.moduleManager.a((b)new a());
/*  54 */     this.moduleManager.a((b)new f());
/*  55 */     this.moduleManager.a((b)new b());
/*  56 */     this.moduleManager.a((b)new g());
/*  57 */     this.moduleManager.c();
/*     */ 
/*     */ 
/*     */     
/*  61 */     if (getPlayerUuid() != null) { String it = getPlayerUuid();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 139 */       int $i$a$-let-BridgeClient$postInit$1 = 0;
/*     */       this.socketClient.startTutorial(it); }
/*     */     else
/*     */     { getPlayerUuid(); }
/*     */     
/*     */     Job job = BuildersKt.launch$default(this.scope, null, null, new c(this, null), 3, null);
/*     */     BuildersKt.runBlocking$default(null, new b(job, null), 1, null); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "BridgeClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "eu.shoroa.bridge.BridgeClient$postInit$job$1")
/*     */   @SourceDebugExtension({"SMAP\nBridgeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeClient.kt\neu/shoroa/bridge/BridgeClient$postInit$job$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1855#2,2:139\n*S KotlinDebug\n*F\n+ 1 BridgeClient.kt\neu/shoroa/bridge/BridgeClient$postInit$job$1\n*L\n72#1:139,2\n*E\n"})
/*     */   static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int a;
/*     */     
/*     */     c(BridgeClient $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: pop
/*     */       //   4: aload_0
/*     */       //   5: getfield a : I
/*     */       //   8: tableswitch default -> 243, 0 -> 28
/*     */       //   28: aload_1
/*     */       //   29: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   32: aload_0
/*     */       //   33: getfield b : Leu/shoroa/bridge/BridgeClient;
/*     */       //   36: invokevirtual getPlayerUuid : ()Ljava/lang/String;
/*     */       //   39: dup
/*     */       //   40: ifnull -> 237
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield b : Leu/shoroa/bridge/BridgeClient;
/*     */       //   48: astore_3
/*     */       //   49: aload_2
/*     */       //   50: astore #4
/*     */       //   52: iconst_0
/*     */       //   53: istore #5
/*     */       //   55: aload_3
/*     */       //   56: getfield socketClient : Leu/shoroa/bridge/SocketClient;
/*     */       //   59: aload #4
/*     */       //   61: invokevirtual getUser : (Ljava/lang/String;)Leu/shoroa/bridge/ServerUser;
/*     */       //   64: astore #6
/*     */       //   66: aload #6
/*     */       //   68: ifnull -> 233
/*     */       //   71: aload_3
/*     */       //   72: aload #6
/*     */       //   74: invokevirtual getMcName : ()Ljava/lang/String;
/*     */       //   77: aload #6
/*     */       //   79: invokevirtual getRank : ()Ljava/util/Map;
/*     */       //   82: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
/*     */       //   87: invokevirtual log : (Ljava/lang/String;)V
/*     */       //   90: aload #6
/*     */       //   92: invokevirtual getCosmetics : ()Ljava/util/List;
/*     */       //   95: astore #7
/*     */       //   97: aload #7
/*     */       //   99: ifnull -> 227
/*     */       //   102: aload #7
/*     */       //   104: checkcast java/lang/Iterable
/*     */       //   107: astore #8
/*     */       //   109: iconst_0
/*     */       //   110: istore #9
/*     */       //   112: aload #8
/*     */       //   114: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   119: astore #10
/*     */       //   121: aload #10
/*     */       //   123: invokeinterface hasNext : ()Z
/*     */       //   128: ifeq -> 165
/*     */       //   131: aload #10
/*     */       //   133: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   138: astore #11
/*     */       //   140: aload #11
/*     */       //   142: checkcast java/util/Map
/*     */       //   145: astore #12
/*     */       //   147: iconst_0
/*     */       //   148: istore #13
/*     */       //   150: aload_3
/*     */       //   151: aload #12
/*     */       //   153: <illegal opcode> makeConcatWithConstants : (Ljava/util/Map;)Ljava/lang/String;
/*     */       //   158: invokevirtual log : (Ljava/lang/String;)V
/*     */       //   161: nop
/*     */       //   162: goto -> 121
/*     */       //   165: nop
/*     */       //   166: new com/google/gson/Gson
/*     */       //   169: dup
/*     */       //   170: invokespecial <init> : ()V
/*     */       //   173: astore #8
/*     */       //   175: aload #8
/*     */       //   177: aload #7
/*     */       //   179: invokevirtual toJson : (Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   182: astore #9
/*     */       //   184: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
/*     */       //   187: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
/*     */       //   190: dup
/*     */       //   191: ifnull -> 200
/*     */       //   194: getfield cosmeticManager : Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */       //   197: goto -> 202
/*     */       //   200: pop
/*     */       //   201: aconst_null
/*     */       //   202: astore #10
/*     */       //   204: aload #10
/*     */       //   206: dup
/*     */       //   207: ifnull -> 223
/*     */       //   210: aload #9
/*     */       //   212: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   215: aload #9
/*     */       //   217: invokevirtual syncFromServer : (Ljava/lang/String;)V
/*     */       //   220: goto -> 233
/*     */       //   223: pop
/*     */       //   224: goto -> 233
/*     */       //   227: aload_3
/*     */       //   228: ldc 'User has no cosmetics list (null).'
/*     */       //   230: invokevirtual log : (Ljava/lang/String;)V
/*     */       //   233: nop
/*     */       //   234: goto -> 239
/*     */       //   237: pop
/*     */       //   238: nop
/*     */       //   239: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   242: areturn
/*     */       //   243: new java/lang/IllegalStateException
/*     */       //   246: dup
/*     */       //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   249: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   252: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #63	-> 3
/*     */       //   #64	-> 32
/*     */       //   #65	-> 55
/*     */       //   #66	-> 66
/*     */       //   #67	-> 71
/*     */       //   #70	-> 90
/*     */       //   #71	-> 97
/*     */       //   #72	-> 102
/*     */       //   #139	-> 112
/*     */       //   #73	-> 150
/*     */       //   #74	-> 161
/*     */       //   #139	-> 162
/*     */       //   #140	-> 165
/*     */       //   #76	-> 166
/*     */       //   #77	-> 175
/*     */       //   #79	-> 184
/*     */       //   #80	-> 204
/*     */       //   #82	-> 227
/*     */       //   #85	-> 233
/*     */       //   #64	-> 234
/*     */       //   #86	-> 239
/*     */       //   #63	-> 243
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   32	211	0	this	Leu/shoroa/bridge/BridgeClient$c;
/*     */       //   32	211	1	$result	Ljava/lang/Object;
/*     */       //   52	14	4	uuid	Ljava/lang/String;
/*     */       //   55	179	5	$i$a$-let-BridgeClient$postInit$job$1$1	I
/*     */       //   66	31	6	user	Leu/shoroa/bridge/ServerUser;
/*     */       //   97	87	7	cosmeticsList	Ljava/util/List;
/*     */       //   109	12	8	$this$forEach$iv	Ljava/lang/Iterable;
/*     */       //   112	54	9	$i$f$forEach	I
/*     */       //   140	22	11	element$iv	Ljava/lang/Object;
/*     */       //   147	15	12	cosmetic	Ljava/util/Map;
/*     */       //   150	12	13	$i$a$-forEach-BridgeClient$postInit$job$1$1$1	I
/*     */       //   175	9	8	gson	Lcom/google/gson/Gson;
/*     */       //   184	40	9	jsonArray	Ljava/lang/String;
/*     */       //   204	20	10	cm	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super c> $completion) {
/*     */       return (Continuation<Unit>)new c(this.b, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object a(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((c)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "BridgeClient.kt", l = {90}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "eu.shoroa.bridge.BridgeClient$postInit$2")
/*     */   static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int a;
/*     */     
/*     */     b(Job $job, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.a) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.a = 1;
/*     */           if (this.b.join((Continuation)this) == object)
/*     */             return object; 
/*     */           this.b.join((Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super b> $completion) {
/*     */       return (Continuation<Unit>)new b(this.b, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object a(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((b)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public void preInit(boolean lwjgl3) {
/*     */     a.a(lwjgl3);
/*     */     log("Adding Keybinds...");
/*     */     Intrinsics.checkNotNull(b.a.a());
/*     */     b.a.a().registerBind("notro.key.clickgui", "notro.category", a.a());
/*     */     Intrinsics.checkNotNull(b.a.a());
/*     */     b.a.a().registerBind("notro.key.freelook", "notro.category", a.c());
/*     */     Intrinsics.checkNotNull(b.a.a());
/*     */     b.a.a().registerBind("notro.key.Console", "notro.category", a.d());
/*     */   }
/*     */   
/*     */   public final void setPlayerUuid(String uuid) {
/*     */     Intrinsics.checkNotNullParameter(uuid, "");
/*     */     this.playerUuid = uuid;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getPlayerUuid() {
/*     */     return this.playerUuid;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final c moduleManager() {
/*     */     return this.moduleManager;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SocketClient getWebSocket() {
/*     */     return this.socketClient;
/*     */   }
/*     */   
/*     */   public abstract void start();
/*     */   
/*     */   public abstract void stop();
/*     */   
/*     */   @NotNull
/*     */   public abstract e vanillaRenderer();
/*     */   
/*     */   public abstract void clearWingCache(String paramString);
/*     */   
/*     */   public abstract void log(String paramString);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\013\020\fJ\021\020\003\032\004\030\0010\002H\007¢\006\004\b\003\020\004J\025\020\003\032\0020\0062\006\020\005\032\0020\002¢\006\004\b\003\020\007R$\020\b\032\004\030\0010\0028\005@\005X\016¢\006\022\n\004\b\b\020\t\032\004\b\n\020\004\"\004\b\n\020\007"}, d2 = {"Leu/shoroa/bridge/BridgeClient$a;", "", "Leu/shoroa/bridge/BridgeClient;", "b", "()Leu/shoroa/bridge/BridgeClient;", "p0", "", "(Leu/shoroa/bridge/BridgeClient;)V", "client", "Leu/shoroa/bridge/BridgeClient;", "a", "<init>", "()V"})
/*     */   public static final class a {
/*     */     private a() {}
/*     */     
/*     */     @Nullable
/*     */     @JvmName(name = "a")
/*     */     protected final BridgeClient a() {
/*     */       return BridgeClient.client;
/*     */     }
/*     */     
/*     */     @JvmName(name = "a")
/*     */     protected final void a(BridgeClient <set-?>) {
/*     */       BridgeClient.client = <set-?>;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final BridgeClient b() {
/*     */       return a();
/*     */     }
/*     */     
/*     */     public final void b(BridgeClient bc) {
/*     */       Intrinsics.checkNotNullParameter(bc, "");
/*     */       a(bc);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\BridgeClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */