/*     */ package eu.shoroa.bridge.ui.c;
/*     */ 
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.feature.a.a.d;
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import eu.shoroa.bridge.ui.c.a.c;
/*     */ import java.awt.Color;
/*     */ import java.awt.Desktop;
/*     */ import java.net.URI;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nScreenMainMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenMainMenu.kt\neu/shoroa/bridge/ui/mainmenu/ScreenMainMenu\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1855#2,2:94\n1855#2,2:96\n1855#2,2:98\n1855#2,2:100\n*S KotlinDebug\n*F\n+ 1 ScreenMainMenu.kt\neu/shoroa/bridge/ui/mainmenu/ScreenMainMenu\n*L\n75#1:94,2\n79#1:96,2\n83#1:98,2\n87#1:100,2\n*E\n"})
/*     */ public final class b extends Screen {
/*     */   @NotNull
/*     */   private final List<d> a;
/*     */   
/*  23 */   public b() { this.a = new ArrayList<>();
/*  24 */     Intrinsics.checkNotNull(eu.shoroa.bridge.feature.a.b.a.d()); this.b = eu.shoroa.bridge.feature.a.b.a.d();
/*  25 */     Intrinsics.checkNotNull(eu.shoroa.bridge.feature.a.b.a.e()); this.c = eu.shoroa.bridge.feature.a.b.a.e(); } @NotNull
/*     */   private final d b; @NotNull
/*  27 */   private final a c; public void init() { this.a.clear();
/*  28 */     float panelH = Math.min(280.0F, this.c.height() * 0.6F);
/*  29 */     float panelW = Math.min(380.0F, this.c.width() * 0.6F);
/*     */ 
/*     */ 
/*     */     
/*  33 */     d[] arrayOfD = new d[3]; arrayOfD[0] = new a(
/*  34 */         this.c.width() / 2.0F - panelW / 2.0F, this.c.height() / 1.7F - panelH / 2.0F, panelW, panelH);
/*     */     
/*  36 */     arrayOfD[1] = (d)(new b(
/*  37 */         "", this.c.width() - 60.0F, 10.0F, 50.0F))
/*  38 */       .a(new Function0<Unit>(this) { public final void a() { b.a(this.a).shutdown(); }
/*     */            }
/*     */       );
/*     */     
/*  42 */     arrayOfD[2] = (d)c.a(c.a(new c(this.c.width() - 216.0F, 10.0F, 50.0F), "", null, new Function0<Unit>(this) { public final void a() { b.a(this.a).guiMods(); }
/*  43 */           },  2, null), "", null, null.a, 2, null)
/*  44 */       .a(
/*  45 */         "", e.BRAND, null.a);
/*     */     CollectionsKt.addAll(this.a, (Object[])arrayOfD); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(float mx, float my, float delta)
/*     */   {
/*  52 */     float nativeImgW = 1920.0F;
/*  53 */     float nativeImgH = 1165.0F;
/*     */     
/*  55 */     float rationH = this.c.height() / nativeImgH;
/*  56 */     float rationW = this.c.width() / nativeImgW;
/*     */     
/*  58 */     float ratio = (rationH < rationW) ? rationW : rationH;
/*     */     
/*  60 */     float imgW = nativeImgW * ratio;
/*  61 */     float imgH = nativeImgH * ratio;
/*     */     
/*  63 */     float imgX = (this.c.width() - imgW) / 2;
/*  64 */     float imgY = (this.c.height() - imgH) / 2;
/*  65 */     d.a.a("bg1-blur-c", imgX, imgY, imgW, imgH, 0.0F, 1.0F);
/*     */     
/*  67 */     Intrinsics.checkNotNullExpressionValue(Color.LIGHT_GRAY, ""); d.b(d.a, "Minecraft " + this.b.version()[1] + " | Notro Client", 7.0F, this.c.height() - 7.0F, "medium", 13.0F, Color.LIGHT_GRAY, d.a.LEFT_BOTTOM, 0.0F, 0.0F, 384, null);
/*  68 */     Intrinsics.checkNotNullExpressionValue(Color.LIGHT_GRAY, ""); d.b(d.a, "Not affiliated with Mojang", this.c.width() - 7.0F, this.c.height() - 7.0F, "medium", 13.0F, Color.LIGHT_GRAY, d.a.RIGHT_BOTTOM, 0.0F, 0.0F, 384, null);
/*     */     
/*  70 */     float panelH = Math.min(280.0F, this.c.height() * 0.6F);
/*  71 */     float fromTop = this.c.height() / 1.7F - panelH / 2.0F;
/*  72 */     float logoSize = Math.min(200.0F, fromTop / 2.0F);
/*  73 */     d.a.a("logo", this.c.width() / 2.0F - logoSize / 2.0F, fromTop / 2.0F - logoSize / 2.0F, logoSize, logoSize, 0.0F, 1.0F);
/*     */     
/*  75 */     Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-ScreenMainMenu$render$1 = 0; it.render(mx, my, delta); }
/*     */      } public void click(float mx, float my, int button) { Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/*  96 */     Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-ScreenMainMenu$click$1 = 0; it.click(mx, my, button); }
/*     */      } public void release(float mx, float my, int button) { Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/*  98 */     Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-ScreenMainMenu$release$1 = 0; it.release(mx, my, button); }
/*     */      } public void onKey(int code, char char) { Iterable<d> $this$forEach$iv = this.a; int $i$f$forEach = 0;
/* 100 */     Iterator<d> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-ScreenMainMenu$onKey$1 = 0;
/*     */       it.onKey(code, char); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void exit() {}
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\c\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */