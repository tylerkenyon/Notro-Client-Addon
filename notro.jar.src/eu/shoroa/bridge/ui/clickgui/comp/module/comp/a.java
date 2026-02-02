/*     */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp;
/*     */ 
/*     */ import eu.shoroa.bridge.b.a.b;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import java.util.Iterator;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nElementModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementModule.kt\neu/shoroa/bridge/ui/clickgui/comp/module/comp/ElementModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1855#2,2:135\n1855#2,2:137\n1855#2,2:139\n1855#2,2:141\n*S KotlinDebug\n*F\n+ 1 ElementModule.kt\neu/shoroa/bridge/ui/clickgui/comp/module/comp/ElementModule\n*L\n26#1:135,2\n96#1:137,2\n116#1:139,2\n125#1:141,2\n*E\n"})
/*     */ public final class a extends d {
/*     */   @NotNull
/*     */   private final b a;
/*     */   @NotNull
/*     */   private final eu.shoroa.bridge.ui.clickgui.comp.module.a b;
/*     */   private final boolean c;
/*     */   private final eu.shoroa.bridge.b.a.a d;
/*     */   @NotNull
/*     */   private final ArrayList<b<?>> e;
/*     */   private final eu.shoroa.bridge.b.a.a f;
/*     */   
/*  21 */   public a(b module, eu.shoroa.bridge.ui.clickgui.comp.module.a page, float x, float y, float w, float h, boolean isGrid) { super(x, y, w, h); this.a = module; this.b = page; this.c = isGrid;
/*  22 */     this.d = eu.shoroa.bridge.b.a.a.a(a::i, a::j);
/*  23 */     this.e = new ArrayList<>();
/*  24 */     this.f = eu.shoroa.bridge.b.a.a.a(a::k, a::l);
/*     */     
/*  26 */     Iterable $this$forEach$iv = this.a.g(); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b it = (b)element$iv; int $i$a$-forEach-ElementModule$1 = 0; Object object1 = it.b(); }  }
/*     */   @NotNull public final b a() { return this.a; }
/* 137 */   @NotNull public final eu.shoroa.bridge.ui.clickgui.comp.module.a b() { return this.b; } public final boolean c() { return this.c; } @NotNull public Object clone() { return super.clone(); } public final eu.shoroa.bridge.b.a.a d() { return this.d; } private static final Float i() { return Float.valueOf(180.0F); } public final void a(float mx, float my, int button) { Iterable<b<?>> $this$forEach$iv = this.e; int $i$f$forEach = 0; Iterator<b<?>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<?> element$iv = (Object<?>)iterator.next(); b<T> it = (b)element$iv; int $i$a$-forEach-ElementModule$clickSettings$1 = 0; if (it.getSetting().f()) it.click(mx, my, button);  }  }
/*     */   private static final b j() { return b.LINEAR; }
/* 139 */   @NotNull public final ArrayList<b<?>> e() { return this.e; } public final eu.shoroa.bridge.b.a.a f() { return this.f; } private static final Float k() { return Float.valueOf(180.0F); } private static final b l() { return b.SINE_IN_OUT; } public void render(float mx, float my, float delta) { this.d.a(this.a.b()); this.f.a(h()); d.a(d.a, this, 20.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 8, null); d.a.a(this.a.p(), getX() - 15, getY() - 20, 100.0F, 100.0F, 1.0F, 1.0F, eu.shoroa.bridge.d.e.a.a.k().e()); if (this.e.size() > 0) { d.a(d.a, getX() + getW() - getH() / 2.0F - 14, getY() + getH() / 2.0F - 14, 28.0F, 28.0F, 8.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()), 0.0F, 64, null); d.b(d.a, "", getX() + getW() - getH() / 2.0F, getY() + getH() / 2.0F, "solid", 20.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, this.f.a() / 2, 0.0F, 256, null); }  if (this.c) { d.b(d.a, this.a.j(), getX() + getH() + 8, getY() + getH() / 2.0F - 8, "semibold", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null); float toggleWidth = (this.e.size() > 0) ? 80.0F : 80.0F; float toggleX = (this.e.size() > 0) ? (getX() + getW() - getH() / 2.0F - 14 - 8 - toggleWidth) : (getX() + getW() - getH() / 2.0F - 14 - 8 - toggleWidth); Intrinsics.checkNotNullExpressionValue(this.d.a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f(), 0.5F), ""); d.a(d.a, toggleX, getY() + getH() / 2.0F - 14, toggleWidth, 28.0F, 8.0F, d.a.a(this.d.a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f(), 0.5F)), 0.0F, 64, null); Intrinsics.checkNotNullExpressionValue(this.d.a(eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.d.e.a.a.k().e(), 0.5F), ""); d.a(d.a, toggleX, getY() + getH() / 2.0F - 14, toggleWidth, 28.0F, 8.0F, d.a.a(this.d.a(eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.d.e.a.a.k().e(), 0.5F)).a(0.5F), 0.0F, 64, null); d.b(d.a, this.a.b() ? "Enabled" : "Disabled", toggleX + toggleWidth / 2.0F, getY() + getH() / 2.0F + true, "semibold", 14.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null); d.b(d.a, this.a.k(), getX() + getH() + 8, getY() + getH() / 2.0F + 9, "regular", 14.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null); } else { d.b(d.a, this.a.j(), getX() + getH(), getY() + getH() / 2.0F + 2, "semibold", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null); Intrinsics.checkNotNullExpressionValue(this.d.a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f()), ""); d.a(d.a, this, 20.0F, d.a.a(this.d.a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f())).a(1.5F), 0.0F, 8, null); }  } public void click(float mx, float my, int button) { if (this.c) { if (g() && button == 0) this.a.a();  if (h() && button == 0 && (!this.e.isEmpty())) { this.b.a(this); this.b.e().d(); }  } else { boolean settingsArea = (this.e.size() > 0) ? hovered(getX() + getW() - getH() / 2.0F - 14, getY() + getH() / 2.0F - 14, 28.0F, 28.0F) : false; if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && !settingsArea && button == 0) this.a.a();  if (settingsArea && button == 0 && (!this.e.isEmpty())) { this.b.a(this); this.b.e().d(); }  }  } public void release(float mx, float my, int button) { Iterable<b<?>> $this$forEach$iv = this.e; int $i$f$forEach = 0; Iterator<b<?>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<?> element$iv = (Object<?>)iterator.next(); b<T> it = (b)element$iv; int $i$a$-forEach-ElementModule$release$1 = 0; if (it.getSetting().f())
/*     */         it.release(mx, my, button);  }
/* 141 */      } public void onKey(int code, char char) { super.onKey(code, char); Iterable<b<?>> $this$forEach$iv = this.e; int $i$f$forEach = 0; Iterator<b<?>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<?> element$iv = (Object<?>)iterator.next(); b<T> it = (b)element$iv; int $i$a$-forEach-ElementModule$onKey$1 = 0;
/*     */       if (it.getSetting().f())
/*     */         it.onKey(code, char);  }
/*     */      }
/*     */ 
/*     */   
/*     */   private final boolean g() {
/*     */     return hovered(getX() + getW() - getH() / 2.0F - 14 - 8 - 80, getY() + getH() / 2.0F - 14, 80.0F, 28.0F);
/*     */   }
/*     */   
/*     */   private final boolean h() {
/*     */     return hovered(getX() + getW() - getH() / 2.0F - 14, getY() + getH() / 2.0F - 14, 28.0F, 28.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */