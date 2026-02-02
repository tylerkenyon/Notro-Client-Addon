/*     */ package eu.shoroa.bridge.ui.clickgui.comp.d;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nPageProfiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageProfiles.kt\neu/shoroa/bridge/ui/clickgui/comp/settings/PageProfiles\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1864#2,3:95\n1855#2,2:98\n1855#2,2:100\n1855#2,2:102\n*S KotlinDebug\n*F\n+ 1 PageProfiles.kt\neu/shoroa/bridge/ui/clickgui/comp/settings/PageProfiles\n*L\n38#1:95,3\n52#1:98,2\n85#1:100,2\n90#1:102,2\n*E\n"})
/*     */ public final class a extends b {
/*     */   @NotNull
/*     */   private final b a;
/*     */   @NotNull
/*     */   private final List<b> b;
/*     */   
/*     */   @NotNull
/*  13 */   public Object clone() { return super.clone(); } public a(float x, float y, float w, float h) {
/*  14 */     super("modules", "Profiles", "Profiles", x, y, w, h);
/*     */     
/*  16 */     this.a = new b();
/*     */     
/*  18 */     b[] arrayOfB = new b[6]; arrayOfB[0] = new b("Default", "Main configuration", "icon_small"); arrayOfB[1] = 
/*  19 */       new b("PvP Setup", "Optimized for combat", "icon_small");
/*  20 */     arrayOfB[2] = new b("Builder", "For creative building", "icon_small");
/*  21 */     arrayOfB[3] = new b("Speedrun", "Lightweight and fast", "icon_small");
/*  22 */     arrayOfB[4] = new b("Creative", "Sandbox mode setup", "icon_small");
/*  23 */     arrayOfB[5] = new b("Test", "Debug config", "icon_small");
/*     */     
/*     */     this.b = CollectionsKt.listOf((Object[])arrayOfB);
/*     */     
/*  27 */     f();
/*     */   }
/*     */   public void render(float mx, float my, float delta) {
/*     */     // Byte code:
/*     */     //   0: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
/*     */     //   3: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
/*     */     //   6: dup
/*     */     //   7: ifnull -> 37
/*     */     //   10: getfield clickgui : Leu/shoroa/bridge/ui/clickgui/b;
/*     */     //   13: dup
/*     */     //   14: ifnull -> 37
/*     */     //   17: invokevirtual a : ()Leu/shoroa/bridge/ui/clickgui/a;
/*     */     //   20: dup
/*     */     //   21: ifnull -> 37
/*     */     //   24: invokevirtual a : ()Leu/shoroa/bridge/ui/clickgui/comp/d;
/*     */     //   27: dup
/*     */     //   28: ifnull -> 37
/*     */     //   31: invokevirtual b : ()Leu/shoroa/bridge/ui/clickgui/comp/b;
/*     */     //   34: goto -> 39
/*     */     //   37: pop
/*     */     //   38: aconst_null
/*     */     //   39: aload_0
/*     */     //   40: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   43: ifeq -> 197
/*     */     //   46: fconst_0
/*     */     //   47: fstore #4
/*     */     //   49: aload_0
/*     */     //   50: invokevirtual getElements : ()Ljava/util/List;
/*     */     //   53: checkcast java/lang/Iterable
/*     */     //   56: astore #5
/*     */     //   58: iconst_0
/*     */     //   59: istore #6
/*     */     //   61: aload #5
/*     */     //   63: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   68: astore #7
/*     */     //   70: aload #7
/*     */     //   72: invokeinterface hasNext : ()Z
/*     */     //   77: ifeq -> 126
/*     */     //   80: aload #7
/*     */     //   82: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   87: astore #8
/*     */     //   89: aload #8
/*     */     //   91: checkcast eu/shoroa/bridge/ui/b/d
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: fload #4
/*     */     //   101: aload #9
/*     */     //   103: invokevirtual getY : ()F
/*     */     //   106: aload #9
/*     */     //   108: invokevirtual getH : ()F
/*     */     //   111: fadd
/*     */     //   112: aload_0
/*     */     //   113: invokevirtual getY : ()F
/*     */     //   116: fsub
/*     */     //   117: invokestatic max : (FF)F
/*     */     //   120: fstore #4
/*     */     //   122: nop
/*     */     //   123: goto -> 70
/*     */     //   126: nop
/*     */     //   127: aload_0
/*     */     //   128: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   131: aload_0
/*     */     //   132: invokevirtual getH : ()F
/*     */     //   135: ldc 70.0
/*     */     //   137: fsub
/*     */     //   138: invokevirtual d : (F)V
/*     */     //   141: aload_0
/*     */     //   142: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   145: fload #4
/*     */     //   147: invokevirtual c : (F)V
/*     */     //   150: aload_0
/*     */     //   151: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   154: aload_0
/*     */     //   155: checkcast eu/shoroa/bridge/ui/b/d
/*     */     //   158: fconst_0
/*     */     //   159: fconst_0
/*     */     //   160: fconst_0
/*     */     //   161: fconst_0
/*     */     //   162: bipush #15
/*     */     //   164: aconst_null
/*     */     //   165: invokestatic hovered$default : (Leu/shoroa/bridge/ui/b/d;FFFFILjava/lang/Object;)Z
/*     */     //   168: invokevirtual a : (Z)V
/*     */     //   171: aload_0
/*     */     //   172: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   175: iconst_1
/*     */     //   176: invokevirtual b : (Z)V
/*     */     //   179: aload_0
/*     */     //   180: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   183: ldc 50.0
/*     */     //   185: invokevirtual a : (F)V
/*     */     //   188: aload_0
/*     */     //   189: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   192: ldc 300.0
/*     */     //   194: invokevirtual e : (F)V
/*     */     //   197: aload_0
/*     */     //   198: invokevirtual e : ()Leu/shoroa/bridge/d/e/f;
/*     */     //   201: invokevirtual c : ()F
/*     */     //   204: fstore #4
/*     */     //   206: getstatic eu/shoroa/bridge/b/d.a : Leu/shoroa/bridge/b/d;
/*     */     //   209: aload_0
/*     */     //   210: invokevirtual getX : ()F
/*     */     //   213: aload_0
/*     */     //   214: invokevirtual getY : ()F
/*     */     //   217: ldc 60.0
/*     */     //   219: fadd
/*     */     //   220: aload_0
/*     */     //   221: invokevirtual getW : ()F
/*     */     //   224: aload_0
/*     */     //   225: invokevirtual getH : ()F
/*     */     //   228: ldc 60.0
/*     */     //   230: fsub
/*     */     //   231: new eu/shoroa/bridge/ui/clickgui/comp/d/a$1
/*     */     //   234: dup
/*     */     //   235: aload_0
/*     */     //   236: fload #4
/*     */     //   238: fload_1
/*     */     //   239: fload_2
/*     */     //   240: fload_3
/*     */     //   241: invokespecial <init> : (Leu/shoroa/bridge/ui/clickgui/comp/d/a;FFFF)V
/*     */     //   244: checkcast kotlin/jvm/functions/Function0
/*     */     //   247: invokevirtual a : (FFFFLkotlin/jvm/functions/Function0;)V
/*     */     //   250: aload_0
/*     */     //   251: getfield a : Leu/shoroa/bridge/ui/clickgui/comp/d/a/b;
/*     */     //   254: fload_1
/*     */     //   255: fload_2
/*     */     //   256: fload_3
/*     */     //   257: invokevirtual a : (FFF)V
/*     */     //   260: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 0
/*     */     //   #51	-> 46
/*     */     //   #52	-> 49
/*     */     //   #98	-> 61
/*     */     //   #52	-> 99
/*     */     //   #98	-> 122
/*     */     //   #99	-> 126
/*     */     //   #53	-> 127
/*     */     //   #54	-> 141
/*     */     //   #55	-> 150
/*     */     //   #56	-> 171
/*     */     //   #57	-> 179
/*     */     //   #58	-> 188
/*     */     //   #71	-> 197
/*     */     //   #72	-> 206
/*     */     //   #80	-> 250
/*     */     //   #81	-> 260
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	261	0	this	Leu/shoroa/bridge/ui/clickgui/comp/d/a;
/*     */     //   0	261	1	mx	F
/*     */     //   0	261	2	my	F
/*     */     //   0	261	3	delta	F
/*     */     //   49	148	4	maxHeight	F
/*     */     //   58	69	5	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   61	66	6	$i$f$forEach	I
/*     */     //   89	34	8	element$iv	Ljava/lang/Object;
/*     */     //   96	26	9	it	Leu/shoroa/bridge/ui/b/d;
/*     */     //   99	23	10	$i$a$-forEach-PageProfiles$render$1	I
/*     */     //   206	55	4	scrl	F
/*  31 */   } private final void f() { getElements().clear();
/*     */     
/*  33 */     int columns = 3;
/*  34 */     float spacing = 10.0F;
/*  35 */     float cardWidth = (getW() - spacing * (columns + 1)) / columns;
/*  36 */     float cardHeight = 90.0F;
/*     */     
/*  38 */     Iterable<b> $this$forEachIndexed$iv = this.b; int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     int index$iv = 0;
/*  96 */     Iterator<b> iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  b b1 = (b)item$iv; int index = i, $i$a$-forEachIndexed-PageProfiles$updateLayout$1 = 0; int col = index % columns; int row = index / columns; float px = getX() + spacing + (cardWidth + spacing) * col; float py = getY() + 70.0F + (cardHeight + spacing) * row; getElements().add(new a(b1, px, py, cardWidth, cardHeight, this.a)); }
/*     */      } public void click(float mx, float my, int button) { Iterator iterator; if (!this.a.a(mx, my, button))
/*     */     { Iterable $this$forEach$iv = getElements();
/*     */       int $i$f$forEach = 0;
/* 100 */       iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-PageProfiles$click$1 = 0; it.click(mx, my, button); }
/*     */      } public void release(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/* 102 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-PageProfiles$release$1 = 0;
/*     */       it.release(mx, my, button); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\d\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */