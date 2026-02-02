/*     */ package eu.shoroa.bridge.ui.c.a;
/*     */ 
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.d.e.e;
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import java.awt.Color;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nMenuMultiButtonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuMultiButtonElement.kt\neu/shoroa/bridge/ui/mainmenu/elements/MenuMultiButtonElement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1855#2,2:97\n1855#2,2:99\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 MenuMultiButtonElement.kt\neu/shoroa/bridge/ui/mainmenu/elements/MenuMultiButtonElement\n*L\n34#1:97,2\n45#1:99,2\n49#1:101,2\n*E\n"})
/*     */ public final class c extends d {
/*  11 */   public c(float x, float y, float size) { super(x, y, -1.0F, size);
/*  12 */     Intrinsics.checkNotNull(getBridge().e()); this.a = getBridge().e(); }
/*     */   @NotNull private final eu.shoroa.bridge.feature.a.a.a a; @NotNull
/*  14 */   public Object clone() { return super.clone(); } public void render(float mx, float my, float delta) { float nativeImgW = 1920.0F;
/*  15 */     float nativeImgH = 1165.0F;
/*     */     
/*  17 */     float rationH = this.a.height() / nativeImgH;
/*  18 */     float rationW = this.a.width() / nativeImgW;
/*     */     
/*  20 */     float ratio = (rationH < rationW) ? rationW : rationH;
/*     */     
/*  22 */     float imgW = nativeImgW * ratio;
/*  23 */     float imgH = nativeImgH * ratio;
/*     */     
/*  25 */     float imgX = (this.a.width() - imgW) / 2;
/*  26 */     float imgY = (this.a.height() - imgH) / 2;
/*     */     
/*  28 */     d.a.a(getX(), getY(), getW(), getH(), 30.0F, "bg1-blur-a", imgX, imgY, imgW, imgH);
/*  29 */     d.a(d.a, this, 15.0F, d.a.a(new Color(0.0F, 0.0F, 0.0F, 0.2F)), 0.0F, 8, null);
/*  30 */     d.a(d.a, this, 15.0F, d.a.a(new Color(1.0F, 1.0F, 1.0F, 0.5F)).a(1.0F), 0.0F, 8, null);
/*     */     
/*  32 */     float gap = 2.0F;
/*  33 */     float i = 0.0F;
/*  34 */     Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-MenuMultiButtonElement$render$1 = 0; it.setX(getX() + gap + i); it.setY(getY() + gap); it.setW(getH() - gap * 2); it.setH(getH() - gap * 2); it.render(mx, my, delta); i += it.getW() + gap; }
/*     */      } public void click(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/*  99 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-MenuMultiButtonElement$click$1 = 0; it.click(mx, my, button); }
/*     */      } public void release(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/* 101 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-MenuMultiButtonElement$release$1 = 0;
/*     */       it.release(mx, my, button); }
/*     */      }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final c a(String icon, e iconType, Function0<Unit> onClick) {
/*     */     Intrinsics.checkNotNullParameter(icon, "");
/*     */     Intrinsics.checkNotNullParameter(iconType, "");
/*     */     Intrinsics.checkNotNullParameter(onClick, "");
/*     */     getElements().add(new a(icon, iconType, onClick, getX(), getY(), getW(), getH()));
/*     */     setW(getW() + getH() - 1.0F);
/*     */     return this;
/*     */   }
/*     */   
/*     */   private static final class a extends d {
/*     */     @NotNull
/*     */     private final String a;
/*     */     @NotNull
/*     */     private final e b;
/*     */     @NotNull
/*     */     private final Function0<Unit> c;
/*     */     private boolean d;
/*     */     private final eu.shoroa.bridge.b.a.a e;
/*     */     private final eu.shoroa.bridge.b.a.a f;
/*     */     
/*     */     @NotNull
/*     */     public Object clone() {
/*     */       return super.clone();
/*     */     }
/*     */     
/*     */     public a(String icon, e iconType, Function0<Unit> onClick, float x, float y, float w, float h) {
/*     */       super(x, y, w, h);
/*     */       this.a = icon;
/*     */       this.b = iconType;
/*     */       this.c = onClick;
/*     */       this.e = eu.shoroa.bridge.b.a.a.a(a::a, a::b);
/*     */       this.f = eu.shoroa.bridge.b.a.a.a(a::c, a::d);
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
/*     */     private static final Float c() {
/*     */       return Float.valueOf(100.0F);
/*     */     }
/*     */     
/*     */     private static final b d() {
/*     */       return b.LINEAR;
/*     */     }
/*     */     
/*     */     public void render(float mx, float my, float delta) {
/*     */       this.e.a(d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/*     */       this.f.a(this.d);
/*     */       Intrinsics.checkNotNullExpressionValue(this.f.a(this.e.a(new Color(0.0F, 0.0F, 0.0F, 0.0F), new Color(1.0F, 1.0F, 1.0F, 0.05F)), new Color(1.0F, 1.0F, 1.0F, 0.2F)), "");
/*     */       d.a(d.a, this, 13.0F, d.a.a(this.f.a(this.e.a(new Color(0.0F, 0.0F, 0.0F, 0.0F), new Color(1.0F, 1.0F, 1.0F, 0.05F)), new Color(1.0F, 1.0F, 1.0F, 0.2F))), 0.0F, 8, null);
/*     */       Intrinsics.checkNotNullExpressionValue(Color.WHITE, "");
/*     */       d.b(d.a, this.a, getX() + getW() / 2.0F, getY() + getH() / 2.0F, this.b.a(), 28.0F, Color.WHITE, d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     }
/*     */     
/*     */     public void click(float mx, float my, int button) {
/*     */       if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0)
/*     */         this.d = true; 
/*     */     }
/*     */     
/*     */     public void release(float mx, float my, int button) {
/*     */       if (this.d && d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0)
/*     */         this.c.invoke(); 
/*     */       this.d = false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\c\a\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */