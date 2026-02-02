/*    */ package eu.shoroa.bridge.ui.b;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\017\030\000 \0262\0020\001:\001\026B1\b\002\022\006\020\003\032\0020\n\022\006\020\004\032\0020\002\022\006\020\006\032\0020\002\022\006\020\037\032\0020\002\022\006\020 \032\0020\002¢\006\004\b!\020\"J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\027\020\013\032\0020\0002\006\020\003\032\0020\nH\007¢\006\004\b\013\020\fJ\035\020\016\032\0020\0002\f\020\003\032\b\022\004\022\0020\0070\rH\007¢\006\004\b\016\020\017J'\020\020\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\020\020\tJ'\020\021\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\021\020\022R\032\020\026\032\0020\0238\007X\004¢\006\f\n\004\b\013\020\024\032\004\b\016\020\025R\"\020\016\032\0020\n8\007@\007X\016¢\006\022\n\004\b\027\020\030\032\004\b\013\020\031\"\004\b\016\020\032R(\020\013\032\b\022\004\022\0020\0070\r8\007@\007X\016¢\006\022\n\004\b\033\020\034\032\004\b\027\020\035\"\004\b\026\020\036R\"\020\027\032\0020\n8\007@\007X\016¢\006\022\n\004\b\016\020\030\032\004\b\026\020\031\"\004\b\026\020\032"}, d2 = {"Leu/shoroa/bridge/ui/b/e;", "Leu/shoroa/bridge/ui/b/d;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "", "c", "(Ljava/lang/String;)Leu/shoroa/bridge/ui/b/e;", "Lkotlin/Function0;", "b", "(Lkotlin/jvm/functions/Function0;)Leu/shoroa/bridge/ui/b/e;", "release", "render", "(FFF)V", "Leu/shoroa/bridge/b/a/a;", "Leu/shoroa/bridge/b/a/a;", "()Leu/shoroa/bridge/b/a/a;", "a", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "e", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "p3", "p4", "<init>", "(Ljava/lang/String;FFFF)V"})
/*    */ public final class e extends d { @NotNull
/*    */   public static final a a = new a(null); @NotNull
/*    */   private String b; @NotNull
/*    */   private final eu.shoroa.bridge.b.a.a c;
/*    */   @NotNull
/*    */   private String d;
/*    */   @NotNull
/*    */   private Function0<Unit> e;
/*    */   
/* 11 */   private e(String text, float x, float y, float w, float h) { super(x, y, w, h); this.b = text;
/* 12 */     Intrinsics.checkNotNullExpressionValue(eu.shoroa.bridge.b.a.a.a(e::e, e::f), ""); this.c = eu.shoroa.bridge.b.a.a.a(e::e, e::f);
/* 13 */     this.d = "";
/* 14 */     this.e = null.a; } @NotNull @JvmName(name = "a") public final String a() { return this.b; } @JvmName(name = "a") public final void a(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.b = <set-?>; } @NotNull public Object clone() { return super.clone(); } @NotNull @JvmName(name = "b") public final eu.shoroa.bridge.b.a.a b() { return this.c; } @NotNull @JvmName(name = "d") public final Function0<Unit> d() { return this.e; } private static final Float e() { return Float.valueOf(180.0F); } private static final b f() { return b.LINEAR; } @NotNull @JvmName(name = "c") public final String c() { return this.d; } @JvmName(name = "b") public final void b(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.d = <set-?>; } @JvmName(name = "a") public final void a(Function0<Unit> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.e = <set-?>; }
/*    */   
/*    */   public void render(float mx, float my, float delta) {
/* 17 */     this.c.a(d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/*    */ 
/*    */     
/* 20 */     Intrinsics.checkNotNullExpressionValue(this.c.a(eu.shoroa.bridge.d.e.a.a.k().c(), eu.shoroa.bridge.d.e.a.a.k().c().brighter()), ""); d.a(d.a, this, 16.0F, d.a.a(this.c.a(eu.shoroa.bridge.d.e.a.a.k().c(), eu.shoroa.bridge.d.e.a.a.k().c().brighter())), 0.0F, 8, null);
/* 21 */     Intrinsics.checkNotNullExpressionValue(this.c.a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().d()), ""); d.a(d.a, this, 16.0F, d.a.a(this.c.a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().d())).a(1.5F), 0.0F, 8, null);
/*    */ 
/*    */     
/* 24 */     float padding = 10.0F;
/* 25 */     float iconSize = getW() / 8;
/* 26 */     float iconX = getX() + padding;
/* 27 */     float iconY = getY() + (getH() - iconSize) / 2.0F;
/*    */     
/* 29 */     d.a.a(this.d, iconX, iconY, iconSize, iconSize, 1.0F, 1.0F, eu.shoroa.bridge.d.e.a.a.k().e());
/*    */ 
/*    */     
/* 32 */     float textX = iconX + iconSize + padding;
/* 33 */     d.b(d.a, 
/* 34 */         this.b, 
/* 35 */         textX, 
/* 36 */         getY() + getH() / 2.0F + true, 
/* 37 */         "semibold", 
/* 38 */         16.0F, 
/* 39 */         eu.shoroa.bridge.d.e.a.a.k().e(), 
/* 40 */         d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */ 
/*    */     
/* 43 */     getStyle().a(this);
/* 44 */     getStyle().a(this, d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 50 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0)
/* 51 */       this.e.invoke(); 
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */   
/*    */   @NotNull
/*    */   public final e c(String icon) {
/* 58 */     Intrinsics.checkNotNullParameter(icon, ""); this.d = icon;
/* 59 */     return this;
/*    */   }
/*    */   @NotNull
/*    */   public final e b(Function0<Unit> onClick) {
/* 63 */     Intrinsics.checkNotNullParameter(onClick, ""); this.e = onClick;
/* 64 */     return this;
/*    */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\f\020\rJ7\020\n\032\0020\t2\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\0042\006\020\b\032\0020\004H\007¢\006\004\b\n\020\013"}, d2 = {"Leu/shoroa/bridge/ui/b/e$a;", "", "", "p0", "", "p1", "p2", "p3", "p4", "Leu/shoroa/bridge/ui/b/e;", "a", "(Ljava/lang/String;FFFF)Leu/shoroa/bridge/ui/b/e;", "<init>", "()V"})
/*    */   public static final class a { private a() {}
/*    */     @NotNull
/*    */     public final e a(String text, float x, float y, float w, float h) {
/* 69 */       Intrinsics.checkNotNullParameter(text, ""); return new e(text, x, y, w, h, null);
/*    */     } }
/*    */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */