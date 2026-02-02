/*     */ package eu.shoroa.bridge.feature.b.a;@SourceDebugExtension({"SMAP\nModuleKeystrokes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleKeystrokes.kt\neu/shoroa/bridge/feature/module/impl/ModuleKeystrokes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1855#2,2:171\n1855#2,2:173\n*S KotlinDebug\n*F\n+ 1 ModuleKeystrokes.kt\neu/shoroa/bridge/feature/module/impl/ModuleKeystrokes\n*L\n77#1:171,2\n81#1:173,2\n*E\n"})
/*     */ public final class d extends b { @NotNull
/*     */   private final b b; @NotNull
/*     */   private final b c; @NotNull
/*     */   private final b d; @NotNull
/*     */   private final b e; @NotNull
/*     */   private final b f; @NotNull
/*     */   private final b g; @NotNull
/*     */   private final b h; @NotNull
/*     */   private final b i; @NotNull
/*     */   private final b j; @NotNull
/*     */   private final b k; @NotNull
/*     */   private final b l;
/*     */   @NotNull
/*     */   private final ArrayList<a> m;
/*     */   
/*  17 */   public d() { super("Keystrokes", "Shows pressed movement keys", false, "keystrokes", false, 20, null);
/*     */     
/*  19 */     this.b = a("Theme", k.MODERN);
/*  20 */     this.c = a("CPS Mode", c.BOTH);
/*  21 */     this.d = a("Background", true);
/*  22 */     this.e = a("Blur", false);
/*  23 */     this.f = a("Text Shadow", false);
/*  24 */     this.g = a("Chroma", false);
/*     */ 
/*     */ 
/*     */     
/*  28 */     this.h = a("Font Style", eu.shoroa.bridge.feature.c.a.d.SMOOTH).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() == k.CUSTOM)); } }
/*     */       );
/*  30 */     this.i = a("Background Color", new Color(0, 0, 0, 150)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() == k.CUSTOM)); } }
/*     */       );
/*  32 */     this.j = a("Pressed Color", new Color(255, 255, 255, 100)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() == k.CUSTOM)); } });
/*  33 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, "");
/*  34 */     this.k = a("Text Color", Color.WHITE).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() == k.CUSTOM || this.a.c().b() == k.CLASSIC)); } }
/*     */       );
/*  36 */     this.l = a("Border Radius", Float.valueOf(6.0F), Float.valueOf(0.0F), Float.valueOf(14.0F), Float.valueOf(0.1F)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() == k.CUSTOM)); } }
/*     */       );
/*  38 */     this.m = new ArrayList<>();
/*     */ 
/*     */     
/*  41 */     c(160.0F);
/*  42 */     B(); }
/*     */   @NotNull public final b<k> c() { return this.b.a(this, a[0]); }
/*     */   static { KProperty[] arrayOfKProperty = new KProperty[11]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "theme", "getTheme()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "mode", "getMode()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "doBackground", "getDoBackground()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "doBlur", "getDoBlur()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[4] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "doTextShadow", "getDoTextShadow()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[5] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "chroma", "getChroma()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[6] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "fontStyle", "getFontStyle()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[7] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "backgroundColor", "getBackgroundColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[8] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "pressedColor", "getPressedColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[9] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "textColor", "getTextColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[10] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "borderRadius", "getBorderRadius()Leu/shoroa/bridge/feature/setting/Setting;", 0));
/*     */     a = (KProperty<Object>[])arrayOfKProperty; }
/*  46 */   @NotNull public final b<c> d() { return this.c.a(this, a[1]); } private final void B() { this.m.clear();
/*  47 */     float gap = 4.0F;
/*  48 */     float keySize = (n() - gap * 2.0F) / 3.0F;
/*     */ 
/*     */     
/*  51 */     this.m.add(new a(null.a, keySize + gap, 0.0F, keySize, keySize, "W", null, 64, null));
/*     */ 
/*     */     
/*  54 */     this.m.add(new a(null.a, 0.0F, keySize + gap, keySize, keySize, "A", null, 64, null));
/*  55 */     this.m.add(new a(null.a, keySize + gap, keySize + gap, keySize, keySize, "S", null, 64, null));
/*  56 */     this.m.add(new a(null.a, keySize * 2 + gap * 2, keySize + gap, keySize, keySize, "D", null, 64, null));
/*     */     
/*  58 */     float currentY = keySize * 2 + gap * 2;
/*     */ 
/*     */     
/*  61 */     float mWidth = (n() - gap) / 2.0F;
/*  62 */     this.m.add(new a(null.a, 0.0F, currentY, mWidth, keySize, "LMB", new Function0<String>(this) { @NotNull
/*  63 */             public final String a() { return (this.a.d().b() == c.LEFT || this.a.d().b() == c.BOTH) ? ("" + eu.shoroa.bridge.d.b.a.INSTANCE.c() + " CPS") : ""; } }
/*     */         ));
/*  65 */     this.m.add(new a(null.a, mWidth + gap, currentY, mWidth, keySize, "RMB", new Function0<String>(this) { @NotNull
/*  66 */             public final String a() { return (this.a.d().b() == c.RIGHT || this.a.d().b() == c.BOTH) ? ("" + eu.shoroa.bridge.d.b.a.INSTANCE.d() + " CPS") : ""; }
/*     */              }
/*     */         ));
/*  69 */     currentY += keySize + gap;
/*     */     
/*  71 */     this.m.add(new a(null.a, 0.0F, currentY, n(), keySize / 1.5F, "————", null, 64, null));
/*     */     
/*  73 */     d(currentY + keySize / 1.5F); }
/*     */   @NotNull public final b<Boolean> s() { return this.d.a(this, a[2]); }
/*     */   @NotNull public final b<Boolean> t() { return this.e.a(this, a[3]); }
/*     */   @NotNull public final b<Boolean> u() { return this.f.a(this, a[4]); }
/*  77 */   @NotNull public final b<Boolean> v() { return this.g.a(this, a[5]); } @NotNull public final b<eu.shoroa.bridge.feature.c.a.d> w() { return this.h.a(this, a[6]); } @NotNull public final b<Color> x() { return this.i.a(this, a[7]); } @NotNull public final b<Color> y() { return this.j.a(this, a[8]); } @NotNull public final b<Color> z() { return this.k.a(this, a[9]); } @NotNull public final b<Float> A() { return this.l.a(this, a[10]); } public void a(boolean nvg, int displayWidth, int displayHeight) { Iterable<a> $this$forEach$iv = this.m; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     Iterator<a> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-ModuleKeystrokes$render$1 = 0; it.a(nvg, false); }
/*     */      } public void b(boolean nvg, int displayWidth, int displayHeight) { Iterable<a> $this$forEach$iv = this.m; int $i$f$forEach = 0;
/* 173 */     Iterator<a> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-ModuleKeystrokes$dummy$1 = 0;
/*     */       it.a(nvg, true); }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\013\b\004\030\0002\0020\001BO\022\f\020\003\032\b\022\004\022\0020\0020\r\022\006\020\004\032\0020\b\022\006\020\033\032\0020\b\022\006\020\034\032\0020\b\022\006\020\035\032\0020\b\022\006\020\036\032\0020\026\022\020\b\002\020\037\032\n\022\004\022\0020\026\030\0010\r¢\006\004\b \020!J\035\020\006\032\0020\0052\006\020\003\032\0020\0022\006\020\004\032\0020\002¢\006\004\b\006\020\007R\027\020\006\032\0020\b8\007¢\006\f\n\004\b\t\020\n\032\004\b\013\020\fR \020\016\032\b\022\004\022\0020\0020\r8\007X\004¢\006\f\n\004\b\016\020\017\032\004\b\006\020\020R\032\020\021\032\0020\b8\007X\004¢\006\f\n\004\b\021\020\n\032\004\b\016\020\fR\027\020\022\032\0020\b8\007¢\006\f\n\004\b\022\020\n\032\004\b\021\020\fR\030\020\013\032\006*\0020\0230\0238\002X\004¢\006\006\n\004\b\024\020\025R\"\020\t\032\n\022\004\022\0020\026\030\0010\r8\007X\004¢\006\f\n\004\b\027\020\017\032\004\b\030\020\020R\032\020\030\032\0020\0268\007X\004¢\006\f\n\004\b\030\020\031\032\004\b\t\020\032R\032\020\027\032\0020\b8\007X\004¢\006\f\n\004\b\013\020\n\032\004\b\022\020\f"}, d2 = {"Leu/shoroa/bridge/feature/b/a/d$a;", "", "", "p0", "p1", "", "a", "(ZZ)V", "", "f", "F", "e", "()F", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "c", "d", "Leu/shoroa/bridge/b/a/a;", "i", "Leu/shoroa/bridge/b/a/a;", "", "h", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "p2", "p3", "p4", "p5", "p6", "<init>", "(Leu/shoroa/bridge/feature/b/a/d;Lkotlin/jvm/functions/Function0;FFFFLjava/lang/String;Lkotlin/jvm/functions/Function0;)V"})
/*     */   public final class a {
/*     */     @NotNull
/*     */     private final Function0<Boolean> b;
/*     */     private final float c;
/*     */     private final float d;
/*     */     private final float e;
/*     */     private final float f;
/*     */     @NotNull
/*     */     private final String g;
/*     */     @Nullable
/*     */     private final Function0<String> h;
/*     */     private final eu.shoroa.bridge.b.a.a i;
/*     */     
/*     */     public a(d this$0, Function0<Boolean> keyDown, float kx, float ky, float width, float height, String text, Function0<String> subText) {
/*     */       this.b = keyDown;
/*     */       this.c = kx;
/*     */       this.d = ky;
/*     */       this.e = width;
/*     */       this.f = height;
/*     */       this.g = text;
/*     */       this.h = subText;
/*     */       this.i = eu.shoroa.bridge.b.a.a.a(a::h, a::i);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     @JvmName(name = "a")
/*     */     public final Function0<Boolean> a() {
/*     */       return this.b;
/*     */     }
/*     */     
/*     */     @JvmName(name = "b")
/*     */     public final float b() {
/*     */       return this.c;
/*     */     }
/*     */     
/*     */     @JvmName(name = "c")
/*     */     public final float c() {
/*     */       return this.d;
/*     */     }
/*     */     
/*     */     @JvmName(name = "d")
/*     */     public final float d() {
/*     */       return this.e;
/*     */     }
/*     */     
/*     */     @JvmName(name = "e")
/*     */     public final float e() {
/*     */       return this.f;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     @JvmName(name = "f")
/*     */     public final String f() {
/*     */       return this.g;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     @JvmName(name = "g")
/*     */     public final Function0<String> g() {
/*     */       return this.h;
/*     */     }
/*     */     
/*     */     private static final Float h() {
/*     */       return Float.valueOf(150.0F);
/*     */     }
/*     */     
/*     */     private static final b i() {
/*     */       return b.SINE_IN_OUT;
/*     */     }
/*     */     
/*     */     public final void a(boolean nvg, boolean isDummy) {
/*     */       boolean active = isDummy ? ((Intrinsics.areEqual(this.g, "W") || Intrinsics.areEqual(this.g, "LMB"))) : ((Boolean)this.b.invoke()).booleanValue();
/*     */       this.i.a(active);
/*     */       boolean useModern = (this.a.c().b() == k.MODERN || (this.a.c().b() == k.CUSTOM && this.a.w().b() == eu.shoroa.bridge.feature.c.a.d.SMOOTH));
/*     */       boolean useClassic = (this.a.c().b() == k.CLASSIC || (this.a.c().b() == k.CUSTOM && this.a.w().b() == eu.shoroa.bridge.feature.c.a.d.MINECRAFT));
/*     */       switch (a.a[((k)this.a.c().b()).ordinal()]) {
/*     */         case 1:
/*     */         
/*     */         case 2:
/*     */         
/*     */         default:
/*     */           break;
/*     */       } 
/*     */       Color bgColor = new Color(0, 0, 0, 150);
/*     */       switch (a.a[((k)this.a.c().b()).ordinal()]) {
/*     */         case 1:
/*     */         
/*     */         case 2:
/*     */         
/*     */         default:
/*     */           break;
/*     */       } 
/*     */       Color pColor = ((Boolean)this.a.v().b()).booleanValue() ? Color.getHSBColor((float)(System.currentTimeMillis() % 2000L) / 2000.0F, 0.7F, 1.0F) : Color.WHITE;
/*     */       switch (a.a[((k)this.a.c().b()).ordinal()]) {
/*     */         case 1:
/*     */         
/*     */         case 2:
/*     */           if (active && !((Boolean)this.a.v().b()).booleanValue());
/*     */         default:
/*     */           break;
/*     */       } 
/*     */       Color txtColor = (Color)this.a.z().b();
/*     */       if (nvg) {
/*     */         switch (a.a[((k)this.a.c().b()).ordinal()]) {
/*     */           case 1:
/*     */           
/*     */           case 2:
/*     */           
/*     */           default:
/*     */             break;
/*     */         } 
/*     */         float radius = 0.0F;
/*     */         if (((Boolean)this.a.t().b()).booleanValue())
/*     */           eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, this.a.l() + this.c, this.a.m() + this.d, this.e, this.f, radius, eu.shoroa.bridge.b.b.d.a.a(), 0.0F, 64, null); 
/*     */         if (((Boolean)this.a.s().b()).booleanValue()) {
/*     */           Intrinsics.checkNotNullExpressionValue(this.i.a(bgColor, pColor), "");
/*     */           eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, this.a.l() + this.c, this.a.m() + this.d, this.e, this.f, radius, eu.shoroa.bridge.b.b.d.a.a(this.i.a(bgColor, pColor)), 0.0F, 64, null);
/*     */         } 
/*     */       } 
/*     */       if (this.h == null || (String)this.h.invoke() == null)
/*     */         (String)this.h.invoke(); 
/*     */       String subStr = (isDummy && this.h != null) ? "0 CPS" : "";
/*     */       boolean hasSub = (((CharSequence)subStr).length() > 0);
/*     */       if (useModern && nvg) {
/*     */         Intrinsics.checkNotNull(txtColor);
/*     */         eu.shoroa.bridge.b.d.b(eu.shoroa.bridge.b.d.a, this.g, this.a.l() + this.c + this.e / 2, this.a.m() + this.d + this.f / 2 - (hasSub ? 5 : false), "semibold", 18.0F, txtColor, eu.shoroa.bridge.b.d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */         if (hasSub) {
/*     */           Intrinsics.checkNotNullExpressionValue(txtColor.darker(), "");
/*     */           eu.shoroa.bridge.b.d.b(eu.shoroa.bridge.b.d.a, subStr, this.a.l() + this.c + this.e / 2, this.a.m() + this.d + this.f / 2 + 11, "medium", 9.0F, txtColor.darker(), eu.shoroa.bridge.b.d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */         } 
/*     */       } else if (useClassic) {
/*     */         Intrinsics.checkNotNull(BridgeClient.a.b());
/*     */         e renderer = BridgeClient.a.b().vanillaRenderer();
/*     */         float centerX = this.a.l() + this.c + this.e / 2;
/*     */         float centerY = this.a.m() + this.d + this.f / 2;
/*     */         if (hasSub) {
/*     */           Intrinsics.checkNotNull(txtColor);
/*     */           renderer.b(this.g, centerX, centerY - 4, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/*     */           renderer.a("§7§o" + subStr, centerX - 17, centerY + 6, 1.2F, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/*     */         } else if (Intrinsics.areEqual(this.g, "————") || Intrinsics.areEqual(this.g, "_______")) {
/*     */           int loops = 12;
/*     */           float offsetStep = 1.5F;
/*     */           float totalExtension = (loops - 1) * offsetStep;
/*     */           float startX = centerX - totalExtension / 2;
/*     */           for (int i = 0; i < loops; i++) {
/*     */             Intrinsics.checkNotNull(txtColor);
/*     */             renderer.b("§l" + this.g, startX + i * offsetStep, centerY - true, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/*     */           } 
/*     */         } else {
/*     */           Intrinsics.checkNotNull(txtColor);
/*     */           renderer.b(this.g, centerX, centerY, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/*     */         } 
/*     */       } 
/*     */     }
/*     */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */