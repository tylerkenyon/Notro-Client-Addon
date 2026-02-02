/*     */ package eu.shoroa.bridge.ui.b;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\004\n\002\030\002\n\000\n\002\020\f\n\002\b\007\n\002\020\016\n\002\b\t\n\002\030\002\n\000\n\002\020\013\n\002\b\t\030\000 \f2\0020\001:\001\fB/\022\006\020\005\032\0020\030\022\006\020\006\032\0020\004\022\006\020\b\032\0020\004\022\006\020*\032\0020\004\022\006\020+\032\0020\004¢\006\004\b,\020-J\017\020\002\032\0020\000H\007¢\006\004\b\002\020\003J'\020\n\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\007H\026¢\006\004\b\n\020\013J\027\020\f\032\0020\0002\006\020\005\032\0020\007H\007¢\006\004\b\f\020\rJ#\020\f\032\0020\0002\022\020\005\032\016\022\004\022\0020\000\022\004\022\0020\t0\016H\007¢\006\004\b\f\020\017J\037\020\021\032\0020\t2\006\020\005\032\0020\0072\006\020\006\032\0020\020H\026¢\006\004\b\021\020\022J'\020\023\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\007H\026¢\006\004\b\023\020\013J'\020\024\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\004H\026¢\006\004\b\024\020\025R\026\020\f\032\0020\0078\002@\002X\016¢\006\006\n\004\b\026\020\027R\024\020\031\032\0020\0308\002X\004¢\006\006\n\004\b\031\020\032R\"\020\034\032\0020\0308\007@\007X\016¢\006\022\n\004\b\033\020\032\032\004\b\034\020\035\"\004\b\031\020\036R\026\020\002\032\0020\0078\002@\002X\016¢\006\006\n\004\b\034\020\027R\"\020!\032\016\022\004\022\0020\000\022\004\022\0020\t0\0168\002@\002X\016¢\006\006\n\004\b\037\020 R\030\020\037\032\006*\0020\"0\"8\002X\004¢\006\006\n\004\b!\020#R\"\020(\032\0020$8\007@\007X\016¢\006\022\n\004\b\002\020%\032\004\b\f\020&\"\004\b\f\020'R\026\020\026\032\0020$8\002@\002X\016¢\006\006\n\004\b(\020%R\"\020)\032\0020\0308\007@\007X\016¢\006\022\n\004\b)\020\032\032\004\b\031\020\035\"\004\b\f\020\036"}, d2 = {"Leu/shoroa/bridge/ui/b/h;", "Leu/shoroa/bridge/ui/b/d;", "d", "()Leu/shoroa/bridge/ui/b/h;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "a", "(I)Leu/shoroa/bridge/ui/b/h;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Leu/shoroa/bridge/ui/b/h;", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "h", "I", "", "b", "Ljava/lang/String;", "j", "c", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "f", "Lkotlin/jvm/functions/Function1;", "e", "Leu/shoroa/bridge/b/a/a;", "Leu/shoroa/bridge/b/a/a;", "", "Z", "()Z", "(Z)V", "g", "i", "p3", "p4", "<init>", "(Ljava/lang/String;FFFF)V"})
/*     */ public final class h extends d { @NotNull
/*     */   public static final a a = new a(null); @NotNull
/*     */   private final String b; private int c; private boolean d; private final eu.shoroa.bridge.b.a.a e; @NotNull
/*     */   private Function1<? super h, Unit> f;
/*     */   private boolean g;
/*     */   private int h;
/*     */   @NotNull
/*     */   private String i;
/*     */   @NotNull
/*     */   private String j;
/*     */   
/*     */   @NotNull
/*  14 */   public Object clone() { return super.clone(); }
/*  15 */   @JvmName(name = "a") public final boolean a() { return this.d; } @JvmName(name = "a") public final void a(boolean <set-?>) { this.d = <set-?>; } private static final Float e() { return Float.valueOf(180.0F); } public h(String display, float x, float y, float f1, float w) { super(x, y, f1, w); this.b = display;
/*  16 */     this.c = 40;
/*     */     
/*  18 */     this.e = eu.shoroa.bridge.b.a.a.a(h::e, h::f);
/*  19 */     this.f = null.a;
/*     */ 
/*     */     
/*  22 */     this.i = "";
/*  23 */     this.j = ""; } private static final b f() { return b.CUBIC_IN_OUT; } @NotNull @JvmName(name = "b") public final String b() { return this.i; } @JvmName(name = "a") public final void a(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.i = <set-?>; } @NotNull @JvmName(name = "c") public final String c() { return this.j; } @JvmName(name = "b") public final void b(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.j = <set-?>; }
/*     */    public void render(float mx, float my, float delta) {
/*  25 */     this.e.a(this.d);
/*  26 */     float selProg = ((((CharSequence)this.i).length() == 0)) ? this.e.a() : 1.0F;
/*  27 */     float scaledDisplayW = d.a.a(this.b, "mono extrabold", 13.0F);
/*     */     
/*  29 */     if (this.g) {
/*  30 */       d.b(d.a, "Press enter to accept", getX() + getW() / 2.0F, getY() + getH() - 6 + 14 * this.e.a(), "mono semibold", 12.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     }
/*     */     
/*  33 */     d.a(d.a, this, 8.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 8, null);
/*     */     
/*  35 */     d.a.a(getX() - 2.0F, getY() - 2.0F, 14.0F, getH() + 2.0F, new Function0<Unit>(this) {
/*  36 */           public final void a() { Intrinsics.checkNotNullExpressionValue(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f()), ""); d.a(d.a, this.a, 8.0F, d.a.a(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f())).a(2.0F), 0.0F, 8, null); }
/*     */         });
/*  38 */     d.a.a(getX() - 2.0F, getY() + getH() / 2.0F, getW() + 4.0F, getH() / 2.0F, new Function0<Unit>(this) {
/*  39 */           public final void a() { Intrinsics.checkNotNullExpressionValue(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f()), ""); d.a(d.a, this.a, 8.0F, d.a.a(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f())).a(2.0F), 0.0F, 8, null); }
/*     */         });
/*  41 */     d.a.a(getX() + 13.0F + scaledDisplayW, getY() - 2.0F, getW() - 13 - scaledDisplayW, getH() + 2.0F, new Function0<Unit>(this) {
/*  42 */           public final void a() { Intrinsics.checkNotNullExpressionValue(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f()), ""); d.a(d.a, this.a, 8.0F, d.a.a(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f())).a(2.0F), 0.0F, 8, null); }
/*     */         });
/*  44 */     d.a.a(getX() + 12.0F, getY() - 2.0F, scaledDisplayW + true, 8.0F * (1.0F - selProg), new Function0<Unit>(this) { public final void a() {
/*  45 */             Intrinsics.checkNotNullExpressionValue(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f()), ""); d.a(d.a, this.a, 8.0F, d.a.a(h.a(this.a).a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f())).a(2.0F), 0.0F, 8, null);
/*     */           } }
/*     */       );
/*  48 */     b.INSTANCE.e();
/*  49 */     b.INSTANCE.a(getX() + 12.0F, getY() + getH() / 2.0F * (1.0F - selProg) + 3.0F * selProg);
/*  50 */     b.INSTANCE.b(1.0F - selProg * 0.2F, 1.0F - selProg * 0.2F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     Intrinsics.checkNotNullExpressionValue(this.e.a(eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.d.e.a.a.k().f()), ""); d.b(d.a, this.b, 0.0F, 1.0F, (selProg > 0.5F) ? "mono extrabold" : "mono bold", 16.0F, this.e.a(eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.d.e.a.a.k().f()), 
/*  58 */         d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     
/*  60 */     b.INSTANCE.f();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     Intrinsics.checkNotNullExpressionValue(this.e.a(eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.d.e.a.a.k().f()), ""); d.b(d.a, this.i, getX() + 12.0F, getY() + getH() / 2.0F + 2, "mono semibold", 16.0F, this.e.a(eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.d.e.a.a.k().f()), 
/*  69 */         d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */ 
/*     */     
/*  72 */     float timer1s = (float)(System.currentTimeMillis() % 500L) / 500.0F;
/*  73 */     Intrinsics.checkNotNullExpressionValue(this.i.substring(0, this.h), ""); float cursorX = getX() + d.a.a(this.i.substring(0, this.h), "mono semibold", 16.0F) + 12.0F;
/*  74 */     if (this.d)
/*  75 */       d.a(d.a, cursorX, getY() + 10.0F, 2.0F, getH() - 20.0F, 0.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.a(eu.shoroa.bridge.d.e.a.a.k().e(), (float)Math.sin((timer1s * 2) * Math.PI) * 0.5F + 0.5F)), 0.0F, 64, null); 
/*     */   }
/*     */   
/*     */   public void click(float mx, float my, int button) {
/*  79 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/*  80 */       this.d = true;
/*  81 */       this.h = this.i.length();
/*     */     } else {
/*  83 */       this.d = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */   
/*     */   public void onKey(int code, char char) {
/*     */     try {
/*  91 */       if (this.d) {
/*  92 */         if (code == eu.shoroa.bridge.d.d.a.e()) {
/*  93 */           if ((((CharSequence)this.i).length() > 0)) {
/*  94 */             Intrinsics.checkNotNullExpressionValue(this.i.substring(0, Math.max(0, this.h - 1)), ""); Intrinsics.checkNotNullExpressionValue(this.i.substring(this.h), ""); this.i = this.i.substring(0, Math.max(0, this.h - 1)) + this.i.substring(0, Math.max(0, this.h - 1));
/*  95 */             int i = this.h; this.h = i + -1;
/*     */           } 
/*  97 */         } else if (code == eu.shoroa.bridge.d.d.a.f()) {
/*  98 */           this.f.invoke(this);
/*  99 */           this.j = this.i;
/* 100 */           this.d = false;
/* 101 */         } else if (this.i.length() < this.c && char != '§' && char >= ' ' && char != '') {
/* 102 */           Intrinsics.checkNotNullExpressionValue(this.i.substring(0, this.h), ""); Intrinsics.checkNotNullExpressionValue(this.i.substring(this.h), ""); this.i = this.i.substring(0, this.h) + this.i.substring(0, this.h) + char;
/* 103 */           int i = this.h; this.h = i + 1;
/*     */         } 
/*     */         
/* 106 */         if (code == eu.shoroa.bridge.d.d.a.g()) {
/* 107 */           this.h = Math.max(0, this.h - 1);
/* 108 */         } else if (code == eu.shoroa.bridge.d.d.a.h()) {
/* 109 */           this.h = Math.min(this.i.length(), this.h + 1);
/*     */         } 
/*     */       } 
/* 112 */     } catch (Exception exception) {}
/*     */   }
/*     */   @NotNull
/*     */   public final h a(int maxChars) {
/* 116 */     this.c = maxChars;
/* 117 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final h a(Function1<? super h, Unit> onEnter) {
/* 121 */     Intrinsics.checkNotNullParameter(onEnter, ""); this.f = onEnter;
/* 122 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final h d() {
/* 126 */     this.g = true;
/* 127 */     return this;
/*     */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\f\020\rJ7\020\n\032\0020\t2\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\0042\006\020\b\032\0020\004H\007¢\006\004\b\n\020\013"}, d2 = {"Leu/shoroa/bridge/ui/b/h$a;", "", "", "p0", "", "p1", "p2", "p3", "p4", "Leu/shoroa/bridge/ui/b/h;", "a", "(Ljava/lang/String;FFFF)Leu/shoroa/bridge/ui/b/h;", "<init>", "()V"})
/*     */   public static final class a { private a() {}
/*     */     @NotNull
/*     */     public final h a(String display, float x, float y, float h, float w) {
/* 132 */       Intrinsics.checkNotNullParameter(display, ""); return new h(display, x, y, h, w);
/*     */     } }
/*     */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\h.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */