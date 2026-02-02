/*     */ package eu.shoroa.bridge.ui.clickgui.comp.c;
/*     */ 
/*     */ import eu.shoroa.bridge.ui.clickgui.comp.a;
/*     */ import java.io.File;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nPageScreenshots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageScreenshots.kt\neu/shoroa/bridge/ui/clickgui/comp/screenshots/PageScreenshots\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n6523#2:129\n1855#3,2:130\n1855#3,2:132\n1855#3,2:134\n*S KotlinDebug\n*F\n+ 1 PageScreenshots.kt\neu/shoroa/bridge/ui/clickgui/comp/screenshots/PageScreenshots\n*L\n47#1:129\n48#1:130,2\n107#1:132,2\n110#1:134,2\n*E\n"})
/*     */ public final class c extends b {
/*     */   @NotNull
/*     */   private final File a;
/*     */   private final float b;
/*     */   private final float c;
/*     */   private float d;
/*     */   
/*  15 */   public c(float x, float y, float w, float h) { super("screenshots", "Screenshots", "Screenshots", x, y, w, h);
/*     */     
/*  17 */     this.a = new File("screenshots");
/*  18 */     this.b = 16.0F;
/*  19 */     this.c = 1.7777778F;
/*     */ 
/*     */     
/*  22 */     this.f = 30.0F;
/*  23 */     this.g = 14.0F;
/*     */     
/*  25 */     this.h = new ArrayList<>();
/*  26 */     this.i = new ArrayList<>();
/*     */ 
/*     */ 
/*     */     
/*  30 */     g();
/*  31 */     f(); }
/*     */   private float e; private float f; private float g; @NotNull
/*     */   private final List<a> h; @NotNull
/*     */   private final List<File> i; @NotNull
/*  35 */   public Object clone() { return super.clone(); } private final void g() { int perRow = 3;
/*  36 */     float usableWidth = getW() - 20.0F;
/*  37 */     this.d = (usableWidth - (perRow - 1) * this.b) / perRow;
/*  38 */     this.e = this.d / this.c;
/*  39 */     this.f = RangesKt.coerceIn(this.d * 0.08F, 20.0F, 36.0F);
/*  40 */     this.g = RangesKt.coerceIn(this.d * 0.035F, 11.0F, 16.0F); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void f() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield h : Ljava/util/List;
/*     */     //   4: invokeinterface clear : ()V
/*     */     //   9: aload_0
/*     */     //   10: getfield a : Ljava/io/File;
/*     */     //   13: invokevirtual exists : ()Z
/*     */     //   16: ifeq -> 29
/*     */     //   19: aload_0
/*     */     //   20: getfield a : Ljava/io/File;
/*     */     //   23: invokevirtual isDirectory : ()Z
/*     */     //   26: ifne -> 30
/*     */     //   29: return
/*     */     //   30: aload_0
/*     */     //   31: getfield a : Ljava/io/File;
/*     */     //   34: invokevirtual listFiles : ()[Ljava/io/File;
/*     */     //   37: dup
/*     */     //   38: ifnull -> 65
/*     */     //   41: astore #4
/*     */     //   43: iconst_0
/*     */     //   44: istore #5
/*     */     //   46: aload #4
/*     */     //   48: new eu/shoroa/bridge/ui/clickgui/comp/c/c$2
/*     */     //   51: dup
/*     */     //   52: invokespecial <init> : ()V
/*     */     //   55: checkcast java/util/Comparator
/*     */     //   58: invokestatic sortedWith : ([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   61: dup
/*     */     //   62: ifnonnull -> 67
/*     */     //   65: pop
/*     */     //   66: return
/*     */     //   67: astore_1
/*     */     //   68: aload_1
/*     */     //   69: checkcast java/lang/Iterable
/*     */     //   72: astore_2
/*     */     //   73: iconst_0
/*     */     //   74: istore_3
/*     */     //   75: aload_2
/*     */     //   76: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   81: astore #4
/*     */     //   83: aload #4
/*     */     //   85: invokeinterface hasNext : ()Z
/*     */     //   90: ifeq -> 176
/*     */     //   93: aload #4
/*     */     //   95: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   100: astore #5
/*     */     //   102: aload #5
/*     */     //   104: checkcast java/io/File
/*     */     //   107: astore #6
/*     */     //   109: iconst_0
/*     */     //   110: istore #7
/*     */     //   112: aload_0
/*     */     //   113: getfield h : Ljava/util/List;
/*     */     //   116: new eu/shoroa/bridge/ui/clickgui/comp/a
/*     */     //   119: dup
/*     */     //   120: aload #6
/*     */     //   122: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   125: aload #6
/*     */     //   127: fconst_0
/*     */     //   128: fconst_0
/*     */     //   129: aload_0
/*     */     //   130: getfield d : F
/*     */     //   133: aload_0
/*     */     //   134: getfield e : F
/*     */     //   137: aload_0
/*     */     //   138: getfield f : F
/*     */     //   141: aload_0
/*     */     //   142: getfield g : F
/*     */     //   145: new eu/shoroa/bridge/ui/clickgui/comp/c/c$3
/*     */     //   148: dup
/*     */     //   149: aload_0
/*     */     //   150: invokespecial <init> : (Leu/shoroa/bridge/ui/clickgui/comp/c/c;)V
/*     */     //   153: checkcast kotlin/jvm/functions/Function1
/*     */     //   156: getstatic eu/shoroa/bridge/ui/clickgui/comp/c/c$4.a : Leu/shoroa/bridge/ui/clickgui/comp/c/c$4;
/*     */     //   159: checkcast kotlin/jvm/functions/Function1
/*     */     //   162: invokespecial <init> : (Ljava/io/File;FFFFFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
/*     */     //   165: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   170: pop
/*     */     //   171: nop
/*     */     //   172: nop
/*     */     //   173: goto -> 83
/*     */     //   176: nop
/*     */     //   177: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #44	-> 0
/*     */     //   #45	-> 9
/*     */     //   #47	-> 30
/*     */     //   #129	-> 46
/*     */     //   #47	-> 61
/*     */     //   #48	-> 68
/*     */     //   #130	-> 75
/*     */     //   #49	-> 112
/*     */     //   #50	-> 116
/*     */     //   #51	-> 120
/*     */     //   #52	-> 127
/*     */     //   #53	-> 129
/*     */     //   #54	-> 137
/*     */     //   #55	-> 141
/*     */     //   #49	-> 145
/*     */     //   #50	-> 162
/*     */     //   #49	-> 165
/*     */     //   #65	-> 171
/*     */     //   #130	-> 172
/*     */     //   #131	-> 176
/*     */     //   #66	-> 177
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	178	0	this	Leu/shoroa/bridge/ui/clickgui/comp/c/c;
/*     */     //   43	18	4	$this$sortedByDescending$iv	[Ljava/lang/Object;
/*     */     //   46	15	5	$i$f$sortedByDescending	I
/*     */     //   68	110	1	files	Ljava/util/List;
/*     */     //   73	104	2	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   75	102	3	$i$f$forEach	I
/*     */     //   102	71	5	element$iv	Ljava/lang/Object;
/*     */     //   109	63	6	file	Ljava/io/File;
/*     */     //   112	60	7	$i$a$-forEach-PageScreenshots$reload$1	I
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
/*     */   public void render(float mx, float my, float delta)
/*     */   {
/*  68 */     int perRow = 3;
/*  69 */     int rows = (int)(float)Math.ceil((this.h.size() / perRow));
/*  70 */     float contentHeight = rows * (this.e + this.b) - this.b;
/*     */     
/*  72 */     float listY = getY() + 60.0F;
/*  73 */     float listH = getH() - 100.0F;
/*     */ 
/*     */     
/*  76 */     e().a(this.e + this.b);
/*  77 */     e().c(contentHeight);
/*  78 */     e().d(listH);
/*  79 */     e().e(250.0F);
/*  80 */     e().a(hovered(getX(), listY, getW(), listH));
/*  81 */     e().b(true);
/*     */     
/*  83 */     float scrollVal = e().c();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     d.a.a(getX(), listY, getW(), listH, new Function0<Unit>(this, perRow, listY, scrollVal, listH, mx, my, delta) {
/*  89 */           public final void a() { List list = c.a(this.a); int i = this.$b; c c1 = this.a; float f1 = this.$c, f2 = this.$d, f3 = this.$e, f4 = this.$f, f5 = this.$g, f6 = this.$h; int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 129 */             int index$iv = 0;
/* 130 */             Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  a a = (a)item$iv; int idx = j, $i$a$-forEachIndexed-PageScreenshots$render$1$1 = 0; int row = idx / i; int col = idx % i; float posX = c1.getX() + 10.0F + col * (c.b(c1) + c.c(c1)); float posY = f1 + 10.0F + row * (c.d(c1) + c.c(c1)) - f2; }
/*     */              } }); } public void click(float mx, float my, int button) { Iterable<a> $this$forEach$iv = this.h; int $i$f$forEach = 0;
/* 132 */     Iterator<a> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-PageScreenshots$click$1 = 0; it.click(mx, my, button); }
/*     */      if (!this.i.isEmpty())
/* 134 */     { Iterable<File> iterable = this.i; $i$f$forEach = 0; iterator = (Iterator)iterable.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); File f = (File)element$iv; int $i$a$-forEach-PageScreenshots$click$2 = 0;
/*     */       this.h.removeIf(new Function1<a, Boolean>(f) {
/*     */             @NotNull
/*     */             public final Boolean a(a it) {
/*     */               Intrinsics.checkNotNullParameter(it, "");
/*     */               return Boolean.valueOf(Intrinsics.areEqual(it.a(), this.$a));
/*     */             }
/*     */           }::a);
/*     */       f.delete(); }
/*     */     
/*     */     this.i.clear(); }
/*     */ 
/*     */   
/*     */   private static final boolean a(Function1 $tmp0, Object p0) {
/*     */     Intrinsics.checkNotNullParameter($tmp0, "");
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */   
/*     */   public final void d(String query) {
/*     */     Intrinsics.checkNotNullParameter(query, "");
/*     */   }
/*     */   
/*     */   public void c(String query) {
/*     */     Intrinsics.checkNotNullParameter(query, "");
/*     */     d(query);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */