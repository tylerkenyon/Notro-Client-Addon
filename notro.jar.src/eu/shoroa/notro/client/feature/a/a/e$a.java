/*     */ package eu.shoroa.notro.client.feature.a.a;
/*     */ 
/*     */ import eu.shoroa.bridge.b.a.b;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import net.minecraft.class_1600;
/*     */ import net.minecraft.class_1664;
/*     */ import net.minecraft.class_860;
/*     */ import net.minecraft.class_861;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\006\n\002\020\b\n\002\b\003\n\002\020\007\n\002\b\007\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\f\n\002\020$\n\002\b\003\b\b\030\0002\0020\001B\017\022\006\020\003\032\0020\002¢\006\004\b\004\020\005J\r\020\007\032\0020\006¢\006\004\b\007\020\bJ\020\020\t\032\0020\002HÆ\003¢\006\004\b\t\020\nJ\032\020\013\032\0020\0002\b\b\002\020\003\032\0020\002HÆ\001¢\006\004\b\013\020\fJ\025\020\017\032\n \016*\004\030\0010\r0\r¢\006\004\b\017\020\020J\032\020\022\032\0020\0062\b\020\021\032\004\030\0010\001HÖ\003¢\006\004\b\022\020\023J\020\020\025\032\0020\024HÖ\001¢\006\004\b\025\020\026J\025\020\027\032\n \016*\004\030\0010\r0\r¢\006\004\b\027\020\020J\r\020\031\032\0020\030¢\006\004\b\031\020\032J5\020!\032\0020 2\006\020\033\032\0020\0062\006\020\034\032\0020\0302\006\020\035\032\0020\0302\006\020\036\032\0020\0302\006\020\037\032\0020\030¢\006\004\b!\020\"J\020\020#\032\0020\rHÖ\001¢\006\004\b#\020\020R\037\020%\032\n \016*\004\030\0010$0$8\006¢\006\f\n\004\b%\020&\032\004\b'\020(R\"\020\003\032\0020\0028\006@\006X\016¢\006\022\n\004\b\003\020)\032\004\b*\020\n\"\004\b+\020\005R\"\020,\032\0020\0248\006@\006X\016¢\006\022\n\004\b,\020-\032\004\b.\020\026\"\004\b/\0200R \0202\032\016\022\004\022\0020\r\022\004\022\0020\r018\002X\004¢\006\006\n\004\b2\0203¨\0064"}, d2 = {"Leu/shoroa/notro/client/feature/module/ui/ModulePotionStatus$Effect;", "", "Lnet/minecraft/class_861;", "effect", "<init>", "(Lnet/minecraft/class_861;)V", "", "canRemove", "()Z", "component1", "()Lnet/minecraft/class_861;", "copy", "(Lnet/minecraft/class_861;)Leu/shoroa/notro/client/feature/module/ui/ModulePotionStatus$Effect;", "", "kotlin.jvm.PlatformType", "duration", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "name", "", "progress", "()F", "nvg", "x", "y", "w", "h", "", "render", "(ZFFFF)V", "toString", "Leu/shoroa/bridge/render/animation/Animation;", "animation", "Leu/shoroa/bridge/render/animation/Animation;", "getAnimation", "()Leu/shoroa/bridge/render/animation/Animation;", "Lnet/minecraft/class_861;", "getEffect", "setEffect", "initialDuration", "I", "getInitialDuration", "setInitialDuration", "(I)V", "", "potionIcons", "Ljava/util/Map;", "NotroClient"})
/*     */ public final class a
/*     */ {
/*     */   @NotNull
/*     */   private class_861 a;
/*     */   @NotNull
/*     */   private final Map<String, String> b;
/*     */   private int c;
/*     */   private final eu.shoroa.bridge.b.a.a d;
/*     */   
/*     */   @NotNull
/*     */   public final class_861 a() {
/*     */     return this.a;
/*     */   }
/*     */   
/*     */   public final void a(class_861 <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "");
/*     */     this.a = <set-?>;
/*     */   }
/*     */   
/*     */   public final int b() {
/*     */     return this.c;
/*     */   }
/*     */   
/*     */   public final void a(int <set-?>) {
/*     */     this.c = <set-?>;
/*     */   }
/*     */   
/*     */   public a(class_861 effect) {
/*  86 */     this.a = effect;
/*     */     
/*  88 */     Pair[] arrayOfPair = new Pair[23]; arrayOfPair[0] = TuplesKt.to("moveSpeed", "speed"); arrayOfPair[1] = 
/*  89 */       TuplesKt.to("moveSlowdown", "slowness");
/*  90 */     arrayOfPair[2] = TuplesKt.to("digSpeed", "haste");
/*  91 */     arrayOfPair[3] = TuplesKt.to("digSlowDown", "mining_fatigue");
/*  92 */     arrayOfPair[4] = TuplesKt.to("damageBoost", "strength");
/*  93 */     arrayOfPair[5] = TuplesKt.to("heal", "instant_health");
/*  94 */     arrayOfPair[6] = TuplesKt.to("harm", "instant_damage");
/*  95 */     arrayOfPair[7] = TuplesKt.to("jump", "jump_boost");
/*  96 */     arrayOfPair[8] = TuplesKt.to("confusion", "nausea");
/*  97 */     arrayOfPair[9] = TuplesKt.to("regeneration", "regeneration");
/*  98 */     arrayOfPair[10] = TuplesKt.to("resistance", "resistance");
/*  99 */     arrayOfPair[11] = TuplesKt.to("fireResistance", "fire_resistance");
/* 100 */     arrayOfPair[12] = TuplesKt.to("waterBreathing", "water_breathing");
/* 101 */     arrayOfPair[13] = TuplesKt.to("invisibility", "invisibility");
/* 102 */     arrayOfPair[14] = TuplesKt.to("blindness", "blindness");
/* 103 */     arrayOfPair[15] = TuplesKt.to("nightVision", "night_vision");
/* 104 */     arrayOfPair[16] = TuplesKt.to("hunger", "hunger");
/* 105 */     arrayOfPair[17] = TuplesKt.to("weakness", "weakness");
/* 106 */     arrayOfPair[18] = TuplesKt.to("poison", "poison");
/* 107 */     arrayOfPair[19] = TuplesKt.to("wither", "wither");
/* 108 */     arrayOfPair[20] = TuplesKt.to("healthBoost", "health_boost");
/* 109 */     arrayOfPair[21] = TuplesKt.to("absorption", "absorption");
/* 110 */     arrayOfPair[22] = TuplesKt.to("saturation", "empty");
/*     */     
/*     */     this.b = MapsKt.mapOf(arrayOfPair);
/*     */     
/* 114 */     this.c = this.a.method_2453();
/* 115 */     this.d = eu.shoroa.bridge.b.a.a.a(a::i, a::j).a(a::k); } public final eu.shoroa.bridge.b.a.a c() { return this.d; } private static final Float i() { return Float.valueOf(180.0F); } private static final b j() { return b.EXPO_IN_OUT; } private static final Boolean k() { return Boolean.valueOf(true); }
/*     */   
/* 117 */   public final String d() { return class_1664.method_5934(this.a.method_2456(), new Object[0]); }
/* 118 */   public final String e() { return class_860.method_2436(this.a); }
/* 119 */   public final float f() { return this.a.method_2453() / this.c; } public final boolean g() {
/* 120 */     return (this.d.a() <= 0.001F && !this.d.c());
/*     */   }
/*     */   public final void a(boolean nvg, float x, float y, float w, float h) {
/* 123 */     class_1600 mc = class_1600.method_2965();
/* 124 */     float anim = this.d.a();
/*     */     
/* 126 */     if (this.a.method_2453() > this.c) {
/* 127 */       this.c = this.a.method_2453();
/*     */     }
/* 129 */     if (nvg) {
/*     */       
/* 131 */       d.a(d.a, x, y, w, h, 8.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().b()), 0.0F, 64, null);
/* 132 */       System.out.println("Potion ID = " + this.a.method_2450() + ", name = " + this.a.method_2456());
/*     */       
/* 134 */       class_860 potion = class_860.field_3164[this.a.method_2450()];
/* 135 */       Intrinsics.checkNotNullExpressionValue(potion.method_2433(), ""); String potionName = StringsKt.replace$default(potion.method_2433(), "potion.", "", false, 4, null);
/*     */ 
/*     */ 
/*     */       
/* 139 */       d.a.a(
/* 140 */           potionName, 
/* 141 */           x + 6.0F, 
/* 142 */           y + 6.0F, 
/* 143 */           h - 12.0F, 
/* 144 */           h - 12.0F, 
/* 145 */           6.0F, 
/* 146 */           anim);
/*     */ 
/*     */ 
/*     */       
/* 150 */       d.a.a(
/* 151 */           x + w - h / 2.0F, 
/* 152 */           y + h / 2.0F, 
/* 153 */           h / 3.0F, 
/* 154 */           360.0F, 
/* 155 */           360.0F - f() * 360.0F, 
/* 156 */           d.a.a(eu.shoroa.bridge.d.e.a.a.k().f()).a(3.0F));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 161 */       Intrinsics.checkNotNullExpressionValue(d(), ""); d.b(d.a, d(), 
/* 162 */           x + h, 
/* 163 */           y + h / 2.0F, 
/* 164 */           "medium", 
/* 165 */           16.0F, 
/* 166 */           eu.shoroa.bridge.d.e.a.a.k().e(), 
/* 167 */           d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */ 
/*     */ 
/*     */       
/* 171 */       Intrinsics.checkNotNullExpressionValue(e(), ""); d.b(d.a, e(), 
/* 172 */           x + w - h, 
/* 173 */           y + h / 2.0F + true, 
/* 174 */           "medium", 
/* 175 */           16.0F, 
/* 176 */           eu.shoroa.bridge.d.e.a.a.k().e(), 
/* 177 */           d.a.RIGHT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_861 h() {
/*     */     return this.a;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final a b(class_861 effect) {
/*     */     Intrinsics.checkNotNullParameter(effect, "");
/*     */     return new a(effect);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Effect(effect=" + this.a + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.a.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof a))
/*     */       return false; 
/*     */     a a1 = (a)other;
/*     */     return !!Intrinsics.areEqual(this.a, a1.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\e$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */