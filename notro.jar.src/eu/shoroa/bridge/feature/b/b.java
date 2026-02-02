/*     */ package eu.shoroa.bridge.feature.b;@SourceDebugExtension({"SMAP\nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Module.kt\neu/shoroa/bridge/feature/module/Module\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1855#2,2:194\n1179#2,2:197\n1253#2,4:199\n1#3:196\n*S KotlinDebug\n*F\n+ 1 Module.kt\neu/shoroa/bridge/feature/module/Module\n*L\n35#1:194,2\n160#1:197,2\n160#1:199,4\n*E\n"})
/*     */ public abstract class b extends a { @NotNull
/*     */   private final String a; @NotNull
/*     */   private final String b; private boolean c; @NotNull
/*     */   private final String d; private final boolean e; private boolean f; private float g; private float h; private float i; private float j;
/*     */   @NotNull
/*     */   private final List<eu.shoroa.bridge.feature.c.b<?>> k;
/*     */   @NotNull
/*     */   private final List<d> l;
/*     */   
/*     */   @NotNull
/*     */   public final String e() {
/*  13 */     return this.a;
/*     */   }
/*     */   
/*     */   public final boolean f() {
/*  17 */     return this.e; } public b(String name, String description, boolean reset, String icon, boolean excludeFromList) { this.a = name; this.b = description; this.c = reset; this.d = icon; this.e = excludeFromList;
/*     */ 
/*     */     
/*  20 */     if (this.c) {
/*  21 */       a(-100.0F);
/*  22 */       b(-100.0F);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  31 */     this.k = new ArrayList<>();
/*  32 */     this.l = new ArrayList<>(); } @NotNull public final List<eu.shoroa.bridge.feature.c.b<?>> g() { return this.k; } @NotNull public final List<d> h() { return this.l; }
/*     */   @NotNull public final String j() { return this.a; }
/*     */   @NotNull public final String k() { return this.b; }
/*  35 */   public final float l() { return this.g; } public final float m() { return this.h; } public final float n() { return this.i; } public final float o() { return this.j; } @NotNull public final b a(float x) { this.g = x; return this; } @NotNull public final b b(float y) { this.h = y; return this; } public final void i() { Iterable<d> $this$forEach$iv = this.l; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Module$post$1 = 0; Intrinsics.checkNotNull(BridgeClient.a.b()); BridgeClient.a.b().moduleManager().a(it); }  }
/*     */   @NotNull public final b c(float w) { this.i = w; return this; }
/* 196 */   @NotNull public final b d(float h) { this.j = h; return this; } @NotNull public final b a(float w, float h) { this.i = w; this.j = h; return this; } @NotNull public final eu.shoroa.bridge.feature.c.b<Boolean> a(String s, boolean bool) { Intrinsics.checkNotNullParameter(s, ""); eu.shoroa.bridge.feature.c.b<?> setting = new eu.shoroa.bridge.feature.c.b(s, Boolean.valueOf(bool)); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } @NotNull public final <T extends Number> eu.shoroa.bridge.feature.c.b<T> a(String name, Number value, Number min, Number max, Number step) { Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(value, ""); Intrinsics.checkNotNullParameter(min, ""); Intrinsics.checkNotNullParameter(max, ""); Intrinsics.checkNotNullParameter(step, ""); eu.shoroa.bridge.feature.c.b<?> setting = (new eu.shoroa.bridge.feature.c.b(name, value)).a(min, max, step); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } @NotNull public final <T extends Comparable<? super T>> eu.shoroa.bridge.feature.c.b<T> a(String name, Comparable value, ClosedRange range, Comparable step) { Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(value, ""); Intrinsics.checkNotNullParameter(range, ""); Intrinsics.checkNotNullParameter(step, ""); eu.shoroa.bridge.feature.c.b<?> setting = (new eu.shoroa.bridge.feature.c.b(name, value)).a(range.getStart(), range.getEndInclusive(), step); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } @NotNull public final <T extends Comparable<? super T>> h<T> b(String name, Comparable value, ClosedRange range, Comparable step) { Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(value, ""); Intrinsics.checkNotNullParameter(range, ""); Intrinsics.checkNotNullParameter(step, ""); h<T> setting = new h(name, value, range.getStart(), range.getEndInclusive(), step); this.k.add(setting); return setting; } @NotNull public final g a(String name, i def) { Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(def, ""); g g1 = new g(name, def), it = g1; int $i$a$-also-Module$shape$1 = 0; this.k.add(it); return g1; } @NotNull public final eu.shoroa.bridge.feature.c.b<Color> a(String name, Color value) { Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(value, ""); eu.shoroa.bridge.feature.c.b<?> setting = new eu.shoroa.bridge.feature.c.b(name, value); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } @NotNull public final eu.shoroa.bridge.feature.c.b<Color> a(String name, int value) { Intrinsics.checkNotNullParameter(name, ""); eu.shoroa.bridge.feature.c.b<?> setting = new eu.shoroa.bridge.feature.c.b(name, new Color(value)); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } @NotNull public final eu.shoroa.bridge.feature.c.b<Color> a(String name, int r, int g, int i, int j) { Intrinsics.checkNotNullParameter(name, ""); eu.shoroa.bridge.feature.c.b<?> setting = new eu.shoroa.bridge.feature.c.b(name, new Color(r, g, i, j)); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } @NotNull public final eu.shoroa.bridge.feature.c.b<Color> a(String name, float r, float g, float f1, float f2) { Intrinsics.checkNotNullParameter(name, ""); eu.shoroa.bridge.feature.c.b<?> setting = new eu.shoroa.bridge.feature.c.b(name, new Color(r, g, f1, f2)); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } @NotNull public final <T> eu.shoroa.bridge.feature.c.b<T> a(String name, Object default) { Intrinsics.checkNotNullParameter(name, ""); eu.shoroa.bridge.feature.c.b<?> setting = new eu.shoroa.bridge.feature.c.b(name, default); this.k.add(setting); return (eu.shoroa.bridge.feature.c.b)setting; } public final void a(d... sub) { Intrinsics.checkNotNullParameter(sub, ""); CollectionsKt.addAll(this.l, (Object[])sub); } @NotNull public final String p() { return this.d; } @NotNull public Map<String, Object> q() { return r(); } @NotNull public Map<String, Object> r() { // Byte code:
/*     */     //   0: iconst_5
/*     */     //   1: anewarray kotlin/Pair
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: iconst_0
/*     */     //   7: ldc 'enabled'
/*     */     //   9: aload_0
/*     */     //   10: invokevirtual b : ()Z
/*     */     //   13: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   16: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   19: aastore
/*     */     //   20: aload_2
/*     */     //   21: iconst_1
/*     */     //   22: ldc 'x'
/*     */     //   24: aload_0
/*     */     //   25: getfield g : F
/*     */     //   28: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   31: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   34: aastore
/*     */     //   35: aload_2
/*     */     //   36: iconst_2
/*     */     //   37: ldc 'y'
/*     */     //   39: aload_0
/*     */     //   40: getfield h : F
/*     */     //   43: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   46: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   49: aastore
/*     */     //   50: aload_2
/*     */     //   51: iconst_3
/*     */     //   52: ldc 'w'
/*     */     //   54: aload_0
/*     */     //   55: getfield i : F
/*     */     //   58: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   61: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   64: aastore
/*     */     //   65: aload_2
/*     */     //   66: iconst_4
/*     */     //   67: ldc 'h'
/*     */     //   69: aload_0
/*     */     //   70: getfield j : F
/*     */     //   73: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   76: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   79: aastore
/*     */     //   80: aload_2
/*     */     //   81: invokestatic mutableMapOf : ([Lkotlin/Pair;)Ljava/util/Map;
/*     */     //   84: astore_1
/*     */     //   85: new java/util/LinkedHashMap
/*     */     //   88: dup
/*     */     //   89: invokespecial <init> : ()V
/*     */     //   92: checkcast java/util/Map
/*     */     //   95: astore_2
/*     */     //   96: aload_0
/*     */     //   97: getfield k : Ljava/util/List;
/*     */     //   100: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   105: astore_3
/*     */     //   106: aload_3
/*     */     //   107: invokeinterface hasNext : ()Z
/*     */     //   112: ifeq -> 163
/*     */     //   115: aload_3
/*     */     //   116: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   121: checkcast eu/shoroa/bridge/feature/c/b
/*     */     //   124: astore #4
/*     */     //   126: aload #4
/*     */     //   128: invokevirtual h : ()Ljava/lang/Object;
/*     */     //   131: dup
/*     */     //   132: ifnull -> 158
/*     */     //   135: astore #7
/*     */     //   137: iconst_0
/*     */     //   138: istore #8
/*     */     //   140: aload_2
/*     */     //   141: aload #4
/*     */     //   143: invokevirtual a : ()Ljava/lang/String;
/*     */     //   146: aload #7
/*     */     //   148: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   153: pop
/*     */     //   154: nop
/*     */     //   155: goto -> 106
/*     */     //   158: pop
/*     */     //   159: nop
/*     */     //   160: goto -> 106
/*     */     //   163: aload_1
/*     */     //   164: ldc 'settings'
/*     */     //   166: aload_2
/*     */     //   167: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   172: pop
/*     */     //   173: aload_0
/*     */     //   174: getfield l : Ljava/util/List;
/*     */     //   177: checkcast java/util/Collection
/*     */     //   180: invokeinterface isEmpty : ()Z
/*     */     //   185: ifne -> 192
/*     */     //   188: iconst_1
/*     */     //   189: goto -> 193
/*     */     //   192: iconst_0
/*     */     //   193: ifeq -> 346
/*     */     //   196: aload_1
/*     */     //   197: astore_3
/*     */     //   198: ldc 'submodules'
/*     */     //   200: astore #4
/*     */     //   202: aload_0
/*     */     //   203: getfield l : Ljava/util/List;
/*     */     //   206: checkcast java/lang/Iterable
/*     */     //   209: astore #5
/*     */     //   211: iconst_0
/*     */     //   212: istore #6
/*     */     //   214: aload #5
/*     */     //   216: bipush #10
/*     */     //   218: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   221: invokestatic mapCapacity : (I)I
/*     */     //   224: bipush #16
/*     */     //   226: invokestatic coerceAtLeast : (II)I
/*     */     //   229: istore #7
/*     */     //   231: aload #5
/*     */     //   233: astore #8
/*     */     //   235: new java/util/LinkedHashMap
/*     */     //   238: dup
/*     */     //   239: iload #7
/*     */     //   241: invokespecial <init> : (I)V
/*     */     //   244: checkcast java/util/Map
/*     */     //   247: astore #9
/*     */     //   249: iconst_0
/*     */     //   250: istore #10
/*     */     //   252: aload #8
/*     */     //   254: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   259: astore #11
/*     */     //   261: aload #11
/*     */     //   263: invokeinterface hasNext : ()Z
/*     */     //   268: ifeq -> 330
/*     */     //   271: aload #11
/*     */     //   273: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   278: astore #12
/*     */     //   280: aload #9
/*     */     //   282: astore #13
/*     */     //   284: aload #12
/*     */     //   286: checkcast eu/shoroa/bridge/feature/b/d
/*     */     //   289: astore #14
/*     */     //   291: iconst_0
/*     */     //   292: istore #15
/*     */     //   294: aload #14
/*     */     //   296: invokevirtual j : ()Ljava/lang/String;
/*     */     //   299: aload #14
/*     */     //   301: invokevirtual r : ()Ljava/util/Map;
/*     */     //   304: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   307: astore #14
/*     */     //   309: aload #13
/*     */     //   311: aload #14
/*     */     //   313: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   316: aload #14
/*     */     //   318: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   321: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   326: pop
/*     */     //   327: goto -> 261
/*     */     //   330: aload #9
/*     */     //   332: nop
/*     */     //   333: astore #5
/*     */     //   335: aload_3
/*     */     //   336: aload #4
/*     */     //   338: aload #5
/*     */     //   340: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   345: pop
/*     */     //   346: aload_1
/*     */     //   347: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #146	-> 0
/*     */     //   #147	-> 22
/*     */     //   #146	-> 35
/*     */     //   #148	-> 37
/*     */     //   #146	-> 50
/*     */     //   #149	-> 52
/*     */     //   #146	-> 65
/*     */     //   #150	-> 67
/*     */     //   #146	-> 80
/*     */     //   #145	-> 81
/*     */     //   #153	-> 85
/*     */     //   #154	-> 96
/*     */     //   #155	-> 126
/*     */     //   #196	-> 137
/*     */     //   #155	-> 140
/*     */     //   #157	-> 163
/*     */     //   #159	-> 173
/*     */     //   #160	-> 196
/*     */     //   #197	-> 214
/*     */     //   #198	-> 231
/*     */     //   #199	-> 252
/*     */     //   #200	-> 280
/*     */     //   #160	-> 294
/*     */     //   #200	-> 307
/*     */     //   #202	-> 330
/*     */     //   #198	-> 332
/*     */     //   #160	-> 335
/*     */     //   #163	-> 346
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	348	0	this	Leu/shoroa/bridge/feature/b/b;
/*     */     //   85	263	1	map	Ljava/util/Map;
/*     */     //   96	252	2	settingMap	Ljava/util/Map;
/*     */     //   126	34	4	s	Leu/shoroa/bridge/feature/c/b;
/*     */     //   137	18	7	jsonVal	Ljava/lang/Object;
/*     */     //   140	15	8	$i$a$-let-Module$saveSettings$1	I
/*     */     //   211	122	5	$this$associate$iv	Ljava/lang/Iterable;
/*     */     //   214	119	6	$i$f$associate	I
/*     */     //   231	102	7	capacity$iv	I
/*     */     //   249	83	8	$this$associateTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   249	83	9	destination$iv$iv	Ljava/util/Map;
/*     */     //   252	80	10	$i$f$associateTo	I
/*     */     //   280	47	12	element$iv$iv	Ljava/lang/Object;
/*     */     //   291	16	14	it	Leu/shoroa/bridge/feature/b/d;
/* 196 */     //   294	13	15	$i$a$-associate-Module$saveSettings$2	I } public void a(Map data) { Intrinsics.checkNotNullParameter(data, ""); null = (Object<eu.shoroa.bridge.feature.c.b<?>>)data.get("x"); if (((null instanceof Number) ? null : null) != null) { Object object1 = (null instanceof Number) ? null : null; int $i$a$-let-Module$loadSettings$1 = 0; this.g = object1.floatValue(); } else { (null instanceof Number) ? null : null; }  null = (Object<eu.shoroa.bridge.feature.c.b<?>>)data.get("y"); if (((null instanceof Number) ? null : null) != null) { Object object1 = (null instanceof Number) ? null : null; int $i$a$-let-Module$loadSettings$2 = 0; this.h = object1.floatValue(); } else { (null instanceof Number) ? null : null; }  null = (Object<eu.shoroa.bridge.feature.c.b<?>>)data.get("w"); if (((null instanceof Number) ? null : null) != null) { Object object1 = (null instanceof Number) ? null : null; int $i$a$-let-Module$loadSettings$3 = 0; this.i = object1.floatValue(); } else { (null instanceof Number) ? null : null; }  null = (Object<eu.shoroa.bridge.feature.c.b<?>>)data.get("h"); if (((null instanceof Number) ? null : null) != null) { Object object1 = (null instanceof Number) ? null : null; int $i$a$-let-Module$loadSettings$4 = 0; this.j = object1.floatValue(); } else { (null instanceof Number) ? null : null; }  null = (Object<d>)data.get("settings"); if (((null instanceof Map) ? null : null) == null) (null instanceof Map) ? null : null;  Map settingMap = MapsKt.emptyMap(); for (eu.shoroa.bridge.feature.c.b<?> s : this.k) { Object v, object1 = settingMap.get(s.a()); if (object1 == null) continue;  try { s.e(v); } catch (Exception exception) {} }  Object object = data.get("submodules"); if (((object instanceof Map) ? object : null) == null) (object instanceof Map) ? object : null;  Map subMap = MapsKt.emptyMap(); for (d sub : this.l) { if ((Map)subMap.get(sub.e()) != null) { Map<String, ? extends Object> it = (Map)subMap.get(sub.e()); int $i$a$-let-Module$loadSettings$5 = 0;
/*     */         sub.a(it);
/*     */         continue; }
/*     */       
/*     */       (Map)subMap.get(sub.e()); }
/*     */     
/*     */     object = data.get("enabled");
/*     */     boolean shouldBeEnabled = ((object instanceof Boolean) ? object : null).booleanValue();
/*     */     int $i$a$-let-Module$loadSettings$6 = 0;
/*     */     if (shouldBeEnabled != b())
/*     */       a(); 
/*     */     (object instanceof Boolean) ? object : null; }
/*     */ 
/*     */   
/*     */   public abstract void a(boolean paramBoolean, int paramInt1, int paramInt2);
/*     */   
/*     */   public abstract void b(boolean paramBoolean, int paramInt1, int paramInt2); }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */