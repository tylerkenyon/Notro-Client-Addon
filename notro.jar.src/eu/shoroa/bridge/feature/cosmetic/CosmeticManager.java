/*     */ package eu.shoroa.bridge.feature.cosmetic;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\020\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020!\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\t\b\007\030\0002\0020\001:\001:B\007¢\006\004\b8\0209J\025\020\004\032\b\022\004\022\0020\0030\002H\007¢\006\004\b\004\020\005J\035\020\b\032\b\022\004\022\0020\0030\0022\006\020\007\032\0020\006H\007¢\006\004\b\b\020\tJ\033\020\n\032\004\030\0010\0032\b\020\007\032\004\030\0010\006H\007¢\006\004\b\n\020\013J\031\020\f\032\004\030\0010\0032\006\020\007\032\0020\006H\007¢\006\004\b\f\020\013J\025\020\016\032\0020\r2\006\020\007\032\0020\003¢\006\004\b\016\020\017J\025\020\021\032\0020\0202\006\020\007\032\0020\003¢\006\004\b\021\020\022J\027\020\023\032\0020\0202\b\020\007\032\004\030\0010\006¢\006\004\b\023\020\024J\027\020\025\032\0020\0202\b\020\007\032\004\030\0010\006¢\006\004\b\025\020\024J\025\020\027\032\0020\0202\006\020\007\032\0020\026¢\006\004\b\027\020\030J\025\020\031\032\0020\0202\006\020\007\032\0020\006¢\006\004\b\031\020\024J\023\020\032\032\0020\020*\0020\003H\002¢\006\004\b\032\020\022R\032\020\034\032\b\022\004\022\0020\0030\0338\002X\004¢\006\006\n\004\b\034\020\035R$\020\037\032\004\030\0010\0368\007@\007X\016¢\006\022\n\004\b\037\020 \032\004\b!\020\"\"\004\b#\020$R$\020&\032\004\030\0010%8\007@\007X\016¢\006\022\n\004\b&\020'\032\004\b(\020)\"\004\b*\020+R\024\020-\032\0020,8\002X\004¢\006\006\n\004\b-\020.R\030\020/\032\004\030\0010\0268\006@\006X\016¢\006\006\n\004\b/\0200R*\0202\032\n\022\004\022\0020\020\030\001018\007@\007X\016¢\006\022\n\004\b2\0203\032\004\b4\0205\"\004\b6\0207"}, d2 = {"Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;", "", "", "Leu/shoroa/bridge/feature/cosmetic/b;", "all", "()Ljava/util/List;", "", "p0", "byType", "(Ljava/lang/String;)Ljava/util/List;", "getCosmeticById", "(Ljava/lang/String;)Leu/shoroa/bridge/feature/cosmetic/b;", "getCurrentCosmetic", "", "isEquipped", "(Leu/shoroa/bridge/feature/cosmetic/b;)Z", "", "selectCosmetic", "(Leu/shoroa/bridge/feature/cosmetic/b;)V", "setCurrentCapeById", "(Ljava/lang/String;)V", "setCurrentWingsById", "Ljava/lang/Runnable;", "setOnCosmeticsUpdated", "(Ljava/lang/Runnable;)V", "syncFromServer", "toggleIfActive", "", "cosmetics", "Ljava/util/List;", "Leu/shoroa/bridge/feature/cosmetic/a;", "currentCape", "Leu/shoroa/bridge/feature/cosmetic/a;", "getCurrentCape", "()Leu/shoroa/bridge/feature/cosmetic/a;", "setCurrentCape", "(Leu/shoroa/bridge/feature/cosmetic/a;)V", "Leu/shoroa/bridge/feature/cosmetic/c;", "currentWings", "Leu/shoroa/bridge/feature/cosmetic/c;", "getCurrentWings", "()Leu/shoroa/bridge/feature/cosmetic/c;", "setCurrentWings", "(Leu/shoroa/bridge/feature/cosmetic/c;)V", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "onCosmeticsUpdated", "Ljava/lang/Runnable;", "Lkotlin/Function0;", "onSelectionUpdated", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdated", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdated", "(Lkotlin/jvm/functions/Function0;)V", "<init>", "()V", "a"})
/*     */ @SourceDebugExtension({"SMAP\nCosmeticManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CosmeticManager.kt\neu/shoroa/bridge/feature/cosmetic/CosmeticManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1855#2,2:129\n800#2,11:131\n288#2,2:142\n800#2,11:144\n288#2,2:155\n288#2,2:157\n766#2:159\n857#2,2:160\n*S KotlinDebug\n*F\n+ 1 CosmeticManager.kt\neu/shoroa/bridge/feature/cosmetic/CosmeticManager\n*L\n36#1:129,2\n93#1:131,11\n93#1:142,2\n98#1:144,11\n98#1:155,2\n108#1:157,2\n113#1:159\n113#1:160,2\n*E\n"})
/*     */ public final class CosmeticManager {
/*     */   @NotNull
/*  12 */   private final Gson gson = new Gson(); @NotNull
/*  13 */   private final List<b> cosmetics = new ArrayList<>(); @Nullable private a currentCape; @Nullable private c currentWings; @Nullable private Function0<Unit> onSelectionUpdated; @JvmField @Nullable public Runnable onCosmeticsUpdated; @Nullable
/*     */   @JvmName(name = "getCurrentCape")
/*  15 */   public final a getCurrentCape() { return this.currentCape; } @JvmName(name = "setCurrentCape") public final void setCurrentCape(a <set-?>) { this.currentCape = <set-?>; } @Nullable @JvmName(name = "getCurrentWings")
/*  16 */   public final c getCurrentWings() { return this.currentWings; } @JvmName(name = "setCurrentWings") public final void setCurrentWings(c <set-?>) { this.currentWings = <set-?>; } @Nullable
/*     */   @JvmName(name = "getOnSelectionUpdated")
/*  18 */   public final Function0<Unit> getOnSelectionUpdated() { return this.onSelectionUpdated; } @JvmName(name = "setOnSelectionUpdated") public final void setOnSelectionUpdated(Function0<Unit> <set-?>) { this.onSelectionUpdated = <set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setOnCosmeticsUpdated(Runnable listener) {
/*  24 */     Intrinsics.checkNotNullParameter(listener, ""); this.onCosmeticsUpdated = listener;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void syncFromServer(String jsonArray) {
/*  31 */     Intrinsics.checkNotNullParameter(jsonArray, ""); this.cosmetics.clear();
/*     */     try {
/*  33 */       Type type = (new b()).getType();
/*  34 */       Intrinsics.checkNotNullExpressionValue(this.gson.fromJson(jsonArray, type), ""); List list = (List)this.gson.fromJson(jsonArray, type);
/*     */       
/*  36 */       Iterable $this$forEach$iv = list; int $i$f$forEach = 0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 129 */       Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a sc = (a)element$iv; int $i$a$-forEach-CosmeticManager$syncFromServer$1 = 0;
/*     */         Intrinsics.checkNotNullExpressionValue(sc.getType().toLowerCase(Locale.ROOT), "");
/*     */         String str = sc.getType().toLowerCase(Locale.ROOT); }
/*     */     
/*     */     } catch (Exception e) {
/*     */       System.out.println("CosmeticManager.syncFromServer: Failed to parse cosmetics");
/*     */       e.printStackTrace();
/*     */     } 
/*     */     if (this.onCosmeticsUpdated != null) {
/*     */       this.onCosmeticsUpdated.run();
/*     */     } else {
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class b
/*     */     extends TypeToken<List<? extends a>> {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<b> byType(String type) {
/*     */     Intrinsics.checkNotNullParameter(type, "");
/*     */     Iterable<b> $this$filter$iv = this.cosmetics;
/*     */     int $i$f$filter = 0;
/* 159 */     Iterable<b> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 160 */     for (b element$iv$iv : iterable1) { b it = element$iv$iv; int $i$a$-filter-CosmeticManager$byType$1 = 0; if (StringsKt.equals(it.f(), type, true)) destination$iv$iv.add(element$iv$iv);  }
/* 161 */      return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   public final void selectCosmetic(b cosmetic) {
/*     */     Intrinsics.checkNotNullParameter(cosmetic, "");
/*     */     Intrinsics.checkNotNullExpressionValue(cosmetic.f().toLowerCase(Locale.ROOT), "");
/*     */     String str = cosmetic.f().toLowerCase(Locale.ROOT);
/*     */     if (Intrinsics.areEqual(str, "cape")) {
/*     */       if (this.currentCape != null) {
/*     */         toggleIfActive(this.currentCape);
/*     */       } else {
/*     */       
/*     */       } 
/*     */       this.currentCape = (cosmetic instanceof a) ? (a)cosmetic : null;
/*     */     } else if (Intrinsics.areEqual(str, "wings")) {
/*     */       if (this.currentWings != null) {
/*     */         toggleIfActive(this.currentWings);
/*     */       } else {
/*     */       
/*     */       } 
/*     */       this.currentWings = (cosmetic instanceof c) ? (c)cosmetic : null;
/*     */     } 
/*     */     if (!cosmetic.b())
/*     */       cosmetic.a(); 
/*     */     if (this.onSelectionUpdated != null) {
/*     */       this.onSelectionUpdated.invoke();
/*     */     } else {
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void setCurrentCapeById(String id) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_0
/*     */     //   2: getfield cosmetics : Ljava/util/List;
/*     */     //   5: checkcast java/lang/Iterable
/*     */     //   8: astore_2
/*     */     //   9: astore #9
/*     */     //   11: iconst_0
/*     */     //   12: istore_3
/*     */     //   13: aload_2
/*     */     //   14: astore #4
/*     */     //   16: new java/util/ArrayList
/*     */     //   19: dup
/*     */     //   20: invokespecial <init> : ()V
/*     */     //   23: checkcast java/util/Collection
/*     */     //   26: astore #5
/*     */     //   28: iconst_0
/*     */     //   29: istore #6
/*     */     //   31: aload #4
/*     */     //   33: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   38: astore #7
/*     */     //   40: aload #7
/*     */     //   42: invokeinterface hasNext : ()Z
/*     */     //   47: ifeq -> 80
/*     */     //   50: aload #7
/*     */     //   52: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   57: astore #8
/*     */     //   59: aload #8
/*     */     //   61: instanceof eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   64: ifeq -> 40
/*     */     //   67: aload #5
/*     */     //   69: aload #8
/*     */     //   71: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   76: pop
/*     */     //   77: goto -> 40
/*     */     //   80: aload #5
/*     */     //   82: checkcast java/util/List
/*     */     //   85: nop
/*     */     //   86: aload #9
/*     */     //   88: swap
/*     */     //   89: checkcast java/lang/Iterable
/*     */     //   92: astore_2
/*     */     //   93: astore #9
/*     */     //   95: iconst_0
/*     */     //   96: istore_3
/*     */     //   97: aload_2
/*     */     //   98: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   103: astore #4
/*     */     //   105: aload #4
/*     */     //   107: invokeinterface hasNext : ()Z
/*     */     //   112: ifeq -> 151
/*     */     //   115: aload #4
/*     */     //   117: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   122: astore #5
/*     */     //   124: aload #5
/*     */     //   126: checkcast eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   129: astore #6
/*     */     //   131: iconst_0
/*     */     //   132: istore #7
/*     */     //   134: aload #6
/*     */     //   136: invokevirtual c : ()Ljava/lang/String;
/*     */     //   139: aload_1
/*     */     //   140: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   143: ifeq -> 105
/*     */     //   146: aload #5
/*     */     //   148: goto -> 152
/*     */     //   151: aconst_null
/*     */     //   152: aload #9
/*     */     //   154: swap
/*     */     //   155: checkcast eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   158: putfield currentCape : Leu/shoroa/bridge/feature/cosmetic/a;
/*     */     //   161: aload_0
/*     */     //   162: getfield onSelectionUpdated : Lkotlin/jvm/functions/Function0;
/*     */     //   165: dup
/*     */     //   166: ifnull -> 178
/*     */     //   169: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   174: pop
/*     */     //   175: goto -> 179
/*     */     //   178: pop
/*     */     //   179: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #93	-> 0
/*     */     //   #131	-> 13
/*     */     //   #140	-> 31
/*     */     //   #141	-> 80
/*     */     //   #131	-> 85
/*     */     //   #93	-> 93
/*     */     //   #142	-> 97
/*     */     //   #93	-> 134
/*     */     //   #142	-> 143
/*     */     //   #143	-> 151
/*     */     //   #93	-> 158
/*     */     //   #94	-> 161
/*     */     //   #95	-> 179
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	180	0	this	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   0	180	1	id	Ljava/lang/String;
/*     */     //   11	75	2	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   13	73	3	$i$f$filterIsInstance	I
/*     */     //   28	54	4	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   28	54	5	destination$iv$iv	Ljava/util/Collection;
/*     */     //   31	51	6	$i$f$filterIsInstanceTo	I
/*     */     //   59	18	8	element$iv$iv	Ljava/lang/Object;
/*     */     //   95	57	2	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   97	55	3	$i$f$firstOrNull	I
/*     */     //   124	27	5	element$iv	Ljava/lang/Object;
/*     */     //   131	12	6	it	Leu/shoroa/bridge/feature/cosmetic/a;
/*     */     //   134	9	7	$i$a$-firstOrNull-CosmeticManager$setCurrentCapeById$1	I
/*     */   }
/*     */   
/*     */   public final void setCurrentWingsById(String id) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_0
/*     */     //   2: getfield cosmetics : Ljava/util/List;
/*     */     //   5: checkcast java/lang/Iterable
/*     */     //   8: astore_2
/*     */     //   9: astore #9
/*     */     //   11: iconst_0
/*     */     //   12: istore_3
/*     */     //   13: aload_2
/*     */     //   14: astore #4
/*     */     //   16: new java/util/ArrayList
/*     */     //   19: dup
/*     */     //   20: invokespecial <init> : ()V
/*     */     //   23: checkcast java/util/Collection
/*     */     //   26: astore #5
/*     */     //   28: iconst_0
/*     */     //   29: istore #6
/*     */     //   31: aload #4
/*     */     //   33: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   38: astore #7
/*     */     //   40: aload #7
/*     */     //   42: invokeinterface hasNext : ()Z
/*     */     //   47: ifeq -> 80
/*     */     //   50: aload #7
/*     */     //   52: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   57: astore #8
/*     */     //   59: aload #8
/*     */     //   61: instanceof eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   64: ifeq -> 40
/*     */     //   67: aload #5
/*     */     //   69: aload #8
/*     */     //   71: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   76: pop
/*     */     //   77: goto -> 40
/*     */     //   80: aload #5
/*     */     //   82: checkcast java/util/List
/*     */     //   85: nop
/*     */     //   86: aload #9
/*     */     //   88: swap
/*     */     //   89: checkcast java/lang/Iterable
/*     */     //   92: astore_2
/*     */     //   93: astore #9
/*     */     //   95: iconst_0
/*     */     //   96: istore_3
/*     */     //   97: aload_2
/*     */     //   98: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   103: astore #4
/*     */     //   105: aload #4
/*     */     //   107: invokeinterface hasNext : ()Z
/*     */     //   112: ifeq -> 151
/*     */     //   115: aload #4
/*     */     //   117: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   122: astore #5
/*     */     //   124: aload #5
/*     */     //   126: checkcast eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   129: astore #6
/*     */     //   131: iconst_0
/*     */     //   132: istore #7
/*     */     //   134: aload #6
/*     */     //   136: invokevirtual c : ()Ljava/lang/String;
/*     */     //   139: aload_1
/*     */     //   140: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   143: ifeq -> 105
/*     */     //   146: aload #5
/*     */     //   148: goto -> 152
/*     */     //   151: aconst_null
/*     */     //   152: aload #9
/*     */     //   154: swap
/*     */     //   155: checkcast eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   158: putfield currentWings : Leu/shoroa/bridge/feature/cosmetic/c;
/*     */     //   161: aload_0
/*     */     //   162: getfield onSelectionUpdated : Lkotlin/jvm/functions/Function0;
/*     */     //   165: dup
/*     */     //   166: ifnull -> 178
/*     */     //   169: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   174: pop
/*     */     //   175: goto -> 179
/*     */     //   178: pop
/*     */     //   179: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 0
/*     */     //   #144	-> 13
/*     */     //   #153	-> 31
/*     */     //   #154	-> 80
/*     */     //   #144	-> 85
/*     */     //   #98	-> 93
/*     */     //   #155	-> 97
/*     */     //   #98	-> 134
/*     */     //   #155	-> 143
/*     */     //   #156	-> 151
/*     */     //   #98	-> 158
/*     */     //   #99	-> 161
/*     */     //   #100	-> 179
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	180	0	this	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   0	180	1	id	Ljava/lang/String;
/*     */     //   11	75	2	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*     */     //   13	73	3	$i$f$filterIsInstance	I
/*     */     //   28	54	4	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   28	54	5	destination$iv$iv	Ljava/util/Collection;
/*     */     //   31	51	6	$i$f$filterIsInstanceTo	I
/*     */     //   59	18	8	element$iv$iv	Ljava/lang/Object;
/*     */     //   95	57	2	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   97	55	3	$i$f$firstOrNull	I
/*     */     //   124	27	5	element$iv	Ljava/lang/Object;
/*     */     //   131	12	6	it	Leu/shoroa/bridge/feature/cosmetic/c;
/*     */     //   134	9	7	$i$a$-firstOrNull-CosmeticManager$setCurrentWingsById$1	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final b getCurrentCosmetic(String type) {
/*     */     Intrinsics.checkNotNullParameter(type, "");
/*     */     Intrinsics.checkNotNullExpressionValue(type.toLowerCase(Locale.ROOT), "");
/*     */     String str = type.toLowerCase(Locale.ROOT);
/*     */     if (Intrinsics.areEqual(str, "wings")) {
/*     */     
/*     */     } else {
/*     */       throw new IllegalArgumentException("Unsupported cosmetic type: " + type);
/*     */     } 
/*     */     return Intrinsics.areEqual(str, "cape") ? this.currentCape : (b)"JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   public final boolean isEquipped(b cosmetic) {
/*     */     Intrinsics.checkNotNullParameter(cosmetic, "");
/*     */     getCurrentCosmetic(cosmetic.f());
/*     */     return Intrinsics.areEqual((getCurrentCosmetic(cosmetic.f()) != null) ? getCurrentCosmetic(cosmetic.f()).c() : null, cosmetic.c());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final b getCosmeticById(String id) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield cosmetics : Ljava/util/List;
/*     */     //   4: checkcast java/lang/Iterable
/*     */     //   7: astore_2
/*     */     //   8: iconst_0
/*     */     //   9: istore_3
/*     */     //   10: aload_2
/*     */     //   11: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   16: astore #4
/*     */     //   18: aload #4
/*     */     //   20: invokeinterface hasNext : ()Z
/*     */     //   25: ifeq -> 65
/*     */     //   28: aload #4
/*     */     //   30: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   35: astore #5
/*     */     //   37: aload #5
/*     */     //   39: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   42: astore #6
/*     */     //   44: iconst_0
/*     */     //   45: istore #7
/*     */     //   47: aload #6
/*     */     //   49: invokevirtual c : ()Ljava/lang/String;
/*     */     //   52: aload_1
/*     */     //   53: iconst_1
/*     */     //   54: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
/*     */     //   57: ifeq -> 18
/*     */     //   60: aload #5
/*     */     //   62: goto -> 66
/*     */     //   65: aconst_null
/*     */     //   66: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   69: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 0
/*     */     //   #157	-> 10
/*     */     //   #108	-> 47
/*     */     //   #157	-> 57
/*     */     //   #158	-> 65
/*     */     //   #108	-> 69
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	70	0	this	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   0	70	1	id	Ljava/lang/String;
/*     */     //   8	58	2	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   10	56	3	$i$f$firstOrNull	I
/*     */     //   37	28	5	element$iv	Ljava/lang/Object;
/*     */     //   44	13	6	it	Leu/shoroa/bridge/feature/cosmetic/b;
/*     */     //   47	10	7	$i$a$-firstOrNull-CosmeticManager$getCosmeticById$1	I
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<b> all() {
/*     */     return CollectionsKt.toList(this.cosmetics);
/*     */   }
/*     */   
/*     */   private final void toggleIfActive(b $this$toggleIfActive) {
/*     */     if ($this$toggleIfActive.b())
/*     */       $this$toggleIfActive.a(); 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\005\n\002\020\013\n\002\b\r\n\002\020\b\n\002\b\023\b\b\030\0002\0020\001B9\022\006\020\f\032\0020\002\022\006\020\r\032\0020\002\022\b\020\016\032\004\030\0010\002\022\006\020\017\032\0020\002\022\006\020\020\032\0020\b\022\006\020\021\032\0020\b¢\006\004\b(\020)J\020\020\003\032\0020\002HÇ\003¢\006\004\b\003\020\004J\020\020\005\032\0020\002HÇ\003¢\006\004\b\005\020\004J\022\020\006\032\004\030\0010\002HÇ\003¢\006\004\b\006\020\004J\020\020\007\032\0020\002HÇ\003¢\006\004\b\007\020\004J\020\020\t\032\0020\bHÆ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\bHÆ\003¢\006\004\b\013\020\nJN\020\022\032\0020\0002\b\b\002\020\f\032\0020\0022\b\b\002\020\r\032\0020\0022\n\b\002\020\016\032\004\030\0010\0022\b\b\002\020\017\032\0020\0022\b\b\002\020\020\032\0020\b2\b\b\002\020\021\032\0020\bHÇ\001¢\006\004\b\022\020\023J\032\020\024\032\0020\b2\b\020\f\032\004\030\0010\001HÖ\003¢\006\004\b\024\020\025J\020\020\027\032\0020\026HÖ\001¢\006\004\b\027\020\030J\020\020\031\032\0020\002H×\001¢\006\004\b\031\020\004R\032\020\032\032\0020\b8\007X\004¢\006\f\n\004\b\032\020\033\032\004\b\034\020\nR\032\020\035\032\0020\0028\007X\004¢\006\f\n\004\b\035\020\036\032\004\b\037\020\004R\032\020 \032\0020\0028\007X\004¢\006\f\n\004\b \020\036\032\004\b!\020\004R\032\020\"\032\0020\b8\007X\004¢\006\f\n\004\b\"\020\033\032\004\b#\020\nR\034\020$\032\004\030\0010\0028\007X\004¢\006\f\n\004\b$\020\036\032\004\b%\020\004R\032\020&\032\0020\0028\007X\004¢\006\f\n\004\b&\020\036\032\004\b'\020\004"}, d2 = {"Leu/shoroa/bridge/feature/cosmetic/CosmeticManager$a;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "component5", "()Z", "component6", "p0", "p1", "p2", "p3", "p4", "p5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Leu/shoroa/bridge/feature/cosmetic/CosmeticManager$a;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "animated", "Z", "getAnimated", "id", "Ljava/lang/String;", "getId", "name", "getName", "selected", "getSelected", "texture", "getTexture", "type", "getType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V"})
/*     */   private static final class a {
/*     */     @NotNull
/*     */     private final String id;
/*     */     @NotNull
/*     */     private final String name;
/*     */     @SerializedName("resourceLocation")
/*     */     @Nullable
/*     */     private final String texture;
/*     */     @NotNull
/*     */     private final String type;
/*     */     @SerializedName("isAnimated")
/*     */     private final boolean animated;
/*     */     private final boolean selected;
/*     */     
/*     */     public a(String id, String name, String texture, String type, boolean animated, boolean selected) {
/*     */       this.id = id;
/*     */       this.name = name;
/*     */       this.texture = texture;
/*     */       this.type = type;
/*     */       this.animated = animated;
/*     */       this.selected = selected;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     @JvmName(name = "getId")
/*     */     public final String getId() {
/*     */       return this.id;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     @JvmName(name = "getName")
/*     */     public final String getName() {
/*     */       return this.name;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     @JvmName(name = "getTexture")
/*     */     public final String getTexture() {
/*     */       return this.texture;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     @JvmName(name = "getType")
/*     */     public final String getType() {
/*     */       return this.type;
/*     */     }
/*     */     
/*     */     @JvmName(name = "getAnimated")
/*     */     public final boolean getAnimated() {
/*     */       return this.animated;
/*     */     }
/*     */     
/*     */     @JvmName(name = "getSelected")
/*     */     public final boolean getSelected() {
/*     */       return this.selected;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.id;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.name;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String component3() {
/*     */       return this.texture;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component4() {
/*     */       return this.type;
/*     */     }
/*     */     
/*     */     public final boolean component5() {
/*     */       return this.animated;
/*     */     }
/*     */     
/*     */     public final boolean component6() {
/*     */       return this.selected;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final a copy(String id, String name, String texture, String type, boolean animated, boolean selected) {
/*     */       Intrinsics.checkNotNullParameter(id, "");
/*     */       Intrinsics.checkNotNullParameter(name, "");
/*     */       Intrinsics.checkNotNullParameter(type, "");
/*     */       return new a(id, name, texture, type, animated, selected);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "ServerCosmetic(id=" + this.id + ", name=" + this.name + ", texture=" + this.texture + ", type=" + this.type + ", animated=" + this.animated + ", selected=" + this.selected + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.id.hashCode();
/*     */       result = result * 31 + this.name.hashCode();
/*     */       result = result * 31 + ((this.texture == null) ? 0 : this.texture.hashCode());
/*     */       result = result * 31 + this.type.hashCode();
/*     */       result = result * 31 + Boolean.hashCode(this.animated);
/*     */       return result * 31 + Boolean.hashCode(this.selected);
/*     */     }
/*     */     
/*     */     public boolean equals(Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof a))
/*     */         return false; 
/*     */       a a1 = (a)other;
/*     */       return !Intrinsics.areEqual(this.id, a1.id) ? false : (!Intrinsics.areEqual(this.name, a1.name) ? false : (!Intrinsics.areEqual(this.texture, a1.texture) ? false : (!Intrinsics.areEqual(this.type, a1.type) ? false : ((this.animated != a1.animated) ? false : (!(this.selected != a1.selected))))));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\cosmetic\CosmeticManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */