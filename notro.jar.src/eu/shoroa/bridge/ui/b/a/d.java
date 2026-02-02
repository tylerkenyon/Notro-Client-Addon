/*    */ package eu.shoroa.bridge.ui.b.a;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import kotlin.jvm.JvmName;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\f\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\b'\030\000 \0252\0020\001:\001\025B\037\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\027¢\006\004\b \020!J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\037\020\013\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\nH\026¢\006\004\b\013\020\fJ'\020\r\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\r\020\tJ'\020\016\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\016\020\017R\"\020\025\032\0020\0208\007@\007X\016¢\006\022\n\004\b\021\020\022\032\004\b\023\020\024\"\004\b\025\020\026R\032\020\030\032\0020\0278\007X\004¢\006\f\n\004\b\030\020\031\032\004\b\021\020\032R\032\020\034\032\0020\0338\007X\004¢\006\f\n\004\b\034\020\035\032\004\b\036\020\037"}, d2 = {"Leu/shoroa/bridge/ui/b/a/d;", "Leu/shoroa/bridge/ui/b/d;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "", "d", "Z", "f", "()Z", "a", "(Z)V", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Leu/shoroa/bridge/b/a/a;", "c", "Leu/shoroa/bridge/b/a/a;", "e", "()Leu/shoroa/bridge/b/a/a;", "<init>", "(FFLjava/lang/String;)V"})
/*    */ @SourceDebugExtension({"SMAP\nWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widget.kt\neu/shoroa/bridge/ui/internal/widget/Widget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1855#2,2:54\n1855#2,2:56\n1855#2,2:58\n1855#2,2:60\n*S KotlinDebug\n*F\n+ 1 Widget.kt\neu/shoroa/bridge/ui/internal/widget/Widget\n*L\n39#1:54,2\n43#1:56,2\n48#1:58,2\n51#1:60,2\n*E\n"})
/*    */ public abstract class d extends d {
/* 10 */   public d(float w, float h, String title) { super(0.0F, 0.0F, w, h); this.b = title;
/*    */     
/* 12 */     this.d = true;
/*    */     
/* 14 */     Intrinsics.checkNotNullExpressionValue(eu.shoroa.bridge.b.a.a.a(d::a, d::b), ""); this.c = eu.shoroa.bridge.b.a.a.a(d::a, d::b);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     Intrinsics.checkNotNull(getBridge().e()); setX(getBridge().e().width() / 2.0F - w / 2.0F);
/* 25 */     Intrinsics.checkNotNull(getBridge().e()); setY(getBridge().e().height() / 2.0F - h / 2.0F); }
/*    */   @NotNull @JvmName(name = "d") public final String d() { return this.b; }
/*    */   @NotNull public Object clone() { return super.clone(); }
/*    */   @NotNull @JvmName(name = "e") public final eu.shoroa.bridge.b.a.a e() { return this.c; }
/* 29 */   @JvmName(name = "f") public final boolean f() { return this.d; } @JvmName(name = "a") public final void a(boolean <set-?>) { this.d = <set-?>; } private static final Float a() { return Float.valueOf(200.0F); } public void render(float mx, float my, float delta) { this.c.a(this.d);
/* 30 */     float headerHeight = 40.0F;
/*    */     
/* 32 */     eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, this, 8.0F, eu.shoroa.bridge.b.b.d.a.a(eu.shoroa.bridge.d.e.a.a.k().b()), 0.0F, 8, null);
/* 33 */     eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, minus(1.0F), 8.0F, eu.shoroa.bridge.b.b.d.a.a(eu.shoroa.bridge.d.e.a.a.a(eu.shoroa.bridge.d.e.a.a.k().b(), 0.8F)), 0.0F, 8, null);
/* 34 */     eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, getX(), getY(), getW(), headerHeight, 8.0F, 8.0F, 0.0F, 0.0F, eu.shoroa.bridge.b.b.d.a.a(eu.shoroa.bridge.d.e.a.a.a(eu.shoroa.bridge.d.e.a.a.k().c(), 0.4F)), 0.0F, 512, null);
/* 35 */     eu.shoroa.bridge.b.d.b(eu.shoroa.bridge.b.d.a, this.b, getX() + getW() / 2.0F, getY() + headerHeight / 2.0F + true, "semibold", 20.0F, eu.shoroa.bridge.d.e.a.a.k().e(), eu.shoroa.bridge.b.d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */     
/* 37 */     eu.shoroa.bridge.b.d.a(eu.shoroa.bridge.b.d.a, this, 8.0F, eu.shoroa.bridge.b.b.d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()).a(2.0F), 0.0F, 8, null);
/*    */     
/* 39 */     Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
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
/* 54 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Widget$render$1 = 0; it.render(mx, my, delta); }  }
/*    */   private static final b b() { return b.BACK_IN_OUT; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\f\020\rJ\025\020\005\032\0020\0042\006\020\003\032\0020\002¢\006\004\b\005\020\006R*\020\005\032\022\022\004\022\0020\0020\007j\b\022\004\022\0020\002`\b8\007X\004¢\006\f\n\004\b\t\020\n\032\004\b\005\020\013"}, d2 = {"Leu/shoroa/bridge/ui/b/a/d$a;", "", "Leu/shoroa/bridge/ui/b/a/d;", "p0", "", "a", "(Leu/shoroa/bridge/ui/b/a/d;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/a;", "e", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "<init>", "()V"}) public static final class a {
/* 56 */     private a() {} @NotNull @JvmName(name = "a") public final ArrayList<d> a() { return d.g(); } public final void a(d widget) { Intrinsics.checkNotNullParameter(widget, ""); a().add(widget); } } @NotNull public static final a a = new a(null); @NotNull private final String b; @NotNull private final eu.shoroa.bridge.b.a.a c; private boolean d; @NotNull private static final ArrayList<d> e = new ArrayList<>(); public void click(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Widget$click$1 = 0; it.click(mx, my, button); }
/*    */      if (!d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null))
/* 58 */       this.d = false;  } public void release(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Widget$release$1 = 0; it.release(mx, my, button); }
/*    */      } public void onKey(int code, char char) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/* 60 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Widget$onKey$1 = 0;
/*    */       it.onKey(code, char); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\a\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */