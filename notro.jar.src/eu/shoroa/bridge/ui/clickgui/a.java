/*     */ package eu.shoroa.bridge.ui.clickgui;
/*     */ 
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import eu.shoroa.bridge.ui.b.f;
/*     */ import eu.shoroa.bridge.ui.clickgui.comp.b;
/*     */ import eu.shoroa.bridge.ui.clickgui.comp.d;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Panel.kt\neu/shoroa/bridge/ui/clickgui/Panel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1855#2,2:144\n1855#2,2:146\n1855#2,2:148\n1855#2,2:150\n*S KotlinDebug\n*F\n+ 1 Panel.kt\neu/shoroa/bridge/ui/clickgui/Panel\n*L\n81#1:144,2\n124#1:146,2\n130#1:148,2\n137#1:150,2\n*E\n"})
/*     */ public final class a extends d {
/*     */   @NotNull
/*     */   private final ArrayList<d> a;
/*     */   
/*  23 */   public a(float x, float y, float w, float h) { super(x, y, w, h);
/*  24 */     this.a = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  32 */     b[] arrayOfB = new b[6]; arrayOfB[0] = (b)new a(x + 225.0F, y, w - 'á', h);
/*  33 */     BridgeClient.a.b(); Intrinsics.checkNotNull((BridgeClient.a.b() != null) ? BridgeClient.a.b().getWebSocket() : null); arrayOfB[1] = (b)new a(x + 225.0F, y, w - 'á', h, (BridgeClient.a.b() != null) ? BridgeClient.a.b().getWebSocket() : null);
/*  34 */     arrayOfB[2] = (b)new c("OTHER", 0.0F, 0.0F, 0.0F, 0.0F, 30, null);
/*  35 */     arrayOfB[3] = (b)new b(x + 225.0F, y, w - 'á', h);
/*  36 */     arrayOfB[4] = (b)new a(x + 225.0F, y, w - 'á', h);
/*  37 */     arrayOfB[5] = (b)new c(x + 'á', y, w - 'á', h);
/*     */     
/*  39 */     this.b = new d(SetsKt.setOf((Object[])arrayOfB), x + 10.0F, 
/*  40 */         y + 110.0F, 
/*  41 */         205.0F, 
/*  42 */         h - 100.0F);
/*     */ 
/*     */ 
/*     */     
/*  46 */     this.c = f.a.a("Search", x + 10.0F, y + 70.0F, 205.0F, 30.0F)
/*  47 */       .c("Search…")
/*  48 */       .b(new Function1<f, Unit>(this) { public final void a(f it) {
/*  49 */             Intrinsics.checkNotNullParameter(it, ""); String query = StringsKt.trim(it.a()).toString();
/*  50 */             b page = this.a.a().b(); int $i$a$-let-Panel$1$1 = 0;
/*     */             try {
/*  52 */               page.c(query);
/*  53 */             } catch (Exception exception) {}
/*     */ 
/*     */             
/*     */             this.a.a().b();
/*     */           } }
/*  58 */       ).a(new Function1<f, Unit>(this) { public final void a(f it) {
/*  59 */             Intrinsics.checkNotNullParameter(it, ""); String query = StringsKt.trim(it.a()).toString();
/*  60 */             b page = this.a.a().b(); int $i$a$-let-Panel$2$1 = 0;
/*     */             try {
/*  62 */               page.c(query);
/*  63 */             } catch (Exception exception) {}
/*     */             
/*     */             this.a.a().b();
/*     */           } }
/*     */       );
/*     */     
/*  69 */     this.a.add(this.c);
/*  70 */     this.a.add(this.b);
/*  71 */     this.a.add(
/*  72 */         e.a.a("Edit HUD", x + 10.0F, y + h - 50.0F, 210.0F, 40.0F)
/*  73 */         .b(null.a)
/*  74 */         .c("edithud")); }
/*     */   @NotNull private final d b;
/*     */   @NotNull
/*     */   private final f c; @NotNull
/*     */   public Object clone() { return super.clone(); } @NotNull
/*  79 */   public final d a() { return this.b; } public void render(float mx, float my, float delta) { d.a(d.a, this, 32.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().b()), 0.0F, 8, null);
/*  80 */     d.a(d.a, this, 32.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()).a(1.5F), 0.0F, 8, null);
/*  81 */     Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Panel$render$1 = 0; it.render(mx, my, delta); }
/*     */      d.a(d.a, getX() + 'á', getY() + 60, getW() - 'á', 1.0F, 0.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()), 0.0F, 64, null); d.a(d.a, getX() + 'á', getY(), 1.5F, getH(), 0.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()), 0.0F, 64, null); float imgw = 50.0F; float imgh = 50.0F; float imageX = getX() + 20.0F; float imageY = getY() + 20.0F; float textX = imageX + imgw + 8.0F; float textY = getY() + 42.0F; d.a.a((eu.shoroa.bridge.d.e.a.a.k().g() == eu.shoroa.bridge.d.e.a.b.DARK) ? "logo" : "icon_small-dark", imageX, imageY - 3.0F, imgw, imgh, 0.0F, 1.0F); d.b(d.a, "RELEASE 1.0.0", textX, textY - 10.0F, "regular", 18.0F, eu.shoroa.bridge.d.e.a.a.k().d(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null); d.b(d.a, "Notro Client", textX, textY + 12.0F, "semibold", 18.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null); } public void click(float mx, float my, int button) { Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/* 146 */     Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Panel$click$1 = 0; if (!(it instanceof c))
/*     */         it.click(mx, my, button);  }
/* 148 */      } public void release(float mx, float my, int button) { Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0; Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Panel$release$1 = 0; if (!(it instanceof c))
/*     */         it.release(mx, my, button);  }
/* 150 */      } public void onKey(int code, char char) { super.onKey(code, char); Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0; Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-Panel$onKey$1 = 0;
/*     */       if (!(it instanceof c))
/*     */         it.onKey(code, char);  }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */