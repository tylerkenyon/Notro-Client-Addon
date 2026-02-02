/*    */ package eu.shoroa.bridge.ui.a.a;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\f\n\002\b\002\n\002\020\016\n\002\b\005\n\002\020!\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\000 \0162\0020\001:\001\016B'\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\002\022\006\020'\032\0020\002¢\006\004\b(\020)J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\037\020\013\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\nH\026¢\006\004\b\013\020\fJ\025\020\016\032\0020\0072\006\020\003\032\0020\r¢\006\004\b\016\020\017J'\020\020\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\020\020\tJ'\020\021\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\021\020\022J%\020\016\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002¢\006\004\b\016\020\022R \020\016\032\b\022\004\022\0020\r0\0238\007X\004¢\006\f\n\004\b\024\020\025\032\004\b\026\020\027R\032\020\033\032\0020\0308\007X\004¢\006\f\n\004\b\031\020\032\032\004\b\033\020\034R\"\020!\032\0020\0358\007@\007X\016¢\006\022\n\004\b\026\020\036\032\004\b\016\020\037\"\004\b\016\020 R\024\020\026\032\0020\"8\002X\004¢\006\006\n\004\b\033\020#R\024\020\031\032\0020$8\002X\004¢\006\006\n\004\b!\020%R \020&\032\b\022\004\022\0020\r0\0238\007X\004¢\006\f\n\004\b&\020\025\032\004\b!\020\027"}, d2 = {"Leu/shoroa/bridge/ui/a/a/b;", "Leu/shoroa/bridge/ui/b/d;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "", "onKey", "(IC)V", "", "a", "(Ljava/lang/String;)V", "release", "render", "(FFF)V", "", "g", "Ljava/util/List;", "d", "()Ljava/util/List;", "Leu/shoroa/bridge/ui/a/a/a;", "e", "Leu/shoroa/bridge/ui/a/a/a;", "b", "()Leu/shoroa/bridge/ui/a/a/a;", "", "Z", "()Z", "(Z)V", "c", "Leu/shoroa/bridge/d/e/b;", "Leu/shoroa/bridge/d/e/b;", "Leu/shoroa/bridge/d/e/f;", "Leu/shoroa/bridge/d/e/f;", "f", "p3", "<init>", "(FFFF)V"})
/*    */ @SourceDebugExtension({"SMAP\nPanelConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelConsole.kt\neu/shoroa/bridge/ui/console/comp/PanelConsole\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1864#2,3:93\n*S KotlinDebug\n*F\n+ 1 PanelConsole.kt\neu/shoroa/bridge/ui/console/comp/PanelConsole\n*L\n69#1:93,3\n*E\n"})
/*    */ public final class b extends d {
/* 10 */   public b(float x, float y, float w, float h) { super(x, y, w, h);
/* 11 */     this.b = new eu.shoroa.bridge.d.e.b();
/* 12 */     this.c = new f();
/*    */     
/* 14 */     this.e = (new a(x + 10, y + h - 30, w - 100, 30.0F)).a(null.a);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.f = new ArrayList<>();
/* 21 */     this.g = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     b.h = this;
/* 27 */     b.INSTANCE.a(); }
/*    */   @NotNull public Object clone() { return super.clone(); }
/*    */   @JvmName(name = "a") public final boolean a() { return this.d; }
/*    */   @JvmName(name = "a") public final void a(boolean <set-?>) { this.d = <set-?>; } @NotNull @JvmName(name = "b") public final a b() { return this.e; } @NotNull @JvmName(name = "c") public final List<String> c() { return this.f; } @NotNull @JvmName(name = "d") public final List<String> d() { return this.g; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\b\020\tR\"\020\005\032\0020\0028\007@\007X\016¢\006\022\n\004\b\003\020\004\032\004\b\005\020\006\"\004\b\005\020\007"}, d2 = {"Leu/shoroa/bridge/ui/a/a/b$a;", "", "Leu/shoroa/bridge/ui/a/a/b;", "h", "Leu/shoroa/bridge/ui/a/a/b;", "a", "()Leu/shoroa/bridge/ui/a/a/b;", "(Leu/shoroa/bridge/ui/a/a/b;)V", "<init>", "()V"}) public static final class a {
/* 31 */     private a() {} @NotNull @JvmName(name = "a") public final b a() { return b.e(); } @JvmName(name = "a") public final void a(b <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); b.a(<set-?>); } } public final void a(String text) { Intrinsics.checkNotNullParameter(text, ""); this.g.add(text); } @NotNull public static final a a = new a(null); @NotNull private final eu.shoroa.bridge.d.e.b b; @NotNull private final f c; private boolean d; @NotNull
/*    */   private final a e; @NotNull
/*    */   private final List<String> f; @NotNull
/*    */   private final List<String> g; @NotNull
/* 35 */   private static b h = new b(0.0F, 0.0F, 0.0F, 0.0F); public void render(float mx, float my, float delta) { float border = 10.0F;
/* 36 */     float header = 40.0F;
/*    */     
/* 38 */     if (this.d) {
/* 39 */       this.b.a(mx, my, this::a, this::b);
/*    */     }
/*    */     
/* 42 */     this.e.setX(getX() + border);
/* 43 */     this.e.setY(getY() + getH() - 30 - border);
/*    */     
/* 45 */     eu.shoroa.bridge.ui.a.a.a.a(getX(), getY(), getW(), getH());
/* 46 */     eu.shoroa.bridge.ui.a.a.a.b(getX() + border, getY() + header, getW() - border * 2, getH() - border * 2 - 30 - header);
/* 47 */     eu.shoroa.bridge.ui.a.a.a.a(getX() + getW() - 100 + border * 2, getY() + getH() - 30 - border, 100.0F - border * 3, 30.0F);
/* 48 */     eu.shoroa.bridge.ui.a.a.a.a(getX() + getW() - border - 20, getY() + border, 20.0F, 20.0F);
/* 49 */     eu.shoroa.bridge.ui.a.a.a(eu.shoroa.bridge.ui.a.a.a, "Console", getX() + 40, getY() + 13, 16.0F, null, null, 48, null);
/* 50 */     d.a.a("icon_small", getX() + 8, getY() + 9, 26.0F, 22.0F, 0.0F, 1.0F);
/*    */     
/* 52 */     d.a.a(getX() + border, getY() + header + 2, getW() - border * 2, getH() - border * 2 - 30 - header - 4, new Function0<Unit>(this, mx, my, delta) {
/* 53 */           public final void a() { this.a.a(this.$b, this.$c, this.$d); }
/*    */         });
/* 55 */     this.e.render(mx, my, delta); }
/*    */    private static final void a(b this$0, Float it) { Intrinsics.checkNotNullParameter(this$0, ""); Intrinsics.checkNotNullParameter(it, ""); this$0.setX(it.floatValue()); } private static final void b(b this$0, Float it) { Intrinsics.checkNotNullParameter(this$0, "");
/*    */     Intrinsics.checkNotNullParameter(it, "");
/*    */     this$0.setY(it.floatValue()); }
/* 59 */   public final void a(float mx, float my, float delta) { float border = 10.0F;
/* 60 */     float header = 40.0F;
/* 61 */     this.c.c(this.g.size() * 16.0F + border * 2);
/* 62 */     this.c.a(hovered(getX() + border, getY() + header, getW() - border * 2, getH() - border * 2 - 30 - header));
/* 63 */     this.c.d(getH() - border * 2 - 30 - header);
/* 64 */     this.c.e(2000.0F);
/* 65 */     this.c.a(10.0F);
/* 66 */     this.c.b(true);
/* 67 */     float scroll = this.c.c();
/*    */     
/* 69 */     Iterable<String> $this$forEachIndexed$iv = this.g; int $i$f$forEachIndexed = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 93 */     int index$iv = 0;
/* 94 */     Iterator<String> iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  String str = (String)item$iv; int i = j, $i$a$-forEachIndexed-PanelConsole$textBox$1 = 0;
/*    */       eu.shoroa.bridge.ui.a.a.a(eu.shoroa.bridge.ui.a.a.a, str, getX() + border + 10, getY() + header + border + (16 * i) - scroll, 16.0F, null, null, 48, null); }
/*    */      }
/*    */ 
/*    */   
/*    */   public void click(float mx, float my, int button) {
/*    */     if (hovered(getX(), getY(), getW(), 40.0F) && button == 0) {
/*    */       this.b.a(mx, my, getX(), getY());
/*    */       this.d = true;
/*    */     } 
/*    */     this.e.click(mx, my, button);
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {
/*    */     this.d = false;
/*    */     this.e.release(mx, my, button);
/*    */   }
/*    */   
/*    */   public void onKey(int code, char char) {
/*    */     this.e.onKey(code, char);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */