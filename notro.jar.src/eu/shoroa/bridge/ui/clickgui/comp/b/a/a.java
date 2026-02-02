/*     */ package eu.shoroa.bridge.ui.clickgui.comp.b.a;
/*     */ @SourceDebugExtension({"SMAP\nPageResourcePacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageResourcePacks.kt\neu/shoroa/bridge/ui/clickgui/comp/rpacks/comp/PageResourcePacks\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,482:1\n1855#2:483\n1747#2,3:484\n1856#2:494\n766#2:495\n857#2:496\n2624#2,3:497\n858#2:500\n1855#2:501\n1856#2:509\n2624#2,3:510\n1747#2,3:513\n766#2:516\n857#2,2:517\n1747#2,3:524\n372#3,7:487\n372#3,7:502\n215#4,2:519\n215#4,2:521\n215#4:523\n216#4:527\n*S KotlinDebug\n*F\n+ 1 PageResourcePacks.kt\neu/shoroa/bridge/ui/clickgui/comp/rpacks/comp/PageResourcePacks\n*L\n93#1:483\n94#1:484,3\n93#1:494\n119#1:495\n119#1:496\n121#1:497,3\n119#1:500\n122#1:501\n122#1:509\n137#1:510,3\n149#1:513,3\n150#1:516\n150#1:517,2\n403#1:524,3\n99#1:487,7\n126#1:502,7\n285#1:519,2\n394#1:521,2\n400#1:523\n400#1:527\n*E\n"})
/*     */ public final class a extends b { private final float a; private final float b; private final float c; private final float d; private final float e; private final float f; @NotNull
/*     */   private final ArrayList<eu.shoroa.bridge.d.c.a> g; @NotNull
/*     */   private final List<eu.shoroa.bridge.d.c.a> h;
/*     */   @NotNull
/*     */   private final Map<String, List<eu.shoroa.bridge.d.c.a>> i;
/*     */   @NotNull
/*     */   private final Map<String, Boolean> j;
/*     */   @NotNull
/*     */   private final List<eu.shoroa.bridge.d.c.a> k;
/*     */   @Nullable
/*     */   private eu.shoroa.bridge.d.c.a l;
/*     */   @Nullable
/*     */   private eu.shoroa.bridge.d.c.a m;
/*     */   private float n;
/*     */   
/*     */   @NotNull
/*  19 */   public Object clone() { return super.clone(); } private float o; @NotNull private final Map<String, Float> p; @NotNull private final Map<eu.shoroa.bridge.d.c.a, Float> q; @NotNull private final Map<String, b> r; @NotNull private final Map<eu.shoroa.bridge.d.c.a, b> s; private float t; private float u; @NotNull private String v; @Nullable private eu.shoroa.bridge.ui.b.a w; @Nullable private eu.shoroa.bridge.ui.b.a x; @Nullable private eu.shoroa.bridge.ui.b.a y; @Nullable private eu.shoroa.bridge.ui.b.a z; @Nullable private eu.shoroa.bridge.ui.b.a A; @NotNull
/*  20 */   private final b B; public a(float x, float y, float w, float h) { super("resourcepacks", "Resource Packs", "Resource Packs", x, y, w, h);
/*     */ 
/*     */     
/*  23 */     this.a = 70.0F;
/*  24 */     this.b = 20.0F;
/*  25 */     this.c = 53.333332F;
/*  26 */     this.d = 5.0F;
/*     */ 
/*     */     
/*  29 */     this.e = 12.0F;
/*  30 */     this.f = 0.75F;
/*     */     
/*  32 */     this.g = new ArrayList<>();
/*  33 */     this.h = new ArrayList<>();
/*  34 */     this.i = new LinkedHashMap<>();
/*  35 */     this.j = new LinkedHashMap<>();
/*  36 */     this.k = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  44 */     this.p = new LinkedHashMap<>();
/*  45 */     this.q = new LinkedHashMap<>();
/*     */ 
/*     */     
/*  48 */     this.r = new LinkedHashMap<>();
/*  49 */     this.s = new LinkedHashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     this.v = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     this.B = b.a(b.a((new b(x + w - 90.0F, y + 13.0F, 0.0F, 40.0F)).b(1.2F), "folder", false, null.a, 2, null), "reload", false, new Function0<Unit>(this) { public final void a() {
/*  70 */             if (b.a.h() != null) { b.a.h().refresh(); } else { b.a.h(); }
/*  71 */              a.k(this.a);
/*     */           }
/*     */         },  2, null);
/*     */ 
/*     */     
/*  76 */     f(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void f() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield g : Ljava/util/ArrayList;
/*     */     //   4: invokevirtual clear : ()V
/*     */     //   7: aload_0
/*     */     //   8: getfield h : Ljava/util/List;
/*     */     //   11: invokeinterface clear : ()V
/*     */     //   16: aload_0
/*     */     //   17: getfield i : Ljava/util/Map;
/*     */     //   20: invokeinterface clear : ()V
/*     */     //   25: aload_0
/*     */     //   26: getfield k : Ljava/util/List;
/*     */     //   29: invokeinterface clear : ()V
/*     */     //   34: aload_0
/*     */     //   35: getfield q : Ljava/util/Map;
/*     */     //   38: invokeinterface clear : ()V
/*     */     //   43: getstatic eu/shoroa/bridge/feature/a/b.a : Leu/shoroa/bridge/feature/a/b$a;
/*     */     //   46: invokevirtual h : ()Leu/shoroa/bridge/feature/a/a/g;
/*     */     //   49: dup
/*     */     //   50: ifnull -> 438
/*     */     //   53: astore_1
/*     */     //   54: iconst_0
/*     */     //   55: istore_2
/*     */     //   56: aload_1
/*     */     //   57: invokeinterface dir : ()Ljava/io/File;
/*     */     //   62: astore_3
/*     */     //   63: aload_0
/*     */     //   64: getfield g : Ljava/util/ArrayList;
/*     */     //   67: aload_1
/*     */     //   68: invokeinterface allEntries : ()Ljava/util/ArrayList;
/*     */     //   73: checkcast java/util/Collection
/*     */     //   76: invokevirtual addAll : (Ljava/util/Collection;)Z
/*     */     //   79: pop
/*     */     //   80: aload_0
/*     */     //   81: getfield k : Ljava/util/List;
/*     */     //   84: aload_1
/*     */     //   85: invokeinterface activeEntries : ()Ljava/util/ArrayList;
/*     */     //   90: checkcast java/util/Collection
/*     */     //   93: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   98: pop
/*     */     //   99: aload_0
/*     */     //   100: getfield g : Ljava/util/ArrayList;
/*     */     //   103: checkcast java/lang/Iterable
/*     */     //   106: astore #4
/*     */     //   108: iconst_0
/*     */     //   109: istore #5
/*     */     //   111: aload #4
/*     */     //   113: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   118: astore #6
/*     */     //   120: aload #6
/*     */     //   122: invokeinterface hasNext : ()Z
/*     */     //   127: ifeq -> 433
/*     */     //   130: aload #6
/*     */     //   132: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   137: astore #7
/*     */     //   139: aload #7
/*     */     //   141: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   144: astore #8
/*     */     //   146: iconst_0
/*     */     //   147: istore #9
/*     */     //   149: aload_0
/*     */     //   150: getfield k : Ljava/util/List;
/*     */     //   153: checkcast java/lang/Iterable
/*     */     //   156: astore #10
/*     */     //   158: iconst_0
/*     */     //   159: istore #11
/*     */     //   161: aload #10
/*     */     //   163: instanceof java/util/Collection
/*     */     //   166: ifeq -> 186
/*     */     //   169: aload #10
/*     */     //   171: checkcast java/util/Collection
/*     */     //   174: invokeinterface isEmpty : ()Z
/*     */     //   179: ifeq -> 186
/*     */     //   182: iconst_0
/*     */     //   183: goto -> 250
/*     */     //   186: aload #10
/*     */     //   188: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   193: astore #12
/*     */     //   195: aload #12
/*     */     //   197: invokeinterface hasNext : ()Z
/*     */     //   202: ifeq -> 249
/*     */     //   205: aload #12
/*     */     //   207: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   212: astore #13
/*     */     //   214: aload #13
/*     */     //   216: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   219: astore #14
/*     */     //   221: iconst_0
/*     */     //   222: istore #15
/*     */     //   224: aload #14
/*     */     //   226: invokevirtual b : ()I
/*     */     //   229: aload #8
/*     */     //   231: invokevirtual b : ()I
/*     */     //   234: if_icmpne -> 241
/*     */     //   237: iconst_1
/*     */     //   238: goto -> 242
/*     */     //   241: iconst_0
/*     */     //   242: ifeq -> 195
/*     */     //   245: iconst_1
/*     */     //   246: goto -> 250
/*     */     //   249: iconst_0
/*     */     //   250: ifne -> 429
/*     */     //   253: aload #8
/*     */     //   255: invokevirtual a : ()Ljava/io/File;
/*     */     //   258: invokevirtual getParentFile : ()Ljava/io/File;
/*     */     //   261: astore #10
/*     */     //   263: aload #10
/*     */     //   265: ifnull -> 400
/*     */     //   268: aload #10
/*     */     //   270: aload_3
/*     */     //   271: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   274: ifne -> 400
/*     */     //   277: aload #10
/*     */     //   279: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   282: astore #11
/*     */     //   284: aload_0
/*     */     //   285: getfield i : Ljava/util/Map;
/*     */     //   288: astore #12
/*     */     //   290: aload #11
/*     */     //   292: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   295: aload #11
/*     */     //   297: astore #13
/*     */     //   299: iconst_0
/*     */     //   300: istore #14
/*     */     //   302: aload #12
/*     */     //   304: aload #13
/*     */     //   306: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   311: astore #15
/*     */     //   313: aload #15
/*     */     //   315: ifnonnull -> 351
/*     */     //   318: iconst_0
/*     */     //   319: istore #16
/*     */     //   321: new java/util/ArrayList
/*     */     //   324: dup
/*     */     //   325: invokespecial <init> : ()V
/*     */     //   328: checkcast java/util/List
/*     */     //   331: nop
/*     */     //   332: astore #16
/*     */     //   334: aload #12
/*     */     //   336: aload #13
/*     */     //   338: aload #16
/*     */     //   340: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   345: pop
/*     */     //   346: aload #16
/*     */     //   348: goto -> 353
/*     */     //   351: aload #15
/*     */     //   353: nop
/*     */     //   354: checkcast java/util/List
/*     */     //   357: aload #8
/*     */     //   359: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   364: pop
/*     */     //   365: aload_0
/*     */     //   366: getfield j : Ljava/util/Map;
/*     */     //   369: aload #11
/*     */     //   371: iconst_0
/*     */     //   372: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   375: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   380: pop
/*     */     //   381: aload_0
/*     */     //   382: getfield p : Ljava/util/Map;
/*     */     //   385: aload #11
/*     */     //   387: fconst_0
/*     */     //   388: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   391: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   396: pop
/*     */     //   397: goto -> 412
/*     */     //   400: aload_0
/*     */     //   401: getfield h : Ljava/util/List;
/*     */     //   404: aload #8
/*     */     //   406: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   411: pop
/*     */     //   412: aload_0
/*     */     //   413: getfield q : Ljava/util/Map;
/*     */     //   416: aload #8
/*     */     //   418: fconst_0
/*     */     //   419: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   422: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   427: pop
/*     */     //   428: nop
/*     */     //   429: nop
/*     */     //   430: goto -> 120
/*     */     //   433: nop
/*     */     //   434: nop
/*     */     //   435: goto -> 440
/*     */     //   438: pop
/*     */     //   439: nop
/*     */     //   440: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #82	-> 0
/*     */     //   #83	-> 7
/*     */     //   #84	-> 16
/*     */     //   #85	-> 25
/*     */     //   #86	-> 34
/*     */     //   #88	-> 43
/*     */     //   #89	-> 56
/*     */     //   #90	-> 63
/*     */     //   #91	-> 80
/*     */     //   #93	-> 99
/*     */     //   #483	-> 111
/*     */     //   #94	-> 149
/*     */     //   #484	-> 161
/*     */     //   #485	-> 186
/*     */     //   #94	-> 224
/*     */     //   #485	-> 242
/*     */     //   #486	-> 249
/*     */     //   #94	-> 250
/*     */     //   #96	-> 253
/*     */     //   #97	-> 263
/*     */     //   #98	-> 277
/*     */     //   #99	-> 284
/*     */     //   #487	-> 302
/*     */     //   #488	-> 313
/*     */     //   #489	-> 318
/*     */     //   #99	-> 321
/*     */     //   #489	-> 332
/*     */     //   #490	-> 334
/*     */     //   #491	-> 346
/*     */     //   #493	-> 351
/*     */     //   #488	-> 353
/*     */     //   #99	-> 357
/*     */     //   #100	-> 365
/*     */     //   #101	-> 381
/*     */     //   #103	-> 400
/*     */     //   #105	-> 412
/*     */     //   #106	-> 428
/*     */     //   #483	-> 429
/*     */     //   #494	-> 433
/*     */     //   #107	-> 434
/*     */     //   #88	-> 435
/*     */     //   #108	-> 440
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	441	0	this	Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */     //   54	381	1	repo	Leu/shoroa/bridge/feature/a/a/g;
/*     */     //   56	379	2	$i$a$-let-PageResourcePacks$loadPacks$1	I
/*     */     //   63	372	3	root	Ljava/io/File;
/*     */     //   108	326	4	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   111	323	5	$i$f$forEach	I
/*     */     //   139	291	7	element$iv	Ljava/lang/Object;
/*     */     //   146	283	8	pack	Leu/shoroa/bridge/d/c/a;
/*     */     //   149	280	9	$i$a$-forEach-PageResourcePacks$loadPacks$1$1	I
/*     */     //   158	92	10	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   161	89	11	$i$f$any	I
/*     */     //   214	35	13	element$iv	Ljava/lang/Object;
/*     */     //   221	21	14	it	Leu/shoroa/bridge/d/c/a;
/*     */     //   224	18	15	$i$a$-any-PageResourcePacks$loadPacks$1$1$1	I
/*     */     //   263	166	10	parent	Ljava/io/File;
/*     */     //   284	113	11	folderName	Ljava/lang/String;
/*     */     //   299	55	12	$this$getOrPut$iv	Ljava/util/Map;
/*     */     //   299	55	13	key$iv	Ljava/lang/Object;
/*     */     //   302	52	14	$i$f$getOrPut	I
/*     */     //   313	41	15	value$iv	Ljava/lang/Object;
/*     */     //   321	11	16	$i$a$-getOrPut-PageResourcePacks$loadPacks$1$1$2	I
/*     */     //   334	14	16	answer$iv	Ljava/lang/Object;
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
/*     */   private final void d(String searchText) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: checkcast java/lang/CharSequence
/*     */     //   4: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   7: ifeq -> 15
/*     */     //   10: aload_0
/*     */     //   11: invokespecial f : ()V
/*     */     //   14: return
/*     */     //   15: aload_0
/*     */     //   16: getfield h : Ljava/util/List;
/*     */     //   19: invokeinterface clear : ()V
/*     */     //   24: aload_0
/*     */     //   25: getfield i : Ljava/util/Map;
/*     */     //   28: invokeinterface clear : ()V
/*     */     //   33: aload_1
/*     */     //   34: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   37: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   40: dup
/*     */     //   41: ldc ''
/*     */     //   43: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   46: astore_2
/*     */     //   47: aload_0
/*     */     //   48: getfield g : Ljava/util/ArrayList;
/*     */     //   51: checkcast java/lang/Iterable
/*     */     //   54: astore_3
/*     */     //   55: iconst_0
/*     */     //   56: istore #4
/*     */     //   58: aload_3
/*     */     //   59: astore #5
/*     */     //   61: new java/util/ArrayList
/*     */     //   64: dup
/*     */     //   65: invokespecial <init> : ()V
/*     */     //   68: checkcast java/util/Collection
/*     */     //   71: astore #6
/*     */     //   73: iconst_0
/*     */     //   74: istore #7
/*     */     //   76: aload #5
/*     */     //   78: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   83: astore #8
/*     */     //   85: aload #8
/*     */     //   87: invokeinterface hasNext : ()Z
/*     */     //   92: ifeq -> 273
/*     */     //   95: aload #8
/*     */     //   97: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   102: astore #9
/*     */     //   104: aload #9
/*     */     //   106: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   109: astore #10
/*     */     //   111: iconst_0
/*     */     //   112: istore #11
/*     */     //   114: aload #10
/*     */     //   116: invokevirtual c : ()Ljava/lang/String;
/*     */     //   119: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   122: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   125: dup
/*     */     //   126: ldc ''
/*     */     //   128: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   131: checkcast java/lang/CharSequence
/*     */     //   134: aload_2
/*     */     //   135: checkcast java/lang/CharSequence
/*     */     //   138: iconst_0
/*     */     //   139: iconst_2
/*     */     //   140: aconst_null
/*     */     //   141: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   144: ifeq -> 255
/*     */     //   147: aload_0
/*     */     //   148: getfield k : Ljava/util/List;
/*     */     //   151: checkcast java/lang/Iterable
/*     */     //   154: astore #12
/*     */     //   156: iconst_0
/*     */     //   157: istore #13
/*     */     //   159: aload #12
/*     */     //   161: instanceof java/util/Collection
/*     */     //   164: ifeq -> 184
/*     */     //   167: aload #12
/*     */     //   169: checkcast java/util/Collection
/*     */     //   172: invokeinterface isEmpty : ()Z
/*     */     //   177: ifeq -> 184
/*     */     //   180: iconst_1
/*     */     //   181: goto -> 248
/*     */     //   184: aload #12
/*     */     //   186: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   191: astore #14
/*     */     //   193: aload #14
/*     */     //   195: invokeinterface hasNext : ()Z
/*     */     //   200: ifeq -> 247
/*     */     //   203: aload #14
/*     */     //   205: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   210: astore #15
/*     */     //   212: aload #15
/*     */     //   214: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   217: astore #16
/*     */     //   219: iconst_0
/*     */     //   220: istore #17
/*     */     //   222: aload #16
/*     */     //   224: invokevirtual b : ()I
/*     */     //   227: aload #10
/*     */     //   229: invokevirtual b : ()I
/*     */     //   232: if_icmpne -> 239
/*     */     //   235: iconst_1
/*     */     //   236: goto -> 240
/*     */     //   239: iconst_0
/*     */     //   240: ifeq -> 193
/*     */     //   243: iconst_0
/*     */     //   244: goto -> 248
/*     */     //   247: iconst_1
/*     */     //   248: ifeq -> 255
/*     */     //   251: iconst_1
/*     */     //   252: goto -> 256
/*     */     //   255: iconst_0
/*     */     //   256: nop
/*     */     //   257: ifeq -> 85
/*     */     //   260: aload #6
/*     */     //   262: aload #9
/*     */     //   264: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   269: pop
/*     */     //   270: goto -> 85
/*     */     //   273: aload #6
/*     */     //   275: checkcast java/util/List
/*     */     //   278: nop
/*     */     //   279: checkcast java/lang/Iterable
/*     */     //   282: astore_3
/*     */     //   283: nop
/*     */     //   284: iconst_0
/*     */     //   285: istore #4
/*     */     //   287: aload_3
/*     */     //   288: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   293: astore #5
/*     */     //   295: aload #5
/*     */     //   297: invokeinterface hasNext : ()Z
/*     */     //   302: ifeq -> 475
/*     */     //   305: aload #5
/*     */     //   307: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   312: astore #6
/*     */     //   314: aload #6
/*     */     //   316: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   319: astore #7
/*     */     //   321: iconst_0
/*     */     //   322: istore #8
/*     */     //   324: aload #7
/*     */     //   326: invokevirtual a : ()Ljava/io/File;
/*     */     //   329: invokevirtual getParentFile : ()Ljava/io/File;
/*     */     //   332: astore #9
/*     */     //   334: aload #9
/*     */     //   336: ifnull -> 458
/*     */     //   339: aload #9
/*     */     //   341: getstatic eu/shoroa/bridge/feature/a/b.a : Leu/shoroa/bridge/feature/a/b$a;
/*     */     //   344: invokevirtual h : ()Leu/shoroa/bridge/feature/a/a/g;
/*     */     //   347: dup
/*     */     //   348: ifnull -> 359
/*     */     //   351: invokeinterface dir : ()Ljava/io/File;
/*     */     //   356: goto -> 361
/*     */     //   359: pop
/*     */     //   360: aconst_null
/*     */     //   361: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   364: ifne -> 458
/*     */     //   367: aload #9
/*     */     //   369: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   372: astore #10
/*     */     //   374: aload_0
/*     */     //   375: getfield i : Ljava/util/Map;
/*     */     //   378: astore #11
/*     */     //   380: aload #10
/*     */     //   382: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   385: aload #10
/*     */     //   387: astore #12
/*     */     //   389: iconst_0
/*     */     //   390: istore #13
/*     */     //   392: aload #11
/*     */     //   394: aload #12
/*     */     //   396: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   401: astore #14
/*     */     //   403: aload #14
/*     */     //   405: ifnonnull -> 441
/*     */     //   408: iconst_0
/*     */     //   409: istore #15
/*     */     //   411: new java/util/ArrayList
/*     */     //   414: dup
/*     */     //   415: invokespecial <init> : ()V
/*     */     //   418: checkcast java/util/List
/*     */     //   421: nop
/*     */     //   422: astore #15
/*     */     //   424: aload #11
/*     */     //   426: aload #12
/*     */     //   428: aload #15
/*     */     //   430: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   435: pop
/*     */     //   436: aload #15
/*     */     //   438: goto -> 443
/*     */     //   441: aload #14
/*     */     //   443: nop
/*     */     //   444: checkcast java/util/List
/*     */     //   447: aload #7
/*     */     //   449: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   454: pop
/*     */     //   455: goto -> 470
/*     */     //   458: aload_0
/*     */     //   459: getfield h : Ljava/util/List;
/*     */     //   462: aload #7
/*     */     //   464: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   469: pop
/*     */     //   470: nop
/*     */     //   471: nop
/*     */     //   472: goto -> 295
/*     */     //   475: nop
/*     */     //   476: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #111	-> 0
/*     */     //   #112	-> 10
/*     */     //   #113	-> 14
/*     */     //   #115	-> 15
/*     */     //   #116	-> 24
/*     */     //   #118	-> 33
/*     */     //   #119	-> 47
/*     */     //   #495	-> 58
/*     */     //   #496	-> 76
/*     */     //   #120	-> 114
/*     */     //   #121	-> 147
/*     */     //   #497	-> 159
/*     */     //   #498	-> 184
/*     */     //   #121	-> 222
/*     */     //   #498	-> 240
/*     */     //   #499	-> 247
/*     */     //   #120	-> 256
/*     */     //   #496	-> 257
/*     */     //   #500	-> 273
/*     */     //   #495	-> 278
/*     */     //   #122	-> 283
/*     */     //   #501	-> 287
/*     */     //   #123	-> 324
/*     */     //   #124	-> 334
/*     */     //   #125	-> 367
/*     */     //   #126	-> 374
/*     */     //   #502	-> 392
/*     */     //   #503	-> 403
/*     */     //   #504	-> 408
/*     */     //   #126	-> 411
/*     */     //   #504	-> 422
/*     */     //   #505	-> 424
/*     */     //   #506	-> 436
/*     */     //   #508	-> 441
/*     */     //   #503	-> 443
/*     */     //   #126	-> 447
/*     */     //   #128	-> 458
/*     */     //   #130	-> 470
/*     */     //   #501	-> 471
/*     */     //   #509	-> 475
/*     */     //   #131	-> 476
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	477	0	this	Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */     //   0	477	1	searchText	Ljava/lang/String;
/*     */     //   47	430	2	lower	Ljava/lang/String;
/*     */     //   55	224	3	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   58	221	4	$i$f$filter	I
/*     */     //   73	202	5	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   73	202	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   76	199	7	$i$f$filterTo	I
/*     */     //   104	166	9	element$iv$iv	Ljava/lang/Object;
/*     */     //   111	146	10	it	Leu/shoroa/bridge/d/c/a;
/*     */     //   114	143	11	$i$a$-filter-PageResourcePacks$filterPacks$1	I
/*     */     //   156	92	12	$this$none$iv	Ljava/lang/Iterable;
/*     */     //   159	89	13	$i$f$none	I
/*     */     //   212	35	15	element$iv	Ljava/lang/Object;
/*     */     //   219	21	16	applied	Leu/shoroa/bridge/d/c/a;
/*     */     //   222	18	17	$i$a$-none-PageResourcePacks$filterPacks$1$1	I
/*     */     //   284	192	3	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   287	189	4	$i$f$forEach	I
/*     */     //   314	158	6	element$iv	Ljava/lang/Object;
/*     */     //   321	150	7	pack	Leu/shoroa/bridge/d/c/a;
/*     */     //   324	147	8	$i$a$-forEach-PageResourcePacks$filterPacks$2	I
/*     */     //   334	137	9	parent	Ljava/io/File;
/*     */     //   374	81	10	folderName	Ljava/lang/String;
/*     */     //   389	55	11	$this$getOrPut$iv	Ljava/util/Map;
/*     */     //   389	55	12	key$iv	Ljava/lang/Object;
/*     */     //   392	52	13	$i$f$getOrPut	I
/*     */     //   403	41	14	value$iv	Ljava/lang/Object;
/*     */     //   411	11	15	$i$a$-getOrPut-PageResourcePacks$filterPacks$2$1	I
/*     */     //   424	14	15	answer$iv	Ljava/lang/Object;
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
/*     */   private final void a(eu.shoroa.bridge.d.c.a pack) {
/*     */     // Byte code:
/*     */     //   0: getstatic eu/shoroa/bridge/feature/a/b.a : Leu/shoroa/bridge/feature/a/b$a;
/*     */     //   3: invokevirtual h : ()Leu/shoroa/bridge/feature/a/a/g;
/*     */     //   6: dup
/*     */     //   7: ifnonnull -> 12
/*     */     //   10: pop
/*     */     //   11: return
/*     */     //   12: astore_2
/*     */     //   13: aload_2
/*     */     //   14: invokeinterface activeEntries : ()Ljava/util/ArrayList;
/*     */     //   19: astore_3
/*     */     //   20: aload_3
/*     */     //   21: checkcast java/lang/Iterable
/*     */     //   24: astore #4
/*     */     //   26: iconst_0
/*     */     //   27: istore #5
/*     */     //   29: aload #4
/*     */     //   31: instanceof java/util/Collection
/*     */     //   34: ifeq -> 54
/*     */     //   37: aload #4
/*     */     //   39: checkcast java/util/Collection
/*     */     //   42: invokeinterface isEmpty : ()Z
/*     */     //   47: ifeq -> 54
/*     */     //   50: iconst_1
/*     */     //   51: goto -> 117
/*     */     //   54: aload #4
/*     */     //   56: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   61: astore #6
/*     */     //   63: aload #6
/*     */     //   65: invokeinterface hasNext : ()Z
/*     */     //   70: ifeq -> 116
/*     */     //   73: aload #6
/*     */     //   75: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   80: astore #7
/*     */     //   82: aload #7
/*     */     //   84: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   87: astore #8
/*     */     //   89: iconst_0
/*     */     //   90: istore #9
/*     */     //   92: aload #8
/*     */     //   94: invokevirtual b : ()I
/*     */     //   97: aload_1
/*     */     //   98: invokevirtual b : ()I
/*     */     //   101: if_icmpne -> 108
/*     */     //   104: iconst_1
/*     */     //   105: goto -> 109
/*     */     //   108: iconst_0
/*     */     //   109: ifeq -> 63
/*     */     //   112: iconst_0
/*     */     //   113: goto -> 117
/*     */     //   116: iconst_1
/*     */     //   117: ifeq -> 153
/*     */     //   120: aload_3
/*     */     //   121: aload_1
/*     */     //   122: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   125: pop
/*     */     //   126: aload_2
/*     */     //   127: new java/util/ArrayList
/*     */     //   130: dup
/*     */     //   131: aload_3
/*     */     //   132: checkcast java/util/Collection
/*     */     //   135: invokespecial <init> : (Ljava/util/Collection;)V
/*     */     //   138: invokeinterface setActiveEntries : (Ljava/util/ArrayList;)V
/*     */     //   143: aload_2
/*     */     //   144: invokeinterface refresh : ()V
/*     */     //   149: aload_0
/*     */     //   150: invokespecial f : ()V
/*     */     //   153: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #134	-> 0
/*     */     //   #135	-> 13
/*     */     //   #137	-> 20
/*     */     //   #510	-> 29
/*     */     //   #511	-> 54
/*     */     //   #137	-> 92
/*     */     //   #511	-> 109
/*     */     //   #512	-> 116
/*     */     //   #137	-> 117
/*     */     //   #138	-> 120
/*     */     //   #139	-> 126
/*     */     //   #140	-> 143
/*     */     //   #141	-> 149
/*     */     //   #143	-> 153
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	154	0	this	Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */     //   0	154	1	pack	Leu/shoroa/bridge/d/c/a;
/*     */     //   13	141	2	rpr	Leu/shoroa/bridge/feature/a/a/g;
/*     */     //   20	134	3	active	Ljava/util/ArrayList;
/*     */     //   26	91	4	$this$none$iv	Ljava/lang/Iterable;
/*     */     //   29	88	5	$i$f$none	I
/*     */     //   82	34	7	element$iv	Ljava/lang/Object;
/*     */     //   89	20	8	it	Leu/shoroa/bridge/d/c/a;
/*     */     //   92	17	9	$i$a$-none-PageResourcePacks$applyPack$1	I
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
/*     */   private final void b(eu.shoroa.bridge.d.c.a pack) {
/*     */     // Byte code:
/*     */     //   0: getstatic eu/shoroa/bridge/feature/a/b.a : Leu/shoroa/bridge/feature/a/b$a;
/*     */     //   3: invokevirtual h : ()Leu/shoroa/bridge/feature/a/a/g;
/*     */     //   6: dup
/*     */     //   7: ifnonnull -> 12
/*     */     //   10: pop
/*     */     //   11: return
/*     */     //   12: astore_2
/*     */     //   13: aload_2
/*     */     //   14: invokeinterface activeEntries : ()Ljava/util/ArrayList;
/*     */     //   19: astore_3
/*     */     //   20: aload_3
/*     */     //   21: checkcast java/lang/Iterable
/*     */     //   24: astore #4
/*     */     //   26: iconst_0
/*     */     //   27: istore #5
/*     */     //   29: aload #4
/*     */     //   31: instanceof java/util/Collection
/*     */     //   34: ifeq -> 54
/*     */     //   37: aload #4
/*     */     //   39: checkcast java/util/Collection
/*     */     //   42: invokeinterface isEmpty : ()Z
/*     */     //   47: ifeq -> 54
/*     */     //   50: iconst_0
/*     */     //   51: goto -> 117
/*     */     //   54: aload #4
/*     */     //   56: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   61: astore #6
/*     */     //   63: aload #6
/*     */     //   65: invokeinterface hasNext : ()Z
/*     */     //   70: ifeq -> 116
/*     */     //   73: aload #6
/*     */     //   75: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   80: astore #7
/*     */     //   82: aload #7
/*     */     //   84: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   87: astore #8
/*     */     //   89: iconst_0
/*     */     //   90: istore #9
/*     */     //   92: aload #8
/*     */     //   94: invokevirtual b : ()I
/*     */     //   97: aload_1
/*     */     //   98: invokevirtual b : ()I
/*     */     //   101: if_icmpne -> 108
/*     */     //   104: iconst_1
/*     */     //   105: goto -> 109
/*     */     //   108: iconst_0
/*     */     //   109: ifeq -> 63
/*     */     //   112: iconst_1
/*     */     //   113: goto -> 117
/*     */     //   116: iconst_0
/*     */     //   117: ifeq -> 255
/*     */     //   120: aload_3
/*     */     //   121: checkcast java/lang/Iterable
/*     */     //   124: astore #5
/*     */     //   126: iconst_0
/*     */     //   127: istore #6
/*     */     //   129: aload #5
/*     */     //   131: astore #7
/*     */     //   133: new java/util/ArrayList
/*     */     //   136: dup
/*     */     //   137: invokespecial <init> : ()V
/*     */     //   140: checkcast java/util/Collection
/*     */     //   143: astore #8
/*     */     //   145: iconst_0
/*     */     //   146: istore #9
/*     */     //   148: aload #7
/*     */     //   150: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   155: astore #10
/*     */     //   157: aload #10
/*     */     //   159: invokeinterface hasNext : ()Z
/*     */     //   164: ifeq -> 219
/*     */     //   167: aload #10
/*     */     //   169: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   174: astore #11
/*     */     //   176: aload #11
/*     */     //   178: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   181: astore #12
/*     */     //   183: iconst_0
/*     */     //   184: istore #13
/*     */     //   186: aload #12
/*     */     //   188: invokevirtual b : ()I
/*     */     //   191: aload_1
/*     */     //   192: invokevirtual b : ()I
/*     */     //   195: if_icmpeq -> 202
/*     */     //   198: iconst_1
/*     */     //   199: goto -> 203
/*     */     //   202: iconst_0
/*     */     //   203: ifeq -> 157
/*     */     //   206: aload #8
/*     */     //   208: aload #11
/*     */     //   210: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   215: pop
/*     */     //   216: goto -> 157
/*     */     //   219: aload #8
/*     */     //   221: checkcast java/util/List
/*     */     //   224: nop
/*     */     //   225: astore #4
/*     */     //   227: aload_2
/*     */     //   228: new java/util/ArrayList
/*     */     //   231: dup
/*     */     //   232: aload #4
/*     */     //   234: checkcast java/util/Collection
/*     */     //   237: invokespecial <init> : (Ljava/util/Collection;)V
/*     */     //   240: invokeinterface setActiveEntries : (Ljava/util/ArrayList;)V
/*     */     //   245: aload_2
/*     */     //   246: invokeinterface refresh : ()V
/*     */     //   251: aload_0
/*     */     //   252: invokespecial f : ()V
/*     */     //   255: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #146	-> 0
/*     */     //   #147	-> 13
/*     */     //   #149	-> 20
/*     */     //   #513	-> 29
/*     */     //   #514	-> 54
/*     */     //   #149	-> 92
/*     */     //   #514	-> 109
/*     */     //   #515	-> 116
/*     */     //   #149	-> 117
/*     */     //   #150	-> 120
/*     */     //   #516	-> 129
/*     */     //   #517	-> 148
/*     */     //   #150	-> 186
/*     */     //   #517	-> 203
/*     */     //   #518	-> 219
/*     */     //   #516	-> 224
/*     */     //   #150	-> 225
/*     */     //   #151	-> 227
/*     */     //   #152	-> 245
/*     */     //   #153	-> 251
/*     */     //   #155	-> 255
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	256	0	this	Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */     //   0	256	1	pack	Leu/shoroa/bridge/d/c/a;
/*     */     //   13	243	2	rpr	Leu/shoroa/bridge/feature/a/a/g;
/*     */     //   20	236	3	active	Ljava/util/ArrayList;
/*     */     //   26	91	4	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   29	88	5	$i$f$any	I
/*     */     //   82	34	7	element$iv	Ljava/lang/Object;
/*     */     //   89	20	8	it	Leu/shoroa/bridge/d/c/a;
/*     */     //   92	17	9	$i$a$-any-PageResourcePacks$removePack$1	I
/*     */     //   126	99	5	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   129	96	6	$i$f$filter	I
/*     */     //   145	76	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   145	76	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   148	73	9	$i$f$filterTo	I
/*     */     //   176	40	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   183	20	12	it	Leu/shoroa/bridge/d/c/a;
/*     */     //   186	17	13	$i$a$-filter-PageResourcePacks$removePack$updated$1	I
/*     */     //   227	28	4	updated	Ljava/util/List;
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
/*     */   public void render(float mx, float my, float delta) {
/* 160 */     b(delta);
/* 161 */     this.r.clear();
/* 162 */     this.s.clear();
/* 163 */     this.B.render(mx, my, delta);
/*     */ 
/*     */ 
/*     */     
/* 167 */     if (this.w != null) { this.w.render(mx, my, delta); } else {  }
/* 168 */      if (this.x != null) { this.x.render(mx, my, delta); } else {  }
/* 169 */      if (this.y != null) { this.y.render(mx, my, delta); }
/*     */     else
/*     */     {  }
/*     */ 
/*     */     
/* 174 */     Ref.FloatRef offset = new Ref.FloatRef(); offset.element = getY() + this.a + 10.0F - this.t;
/* 175 */     float clipH = getH() - this.a - 30.0F;
/*     */ 
/*     */     
/* 178 */     d.a.a(getX(), getY() + this.a, getW(), clipH, new Function0<Unit>(this, offset, mx, my)
/*     */         {
/*     */           public final void a()
/*     */           {
/*     */             // Byte code:
/*     */             //   0: aload_0
/*     */             //   1: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   4: fconst_0
/*     */             //   5: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   8: aload_0
/*     */             //   9: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   12: ldc 'Folders'
/*     */             //   14: aload_0
/*     */             //   15: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   18: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/Map;
/*     */             //   21: invokeinterface size : ()I
/*     */             //   26: aload_0
/*     */             //   27: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   30: invokevirtual getX : ()F
/*     */             //   33: aload_0
/*     */             //   34: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   37: invokestatic b : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   40: fadd
/*     */             //   41: aload_0
/*     */             //   42: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   45: getfield element : F
/*     */             //   48: ldc 10.0
/*     */             //   50: fadd
/*     */             //   51: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */             //   54: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */             //   57: invokevirtual e : ()Ljava/awt/Color;
/*     */             //   60: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;Ljava/lang/String;IFFLjava/awt/Color;)V
/*     */             //   63: aload_0
/*     */             //   64: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   67: aload_0
/*     */             //   68: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   71: getfield element : F
/*     */             //   74: ldc 30.0
/*     */             //   76: fadd
/*     */             //   77: putfield element : F
/*     */             //   80: aload_0
/*     */             //   81: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   84: astore_1
/*     */             //   85: aload_1
/*     */             //   86: aload_1
/*     */             //   87: invokestatic c : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   90: ldc 30.0
/*     */             //   92: fadd
/*     */             //   93: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   96: aload_0
/*     */             //   97: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   100: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/Map;
/*     */             //   103: astore_1
/*     */             //   104: aload_0
/*     */             //   105: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   108: astore_2
/*     */             //   109: aload_0
/*     */             //   110: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   113: astore_3
/*     */             //   114: aload_0
/*     */             //   115: getfield $c : F
/*     */             //   118: fstore #4
/*     */             //   120: aload_0
/*     */             //   121: getfield $d : F
/*     */             //   124: fstore #5
/*     */             //   126: iconst_0
/*     */             //   127: istore #6
/*     */             //   129: aload_1
/*     */             //   130: invokeinterface entrySet : ()Ljava/util/Set;
/*     */             //   135: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */             //   140: astore #7
/*     */             //   142: aload #7
/*     */             //   144: invokeinterface hasNext : ()Z
/*     */             //   149: ifeq -> 466
/*     */             //   152: aload #7
/*     */             //   154: invokeinterface next : ()Ljava/lang/Object;
/*     */             //   159: checkcast java/util/Map$Entry
/*     */             //   162: astore #8
/*     */             //   164: aload #8
/*     */             //   166: astore #9
/*     */             //   168: iconst_0
/*     */             //   169: istore #10
/*     */             //   171: aload #9
/*     */             //   173: invokeinterface getKey : ()Ljava/lang/Object;
/*     */             //   178: checkcast java/lang/String
/*     */             //   181: astore #11
/*     */             //   183: aload #9
/*     */             //   185: invokeinterface getValue : ()Ljava/lang/Object;
/*     */             //   190: checkcast java/util/List
/*     */             //   193: astore #12
/*     */             //   195: aload_2
/*     */             //   196: getfield element : F
/*     */             //   199: fstore #13
/*     */             //   201: aload_3
/*     */             //   202: invokestatic h : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/Map;
/*     */             //   205: aload #11
/*     */             //   207: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */             //   212: checkcast java/lang/Boolean
/*     */             //   215: dup
/*     */             //   216: ifnull -> 225
/*     */             //   219: invokevirtual booleanValue : ()Z
/*     */             //   222: goto -> 227
/*     */             //   225: pop
/*     */             //   226: iconst_0
/*     */             //   227: istore #14
/*     */             //   229: aload_3
/*     */             //   230: aload #11
/*     */             //   232: fload #13
/*     */             //   234: iload #14
/*     */             //   236: fload #4
/*     */             //   238: fload #5
/*     */             //   240: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;Ljava/lang/String;FZFF)V
/*     */             //   243: aload_3
/*     */             //   244: invokestatic i : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/Map;
/*     */             //   247: aload #11
/*     */             //   249: new eu/shoroa/bridge/ui/clickgui/comp/b/a/b
/*     */             //   252: dup
/*     */             //   253: aload_3
/*     */             //   254: invokevirtual getX : ()F
/*     */             //   257: aload_3
/*     */             //   258: invokestatic b : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   261: fadd
/*     */             //   262: fload #13
/*     */             //   264: aload_3
/*     */             //   265: invokevirtual getW : ()F
/*     */             //   268: aload_3
/*     */             //   269: invokestatic b : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   272: fconst_2
/*     */             //   273: fmul
/*     */             //   274: fsub
/*     */             //   275: ldc 35.0
/*     */             //   277: invokespecial <init> : (FFFF)V
/*     */             //   280: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */             //   285: pop
/*     */             //   286: aload_2
/*     */             //   287: aload_2
/*     */             //   288: getfield element : F
/*     */             //   291: ldc 45.0
/*     */             //   293: fadd
/*     */             //   294: putfield element : F
/*     */             //   297: aload_3
/*     */             //   298: aload_3
/*     */             //   299: invokestatic c : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   302: ldc 40.0
/*     */             //   304: fadd
/*     */             //   305: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   308: aload_3
/*     */             //   309: invokestatic j : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/Map;
/*     */             //   312: aload #11
/*     */             //   314: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */             //   319: checkcast java/lang/Float
/*     */             //   322: dup
/*     */             //   323: ifnull -> 332
/*     */             //   326: invokevirtual floatValue : ()F
/*     */             //   329: goto -> 334
/*     */             //   332: pop
/*     */             //   333: fconst_0
/*     */             //   334: fstore #15
/*     */             //   336: fload #15
/*     */             //   338: ldc 0.01
/*     */             //   340: fcmpg
/*     */             //   341: ifle -> 462
/*     */             //   344: aload #12
/*     */             //   346: checkcast java/lang/Iterable
/*     */             //   349: astore #16
/*     */             //   351: iconst_0
/*     */             //   352: istore #17
/*     */             //   354: aload #16
/*     */             //   356: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */             //   361: astore #18
/*     */             //   363: aload #18
/*     */             //   365: invokeinterface hasNext : ()Z
/*     */             //   370: ifeq -> 460
/*     */             //   373: aload #18
/*     */             //   375: invokeinterface next : ()Ljava/lang/Object;
/*     */             //   380: astore #19
/*     */             //   382: aload #19
/*     */             //   384: checkcast eu/shoroa/bridge/d/c/a
/*     */             //   387: astore #20
/*     */             //   389: iconst_0
/*     */             //   390: istore #21
/*     */             //   392: aload_3
/*     */             //   393: aload #20
/*     */             //   395: aload_2
/*     */             //   396: getfield element : F
/*     */             //   399: fload #4
/*     */             //   401: fload #5
/*     */             //   403: fload #15
/*     */             //   405: iconst_0
/*     */             //   406: iconst_1
/*     */             //   407: bipush #32
/*     */             //   409: aconst_null
/*     */             //   410: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;Leu/shoroa/bridge/d/c/a;FFFFZZILjava/lang/Object;)V
/*     */             //   413: aload_2
/*     */             //   414: aload_2
/*     */             //   415: getfield element : F
/*     */             //   418: aload_3
/*     */             //   419: invokestatic f : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   422: aload_3
/*     */             //   423: invokestatic g : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   426: fadd
/*     */             //   427: fload #15
/*     */             //   429: fmul
/*     */             //   430: fadd
/*     */             //   431: putfield element : F
/*     */             //   434: aload_3
/*     */             //   435: aload_3
/*     */             //   436: invokestatic c : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   439: aload_3
/*     */             //   440: invokestatic f : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   443: aload_3
/*     */             //   444: invokestatic g : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   447: fadd
/*     */             //   448: fload #15
/*     */             //   450: fmul
/*     */             //   451: fadd
/*     */             //   452: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   455: nop
/*     */             //   456: nop
/*     */             //   457: goto -> 363
/*     */             //   460: nop
/*     */             //   461: nop
/*     */             //   462: nop
/*     */             //   463: goto -> 142
/*     */             //   466: nop
/*     */             //   467: aload_0
/*     */             //   468: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   471: invokestatic d : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/List;
/*     */             //   474: checkcast java/util/Collection
/*     */             //   477: invokeinterface isEmpty : ()Z
/*     */             //   482: ifne -> 489
/*     */             //   485: iconst_1
/*     */             //   486: goto -> 490
/*     */             //   489: iconst_0
/*     */             //   490: ifeq -> 716
/*     */             //   493: aload_0
/*     */             //   494: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   497: ldc 'Other Packs'
/*     */             //   499: aload_0
/*     */             //   500: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   503: invokestatic d : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/List;
/*     */             //   506: invokeinterface size : ()I
/*     */             //   511: aload_0
/*     */             //   512: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   515: invokevirtual getX : ()F
/*     */             //   518: aload_0
/*     */             //   519: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   522: invokestatic b : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   525: fadd
/*     */             //   526: aload_0
/*     */             //   527: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   530: getfield element : F
/*     */             //   533: ldc 10.0
/*     */             //   535: fadd
/*     */             //   536: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */             //   539: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */             //   542: invokevirtual e : ()Ljava/awt/Color;
/*     */             //   545: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;Ljava/lang/String;IFFLjava/awt/Color;)V
/*     */             //   548: aload_0
/*     */             //   549: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   552: aload_0
/*     */             //   553: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   556: getfield element : F
/*     */             //   559: ldc 30.0
/*     */             //   561: fadd
/*     */             //   562: putfield element : F
/*     */             //   565: aload_0
/*     */             //   566: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   569: astore_1
/*     */             //   570: aload_1
/*     */             //   571: aload_1
/*     */             //   572: invokestatic c : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   575: ldc 30.0
/*     */             //   577: fadd
/*     */             //   578: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   581: aload_0
/*     */             //   582: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   585: invokestatic d : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/List;
/*     */             //   588: checkcast java/lang/Iterable
/*     */             //   591: astore_1
/*     */             //   592: aload_0
/*     */             //   593: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   596: astore_2
/*     */             //   597: aload_0
/*     */             //   598: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   601: astore_3
/*     */             //   602: aload_0
/*     */             //   603: getfield $c : F
/*     */             //   606: fstore #4
/*     */             //   608: aload_0
/*     */             //   609: getfield $d : F
/*     */             //   612: fstore #5
/*     */             //   614: iconst_0
/*     */             //   615: istore #6
/*     */             //   617: aload_1
/*     */             //   618: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */             //   623: astore #7
/*     */             //   625: aload #7
/*     */             //   627: invokeinterface hasNext : ()Z
/*     */             //   632: ifeq -> 715
/*     */             //   635: aload #7
/*     */             //   637: invokeinterface next : ()Ljava/lang/Object;
/*     */             //   642: astore #8
/*     */             //   644: aload #8
/*     */             //   646: checkcast eu/shoroa/bridge/d/c/a
/*     */             //   649: astore #9
/*     */             //   651: iconst_0
/*     */             //   652: istore #10
/*     */             //   654: aload_2
/*     */             //   655: aload #9
/*     */             //   657: aload_3
/*     */             //   658: getfield element : F
/*     */             //   661: fload #4
/*     */             //   663: fload #5
/*     */             //   665: fconst_0
/*     */             //   666: iconst_0
/*     */             //   667: iconst_0
/*     */             //   668: bipush #112
/*     */             //   670: aconst_null
/*     */             //   671: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;Leu/shoroa/bridge/d/c/a;FFFFZZILjava/lang/Object;)V
/*     */             //   674: aload_3
/*     */             //   675: aload_3
/*     */             //   676: getfield element : F
/*     */             //   679: aload_2
/*     */             //   680: invokestatic f : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   683: aload_2
/*     */             //   684: invokestatic g : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   687: fadd
/*     */             //   688: fadd
/*     */             //   689: putfield element : F
/*     */             //   692: aload_2
/*     */             //   693: aload_2
/*     */             //   694: invokestatic c : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   697: aload_2
/*     */             //   698: invokestatic f : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   701: aload_2
/*     */             //   702: invokestatic g : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   705: fadd
/*     */             //   706: fadd
/*     */             //   707: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   710: nop
/*     */             //   711: nop
/*     */             //   712: goto -> 625
/*     */             //   715: nop
/*     */             //   716: aload_0
/*     */             //   717: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   720: invokestatic e : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/List;
/*     */             //   723: checkcast java/util/Collection
/*     */             //   726: invokeinterface isEmpty : ()Z
/*     */             //   731: ifne -> 738
/*     */             //   734: iconst_1
/*     */             //   735: goto -> 739
/*     */             //   738: iconst_0
/*     */             //   739: ifeq -> 965
/*     */             //   742: aload_0
/*     */             //   743: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   746: ldc 'Applied Packs'
/*     */             //   748: aload_0
/*     */             //   749: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   752: invokestatic e : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/List;
/*     */             //   755: invokeinterface size : ()I
/*     */             //   760: aload_0
/*     */             //   761: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   764: invokevirtual getX : ()F
/*     */             //   767: aload_0
/*     */             //   768: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   771: invokestatic b : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   774: fadd
/*     */             //   775: aload_0
/*     */             //   776: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   779: getfield element : F
/*     */             //   782: ldc 10.0
/*     */             //   784: fadd
/*     */             //   785: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */             //   788: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */             //   791: invokevirtual e : ()Ljava/awt/Color;
/*     */             //   794: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;Ljava/lang/String;IFFLjava/awt/Color;)V
/*     */             //   797: aload_0
/*     */             //   798: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   801: aload_0
/*     */             //   802: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   805: getfield element : F
/*     */             //   808: ldc 30.0
/*     */             //   810: fadd
/*     */             //   811: putfield element : F
/*     */             //   814: aload_0
/*     */             //   815: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   818: astore_1
/*     */             //   819: aload_1
/*     */             //   820: aload_1
/*     */             //   821: invokestatic c : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   824: ldc 30.0
/*     */             //   826: fadd
/*     */             //   827: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   830: aload_0
/*     */             //   831: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   834: invokestatic e : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)Ljava/util/List;
/*     */             //   837: checkcast java/lang/Iterable
/*     */             //   840: astore_1
/*     */             //   841: aload_0
/*     */             //   842: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */             //   845: astore_2
/*     */             //   846: aload_0
/*     */             //   847: getfield $b : Lkotlin/jvm/internal/Ref$FloatRef;
/*     */             //   850: astore_3
/*     */             //   851: aload_0
/*     */             //   852: getfield $c : F
/*     */             //   855: fstore #4
/*     */             //   857: aload_0
/*     */             //   858: getfield $d : F
/*     */             //   861: fstore #5
/*     */             //   863: iconst_0
/*     */             //   864: istore #6
/*     */             //   866: aload_1
/*     */             //   867: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */             //   872: astore #7
/*     */             //   874: aload #7
/*     */             //   876: invokeinterface hasNext : ()Z
/*     */             //   881: ifeq -> 964
/*     */             //   884: aload #7
/*     */             //   886: invokeinterface next : ()Ljava/lang/Object;
/*     */             //   891: astore #8
/*     */             //   893: aload #8
/*     */             //   895: checkcast eu/shoroa/bridge/d/c/a
/*     */             //   898: astore #9
/*     */             //   900: iconst_0
/*     */             //   901: istore #10
/*     */             //   903: aload_2
/*     */             //   904: aload #9
/*     */             //   906: aload_3
/*     */             //   907: getfield element : F
/*     */             //   910: fload #4
/*     */             //   912: fload #5
/*     */             //   914: fconst_0
/*     */             //   915: iconst_1
/*     */             //   916: iconst_0
/*     */             //   917: bipush #80
/*     */             //   919: aconst_null
/*     */             //   920: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;Leu/shoroa/bridge/d/c/a;FFFFZZILjava/lang/Object;)V
/*     */             //   923: aload_3
/*     */             //   924: aload_3
/*     */             //   925: getfield element : F
/*     */             //   928: aload_2
/*     */             //   929: invokestatic f : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   932: aload_2
/*     */             //   933: invokestatic g : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   936: fadd
/*     */             //   937: fadd
/*     */             //   938: putfield element : F
/*     */             //   941: aload_2
/*     */             //   942: aload_2
/*     */             //   943: invokestatic c : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   946: aload_2
/*     */             //   947: invokestatic f : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   950: aload_2
/*     */             //   951: invokestatic g : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;)F
/*     */             //   954: fadd
/*     */             //   955: fadd
/*     */             //   956: invokestatic a : (Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;F)V
/*     */             //   959: nop
/*     */             //   960: nop
/*     */             //   961: goto -> 874
/*     */             //   964: nop
/*     */             //   965: return
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #179	-> 0
/*     */             //   #182	-> 8
/*     */             //   #183	-> 63
/*     */             //   #184	-> 80
/*     */             //   #187	-> 96
/*     */             //   #483	-> 129
/*     */             //   #187	-> 171
/*     */             //   #188	-> 195
/*     */             //   #189	-> 201
/*     */             //   #190	-> 229
/*     */             //   #193	-> 243
/*     */             //   #196	-> 286
/*     */             //   #197	-> 297
/*     */             //   #200	-> 308
/*     */             //   #201	-> 336
/*     */             //   #204	-> 344
/*     */             //   #484	-> 354
/*     */             //   #205	-> 392
/*     */             //   #206	-> 413
/*     */             //   #207	-> 434
/*     */             //   #208	-> 455
/*     */             //   #484	-> 456
/*     */             //   #485	-> 460
/*     */             //   #209	-> 461
/*     */             //   #483	-> 462
/*     */             //   #486	-> 466
/*     */             //   #212	-> 467
/*     */             //   #213	-> 493
/*     */             //   #214	-> 548
/*     */             //   #215	-> 565
/*     */             //   #216	-> 581
/*     */             //   #487	-> 617
/*     */             //   #217	-> 654
/*     */             //   #218	-> 674
/*     */             //   #219	-> 692
/*     */             //   #220	-> 710
/*     */             //   #487	-> 711
/*     */             //   #488	-> 715
/*     */             //   #224	-> 716
/*     */             //   #225	-> 742
/*     */             //   #226	-> 797
/*     */             //   #227	-> 814
/*     */             //   #228	-> 830
/*     */             //   #489	-> 866
/*     */             //   #229	-> 903
/*     */             //   #230	-> 923
/*     */             //   #231	-> 941
/*     */             //   #232	-> 959
/*     */             //   #489	-> 960
/*     */             //   #490	-> 964
/*     */             //   #234	-> 965
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   0	966	0	this	Leu/shoroa/bridge/ui/clickgui/comp/b/a/a$3;
/*     */             //   126	341	1	$this$forEach$iv	Ljava/util/Map;
/*     */             //   129	338	6	$i$f$forEach	I
/*     */             //   164	299	8	element$iv	Ljava/util/Map$Entry;
/*     */             //   171	291	10	$i$a$-forEach-PageResourcePacks$render$1$1	I
/*     */             //   183	279	11	folderName	Ljava/lang/String;
/*     */             //   195	267	12	packs	Ljava/util/List;
/*     */             //   201	261	13	headerY	F
/*     */             //   229	233	14	expanded	Z
/*     */             //   336	126	15	expansion	F
/*     */             //   351	110	16	$this$forEach$iv	Ljava/lang/Iterable;
/*     */             //   354	107	17	$i$f$forEach	I
/*     */             //   382	75	19	element$iv	Ljava/lang/Object;
/*     */             //   389	67	20	pack	Leu/shoroa/bridge/d/c/a;
/*     */             //   392	64	21	$i$a$-forEach-PageResourcePacks$render$1$1$1	I
/*     */             //   614	102	1	$this$forEach$iv	Ljava/lang/Iterable;
/*     */             //   617	99	6	$i$f$forEach	I
/*     */             //   644	68	8	element$iv	Ljava/lang/Object;
/*     */             //   651	60	9	pack	Leu/shoroa/bridge/d/c/a;
/*     */             //   654	57	10	$i$a$-forEach-PageResourcePacks$render$1$2	I
/*     */             //   863	102	1	$this$forEach$iv	Ljava/lang/Iterable;
/*     */             //   866	99	6	$i$f$forEach	I
/*     */             //   893	68	8	element$iv	Ljava/lang/Object;
/*     */             //   900	60	9	pack	Leu/shoroa/bridge/d/c/a;
/*     */             //   903	57	10	$i$a$-forEach-PageResourcePacks$render$1$3	I
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     if (this.u > clipH) {
/* 238 */       float scrollBarW = 8.0F;
/* 239 */       float trackX = getX() + getW() - this.b / 2.0F - scrollBarW;
/* 240 */       float trackY = getY() + this.a + 8.0F;
/* 241 */       float trackH = clipH - 16.0F;
/* 242 */       float handleH = clipH / this.u * trackH;
/* 243 */       float handleY = trackY + RangesKt.coerceIn(this.t / (this.u - clipH), 0.0F, 1.0F) * (trackH - handleH);
/* 244 */       d.a(d.a, trackX, trackY, scrollBarW, trackH, 4.0F, d.a.a(new Color(40, 40, 40, 160)), 0.0F, 64, null);
/* 245 */       d.a(d.a, trackX, handleY, scrollBarW, handleH, 4.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().f()), 0.0F, 64, null);
/*     */     } 
/*     */ 
/*     */     
/* 249 */     if (this.m != null) b(mx, my, delta);
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   private final float a(float f1, float f2, float t) {
/* 255 */     return f1 + (f2 - f1) * RangesKt.coerceIn(t, 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private final void a(String title, int count, float posX, float offset, Color color) {
/* 259 */     float textSize = 14.0F;
/* 260 */     d.b(d.a, title + " (" + title + ")", posX, offset, "semibold", textSize, color, d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*     */   }
/*     */   
/*     */   private final void a(String folderName, float posY, boolean expanded, float mx, float my) {
/* 264 */     b rect = new b(getX() + this.b, posY, getW() - this.b * 2.0F, 35.0F);
/* 265 */     boolean hovered = rect.a(mx, my);
/*     */     
/* 267 */     Color bg = hovered ? eu.shoroa.bridge.d.e.a.a.k().c().darker() : eu.shoroa.bridge.d.e.a.a.k().c().darker();
/* 268 */     Color bgStroke = hovered ? eu.shoroa.bridge.d.e.a.a.k().d() : eu.shoroa.bridge.d.e.a.a.k().d();
/* 269 */     Intrinsics.checkNotNull(bg); d.a(d.a, rect.a(), rect.b(), rect.c(), rect.d(), 8.0F, d.a.a(bg), 0.0F, 64, null);
/* 270 */     d.a(d.a, rect.a(), rect.b(), rect.c(), rect.d(), 8.0F, d.a.a(bgStroke).a(1.0F), 0.0F, 64, null);
/*     */     
/* 272 */     String chevron = expanded ? "▼" : "▶";
/* 273 */     a(chevron, rect.a() + 14.0F, rect.b() + 9.0F, "regular", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e());
/*     */     
/* 275 */     a(folderName, rect.a() + 38.0F, rect.b() + 10.0F, "semibold", 14.0F, eu.shoroa.bridge.d.e.a.a.k().e());
/*     */   }
/*     */   private final boolean a(eu.shoroa.bridge.d.c.a pack, float mx, float my) {
/*     */     b rect;
/* 279 */     if ((b)this.s.get(pack) == null) { (b)this.s.get(pack); return false; }
/* 280 */      return rect.a(mx, my);
/*     */   }
/*     */   
/*     */   private final void b(float delta) {
/* 284 */     float speed = delta * 6.0F;
/* 285 */     Map<String, Boolean> $this$forEach$iv = this.j; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 519 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-PageResourcePacks$updateAnimations$1 = 0;
/*     */       String folder = (String)entry1.getKey();
/*     */       boolean expanded = ((Boolean)entry1.getValue()).booleanValue(); }
/*     */   
/*     */   }
/*     */   
/*     */   private final void a(eu.shoroa.bridge.d.c.a pack, float posY, float mx, float my, float expansion, boolean applied, boolean insideFolder) {
/*     */     float baseHeight = this.c;
/*     */     float cardHeight = baseHeight * expansion;
/*     */     if (cardHeight < 5.0F)
/*     */       return; 
/*     */     float cardX = getX() + this.b;
/*     */     float cardW = getW() - this.b * 2.0F;
/*     */     this.s.put(pack, new b(cardX, posY, cardW, cardHeight));
/*     */     boolean hovered = a(pack, mx, my);
/*     */     (Float)this.q.get(pack);
/*     */     float prev = ((Float)this.q.get(pack) != null) ? ((Float)this.q.get(pack)).floatValue() : 0.0F;
/*     */     float hoverAnim = a(prev, hovered ? 1.0F : 0.0F, 0.2F);
/*     */     Float float_ = Float.valueOf(hoverAnim);
/*     */     this.q.put(pack, float_);
/*     */     Intrinsics.checkNotNullExpressionValue(eu.shoroa.bridge.d.e.a.a.k().c().darker(), "");
/*     */     d.a(d.a, cardX, posY, cardW, cardHeight, insideFolder ? 4.0F : 12.0F, hovered ? d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()) : d.a.a(eu.shoroa.bridge.d.e.a.a.k().c().darker()), 0.0F, 64, null);
/*     */     d.a(d.a, cardX, posY, cardW, cardHeight, insideFolder ? 4.0F : 12.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()).a(1.0F), 0.0F, 64, null);
/*     */     if (expansion > 0.05F) {
/*     */       float imageSize = 37.333332F * expansion;
/*     */       float imageX = cardX + 12.0F;
/*     */       float imageY = posY + (cardHeight - imageSize) / 2.0F;
/*     */       GL11.glBindTexture(3553, pack.b());
/*     */       d.a.a(imageX, imageY, imageSize, imageSize, 8.0F, expansion);
/*     */       float textX = imageX + imageSize + 12.0F;
/*     */       float titleY = posY + 13.0F;
/*     */       float descY = posY + 30.0F;
/*     */       int alpha = RangesKt.coerceIn((int)(expansion * 'ÿ'), 0, 255);
/*     */       Color titleColor = new Color(eu.shoroa.bridge.d.e.a.a.k().e().getRed(), eu.shoroa.bridge.d.e.a.a.k().e().getGreen(), eu.shoroa.bridge.d.e.a.a.k().e().getBlue(), alpha);
/*     */       Color descColor = new Color(eu.shoroa.bridge.d.e.a.a.k().d().getRed(), eu.shoroa.bridge.d.e.a.a.k().d().getGreen(), eu.shoroa.bridge.d.e.a.a.k().d().getBlue(), alpha);
/*     */       a(pack.c(), textX, titleY, "semibold", 10.0F, titleColor);
/*     */       a(StringsKt.take(pack.d(), 60), textX, descY, "regular", 10.0F, descColor);
/*     */       if (applied)
/*     */         d.a(d.a, cardX, posY, cardW, cardHeight, 12.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().f()).a(1.0F), 0.0F, 64, null); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void b(float mx, float my, float delta) {
/*     */     eu.shoroa.bridge.d.c.a pack;
/*     */     if (this.m == null)
/*     */       return; 
/*     */     float popupWidth = 360.0F;
/*     */     float popupHeight = 240.0F;
/*     */     float posX = this.n;
/*     */     float posY = this.o;
/*     */     if (posX + popupWidth > getX() + getW())
/*     */       posX = getX() + getW() - popupWidth - 10; 
/*     */     if (posY + popupHeight > getY() + getH())
/*     */       posY = getY() + getH() - popupHeight - 10; 
/*     */     d.a(d.a, posX, posY, popupWidth, popupHeight, 14.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()), 0.0F, 64, null);
/*     */     GL11.glBindTexture(3553, pack.b());
/*     */     d.a.a(posX + 20, posY + 20, 64.0F, 64.0F, 12.0F, 1.0F);
/*     */     d.b(d.a, pack.c(), posX + 95, posY + 35, "semibold", 17.0F, eu.shoroa.bridge.d.e.a.a.k().b(), d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*     */     d.b(d.a, ".minecraft > resourcepacks", posX + 20, posY + 95, "regular", 12.0F, eu.shoroa.bridge.d.e.a.a.k().c(), d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*     */     d.b(d.a, "Description:", posX + 20, posY + 120, "semibold", 14.0F, eu.shoroa.bridge.d.e.a.a.k().b(), d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*     */     a(StringsKt.take(pack.d(), 200), posX + 20, posY + '', "regular", 13.0F, eu.shoroa.bridge.d.e.a.a.k().c());
/*     */   }
/*     */   
/*     */   public void click(float mx, float my, int button) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield m : Leu/shoroa/bridge/d/c/a;
/*     */     //   4: ifnull -> 107
/*     */     //   7: ldc 360.0
/*     */     //   9: fstore #4
/*     */     //   11: ldc 240.0
/*     */     //   13: fstore #5
/*     */     //   15: aload_0
/*     */     //   16: getfield n : F
/*     */     //   19: fstore #7
/*     */     //   21: fload_1
/*     */     //   22: aload_0
/*     */     //   23: getfield n : F
/*     */     //   26: fload #4
/*     */     //   28: fadd
/*     */     //   29: fcmpg
/*     */     //   30: ifgt -> 48
/*     */     //   33: fload #7
/*     */     //   35: fload_1
/*     */     //   36: fcmpg
/*     */     //   37: ifgt -> 44
/*     */     //   40: iconst_1
/*     */     //   41: goto -> 49
/*     */     //   44: iconst_0
/*     */     //   45: goto -> 49
/*     */     //   48: iconst_0
/*     */     //   49: ifeq -> 93
/*     */     //   52: aload_0
/*     */     //   53: getfield o : F
/*     */     //   56: fstore #7
/*     */     //   58: fload_2
/*     */     //   59: aload_0
/*     */     //   60: getfield o : F
/*     */     //   63: fload #5
/*     */     //   65: fadd
/*     */     //   66: fcmpg
/*     */     //   67: ifgt -> 85
/*     */     //   70: fload #7
/*     */     //   72: fload_2
/*     */     //   73: fcmpg
/*     */     //   74: ifgt -> 81
/*     */     //   77: iconst_1
/*     */     //   78: goto -> 86
/*     */     //   81: iconst_0
/*     */     //   82: goto -> 86
/*     */     //   85: iconst_0
/*     */     //   86: ifeq -> 93
/*     */     //   89: iconst_1
/*     */     //   90: goto -> 94
/*     */     //   93: iconst_0
/*     */     //   94: istore #6
/*     */     //   96: iload #6
/*     */     //   98: ifne -> 107
/*     */     //   101: aload_0
/*     */     //   102: aconst_null
/*     */     //   103: putfield m : Leu/shoroa/bridge/d/c/a;
/*     */     //   106: return
/*     */     //   107: aload_0
/*     */     //   108: getfield r : Ljava/util/Map;
/*     */     //   111: astore #4
/*     */     //   113: iconst_0
/*     */     //   114: istore #5
/*     */     //   116: aload #4
/*     */     //   118: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   123: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   128: astore #6
/*     */     //   130: aload #6
/*     */     //   132: invokeinterface hasNext : ()Z
/*     */     //   137: ifeq -> 259
/*     */     //   140: aload #6
/*     */     //   142: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   147: checkcast java/util/Map$Entry
/*     */     //   150: astore #7
/*     */     //   152: aload #7
/*     */     //   154: astore #8
/*     */     //   156: iconst_0
/*     */     //   157: istore #9
/*     */     //   159: aload #8
/*     */     //   161: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   166: checkcast java/lang/String
/*     */     //   169: astore #10
/*     */     //   171: aload #8
/*     */     //   173: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   178: checkcast eu/shoroa/bridge/ui/clickgui/comp/b/a/b
/*     */     //   181: astore #11
/*     */     //   183: aload #11
/*     */     //   185: fload_1
/*     */     //   186: fload_2
/*     */     //   187: invokevirtual a : (FF)Z
/*     */     //   190: ifeq -> 254
/*     */     //   193: iload_3
/*     */     //   194: ifne -> 254
/*     */     //   197: aload_0
/*     */     //   198: getfield j : Ljava/util/Map;
/*     */     //   201: astore #12
/*     */     //   203: aload_0
/*     */     //   204: getfield j : Ljava/util/Map;
/*     */     //   207: aload #10
/*     */     //   209: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   214: checkcast java/lang/Boolean
/*     */     //   217: dup
/*     */     //   218: ifnull -> 227
/*     */     //   221: invokevirtual booleanValue : ()Z
/*     */     //   224: goto -> 229
/*     */     //   227: pop
/*     */     //   228: iconst_0
/*     */     //   229: ifne -> 236
/*     */     //   232: iconst_1
/*     */     //   233: goto -> 237
/*     */     //   236: iconst_0
/*     */     //   237: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   240: astore #13
/*     */     //   242: aload #12
/*     */     //   244: aload #10
/*     */     //   246: aload #13
/*     */     //   248: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   253: pop
/*     */     //   254: nop
/*     */     //   255: nop
/*     */     //   256: goto -> 130
/*     */     //   259: nop
/*     */     //   260: aload_0
/*     */     //   261: getfield s : Ljava/util/Map;
/*     */     //   264: astore #4
/*     */     //   266: iconst_0
/*     */     //   267: istore #5
/*     */     //   269: aload #4
/*     */     //   271: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   276: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   281: astore #6
/*     */     //   283: aload #6
/*     */     //   285: invokeinterface hasNext : ()Z
/*     */     //   290: ifeq -> 492
/*     */     //   293: aload #6
/*     */     //   295: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   300: checkcast java/util/Map$Entry
/*     */     //   303: astore #7
/*     */     //   305: aload #7
/*     */     //   307: astore #8
/*     */     //   309: iconst_0
/*     */     //   310: istore #9
/*     */     //   312: aload #8
/*     */     //   314: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   319: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   322: astore #10
/*     */     //   324: aload #8
/*     */     //   326: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   331: checkcast eu/shoroa/bridge/ui/clickgui/comp/b/a/b
/*     */     //   334: astore #11
/*     */     //   336: aload #11
/*     */     //   338: fload_1
/*     */     //   339: fload_2
/*     */     //   340: invokevirtual a : (FF)Z
/*     */     //   343: ifeq -> 487
/*     */     //   346: iload_3
/*     */     //   347: tableswitch default -> 487, 0 -> 368, 1 -> 487
/*     */     //   368: aload_0
/*     */     //   369: getfield k : Ljava/util/List;
/*     */     //   372: checkcast java/lang/Iterable
/*     */     //   375: astore #12
/*     */     //   377: iconst_0
/*     */     //   378: istore #13
/*     */     //   380: aload #12
/*     */     //   382: instanceof java/util/Collection
/*     */     //   385: ifeq -> 405
/*     */     //   388: aload #12
/*     */     //   390: checkcast java/util/Collection
/*     */     //   393: invokeinterface isEmpty : ()Z
/*     */     //   398: ifeq -> 405
/*     */     //   401: iconst_0
/*     */     //   402: goto -> 469
/*     */     //   405: aload #12
/*     */     //   407: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   412: astore #14
/*     */     //   414: aload #14
/*     */     //   416: invokeinterface hasNext : ()Z
/*     */     //   421: ifeq -> 468
/*     */     //   424: aload #14
/*     */     //   426: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   431: astore #15
/*     */     //   433: aload #15
/*     */     //   435: checkcast eu/shoroa/bridge/d/c/a
/*     */     //   438: astore #16
/*     */     //   440: iconst_0
/*     */     //   441: istore #17
/*     */     //   443: aload #16
/*     */     //   445: invokevirtual b : ()I
/*     */     //   448: aload #10
/*     */     //   450: invokevirtual b : ()I
/*     */     //   453: if_icmpne -> 460
/*     */     //   456: iconst_1
/*     */     //   457: goto -> 461
/*     */     //   460: iconst_0
/*     */     //   461: ifeq -> 414
/*     */     //   464: iconst_1
/*     */     //   465: goto -> 469
/*     */     //   468: iconst_0
/*     */     //   469: ifeq -> 481
/*     */     //   472: aload_0
/*     */     //   473: aload #10
/*     */     //   475: invokespecial b : (Leu/shoroa/bridge/d/c/a;)V
/*     */     //   478: goto -> 487
/*     */     //   481: aload_0
/*     */     //   482: aload #10
/*     */     //   484: invokespecial a : (Leu/shoroa/bridge/d/c/a;)V
/*     */     //   487: nop
/*     */     //   488: nop
/*     */     //   489: goto -> 283
/*     */     //   492: nop
/*     */     //   493: aload_0
/*     */     //   494: getfield x : Leu/shoroa/bridge/ui/b/a;
/*     */     //   497: dup
/*     */     //   498: ifnull -> 510
/*     */     //   501: fload_1
/*     */     //   502: fload_2
/*     */     //   503: iload_3
/*     */     //   504: invokevirtual click : (FFI)V
/*     */     //   507: goto -> 511
/*     */     //   510: pop
/*     */     //   511: aload_0
/*     */     //   512: getfield y : Leu/shoroa/bridge/ui/b/a;
/*     */     //   515: dup
/*     */     //   516: ifnull -> 528
/*     */     //   519: fload_1
/*     */     //   520: fload_2
/*     */     //   521: iload_3
/*     */     //   522: invokevirtual click : (FFI)V
/*     */     //   525: goto -> 529
/*     */     //   528: pop
/*     */     //   529: aload_0
/*     */     //   530: getfield B : Leu/shoroa/bridge/ui/b/b;
/*     */     //   533: fload_1
/*     */     //   534: fload_2
/*     */     //   535: iload_3
/*     */     //   536: invokevirtual click : (FFI)V
/*     */     //   539: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #384	-> 0
/*     */     //   #385	-> 7
/*     */     //   #386	-> 11
/*     */     //   #387	-> 15
/*     */     //   #388	-> 96
/*     */     //   #389	-> 101
/*     */     //   #390	-> 106
/*     */     //   #394	-> 107
/*     */     //   #521	-> 116
/*     */     //   #394	-> 159
/*     */     //   #395	-> 183
/*     */     //   #396	-> 197
/*     */     //   #398	-> 254
/*     */     //   #521	-> 255
/*     */     //   #522	-> 259
/*     */     //   #400	-> 260
/*     */     //   #523	-> 269
/*     */     //   #400	-> 312
/*     */     //   #401	-> 336
/*     */     //   #402	-> 346
/*     */     //   #403	-> 368
/*     */     //   #524	-> 380
/*     */     //   #525	-> 405
/*     */     //   #403	-> 443
/*     */     //   #525	-> 461
/*     */     //   #526	-> 468
/*     */     //   #403	-> 469
/*     */     //   #410	-> 487
/*     */     //   #523	-> 488
/*     */     //   #527	-> 492
/*     */     //   #412	-> 493
/*     */     //   #413	-> 511
/*     */     //   #414	-> 529
/*     */     //   #415	-> 539
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	540	0	this	Leu/shoroa/bridge/ui/clickgui/comp/b/a/a;
/*     */     //   0	540	1	mx	F
/*     */     //   0	540	2	my	F
/*     */     //   0	540	3	button	I
/*     */     //   11	96	4	popupWidth	F
/*     */     //   15	92	5	popupHeight	F
/*     */     //   96	11	6	insidePopup	Z
/*     */     //   113	147	4	$this$forEach$iv	Ljava/util/Map;
/*     */     //   116	144	5	$i$f$forEach	I
/*     */     //   152	104	7	element$iv	Ljava/util/Map$Entry;
/*     */     //   159	96	9	$i$a$-forEach-PageResourcePacks$click$1	I
/*     */     //   171	84	10	folderName	Ljava/lang/String;
/*     */     //   183	72	11	rect	Leu/shoroa/bridge/ui/clickgui/comp/b/a/b;
/*     */     //   266	227	4	$this$forEach$iv	Ljava/util/Map;
/*     */     //   269	224	5	$i$f$forEach	I
/*     */     //   305	184	7	element$iv	Ljava/util/Map$Entry;
/*     */     //   312	176	9	$i$a$-forEach-PageResourcePacks$click$2	I
/*     */     //   324	164	10	pack	Leu/shoroa/bridge/d/c/a;
/*     */     //   336	152	11	rect	Leu/shoroa/bridge/ui/clickgui/comp/b/a/b;
/*     */     //   377	92	12	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   380	89	13	$i$f$any	I
/*     */     //   433	35	15	element$iv	Ljava/lang/Object;
/*     */     //   440	21	16	it	Leu/shoroa/bridge/d/c/a;
/*     */     //   443	18	17	$i$a$-any-PageResourcePacks$click$2$1	I
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {
/*     */     if (this.x != null) {
/*     */       this.x.release(mx, my, button);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (this.y != null) {
/*     */       this.y.release(mx, my, button);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (this.w != null) {
/*     */       this.w.release(mx, my, button);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (this.z != null) {
/*     */       this.z.release(mx, my, button);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (this.A != null) {
/*     */       this.A.release(mx, my, button);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     this.B.release(mx, my, button);
/*     */   }
/*     */   
/*     */   public void onKey(int code, char char) {}
/*     */   
/*     */   public void c(String query) {
/*     */     Intrinsics.checkNotNullParameter(query, "");
/*     */     d(query);
/*     */   }
/*     */   
/*     */   public final void a(float delta) {
/*     */     float clipH = getH() - this.a - 30.0F;
/*     */     this.t = RangesKt.coerceIn(this.t - delta * 30.0F, 0.0F, RangesKt.coerceAtLeast(this.u - clipH, 0.0F));
/*     */   }
/*     */   
/*     */   private final void a(String text, float startX, float startY, String font, float size, Color defaultColor) {
/*     */     Color currentColor = defaultColor;
/*     */     float posX = startX;
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = "§";
/*     */     List parts = StringsKt.split$default(text, arrayOfString, false, 0, 6, null);
/*     */     Iterator<String> iterator;
/*     */     int i;
/*     */     for (iterator = parts.iterator(), i = 0; iterator.hasNext(); ) {
/*     */       int index = i;
/*     */       i++;
/*     */       String part = iterator.next();
/*     */       if (!((((CharSequence)part).length() == 0) ? 1 : 0)) {
/*     */         if (index > 0) {
/*     */           char code = part.charAt(0);
/*     */           char c1 = Character.toLowerCase(code);
/*     */           currentColor = (c1 == '0') ? new Color(0, 0, 0) : ((c1 == '1') ? new Color(0, 0, 170) : ((c1 == '2') ? new Color(0, 170, 0) : ((c1 == '3') ? new Color(0, 170, 170) : ((c1 == '4') ? new Color(170, 0, 0) : ((c1 == '5') ? new Color(170, 0, 170) : ((c1 == '6') ? new Color(255, 170, 0) : ((c1 == '7') ? new Color(170, 170, 170) : ((c1 == '8') ? new Color(85, 85, 85) : ((c1 == '9') ? new Color(85, 85, 255) : ((c1 == 'a') ? new Color(85, 255, 85) : ((c1 == 'b') ? new Color(85, 255, 255) : ((c1 == 'c') ? new Color(255, 85, 85) : ((c1 == 'd') ? new Color(255, 85, 255) : ((c1 == 'e') ? new Color(255, 255, 85) : ((c1 == 'f') ? new Color(255, 255, 255) : currentColor)))))))))))))));
/*     */           Intrinsics.checkNotNullExpressionValue(part.substring(1), "");
/*     */           String content = part.substring(1);
/*     */           d.b(d.a, content, posX, startY, font, size, currentColor, d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*     */           posX += d.a.a(content, font, size);
/*     */           continue;
/*     */         } 
/*     */         d.b(d.a, part, posX, startY, font, size, currentColor, d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*     */         posX += d.a.a(part, font, size);
/*     */       } 
/*     */     } 
/*     */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\b\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */