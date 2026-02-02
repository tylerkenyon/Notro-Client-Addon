/*     */ package eu.shoroa.bridge.b;
/*     */ 
/*     */ import eu.shoroa.bridge.b.b.b;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d.a;
/*     */ import eu.shoroa.bridge.b.d.b;
/*     */ import eu.shoroa.bridge.d.e.a;
/*     */ import java.awt.Color;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.lwjgl.nanovg.NVGColor;
/*     */ import org.lwjgl.nanovg.NVGPaint;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UI.kt\neu/shoroa/bridge/render/UI$ColorPicker\n+ 2 NVGHelper.kt\neu/shoroa/bridge/render/util/NVGHelper\n*L\n1#1,792:1\n29#2,6:793\n29#2,6:799\n29#2,6:805\n29#2,6:811\n*S KotlinDebug\n*F\n+ 1 UI.kt\neu/shoroa/bridge/render/UI$ColorPicker\n*L\n604#1:793,6\n609#1:799,6\n647#1:805,6\n680#1:811,6\n*E\n"})
/*     */ public final class b
/*     */ {
/*     */   @NotNull
/*     */   public static final b a = new b();
/*     */   
/*     */   public final void a(float x, float y, float width, float height, float radius, Color color) {
/*     */     Intrinsics.checkNotNullParameter(color, "");
/*     */     float ps = width / 2.0F;
/*     */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, "");
/*     */     d.a(d.a, x, y, width, height, radius, d.a.a(Color.WHITE), 0.0F, 64, (Object)null);
/*     */     int i = 1, j = (int)(height / ps) - 2;
/*     */     if (i <= j)
/*     */       while (true) {
/*     */         float left = ps * (i % 2);
/*     */         d.a(d.a, x + ps - left, y + i * ps, ps, ps, 0.0F, d.a.a(new Color(13421772)), 0.0F, 64, (Object)null);
/*     */         if (i != j) {
/*     */           i++;
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       }  
/*     */     d.a(d.a, x, y + height - ps, ps, ps, 0.0F, 0.0F, 0.0F, radius, d.a.a(new Color(13421772)), 0.0F, 512, (Object)null);
/*     */     d.a(d.a, x, y, width, height, radius, d.a.a(color, a.a.a(color, 0.0F), b.a.a()), 0.0F, 64, (Object)null);
/*     */     d.a(d.a, x - 2.0F, y - 2.0F, width + 4.0F, height + 4.0F, radius + 1.0F, d.a.a(a.a.k().c()).a(3.0F), 0.0F, 64, (Object)null);
/*     */   }
/*     */   
/*     */   public final void a(float x, float y, float width, float height, float hue) {
/* 595 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); NVGColor white = a.a.a(Color.WHITE);
/* 596 */     Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); NVGColor black = a.a.a(Color.BLACK);
/* 597 */     NVGPaint paint1 = NVGPaint.calloc();
/* 598 */     NVGPaint paint2 = NVGPaint.calloc();
/*     */     
/* 600 */     b $this$boxStrBrh_u24lambda_u242 = b.INSTANCE; int $i$a$-with-UI$ColorPicker$boxStrBrh$1 = 0;
/* 601 */     Intrinsics.checkNotNullExpressionValue(Color.getHSBColor(hue, 1.0F, 1.0F), ""); $this$boxStrBrh_u24lambda_u242.a(x, y, x + width, y, white, a.a.a(Color.getHSBColor(hue, 1.0F, 1.0F)), paint1);
/* 602 */     $this$boxStrBrh_u24lambda_u242.a(x, y + height * 1.3F, x, y, black, a.a.a(new Color(255, 255, 255, 0)), paint2);
/*     */     
/* 604 */     a a1 = a.a;
/*     */ 
/*     */ 
/*     */     
/* 608 */     int mode$iv = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$path = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 793 */     b.INSTANCE.i();
/* 794 */     int $i$a$-path-UI$ColorPicker$boxStrBrh$1$1 = 0; $this$boxStrBrh_u24lambda_u242.b(x, y, width, height, 10.0F); $this$boxStrBrh_u24lambda_u242.b(paint1);
/*     */     $this$boxStrBrh_u24lambda_u242.k();
/* 796 */     b.INSTANCE.k();
/* 797 */     b.INSTANCE.j(); a this_$iv = a.a; mode$iv = 1;
/*     */     $i$f$path = 0;
/* 799 */     b.INSTANCE.i();
/* 800 */     int $i$a$-path-UI$ColorPicker$boxStrBrh$1$2 = 0; $this$boxStrBrh_u24lambda_u242.b(x, y, width, height, 10.0F); $this$boxStrBrh_u24lambda_u242.b(paint2);
/*     */     $this$boxStrBrh_u24lambda_u242.k();
/* 802 */     b.INSTANCE.k();
/* 803 */     b.INSTANCE.j(); paint1.free(); paint2.free(); white.free(); black.free(); } public final void a(float x, float y, float width, float height, float radius, Color... colors) { Intrinsics.checkNotNullParameter(colors, ""); if (colors.length >= 2) {
/*     */       float ccx = 0.0F; float stopSize = height / (colors.length - 1); for (int i = 0, j = colors.length - 1; i < j; i++) {
/* 805 */         Intrinsics.checkNotNull(colors[i]); NVGColor from = a.a.a(colors[i]); Intrinsics.checkNotNull(colors[i + 1]); NVGColor to = a.a.a(colors[i + 1]); NVGPaint paint = NVGPaint.calloc(); b.INSTANCE.a(x, y + stopSize * i, x, y + stopSize * (i + 1), from, to, paint); int finalI = (i > 0) ? 1 : 0; float leftRadius = (i == 0) ? radius : 0.0F; float rightRadius = (i == colors.length - 2) ? radius : 0.0F; a a = a.a; int mode$iv = 1; int $i$f$path = 0; b.INSTANCE.i();
/* 806 */         int $i$a$-path-UI$ColorPicker$mulitGradVertical$1 = 0; b.INSTANCE.a(x, y + ccx - finalI, width, stopSize + finalI, leftRadius, leftRadius, rightRadius, rightRadius);
/*     */         b.INSTANCE.b(paint);
/* 808 */         b.INSTANCE.k();
/* 809 */         b.INSTANCE.j(); ccx += stopSize; paint.free(); from.free(); to.free();
/*     */       } 
/* 811 */     }  } public final void b(float x, float y, float width, float height, float radius, Color... colors) { Intrinsics.checkNotNullParameter(colors, ""); if (colors.length >= 2) { float ccx = 0.0F; float stopSize = width / (colors.length - 1); for (int i = 0, j = colors.length - 1; i < j; i++) { Intrinsics.checkNotNull(colors[i]); NVGColor from = a.a.a(colors[i]); Intrinsics.checkNotNull(colors[i + 1]); NVGColor to = a.a.a(colors[i + 1]); NVGPaint paint = NVGPaint.calloc(); b.INSTANCE.a(x + stopSize * i, y, x + stopSize * (i + 1), y, from, to, paint); int finalI = (i > 0) ? 1 : 0; float leftRadius = (i == 0) ? radius : 0.0F; float rightRadius = (i == colors.length - 2) ? radius : 0.0F; a a = a.a; int mode$iv = 1; int $i$f$path = 0; b.INSTANCE.i();
/* 812 */         int $i$a$-path-UI$ColorPicker$mulitGradHorizontal$1 = 0; b.INSTANCE.a(x + ccx - finalI, y, stopSize + finalI, height, leftRadius, rightRadius, rightRadius, leftRadius);
/*     */         b.INSTANCE.b(paint);
/* 814 */         b.INSTANCE.k();
/* 815 */         b.INSTANCE.j();
/*     */         ccx += stopSize;
/*     */         paint.free();
/*     */         from.free();
/*     */         to.free(); }
/*     */        }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\d$b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */