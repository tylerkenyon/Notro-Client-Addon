/*     */ package eu.shoroa.bridge.d.e;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.lwjgl.nanovg.NVGColor;
/*     */ 
/*     */ public final class a {
/*   9 */   private a(String name, Color darkest, Color dark, Color light, Color lightest, Color accent, b type) { this.b = name;
/*  10 */     this.c = darkest;
/*  11 */     this.d = dark;
/*  12 */     this.e = light;
/*  13 */     this.f = lightest;
/*  14 */     this.g = accent;
/*  15 */     this.h = type; } @NotNull public final String a() { return this.b; } @NotNull public final Color b() { return this.c; } @NotNull public final Color c() { return this.d; } @NotNull public final b g() { return this.h; }
/*     */   @NotNull public final Color d() { return this.e; } @NotNull public final Color e() { return this.f; } @NotNull public final Color f() { return this.g; } public static final class a
/*     */   {
/*     */     private a() {} @NotNull
/*  19 */     public final NVGColor a(Color $this$toNVGColor) { Intrinsics.checkNotNullParameter($this$toNVGColor, ""); NVGColor nVGColor1 = NVGColor.calloc(), it = nVGColor1; int $i$a$-also-Colors$Companion$toNVGColor$1 = 0;
/*  20 */       it.r($this$toNVGColor.getRed() / 255.0F);
/*  21 */       it.g($this$toNVGColor.getGreen() / 255.0F);
/*  22 */       it.b($this$toNVGColor.getBlue() / 255.0F);
/*  23 */       it.a($this$toNVGColor.getAlpha() / 255.0F);
/*     */       Intrinsics.checkNotNullExpressionValue(nVGColor1, "");
/*     */       return nVGColor1; }
/*     */      @NotNull
/*     */     public final a a() {
/*  28 */       return new a(
/*  29 */           "dark", 
/*  30 */           new Color(1973790), 
/*  31 */           new Color(3026478), 
/*  32 */           new Color(4079166), 
/*  33 */           new Color(10921638), 
/*  34 */           new Color(15948892), 
/*  35 */           a.b.DARK, null);
/*     */     } @NotNull
/*     */     public final a b() {
/*  38 */       return new a(
/*  39 */           "oneDark", 
/*  40 */           new Color(2632756), 
/*  41 */           new Color(3488581), 
/*  42 */           new Color(4936291), 
/*  43 */           new Color(11252415), 
/*  44 */           new Color(6402031), 
/*  45 */           a.b.DARK, null);
/*     */     } @NotNull
/*     */     public final a c() {
/*  48 */       return new a(
/*  49 */           "dracula", 
/*  50 */           new Color(2632246), 
/*  51 */           new Color(3422022), 
/*  52 */           new Color(4474714), 
/*  53 */           new Color(16316658), 
/*  54 */           new Color(12424185), 
/*  55 */           a.b.DARK, null);
/*     */     } @NotNull
/*     */     public final a d() {
/*  58 */       return new a(
/*  59 */           "nord", 
/*  60 */           new Color(3028032), 
/*  61 */           new Color(3883602), 
/*  62 */           new Color(4410462), 
/*  63 */           new Color(14212841), 
/*  64 */           new Color(8962256), 
/*  65 */           a.b.DARK, null);
/*     */     } @NotNull
/*     */     public final a e() {
/*  68 */       return new a(
/*  69 */           "gruvboxDark", 
/*  70 */           new Color(2631720), 
/*  71 */           new Color(3946550), 
/*  72 */           new Color(5261637), 
/*  73 */           new Color(15457202), 
/*  74 */           new Color(16432431), 
/*  75 */           a.b.DARK, null);
/*     */     }
/*     */     @NotNull
/*     */     public final a f() {
/*  79 */       return new a(
/*  80 */           "light", 
/*  81 */           new Color(15790320), 
/*  82 */           new Color(14737632), 
/*  83 */           new Color(11184810), 
/*  84 */           new Color(5000268), 
/*  85 */           new Color(15948892), 
/*  86 */           a.b.LIGHT, null);
/*     */     } @NotNull
/*     */     public final a g() {
/*  89 */       return new a(
/*  90 */           "genericLight", 
/*  91 */           new Color(16777215), 
/*  92 */           new Color(14737632), 
/*  93 */           new Color(12434877), 
/*  94 */           new Color(7697781), 
/*  95 */           new Color(4149685), 
/*  96 */           a.b.LIGHT, null);
/*     */     } @NotNull
/*     */     public final a h() {
/*  99 */       return new a(
/* 100 */           "solarizedLight", 
/* 101 */           new Color(16643811), 
/* 102 */           new Color(15657173), 
/* 103 */           new Color(9675169), 
/* 104 */           new Color(6650755), 
/* 105 */           new Color(2526162), 
/* 106 */           a.b.LIGHT, null);
/*     */     } @NotNull
/*     */     public final a i() {
/* 109 */       return new a(
/* 110 */           "gruvboxLight", 
/* 111 */           new Color(16511431), 
/* 112 */           new Color(15457202), 
/* 113 */           new Color(14009505), 
/* 114 */           new Color(6708308), 
/* 115 */           new Color(14129441), 
/* 116 */           a.b.LIGHT, null);
/*     */     } @NotNull
/*     */     public final a j() {
/* 119 */       return new a(
/* 120 */           "paperLight", 
/* 121 */           new Color(16777215), 
/* 122 */           new Color(16119285), 
/* 123 */           new Color(14737632), 
/* 124 */           new Color(6381921), 
/* 125 */           new Color(4083384), 
/* 126 */           a.b.LIGHT, null);
/*     */     }
/*     */     
/*     */     @NotNull
/* 130 */     public final a k() { return a.h(); } public final void a(a <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); a.a(<set-?>); }
/*     */     
/*     */     @NotNull
/*     */     public final Color a(Color color, float float) {
/* 134 */       Intrinsics.checkNotNullParameter(color, ""); return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.min(Math.max(0, (int)(color.getAlpha() * float)), 255));
/*     */     } @NotNull
/*     */     public final Color b(Color $this$withAlpha, float alpha) {
/* 137 */       Intrinsics.checkNotNullParameter($this$withAlpha, ""); return new Color($this$withAlpha.getRed(), $this$withAlpha.getGreen(), $this$withAlpha.getBlue(), RangesKt.coerceIn((int)(alpha * 'ÿ'), 0, 255));
/*     */     }
/*     */     @NotNull
/*     */     public final Color a(Color $this$mix, Color other, float t) {
/* 141 */       Intrinsics.checkNotNullParameter($this$mix, ""); Intrinsics.checkNotNullParameter(other, ""); float clampedT = RangesKt.coerceIn(t, 0.0F, 1.0F);
/* 142 */       int r = (int)($this$mix.getRed() + (other.getRed() - $this$mix.getRed()) * clampedT);
/* 143 */       int g = (int)($this$mix.getGreen() + (other.getGreen() - $this$mix.getGreen()) * clampedT);
/* 144 */       int b = (int)($this$mix.getBlue() + (other.getBlue() - $this$mix.getBlue()) * clampedT);
/* 145 */       int i = (int)($this$mix.getAlpha() + (other.getAlpha() - $this$mix.getAlpha()) * clampedT);
/* 146 */       return new Color(r, g, b, i);
/*     */     }
/*     */     
/*     */     @NotNull
/* 150 */     public final List<a> l() { return a.i(); } } @NotNull public static final a a = new a(null); @NotNull private final String b; @NotNull private final Color c; @NotNull private final Color d; @NotNull private final Color e; @NotNull private final Color f; @NotNull private final Color g; @NotNull private final b h; @NotNull private static a i = a.a(); @NotNull
/* 151 */   private static final List<a> j; static { a[] arrayOfA = new a[10]; arrayOfA[0] = a.a(); arrayOfA[1] = 
/* 152 */       a.b();
/* 153 */     arrayOfA[2] = a.c();
/* 154 */     arrayOfA[3] = a.d();
/* 155 */     arrayOfA[4] = a.e();
/* 156 */     arrayOfA[5] = a.f();
/* 157 */     arrayOfA[6] = a.g();
/* 158 */     arrayOfA[7] = a.h();
/* 159 */     arrayOfA[8] = a.i();
/* 160 */     arrayOfA[9] = a.j();
/*     */     j = CollectionsKt.listOf((Object[])arrayOfA); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005"}, d2 = {"Leu/shoroa/bridge/d/e/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "DARK", "LIGHT"})
/* 165 */   public enum b { DARK, LIGHT;
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<b> a() {
/*     */       return b;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\e\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */