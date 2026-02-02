/*     */ package eu.shoroa.bridge.ui.clickgui.comp.a;@SourceDebugExtension({"SMAP\nPageCosmetics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageCosmetics.kt\neu/shoroa/bridge/ui/clickgui/comp/cosmetics/PageCosmetics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n766#2:231\n857#2,2:232\n1855#2,2:234\n766#2:237\n857#2,2:238\n1855#2:240\n766#2:241\n857#2,2:242\n1855#2,2:244\n766#2:246\n857#2,2:247\n1855#2,2:249\n1856#2:251\n1#3:236\n*S KotlinDebug\n*F\n+ 1 PageCosmetics.kt\neu/shoroa/bridge/ui/clickgui/comp/cosmetics/PageCosmetics\n*L\n41#1:231\n41#1:232,2\n75#1:234,2\n144#1:237\n144#1:238,2\n145#1:240\n163#1:241\n163#1:242,2\n164#1:244,2\n179#1:246\n179#1:247,2\n180#1:249,2\n145#1:251\n*E\n"})
/*     */ public final class a extends b { @NotNull
/*     */   private final SocketClient a;
/*     */   @NotNull
/*     */   private String b;
/*     */   @NotNull
/*     */   private String c;
/*     */   @NotNull
/*     */   private final a d;
/*     */   @NotNull
/*     */   private final a e;
/*     */   @Nullable
/*     */   private float[] f;
/*     */   
/*     */   @NotNull
/*     */   public Object clone() {
/*  17 */     return super.clone();
/*     */   }
/*     */   public a(float x, float y, float w, float h, SocketClient netClient) {
/*  20 */     super("cosmetics", "Cosmetics", "Cosmetics", x, y, w, h);
/*     */     this.a = netClient;
/*  22 */     this.b = "cape";
/*  23 */     this.c = "";
/*     */     
/*  25 */     this.d = new a(this, "Cloaks", "cape", x + 'Ķ', y + 510.0F, 60.0F, 30.0F);
/*  26 */     this.e = new a(this, "Wings", "wings", x + 380.0F, y + 510.0F, 60.0F, 30.0F);
/*     */   }
/*     */   
/*     */   public void render(float mx, float my, float delta) {
/*     */     CosmeticManager cm;
/*  31 */     if (BridgeClient.a.b() == null || (BridgeClient.a.b()).cosmeticManager == null)
/*     */       return; 
/*  33 */     d.a(d.a, getX() + 'ħ', getY() + 505.0F, 148.0F, 30.0F, 8.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 64, null);
/*  34 */     d.a(d.a, getX() + 'ħ', getY() + 505.0F, 148.0F, 30.0F, 8.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().e()).a(0.5F), 0.0F, 64, null);
/*     */ 
/*     */     
/*  37 */     this.d.render(mx, my, delta);
/*  38 */     this.e.render(mx, my, delta);
/*     */     
/*  40 */     List list1 = cm.all();
/*  41 */     int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 232 */     for (Object element$iv$iv : list2) { b it = (b)element$iv$iv; int $i$a$-filter-PageCosmetics$render$filtered$1 = 0; }
/* 233 */      List filtered = (List)destination$iv$iv; if (filtered.isEmpty()) { d.b(d.a, "You don't own any cosmetics", getX() + getW() / 2.0F, getY() + getH() / 2.0F - 20, "semibold", 18.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null); float btnW = 120.0F; float btnH = 30.0F; float btnX = getX() + (getW() - btnW) / 2.0F; float btnY = getY() + getH() / 2.0F + 10; d.a(d.a, btnX, btnY, btnW, btnH, 6.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 64, null); d.a(d.a, btnX, btnY, btnW, btnH, 6.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().f()).a(1.5F), 0.0F, 64, null); d.b(d.a, "Reload", btnX + btnW / 2, btnY + btnH / 2, "semibold", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null); float[] arrayOfFloat = new float[4]; arrayOfFloat[0] = btnX; arrayOfFloat[1] = btnY; arrayOfFloat[2] = btnW; arrayOfFloat[3] = btnH; this.f = arrayOfFloat; return; }
/* 234 */      int itemsPerRow = 3; float baseHeight = 250.0F; float itemHeight = baseHeight + 40.0F; float itemWidth = getW() / itemsPerRow; int i = 0; Iterable $this$forEach$iv = filtered; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b cosmetic = (b)element$iv; int $i$a$-forEach-PageCosmetics$render$1 = 0;
/*     */       float cardWidth = itemWidth - 10.0F;
/*     */       float cardHeight = itemHeight;
/*     */       float xPos = getX() + 5 + (i % itemsPerRow) * itemWidth;
/*     */       float yPos = getY() + 70 + (i / itemsPerRow) * (itemHeight + 10.0F);
/*     */       String str = cosmetic.f(); }
/*     */   
/*     */   }
/*     */   
/*     */   public void click(float mx, float my, int button) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield d : Leu/shoroa/bridge/ui/clickgui/comp/a/a$a;
/*     */     //   4: fload_1
/*     */     //   5: fload_2
/*     */     //   6: iload_3
/*     */     //   7: invokevirtual click : (FFI)V
/*     */     //   10: aload_0
/*     */     //   11: getfield e : Leu/shoroa/bridge/ui/clickgui/comp/a/a$a;
/*     */     //   14: fload_1
/*     */     //   15: fload_2
/*     */     //   16: iload_3
/*     */     //   17: invokevirtual click : (FFI)V
/*     */     //   20: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
/*     */     //   23: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
/*     */     //   26: dup
/*     */     //   27: ifnull -> 37
/*     */     //   30: getfield cosmeticManager : Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   33: dup
/*     */     //   34: ifnonnull -> 39
/*     */     //   37: pop
/*     */     //   38: return
/*     */     //   39: astore #4
/*     */     //   41: aload_0
/*     */     //   42: getfield f : [F
/*     */     //   45: dup
/*     */     //   46: ifnull -> 162
/*     */     //   49: astore #7
/*     */     //   51: iconst_0
/*     */     //   52: istore #8
/*     */     //   54: aload #7
/*     */     //   56: iconst_0
/*     */     //   57: faload
/*     */     //   58: fstore #9
/*     */     //   60: aload #7
/*     */     //   62: iconst_1
/*     */     //   63: faload
/*     */     //   64: fstore #10
/*     */     //   66: aload #7
/*     */     //   68: iconst_2
/*     */     //   69: faload
/*     */     //   70: fstore #11
/*     */     //   72: aload #7
/*     */     //   74: iconst_3
/*     */     //   75: faload
/*     */     //   76: fstore #12
/*     */     //   78: fload #9
/*     */     //   80: fload_1
/*     */     //   81: fcmpg
/*     */     //   82: ifgt -> 103
/*     */     //   85: fload_1
/*     */     //   86: fload #9
/*     */     //   88: fload #11
/*     */     //   90: fadd
/*     */     //   91: fcmpg
/*     */     //   92: ifgt -> 99
/*     */     //   95: iconst_1
/*     */     //   96: goto -> 104
/*     */     //   99: iconst_0
/*     */     //   100: goto -> 104
/*     */     //   103: iconst_0
/*     */     //   104: ifeq -> 140
/*     */     //   107: fload #10
/*     */     //   109: fload_2
/*     */     //   110: fcmpg
/*     */     //   111: ifgt -> 132
/*     */     //   114: fload_2
/*     */     //   115: fload #10
/*     */     //   117: fload #12
/*     */     //   119: fadd
/*     */     //   120: fcmpg
/*     */     //   121: ifgt -> 128
/*     */     //   124: iconst_1
/*     */     //   125: goto -> 133
/*     */     //   128: iconst_0
/*     */     //   129: goto -> 133
/*     */     //   132: iconst_0
/*     */     //   133: ifeq -> 140
/*     */     //   136: iconst_1
/*     */     //   137: goto -> 141
/*     */     //   140: iconst_0
/*     */     //   141: istore #13
/*     */     //   143: iload #13
/*     */     //   145: ifeq -> 158
/*     */     //   148: iload_3
/*     */     //   149: ifne -> 158
/*     */     //   152: aload_0
/*     */     //   153: aconst_null
/*     */     //   154: putfield f : [F
/*     */     //   157: return
/*     */     //   158: nop
/*     */     //   159: goto -> 164
/*     */     //   162: pop
/*     */     //   163: nop
/*     */     //   164: iconst_3
/*     */     //   165: istore #5
/*     */     //   167: ldc 290.0
/*     */     //   169: fstore #6
/*     */     //   171: aload_0
/*     */     //   172: invokevirtual getW : ()F
/*     */     //   175: iload #5
/*     */     //   177: i2f
/*     */     //   178: fdiv
/*     */     //   179: fstore #7
/*     */     //   181: iconst_0
/*     */     //   182: istore #8
/*     */     //   184: aload #4
/*     */     //   186: invokevirtual all : ()Ljava/util/List;
/*     */     //   189: checkcast java/lang/Iterable
/*     */     //   192: astore #9
/*     */     //   194: nop
/*     */     //   195: iconst_0
/*     */     //   196: istore #10
/*     */     //   198: aload #9
/*     */     //   200: astore #11
/*     */     //   202: new java/util/ArrayList
/*     */     //   205: dup
/*     */     //   206: invokespecial <init> : ()V
/*     */     //   209: checkcast java/util/Collection
/*     */     //   212: astore #12
/*     */     //   214: iconst_0
/*     */     //   215: istore #13
/*     */     //   217: aload #11
/*     */     //   219: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   224: astore #14
/*     */     //   226: aload #14
/*     */     //   228: invokeinterface hasNext : ()Z
/*     */     //   233: ifeq -> 336
/*     */     //   236: aload #14
/*     */     //   238: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   243: astore #15
/*     */     //   245: aload #15
/*     */     //   247: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   250: astore #16
/*     */     //   252: iconst_0
/*     */     //   253: istore #17
/*     */     //   255: aload #16
/*     */     //   257: invokevirtual f : ()Ljava/lang/String;
/*     */     //   260: aload_0
/*     */     //   261: getfield b : Ljava/lang/String;
/*     */     //   264: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   267: ifeq -> 319
/*     */     //   270: aload_0
/*     */     //   271: getfield c : Ljava/lang/String;
/*     */     //   274: checkcast java/lang/CharSequence
/*     */     //   277: invokeinterface length : ()I
/*     */     //   282: ifne -> 289
/*     */     //   285: iconst_1
/*     */     //   286: goto -> 290
/*     */     //   289: iconst_0
/*     */     //   290: ifne -> 315
/*     */     //   293: aload #16
/*     */     //   295: invokevirtual d : ()Ljava/lang/String;
/*     */     //   298: checkcast java/lang/CharSequence
/*     */     //   301: aload_0
/*     */     //   302: getfield c : Ljava/lang/String;
/*     */     //   305: checkcast java/lang/CharSequence
/*     */     //   308: iconst_1
/*     */     //   309: invokestatic contains : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
/*     */     //   312: ifeq -> 319
/*     */     //   315: iconst_1
/*     */     //   316: goto -> 320
/*     */     //   319: iconst_0
/*     */     //   320: ifeq -> 226
/*     */     //   323: aload #12
/*     */     //   325: aload #15
/*     */     //   327: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   332: pop
/*     */     //   333: goto -> 226
/*     */     //   336: aload #12
/*     */     //   338: checkcast java/util/List
/*     */     //   341: nop
/*     */     //   342: checkcast java/lang/Iterable
/*     */     //   345: astore #9
/*     */     //   347: nop
/*     */     //   348: iconst_0
/*     */     //   349: istore #10
/*     */     //   351: aload #9
/*     */     //   353: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   358: astore #11
/*     */     //   360: aload #11
/*     */     //   362: invokeinterface hasNext : ()Z
/*     */     //   367: ifeq -> 1091
/*     */     //   370: aload #11
/*     */     //   372: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   377: astore #12
/*     */     //   379: aload #12
/*     */     //   381: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   384: astore #13
/*     */     //   386: iconst_0
/*     */     //   387: istore #14
/*     */     //   389: fload #7
/*     */     //   391: ldc 10.0
/*     */     //   393: fsub
/*     */     //   394: fstore #15
/*     */     //   396: aload_0
/*     */     //   397: invokevirtual getX : ()F
/*     */     //   400: iconst_5
/*     */     //   401: i2f
/*     */     //   402: fadd
/*     */     //   403: iload #8
/*     */     //   405: iload #5
/*     */     //   407: irem
/*     */     //   408: i2f
/*     */     //   409: fload #7
/*     */     //   411: fmul
/*     */     //   412: fadd
/*     */     //   413: fstore #16
/*     */     //   415: aload_0
/*     */     //   416: invokevirtual getY : ()F
/*     */     //   419: bipush #70
/*     */     //   421: i2f
/*     */     //   422: fadd
/*     */     //   423: iload #8
/*     */     //   425: iload #5
/*     */     //   427: idiv
/*     */     //   428: i2f
/*     */     //   429: fload #6
/*     */     //   431: ldc 10.0
/*     */     //   433: fadd
/*     */     //   434: fmul
/*     */     //   435: fadd
/*     */     //   436: fstore #17
/*     */     //   438: fload #16
/*     */     //   440: fload_1
/*     */     //   441: fcmpg
/*     */     //   442: ifgt -> 463
/*     */     //   445: fload_1
/*     */     //   446: fload #16
/*     */     //   448: fload #15
/*     */     //   450: fadd
/*     */     //   451: fcmpg
/*     */     //   452: ifgt -> 459
/*     */     //   455: iconst_1
/*     */     //   456: goto -> 464
/*     */     //   459: iconst_0
/*     */     //   460: goto -> 464
/*     */     //   463: iconst_0
/*     */     //   464: ifeq -> 500
/*     */     //   467: fload #17
/*     */     //   469: fload_2
/*     */     //   470: fcmpg
/*     */     //   471: ifgt -> 492
/*     */     //   474: fload_2
/*     */     //   475: fload #17
/*     */     //   477: fload #6
/*     */     //   479: fadd
/*     */     //   480: fcmpg
/*     */     //   481: ifgt -> 488
/*     */     //   484: iconst_1
/*     */     //   485: goto -> 493
/*     */     //   488: iconst_0
/*     */     //   489: goto -> 493
/*     */     //   492: iconst_0
/*     */     //   493: ifeq -> 500
/*     */     //   496: iconst_1
/*     */     //   497: goto -> 501
/*     */     //   500: iconst_0
/*     */     //   501: istore #18
/*     */     //   503: iload #18
/*     */     //   505: ifeq -> 1080
/*     */     //   508: iload_3
/*     */     //   509: ifne -> 1080
/*     */     //   512: aload #13
/*     */     //   514: invokevirtual f : ()Ljava/lang/String;
/*     */     //   517: astore #19
/*     */     //   519: aload #19
/*     */     //   521: ldc 'cape'
/*     */     //   523: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   526: ifeq -> 770
/*     */     //   529: aload #13
/*     */     //   531: invokevirtual b : ()Z
/*     */     //   534: ifeq -> 551
/*     */     //   537: aload #13
/*     */     //   539: invokevirtual a : ()V
/*     */     //   542: aload #4
/*     */     //   544: aconst_null
/*     */     //   545: invokevirtual setCurrentCape : (Leu/shoroa/bridge/feature/cosmetic/a;)V
/*     */     //   548: goto -> 1030
/*     */     //   551: aload #4
/*     */     //   553: invokevirtual all : ()Ljava/util/List;
/*     */     //   556: checkcast java/lang/Iterable
/*     */     //   559: astore #20
/*     */     //   561: nop
/*     */     //   562: iconst_0
/*     */     //   563: istore #21
/*     */     //   565: aload #20
/*     */     //   567: astore #22
/*     */     //   569: new java/util/ArrayList
/*     */     //   572: dup
/*     */     //   573: invokespecial <init> : ()V
/*     */     //   576: checkcast java/util/Collection
/*     */     //   579: astore #23
/*     */     //   581: iconst_0
/*     */     //   582: istore #24
/*     */     //   584: aload #22
/*     */     //   586: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   591: astore #25
/*     */     //   593: aload #25
/*     */     //   595: invokeinterface hasNext : ()Z
/*     */     //   600: ifeq -> 674
/*     */     //   603: aload #25
/*     */     //   605: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   610: astore #26
/*     */     //   612: aload #26
/*     */     //   614: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   617: astore #27
/*     */     //   619: iconst_0
/*     */     //   620: istore #28
/*     */     //   622: aload #27
/*     */     //   624: invokevirtual f : ()Ljava/lang/String;
/*     */     //   627: ldc 'cape'
/*     */     //   629: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   632: ifeq -> 657
/*     */     //   635: aload #27
/*     */     //   637: aload #13
/*     */     //   639: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   642: ifne -> 657
/*     */     //   645: aload #27
/*     */     //   647: invokevirtual b : ()Z
/*     */     //   650: ifeq -> 657
/*     */     //   653: iconst_1
/*     */     //   654: goto -> 658
/*     */     //   657: iconst_0
/*     */     //   658: ifeq -> 593
/*     */     //   661: aload #23
/*     */     //   663: aload #26
/*     */     //   665: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   670: pop
/*     */     //   671: goto -> 593
/*     */     //   674: aload #23
/*     */     //   676: checkcast java/util/List
/*     */     //   679: nop
/*     */     //   680: checkcast java/lang/Iterable
/*     */     //   683: astore #20
/*     */     //   685: nop
/*     */     //   686: iconst_0
/*     */     //   687: istore #21
/*     */     //   689: aload #20
/*     */     //   691: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   696: astore #22
/*     */     //   698: aload #22
/*     */     //   700: invokeinterface hasNext : ()Z
/*     */     //   705: ifeq -> 736
/*     */     //   708: aload #22
/*     */     //   710: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   715: astore #23
/*     */     //   717: aload #23
/*     */     //   719: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   722: astore #24
/*     */     //   724: iconst_0
/*     */     //   725: istore #25
/*     */     //   727: aload #24
/*     */     //   729: invokevirtual a : ()V
/*     */     //   732: nop
/*     */     //   733: goto -> 698
/*     */     //   736: nop
/*     */     //   737: aload #13
/*     */     //   739: invokevirtual a : ()V
/*     */     //   742: aload #4
/*     */     //   744: aload #13
/*     */     //   746: invokevirtual selectCosmetic : (Leu/shoroa/bridge/feature/cosmetic/b;)V
/*     */     //   749: aload #13
/*     */     //   751: instanceof eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   754: ifeq -> 1030
/*     */     //   757: aload #4
/*     */     //   759: aload #13
/*     */     //   761: checkcast eu/shoroa/bridge/feature/cosmetic/a
/*     */     //   764: invokevirtual setCurrentCape : (Leu/shoroa/bridge/feature/cosmetic/a;)V
/*     */     //   767: goto -> 1030
/*     */     //   770: aload #19
/*     */     //   772: ldc 'wings'
/*     */     //   774: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   777: ifeq -> 1025
/*     */     //   780: aload #13
/*     */     //   782: invokevirtual b : ()Z
/*     */     //   785: ifeq -> 802
/*     */     //   788: aload #13
/*     */     //   790: invokevirtual a : ()V
/*     */     //   793: aload #4
/*     */     //   795: aconst_null
/*     */     //   796: invokevirtual setCurrentWings : (Leu/shoroa/bridge/feature/cosmetic/c;)V
/*     */     //   799: goto -> 1030
/*     */     //   802: aload #4
/*     */     //   804: invokevirtual all : ()Ljava/util/List;
/*     */     //   807: checkcast java/lang/Iterable
/*     */     //   810: astore #20
/*     */     //   812: nop
/*     */     //   813: iconst_0
/*     */     //   814: istore #21
/*     */     //   816: aload #20
/*     */     //   818: astore #22
/*     */     //   820: new java/util/ArrayList
/*     */     //   823: dup
/*     */     //   824: invokespecial <init> : ()V
/*     */     //   827: checkcast java/util/Collection
/*     */     //   830: astore #23
/*     */     //   832: iconst_0
/*     */     //   833: istore #24
/*     */     //   835: aload #22
/*     */     //   837: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   842: astore #25
/*     */     //   844: aload #25
/*     */     //   846: invokeinterface hasNext : ()Z
/*     */     //   851: ifeq -> 925
/*     */     //   854: aload #25
/*     */     //   856: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   861: astore #26
/*     */     //   863: aload #26
/*     */     //   865: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   868: astore #27
/*     */     //   870: iconst_0
/*     */     //   871: istore #28
/*     */     //   873: aload #27
/*     */     //   875: invokevirtual f : ()Ljava/lang/String;
/*     */     //   878: ldc 'wings'
/*     */     //   880: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   883: ifeq -> 908
/*     */     //   886: aload #27
/*     */     //   888: aload #13
/*     */     //   890: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   893: ifne -> 908
/*     */     //   896: aload #27
/*     */     //   898: invokevirtual b : ()Z
/*     */     //   901: ifeq -> 908
/*     */     //   904: iconst_1
/*     */     //   905: goto -> 909
/*     */     //   908: iconst_0
/*     */     //   909: ifeq -> 844
/*     */     //   912: aload #23
/*     */     //   914: aload #26
/*     */     //   916: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   921: pop
/*     */     //   922: goto -> 844
/*     */     //   925: aload #23
/*     */     //   927: checkcast java/util/List
/*     */     //   930: nop
/*     */     //   931: checkcast java/lang/Iterable
/*     */     //   934: astore #20
/*     */     //   936: nop
/*     */     //   937: iconst_0
/*     */     //   938: istore #21
/*     */     //   940: aload #20
/*     */     //   942: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   947: astore #22
/*     */     //   949: aload #22
/*     */     //   951: invokeinterface hasNext : ()Z
/*     */     //   956: ifeq -> 987
/*     */     //   959: aload #22
/*     */     //   961: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   966: astore #23
/*     */     //   968: aload #23
/*     */     //   970: checkcast eu/shoroa/bridge/feature/cosmetic/b
/*     */     //   973: astore #24
/*     */     //   975: iconst_0
/*     */     //   976: istore #25
/*     */     //   978: aload #24
/*     */     //   980: invokevirtual a : ()V
/*     */     //   983: nop
/*     */     //   984: goto -> 949
/*     */     //   987: nop
/*     */     //   988: aload #13
/*     */     //   990: invokevirtual a : ()V
/*     */     //   993: aload #4
/*     */     //   995: aload #13
/*     */     //   997: invokevirtual selectCosmetic : (Leu/shoroa/bridge/feature/cosmetic/b;)V
/*     */     //   1000: aload #4
/*     */     //   1002: aload #13
/*     */     //   1004: instanceof eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   1007: ifeq -> 1018
/*     */     //   1010: aload #13
/*     */     //   1012: checkcast eu/shoroa/bridge/feature/cosmetic/c
/*     */     //   1015: goto -> 1019
/*     */     //   1018: aconst_null
/*     */     //   1019: invokevirtual setCurrentWings : (Leu/shoroa/bridge/feature/cosmetic/c;)V
/*     */     //   1022: goto -> 1030
/*     */     //   1025: aload #13
/*     */     //   1027: invokevirtual a : ()V
/*     */     //   1030: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
/*     */     //   1033: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
/*     */     //   1036: astore #19
/*     */     //   1038: aload #19
/*     */     //   1040: ifnull -> 1079
/*     */     //   1043: aload #19
/*     */     //   1045: invokevirtual getPlayerUuid : ()Ljava/lang/String;
/*     */     //   1048: astore #20
/*     */     //   1050: aload #20
/*     */     //   1052: ifnull -> 1079
/*     */     //   1055: aload #20
/*     */     //   1057: astore #22
/*     */     //   1059: iconst_0
/*     */     //   1060: istore #23
/*     */     //   1062: aload_0
/*     */     //   1063: getfield a : Leu/shoroa/bridge/SocketClient;
/*     */     //   1066: aload #22
/*     */     //   1068: aload #13
/*     */     //   1070: invokevirtual c : ()Ljava/lang/String;
/*     */     //   1073: invokevirtual selectCosmetic : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   1076: goto -> 1080
/*     */     //   1079: nop
/*     */     //   1080: iload #8
/*     */     //   1082: iconst_1
/*     */     //   1083: iadd
/*     */     //   1084: istore #8
/*     */     //   1086: nop
/*     */     //   1087: nop
/*     */     //   1088: goto -> 360
/*     */     //   1091: nop
/*     */     //   1092: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 0
/*     */     //   #125	-> 10
/*     */     //   #127	-> 20
/*     */     //   #130	-> 41
/*     */     //   #236	-> 51
/*     */     //   #130	-> 54
/*     */     //   #131	-> 78
/*     */     //   #132	-> 143
/*     */     //   #133	-> 152
/*     */     //   #134	-> 157
/*     */     //   #136	-> 158
/*     */     //   #130	-> 159
/*     */     //   #138	-> 164
/*     */     //   #139	-> 167
/*     */     //   #140	-> 171
/*     */     //   #141	-> 181
/*     */     //   #143	-> 184
/*     */     //   #144	-> 194
/*     */     //   #237	-> 198
/*     */     //   #238	-> 217
/*     */     //   #144	-> 255
/*     */     //   #238	-> 320
/*     */     //   #239	-> 336
/*     */     //   #237	-> 341
/*     */     //   #145	-> 347
/*     */     //   #240	-> 351
/*     */     //   #146	-> 389
/*     */     //   #147	-> 396
/*     */     //   #148	-> 415
/*     */     //   #150	-> 438
/*     */     //   #151	-> 467
/*     */     //   #150	-> 501
/*     */     //   #153	-> 503
/*     */     //   #154	-> 512
/*     */     //   #155	-> 519
/*     */     //   #157	-> 529
/*     */     //   #158	-> 537
/*     */     //   #159	-> 542
/*     */     //   #162	-> 551
/*     */     //   #163	-> 561
/*     */     //   #241	-> 565
/*     */     //   #242	-> 584
/*     */     //   #163	-> 622
/*     */     //   #242	-> 658
/*     */     //   #243	-> 674
/*     */     //   #241	-> 679
/*     */     //   #164	-> 685
/*     */     //   #244	-> 689
/*     */     //   #164	-> 727
/*     */     //   #244	-> 732
/*     */     //   #245	-> 736
/*     */     //   #166	-> 737
/*     */     //   #167	-> 742
/*     */     //   #168	-> 749
/*     */     //   #172	-> 770
/*     */     //   #173	-> 780
/*     */     //   #174	-> 788
/*     */     //   #175	-> 793
/*     */     //   #178	-> 802
/*     */     //   #179	-> 812
/*     */     //   #246	-> 816
/*     */     //   #247	-> 835
/*     */     //   #179	-> 873
/*     */     //   #247	-> 909
/*     */     //   #248	-> 925
/*     */     //   #246	-> 930
/*     */     //   #180	-> 936
/*     */     //   #249	-> 940
/*     */     //   #180	-> 978
/*     */     //   #249	-> 983
/*     */     //   #250	-> 987
/*     */     //   #182	-> 988
/*     */     //   #183	-> 993
/*     */     //   #184	-> 1000
/*     */     //   #188	-> 1025
/*     */     //   #193	-> 1030
/*     */     //   #194	-> 1050
/*     */     //   #193	-> 1055
/*     */     //   #194	-> 1057
/*     */     //   #236	-> 1059
/*     */     //   #194	-> 1062
/*     */     //   #193	-> 1079
/*     */     //   #196	-> 1080
/*     */     //   #197	-> 1086
/*     */     //   #240	-> 1087
/*     */     //   #251	-> 1091
/*     */     //   #198	-> 1092
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1093	0	this	Leu/shoroa/bridge/ui/clickgui/comp/a/a;
/*     */     //   0	1093	1	mx	F
/*     */     //   0	1093	2	my	F
/*     */     //   0	1093	3	button	I
/*     */     //   41	1052	4	cm	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
/*     */     //   54	105	8	$i$a$-let-PageCosmetics$click$1	I
/*     */     //   60	99	9	bx	F
/*     */     //   66	93	10	by	F
/*     */     //   72	87	11	bw	F
/*     */     //   78	81	12	bh	F
/*     */     //   143	16	13	hovered	Z
/*     */     //   167	926	5	itemsPerRow	I
/*     */     //   171	922	6	itemHeight	F
/*     */     //   181	912	7	itemWidth	F
/*     */     //   184	909	8	i	I
/*     */     //   195	147	9	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   198	144	10	$i$f$filter	I
/*     */     //   214	124	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   214	124	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   217	121	13	$i$f$filterTo	I
/*     */     //   245	88	15	element$iv$iv	Ljava/lang/Object;
/*     */     //   252	68	16	it	Leu/shoroa/bridge/feature/cosmetic/b;
/*     */     //   255	65	17	$i$a$-filter-PageCosmetics$click$2	I
/*     */     //   348	744	9	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   351	741	10	$i$f$forEach	I
/*     */     //   379	709	12	element$iv	Ljava/lang/Object;
/*     */     //   386	701	13	cosmetic	Leu/shoroa/bridge/feature/cosmetic/b;
/*     */     //   389	698	14	$i$a$-forEach-PageCosmetics$click$3	I
/*     */     //   396	691	15	cardWidth	F
/*     */     //   415	672	16	xPos	F
/*     */     //   438	649	17	yPos	F
/*     */     //   503	584	18	hovered	Z
/*     */     //   562	118	20	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   565	115	21	$i$f$filter	I
/*     */     //   581	95	22	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   581	95	23	destination$iv$iv	Ljava/util/Collection;
/*     */     //   584	92	24	$i$f$filterTo	I
/*     */     //   612	59	26	element$iv$iv	Ljava/lang/Object;
/*     */     //   619	39	27	it	Leu/shoroa/bridge/feature/cosmetic/b;
/*     */     //   622	36	28	$i$a$-filter-PageCosmetics$click$3$1	I
/*     */     //   686	51	20	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   689	48	21	$i$f$forEach	I
/*     */     //   717	16	23	element$iv	Ljava/lang/Object;
/*     */     //   724	8	24	it	Leu/shoroa/bridge/feature/cosmetic/b;
/*     */     //   727	5	25	$i$a$-forEach-PageCosmetics$click$3$2	I
/*     */     //   813	118	20	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   816	115	21	$i$f$filter	I
/*     */     //   832	95	22	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   832	95	23	destination$iv$iv	Ljava/util/Collection;
/*     */     //   835	92	24	$i$f$filterTo	I
/*     */     //   863	59	26	element$iv$iv	Ljava/lang/Object;
/*     */     //   870	39	27	it	Leu/shoroa/bridge/feature/cosmetic/b;
/*     */     //   873	36	28	$i$a$-filter-PageCosmetics$click$3$3	I
/*     */     //   937	51	20	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   940	48	21	$i$f$forEach	I
/*     */     //   968	16	23	element$iv	Ljava/lang/Object;
/*     */     //   975	8	24	it	Leu/shoroa/bridge/feature/cosmetic/b;
/*     */     //   978	5	25	$i$a$-forEach-PageCosmetics$click$3$4	I
/*     */     //   1059	17	22	it	Ljava/lang/String;
/*     */     //   1062	14	23	$i$a$-let-PageCosmetics$click$3$5	I
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {
/*     */     this.d.release(mx, my, button);
/*     */     this.e.release(mx, my, button);
/*     */   }
/*     */   
/*     */   public void onKey(int code, char char) {}
/*     */   
/*     */   public void c(String query) {
/*     */     Intrinsics.checkNotNullParameter(query, "");
/*     */     this.c = query;
/*     */   }
/*     */   
/*     */   private final class a extends d {
/*     */     @NotNull
/*     */     private final String b;
/*     */     @NotNull
/*     */     private final String c;
/*     */     private final eu.shoroa.bridge.b.a.a d;
/*     */     
/*     */     public a(a this$0, String name, String type, float x, float y, float w, float h) {
/*     */       super(x, y, w, h);
/*     */       this.b = name;
/*     */       this.c = type;
/*     */       this.d = eu.shoroa.bridge.b.a.a.a(a::a, a::b);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Object clone() {
/*     */       return super.clone();
/*     */     }
/*     */     
/*     */     private static final Float a() {
/*     */       return Float.valueOf(180.0F);
/*     */     }
/*     */     
/*     */     private static final b b() {
/*     */       return b.LINEAR;
/*     */     }
/*     */     
/*     */     public void render(float mx, float my, float delta) {
/*     */       this.d.a(Intrinsics.areEqual(a.a(this.a), this.c));
/*     */       Intrinsics.checkNotNullExpressionValue(this.d.a(eu.shoroa.bridge.d.e.a.a.k().c(), eu.shoroa.bridge.d.e.a.a.k().d()), "");
/*     */       d.a(d.a, getX() - 10, getY(), getW() + 10, getH() - 10, 2.0F, d.a.a(this.d.a(eu.shoroa.bridge.d.e.a.a.k().c(), eu.shoroa.bridge.d.e.a.a.k().d())), 0.0F, 64, null);
/*     */       d.b(d.a, this.b, getX() + getW() / 2.0F - 4.0F, getY() + getH() - 20.0F + 2.0F, "semibold", 14.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     }
/*     */     
/*     */     public void click(float mx, float my, int button) {
/*     */       if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && !Intrinsics.areEqual(a.a(this.a), this.c))
/*     */         a.a(this.a, this.c); 
/*     */     }
/*     */     
/*     */     public void release(float mx, float my, int button) {}
/*     */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */