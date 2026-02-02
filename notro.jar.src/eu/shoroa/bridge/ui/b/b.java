/*     */ package eu.shoroa.bridge.ui.b;
/*     */ 
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nCluster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cluster.kt\neu/shoroa/bridge/ui/internal/Cluster\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1864#2,3:128\n1855#2,2:131\n1855#2,2:133\n*S KotlinDebug\n*F\n+ 1 Cluster.kt\neu/shoroa/bridge/ui/internal/Cluster\n*L\n31#1:128,3\n42#1:131,2\n46#1:133,2\n*E\n"})
/*     */ public final class b extends d {
/*     */   @NotNull
/*     */   private final ArrayList<a> a;
/*     */   
/*   9 */   public b(float x, float y, float w, float h) { super(x, y, w, h);
/*  10 */     this.a = new ArrayList<>();
/*  11 */     this.b = 1.0F; } private float b; @NotNull public Object clone() { return super.clone(); } public final float a() { return this.b; } public final void a(float <set-?>) { this.b = <set-?>; } public void render(float mx, float my, float delta) { float buttonSize; float spacing; float startX;
/*     */     int index$iv;
/*     */     Iterator<a> iterator;
/*  14 */     if (!this.a.isEmpty())
/*  15 */     { float baseSize = getH() - 12.0F;
/*  16 */       buttonSize = baseSize * this.b;
/*  17 */       spacing = 0.0F;
/*  18 */       float padding = 0.0F;
/*     */ 
/*     */       
/*  21 */       setW(this.a.size() * buttonSize + (this.a.size() - 1) * spacing + padding * 2);
/*     */ 
/*     */       
/*  24 */       d.a(d.a, this, 12.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().b()), 0.0F, 8, null);
/*  25 */       d.a(d.a, this, 12.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()).a(1.5F), 0.0F, 8, null);
/*     */ 
/*     */       
/*  28 */       startX = getX() + padding;
/*  29 */       float centerY = getY() + (getH() - buttonSize) / 2.0F;
/*     */       
/*  31 */       Iterable<a> $this$forEachIndexed$iv = this.a; int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 128 */       index$iv = 0;
/* 129 */       iterator = $this$forEachIndexed$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object item$iv = iterator.next(); int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  a a = (a)item$iv; int i = j, $i$a$-forEachIndexed-Cluster$render$1 = 0; float bx = startX + i * (buttonSize + spacing); }
/*     */      } public void click(float mx, float my, int button) { Iterable<a> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/* 131 */     Iterator<a> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-Cluster$click$1 = 0; it.click(mx, my, button); }
/*     */      } public void release(float mx, float my, int button) { Iterable<a> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/* 133 */     Iterator<a> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-Cluster$release$1 = 0;
/*     */       it.release(mx, my, button); }
/*     */      }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final b a(String icon, boolean togglable, Function0<Unit> onClick) {
/*     */     Intrinsics.checkNotNullParameter(icon, "");
/*     */     Intrinsics.checkNotNullParameter(onClick, "");
/*     */     this.a.add(new a(icon, togglable, onClick));
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final b b(float mult) {
/*     */     this.b = mult;
/*     */     return this;
/*     */   }
/*     */   
/*     */   private static final class a extends d {
/*     */     @NotNull
/*     */     private final String a;
/*     */     private final boolean b;
/*     */     @NotNull
/*     */     private final Function0<Unit> c;
/*     */     private boolean d;
/*     */     private final eu.shoroa.bridge.b.a.a e;
/*     */     private boolean f;
/*     */     private boolean g;
/*     */     
/*     */     @NotNull
/*     */     public Object clone() {
/*     */       return super.clone();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String a() {
/*     */       return this.a;
/*     */     }
/*     */     
/*     */     public final boolean b() {
/*     */       return this.b;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Function0<Unit> c() {
/*     */       return this.c;
/*     */     }
/*     */     
/*     */     public a(String icon, boolean togglable, Function0<Unit> action) {
/*     */       super(0.0F, 0.0F, 0.0F, 0.0F);
/*     */       this.a = icon;
/*     */       this.b = togglable;
/*     */       this.c = action;
/*     */       this.e = eu.shoroa.bridge.b.a.a.a(a::d, a::e);
/*     */     }
/*     */     
/*     */     private static final Float d() {
/*     */       return Float.valueOf(0.0F);
/*     */     }
/*     */     
/*     */     private static final eu.shoroa.bridge.b.a.b e() {
/*     */       return eu.shoroa.bridge.b.a.b.CUBIC_IN_OUT;
/*     */     }
/*     */     
/*     */     public void render(float mx, float my, float delta) {
/*     */       this.e.a(d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/*     */       Color color = this.d ? eu.shoroa.bridge.d.e.a.a.k().f() : eu.shoroa.bridge.d.e.a.a.k().d();
/*     */       float alpha = this.d ? 1.0F : this.e.a();
/*     */       if (alpha > 0.01F) {
/*     */         float corner = (this.f && this.g) ? 12.0F : (this.f ? 12.0F : (this.g ? 12.0F : 0.0F));
/*     */         d.a(d.a, getX(), getY(), getW(), getH(), corner, d.a.a(eu.shoroa.bridge.d.e.a.a.a(color, alpha)), 0.0F, 64, null);
/*     */       } 
/*     */       d.a.a(this.a, getX() + 6.0F, getY() + 6.0F, getW() - 12.0F, getH() - 12.0F, 1.0F, 1.0F, eu.shoroa.bridge.d.e.a.a.k().e());
/*     */     }
/*     */     
/*     */     public void click(float mx, float my, int button) {
/*     */       if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0)
/*     */         if (this.b) {
/*     */           this.d = !this.d;
/*     */         } else {
/*     */           this.c.invoke();
/*     */         }  
/*     */     }
/*     */     
/*     */     public void release(float mx, float my, int button) {}
/*     */     
/*     */     public final void a(float nx, float ny, float nw, float nh, boolean first, boolean last) {
/*     */       setX(nx);
/*     */       setY(ny);
/*     */       setW(nw);
/*     */       setH(nh);
/*     */       this.f = first;
/*     */       this.g = last;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */