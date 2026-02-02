/*     */ package eu.shoroa.bridge.feature.b;
/*     */ import eu.shoroa.bridge.feature.a.a.j;
/*     */ import eu.shoroa.bridge.feature.a.b;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020%\n\002\b\004\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\033\020\016J\031\020\005\032\004\030\0010\0042\006\020\003\032\0020\002H\007¢\006\004\b\005\020\006J!\020\005\032\0020\b2\022\020\003\032\016\022\004\022\0020\004\022\004\022\0020\b0\007¢\006\004\b\005\020\tJ(\020\005\032\0028\000\"\b\b\000\020\n*\0020\0042\f\020\003\032\b\022\004\022\0028\0000\013H\002¢\006\004\b\005\020\fJ\r\020\r\032\0020\b¢\006\004\b\r\020\016J\030\020\005\032\0020\0002\006\020\003\032\0020\004H\002¢\006\004\b\005\020\017J\025\020\005\032\0020\b2\006\020\003\032\0020\020¢\006\004\b\005\020\021J\r\020\022\032\0020\b¢\006\004\b\022\020\016R\024\020\005\032\0020\0238\002X\004¢\006\006\n\004\b\r\020\024R\024\020\022\032\0020\0258\002X\004¢\006\006\n\004\b\022\020\026R*\020\r\032\022\022\b\022\006\022\002\b\0030\013\022\004\022\0020\0040\0278\007X\004¢\006\f\n\004\b\030\020\031\032\004\b\005\020\032"}, d2 = {"Leu/shoroa/bridge/feature/b/c;", "", "", "p0", "Leu/shoroa/bridge/feature/b/b;", "a", "(Ljava/lang/String;)Leu/shoroa/bridge/feature/b/b;", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "T", "Ljava/lang/Class;", "(Ljava/lang/Class;)Leu/shoroa/bridge/feature/b/b;", "c", "()V", "(Leu/shoroa/bridge/feature/b/b;)Leu/shoroa/bridge/feature/b/c;", "", "(Z)V", "b", "Ljava/io/File;", "Ljava/io/File;", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "<init>"})
/*     */ @SourceDebugExtension({"SMAP\nModuleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleManager.kt\neu/shoroa/bridge/feature/module/ModuleManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1855#2,2:111\n766#2:113\n857#2,2:114\n1855#2,2:116\n288#2,2:118\n1179#2,2:120\n1253#2,4:122\n1855#2:126\n1856#2:128\n1#3:127\n*S KotlinDebug\n*F\n+ 1 ModuleManager.kt\neu/shoroa/bridge/feature/module/ModuleManager\n*L\n37#1:111,2\n61#1:113\n61#1:114,2\n62#1:116,2\n66#1:118,2\n76#1:120,2\n76#1:122,4\n97#1:126\n97#1:128\n*E\n"})
/*     */ public final class c {
/*     */   @NotNull
/*  15 */   public static final c INSTANCE = new c(); @NotNull private static final Gson b = (new GsonBuilder()).setPrettyPrinting().create(); static { Intrinsics.checkNotNullExpressionValue((new GsonBuilder()).setPrettyPrinting().create(), ""); } @NotNull
/*  16 */   private static final File c = new File("config/modules.json");
/*     */   
/*     */   @NotNull
/*  19 */   private static final Map<Class<?>, b> d = new LinkedHashMap<>(); @NotNull @JvmName(name = "a") public final Map<Class<?>, b> a() { return d; }
/*     */   
/*     */   @NotNull
/*     */   public final c a(b module) {
/*  23 */     Intrinsics.checkNotNullParameter(module, ""); if (!module.f()) {
/*  24 */       System.out.println("   Module: " + module.j());
/*     */     }
/*  26 */     d.put(module.getClass(), module);
/*  27 */     module.i();
/*  28 */     return this;
/*     */   }
/*     */   
/*     */   public final void a(boolean dummy) {
/*  32 */     j resolution = b.a.b();
/*  33 */     b.a.e(); int scaledWidth = (resolution != null) ? resolution.scaledWidth() : ((b.a.e() != null) ? b.a.e().width() : 1920);
/*  34 */     b.a.e(); int scaledHeight = (resolution != null) ? resolution.scaledHeight() : ((b.a.e() != null) ? b.a.e().height() : 1080);
/*     */     
/*  36 */     Intrinsics.checkNotNull(BridgeClient.a.b()); e vr = BridgeClient.a.b().vanillaRenderer();
/*  37 */     Iterable<b> $this$forEach$iv = d.values(); int $i$f$forEach = 0;
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
/* 111 */     Iterator<b> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b module = (b)element$iv; int $i$a$-forEach-ModuleManager$render$1 = 0; if (module instanceof d)
/*     */         module.b(((d)module).c().b());  } 
/* 113 */   } @NotNull public final <T extends b> T a(Class clazz) { Intrinsics.checkNotNullParameter(clazz, ""); Intrinsics.checkNotNull(d.get(clazz)); return (T)d.get(clazz); } public final void a(Function1 consumer) { Intrinsics.checkNotNullParameter(consumer, ""); Collection<b> collection1 = d.values(); int $i$f$filter = 0; Collection<b> collection2 = collection1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 114 */     for (b element$iv$iv : collection2) { b it = element$iv$iv; int $i$a$-filter-ModuleManager$forEach$1 = 0; if ((!it.f() && !(it instanceof d))) destination$iv$iv.add(element$iv$iv);  }
/* 115 */      Iterable $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 116 */     for (Object element$iv : $this$filter$iv) consumer.invoke(element$iv);  }
/*     */   @Nullable public final b a(String name) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc ''
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: getstatic eu/shoroa/bridge/feature/b/c.d : Ljava/util/Map;
/*     */     //   9: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   14: checkcast java/lang/Iterable
/*     */     //   17: astore_2
/*     */     //   18: iconst_0
/*     */     //   19: istore_3
/*     */     //   20: aload_2
/*     */     //   21: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   26: astore #4
/*     */     //   28: aload #4
/*     */     //   30: invokeinterface hasNext : ()Z
/*     */     //   35: ifeq -> 118
/*     */     //   38: aload #4
/*     */     //   40: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   45: astore #5
/*     */     //   47: aload #5
/*     */     //   49: checkcast eu/shoroa/bridge/feature/b/b
/*     */     //   52: astore #6
/*     */     //   54: iconst_0
/*     */     //   55: istore #7
/*     */     //   57: aload #6
/*     */     //   59: invokevirtual j : ()Ljava/lang/String;
/*     */     //   62: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   65: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   68: dup
/*     */     //   69: ldc ''
/*     */     //   71: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   74: ldc ' '
/*     */     //   76: ldc ''
/*     */     //   78: iconst_0
/*     */     //   79: iconst_4
/*     */     //   80: aconst_null
/*     */     //   81: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   84: aload_1
/*     */     //   85: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   88: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   91: dup
/*     */     //   92: ldc ''
/*     */     //   94: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   97: ldc ' '
/*     */     //   99: ldc ''
/*     */     //   101: iconst_0
/*     */     //   102: iconst_4
/*     */     //   103: aconst_null
/*     */     //   104: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   107: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 28
/*     */     //   113: aload #5
/*     */     //   115: goto -> 119
/*     */     //   118: aconst_null
/*     */     //   119: checkcast eu/shoroa/bridge/feature/b/b
/*     */     //   122: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 6
/*     */     //   #118	-> 20
/*     */     //   #67	-> 57
/*     */     //   #118	-> 110
/*     */     //   #119	-> 118
/*     */     //   #66	-> 122
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	123	0	this	Leu/shoroa/bridge/feature/b/c;
/*     */     //   0	123	1	name	Ljava/lang/String;
/*     */     //   18	101	2	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   20	99	3	$i$f$firstOrNull	I
/*     */     //   47	71	5	element$iv	Ljava/lang/Object;
/*     */     //   54	56	6	it	Leu/shoroa/bridge/feature/b/b;
/*     */     //   57	53	7	$i$a$-firstOrNull-ModuleManager$byName$1	I } public final void b() { 
/*     */     try { if (!c.getParentFile().exists())
/*     */         c.getParentFile().mkdirs();  Iterable<b> $this$associate$iv = d.values(); int $i$f$associate = 0;
/* 120 */       int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
/* 121 */       Iterable<b> iterable1 = $this$associate$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 122 */       for (b element$iv$iv : iterable1) {
/* 123 */         Map<Object, Object> map = destination$iv$iv; b it = element$iv$iv; int $i$a$-associate-ModuleManager$saveModules$data$1 = 0; Pair pair = TuplesKt.to(it.j(), it.r()); map.put(pair.getFirst(), pair.getSecond());
/*     */       } 
/* 125 */       Map<Object, Object> data = destination$iv$iv; Intrinsics.checkNotNullExpressionValue(b.toJson(data), ""); FilesKt.writeText$default(c, b.toJson(data), null, 2, null); System.out.println("✅ Modules saved successfully to " + c.getPath()); } catch (Exception e) { System.out.println("⚠️ Failed to save modules: " + e.getMessage()); e.printStackTrace(); }  } public final void c() { if (!c.exists()) { System.out.println("ℹ️ No modules.json found, skipping load."); return; }
/* 126 */      try { Type type = (new a()).getType(); Intrinsics.checkNotNullExpressionValue(b.fromJson(FilesKt.readText$default(c, null, 1, null), type), ""); Map data = (Map)b.fromJson(FilesKt.readText$default(c, null, 1, null), type); Iterable<b> $this$forEach$iv = d.values(); int $i$f$forEach = 0; Iterator<b> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b m = (b)element$iv; int $i$a$-forEach-ModuleManager$loadModules$1 = 0; if ((Map)data.get(m.j()) != null) {
/* 127 */           Map<String, ? extends Object> it = (Map)data.get(m.j()); int $i$a$-let-ModuleManager$loadModules$1$1 = 0;
/*     */           m.a(it);
/*     */         } else {
/*     */           (Map)data.get(m.j());
/*     */         }  }
/*     */       
/*     */       System.out.println("✅ Loaded module settings successfully"); }
/*     */     catch (Exception e)
/*     */     { System.out.println("⚠️ Failed to load modules: " + e.getMessage());
/*     */       e.printStackTrace(); }
/*     */      }
/*     */ 
/*     */   
/*     */   public static final class a extends TypeToken<Map<String, ? extends Map<String, ? extends Object>>> {}
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */