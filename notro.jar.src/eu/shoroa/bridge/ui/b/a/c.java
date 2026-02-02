/*     */ package eu.shoroa.bridge.ui.b.a;
/*     */ 
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nWShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WShape.kt\neu/shoroa/bridge/ui/internal/widget/WShape\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n13374#2,3:126\n13374#2,3:131\n1855#3,2:129\n1855#3,2:134\n*S KotlinDebug\n*F\n+ 1 WShape.kt\neu/shoroa/bridge/ui/internal/widget/WShape\n*L\n75#1:126,3\n93#1:131,3\n81#1:129,2\n119#1:134,2\n*E\n"})
/*     */ public final class c extends d {
/*     */   @NotNull
/*     */   private final a<i> b;
/*     */   private Color c;
/*     */   @NotNull
/*     */   private a d;
/*     */   @NotNull
/*     */   private final g e;
/*     */   
/*  16 */   public c(a<i> holder) { super(560.0F, 320.0F, "Shape Editor"); this.b = holder;
/*  17 */     this.c = Color.WHITE;
/*  18 */     this.d = a.PENCIL;
/*  19 */     this.e = new g(0.0F);
/*     */     
/*  21 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); getElements().add(new eu.shoroa.bridge.ui.b.c(Color.WHITE, getX() + 20, getY() + 60, 240.0F, 180.0F));
/*  22 */     getElements().add(h.a.a("hex", getX() + 20, getY() + 'Ą', 240.0F, 40.0F).a(9).d().a(new Function1<h, Unit>(this) {
/*  23 */             public final void a(h it) { Intrinsics.checkNotNullParameter(it, ""); String t = it.b();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  32 */               int r = a(t, 1, 3);
/*  33 */               int g = a(t, 3, 5);
/*  34 */               int b = a(t, 5, 7);
/*  35 */               int a = (t.length() > 7) ? a(t, 7, 9) : 255;
/*  36 */               Intrinsics.checkNotNull(this.a.getElements().get(0)); ((eu.shoroa.bridge.ui.b.c)this.a.getElements().get(0)).b(new Color(r, g, b, a)); } private static final int a(String colorString, int start, int end) { boolean bool; try { Intrinsics.checkNotNullExpressionValue(colorString.substring(start, end), ""); bool = Integer.parseInt(colorString.substring(start, end), CharsKt.checkRadix(16)); } catch (Exception e) { bool = false; }
/*     */                return bool; }
/*  38 */           })); Intrinsics.checkNotNull(getElements().get(1)); String str = "#%02x%02x%02x%02x"; Object[] arrayOfObject = new Object[4]; arrayOfObject[0] = Integer.valueOf(this.c.getRed()); arrayOfObject[1] = Integer.valueOf(this.c.getGreen()); arrayOfObject[2] = Integer.valueOf(this.c.getBlue()); arrayOfObject[3] = Integer.valueOf(this.c.getAlpha()); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), ""); ((h)getElements().get(1)).a(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length))); }
/*     */   @NotNull public Object clone() { return super.clone(); }
/*     */   @NotNull
/*  41 */   public final a a() { return this.d; } public void render(float mx, float my, float delta) { super.render(mx, my, delta);
/*  42 */     this.e.a(this.d.ordinal(), 15.0F);
/*     */     
/*  44 */     Intrinsics.checkNotNull(getElements().get(0)); if (!Intrinsics.areEqual(this.c, ((eu.shoroa.bridge.ui.b.c)getElements().get(0)).b())) {
/*  45 */       Intrinsics.checkNotNull(getElements().get(0)); this.c = ((eu.shoroa.bridge.ui.b.c)getElements().get(0)).b();
/*  46 */       Intrinsics.checkNotNull(getElements().get(1)); String str = "#%02x%02x%02x%02x"; Object[] arrayOfObject = new Object[4]; arrayOfObject[0] = Integer.valueOf(this.c.getRed()); arrayOfObject[1] = Integer.valueOf(this.c.getGreen()); arrayOfObject[2] = Integer.valueOf(this.c.getBlue()); arrayOfObject[3] = Integer.valueOf(this.c.getAlpha()); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), ""); ((h)getElements().get(1)).a(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)));
/*     */     } 
/*     */     
/*  49 */     int shapeW = ((i)this.b.b()).a();
/*  50 */     int shapeH = ((i)this.b.b()).b();
/*     */     
/*  52 */     float pixelSize = 16.0F;
/*  53 */     float drawW = pixelSize * shapeW;
/*  54 */     float drawH = pixelSize * shapeH;
/*  55 */     d.a(d.a, getX() + getW() - drawW - 20, getY() + 60.0F, drawW, drawH, 0.0F, d.a.a(), 0.0F, 64, null); int i;
/*  56 */     for (i = 0; i < shapeW; i++) {
/*  57 */       for (int k = 0; k < shapeH; k++) {
/*  58 */         d.a(d.a, getX() + getW() - drawW - 20 + pixelSize * i, getY() + 60.0F + pixelSize * k, pixelSize, pixelSize, 0.0F, d.a.a((Color)((i)this.b.b()).d().invoke(Integer.valueOf(i), Integer.valueOf(k))), 0.0F, 64, null);
/*     */       }
/*     */     } 
/*  61 */     if (shapeW % 2 == 1) {
/*  62 */       Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.a(d.a, getX() + getW() - 20 - drawW / 2.0F, getY() + 60.0F, 1.0F, drawH, 0.0F, d.a.a(Color.WHITE), 0.0F, 64, null);
/*     */     } 
/*  64 */     if (shapeH % 2 == 1) {
/*  65 */       Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.a(d.a, getX() + getW() - drawW - 20, getY() + 60.0F + drawH / 2.0F, drawW, 1.0F, 0.0F, d.a.a(Color.WHITE), 0.0F, 64, null);
/*     */     } 
/*  67 */     for (i = 1; i < shapeW; i++) {
/*  68 */       Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); d.a(d.a, getX() + getW() - drawW - 20 + pixelSize * i, getY() + 60.0F, 1.0F, drawH, 0.0F, d.a.a(Color.BLACK), 0.0F, 64, null);
/*     */     } 
/*  70 */     for (i = 1; i < shapeH; i++) {
/*  71 */       Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); d.a(d.a, getX() + getW() - drawW - 20, getY() + 60.0F + pixelSize * i, drawW, 1.0F, 0.0F, d.a.a(Color.BLACK), 0.0F, 64, null);
/*     */     } 
/*     */     
/*  74 */     Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); d.a(d.a, getX() + getW() - drawW - 20, getY() + 60.0F, drawW, drawH, 0.0F, d.a.a(Color.BLACK).a(1.0F), 0.0F, 64, null);
/*  75 */     a[] arrayOfA = a.values(); int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     int index$iv = 0;
/* 127 */     byte b = 0; int j = arrayOfA.length; if (b < j) { Object item$iv = arrayOfA[b], object1 = item$iv; int index = index$iv++, $i$a$-forEachIndexed-WShape$render$1 = 0; d.a(d.a, getX() + getW() / 2.0F - 14, getY() + 60.0F + (38 * index), 28.0F, 28.0F, 6.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 64, null); d.b(d.a, object1.a(), getX() + getW() / 2.0F, getY() + 75.0F + (38 * index), "solid", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null); }
/*     */      d.a(d.a, getX() + getW() / 2.0F - 14, getY() + 60.0F + this.e.a() * 38, 28.0F, 28.0F, 6.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().f()).a(2.0F), 0.0F, 64, null); Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/* 129 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-WShape$render$2 = 0; it.render(mx, my, delta); }  }
/*     */   public final void a(a <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.d = <set-?>; }
/* 131 */   @NotNull public final g b() { return this.e; } public void click(float mx, float my, int button) { super.click(mx, my, button); int shapeW = ((i)this.b.b()).a(); int shapeH = ((i)this.b.b()).b(); float pixelSize = 16.0F; float drawW = pixelSize * shapeW; float drawH = pixelSize * shapeH; a[] arrayOfA = a.values(); int $i$f$forEachIndexed = 0; int index$iv = 0;
/* 132 */     byte b = 0; int i = arrayOfA.length; if (b < i) { Object item$iv = arrayOfA[b], object1 = item$iv; int index = index$iv++, $i$a$-forEachIndexed-WShape$click$1 = 0; if (hovered(getX() + getW() / 2.0F - 14, getY() + 60.0F + (38 * index), 28.0F, 28.0F))
/*     */         this.d = (a)object1;  }  int x = (int)((mx - getX() + getW() - drawW - 20) / pixelSize); int y = (int)((my - getY() - 60.0F) / pixelSize); if (hovered(getX() + getW() - drawW - 20, getY() + 60.0F, drawW, drawH))
/* 134 */       switch (b.a[this.d.ordinal()]) { case 1: Intrinsics.checkNotNull(getElements().get(0)); ((i)this.b.b()).a(Math.min(shapeW - 1, Math.max(0, x)), Math.min(shapeH - 1, Math.max(0, y)), ((eu.shoroa.bridge.ui.b.c)getElements().get(0)).b()); break;case 2: ((i)this.b.b()).a(Math.min(shapeW - 1, Math.max(0, x)), Math.min(shapeH - 1, Math.max(0, y)), new Color(0, 0, 0, 0)); break;case 3: Intrinsics.checkNotNull(getElements().get(0)); ((eu.shoroa.bridge.ui.b.c)getElements().get(0)).b((Color)((i)this.b.b()).d().invoke(Integer.valueOf(Math.min(shapeW - 1, Math.max(0, x))), Integer.valueOf(Math.min(shapeH - 1, Math.max(0, y))))); this.d = a.PENCIL; break; }   Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-WShape$click$2 = 0;
/*     */       it.click(mx, my, button); }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\020\n\002\020\016\n\002\b\t\b\001\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\006\032\0020\002¢\006\004\b\007\020\bR\032\020\003\032\0020\0028\007X\004¢\006\f\n\004\b\003\020\004\032\004\b\003\020\005j\002\b\tj\002\b\nj\002\b\013"}, d2 = {"Leu/shoroa/bridge/ui/b/a/c$a;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PENCIL", "ERASER", "EYEDROPPER"})
/*     */   public enum a {
/*     */     PENCIL(""),
/*     */     ERASER(""),
/*     */     EYEDROPPER("");
/*     */     @NotNull
/*     */     private final String a;
/*     */     
/*     */     a(String icon) {
/*     */       this.a = icon;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     @JvmName(name = "a")
/*     */     public final String a() {
/*     */       return this.a;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<a> b() {
/*     */       return c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\a\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */