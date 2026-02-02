/*     */ package eu.shoroa.bridge.b.d;
/*     */ import java.awt.Color;
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public final class a {
/*     */   @NotNull
/*  11 */   public static final a a = new a(); @NotNull private static final HashMap<String, Integer> d = new HashMap<>(); @NotNull public final HashMap<String, Integer> a() { return d; } @NotNull
/*  12 */   private static final HashMap<String, eu.shoroa.bridge.b.a> e = new HashMap<>(); public static final int b = 0; @NotNull public final HashMap<String, eu.shoroa.bridge.b.a> b() { return e; }
/*     */    public static final int c = 1;
/*     */   @NotNull
/*     */   public final NVGColor a(Color color) {
/*  16 */     Intrinsics.checkNotNullParameter(color, ""); Intrinsics.checkNotNullExpressionValue(NVGColor.calloc().r(color.getRed() / 255.0F).g(color.getGreen() / 255.0F).b(color.getBlue() / 255.0F).a(color.getAlpha() / 255.0F), ""); return NVGColor.calloc().r(color.getRed() / 255.0F).g(color.getGreen() / 255.0F).b(color.getBlue() / 255.0F).a(color.getAlpha() / 255.0F);
/*     */   }
/*     */   @NotNull
/*     */   public final int[] a(int color) {
/*  20 */     int[] rgba = new int[4];
/*  21 */     rgba[0] = color >> 24 & 0xFF;
/*  22 */     rgba[1] = color >> 16 & 0xFF;
/*  23 */     rgba[2] = color >> 8 & 0xFF;
/*  24 */     rgba[3] = color & 0xFF;
/*  25 */     return rgba;
/*     */   }
/*     */   
/*     */   public final void a(Function0 r, int mode) {
/*  29 */     Intrinsics.checkNotNullParameter(r, ""); int $i$f$path = 0; b.INSTANCE.i();
/*  30 */     r.invoke();
/*  31 */     if (mode == 0) b.INSTANCE.l(); 
/*  32 */     if (mode == 1) b.INSTANCE.k(); 
/*  33 */     b.INSTANCE.j();
/*     */   }
/*     */   
/*     */   public final void a(float x, float y, Function0 r, int mode) {
/*  37 */     Intrinsics.checkNotNullParameter(r, ""); int $i$f$path = 0; b.INSTANCE.i();
/*  38 */     b.INSTANCE.c(x, y);
/*  39 */     r.invoke();
/*  40 */     if (mode == 0) b.INSTANCE.l(); 
/*  41 */     if (mode == 1) b.INSTANCE.k(); 
/*  42 */     b.INSTANCE.j();
/*     */   }
/*     */   
/*     */   public final void a(String fontName, String fileName) {
/*  46 */     Intrinsics.checkNotNullParameter(fileName, ""); System.out.print("   UI: Loading font [" + fontName + "] from [" + fileName + "]: ");
/*     */     try {
/*  48 */       ByteBuffer data = eu.shoroa.bridge.d.a.a.a().a("/fonts/" + fileName, 1024);
/*  49 */       b.a(data);
/*  50 */       b.INSTANCE.a(fontName, data, 0);
/*  51 */       System.out.print("OK\n");
/*  52 */     } catch (IOException e) {
/*  53 */       System.out.print("FAIL\n");
/*  54 */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void a(String imgName, String fileName, int flags) {
/*  59 */     Intrinsics.checkNotNullParameter(imgName, ""); Intrinsics.checkNotNullParameter(fileName, ""); System.out.print("   UI: Loading image [" + imgName + "] from [" + fileName + "]: ");
/*     */     try {
/*  61 */       ByteBuffer data = eu.shoroa.bridge.d.a.a.a().a("/images/" + fileName, 1024);
/*  62 */       b.a(data);
/*  63 */       int img = b.INSTANCE.a(flags, data); Integer integer = Integer.valueOf(img);
/*  64 */       d.put(imgName, integer);
/*  65 */       System.out.print("OK\n");
/*  66 */     } catch (IOException e) {
/*  67 */       System.out.print("FAIL\n");
/*  68 */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   public final void b(String imgName, String fileName, int flags) {
/*  72 */     Intrinsics.checkNotNullParameter(imgName, ""); Intrinsics.checkNotNullParameter(fileName, ""); System.out.print("   UI: Loading image [" + imgName + "] from [" + fileName + "]: ");
/*     */     try {
/*  74 */       ByteBuffer data = eu.shoroa.bridge.d.a.a.a().a("/images/mods/" + fileName, 1024);
/*  75 */       b.a(data);
/*  76 */       int img = b.INSTANCE.a(flags, data); Integer integer = Integer.valueOf(img);
/*  77 */       d.put(imgName, integer);
/*  78 */       System.out.print("OK\n");
/*  79 */     } catch (IOException e) {
/*  80 */       System.out.print("FAIL\n");
/*  81 */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   public final void c(String imgName, String fileName, int flags) {
/*  85 */     Intrinsics.checkNotNullParameter(imgName, ""); Intrinsics.checkNotNullParameter(fileName, ""); System.out.print("   UI: Loading image [" + imgName + "] from [" + fileName + "]: ");
/*     */     try {
/*  87 */       ByteBuffer data = eu.shoroa.bridge.d.a.a.a().a("/images/icons/" + fileName, 1024);
/*  88 */       b.a(data);
/*  89 */       int img = b.INSTANCE.a(flags, data); Integer integer = Integer.valueOf(img);
/*  90 */       d.put(imgName, integer);
/*  91 */       System.out.print("OK\n");
/*  92 */     } catch (IOException e) {
/*  93 */       System.out.print("FAIL\n");
/*  94 */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   public final void d(String imgName, String fileName, int flags) {
/*  98 */     Intrinsics.checkNotNullParameter(imgName, ""); Intrinsics.checkNotNullParameter(fileName, ""); System.out.print("   UI: Loading image [" + imgName + "] from [" + fileName + "]: ");
/*     */     try {
/* 100 */       ByteBuffer data = eu.shoroa.bridge.d.a.a.a().a("/images/previews/" + fileName, 1024);
/* 101 */       b.a(data);
/* 102 */       int img = b.INSTANCE.a(flags, data); Integer integer = Integer.valueOf(img);
/* 103 */       d.put(imgName, integer);
/* 104 */       System.out.print("OK\n");
/* 105 */     } catch (IOException e) {
/* 106 */       System.out.print("FAIL\n");
/* 107 */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void b(String imgName, String fileName) {
/* 112 */     Intrinsics.checkNotNullParameter(imgName, ""); Intrinsics.checkNotNullParameter(fileName, ""); System.out.print("   UI: Loading gif [" + imgName + "] from [" + fileName + "]: ");
/*     */     try {
/* 114 */       ByteBuffer data = eu.shoroa.bridge.d.a.a.a().a("/gif/" + fileName, 8192);
/* 115 */       Intrinsics.checkNotNull(data); eu.shoroa.bridge.b.a gif = new eu.shoroa.bridge.b.a(data);
/* 116 */       a.e.put(imgName, gif);
/* 117 */       System.out.print("OK\n");
/* 118 */     } catch (IOException e) {
/* 119 */       System.out.print("FAIL\n");
/* 120 */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void a(float scale, float centerX, float centerY, Function0 r) {
/* 125 */     Intrinsics.checkNotNullParameter(r, ""); b.INSTANCE.e();
/* 126 */     b.INSTANCE.a(centerX, centerY);
/* 127 */     b.INSTANCE.b(scale, scale);
/* 128 */     b.INSTANCE.a(-centerX, -centerY);
/* 129 */     r.invoke();
/* 130 */     b.INSTANCE.f();
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\d\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */