/*     */ package eu.shoroa.bridge.ui.clickgui.comp;
/*     */ @SourceDebugExtension({"SMAP\nPageList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageList.kt\neu/shoroa/bridge/ui/clickgui/comp/PageList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1855#2,2:169\n1855#2,2:171\n1855#2,2:173\n1855#2,2:176\n1855#2,2:178\n1855#2,2:180\n1855#2,2:182\n1#3:175\n*S KotlinDebug\n*F\n+ 1 PageList.kt\neu/shoroa/bridge/ui/clickgui/comp/PageList\n*L\n23#1:169,2\n36#1:171,2\n37#1:173,2\n106#1:176,2\n107#1:178,2\n112#1:180,2\n113#1:182,2\n*E\n"})
/*     */ public final class d extends d {
/*     */   @NotNull
/*     */   private final Set<b> a;
/*     */   @NotNull
/*     */   private b b;
/*     */   @NotNull
/*     */   private final ArrayList<a> c;
/*     */   @NotNull
/*     */   private final ArrayList<b> d;
/*     */   
/*  13 */   public d(Set<b> pages, float x, float y, float w, float h) { super(x, y, w, h); this.a = pages;
/*     */     
/*  15 */     this.b = (b)CollectionsKt.first(this.a);
/*     */ 
/*     */     
/*  18 */     this.c = new ArrayList<>();
/*  19 */     this.d = new ArrayList<>();
/*     */ 
/*     */     
/*  22 */     float i = 0.0F;
/*  23 */     Iterable<b> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 169 */     Iterator<b> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b page = (b)element$iv; int $i$a$-forEach-PageList$1 = 0; String[] arrayOfString = new String[2];
/*     */       arrayOfString[0] = "OTHER";
/*     */       arrayOfString[1] = "GENERAL"; }
/*     */      }
/*     */   @NotNull public final Set<b> a() { return this.a; }
/*     */   @NotNull public Object clone() { return super.clone(); } public void click(float mx, float my, int button) { Iterable<a> iterable = this.c;
/*     */     int $i$f$forEach = 0;
/* 176 */     Iterator<a> iterator = iterable.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-PageList$click$1 = 0; it.click(mx, my, button); }
/*     */      Iterable<b> $this$forEach$iv = this.d; $i$f$forEach = 0;
/* 178 */     iterator = (Iterator)$this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b it = (b)element$iv; int $i$a$-forEach-PageList$click$2 = 0; it.click(mx, my, button); }  this.b.click(mx, my, button); }
/*     */   @NotNull public final b b() { return this.b; }
/*     */   public void render(float mx, float my, float delta) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield c : Ljava/util/ArrayList;
/*     */     //   4: checkcast java/lang/Iterable
/*     */     //   7: astore #4
/*     */     //   9: iconst_0
/*     */     //   10: istore #5
/*     */     //   12: aload #4
/*     */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   19: astore #6
/*     */     //   21: aload #6
/*     */     //   23: invokeinterface hasNext : ()Z
/*     */     //   28: ifeq -> 62
/*     */     //   31: aload #6
/*     */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   38: astore #7
/*     */     //   40: aload #7
/*     */     //   42: checkcast eu/shoroa/bridge/ui/clickgui/comp/d$a
/*     */     //   45: astore #8
/*     */     //   47: iconst_0
/*     */     //   48: istore #9
/*     */     //   50: aload #8
/*     */     //   52: fload_1
/*     */     //   53: fload_2
/*     */     //   54: fload_3
/*     */     //   55: invokevirtual render : (FFF)V
/*     */     //   58: nop
/*     */     //   59: goto -> 21
/*     */     //   62: nop
/*     */     //   63: aload_0
/*     */     //   64: getfield d : Ljava/util/ArrayList;
/*     */     //   67: checkcast java/lang/Iterable
/*     */     //   70: astore #4
/*     */     //   72: iconst_0
/*     */     //   73: istore #5
/*     */     //   75: aload #4
/*     */     //   77: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   82: astore #6
/*     */     //   84: aload #6
/*     */     //   86: invokeinterface hasNext : ()Z
/*     */     //   91: ifeq -> 125
/*     */     //   94: aload #6
/*     */     //   96: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   101: astore #7
/*     */     //   103: aload #7
/*     */     //   105: checkcast eu/shoroa/bridge/ui/clickgui/comp/d$b
/*     */     //   108: astore #8
/*     */     //   110: iconst_0
/*     */     //   111: istore #9
/*     */     //   113: aload #8
/*     */     //   115: fload_1
/*     */     //   116: fload_2
/*     */     //   117: fload_3
/*     */     //   118: invokevirtual render : (FFF)V
/*     */     //   121: nop
/*     */     //   122: goto -> 84
/*     */     //   125: nop
/*     */     //   126: aload_0
/*     */     //   127: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   130: invokevirtual d : ()Leu/shoroa/bridge/b/a/a;
/*     */     //   133: iconst_1
/*     */     //   134: invokevirtual a : (Z)V
/*     */     //   137: getstatic eu/shoroa/bridge/b/d/b.INSTANCE : Leu/shoroa/bridge/b/d/b;
/*     */     //   140: aload_0
/*     */     //   141: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   144: invokevirtual d : ()Leu/shoroa/bridge/b/a/a;
/*     */     //   147: invokevirtual a : ()F
/*     */     //   150: invokevirtual c : (F)V
/*     */     //   153: aload_0
/*     */     //   154: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   157: fload_1
/*     */     //   158: fload_2
/*     */     //   159: fload_3
/*     */     //   160: invokevirtual render : (FFF)V
/*     */     //   163: aload_0
/*     */     //   164: invokevirtual getX : ()F
/*     */     //   167: aload_0
/*     */     //   168: invokevirtual getW : ()F
/*     */     //   171: fadd
/*     */     //   172: ldc 30.0
/*     */     //   174: fadd
/*     */     //   175: fstore #4
/*     */     //   177: aload_0
/*     */     //   178: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   181: invokevirtual getY : ()F
/*     */     //   184: fstore #5
/*     */     //   186: aload_0
/*     */     //   187: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   190: invokevirtual b : ()Ljava/lang/String;
/*     */     //   193: astore #6
/*     */     //   195: aload #6
/*     */     //   197: invokevirtual hashCode : ()I
/*     */     //   200: lookupswitch default -> 811, -1402880153 -> 249, 1642909613 -> 236, 1758909160 -> 262
/*     */     //   236: aload #6
/*     */     //   238: ldc 'Screenshots'
/*     */     //   240: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   243: ifne -> 425
/*     */     //   246: goto -> 811
/*     */     //   249: aload #6
/*     */     //   251: ldc 'Modules'
/*     */     //   253: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   256: ifne -> 578
/*     */     //   259: goto -> 811
/*     */     //   262: aload #6
/*     */     //   264: ldc 'Resource Packs'
/*     */     //   266: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   269: ifeq -> 811
/*     */     //   272: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   275: aload_0
/*     */     //   276: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   279: invokevirtual c : ()Ljava/lang/String;
/*     */     //   282: fload #4
/*     */     //   284: fload #5
/*     */     //   286: ldc 25.0
/*     */     //   288: fadd
/*     */     //   289: ldc 'bold'
/*     */     //   291: ldc 18.0
/*     */     //   293: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   296: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   299: invokevirtual e : ()Ljava/awt/Color;
/*     */     //   302: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   305: fconst_0
/*     */     //   306: fconst_0
/*     */     //   307: sipush #384
/*     */     //   310: aconst_null
/*     */     //   311: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   314: ldc '.minecraft > '
/*     */     //   316: astore #7
/*     */     //   318: ldc 'resoursepacks'
/*     */     //   320: astore #8
/*     */     //   322: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   325: aload #7
/*     */     //   327: fload #4
/*     */     //   329: fload #5
/*     */     //   331: ldc 40.0
/*     */     //   333: fadd
/*     */     //   334: ldc 'semibold'
/*     */     //   336: ldc 12.0
/*     */     //   338: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   341: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   344: invokevirtual e : ()Ljava/awt/Color;
/*     */     //   347: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   350: fconst_0
/*     */     //   351: fconst_0
/*     */     //   352: sipush #384
/*     */     //   355: aconst_null
/*     */     //   356: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   359: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   362: aload #7
/*     */     //   364: ldc 'semibold'
/*     */     //   366: ldc 12.0
/*     */     //   368: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;F)F
/*     */     //   371: fstore #9
/*     */     //   373: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   376: aload #8
/*     */     //   378: fload #4
/*     */     //   380: fload #9
/*     */     //   382: fadd
/*     */     //   383: fload #5
/*     */     //   385: ldc 40.0
/*     */     //   387: fadd
/*     */     //   388: ldc 'semibold'
/*     */     //   390: ldc 12.0
/*     */     //   392: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   395: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   398: invokevirtual f : ()Ljava/awt/Color;
/*     */     //   401: invokevirtual darker : ()Ljava/awt/Color;
/*     */     //   404: dup
/*     */     //   405: ldc ''
/*     */     //   407: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   410: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   413: fconst_0
/*     */     //   414: fconst_0
/*     */     //   415: sipush #384
/*     */     //   418: aconst_null
/*     */     //   419: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   422: goto -> 853
/*     */     //   425: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   428: aload_0
/*     */     //   429: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   432: invokevirtual c : ()Ljava/lang/String;
/*     */     //   435: fload #4
/*     */     //   437: fload #5
/*     */     //   439: ldc 25.0
/*     */     //   441: fadd
/*     */     //   442: ldc 'bold'
/*     */     //   444: ldc 18.0
/*     */     //   446: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   449: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   452: invokevirtual e : ()Ljava/awt/Color;
/*     */     //   455: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   458: fconst_0
/*     */     //   459: fconst_0
/*     */     //   460: sipush #384
/*     */     //   463: aconst_null
/*     */     //   464: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   467: ldc '.minecraft > '
/*     */     //   469: astore #7
/*     */     //   471: ldc 'screenshots'
/*     */     //   473: astore #8
/*     */     //   475: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   478: aload #7
/*     */     //   480: fload #4
/*     */     //   482: fload #5
/*     */     //   484: ldc 40.0
/*     */     //   486: fadd
/*     */     //   487: ldc 'semibold'
/*     */     //   489: ldc 12.0
/*     */     //   491: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   494: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   497: invokevirtual e : ()Ljava/awt/Color;
/*     */     //   500: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   503: fconst_0
/*     */     //   504: fconst_0
/*     */     //   505: sipush #384
/*     */     //   508: aconst_null
/*     */     //   509: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   512: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   515: aload #7
/*     */     //   517: ldc 'semibold'
/*     */     //   519: ldc 12.0
/*     */     //   521: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;F)F
/*     */     //   524: fstore #9
/*     */     //   526: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   529: aload #8
/*     */     //   531: fload #4
/*     */     //   533: fload #9
/*     */     //   535: fadd
/*     */     //   536: fload #5
/*     */     //   538: ldc 40.0
/*     */     //   540: fadd
/*     */     //   541: ldc 'semibold'
/*     */     //   543: ldc 12.0
/*     */     //   545: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   548: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   551: invokevirtual f : ()Ljava/awt/Color;
/*     */     //   554: invokevirtual darker : ()Ljava/awt/Color;
/*     */     //   557: dup
/*     */     //   558: ldc ''
/*     */     //   560: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   563: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   566: fconst_0
/*     */     //   567: fconst_0
/*     */     //   568: sipush #384
/*     */     //   571: aconst_null
/*     */     //   572: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   575: goto -> 853
/*     */     //   578: aload_0
/*     */     //   579: getfield a : Ljava/util/Set;
/*     */     //   582: checkcast java/lang/Iterable
/*     */     //   585: astore #10
/*     */     //   587: aload #10
/*     */     //   589: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   594: astore #11
/*     */     //   596: aload #11
/*     */     //   598: invokeinterface hasNext : ()Z
/*     */     //   603: ifeq -> 638
/*     */     //   606: aload #11
/*     */     //   608: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   613: astore #12
/*     */     //   615: aload #12
/*     */     //   617: checkcast eu/shoroa/bridge/ui/clickgui/comp/b
/*     */     //   620: astore #13
/*     */     //   622: iconst_0
/*     */     //   623: istore #14
/*     */     //   625: aload #13
/*     */     //   627: instanceof eu/shoroa/bridge/ui/clickgui/comp/module/a
/*     */     //   630: ifeq -> 596
/*     */     //   633: aload #12
/*     */     //   635: goto -> 639
/*     */     //   638: aconst_null
/*     */     //   639: astore #8
/*     */     //   641: aload #8
/*     */     //   643: instanceof eu/shoroa/bridge/ui/clickgui/comp/module/a
/*     */     //   646: ifeq -> 657
/*     */     //   649: aload #8
/*     */     //   651: checkcast eu/shoroa/bridge/ui/clickgui/comp/module/a
/*     */     //   654: goto -> 658
/*     */     //   657: aconst_null
/*     */     //   658: astore #7
/*     */     //   660: aload #7
/*     */     //   662: dup
/*     */     //   663: ifnull -> 708
/*     */     //   666: invokevirtual h : ()Leu/shoroa/bridge/ui/clickgui/comp/module/comp/a;
/*     */     //   669: dup
/*     */     //   670: ifnull -> 708
/*     */     //   673: invokevirtual e : ()Ljava/util/ArrayList;
/*     */     //   676: dup
/*     */     //   677: ifnull -> 708
/*     */     //   680: checkcast java/util/Collection
/*     */     //   683: invokeinterface isEmpty : ()Z
/*     */     //   688: ifne -> 695
/*     */     //   691: iconst_1
/*     */     //   692: goto -> 696
/*     */     //   695: iconst_0
/*     */     //   696: iconst_1
/*     */     //   697: if_icmpne -> 704
/*     */     //   700: iconst_1
/*     */     //   701: goto -> 710
/*     */     //   704: iconst_0
/*     */     //   705: goto -> 710
/*     */     //   708: pop
/*     */     //   709: iconst_0
/*     */     //   710: istore #8
/*     */     //   712: iload #8
/*     */     //   714: ifeq -> 766
/*     */     //   717: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   720: aload_0
/*     */     //   721: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   724: invokevirtual c : ()Ljava/lang/String;
/*     */     //   727: fload #4
/*     */     //   729: bipush #40
/*     */     //   731: i2f
/*     */     //   732: fadd
/*     */     //   733: fload #5
/*     */     //   735: ldc 33.0
/*     */     //   737: fadd
/*     */     //   738: ldc 'semibold'
/*     */     //   740: ldc 18.0
/*     */     //   742: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   745: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   748: invokevirtual e : ()Ljava/awt/Color;
/*     */     //   751: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   754: fconst_0
/*     */     //   755: fconst_0
/*     */     //   756: sipush #384
/*     */     //   759: aconst_null
/*     */     //   760: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   763: goto -> 853
/*     */     //   766: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   769: aload_0
/*     */     //   770: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   773: invokevirtual c : ()Ljava/lang/String;
/*     */     //   776: fload #4
/*     */     //   778: fload #5
/*     */     //   780: ldc 31.0
/*     */     //   782: fadd
/*     */     //   783: ldc 'semibold'
/*     */     //   785: ldc 18.0
/*     */     //   787: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   790: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   793: invokevirtual e : ()Ljava/awt/Color;
/*     */     //   796: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   799: fconst_0
/*     */     //   800: fconst_0
/*     */     //   801: sipush #384
/*     */     //   804: aconst_null
/*     */     //   805: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   808: goto -> 853
/*     */     //   811: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   814: aload_0
/*     */     //   815: getfield b : Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   818: invokevirtual c : ()Ljava/lang/String;
/*     */     //   821: fload #4
/*     */     //   823: fload #5
/*     */     //   825: ldc 31.0
/*     */     //   827: fadd
/*     */     //   828: ldc 'semibold'
/*     */     //   830: ldc 18.0
/*     */     //   832: getstatic eu/shoroa/bridge/d/e/a.a : Leu/shoroa/bridge/d/e/a$a;
/*     */     //   835: invokevirtual k : ()Leu/shoroa/bridge/d/e/a;
/*     */     //   838: invokevirtual e : ()Ljava/awt/Color;
/*     */     //   841: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   844: fconst_0
/*     */     //   845: fconst_0
/*     */     //   846: sipush #384
/*     */     //   849: aconst_null
/*     */     //   850: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   853: getstatic eu/shoroa/bridge/b/d/b.INSTANCE : Leu/shoroa/bridge/b/d/b;
/*     */     //   856: fconst_1
/*     */     //   857: invokevirtual c : (F)V
/*     */     //   860: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 0
/*     */     //   #171	-> 12
/*     */     //   #36	-> 50
/*     */     //   #171	-> 58
/*     */     //   #172	-> 62
/*     */     //   #37	-> 63
/*     */     //   #173	-> 75
/*     */     //   #37	-> 113
/*     */     //   #173	-> 121
/*     */     //   #174	-> 125
/*     */     //   #40	-> 126
/*     */     //   #41	-> 137
/*     */     //   #42	-> 153
/*     */     //   #45	-> 163
/*     */     //   #46	-> 177
/*     */     //   #48	-> 186
/*     */     //   #50	-> 272
/*     */     //   #51	-> 314
/*     */     //   #52	-> 318
/*     */     //   #53	-> 322
/*     */     //   #54	-> 359
/*     */     //   #55	-> 373
/*     */     //   #58	-> 425
/*     */     //   #59	-> 467
/*     */     //   #60	-> 471
/*     */     //   #61	-> 475
/*     */     //   #62	-> 512
/*     */     //   #63	-> 526
/*     */     //   #67	-> 578
/*     */     //   #175	-> 622
/*     */     //   #67	-> 625
/*     */     //   #69	-> 660
/*     */     //   #71	-> 712
/*     */     //   #72	-> 717
/*     */     //   #73	-> 720
/*     */     //   #74	-> 727
/*     */     //   #75	-> 733
/*     */     //   #76	-> 738
/*     */     //   #77	-> 740
/*     */     //   #78	-> 742
/*     */     //   #79	-> 751
/*     */     //   #72	-> 754
/*     */     //   #83	-> 766
/*     */     //   #84	-> 769
/*     */     //   #85	-> 776
/*     */     //   #86	-> 778
/*     */     //   #87	-> 783
/*     */     //   #88	-> 785
/*     */     //   #89	-> 787
/*     */     //   #90	-> 796
/*     */     //   #83	-> 799
/*     */     //   #97	-> 811
/*     */     //   #101	-> 853
/*     */     //   #102	-> 860
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	861	0	this	Leu/shoroa/bridge/ui/clickgui/comp/d;
/*     */     //   0	861	1	mx	F
/*     */     //   0	861	2	my	F
/*     */     //   0	861	3	delta	F
/*     */     //   9	54	4	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   12	51	5	$i$f$forEach	I
/*     */     //   40	19	7	element$iv	Ljava/lang/Object;
/*     */     //   47	11	8	it	Leu/shoroa/bridge/ui/clickgui/comp/d$a;
/*     */     //   50	8	9	$i$a$-forEach-PageList$render$1	I
/*     */     //   72	54	4	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   75	51	5	$i$f$forEach	I
/*     */     //   103	19	7	element$iv	Ljava/lang/Object;
/*     */     //   110	11	8	it	Leu/shoroa/bridge/ui/clickgui/comp/d$b;
/*     */     //   113	8	9	$i$a$-forEach-PageList$render$2	I
/*     */     //   177	684	4	textX	F
/*     */     //   186	675	5	textY	F
/*     */     //   318	104	7	base	Ljava/lang/String;
/*     */     //   322	100	8	highlight	Ljava/lang/String;
/*     */     //   373	49	9	baseWidth	F
/*     */     //   471	104	7	base	Ljava/lang/String;
/*     */     //   475	100	8	highlight	Ljava/lang/String;
/*     */     //   526	49	9	baseWidth	F
/*     */     //   622	8	13	it	Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   625	5	14	$i$a$-find-PageList$render$modulesPage$1	I
/*     */     //   660	148	7	modulesPage	Leu/shoroa/bridge/ui/clickgui/comp/module/a;
/* 180 */     //   712	96	8	isSettingsOpen	Z } public void release(float mx, float my, int button) { Iterable<a> iterable = this.c; int $i$f$forEach = 0; Iterator<a> iterator = iterable.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-PageList$release$1 = 0; it.release(mx, my, button); }
/*     */      Iterable<b> $this$forEach$iv = this.d; $i$f$forEach = 0;
/* 182 */     iterator = (Iterator)$this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b it = (b)element$iv; int $i$a$-forEach-PageList$release$2 = 0;
/*     */       it.release(mx, my, button); }
/*     */     
/*     */     this.b.release(mx, my, button); }
/*     */ 
/*     */   
/*     */   public void onKey(int code, char char) {
/*     */     this.b.onKey(code, char);
/*     */   }
/*     */   
/*     */   private final class a extends d {
/*     */     @NotNull
/*     */     private final b b;
/*     */     private final eu.shoroa.bridge.b.a.a c;
/*     */     
/*     */     public a(d this$0, b page, float x, float y, float w, float h) {
/*     */       super(x, y, w, h);
/*     */       this.b = page;
/*     */       this.c = eu.shoroa.bridge.b.a.a.a(a::b, a::c);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final b a() {
/*     */       return this.b;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Object clone() {
/*     */       return super.clone();
/*     */     }
/*     */     
/*     */     private static final Float b() {
/*     */       return Float.valueOf(180.0F);
/*     */     }
/*     */     
/*     */     private static final eu.shoroa.bridge.b.a.b c() {
/*     */       return eu.shoroa.bridge.b.a.b.LINEAR;
/*     */     }
/*     */     
/*     */     public void render(float mx, float my, float delta) {
/*     */       this.c.a(Intrinsics.areEqual(this.a.b(), this.b));
/*     */       if (Intrinsics.areEqual(this.a.b(), this.b)) {
/*     */         eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, this, 12.0F, eu.shoroa.bridge.b.b.d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 8, null);
/*     */         eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, this, 12.0F, eu.shoroa.bridge.b.b.d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()).a(1.5F), 0.0F, 8, null);
/*     */       } 
/*     */       float iconSize = Math.min(getH() * 0.8F, 36.0F);
/*     */       float iconX = getX() + 10.0F;
/*     */       float iconY = getY() + (getH() - iconSize) / 2.0F;
/*     */       eu.shoroa.bridge.b.d.a.a(this.b.a(), iconX, iconY, iconSize, iconSize, 0.0F, 1.0F);
/*     */       eu.shoroa.bridge.b.d.b(eu.shoroa.bridge.b.d.a, this.b.b(), iconX + iconSize + 8.0F, getY() + getH() / 2.0F + 1.0F, "semibold", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.b.d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     }
/*     */     
/*     */     public void click(float mx, float my, int button) {
/*     */       if (!(this.b instanceof c) && d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null))
/*     */         d.a(this.a, this.b); 
/*     */     }
/*     */     
/*     */     public void release(float mx, float my, int button) {}
/*     */   }
/*     */   
/*     */   private final class b extends d {
/*     */     @NotNull
/*     */     private final b b;
/*     */     
/*     */     public b(d this$0, b page, float x, float y, float w, float h) {
/*     */       super(x, y, w, h);
/*     */       this.b = page;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final b a() {
/*     */       return this.b;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Object clone() {
/*     */       return super.clone();
/*     */     }
/*     */     
/*     */     public void render(float mx, float my, float delta) {
/*     */       eu.shoroa.bridge.b.d.b(eu.shoroa.bridge.b.d.a, this.b.b(), getX(), getY() + getH() / 2.0F + 1.0F, "extrabold", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.b.d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     }
/*     */     
/*     */     public void click(float mx, float my, int button) {
/*     */       if (!(this.b instanceof c) && d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null))
/*     */         d.a(this.a, this.b); 
/*     */     }
/*     */     
/*     */     public void release(float mx, float my, int button) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */