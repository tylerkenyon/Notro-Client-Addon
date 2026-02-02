/*     */ package eu.shoroa.bridge.b;
/*     */ 
/*     */ import eu.shoroa.bridge.b.b.b;
/*     */ import eu.shoroa.bridge.b.b.c;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.c.a;
/*     */ import eu.shoroa.bridge.b.c.b;
/*     */ import eu.shoroa.bridge.b.d.a;
/*     */ import eu.shoroa.bridge.b.d.b;
/*     */ import java.awt.Color;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.lwjgl.nanovg.NVGColor;
/*     */ import org.lwjgl.nanovg.NVGPaint;
/*     */ import org.lwjgl.nanovg.NanoVG;
/*     */ import org.lwjgl.nanovg.NanoVGGL2;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UI.kt\neu/shoroa/bridge/render/UI\n+ 2 NVGHelper.kt\neu/shoroa/bridge/render/util/NVGHelper\n*L\n1#1,792:1\n29#2,6:793\n29#2,6:799\n29#2,6:805\n29#2,6:811\n29#2,6:817\n29#2,6:823\n29#2,6:829\n29#2,6:835\n29#2,6:841\n29#2,6:847\n*S KotlinDebug\n*F\n+ 1 UI.kt\neu/shoroa/bridge/render/UI\n*L\n299#1:793,6\n350#1:799,6\n372#1:805,6\n380#1:811,6\n404#1:817,6\n422#1:823,6\n443#1:829,6\n484#1:835,6\n501#1:841,6\n540#1:847,6\n*E\n"})
/*     */ public final class d
/*     */ {
/*     */   @Nullable
/*     */   public final a a() {
/*  42 */     return b; } public final void a(a <set-?>) { b = <set-?>; } @Nullable
/*  43 */   public final b b() { return c; } public final void a(b <set-?>) { c = <set-?>; }
/*  44 */   public final long c() { return d; } public final void a(long <set-?>) { d = <set-?>; } @NotNull
/*  45 */   public static final d a = new d(); @Nullable private static a b; @Nullable private static b c; private static long d; @NotNull private static final HashMap<Integer, NVGColor> e = new HashMap<>();
/*     */   @NotNull
/*  47 */   private static HashMap<Integer, Integer> f = new HashMap<>();
/*     */   public final void a(a br, b tr) {
/*  49 */     Intrinsics.checkNotNullParameter(br, ""); Intrinsics.checkNotNullParameter(tr, ""); b = br;
/*  50 */     c = tr;
/*     */   }
/*     */   public final void d() {
/*  53 */     b.INSTANCE.a(NanoVGGL2.nvgCreate(1));
/*  54 */     System.out.println("   UI: NanoVG Context: " + b.INSTANCE.a());
/*     */ 
/*     */     
/*  57 */     d = NanoVGGL2.nvgCreate(1);
/*     */     
/*  59 */     if ((int)d == 0);
/*     */ 
/*     */ 
/*     */     
/*  63 */     for (int i = 1; i < 3; i++) {
/*  64 */       a.a.a("bg" + i, "bg" + i + ".jpg", 1); String[] arrayOfString3; byte b2; String[] arrayOfString4; int k;
/*  65 */       for (arrayOfString4 = new String[3], arrayOfString4[0] = "a", arrayOfString4[1] = "b", arrayOfString4[2] = "c", arrayOfString3 = arrayOfString4, b2 = 0, k = arrayOfString3.length; b2 < k; ) { String str = arrayOfString3[b2];
/*  66 */         a.a.a("bg" + i + "-blur-" + str, "bg" + i + "-blur-" + str + ".jpg", 1);
/*     */         b2++; }
/*     */     
/*     */     } 
/*  70 */     a.a.a("glow_out", "glow_out.png", 1);
/*  71 */     a.a.a("glow_in", "glow_in.png", 1);
/*  72 */     a.a.a("logo", "logo.png", 1);
/*  73 */     a.a.a("icon_small", "iconlol.png", 1);
/*  74 */     a.a.a("icon_small-dark", "icon_small - dark.png", 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     a.a.c("absorption", "potion_absorption.png", 1);
/*  85 */     a.a.c("blindness", "potion_blindness.png", 1);
/*  86 */     a.a.c("fireResistance", "potion_fire_resistance.png", 1);
/*  87 */     a.a.c("digSpeed", "potion_haste.png", 1);
/*  88 */     a.a.c("healthBoost", "potion_health_boost.png", 1);
/*  89 */     a.a.c("hunger", "potion_hunger.png", 1);
/*  90 */     a.a.c("invisibility", "potion_invisibility.png", 1);
/*  91 */     a.a.c("jump", "potion_jump_boost.png", 1);
/*  92 */     a.a.c("digSlowDown", "potion_mining_fatigue.png", 1);
/*  93 */     a.a.c("confusion", "potion_nausea.png", 1);
/*  94 */     a.a.c("nightVision", "potion_night_vision.png", 1);
/*  95 */     a.a.c("poison", "potion_poison.png", 1);
/*  96 */     a.a.c("regeneration", "potion_regeneration.png", 1);
/*  97 */     a.a.c("resistance", "potion_resistance.png", 1);
/*  98 */     a.a.c("moveSlowdown", "potion_slowness.png", 1);
/*  99 */     a.a.c("moveSpeed", "potion_speed.png", 1);
/* 100 */     a.a.c("damageBoost", "potion_strength.png", 1);
/* 101 */     a.a.c("waterBreathing", "potion_water_breathing.png", 1);
/* 102 */     a.a.c("weakness", "potion_weakness.png", 1);
/* 103 */     a.a.c("wither", "potion_wither.png", 1);
/*     */ 
/*     */ 
/*     */     
/* 107 */     a.a.c("right", "check.png", 1);
/* 108 */     a.a.c("wrong", "cancel.png", 1);
/* 109 */     a.a.c("folder", "folder.png", 1);
/* 110 */     a.a.c("reload", "reload.png", 1);
/* 111 */     a.a.c("themes", "themes.png", 1);
/* 112 */     a.a.c("search", "search.png", 1);
/* 113 */     a.a.c("modules", "modules.png", 1);
/* 114 */     a.a.c("cosmetics", "cosmetics.png", 1);
/* 115 */     a.a.c("screenshots", "screenshots.png", 1);
/* 116 */     a.a.c("resourcepacks", "resourcepacks.png", 1);
/* 117 */     a.a.c("edithud", "edithud.png", 1);
/*     */ 
/*     */ 
/*     */     
/* 121 */     a.a.d("notro", "notro.png", 1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     a.a.b("keystrokes", "Keystrokes.png", 1);
/* 127 */     a.a.b("reachdisplay", "reachdisplay.png", 1);
/* 128 */     a.a.b("ping", "Ping.png", 1);
/* 129 */     a.a.b("blockoverlay", "BlockOverlay.png", 1);
/* 130 */     a.a.b("animations", "animations.png", 1);
/* 131 */     a.a.b("togglesprint", "togglesprint.png", 1);
/* 132 */     a.a.b("time", "timedisplay.png", 1);
/* 133 */     a.a.b("coords", "coords.png", 1);
/* 134 */     a.a.b("timechanger", "timechanger.png", 1);
/* 135 */     a.a.b("cps", "cps.png", 1);
/* 136 */     a.a.b("fps", "fps.png", 1);
/* 137 */     a.a.b("autotext", "autotext.png", 1);
/* 138 */     a.a.b("armorstatus", "armorstatus.png", 1);
/* 139 */     a.a.b("freelook", "freelook.png", 1);
/* 140 */     a.a.b("motionblur", "motionblur.png", 1);
/* 141 */     a.a.b("shaders", "shaders.png", 1);
/* 142 */     a.a.b("scoreboard", "Scoreboard.png", 1);
/* 143 */     a.a.b("nametags", "nametags.png", 1);
/* 144 */     a.a.b("particlemultiplier", "particlemultiplier.png", 1);
/* 145 */     a.a.b("crosshair", "crosshair.png", 1);
/* 146 */     a.a.b("potionstatus", "PotionStatus.png", 1);
/* 147 */     a.a.b("tnttimer", "tnttimer.png", 1);
/* 148 */     a.a.b("combocounter", "ComboCounter.png", 1);
/* 149 */     a.a.b("fullbright", "Fullbright.png", 1);
/*     */     
/*     */     String[] arrayOfString1, arrayOfString2;
/*     */     
/*     */     byte b1;
/*     */     
/*     */     int j;
/* 156 */     for (arrayOfString2 = new String[9], arrayOfString2[0] = "black", arrayOfString2[1] = "bold", arrayOfString2[2] = "extrabold", arrayOfString2[3] = "extralight", arrayOfString2[4] = "light", arrayOfString2[5] = "medium", arrayOfString2[6] = "regular", arrayOfString2[7] = "semibold", arrayOfString2[8] = "thin", arrayOfString1 = arrayOfString2, b1 = 0, j = arrayOfString1.length; b1 < j; ) { String font = arrayOfString1[b1];
/* 157 */       a.a.a(font, font + ".ttf");
/* 158 */       if (!Intrinsics.areEqual(font, "black")) a.a.a("mono " + font, "jb/" + font + ".ttf");  b1++; }
/*     */     
/* 160 */     a.a.a("minecraft", "minecraft.otf");
/* 161 */     a.a.a("minecraft bold", "minecraft bold.otf");
/* 162 */     a.a.a("entypo", "entypo.ttf");
/* 163 */     a.a.a("icons", "icons.ttf");
/* 164 */     a.a.a("solid", "solid.ttf");
/* 165 */     a.a.a("special", "special.ttf");
/* 166 */     a.a.a("brands", "brands.ttf");
/* 167 */     a.a.a("console", "dina.ttf");
/*     */   }
/*     */   
/*     */   public final void a(Function0 func) {
/* 171 */     Intrinsics.checkNotNullParameter(func, ""); GL11.glPushAttrib(1048575);
/* 172 */     GL11.glDisable(3008);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     Intrinsics.checkNotNull(eu.shoroa.bridge.feature.a.b.a.e()); Intrinsics.checkNotNull(eu.shoroa.bridge.feature.a.b.a.e()); b.INSTANCE.a(eu.shoroa.bridge.feature.a.b.a.e().width(), eu.shoroa.bridge.feature.a.b.a.e().height(), 1.0F);
/* 195 */     func.invoke();
/* 196 */     b.INSTANCE.d();
/* 197 */     GL11.glPopAttrib();
/*     */   }
/*     */   
/*     */   public final void a(eu.shoroa.bridge.feature.b.b module, float top left, float top right, float bottom left, float bottom right, d paint, float rotate) {
/* 201 */     Intrinsics.checkNotNullParameter(module, ""); Intrinsics.checkNotNullParameter(paint, ""); a(module.l(), module.m(), module.n(), module.o(), top left, top right, bottom left, bottom right, paint, rotate);
/*     */   }
/*     */   public final void a(eu.shoroa.bridge.ui.b.d element, float top left, float top right, float bottom left, float bottom right, d paint, float rotate) {
/* 204 */     Intrinsics.checkNotNullParameter(element, ""); Intrinsics.checkNotNullParameter(paint, ""); a(element.getX(), element.getY(), element.getW(), element.getH(), top left, top right, bottom left, bottom right, paint, rotate);
/*     */   }
/*     */   public final void a(eu.shoroa.bridge.feature.b.b module, float radius, d paint, float rotate) {
/* 207 */     Intrinsics.checkNotNullParameter(module, ""); Intrinsics.checkNotNullParameter(paint, ""); a(module.l(), module.m(), module.n(), module.o(), radius, paint, rotate);
/*     */   }
/*     */   public final void a(eu.shoroa.bridge.ui.b.d element, float radius, d paint, float rotate) {
/* 210 */     Intrinsics.checkNotNullParameter(element, ""); Intrinsics.checkNotNullParameter(paint, ""); a(element.getX(), element.getY(), element.getW(), element.getH(), radius, paint, rotate);
/*     */   }
/*     */   public final void a(float x, float y, float width, float height, float radius, d paint, float rotate) {
/* 213 */     Intrinsics.checkNotNullParameter(paint, ""); a(x, y, width, height, radius, radius, radius, radius, paint, rotate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void a(float x, float y, float width, float height, float radius, Color color1, Color color2) {
/* 225 */     NVGPaint bg = NVGPaint.create();
/*     */     
/* 227 */     float tick = (float)(System.currentTimeMillis() % 3600L) / 570.0F;
/* 228 */     float max = (float)Math.max(width, height);
/*     */     
/* 230 */     NanoVG.nvgBeginPath(d);
/* 231 */     NanoVG.nvgRoundedRect(d, x, y, width, height, radius);
/*     */     
/* 233 */     NVGColor nvgColor1 = a(color1);
/* 234 */     NVGColor nvgColor2 = a(color2);
/*     */     
/* 236 */     NanoVG.nvgFillColor(d, nvgColor1);
/* 237 */     NanoVG.nvgFillColor(d, nvgColor2);
/*     */     
/* 239 */     NanoVG.nvgFillPaint(
/* 240 */         d, NanoVG.nvgLinearGradient(
/* 241 */           d, x + width / 2 - max / 2 * c.INSTANCE.c(tick), y + height / 2 - max / 2 * c.INSTANCE.b(tick), 
/* 242 */           x + width / 2 + max / 2 * c.INSTANCE.c(tick), 
/* 243 */           y + height / 2 + (max + 2.0F) * c.INSTANCE.b(tick), nvgColor1, nvgColor2, bg));
/*     */ 
/*     */     
/* 246 */     NanoVG.nvgFill(d);
/*     */   } @NotNull
/*     */   public final NVGColor a(Color color) {
/* 249 */     Color color1 = color;
/* 250 */     if (color1 == null) {
/* 251 */       color1 = Color.RED;
/*     */     }
/*     */     
/* 254 */     Intrinsics.checkNotNull(color1); if (e.containsKey(Integer.valueOf(color1.getRGB()))) {
/* 255 */       Intrinsics.checkNotNull(e.get(Integer.valueOf(color1.getRGB()))); return e.get(Integer.valueOf(color1.getRGB()));
/*     */     } 
/*     */     
/* 258 */     NVGColor nvgColor = NVGColor.create();
/*     */     
/* 260 */     NanoVG.nvgRGBA((byte)color1.getRed(), (byte)color1.getGreen(), (byte)color1.getBlue(), (byte)color1.getAlpha(), nvgColor);
/*     */     
/* 262 */     e.put(Integer.valueOf(color1.getRGB()), nvgColor);
/*     */     
/* 264 */     Intrinsics.checkNotNull(nvgColor); return nvgColor;
/*     */   } public static final class c {
/* 266 */     private final float a; private final float b; public c(float x, float y) { this.a = x; this.b = y; } public final float a() { return this.a; } public final float b() { return this.b; }
/*     */     public final float c() { return this.a; }
/*     */     public final float d() { return this.b; }
/*     */     @NotNull
/*     */     public final c a(float x, float y) { return new c(x, y); } @NotNull
/*     */     public String toString() {
/*     */       return "Vec2(x=" + this.a + ", y=" + this.b + ")";
/*     */     } public int hashCode() {
/*     */       result = Float.hashCode(this.a);
/*     */       return result * 31 + Float.hashCode(this.b);
/*     */     } public boolean equals(Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof c))
/*     */         return false; 
/*     */       c c1 = (c)other;
/*     */       return (Float.compare(this.a, c1.a) != 0) ? false : (!(Float.compare(this.b, c1.b) != 0));
/*     */     }
/* 284 */   } public final void a(float x, float y, float width, float height, float rTL, float rTR, float rBL, float rBR, Color startColor, Color endColor, c gradientFrom, c gradientTo, d paint, boolean stroke, float rotate) { Intrinsics.checkNotNullParameter(startColor, ""); Intrinsics.checkNotNullParameter(endColor, ""); Intrinsics.checkNotNullParameter(gradientFrom, ""); Intrinsics.checkNotNullParameter(gradientTo, ""); Intrinsics.checkNotNullParameter(paint, ""); float sw = paint.e();
/* 285 */     int mode = stroke ? 0 : 1;
/* 286 */     NVGColor cStart = a.a.a(startColor);
/* 287 */     NVGColor cEnd = a.a.a(endColor);
/*     */     
/* 289 */     NVGPaint gradientPaint = NVGPaint.calloc();
/*     */     
/* 291 */     float sx = x + width * gradientFrom.a();
/* 292 */     float sy = y + height * gradientFrom.b();
/* 293 */     float ex = x + width * gradientTo.a();
/* 294 */     float ey = y + height * gradientTo.b();
/*     */     
/* 296 */     b.INSTANCE.a(sx, sy, ex, ey, cStart, cEnd, gradientPaint);
/*     */     
/* 298 */     b.INSTANCE.e();
/* 299 */     a this_$iv = a.a; int $i$f$path = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 794 */     int $i$a$-path-UI$gradientQuad$1 = 0; b.INSTANCE.b(sw); b.INSTANCE.a(x + sw / 2.0F, y + sw / 2.0F, width - sw, height - sw, rTL - sw / 2.0F, rTR - sw / 2.0F, rBL - sw / 2.0F, rBR - sw / 2.0F); if (mode == 1) { b.INSTANCE.b(gradientPaint); } else { b.INSTANCE.a(gradientPaint); }  if (!((rotate == 0.0F) ? 1 : 0))
/* 795 */       b.INSTANCE.d(rotate);  if (mode == 0) b.INSTANCE.l(); 
/* 796 */     if (mode == 1) b.INSTANCE.k(); 
/* 797 */     b.INSTANCE.j(); b.INSTANCE.f(); cStart.free(); cEnd.free(); gradientPaint.free(); } public final void a(float x, float y, float width, float height, float rTL, float rTR, float rBL, float rBR, d paint, float rotate) { a this_$iv; int $i$f$path, $i$a$-path-UI$quad$2; Intrinsics.checkNotNullParameter(paint, ""); float sw = paint.e(); int mode = paint.a().a(); NVGColor c1 = a.a.a(paint.b()); NVGPaint gradientPaint = NVGPaint.calloc(); NVGPaint imgPaint = NVGPaint.calloc(); switch (d.a[paint.a().ordinal()]) { case 1: Intrinsics.checkNotNull(b); Intrinsics.checkNotNull(imgPaint); a(x, y, width, height, rTL, rTR, rBL, rBR, b.a(), imgPaint); break;
/*     */       case 2: Intrinsics.checkNotNull(d.c); Intrinsics.checkNotNull(imgPaint); a(x, y, width, height, rTL, rTR, rBL, rBR, d.c.a(), imgPaint); break;
/* 799 */       default: if (paint.c() != null) { Color c2 = paint.c(); int $i$a$-let-UI$quad$1 = 0; b c = paint.d(); Intrinsics.checkNotNull(c); float sx = x + width * c.a(); float sy = y + height * c.b(); float ex = x + width + width * c.c(); float ey = y + height + height * c.d(); b.INSTANCE.a(sx, sy, ex, ey, c1, a.a.a(c2), gradientPaint); } else { paint.c(); }  b.INSTANCE.e(); this_$iv = a.a; $i$f$path = 0; b.INSTANCE.i();
/* 800 */         $i$a$-path-UI$quad$2 = 0; b.INSTANCE.b(sw); b.INSTANCE.a(x + sw / 2.0F, y + sw / 2.0F, width - sw, height - sw, rTL - sw / 2.0F, rTR - sw / 2.0F, rBL - sw / 2.0F, rBR - sw / 2.0F); if (paint.c() != null) { if (mode == 1) b.INSTANCE.b(gradientPaint);  if (mode == 0) b.INSTANCE.a(gradientPaint);  } else { if (mode == 1) b.INSTANCE.b(c1);  if (mode == 0)
/* 801 */             b.INSTANCE.a(c1);  }  b.INSTANCE.d(rotate); if (mode == 0) b.INSTANCE.l(); 
/* 802 */         if (mode == 1) b.INSTANCE.k(); 
/* 803 */         b.INSTANCE.j(); b.INSTANCE.f(); break; }
/*     */      c1.free(); gradientPaint.free(); imgPaint.free(); } private final void a(float x, float y, float width, float height, float rTL, float rTR, float rBL, float rBR, int image, NVGPaint imgPaint) { a a1 = a.a; int mode$iv = 1; int $i$f$path = 0;
/* 805 */     b.INSTANCE.i();
/* 806 */     int $i$a$-path-UI$drawImagePattern$1 = 0; b.INSTANCE.a(x, y, width, height, rTL, rTR, rBL, rBR); Intrinsics.checkNotNull(eu.shoroa.bridge.feature.a.b.a.e()); Intrinsics.checkNotNull(eu.shoroa.bridge.feature.a.b.a.e()); b.INSTANCE.a(0.0F, 0.0F, eu.shoroa.bridge.feature.a.b.a.e().width(), eu.shoroa.bridge.feature.a.b.a.e().height(), 0.0F, image, 1.0F, imgPaint);
/*     */     b.INSTANCE.b(imgPaint);
/* 808 */     b.INSTANCE.k();
/* 809 */     b.INSTANCE.j(); } public final void a(float rectX, float rectY, float rectW, float rectH, float r, String image, float imgX, float imgY, float imgW, float imgH) { Intrinsics.checkNotNullParameter(image, ""); NVGPaint imgPaint = NVGPaint.calloc(); a a1 = a.a; int mode$iv = 1;
/*     */     int $i$f$path = 0;
/* 811 */     b.INSTANCE.i();
/* 812 */     int $i$a$-path-UI$partOfImage$1 = 0; b.INSTANCE.b(rectX, rectY, rectW, rectH, r); Intrinsics.checkNotNull(a.a.a().get(image)); b.INSTANCE.a(imgX, imgY, imgW, imgH, 0.0F, ((Number)a.a.a().get(image)).intValue(), 1.0F, imgPaint);
/*     */     b.INSTANCE.b(imgPaint);
/* 814 */     b.INSTANCE.k();
/* 815 */     b.INSTANCE.j(); imgPaint.free(); } public final void a(float x, float y, float radius, float startAngle, float endAngle, d paint) { Intrinsics.checkNotNullParameter(paint, ""); boolean isGradient = (paint.c() != null); NVGColor c1 = a.a.a(paint.b()); NVGPaint gradientPaint = NVGPaint.calloc(); if (isGradient) {
/*     */       Intrinsics.checkNotNull(paint.c()); NVGColor c2 = a.a.a(paint.c()); b c = paint.d(); Intrinsics.checkNotNull(c); float sx = x + radius * c.a(); float sy = y + radius * c.b(); float ex = x + radius + radius * c.c(); float ey = y + radius + radius * c.d(); b.INSTANCE.a(sx, sy, ex, ey, c1, c2, gradientPaint);
/* 817 */     }  b.INSTANCE.e(); a a1 = a.a; int mode$iv = 0; int $i$f$path = 0; b.INSTANCE.i();
/* 818 */     int $i$a$-path-UI$partialCircle$1 = 0; b $this$partialCircle_u24lambda_u246_u24lambda_u245 = b.INSTANCE; int $i$a$-with-UI$partialCircle$1$1 = 0; $this$partialCircle_u24lambda_u246_u24lambda_u245.b(1); $this$partialCircle_u24lambda_u246_u24lambda_u245.b(paint.e()); $this$partialCircle_u24lambda_u246_u24lambda_u245.a(x, y, radius, (float)Math.toRadians(startAngle), (float)Math.toRadians(endAngle), 1); if (isGradient) { $this$partialCircle_u24lambda_u246_u24lambda_u245.a(gradientPaint); } else { $this$partialCircle_u24lambda_u246_u24lambda_u245.a(c1); }
/* 819 */      b.INSTANCE.l();
/*     */     
/* 821 */     b.INSTANCE.j(); b.INSTANCE.f(); c1.free(); if (isGradient)
/*     */       gradientPaint.free();  } public final void a(String imageKey, float x, float y, float width, float height, float radius, float alpha) { Intrinsics.checkNotNullParameter(imageKey, ""); Object paint = null; paint = NVGPaint.calloc(); a a1 = a.a; int mode$iv = 1; int $i$f$path = 0;
/* 823 */     b.INSTANCE.i();
/* 824 */     int $i$a$-path-UI$image$1 = 0; Intrinsics.checkNotNull(a.a.a().get(imageKey)); b.INSTANCE.a(x, y, width, height, 0.0F, ((Number)a.a.a().get(imageKey)).intValue(), alpha, (NVGPaint)paint); b.INSTANCE.b(x, y, width, height, radius);
/*     */     b.INSTANCE.b((NVGPaint)paint);
/* 826 */     b.INSTANCE.k();
/* 827 */     b.INSTANCE.j(); paint.free(); } public final void a(String imageKey, float x, float y, float width, float height, float radius, float alpha, Color color) { Intrinsics.checkNotNullParameter(imageKey, ""); Intrinsics.checkNotNullParameter(color, ""); NVGPaint paint = NVGPaint.calloc(); a a1 = a.a; int mode$iv = 1;
/*     */     int $i$f$path = 0;
/* 829 */     b.INSTANCE.i();
/* 830 */     int $i$a$-path-UI$imageFill$1 = 0; Intrinsics.checkNotNull(a.a.a().get(imageKey)); b.INSTANCE.a(x, y, width, height, 0.0F, ((Number)a.a.a().get(imageKey)).intValue(), alpha, paint); paint.innerColor().r(color.getRed() / 255.0F * alpha).g(color.getGreen() / 255.0F * alpha).b(color.getBlue() / 255.0F * alpha).a(color.getAlpha() / 255.0F * alpha); paint.outerColor().r(color.getRed() / 255.0F * alpha).g(color.getGreen() / 255.0F * alpha).b(color.getBlue() / 255.0F * alpha).a(color.getAlpha() / 255.0F * alpha); b.INSTANCE.b(x, y, width, height, radius);
/*     */     b.INSTANCE.b(paint);
/* 832 */     b.INSTANCE.k();
/* 833 */     b.INSTANCE.j(); paint.free(); } public final void a(float x, float y, float w, float h, float radius, float alpha) { int image = GL11.glGetInteger(32873); int ref = 0; if (f.containsKey(Integer.valueOf(image))) { Intrinsics.checkNotNull(f.get(Integer.valueOf(image))); ref = f.get(Integer.valueOf(image)).intValue(); } else { ref = NanoVGGL2.nvglCreateImageFromHandle(b.INSTANCE.a(), image, (int)w, (int)h, 32); if (ref == 0)
/*     */         throw new RuntimeException("Unable to create texture!");  Integer integer = Integer.valueOf(image); f.put(integer, Integer.valueOf(ref)); }
/* 835 */      int[] imgW = new int[1]; int[] imgH = new int[1]; imgW[0] = (int)w; imgH[0] = (int)h; b.INSTANCE.a(ref, imgW, imgH); Object paint = null; paint = NVGPaint.calloc(); a a1 = a.a; int mode$iv = 1; int $i$f$path = 0; b.INSTANCE.i();
/* 836 */     int $i$a$-path-UI$glImage$1 = 0; b.INSTANCE.a(x, y, w, h, 0.0F, ref, alpha, (NVGPaint)paint); b.INSTANCE.b(x, y, w, h, radius);
/*     */     b.INSTANCE.b((NVGPaint)paint);
/* 838 */     b.INSTANCE.k();
/* 839 */     b.INSTANCE.j(); paint.free(); } public final void a(float x, float y, float width, float height, float radius, float spread, Color color, boolean inner) { Intrinsics.checkNotNullParameter(color, ""); NVGPaint shadowPaint = NVGPaint.calloc(); NVGColor shadowColor = a.a.a(color); NVGColor transparentColor = a.a.a(new Color(0, 0, 0, 0)); b.INSTANCE.a(x, y, width, height, radius, spread, inner ? transparentColor : shadowColor, inner ? shadowColor : transparentColor, shadowPaint); b.INSTANCE.e(); a a1 = a.a; int mode$iv = inner ? 1 : 0;
/*     */     int $i$f$path = 0;
/* 841 */     b.INSTANCE.i();
/* 842 */     int $i$a$-path-UI$drawShadow$1 = 0; b.INSTANCE.b(x - (inner ? 0.0F : radius), y - (inner ? 0.0F : radius), width + (inner ? 0.0F : (radius * 2)), height + (inner ? 0.0F : (radius * 2)), radius * (inner ? 1.0F : 2.0F)); if (inner) { b.INSTANCE.a(3); b.INSTANCE.b(shadowPaint); } else { b.INSTANCE.a(0); b.INSTANCE.b(radius * 2.0F); b.INSTANCE.a(shadowPaint); }
/* 843 */      if (mode$iv == 0) b.INSTANCE.l(); 
/* 844 */     if (mode$iv == 1) b.INSTANCE.k(); 
/* 845 */     b.INSTANCE.j(); b.INSTANCE.f(); shadowPaint.free(); shadowColor.free(); transparentColor.free(); }
/*     */   @NotNull public final float[] a(String text, float x, float y, String font, float size, Color color, a alignment, float rotate, float blur) { Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(font, ""); Intrinsics.checkNotNullParameter(color, ""); Intrinsics.checkNotNullParameter(alignment, ""); String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; List texts = StringsKt.split$default(text, arrayOfString, false, 0, 6, null); float yy = y; float maxW = 0.0F; for (String t : texts) { b(t, x, yy, font, size, color, alignment, rotate, blur); yy += a(font, size); float w = a(t, font, size); if (w > maxW)
/* 847 */         maxW = w;  }  float[] arrayOfFloat = new float[2]; arrayOfFloat[0] = maxW; arrayOfFloat[1] = yy - y; return arrayOfFloat; } public final void b(String text, float x, float y, String font, float size, Color color, a alignment, float rotate, float blur) { Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(font, ""); Intrinsics.checkNotNullParameter(color, ""); Intrinsics.checkNotNullParameter(alignment, ""); NVGColor c = a.a.a(color); b.INSTANCE.e(); b.INSTANCE.a(x, y); a a1 = a.a; int mode$iv = -1; int $i$f$path = 0; b.INSTANCE.i();
/* 848 */     int $i$a$-path-UI$text$1 = 0; b.INSTANCE.d(rotate); b.INSTANCE.i(size); b.INSTANCE.c(font); b.INSTANCE.j(blur); b.INSTANCE.g(alignment.a());
/*     */     b.INSTANCE.b(c);
/*     */     b.INSTANCE.a(text, 0.0F, 0.0F);
/* 851 */     b.INSTANCE.j();
/*     */     b.INSTANCE.f();
/*     */     c.free(); }
/*     */ 
/*     */   
/*     */   public final void a(String text, float x, float y, String font, float size, Color color, Color outline, a alignment, float rotate, float blur) {
/*     */     Intrinsics.checkNotNullParameter(text, "");
/*     */     Intrinsics.checkNotNullParameter(font, "");
/*     */     Intrinsics.checkNotNullParameter(color, "");
/*     */     Intrinsics.checkNotNullParameter(outline, "");
/*     */     Intrinsics.checkNotNullParameter(alignment, "");
/*     */     b(text, x - true, y, font, size, outline, alignment, rotate, blur);
/*     */     b(text, x, y, font, size, outline, alignment, rotate, blur);
/*     */     b(text, x - true, y - true, font, size, outline, alignment, rotate, blur);
/*     */     b(text, x + true, y, font, size, outline, alignment, rotate, blur);
/*     */     b(text, x, y, font, size, outline, alignment, rotate, blur);
/*     */     b(text, x + true, y + true, font, size, outline, alignment, rotate, blur);
/*     */     b(text, x, y, font, size, color, alignment, rotate, blur);
/*     */   }
/*     */   
/*     */   public final float a(String text, String face, float size) {
/*     */     Intrinsics.checkNotNullParameter(text, "");
/*     */     Intrinsics.checkNotNullParameter(face, "");
/*     */     float[] bounds = new float[4];
/*     */     NanoVG.nvgSave(b.INSTANCE.a());
/*     */     NanoVG.nvgFontFace(b.INSTANCE.a(), face);
/*     */     NanoVG.nvgFontSize(b.INSTANCE.a(), size);
/*     */     float f = NanoVG.nvgTextBounds(b.INSTANCE.a(), 0.0F, 0.0F, text, bounds);
/*     */     NanoVG.nvgRestore(b.INSTANCE.a());
/*     */     return f;
/*     */   }
/*     */   
/*     */   public final float a(String face, float size) {
/*     */     Intrinsics.checkNotNullParameter(face, "");
/*     */     float[] ascender = new float[1];
/*     */     float[] descender = new float[1];
/*     */     float[] lineh = new float[1];
/*     */     NanoVG.nvgFontFace(b.INSTANCE.a(), face);
/*     */     NanoVG.nvgFontSize(b.INSTANCE.a(), size);
/*     */     NanoVG.nvgTextMetrics(b.INSTANCE.a(), ascender, descender, lineh);
/*     */     return lineh[0];
/*     */   }
/*     */   
/*     */   public final void a(float x, float y, float w, float h, Function0 function) {
/*     */     Intrinsics.checkNotNullParameter(function, "");
/*     */     b.INSTANCE.e();
/*     */     b.INSTANCE.b(x, y, w, h);
/*     */     function.invoke();
/*     */     b.INSTANCE.f();
/*     */   }
/*     */   
/*     */   @SourceDebugExtension({"SMAP\nUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UI.kt\neu/shoroa/bridge/render/UI$ColorPicker\n+ 2 NVGHelper.kt\neu/shoroa/bridge/render/util/NVGHelper\n*L\n1#1,792:1\n29#2,6:793\n29#2,6:799\n29#2,6:805\n29#2,6:811\n*S KotlinDebug\n*F\n+ 1 UI.kt\neu/shoroa/bridge/render/UI$ColorPicker\n*L\n604#1:793,6\n609#1:799,6\n647#1:805,6\n680#1:811,6\n*E\n"})
/*     */   public static final class b {
/*     */     @NotNull
/*     */     public static final b a = new b();
/*     */     
/*     */     public final void a(float x, float y, float width, float height, float hue) {
/*     */       Intrinsics.checkNotNullExpressionValue(Color.WHITE, "");
/*     */       NVGColor white = a.a.a(Color.WHITE);
/*     */       Intrinsics.checkNotNullExpressionValue(Color.BLACK, "");
/*     */       NVGColor black = a.a.a(Color.BLACK);
/*     */       NVGPaint paint1 = NVGPaint.calloc();
/*     */       NVGPaint paint2 = NVGPaint.calloc();
/*     */       b $this$boxStrBrh_u24lambda_u242 = b.INSTANCE;
/*     */       int $i$a$-with-UI$ColorPicker$boxStrBrh$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(Color.getHSBColor(hue, 1.0F, 1.0F), "");
/*     */       $this$boxStrBrh_u24lambda_u242.a(x, y, x + width, y, white, a.a.a(Color.getHSBColor(hue, 1.0F, 1.0F)), paint1);
/*     */       $this$boxStrBrh_u24lambda_u242.a(x, y + height * 1.3F, x, y, black, a.a.a(new Color(255, 255, 255, 0)), paint2);
/*     */       a a1 = a.a;
/*     */       int mode$iv = 1;
/*     */       int $i$f$path = 0;
/*     */       b.INSTANCE.i();
/*     */       int $i$a$-path-UI$ColorPicker$boxStrBrh$1$1 = 0;
/*     */       $this$boxStrBrh_u24lambda_u242.b(x, y, width, height, 10.0F);
/*     */       $this$boxStrBrh_u24lambda_u242.b(paint1);
/*     */       $this$boxStrBrh_u24lambda_u242.k();
/*     */       b.INSTANCE.k();
/*     */       b.INSTANCE.j();
/*     */       a this_$iv = a.a;
/*     */       mode$iv = 1;
/*     */       $i$f$path = 0;
/*     */       b.INSTANCE.i();
/*     */       int $i$a$-path-UI$ColorPicker$boxStrBrh$1$2 = 0;
/*     */       $this$boxStrBrh_u24lambda_u242.b(x, y, width, height, 10.0F);
/*     */       $this$boxStrBrh_u24lambda_u242.b(paint2);
/*     */       $this$boxStrBrh_u24lambda_u242.k();
/*     */       b.INSTANCE.k();
/*     */       b.INSTANCE.j();
/*     */       paint1.free();
/*     */       paint2.free();
/*     */       white.free();
/*     */       black.free();
/*     */     }
/*     */     
/*     */     public final void a(float x, float y, float width, float height, float radius, Color color) {
/*     */       Intrinsics.checkNotNullParameter(color, "");
/*     */       float ps = width / 2.0F;
/*     */       Intrinsics.checkNotNullExpressionValue(Color.WHITE, "");
/*     */       d.a(d.a, x, y, width, height, radius, d.a.a(Color.WHITE), 0.0F, 64, (Object)null);
/*     */       int i = 1, j = (int)(height / ps) - 2;
/*     */       if (i <= j)
/*     */         while (true) {
/*     */           float left = ps * (i % 2);
/*     */           d.a(d.a, x + ps - left, y + i * ps, ps, ps, 0.0F, d.a.a(new Color(13421772)), 0.0F, 64, (Object)null);
/*     */           if (i != j) {
/*     */             i++;
/*     */             continue;
/*     */           } 
/*     */           break;
/*     */         }  
/*     */       d.a(d.a, x, y + height - ps, ps, ps, 0.0F, 0.0F, 0.0F, radius, d.a.a(new Color(13421772)), 0.0F, 512, (Object)null);
/*     */       d.a(d.a, x, y, width, height, radius, d.a.a(color, eu.shoroa.bridge.d.e.a.a.a(color, 0.0F), b.a.a()), 0.0F, 64, (Object)null);
/*     */       d.a(d.a, x - 2.0F, y - 2.0F, width + 4.0F, height + 4.0F, radius + 1.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()).a(3.0F), 0.0F, 64, (Object)null);
/*     */     }
/*     */     
/*     */     public final void a(float x, float y, float width, float height, float radius, Color... colors) {
/*     */       Intrinsics.checkNotNullParameter(colors, "");
/*     */       if (colors.length >= 2) {
/*     */         float ccx = 0.0F;
/*     */         float stopSize = height / (colors.length - 1);
/*     */         for (int i = 0, j = colors.length - 1; i < j; i++) {
/*     */           Intrinsics.checkNotNull(colors[i]);
/*     */           NVGColor from = a.a.a(colors[i]);
/*     */           Intrinsics.checkNotNull(colors[i + 1]);
/*     */           NVGColor to = a.a.a(colors[i + 1]);
/*     */           NVGPaint paint = NVGPaint.calloc();
/*     */           b.INSTANCE.a(x, y + stopSize * i, x, y + stopSize * (i + 1), from, to, paint);
/*     */           int finalI = (i > 0) ? 1 : 0;
/*     */           float leftRadius = (i == 0) ? radius : 0.0F;
/*     */           float rightRadius = (i == colors.length - 2) ? radius : 0.0F;
/*     */           a a = a.a;
/*     */           int mode$iv = 1;
/*     */           int $i$f$path = 0;
/*     */           b.INSTANCE.i();
/*     */           int $i$a$-path-UI$ColorPicker$mulitGradVertical$1 = 0;
/*     */           b.INSTANCE.a(x, y + ccx - finalI, width, stopSize + finalI, leftRadius, leftRadius, rightRadius, rightRadius);
/*     */           b.INSTANCE.b(paint);
/*     */           b.INSTANCE.k();
/*     */           b.INSTANCE.j();
/*     */           ccx += stopSize;
/*     */           paint.free();
/*     */           from.free();
/*     */           to.free();
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public final void b(float x, float y, float width, float height, float radius, Color... colors) {
/*     */       Intrinsics.checkNotNullParameter(colors, "");
/*     */       if (colors.length >= 2) {
/*     */         float ccx = 0.0F;
/*     */         float stopSize = width / (colors.length - 1);
/*     */         for (int i = 0, j = colors.length - 1; i < j; i++) {
/*     */           Intrinsics.checkNotNull(colors[i]);
/*     */           NVGColor from = a.a.a(colors[i]);
/*     */           Intrinsics.checkNotNull(colors[i + 1]);
/*     */           NVGColor to = a.a.a(colors[i + 1]);
/*     */           NVGPaint paint = NVGPaint.calloc();
/*     */           b.INSTANCE.a(x + stopSize * i, y, x + stopSize * (i + 1), y, from, to, paint);
/*     */           int finalI = (i > 0) ? 1 : 0;
/*     */           float leftRadius = (i == 0) ? radius : 0.0F;
/*     */           float rightRadius = (i == colors.length - 2) ? radius : 0.0F;
/*     */           a a = a.a;
/*     */           int mode$iv = 1;
/*     */           int $i$f$path = 0;
/*     */           b.INSTANCE.i();
/*     */           int $i$a$-path-UI$ColorPicker$mulitGradHorizontal$1 = 0;
/*     */           b.INSTANCE.a(x + ccx - finalI, y, stopSize + finalI, height, leftRadius, rightRadius, rightRadius, leftRadius);
/*     */           b.INSTANCE.b(paint);
/*     */           b.INSTANCE.k();
/*     */           b.INSTANCE.j();
/*     */           ccx += stopSize;
/*     */           paint.free();
/*     */           from.free();
/*     */           to.free();
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\020\n\002\020\b\n\002\b\017\b\001\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\006\032\0020\002¢\006\004\b\007\020\bR\027\020\003\032\0020\0028\007¢\006\f\n\004\b\003\020\004\032\004\b\003\020\005j\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021"}, d2 = {"Leu/shoroa/bridge/b/d$a;", "", "", "a", "I", "()I", "p0", "<init>", "(Ljava/lang/String;II)V", "LEFT_TOP", "CENTER_TOP", "RIGHT_TOP", "LEFT_MIDDLE", "CENTER_MIDDLE", "RIGHT_MIDDLE", "LEFT_BOTTOM", "CENTER_BOTTOM", "RIGHT_BOTTOM"})
/*     */   public enum a {
/*     */     LEFT_TOP(9),
/*     */     CENTER_TOP(10),
/*     */     RIGHT_TOP(12),
/*     */     LEFT_MIDDLE(17),
/*     */     CENTER_MIDDLE(18),
/*     */     RIGHT_MIDDLE(20),
/*     */     LEFT_BOTTOM(33),
/*     */     CENTER_BOTTOM(34),
/*     */     RIGHT_BOTTOM(36);
/*     */     private final int a;
/*     */     
/*     */     a(int alignment) {
/*     */       this.a = alignment;
/*     */     }
/*     */     
/*     */     @JvmName(name = "a")
/*     */     public final int a() {
/*     */       return this.a;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<a> b() {
/*     */       return c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */