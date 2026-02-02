/*     */ package eu.shoroa.notro.client.feature.cosmetic;
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.feature.cosmetic.CosmeticManager;
/*     */ import eu.shoroa.bridge.feature.cosmetic.c;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_1653;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001:\001\025B\t\b\002¢\006\004\b\002\020\003J#\020\b\032\004\030\0010\0062\006\020\005\032\0020\0042\n\b\002\020\007\032\004\030\0010\006¢\006\004\b\b\020\tJ#\020\n\032\004\030\0010\0062\006\020\005\032\0020\0042\n\b\002\020\007\032\004\030\0010\006¢\006\004\b\n\020\tJ\r\020\f\032\0020\013¢\006\004\b\f\020\003J\r\020\r\032\0020\013¢\006\004\b\r\020\003R0\020\021\032\036\022\004\022\0020\017\022\004\022\0020\0010\016j\016\022\004\022\0020\017\022\004\022\0020\001`\0208\002X\004¢\006\006\n\004\b\021\020\022R0\020\024\032\036\022\004\022\0020\023\022\004\022\0020\0060\016j\016\022\004\022\0020\023\022\004\022\0020\006`\0208\002X\004¢\006\006\n\004\b\024\020\022¨\006\026"}, d2 = {"Leu/shoroa/notro/client/feature/cosmetic/ClientCapeHelper;", "", "<init>", "()V", "", "playerName", "Lnet/minecraft/class_1653;", "fallback", "getCurrentCapeLocation", "(Ljava/lang/String;Lnet/minecraft/class_1653;)Lnet/minecraft/class_1653;", "getCurrentWingLocation", "", "registerResources", "tick", "Ljava/util/HashMap;", "Leu/shoroa/bridge/feature/cosmetic/Cape;", "Lkotlin/collections/HashMap;", "capeMap", "Ljava/util/HashMap;", "Leu/shoroa/bridge/feature/cosmetic/Wings;", "wingMap", "AnimatedCape", "NotroClient"})
/*     */ @SourceDebugExtension({"SMAP\nClientCapeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientCapeHelper.kt\neu/shoroa/notro/client/feature/cosmetic/ClientCapeHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n800#2,11:165\n800#2,11:177\n1855#2,2:188\n1#3:176\n*S KotlinDebug\n*F\n+ 1 ClientCapeHelper.kt\neu/shoroa/notro/client/feature/cosmetic/ClientCapeHelper\n*L\n67#1:165,11\n94#1:177,11\n104#1:188,2\n*E\n"})
/*     */ public final class b {
/*     */   @NotNull
/*  17 */   public static final b a = new b(); @NotNull private static final HashMap<eu.shoroa.bridge.feature.cosmetic.a, Object> b = new HashMap<>(); @NotNull
/*  18 */   private static final HashMap<c, class_1653> c = new HashMap<>();
/*     */   
/*     */   public final void a() {
/*     */     CosmeticManager cm;
/*  22 */     System.out.println("[ClientCapeHelper] 🔄 Registering cosmetics...");
/*  23 */     b.clear();
/*  24 */     c.clear();
/*     */     
/*  26 */     if (BridgeClient.a.b() == null || (BridgeClient.a.b()).cosmeticManager == null) {
/*     */       return;
/*     */     }
/*  29 */     for (eu.shoroa.bridge.feature.cosmetic.b cosmetic : cm.byType("cape")) {
/*  30 */       Object object; if (((cosmetic instanceof eu.shoroa.bridge.feature.cosmetic.a) ? cosmetic : null) == null) { (cosmetic instanceof eu.shoroa.bridge.feature.cosmetic.a) ? cosmetic : null; continue; }
/*  31 */        String basePath = "cosmetics/capes/" + object.e();
/*     */       
/*  33 */       if (object.g()) {
/*  34 */         int frameCount = 235;
/*  35 */         int frameDelay = 2;
/*  36 */         b.put(object, new a(basePath, object.e(), frameCount, frameDelay));
/*  37 */         if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("[ClientCapeHelper] ✅ Animated cape '" + object.e() + "' registered (" + frameCount + " frames)"); continue; }  BridgeClient.a.b(); continue;
/*     */       } 
/*  39 */       String path = basePath + ".png";
/*  40 */       b.put(object, new class_1653("notro", path));
/*  41 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("[ClientCapeHelper] ✅ Static cape '" + object.e() + "' registered at " + path); continue; }  BridgeClient.a.b();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  46 */     for (eu.shoroa.bridge.feature.cosmetic.b cosmetic : cm.byType("wings")) {
/*  47 */       Object object; if (((cosmetic instanceof c) ? cosmetic : null) == null) { (cosmetic instanceof c) ? cosmetic : null; continue; }
/*  48 */        String path = "cosmetics/wings/" + object.e() + ".png";
/*  49 */       c.put(object, new class_1653("notro", path));
/*  50 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("[ClientCapeHelper] ✅ Wings '" + object.e() + "' registered at " + path); continue; }  BridgeClient.a.b();
/*     */     } 
/*     */   }
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
/*     */   @Nullable
/*     */   public final class_1653 a(String playerName, class_1653 fallback) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc ''
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokestatic getCachedUser : (Ljava/lang/String;)Leu/shoroa/bridge/ServerUser;
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 17
/*     */     //   14: pop
/*     */     //   15: aload_2
/*     */     //   16: areturn
/*     */     //   17: astore_3
/*     */     //   18: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
/*     */     //   21: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
/*     */     //   24: dup
/*     */     //   25: ifnull -> 35
/*     */     //   28: getfield cosmeticManager : Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   31: dup
/*     */     //   32: ifnonnull -> 38
/*     */     //   35: pop
/*     */     //   36: aload_2
/*     */     //   37: areturn
/*     */     //   38: astore #4
/*     */     //   40: aload_3
/*     */     //   41: invokevirtual getCosmetics : ()Ljava/util/List;
/*     */     //   44: checkcast java/lang/Iterable
/*     */     //   47: astore #8
/*     */     //   49: aload #8
/*     */     //   51: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   56: astore #9
/*     */     //   58: aload #9
/*     */     //   60: invokeinterface hasNext : ()Z
/*     */     //   65: ifeq -> 188
/*     */     //   68: aload #9
/*     */     //   70: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   75: astore #10
/*     */     //   77: aload #10
/*     */     //   79: checkcast java/util/Map
/*     */     //   82: astore #11
/*     */     //   84: iconst_0
/*     */     //   85: istore #12
/*     */     //   87: aload #11
/*     */     //   89: ldc 'type'
/*     */     //   91: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   96: astore #13
/*     */     //   98: aload #13
/*     */     //   100: instanceof java/lang/String
/*     */     //   103: ifeq -> 114
/*     */     //   106: aload #13
/*     */     //   108: checkcast java/lang/String
/*     */     //   111: goto -> 115
/*     */     //   114: aconst_null
/*     */     //   115: astore #14
/*     */     //   117: aload #11
/*     */     //   119: ldc 'selected'
/*     */     //   121: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   126: astore #15
/*     */     //   128: aload #15
/*     */     //   130: instanceof java/lang/Boolean
/*     */     //   133: ifeq -> 144
/*     */     //   136: aload #15
/*     */     //   138: checkcast java/lang/Boolean
/*     */     //   141: goto -> 145
/*     */     //   144: aconst_null
/*     */     //   145: dup
/*     */     //   146: ifnull -> 155
/*     */     //   149: invokevirtual booleanValue : ()Z
/*     */     //   152: goto -> 157
/*     */     //   155: pop
/*     */     //   156: iconst_0
/*     */     //   157: istore #13
/*     */     //   159: aload #14
/*     */     //   161: ldc 'cape'
/*     */     //   163: iconst_1
/*     */     //   164: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
/*     */     //   167: ifeq -> 179
/*     */     //   170: iload #13
/*     */     //   172: ifeq -> 179
/*     */     //   175: iconst_1
/*     */     //   176: goto -> 180
/*     */     //   179: iconst_0
/*     */     //   180: ifeq -> 58
/*     */     //   183: aload #10
/*     */     //   185: goto -> 189
/*     */     //   188: aconst_null
/*     */     //   189: checkcast java/util/Map
/*     */     //   192: dup
/*     */     //   193: ifnonnull -> 199
/*     */     //   196: pop
/*     */     //   197: aload_2
/*     */     //   198: areturn
/*     */     //   199: astore #5
/*     */     //   201: aload #4
/*     */     //   203: ldc 'cape'
/*     */     //   205: invokevirtual byType : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   208: checkcast java/lang/Iterable
/*     */     //   211: astore #8
/*     */     //   213: nop
/*     */     //   214: iconst_0
/*     */     //   215: istore #9
/*     */     //   217: aload #8
/*     */     //   219: astore #10
/*     */     //   221: new java/util/ArrayList
/*     */     //   224: dup
/*     */     //   225: invokespecial <init> : ()V
/*     */     //   228: checkcast java/util/Collection
/*     */     //   231: astore #11
/*     */     //   233: iconst_0
/*     */     //   234: istore #12
/*     */     //   236: aload #10
/*     */     //   238: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   243: astore #13
/*     */     //   245: aload #13
/*     */     //   247: invokeinterface hasNext : ()Z
/*     */     //   252: ifeq -> 285
/*     */     //   255: aload #13
/*     */     //   257: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   262: astore #14
/*     */     //   264: aload #14
/*     */     //   266: instanceof eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   269: ifeq -> 245
/*     */     //   272: aload #11
/*     */     //   274: aload #14
/*     */     //   276: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   281: pop
/*     */     //   282: goto -> 245
/*     */     //   285: aload #11
/*     */     //   287: checkcast java/util/List
/*     */     //   290: nop
/*     */     //   291: checkcast java/lang/Iterable
/*     */     //   294: astore #9
/*     */     //   296: aload #9
/*     */     //   298: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   303: astore #10
/*     */     //   305: aload #10
/*     */     //   307: invokeinterface hasNext : ()Z
/*     */     //   312: ifeq -> 425
/*     */     //   315: aload #10
/*     */     //   317: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   322: astore #11
/*     */     //   324: aload #11
/*     */     //   326: checkcast eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   329: astore #12
/*     */     //   331: iconst_0
/*     */     //   332: istore #13
/*     */     //   334: aload #12
/*     */     //   336: invokevirtual c : ()Ljava/lang/String;
/*     */     //   339: aload #5
/*     */     //   341: ldc 'id'
/*     */     //   343: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   348: astore #14
/*     */     //   350: aload #14
/*     */     //   352: instanceof java/lang/String
/*     */     //   355: ifeq -> 366
/*     */     //   358: aload #14
/*     */     //   360: checkcast java/lang/String
/*     */     //   363: goto -> 367
/*     */     //   366: aconst_null
/*     */     //   367: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   370: ifne -> 412
/*     */     //   373: aload #12
/*     */     //   375: invokevirtual e : ()Ljava/lang/String;
/*     */     //   378: aload #5
/*     */     //   380: ldc 'resourceLocation'
/*     */     //   382: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   387: astore #14
/*     */     //   389: aload #14
/*     */     //   391: instanceof java/lang/String
/*     */     //   394: ifeq -> 405
/*     */     //   397: aload #14
/*     */     //   399: checkcast java/lang/String
/*     */     //   402: goto -> 406
/*     */     //   405: aconst_null
/*     */     //   406: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   409: ifeq -> 416
/*     */     //   412: iconst_1
/*     */     //   413: goto -> 417
/*     */     //   416: iconst_0
/*     */     //   417: ifeq -> 305
/*     */     //   420: aload #11
/*     */     //   422: goto -> 426
/*     */     //   425: aconst_null
/*     */     //   426: checkcast eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   429: dup
/*     */     //   430: ifnonnull -> 436
/*     */     //   433: pop
/*     */     //   434: aload_2
/*     */     //   435: areturn
/*     */     //   436: astore #6
/*     */     //   438: getstatic eu/shoroa/notro/client/feature/cosmetic/b.b : Ljava/util/HashMap;
/*     */     //   441: aload #6
/*     */     //   443: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   446: dup
/*     */     //   447: ifnonnull -> 453
/*     */     //   450: pop
/*     */     //   451: aload_2
/*     */     //   452: areturn
/*     */     //   453: astore #7
/*     */     //   455: aload #7
/*     */     //   457: astore #8
/*     */     //   459: aload #8
/*     */     //   461: instanceof eu/shoroa/notro/client/feature/cosmetic/b$a
/*     */     //   464: ifeq -> 478
/*     */     //   467: aload #7
/*     */     //   469: checkcast eu/shoroa/notro/client/feature/cosmetic/b$a
/*     */     //   472: invokevirtual a : ()Lnet/minecraft/class_1653;
/*     */     //   475: goto -> 495
/*     */     //   478: aload #8
/*     */     //   480: instanceof net/minecraft/class_1653
/*     */     //   483: ifeq -> 494
/*     */     //   486: aload #7
/*     */     //   488: checkcast net/minecraft/class_1653
/*     */     //   491: goto -> 495
/*     */     //   494: aload_2
/*     */     //   495: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 6
/*     */     //   #56	-> 18
/*     */     //   #59	-> 40
/*     */     //   #60	-> 47
/*     */     //   #61	-> 87
/*     */     //   #62	-> 117
/*     */     //   #63	-> 159
/*     */     //   #60	-> 180
/*     */     //   #59	-> 192
/*     */     //   #64	-> 197
/*     */     //   #59	-> 199
/*     */     //   #66	-> 201
/*     */     //   #67	-> 213
/*     */     //   #165	-> 217
/*     */     //   #174	-> 236
/*     */     //   #175	-> 285
/*     */     //   #165	-> 290
/*     */     //   #67	-> 291
/*     */     //   #68	-> 294
/*     */     //   #176	-> 331
/*     */     //   #68	-> 334
/*     */     //   #66	-> 429
/*     */     //   #69	-> 434
/*     */     //   #66	-> 436
/*     */     //   #71	-> 438
/*     */     //   #73	-> 455
/*     */     //   #74	-> 459
/*     */     //   #75	-> 478
/*     */     //   #76	-> 494
/*     */     //   #73	-> 495
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	496	0	this	Leu/shoroa/notro/client/feature/cosmetic/b;
/*     */     //   0	496	1	playerName	Ljava/lang/String;
/*     */     //   0	496	2	fallback	Lnet/minecraft/class_1653;
/*     */     //   18	478	3	cachedUser	Leu/shoroa/bridge/ServerUser;
/*     */     //   40	456	4	cm	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   84	96	11	it	Ljava/util/Map;
/*     */     //   87	93	12	$i$a$-find-ClientCapeHelper$getCurrentCapeLocation$capeData$1	I
/*     */     //   117	63	14	type	Ljava/lang/String;
/*     */     //   159	21	13	selected	Z
/*     */     //   201	295	5	capeData	Ljava/util/Map;
/*     */     //   214	77	8	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   217	74	9	$i$f$filterIsInstance	I
/*     */     //   233	54	10	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   233	54	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   236	51	12	$i$f$filterIsInstanceTo	I
/*     */     //   264	18	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   331	86	12	it	Leu/shoroa/bridge/feature/cosmetic/a;
/*     */     //   334	83	13	$i$a$-find-ClientCapeHelper$getCurrentCapeLocation$cape$1	I
/*     */     //   438	58	6	cape	Leu/shoroa/bridge/feature/cosmetic/a;
/*     */     //   455	41	7	entry	Ljava/lang/Object;
/*     */   }
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
/*     */   @Nullable
/*     */   public final class_1653 b(String playerName, class_1653 fallback) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc ''
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokestatic getCachedUser : (Ljava/lang/String;)Leu/shoroa/bridge/ServerUser;
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 17
/*     */     //   14: pop
/*     */     //   15: aload_2
/*     */     //   16: areturn
/*     */     //   17: astore_3
/*     */     //   18: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
/*     */     //   21: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
/*     */     //   24: dup
/*     */     //   25: ifnull -> 35
/*     */     //   28: getfield cosmeticManager : Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   31: dup
/*     */     //   32: ifnonnull -> 38
/*     */     //   35: pop
/*     */     //   36: aload_2
/*     */     //   37: areturn
/*     */     //   38: astore #4
/*     */     //   40: aload_3
/*     */     //   41: invokevirtual getCosmetics : ()Ljava/util/List;
/*     */     //   44: dup
/*     */     //   45: ifnonnull -> 51
/*     */     //   48: pop
/*     */     //   49: aload_2
/*     */     //   50: areturn
/*     */     //   51: astore #5
/*     */     //   53: aload #5
/*     */     //   55: checkcast java/lang/Iterable
/*     */     //   58: astore #8
/*     */     //   60: aload #8
/*     */     //   62: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   67: astore #9
/*     */     //   69: aload #9
/*     */     //   71: invokeinterface hasNext : ()Z
/*     */     //   76: ifeq -> 199
/*     */     //   79: aload #9
/*     */     //   81: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   86: astore #10
/*     */     //   88: aload #10
/*     */     //   90: checkcast java/util/Map
/*     */     //   93: astore #11
/*     */     //   95: iconst_0
/*     */     //   96: istore #12
/*     */     //   98: aload #11
/*     */     //   100: ldc 'type'
/*     */     //   102: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   107: astore #13
/*     */     //   109: aload #13
/*     */     //   111: instanceof java/lang/String
/*     */     //   114: ifeq -> 125
/*     */     //   117: aload #13
/*     */     //   119: checkcast java/lang/String
/*     */     //   122: goto -> 126
/*     */     //   125: aconst_null
/*     */     //   126: astore #14
/*     */     //   128: aload #11
/*     */     //   130: ldc 'selected'
/*     */     //   132: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   137: astore #15
/*     */     //   139: aload #15
/*     */     //   141: instanceof java/lang/Boolean
/*     */     //   144: ifeq -> 155
/*     */     //   147: aload #15
/*     */     //   149: checkcast java/lang/Boolean
/*     */     //   152: goto -> 156
/*     */     //   155: aconst_null
/*     */     //   156: dup
/*     */     //   157: ifnull -> 166
/*     */     //   160: invokevirtual booleanValue : ()Z
/*     */     //   163: goto -> 168
/*     */     //   166: pop
/*     */     //   167: iconst_0
/*     */     //   168: istore #13
/*     */     //   170: aload #14
/*     */     //   172: ldc 'wings'
/*     */     //   174: iconst_1
/*     */     //   175: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
/*     */     //   178: ifeq -> 190
/*     */     //   181: iload #13
/*     */     //   183: ifeq -> 190
/*     */     //   186: iconst_1
/*     */     //   187: goto -> 191
/*     */     //   190: iconst_0
/*     */     //   191: ifeq -> 69
/*     */     //   194: aload #10
/*     */     //   196: goto -> 200
/*     */     //   199: aconst_null
/*     */     //   200: checkcast java/util/Map
/*     */     //   203: dup
/*     */     //   204: ifnonnull -> 210
/*     */     //   207: pop
/*     */     //   208: aload_2
/*     */     //   209: areturn
/*     */     //   210: astore #6
/*     */     //   212: aload #4
/*     */     //   214: ldc 'wings'
/*     */     //   216: invokevirtual byType : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   219: checkcast java/lang/Iterable
/*     */     //   222: astore #8
/*     */     //   224: nop
/*     */     //   225: iconst_0
/*     */     //   226: istore #9
/*     */     //   228: aload #8
/*     */     //   230: astore #10
/*     */     //   232: new java/util/ArrayList
/*     */     //   235: dup
/*     */     //   236: invokespecial <init> : ()V
/*     */     //   239: checkcast java/util/Collection
/*     */     //   242: astore #11
/*     */     //   244: iconst_0
/*     */     //   245: istore #12
/*     */     //   247: aload #10
/*     */     //   249: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   254: astore #13
/*     */     //   256: aload #13
/*     */     //   258: invokeinterface hasNext : ()Z
/*     */     //   263: ifeq -> 296
/*     */     //   266: aload #13
/*     */     //   268: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   273: astore #14
/*     */     //   275: aload #14
/*     */     //   277: instanceof eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   280: ifeq -> 256
/*     */     //   283: aload #11
/*     */     //   285: aload #14
/*     */     //   287: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   292: pop
/*     */     //   293: goto -> 256
/*     */     //   296: aload #11
/*     */     //   298: checkcast java/util/List
/*     */     //   301: nop
/*     */     //   302: checkcast java/lang/Iterable
/*     */     //   305: astore #9
/*     */     //   307: aload #9
/*     */     //   309: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   314: astore #10
/*     */     //   316: aload #10
/*     */     //   318: invokeinterface hasNext : ()Z
/*     */     //   323: ifeq -> 436
/*     */     //   326: aload #10
/*     */     //   328: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   333: astore #11
/*     */     //   335: aload #11
/*     */     //   337: checkcast eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   340: astore #12
/*     */     //   342: iconst_0
/*     */     //   343: istore #13
/*     */     //   345: aload #12
/*     */     //   347: invokevirtual c : ()Ljava/lang/String;
/*     */     //   350: aload #6
/*     */     //   352: ldc 'id'
/*     */     //   354: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   359: astore #14
/*     */     //   361: aload #14
/*     */     //   363: instanceof java/lang/String
/*     */     //   366: ifeq -> 377
/*     */     //   369: aload #14
/*     */     //   371: checkcast java/lang/String
/*     */     //   374: goto -> 378
/*     */     //   377: aconst_null
/*     */     //   378: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   381: ifne -> 423
/*     */     //   384: aload #12
/*     */     //   386: invokevirtual e : ()Ljava/lang/String;
/*     */     //   389: aload #6
/*     */     //   391: ldc 'resourceLocation'
/*     */     //   393: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   398: astore #14
/*     */     //   400: aload #14
/*     */     //   402: instanceof java/lang/String
/*     */     //   405: ifeq -> 416
/*     */     //   408: aload #14
/*     */     //   410: checkcast java/lang/String
/*     */     //   413: goto -> 417
/*     */     //   416: aconst_null
/*     */     //   417: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   420: ifeq -> 427
/*     */     //   423: iconst_1
/*     */     //   424: goto -> 428
/*     */     //   427: iconst_0
/*     */     //   428: ifeq -> 316
/*     */     //   431: aload #11
/*     */     //   433: goto -> 437
/*     */     //   436: aconst_null
/*     */     //   437: checkcast eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   440: dup
/*     */     //   441: ifnonnull -> 447
/*     */     //   444: pop
/*     */     //   445: aload_2
/*     */     //   446: areturn
/*     */     //   447: astore #7
/*     */     //   449: getstatic eu/shoroa/notro/client/feature/cosmetic/b.c : Ljava/util/HashMap;
/*     */     //   452: aload #7
/*     */     //   454: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   457: checkcast net/minecraft/class_1653
/*     */     //   460: dup
/*     */     //   461: ifnonnull -> 466
/*     */     //   464: pop
/*     */     //   465: aload_2
/*     */     //   466: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 6
/*     */     //   #82	-> 18
/*     */     //   #84	-> 40
/*     */     //   #87	-> 53
/*     */     //   #88	-> 98
/*     */     //   #89	-> 128
/*     */     //   #90	-> 170
/*     */     //   #87	-> 191
/*     */     //   #91	-> 208
/*     */     //   #87	-> 210
/*     */     //   #93	-> 212
/*     */     //   #94	-> 224
/*     */     //   #177	-> 228
/*     */     //   #186	-> 247
/*     */     //   #187	-> 296
/*     */     //   #177	-> 301
/*     */     //   #94	-> 302
/*     */     //   #95	-> 305
/*     */     //   #176	-> 342
/*     */     //   #95	-> 345
/*     */     //   #93	-> 440
/*     */     //   #96	-> 445
/*     */     //   #93	-> 447
/*     */     //   #98	-> 449
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	467	0	this	Leu/shoroa/notro/client/feature/cosmetic/b;
/*     */     //   0	467	1	playerName	Ljava/lang/String;
/*     */     //   0	467	2	fallback	Lnet/minecraft/class_1653;
/*     */     //   18	449	3	cachedUser	Leu/shoroa/bridge/ServerUser;
/*     */     //   40	427	4	cm	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   53	414	5	cosmetics	Ljava/util/List;
/*     */     //   95	96	11	it	Ljava/util/Map;
/*     */     //   98	93	12	$i$a$-find-ClientCapeHelper$getCurrentWingLocation$wingData$1	I
/*     */     //   128	63	14	type	Ljava/lang/String;
/*     */     //   170	21	13	selected	Z
/*     */     //   212	255	6	wingData	Ljava/util/Map;
/*     */     //   225	77	8	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   228	74	9	$i$f$filterIsInstance	I
/*     */     //   244	54	10	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   244	54	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   247	51	12	$i$f$filterIsInstanceTo	I
/*     */     //   275	18	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   342	86	12	it	Leu/shoroa/bridge/feature/cosmetic/c;
/*     */     //   345	83	13	$i$a$-find-ClientCapeHelper$getCurrentWingLocation$wings$1	I
/*     */     //   449	18	7	wings	Leu/shoroa/bridge/feature/cosmetic/c;
/*     */   }
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
/*     */   public final void b() {
/* 104 */     Intrinsics.checkNotNullExpressionValue(b.values(), ""); Iterable $this$forEach$iv = b.values(); int $i$f$forEach = 0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-ClientCapeHelper$tick$1 = 0;
/*     */       if (it instanceof a)
/*     */         ((a)it).b();  }
/*     */   
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\b\n\002\020\021\n\002\b\003\030\0002\0020\001B'\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\004\b\b\020\tJ\r\020\013\032\0020\n¢\006\004\b\013\020\fJ\017\020\016\032\0020\rH\002¢\006\004\b\016\020\017J\r\020\020\032\0020\r¢\006\004\b\020\020\017R\024\020\003\032\0020\0028\002X\004¢\006\006\n\004\b\003\020\021R\026\020\022\032\0020\0058\002@\002X\016¢\006\006\n\004\b\022\020\023R\026\020\024\032\0020\0058\002@\002X\016¢\006\006\n\004\b\024\020\023R\024\020\006\032\0020\0058\002X\004¢\006\006\n\004\b\006\020\023R\024\020\007\032\0020\0058\002X\004¢\006\006\n\004\b\007\020\023R\026\020\025\032\0020\0058\002@\002X\016¢\006\006\n\004\b\025\020\023R\024\020\004\032\0020\0028\002X\004¢\006\006\n\004\b\004\020\021R\034\020\027\032\n\022\006\022\004\030\0010\n0\0268\002X\004¢\006\006\n\004\b\027\020\030¨\006\031"}, d2 = {"Leu/shoroa/notro/client/feature/cosmetic/ClientCapeHelper$AnimatedCape;", "", "", "basePath", "textureName", "", "frameCount", "frameDelay", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "Lnet/minecraft/class_1653;", "getCurrentFrame", "()Lnet/minecraft/class_1653;", "", "preloadNextFrame", "()V", "update", "Ljava/lang/String;", "currentFrame", "I", "currentTick", "nextFrameToLoad", "", "textures", "[Lnet/minecraft/class_1653;", "NotroClient"})
/*     */   public static final class a {
/*     */     @NotNull
/*     */     private final String a;
/*     */     @NotNull
/*     */     private final String b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private int e;
/*     */     private int f;
/*     */     private int g;
/*     */     @NotNull
/*     */     private final class_1653[] h;
/*     */     
/*     */     public a(String basePath, String textureName, int frameCount, int frameDelay) {
/*     */       this.a = basePath;
/*     */       this.b = textureName;
/*     */       this.c = frameCount;
/*     */       this.d = frameDelay;
/*     */       this.g = 1;
/*     */       this.h = new class_1653[this.c];
/*     */       this.h[0] = new class_1653("notro", this.a + "/" + this.a + "0.png");
/*     */       if (BridgeClient.a.b() != null) {
/*     */         BridgeClient.a.b().log("[AnimatedCape] Loaded first frame -> " + this.a + "/" + this.b + "0.png");
/*     */       } else {
/*     */         BridgeClient.a.b();
/*     */       } 
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final class_1653 a() {
/*     */       if (this.h[this.f] == null) {
/*     */         this.h[this.f] = new class_1653("notro", this.a + "/" + this.a + this.b + ".png");
/*     */         if (BridgeClient.a.b() != null) {
/*     */           BridgeClient.a.b().log("[AnimatedCape] Lazy loaded frame " + this.f);
/*     */         } else {
/*     */           BridgeClient.a.b();
/*     */         } 
/*     */       } 
/*     */       Intrinsics.checkNotNull(this.h[this.f]);
/*     */       return this.h[this.f];
/*     */     }
/*     */     
/*     */     public final void b() {
/*     */       int i = this.e;
/*     */       this.e = i + 1;
/*     */       if (this.e >= this.d) {
/*     */         this.e = 0;
/*     */         this.f = (this.f + 1) % this.c;
/*     */       } 
/*     */       c();
/*     */     }
/*     */     
/*     */     private final void c() {
/*     */       if (this.g >= this.c)
/*     */         return; 
/*     */       if (this.h[this.g] == null) {
/*     */         this.h[this.g] = new class_1653("notro", this.a + "/" + this.a + this.b + ".png");
/*     */         if (BridgeClient.a.b() != null) {
/*     */           BridgeClient.a.b().log("[AnimatedCape] Preloaded frame " + this.g);
/*     */         } else {
/*     */           BridgeClient.a.b();
/*     */         } 
/*     */       } 
/*     */       int i = this.g;
/*     */       this.g = i + 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\cosmetic\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */