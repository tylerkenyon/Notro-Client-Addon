/*     */ package eu.shoroa.bridge.ui.clickgui.comp.module;
/*     */ @SourceDebugExtension({"SMAP\nPageModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageModule.kt\neu/shoroa/bridge/ui/clickgui/comp/module/PageModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n766#2:276\n857#2,2:277\n1855#2,2:279\n766#2:281\n857#2,2:282\n1855#2,2:284\n1855#2,2:286\n766#2:288\n857#2,2:289\n1855#2,2:292\n1855#2,2:294\n1855#2,2:296\n1855#2,2:298\n1#3:291\n*S KotlinDebug\n*F\n+ 1 PageModule.kt\neu/shoroa/bridge/ui/clickgui/comp/module/PageModule\n*L\n84#1:276\n84#1:277,2\n110#1:279,2\n112#1:281\n112#1:282,2\n112#1:284,2\n145#1:286,2\n181#1:288\n181#1:289,2\n208#1:292,2\n241#1:294,2\n253#1:296,2\n265#1:298,2\n*E\n"})
/*     */ public final class a extends b { @NotNull
/*     */   private final ArrayList<a> a;
/*     */   @NotNull
/*     */   private final ArrayList<a> b;
/*     */   @Nullable
/*     */   private a c;
/*     */   @NotNull
/*     */   private final eu.shoroa.bridge.ui.b.a d;
/*     */   @Nullable
/*     */   private eu.shoroa.bridge.ui.b.a e;
/*     */   private final int f;
/*     */   private final float g;
/*     */   private final float h;
/*     */   private boolean i;
/*     */   
/*  18 */   public a(float x, float y, float w, float h) { super("modules", "Modules", "Modules", x, y, w, h);
/*  19 */     this.a = new ArrayList<>();
/*  20 */     this.b = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.d = eu.shoroa.bridge.ui.b.a.a.a("", 0.0F, 0.0F, 35.0F, 35.0F).b(new Function0<Unit>(this, x, y, w) { public final void a() { a.a(this.a, !a.d(this.a)); this.a.g().clear(); this.a.f().clear(); Ref.FloatRef i = new Ref.FloatRef(); if (BridgeClient.a.b() != null && BridgeClient.a.b().moduleManager() != null) { BridgeClient.a.b().moduleManager().a(new Function1<b, Unit>(this.a, this.$b, this.$c, i, this.$d) { public final void a(b module) { Intrinsics.checkNotNullParameter(module, ""); if (a.d(this.a)) { float f = this.$d.element; this.$d.element = f + 1.0F; a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70 + f * 70, this.$e - 20, 60.0F, a.d(this.a)); this.a.f().add(elementModule); this.a.g().add(elementModule); } else { a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70, a.b(this.a), a.c(this.a), a.d(this.a)); this.a.f().add(elementModule); this.a.g().add(elementModule); float f = this.$d.element; this.$d.element = f + 1.0F; }  } }); } else { BridgeClient.a.b().moduleManager(); }  } }).c("");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     this.f = 3;
/*  48 */     this.g = 10.0F;
/*     */     
/*  50 */     this.h = 60.0F;
/*     */ 
/*     */ 
/*     */     
/*  54 */     Ref.FloatRef i = new Ref.FloatRef();
/*  55 */     if (BridgeClient.a.b() != null && BridgeClient.a.b().moduleManager() != null) { BridgeClient.a.b().moduleManager().a(new Function1<b, Unit>(this, x, y, i, w) {
/*  56 */             public final void a(b module) { Intrinsics.checkNotNullParameter(module, ""); if (a.d(this.a)) {
/*  57 */                 float f = this.$d.element; this.$d.element = f + 1.0F; a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70 + f * 70, this.$e - 20, 60.0F, a.d(this.a));
/*  58 */                 this.a.f().add(elementModule);
/*  59 */                 this.a.g().add(elementModule);
/*     */               } else {
/*  61 */                 a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70, a.b(this.a), a.c(this.a), a.d(this.a));
/*  62 */                 this.a.f().add(elementModule);
/*  63 */                 this.a.g().add(elementModule);
/*  64 */                 float f = this.$d.element; this.$d.element = f + 1.0F;
/*     */               }  } }); }
/*     */     else { BridgeClient.a.b().moduleManager(); }
/*  67 */      this.e = eu.shoroa.bridge.ui.b.a.a.a("", x + 15, y + 15, 35.0F, 35.0F).b(new Function0<Unit>(this) {
/*  68 */           public final void a() { this.a.b("Modules");
/*  69 */             this.a.a((a)null); }
/*  70 */         }).c(""); }
/*     */   @NotNull public Object clone() { return super.clone(); }
/*     */   @NotNull public final ArrayList<a> f() { return this.a; }
/*     */   @NotNull public final ArrayList<a> g() { return this.b; }
/*     */   @Nullable
/*  75 */   public final a h() { return this.c; } private final void d(String searchText) { this.b.clear();
/*     */ 
/*     */     
/*  78 */     if (StringsKt.isBlank(searchText)) {
/*  79 */       this.b.addAll(this.a);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  84 */     Iterable<a> $this$filter$iv = this.a; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 276 */     Iterable<a> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 277 */     for (a element$iv$iv : iterable1) { a it = element$iv$iv; int $i$a$-filter-PageModule$filterModules$filteredModules$1 = 0; Intrinsics.checkNotNullExpressionValue(it.a().j().toLowerCase(Locale.ROOT), ""); Intrinsics.checkNotNullExpressionValue(searchText.toLowerCase(Locale.ROOT), ""); if (StringsKt.contains$default(it.a().j().toLowerCase(Locale.ROOT), searchText.toLowerCase(Locale.ROOT), false, 2, null)) destination$iv$iv.add(element$iv$iv);  }
/* 278 */      List<? extends a> filteredModules = (List)destination$iv$iv; this.b.addAll(filteredModules); }
/* 279 */   public final void a(a <set-?>) { this.c = <set-?>; } @Nullable public final eu.shoroa.bridge.ui.b.a i() { return this.e; } public final void a(eu.shoroa.bridge.ui.b.a <set-?>) { this.e = <set-?>; } private final float j() { return (getW() - 20 - (this.f - 1) * this.g) / this.f; } public void render(float mx, float my, float delta) { Iterator iterator; if (this.i) { this.d.setX(getX() + getW() - this.d.getW() - 15.0F); this.d.setY(getY() + 15.0F); } else { this.d.setX(getX() + getW() - this.d.getW() - 15.0F); this.d.setY(getY() + 15.0F); }  this.d.render(mx, my, delta); float gap = 10.0F; float maxHeight = 0.0F; if (this.c == null) { Iterable<a> $this$forEach$iv = this.b; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); }
/*     */     else
/* 281 */     { Intrinsics.checkNotNull(this.c); Iterable $this$filter$iv = this.c.e(); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 282 */       for (Object element$iv$iv : iterable1) { b it = (b)element$iv$iv; int $i$a$-filter-PageModule$render$2 = 0; if (it.getSetting().f()) destination$iv$iv.add(element$iv$iv);  }
/* 283 */        $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 284 */       iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); b it = (b)element$iv; int $i$a$-forEach-PageModule$render$3 = 0; maxHeight += it.offset() + gap; }
/*     */        }
/*     */      if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next(); a it = (a)element$iv;
/*     */       boolean bool = false;
/*     */       maxHeight += it.getH() + gap;
/*     */     }  } public void click(float mx, float my, int button) { Iterator<a> iterator;
/*     */     if (this.c == null)
/*     */     { Iterable<a> $this$forEach$iv = this.b;
/*     */       int $i$f$forEach = 0;
/* 294 */       iterator = $this$forEach$iv.iterator(); } else { Intrinsics.checkNotNull(this.c); this.c.a(mx, my, button); Intrinsics.checkNotNull(this.e); this.e.click(mx, my, button); this.d.click(mx, my, button); }  if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-PageModule$click$1 = 0; it.click(mx, my, button); }
/*     */      } public void release(float mx, float my, int button) { Iterator<a> iterator; if (this.c == null)
/* 296 */     { Iterable<a> $this$forEach$iv = this.b; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { Intrinsics.checkNotNull(this.c); this.c.release(mx, my, button); Intrinsics.checkNotNull(this.e); this.e.release(mx, my, button); this.d.release(mx, my, button); }  if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-PageModule$release$1 = 0; it.release(mx, my, button); }
/*     */      } public void onKey(int code, char char) { Iterator<a> iterator; super.onKey(code, char); if (this.c == null)
/* 298 */     { Iterable<a> $this$forEach$iv = this.b; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { Intrinsics.checkNotNull(this.c); this.c.onKey(code, char); Intrinsics.checkNotNull(this.e); this.e.onKey(code, char); return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-PageModule$onKey$1 = 0;
/*     */       it.onKey(code, char); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void c(String query) {
/*     */     Intrinsics.checkNotNullParameter(query, "");
/*     */     d(query);
/*     */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */