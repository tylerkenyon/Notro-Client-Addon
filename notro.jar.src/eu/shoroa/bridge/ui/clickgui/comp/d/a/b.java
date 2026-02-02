/*     */ package eu.shoroa.bridge.ui.clickgui.comp.d.a;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nProfilePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilePopup.kt\neu/shoroa/bridge/ui/clickgui/comp/settings/comp/ProfilePopup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1855#2,2:107\n*S KotlinDebug\n*F\n+ 1 ProfilePopup.kt\neu/shoroa/bridge/ui/clickgui/comp/settings/comp/ProfilePopup\n*L\n41#1:107,2\n*E\n"})
/*     */ public final class b {
/*     */   private boolean a;
/*     */   private float b;
/*  14 */   private final float e = 26.0F; private float c; @Nullable
/*  15 */   private a d; private final float f = 150.0F;
/*  16 */   private final float g = 1.0F;
/*  17 */   private final float h = 6.0F;
/*  18 */   private final float i = 32.0F; @NotNull
/*     */   private final List<Pair<String, String>> j;
/*     */   
/*     */   public b() {
/*  22 */     Pair[] arrayOfPair = new Pair[2]; arrayOfPair[0] = TuplesKt.to("Duplicate", "modules"); arrayOfPair[1] = 
/*  23 */       TuplesKt.to("Rename", "modules");
/*     */     this.j = CollectionsKt.listOf((Object[])arrayOfPair);
/*     */   }
/*     */   public final void a(float mx, float my, a element) {
/*  27 */     Intrinsics.checkNotNullParameter(element, ""); this.b = mx;
/*  28 */     this.c = my;
/*  29 */     this.d = element;
/*  30 */     this.a = true;
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
/*     */   public final void a(float mx, float my, float delta) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield a : Z
/*     */     //   4: ifne -> 8
/*     */     //   7: return
/*     */     //   8: aload_0
/*     */     //   9: getfield j : Ljava/util/List;
/*     */     //   12: invokeinterface size : ()I
/*     */     //   17: i2f
/*     */     //   18: aload_0
/*     */     //   19: getfield e : F
/*     */     //   22: aload_0
/*     */     //   23: getfield g : F
/*     */     //   26: fadd
/*     */     //   27: fmul
/*     */     //   28: aload_0
/*     */     //   29: getfield g : F
/*     */     //   32: fadd
/*     */     //   33: fstore #4
/*     */     //   35: new java/awt/Color
/*     */     //   38: dup
/*     */     //   39: bipush #25
/*     */     //   41: bipush #25
/*     */     //   43: bipush #25
/*     */     //   45: invokespecial <init> : (III)V
/*     */     //   48: astore #5
/*     */     //   50: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   53: aload_0
/*     */     //   54: getfield b : F
/*     */     //   57: aload_0
/*     */     //   58: getfield c : F
/*     */     //   61: aload_0
/*     */     //   62: getfield f : F
/*     */     //   65: fload #4
/*     */     //   67: aload_0
/*     */     //   68: getfield h : F
/*     */     //   71: getstatic eu/shoroa/bridge/b/b/d.a : Leu/shoroa/bridge/b/b/d$a;
/*     */     //   74: aload #5
/*     */     //   76: invokevirtual a : (Ljava/awt/Color;)Leu/shoroa/bridge/b/b/d;
/*     */     //   79: fconst_0
/*     */     //   80: bipush #64
/*     */     //   82: aconst_null
/*     */     //   83: invokestatic a : (Leu/shoroa/bridge/b/d;FFFFFLeu/shoroa/bridge/b/b/d;FILjava/lang/Object;)V
/*     */     //   86: fconst_0
/*     */     //   87: fstore #6
/*     */     //   89: aload_0
/*     */     //   90: getfield g : F
/*     */     //   93: fstore #6
/*     */     //   95: aload_0
/*     */     //   96: getfield j : Ljava/util/List;
/*     */     //   99: checkcast java/lang/Iterable
/*     */     //   102: astore #7
/*     */     //   104: iconst_0
/*     */     //   105: istore #8
/*     */     //   107: aload #7
/*     */     //   109: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   114: astore #9
/*     */     //   116: aload #9
/*     */     //   118: invokeinterface hasNext : ()Z
/*     */     //   123: ifeq -> 435
/*     */     //   126: aload #9
/*     */     //   128: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   133: astore #10
/*     */     //   135: aload #10
/*     */     //   137: checkcast kotlin/Pair
/*     */     //   140: astore #11
/*     */     //   142: iconst_0
/*     */     //   143: istore #12
/*     */     //   145: aload #11
/*     */     //   147: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   150: checkcast java/lang/String
/*     */     //   153: astore #13
/*     */     //   155: aload #11
/*     */     //   157: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   160: checkcast java/lang/String
/*     */     //   163: astore #14
/*     */     //   165: aload_0
/*     */     //   166: getfield b : F
/*     */     //   169: fstore #15
/*     */     //   171: fload_1
/*     */     //   172: aload_0
/*     */     //   173: getfield b : F
/*     */     //   176: aload_0
/*     */     //   177: getfield f : F
/*     */     //   180: fadd
/*     */     //   181: fcmpg
/*     */     //   182: ifgt -> 200
/*     */     //   185: fload #15
/*     */     //   187: fload_1
/*     */     //   188: fcmpg
/*     */     //   189: ifgt -> 196
/*     */     //   192: iconst_1
/*     */     //   193: goto -> 201
/*     */     //   196: iconst_0
/*     */     //   197: goto -> 201
/*     */     //   200: iconst_0
/*     */     //   201: ifeq -> 253
/*     */     //   204: aload_0
/*     */     //   205: getfield c : F
/*     */     //   208: fload #6
/*     */     //   210: fadd
/*     */     //   211: fstore #15
/*     */     //   213: fload_2
/*     */     //   214: aload_0
/*     */     //   215: getfield c : F
/*     */     //   218: fload #6
/*     */     //   220: fadd
/*     */     //   221: aload_0
/*     */     //   222: getfield e : F
/*     */     //   225: fadd
/*     */     //   226: fcmpg
/*     */     //   227: ifgt -> 245
/*     */     //   230: fload #15
/*     */     //   232: fload_2
/*     */     //   233: fcmpg
/*     */     //   234: ifgt -> 241
/*     */     //   237: iconst_1
/*     */     //   238: goto -> 246
/*     */     //   241: iconst_0
/*     */     //   242: goto -> 246
/*     */     //   245: iconst_0
/*     */     //   246: ifeq -> 253
/*     */     //   249: iconst_1
/*     */     //   250: goto -> 254
/*     */     //   253: iconst_0
/*     */     //   254: istore #16
/*     */     //   256: iload #16
/*     */     //   258: ifeq -> 277
/*     */     //   261: new java/awt/Color
/*     */     //   264: dup
/*     */     //   265: bipush #40
/*     */     //   267: bipush #40
/*     */     //   269: bipush #40
/*     */     //   271: invokespecial <init> : (III)V
/*     */     //   274: goto -> 279
/*     */     //   277: aload #5
/*     */     //   279: astore #15
/*     */     //   281: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   284: aload_0
/*     */     //   285: getfield b : F
/*     */     //   288: aload_0
/*     */     //   289: getfield c : F
/*     */     //   292: fload #6
/*     */     //   294: fadd
/*     */     //   295: aload_0
/*     */     //   296: getfield f : F
/*     */     //   299: aload_0
/*     */     //   300: getfield e : F
/*     */     //   303: aload_0
/*     */     //   304: getfield h : F
/*     */     //   307: getstatic eu/shoroa/bridge/b/b/d.a : Leu/shoroa/bridge/b/b/d$a;
/*     */     //   310: aload #15
/*     */     //   312: invokevirtual a : (Ljava/awt/Color;)Leu/shoroa/bridge/b/b/d;
/*     */     //   315: fconst_0
/*     */     //   316: bipush #64
/*     */     //   318: aconst_null
/*     */     //   319: invokestatic a : (Leu/shoroa/bridge/b/d;FFFFFLeu/shoroa/bridge/b/b/d;FILjava/lang/Object;)V
/*     */     //   322: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   325: aload #14
/*     */     //   327: aload_0
/*     */     //   328: getfield b : F
/*     */     //   331: aload_0
/*     */     //   332: getfield c : F
/*     */     //   335: fload #6
/*     */     //   337: fadd
/*     */     //   338: aload_0
/*     */     //   339: getfield e : F
/*     */     //   342: aload_0
/*     */     //   343: getfield i : F
/*     */     //   346: fsub
/*     */     //   347: fconst_2
/*     */     //   348: fdiv
/*     */     //   349: fadd
/*     */     //   350: aload_0
/*     */     //   351: getfield i : F
/*     */     //   354: aload_0
/*     */     //   355: getfield i : F
/*     */     //   358: fconst_1
/*     */     //   359: fconst_1
/*     */     //   360: invokevirtual a : (Ljava/lang/String;FFFFFF)V
/*     */     //   363: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   366: aload #13
/*     */     //   368: aload_0
/*     */     //   369: getfield b : F
/*     */     //   372: aload_0
/*     */     //   373: getfield i : F
/*     */     //   376: fadd
/*     */     //   377: aload_0
/*     */     //   378: getfield c : F
/*     */     //   381: fload #6
/*     */     //   383: fadd
/*     */     //   384: aload_0
/*     */     //   385: getfield e : F
/*     */     //   388: fconst_2
/*     */     //   389: fdiv
/*     */     //   390: fadd
/*     */     //   391: ldc 'regular'
/*     */     //   393: ldc 14.0
/*     */     //   395: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
/*     */     //   398: dup
/*     */     //   399: ldc ''
/*     */     //   401: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   404: getstatic eu/shoroa/bridge/b/d$a.LEFT_MIDDLE : Leu/shoroa/bridge/b/d$a;
/*     */     //   407: fconst_0
/*     */     //   408: fconst_0
/*     */     //   409: sipush #384
/*     */     //   412: aconst_null
/*     */     //   413: invokestatic b : (Leu/shoroa/bridge/b/d;Ljava/lang/String;FFLjava/lang/String;FLjava/awt/Color;Leu/shoroa/bridge/b/d$a;FFILjava/lang/Object;)V
/*     */     //   416: fload #6
/*     */     //   418: aload_0
/*     */     //   419: getfield e : F
/*     */     //   422: aload_0
/*     */     //   423: getfield g : F
/*     */     //   426: fadd
/*     */     //   427: fadd
/*     */     //   428: fstore #6
/*     */     //   430: nop
/*     */     //   431: nop
/*     */     //   432: goto -> 116
/*     */     //   435: nop
/*     */     //   436: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 0
/*     */     //   #36	-> 8
/*     */     //   #37	-> 35
/*     */     //   #38	-> 50
/*     */     //   #40	-> 86
/*     */     //   #41	-> 95
/*     */     //   #107	-> 107
/*     */     //   #41	-> 145
/*     */     //   #42	-> 165
/*     */     //   #43	-> 256
/*     */     //   #46	-> 281
/*     */     //   #49	-> 322
/*     */     //   #50	-> 325
/*     */     //   #51	-> 327
/*     */     //   #52	-> 331
/*     */     //   #53	-> 350
/*     */     //   #54	-> 354
/*     */     //   #55	-> 358
/*     */     //   #56	-> 359
/*     */     //   #49	-> 360
/*     */     //   #60	-> 363
/*     */     //   #61	-> 366
/*     */     //   #62	-> 368
/*     */     //   #63	-> 377
/*     */     //   #64	-> 391
/*     */     //   #65	-> 393
/*     */     //   #66	-> 395
/*     */     //   #67	-> 404
/*     */     //   #60	-> 407
/*     */     //   #70	-> 416
/*     */     //   #71	-> 430
/*     */     //   #107	-> 431
/*     */     //   #108	-> 435
/*     */     //   #72	-> 436
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	437	0	this	Leu/shoroa/bridge/ui/clickgui/comp/d/a/b;
/*     */     //   0	437	1	mx	F
/*     */     //   0	437	2	my	F
/*     */     //   0	437	3	delta	F
/*     */     //   35	402	4	totalHeight	F
/*     */     //   50	387	5	bgColor	Ljava/awt/Color;
/*     */     //   89	348	6	offsetY	F
/*     */     //   104	332	7	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   107	329	8	$i$f$forEach	I
/*     */     //   135	297	10	element$iv	Ljava/lang/Object;
/*     */     //   145	286	12	$i$a$-forEach-ProfilePopup$render$1	I
/*     */     //   155	276	13	label	Ljava/lang/String;
/*     */     //   165	266	14	iconPath	Ljava/lang/String;
/*     */     //   256	175	16	hovered	Z
/*     */     //   281	150	15	buttonColor	Ljava/awt/Color;
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
/*     */   public final boolean a(float mx, float my, int button) {
/*  75 */     if (!this.a) return false; 
/*  76 */     if (button != 0) return false;
/*     */     
/*  78 */     float offsetY = this.g;
/*  79 */     for (Iterator<Pair<String, String>> iterator = this.j.iterator(); iterator.hasNext(); ) { String label = (String)((Pair)iterator.next()).component1();
/*  80 */       float f = this.b; if ((mx <= this.b + this.f) ? ((f <= mx)) : false) { f = this.c + offsetY; if ((my <= this.c + offsetY + this.e) ? ((f <= my)) : false) {
/*  81 */           a(label);
/*  82 */           this.a = false;
/*  83 */           return true;
/*     */         }  }
/*  85 */        offsetY += this.e + this.g; }
/*     */ 
/*     */ 
/*     */     
/*  89 */     float f1 = this.b; if ((mx <= this.b + this.f) ? ((f1 <= mx)) : false) { f1 = this.c; if (!((my <= this.c + offsetY) ? ((f1 <= my) ? 1 : 0) : 0))
/*  90 */       { this.a = false;
/*     */ 
/*     */         
/*  93 */         return false; }  return false; }  this.a = false; return false;
/*     */   }
/*     */   private final void a(String opt) {
/*     */     eu.shoroa.bridge.ui.clickgui.comp.d.b profile;
/*  97 */     if (this.d == null || this.d.a() == null) { this.d.a(); return; }
/*  98 */      String str = opt; switch (str.hashCode()) { case -1089311509: if (!str.equals("Duplicate"))
/*  99 */           break;  System.out.println("Duplicate " + profile.a()); break;case 2089680852: if (!str.equals("Export"))
/* 100 */           break;  System.out.println("Export " + profile.a()); break;case 79847359: if (!str.equals("Share"))
/* 101 */           break;  System.out.println("Share " + profile.a()); break;case -273355399: if (!str.equals("Edit Settings"))
/* 102 */           break;  System.out.println("Edit Settings " + profile.a());
/*     */         break; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\d\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */