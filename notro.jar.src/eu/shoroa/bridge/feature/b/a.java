/*     */ package eu.shoroa.bridge.feature.b;
/*     */ 
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nArrayModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayModule.kt\neu/shoroa/bridge/feature/module/ArrayModule\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,170:1\n13374#2,3:171\n13309#2,2:174\n*S KotlinDebug\n*F\n+ 1 ArrayModule.kt\neu/shoroa/bridge/feature/module/ArrayModule\n*L\n123#1:171,3\n141#1:174,2\n*E\n"})
/*     */ public abstract class a extends b {
/*     */   @NotNull
/*     */   private final b<k> a;
/*     */   @NotNull
/*     */   private final b<Boolean> b;
/*     */   @NotNull
/*     */   private final b<Boolean> c;
/*     */   @NotNull
/*     */   private final b<Boolean> d;
/*     */   @NotNull
/*     */   private final b<Float> e;
/*     */   
/*  17 */   public a(String name, String description, String icon) { super(name, description, false, icon, false, 20, null);
/*     */     
/*  19 */     this.a = a("Theme", k.MODERN);
/*  20 */     this.b = a("Background", true);
/*  21 */     this.c = a("Blur", false);
/*  22 */     this.d = a("Text Shadow", false);
/*  23 */     this.e = a("Static Width", Float.valueOf(40.0F), Float.valueOf(0.0F), Float.valueOf(100.0F), Float.valueOf(1.0F));
/*  24 */     this.f = a("Static Height", Float.valueOf(20.0F), Float.valueOf(0.0F), Float.valueOf(100.0F), Float.valueOf(1.0F));
/*     */     
/*  26 */     this.g = a("Font Style", (T)d.SMOOTH).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((a.a(this.a).b() == k.CUSTOM)); } });
/*  27 */     Intrinsics.checkNotNullExpressionValue(Color.BLACK, "");
/*  28 */     this.h = a("Background Color", Color.BLACK).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((a.a(this.a).b() == k.CUSTOM)); } });
/*  29 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, "");
/*  30 */     this.i = a("Text Color", Color.WHITE).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((a.a(this.a).b() == k.CUSTOM || a.a(this.a).b() == k.CLASSIC)); } }
/*     */       );
/*  32 */     this.j = a("Border Radius", Float.valueOf(8.0F), Float.valueOf(0.0F), Float.valueOf(14.0F), Float.valueOf(0.1F)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((a.a(this.a).b() == k.CUSTOM)); } }); } @NotNull private final b<Float> f; @NotNull private final b<d> g; @NotNull
/*     */   private final b<Color> h; @NotNull
/*     */   private final b<Color> i; @NotNull
/*  35 */   private final b<Float> j; private final boolean s() { return (this.a.b() == k.MODERN || this.g.b() == d.SMOOTH); }
/*     */   
/*     */   private final void a(d paint, float radius) {
/*  38 */     d.a(d.a, this, radius, paint, 0.0F, 8, null);
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
/*     */   private final void a(String text, float x, float y, Color color, d.a alignment, boolean shadow, boolean nvg) {
/*  50 */     BridgeClient.a.b(); Intrinsics.checkNotNull((BridgeClient.a.b() != null) ? BridgeClient.a.b().vanillaRenderer() : null); Object object = (BridgeClient.a.b() != null) ? BridgeClient.a.b().vanillaRenderer() : null;
/*  51 */     switch (a.c[((k)this.a.b()).ordinal()]) { case 1:
/*  52 */         if (nvg)
/*  53 */         { if (shadow)
/*  54 */             d.b(d.a, text, x + 2, y + 2, "semibold", 18.0F, eu.shoroa.bridge.d.e.a.a.k().c(), alignment, 0.0F, 0.0F, 384, null); 
/*  55 */           d.b(d.a, text, x, y, "semibold", 18.0F, eu.shoroa.bridge.d.e.a.a.k().e(), alignment, 0.0F, 0.0F, 384, null); }  break;
/*     */       case 2:
/*  57 */         if (!nvg) {
/*  58 */           if (a.a[alignment.ordinal()] == 
/*  59 */             1) { object.a(text, x, y, color, shadow); break; }
/*  60 */            object.b(text, x, y, color, shadow);
/*     */         }  break;
/*     */       case 3:
/*  63 */         switch (a.b[((d)this.g.b()).ordinal()]) { case 1:
/*  64 */             if (nvg)
/*  65 */             { if (shadow) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  72 */                 Intrinsics.checkNotNullExpressionValue(color.darker().darker().darker(), ""); d.b(d.a, text, x + 2, y + 2, "semibold", 18.0F, color.darker().darker().darker(), 
/*  73 */                     alignment, 0.0F, 0.0F, 384, null);
/*     */               } 
/*  75 */               d.b(d.a, text, x, y, "semibold", 18.0F, color, alignment, 0.0F, 0.0F, 384, null); }  break;
/*     */           case 2:
/*  77 */             if (!nvg) {
/*  78 */               if (a.a[alignment.ordinal()] == 
/*  79 */                 1) { object.a(text, x, y, color, shadow); break; }
/*  80 */                object.b(text, x, y, color, shadow);
/*     */             } 
/*     */             break; }
/*     */         
/*     */         break; }
/*     */   
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void a(String[] arr, boolean nvg) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: dup
/*     */     //   2: ifnull -> 567
/*     */     //   5: astore_3
/*     */     //   6: iconst_0
/*     */     //   7: istore #4
/*     */     //   9: aload_3
/*     */     //   10: arraylength
/*     */     //   11: ifne -> 18
/*     */     //   14: iconst_1
/*     */     //   15: goto -> 19
/*     */     //   18: iconst_0
/*     */     //   19: ifne -> 26
/*     */     //   22: iconst_1
/*     */     //   23: goto -> 27
/*     */     //   26: iconst_0
/*     */     //   27: ifeq -> 563
/*     */     //   30: aload_3
/*     */     //   31: arraylength
/*     */     //   32: iconst_1
/*     */     //   33: if_icmpne -> 58
/*     */     //   36: aload_3
/*     */     //   37: iconst_0
/*     */     //   38: aaload
/*     */     //   39: checkcast java/lang/CharSequence
/*     */     //   42: invokeinterface length : ()I
/*     */     //   47: ifle -> 54
/*     */     //   50: iconst_1
/*     */     //   51: goto -> 55
/*     */     //   54: iconst_0
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_1
/*     */     //   59: ifeq -> 563
/*     */     //   62: aload_0
/*     */     //   63: getfield c : Leu/shoroa/bridge/feature/c/b;
/*     */     //   66: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   69: checkcast java/lang/Boolean
/*     */     //   72: invokevirtual booleanValue : ()Z
/*     */     //   75: ifeq -> 168
/*     */     //   78: iload_2
/*     */     //   79: ifeq -> 168
/*     */     //   82: aload_0
/*     */     //   83: getstatic eu/shoroa/bridge/b/b/d.a : Leu/shoroa/bridge/b/b/d$a;
/*     */     //   86: invokevirtual a : ()Leu/shoroa/bridge/b/b/d;
/*     */     //   89: aload_0
/*     */     //   90: getfield a : Leu/shoroa/bridge/feature/c/b;
/*     */     //   93: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   96: checkcast eu/shoroa/bridge/feature/c/a/k
/*     */     //   99: getstatic eu/shoroa/bridge/feature/b/a$a.c : [I
/*     */     //   102: swap
/*     */     //   103: invokevirtual ordinal : ()I
/*     */     //   106: iaload
/*     */     //   107: tableswitch default -> 157, 1 -> 148, 2 -> 153, 3 -> 132
/*     */     //   132: aload_0
/*     */     //   133: getfield j : Leu/shoroa/bridge/feature/c/b;
/*     */     //   136: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   139: checkcast java/lang/Number
/*     */     //   142: invokevirtual floatValue : ()F
/*     */     //   145: goto -> 165
/*     */     //   148: ldc 8.0
/*     */     //   150: goto -> 165
/*     */     //   153: fconst_0
/*     */     //   154: goto -> 165
/*     */     //   157: new kotlin/NoWhenBranchMatchedException
/*     */     //   160: dup
/*     */     //   161: invokespecial <init> : ()V
/*     */     //   164: athrow
/*     */     //   165: invokespecial a : (Leu/shoroa/bridge/b/b/d;F)V
/*     */     //   168: aload_0
/*     */     //   169: getfield b : Leu/shoroa/bridge/feature/c/b;
/*     */     //   172: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   175: checkcast java/lang/Boolean
/*     */     //   178: invokevirtual booleanValue : ()Z
/*     */     //   181: ifeq -> 392
/*     */     //   184: iload_2
/*     */     //   185: ifeq -> 392
/*     */     //   188: aload_0
/*     */     //   189: aload_0
/*     */     //   190: getfield a : Leu/shoroa/bridge/feature/c/b;
/*     */     //   193: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   196: checkcast eu/shoroa/bridge/feature/c/a/k
/*     */     //   199: getstatic eu/shoroa/bridge/feature/b/a$a.c : [I
/*     */     //   202: swap
/*     */     //   203: invokevirtual ordinal : ()I
/*     */     //   206: iaload
/*     */     //   207: tableswitch default -> 303, 1 -> 251, 2 -> 284, 3 -> 232
/*     */     //   232: getstatic eu/shoroa/bridge/b/b/d.a : Leu/shoroa/bridge/b/b/d$a;
/*     */     //   235: aload_0
/*     */     //   236: getfield h : Leu/shoroa/bridge/feature/c/b;
/*     */     //   239: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   242: checkcast java/awt/Color
/*     */     //   245: invokevirtual a : (Ljava/awt/Color;)Leu/shoroa/bridge/b/b/d;
/*     */     //   248: goto -> 311
/*     */     //   251: getstatic eu/shoroa/bridge/b/b/d.a : Leu/shoroa/bridge/b/b/d$a;
/*     */     //   254: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   257: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   260: invokevirtual c : ()Ljava/awt/Color;
/*     */     //   263: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   266: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   269: invokevirtual b : ()Ljava/awt/Color;
/*     */     //   272: getstatic eu/shoroa/bridge/b/b/b.a : Leu/shoroa/bridge/b/b/b$a;
/*     */     //   275: invokevirtual a : ()Leu/shoroa/bridge/b/b/b;
/*     */     //   278: invokevirtual a : (Ljava/awt/Color;Ljava/awt/Color;Leu/shoroa/bridge/b/b/b;)Leu/shoroa/bridge/b/b/d;
/*     */     //   281: goto -> 311
/*     */     //   284: getstatic eu/shoroa/bridge/b/b/d.a : Leu/shoroa/bridge/b/b/d$a;
/*     */     //   287: new java/awt/Color
/*     */     //   290: dup
/*     */     //   291: ldc -2147483648
/*     */     //   293: iconst_1
/*     */     //   294: invokespecial <init> : (IZ)V
/*     */     //   297: invokevirtual a : (Ljava/awt/Color;)Leu/shoroa/bridge/b/b/d;
/*     */     //   300: goto -> 311
/*     */     //   303: new kotlin/NoWhenBranchMatchedException
/*     */     //   306: dup
/*     */     //   307: invokespecial <init> : ()V
/*     */     //   310: athrow
/*     */     //   311: aload_0
/*     */     //   312: getfield a : Leu/shoroa/bridge/feature/c/b;
/*     */     //   315: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   318: checkcast eu/shoroa/bridge/feature/c/a/k
/*     */     //   321: getstatic eu/shoroa/bridge/feature/b/a$a.c : [I
/*     */     //   324: swap
/*     */     //   325: invokevirtual ordinal : ()I
/*     */     //   328: iaload
/*     */     //   329: tableswitch default -> 381, 1 -> 372, 2 -> 377, 3 -> 356
/*     */     //   356: aload_0
/*     */     //   357: getfield j : Leu/shoroa/bridge/feature/c/b;
/*     */     //   360: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   363: checkcast java/lang/Number
/*     */     //   366: invokevirtual floatValue : ()F
/*     */     //   369: goto -> 389
/*     */     //   372: ldc 8.0
/*     */     //   374: goto -> 389
/*     */     //   377: fconst_0
/*     */     //   378: goto -> 389
/*     */     //   381: new kotlin/NoWhenBranchMatchedException
/*     */     //   384: dup
/*     */     //   385: invokespecial <init> : ()V
/*     */     //   388: athrow
/*     */     //   389: invokespecial a : (Leu/shoroa/bridge/b/b/d;F)V
/*     */     //   392: fconst_0
/*     */     //   393: fstore #5
/*     */     //   395: aload_3
/*     */     //   396: arraylength
/*     */     //   397: iconst_1
/*     */     //   398: if_icmpne -> 415
/*     */     //   401: aload_0
/*     */     //   402: invokevirtual l : ()F
/*     */     //   405: aload_0
/*     */     //   406: invokevirtual n : ()F
/*     */     //   409: fconst_2
/*     */     //   410: fdiv
/*     */     //   411: fadd
/*     */     //   412: goto -> 422
/*     */     //   415: aload_0
/*     */     //   416: invokevirtual l : ()F
/*     */     //   419: iconst_5
/*     */     //   420: i2f
/*     */     //   421: fadd
/*     */     //   422: fstore #6
/*     */     //   424: aload_3
/*     */     //   425: arraylength
/*     */     //   426: iconst_1
/*     */     //   427: if_icmpne -> 444
/*     */     //   430: aload_0
/*     */     //   431: invokevirtual m : ()F
/*     */     //   434: aload_0
/*     */     //   435: invokevirtual o : ()F
/*     */     //   438: fconst_2
/*     */     //   439: fdiv
/*     */     //   440: fadd
/*     */     //   441: goto -> 452
/*     */     //   444: aload_0
/*     */     //   445: invokevirtual m : ()F
/*     */     //   448: bipush #8
/*     */     //   450: i2f
/*     */     //   451: fadd
/*     */     //   452: fstore #7
/*     */     //   454: aload_3
/*     */     //   455: astore #8
/*     */     //   457: iconst_0
/*     */     //   458: istore #9
/*     */     //   460: iconst_0
/*     */     //   461: istore #10
/*     */     //   463: iconst_0
/*     */     //   464: istore #11
/*     */     //   466: aload #8
/*     */     //   468: arraylength
/*     */     //   469: istore #12
/*     */     //   471: iload #11
/*     */     //   473: iload #12
/*     */     //   475: if_icmpge -> 562
/*     */     //   478: aload #8
/*     */     //   480: iload #11
/*     */     //   482: aaload
/*     */     //   483: astore #13
/*     */     //   485: iinc #10, 1
/*     */     //   488: aload #13
/*     */     //   490: astore #14
/*     */     //   492: iconst_0
/*     */     //   493: istore #15
/*     */     //   495: aload_0
/*     */     //   496: aload #14
/*     */     //   498: fload #6
/*     */     //   500: fload #7
/*     */     //   502: fload #5
/*     */     //   504: fadd
/*     */     //   505: aload_0
/*     */     //   506: getfield i : Leu/shoroa/bridge/feature/c/b;
/*     */     //   509: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   512: checkcast java/awt/Color
/*     */     //   515: aload_3
/*     */     //   516: arraylength
/*     */     //   517: iconst_1
/*     */     //   518: if_icmpne -> 527
/*     */     //   521: getstatic eu/shoroa/bridge/b/d$a.CENTER_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   524: goto -> 530
/*     */     //   527: getstatic eu/shoroa/bridge/b/d$a.LEFT_TOP : Leu/shoroa/bridge/b/d$a;
/*     */     //   530: aload_0
/*     */     //   531: getfield d : Leu/shoroa/bridge/feature/c/b;
/*     */     //   534: invokevirtual b : ()Ljava/lang/Object;
/*     */     //   537: checkcast java/lang/Boolean
/*     */     //   540: invokevirtual booleanValue : ()Z
/*     */     //   543: iload_2
/*     */     //   544: invokespecial a : (Ljava/lang/String;FFLjava/awt/Color;Leu/shoroa/bridge/b/d$a;ZZ)V
/*     */     //   547: fload #5
/*     */     //   549: ldc 18.0
/*     */     //   551: fadd
/*     */     //   552: fstore #5
/*     */     //   554: nop
/*     */     //   555: nop
/*     */     //   556: iinc #11, 1
/*     */     //   559: goto -> 471
/*     */     //   562: nop
/*     */     //   563: nop
/*     */     //   564: goto -> 569
/*     */     //   567: pop
/*     */     //   568: nop
/*     */     //   569: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #88	-> 0
/*     */     //   #89	-> 9
/*     */     //   #90	-> 62
/*     */     //   #91	-> 82
/*     */     //   #92	-> 83
/*     */     //   #93	-> 89
/*     */     //   #94	-> 132
/*     */     //   #95	-> 148
/*     */     //   #96	-> 153
/*     */     //   #91	-> 165
/*     */     //   #100	-> 168
/*     */     //   #101	-> 188
/*     */     //   #102	-> 189
/*     */     //   #103	-> 232
/*     */     //   #104	-> 251
/*     */     //   #105	-> 254
/*     */     //   #106	-> 263
/*     */     //   #107	-> 272
/*     */     //   #104	-> 278
/*     */     //   #109	-> 284
/*     */     //   #111	-> 311
/*     */     //   #112	-> 356
/*     */     //   #113	-> 372
/*     */     //   #114	-> 377
/*     */     //   #101	-> 389
/*     */     //   #119	-> 392
/*     */     //   #120	-> 395
/*     */     //   #121	-> 424
/*     */     //   #123	-> 454
/*     */     //   #171	-> 460
/*     */     //   #172	-> 463
/*     */     //   #124	-> 495
/*     */     //   #125	-> 496
/*     */     //   #126	-> 498
/*     */     //   #127	-> 500
/*     */     //   #128	-> 505
/*     */     //   #129	-> 515
/*     */     //   #130	-> 530
/*     */     //   #131	-> 543
/*     */     //   #124	-> 544
/*     */     //   #133	-> 547
/*     */     //   #134	-> 554
/*     */     //   #172	-> 555
/*     */     //   #173	-> 562
/*     */     //   #136	-> 563
/*     */     //   #88	-> 564
/*     */     //   #137	-> 569
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	570	0	this	Leu/shoroa/bridge/feature/b/a;
/*     */     //   0	570	1	arr	[Ljava/lang/String;
/*     */     //   0	570	2	nvg	Z
/*     */     //   6	558	3	it	[Ljava/lang/String;
/*     */     //   9	555	4	$i$a$-let-ArrayModule$draw$1	I
/*     */     //   395	168	5	yOff	F
/*     */     //   424	139	6	cx	F
/*     */     //   454	109	7	cy	F
/*     */     //   457	106	8	$this$forEachIndexed$iv	[Ljava/lang/Object;
/*     */     //   460	103	9	$i$f$forEachIndexed	I
/*     */     //   463	100	10	index$iv	I
/*     */     //   485	71	13	item$iv	Ljava/lang/Object;
/*     */     //   492	63	14	line	Ljava/lang/String;
/*     */     //   495	60	15	$i$a$-forEachIndexed-ArrayModule$draw$1$1	I
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float a(String[] arr) {
/* 140 */     Intrinsics.checkNotNullParameter(arr, ""); float lastMaxW = 0.0F;
/* 141 */     String[] arrayOfString = arr; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     byte b1 = 0; int i = arrayOfString.length; if (b1 < i) { Object element$iv = arrayOfString[b1], object1 = element$iv; int $i$a$-forEach-ArrayModule$getWidth$1 = 0;
/*     */       BridgeClient.a.b().vanillaRenderer();
/*     */       Intrinsics.checkNotNull((BridgeClient.a.b() != null && BridgeClient.a.b().vanillaRenderer() != null) ? Float.valueOf(BridgeClient.a.b().vanillaRenderer().a((String)object1)) : null); }
/*     */     
/*     */     return lastMaxW + ((Number)this.e.b()).floatValue();
/*     */   }
/*     */   
/*     */   public final float b(String[] arr) {
/*     */     Intrinsics.checkNotNullParameter(arr, "");
/*     */     return (arr.length * 18) + ((Number)this.f.b()).floatValue();
/*     */   }
/*     */   
/*     */   public void a(boolean nvg, int displayWidth, int displayHeight) {
/*     */     c(a(c()));
/*     */     d(b(c()));
/*     */     a(c(), nvg);
/*     */   }
/*     */   
/*     */   public void b(boolean nvg, int displayWidth, int displayHeight) {
/*     */     c(a(d()));
/*     */     d(b(d()));
/*     */     a(d(), nvg);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract String[] c();
/*     */   
/*     */   @NotNull
/*     */   public abstract String[] d();
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */