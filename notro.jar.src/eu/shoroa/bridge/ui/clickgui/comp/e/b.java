/*     */ package eu.shoroa.bridge.ui.clickgui.comp.e;
/*     */ 
/*     */ import eu.shoroa.bridge.d.e.a;
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nPageThemes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageThemes.kt\neu/shoroa/bridge/ui/clickgui/comp/themes/PageThemes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1864#2,3:150\n766#2:153\n857#2,2:154\n1864#2,3:156\n1855#2,2:159\n1855#2,2:161\n1855#2,2:163\n*S KotlinDebug\n*F\n+ 1 PageThemes.kt\neu/shoroa/bridge/ui/clickgui/comp/themes/PageThemes\n*L\n40#1:150,3\n62#1:153\n62#1:154,2\n71#1:156,3\n94#1:159,2\n123#1:161,2\n134#1:163,2\n*E\n"})
/*     */ public final class b extends b {
/*     */   private final float a;
/*     */   private final int b;
/*     */   private final float c;
/*     */   
/*  13 */   public b(float x, float y, float w, float h) { super("themes", "Themes", "Themes", x, y, w, h);
/*     */     
/*  15 */     this.b = 6;
/*     */     
/*  17 */     this.d = 68.0F;
/*     */     
/*  19 */     this.e = 120.0F;
/*  20 */     this.f = 120.0F;
/*     */ 
/*     */     
/*  23 */     this.g = CollectionsKt.toMutableList(a.a.l());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  28 */     f(); }
/*     */   private final float d; private final float e; private final float f; @NotNull
/*     */   private final List<a> g; @NotNull
/*     */   public Object clone() { return super.clone(); } private final void f() {
/*  32 */     float currentX = 0.0F; currentX = getX() + this.c;
/*  33 */     float currentY = 0.0F; currentY = getY() + this.d + this.a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     getElements().clear();
/*     */     
/*  40 */     Iterable<a> $this$forEachIndexed$iv = this.g; int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     int index$iv = 0;
/* 151 */     Iterator<a> iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  a a = (a)item$iv; int index = i, $i$a$-forEachIndexed-PageThemes$createThemeElements$1 = 0; if (index > 0 && index % this.b == 0) { currentX = getX() + this.c; currentY += this.f + this.a; }
/*     */        }
/* 153 */      } private final void d(String searchText) { getElements().clear(); Iterable<a> $this$filter$iv = this.g; int $i$f$filter = 0; Iterable<a> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 154 */     for (a element$iv$iv : iterable1) { a it = element$iv$iv; int $i$a$-filter-PageThemes$filterThemes$filteredThemes$1 = 0; Intrinsics.checkNotNullExpressionValue(it.a().toLowerCase(Locale.ROOT), ""); Intrinsics.checkNotNullExpressionValue(searchText.toLowerCase(Locale.ROOT), ""); if (StringsKt.contains$default(it.a().toLowerCase(Locale.ROOT), searchText.toLowerCase(Locale.ROOT), false, 2, null)) destination$iv$iv.add(element$iv$iv);  }
/* 155 */      List filteredThemes = StringsKt.isBlank(searchText) ? this.g : (List)destination$iv$iv; float currentX = 0.0F; currentX = getX() + this.c; float currentY = 0.0F; currentY = getY() + this.d + this.a; Iterable $this$forEachIndexed$iv = filteredThemes; int $i$f$forEachIndexed = 0;
/* 156 */     int index$iv = 0;
/* 157 */     Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  a a = (a)item$iv; int index = i, $i$a$-forEachIndexed-PageThemes$filterThemes$1 = 0; if (index > 0 && index % this.b == 0) {
/*     */         currentX = getX() + this.c; currentY += this.f + this.a;
/*     */       }  }
/*     */      } public void render(float mx, float my, float delta) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getElements : ()Ljava/util/List;
/*     */     //   4: invokeinterface size : ()I
/*     */     //   9: i2f
/*     */     //   10: aload_0
/*     */     //   11: getfield b : I
/*     */     //   14: i2f
/*     */     //   15: fdiv
/*     */     //   16: f2d
/*     */     //   17: invokestatic ceil : (D)D
/*     */     //   20: d2i
/*     */     //   21: istore #4
/*     */     //   23: iload #4
/*     */     //   25: i2f
/*     */     //   26: aload_0
/*     */     //   27: getfield f : F
/*     */     //   30: aload_0
/*     */     //   31: getfield a : F
/*     */     //   34: fadd
/*     */     //   35: fmul
/*     */     //   36: fstore #5
/*     */     //   38: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
/*     */     //   41: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
/*     */     //   44: dup
/*     */     //   45: ifnull -> 75
/*     */     //   48: getfield clickgui : Leu/shoroa/bridge/ui/clickgui/b;
/*     */     //   51: dup
/*     */     //   52: ifnull -> 75
/*     */     //   55: invokevirtual a : ()Leu/shoroa/bridge/ui/clickgui/a;
/*     */     //   58: dup
/*     */     //   59: ifnull -> 75
/*     */     //   62: invokevirtual a : ()Leu/shoroa/bridge/ui/clickgui/comp/d;
/*     */     //   65: dup
/*     */     //   66: ifnull -> 75
/*     */     //   69: invokevirtual b : ()Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   72: goto -> 77
/*     */     //   75: pop
/*     */     //   76: aconst_null
/*     */     //   77: aload_0
/*     */     //   78: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   81: ifeq -> 225
/*     */     //   84: fconst_0
/*     */     //   85: fstore #6
/*     */     //   87: aload_0
/*     */     //   88: invokevirtual getElements : ()Ljava/util/List;
/*     */     //   91: checkcast java/lang/Iterable
/*     */     //   94: astore #7
/*     */     //   96: iconst_0
/*     */     //   97: istore #8
/*     */     //   99: aload #7
/*     */     //   101: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   106: astore #9
/*     */     //   108: aload #9
/*     */     //   110: invokeinterface hasNext : ()Z
/*     */     //   115: ifeq -> 154
/*     */     //   118: aload #9
/*     */     //   120: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   125: astore #10
/*     */     //   127: aload #10
/*     */     //   129: checkcast eu/shoroa/bridge/ui/b/d
/*     */     //   132: astore #11
/*     */     //   134: iconst_0
/*     */     //   135: istore #12
/*     */     //   137: fload #6
/*     */     //   139: aload #11
/*     */     //   141: invokevirtual getH : ()F
/*     */     //   144: ldc 10.0
/*     */     //   146: fadd
/*     */     //   147: fadd
/*     */     //   148: fstore #6
/*     */     //   150: nop
/*     */     //   151: goto -> 108
/*     */     //   154: nop
/*     */     //   155: aload_0
/*     */     //   156: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   159: aload_0
/*     */     //   160: invokevirtual getH : ()F
/*     */     //   163: ldc 70.0
/*     */     //   165: fsub
/*     */     //   166: invokevirtual d : (F)V
/*     */     //   169: aload_0
/*     */     //   170: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   173: fload #6
/*     */     //   175: invokevirtual c : (F)V
/*     */     //   178: aload_0
/*     */     //   179: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   182: aload_0
/*     */     //   183: checkcast eu/shoroa/bridge/ui/b/d
/*     */     //   186: fconst_0
/*     */     //   187: fconst_0
/*     */     //   188: fconst_0
/*     */     //   189: fconst_0
/*     */     //   190: bipush #15
/*     */     //   192: aconst_null
/*     */     //   193: invokestatic hovered$default : (Leu/shoroa/bridge/ui/b/d;FFFFILjava/lang/Object;)Z
/*     */     //   196: invokevirtual a : (Z)V
/*     */     //   199: aload_0
/*     */     //   200: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   203: iconst_1
/*     */     //   204: invokevirtual b : (Z)V
/*     */     //   207: aload_0
/*     */     //   208: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   211: ldc 50.0
/*     */     //   213: invokevirtual a : (F)V
/*     */     //   216: aload_0
/*     */     //   217: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   220: ldc 300.0
/*     */     //   222: invokevirtual e : (F)V
/*     */     //   225: aload_0
/*     */     //   226: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   229: invokevirtual c : ()F
/*     */     //   232: fstore #6
/*     */     //   234: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   237: aload_0
/*     */     //   238: invokevirtual getX : ()F
/*     */     //   241: aload_0
/*     */     //   242: invokevirtual getY : ()F
/*     */     //   245: aload_0
/*     */     //   246: getfield d : F
/*     */     //   249: fadd
/*     */     //   250: aload_0
/*     */     //   251: invokevirtual getW : ()F
/*     */     //   254: aload_0
/*     */     //   255: invokevirtual getH : ()F
/*     */     //   258: aload_0
/*     */     //   259: getfield d : F
/*     */     //   262: fsub
/*     */     //   263: new eu/shoroa/bridge/ui/clickgui/comp/e/b$1
/*     */     //   266: dup
/*     */     //   267: aload_0
/*     */     //   268: fload #6
/*     */     //   270: fload_1
/*     */     //   271: fload_2
/*     */     //   272: fload_3
/*     */     //   273: invokespecial <init> : (Leu/shoroa/bridge/ui/clickgui/comp/e/b;FFFF)V
/*     */     //   276: checkcast kotlin/jvm/functions/Function0
/*     */     //   279: invokevirtual a : (FFFFLkotlin/jvm/functions/Function0;)V
/*     */     //   282: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 0
/*     */     //   #90	-> 23
/*     */     //   #92	-> 38
/*     */     //   #93	-> 84
/*     */     //   #94	-> 87
/*     */     //   #159	-> 99
/*     */     //   #94	-> 137
/*     */     //   #159	-> 150
/*     */     //   #160	-> 154
/*     */     //   #95	-> 155
/*     */     //   #96	-> 169
/*     */     //   #97	-> 178
/*     */     //   #98	-> 199
/*     */     //   #99	-> 207
/*     */     //   #100	-> 216
/*     */     //   #103	-> 225
/*     */     //   #105	-> 234
/*     */     //   #119	-> 282
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	283	0	this	Leu/shoroa/bridge/ui/clickgui/comp/e/b;
/*     */     //   0	283	1	mx	F
/*     */     //   0	283	2	my	F
/*     */     //   0	283	3	delta	F
/*     */     //   23	260	4	rowCount	I
/*     */     //   38	245	5	totalHeight	F
/*     */     //   87	138	6	maxHeight	F
/*     */     //   96	59	7	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   99	56	8	$i$f$forEach	I
/*     */     //   127	24	10	element$iv	Ljava/lang/Object;
/*     */     //   134	16	11	it	Leu/shoroa/bridge/ui/b/d;
/*     */     //   137	13	12	$i$a$-forEach-PageThemes$render$1	I
/*     */     //   234	49	6	scrl	F }
/* 161 */   public void click(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d element = (d)element$iv; int $i$a$-forEach-PageThemes$click$1 = 0; if (element.getY() + element.getH() >= getY() + 60.0F && element.getY() <= getY() + getH() && d.hovered$default(element, mx, my, 0.0F, 0.0F, 12, null))
/*     */         element.click(mx, my, button);  }
/* 163 */      } public void release(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d element = (d)element$iv; int $i$a$-forEach-PageThemes$release$1 = 0;
/*     */       if (element.getY() + element.getH() >= getY() + 60.0F && element.getY() <= getY() + getH() && d.hovered$default(element, mx, my, 0.0F, 0.0F, 12, null))
/*     */         element.release(mx, my, button);  }
/*     */      }
/*     */ 
/*     */   
/*     */   public void c(String query) {
/*     */     Intrinsics.checkNotNullParameter(query, "");
/*     */     d(query);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\e\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */