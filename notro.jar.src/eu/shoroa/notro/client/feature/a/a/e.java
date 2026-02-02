/*     */ package eu.shoroa.notro.client.feature.a.a;
/*     */ import eu.shoroa.bridge.b.a.b;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.b.d.b;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import net.minecraft.class_1600;
/*     */ import net.minecraft.class_860;
/*     */ import net.minecraft.class_861;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\036\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\020\b\n\002\b\n\030\0002\0020\001:\001\030B\007¢\006\004\b\002\020\003J3\020\r\032\0020\f2\f\020\006\032\b\022\004\022\0020\0050\0042\f\020\t\032\b\022\004\022\0020\b0\0072\006\020\013\032\0020\nH\002¢\006\004\b\r\020\016J'\020\022\032\0020\f2\006\020\013\032\0020\n2\006\020\020\032\0020\0172\006\020\021\032\0020\017H\026¢\006\004\b\022\020\023J'\020\024\032\0020\f2\006\020\013\032\0020\n2\006\020\020\032\0020\0172\006\020\021\032\0020\017H\026¢\006\004\b\024\020\023R\032\020\025\032\b\022\004\022\0020\b0\0078\002X\004¢\006\006\n\004\b\025\020\026R\032\020\027\032\b\022\004\022\0020\b0\0078\002X\004¢\006\006\n\004\b\027\020\026¨\006\031"}, d2 = {"Leu/shoroa/notro/client/feature/module/ui/ModulePotionStatus;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "", "Lnet/minecraft/class_861;", "activePotions", "", "Leu/shoroa/notro/client/feature/module/ui/ModulePotionStatus$Effect;", "objArr", "", "nvg", "", "draw", "(Ljava/util/Collection;Ljava/util/List;Z)V", "", "displayWidth", "displayHeight", "dummy", "(ZII)V", "render", "dummyEffects", "Ljava/util/List;", "effects", "Effect", "NotroClient"})
/*     */ @SourceDebugExtension({"SMAP\nModulePotionStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModulePotionStatus.kt\neu/shoroa/notro/client/feature/module/ui/ModulePotionStatus\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1855#2:185\n1856#2:187\n1#3:186\n*S KotlinDebug\n*F\n+ 1 ModulePotionStatus.kt\neu/shoroa/notro/client/feature/module/ui/ModulePotionStatus\n*L\n53#1:185\n53#1:187\n*E\n"})
/*     */ public final class e extends b {
/*     */   @NotNull
/*     */   private final List<a> a;
/*     */   
/*     */   public e() {
/*  29 */     super("PotionStatus", "Shows potion effects", false, "potionstatus", false, 20, null);
/*     */ 
/*     */     
/*  32 */     this.a = new ArrayList<>();
/*  33 */     this.b = new ArrayList<>();
/*     */   } @NotNull
/*     */   private final List<a> b; public void a(boolean nvg, int displayWidth, int displayHeight) {
/*  36 */     Intrinsics.checkNotNullExpressionValue((class_1600.method_2965()).field_10310.method_6120(), ""); a((class_1600.method_2965()).field_10310.method_6120(), this.a, nvg);
/*     */   }
/*     */   
/*     */   public void b(boolean nvg, int displayWidth, int displayHeight) {
/*  40 */     c(260.0F).d(162.0F);
/*  41 */     List<class_861> dummies = new ArrayList();
/*  42 */     dummies.add(new class_861(class_860.field_3184.field_3157, 100, 0));
/*  43 */     dummies.add(new class_861(class_860.field_3175.field_3157, 200, 1));
/*  44 */     dummies.add(new class_861(class_860.field_3187.field_3157, 300, 2));
/*  45 */     a(dummies, this.b, nvg);
/*     */   }
/*     */   
/*     */   private final void a(Collection activePotions, List objArr, boolean nvg) {
/*  49 */     float cardHeight = 50.0F;
/*  50 */     float cardGap = 6.0F;
/*     */ 
/*     */     
/*  53 */     Iterable $this$forEach$iv = activePotions; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     Iterator iterator1 = $this$forEach$iv.iterator(); if (iterator1.hasNext()) { Object element$iv = iterator1.next(); class_861 effect = (class_861)element$iv; int $i$a$-forEach-ModulePotionStatus$draw$1 = 0;
/*     */       List list = objArr;
/*     */       Iterator iterator2 = list.iterator(); }
/*     */     
/*     */     Ref.FloatRef yOffset = new Ref.FloatRef();
/*     */     Iterator<a> iterator = objArr.iterator();
/*     */     while (iterator.hasNext()) {
/*     */       a ef = iterator.next();
/*     */       ef.c().a(activePotions.contains(ef.a()));
/*     */       float anim = ef.c().a();
/*     */       b.INSTANCE.c(anim);
/*     */       eu.shoroa.bridge.b.d.a.a.a(anim, l() + n() / 2.0F, m() + yOffset.element + cardHeight / 2.0F, new Function0<Unit>(ef, nvg, this, yOffset, cardHeight) {
/*     */             public final void a() {
/*     */               this.$a.a(this.$b, this.c.l(), this.c.m() + this.$d.element, this.c.n(), this.$e);
/*     */             }
/*     */           });
/*     */       b.INSTANCE.c(1.0F);
/*     */       yOffset.element += anim * (cardHeight + cardGap);
/*     */     } 
/*     */     objArr.removeIf(null.a::a);
/*     */   }
/*     */   
/*     */   private static final boolean a(Function1 $tmp0, Object p0) {
/*     */     Intrinsics.checkNotNullParameter($tmp0, "");
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\006\n\002\020\b\n\002\b\003\n\002\020\007\n\002\b\007\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\f\n\002\020$\n\002\b\003\b\b\030\0002\0020\001B\017\022\006\020\003\032\0020\002¢\006\004\b\004\020\005J\r\020\007\032\0020\006¢\006\004\b\007\020\bJ\020\020\t\032\0020\002HÆ\003¢\006\004\b\t\020\nJ\032\020\013\032\0020\0002\b\b\002\020\003\032\0020\002HÆ\001¢\006\004\b\013\020\fJ\025\020\017\032\n \016*\004\030\0010\r0\r¢\006\004\b\017\020\020J\032\020\022\032\0020\0062\b\020\021\032\004\030\0010\001HÖ\003¢\006\004\b\022\020\023J\020\020\025\032\0020\024HÖ\001¢\006\004\b\025\020\026J\025\020\027\032\n \016*\004\030\0010\r0\r¢\006\004\b\027\020\020J\r\020\031\032\0020\030¢\006\004\b\031\020\032J5\020!\032\0020 2\006\020\033\032\0020\0062\006\020\034\032\0020\0302\006\020\035\032\0020\0302\006\020\036\032\0020\0302\006\020\037\032\0020\030¢\006\004\b!\020\"J\020\020#\032\0020\rHÖ\001¢\006\004\b#\020\020R\037\020%\032\n \016*\004\030\0010$0$8\006¢\006\f\n\004\b%\020&\032\004\b'\020(R\"\020\003\032\0020\0028\006@\006X\016¢\006\022\n\004\b\003\020)\032\004\b*\020\n\"\004\b+\020\005R\"\020,\032\0020\0248\006@\006X\016¢\006\022\n\004\b,\020-\032\004\b.\020\026\"\004\b/\0200R \0202\032\016\022\004\022\0020\r\022\004\022\0020\r018\002X\004¢\006\006\n\004\b2\0203¨\0064"}, d2 = {"Leu/shoroa/notro/client/feature/module/ui/ModulePotionStatus$Effect;", "", "Lnet/minecraft/class_861;", "effect", "<init>", "(Lnet/minecraft/class_861;)V", "", "canRemove", "()Z", "component1", "()Lnet/minecraft/class_861;", "copy", "(Lnet/minecraft/class_861;)Leu/shoroa/notro/client/feature/module/ui/ModulePotionStatus$Effect;", "", "kotlin.jvm.PlatformType", "duration", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "name", "", "progress", "()F", "nvg", "x", "y", "w", "h", "", "render", "(ZFFFF)V", "toString", "Leu/shoroa/bridge/render/animation/Animation;", "animation", "Leu/shoroa/bridge/render/animation/Animation;", "getAnimation", "()Leu/shoroa/bridge/render/animation/Animation;", "Lnet/minecraft/class_861;", "getEffect", "setEffect", "initialDuration", "I", "getInitialDuration", "setInitialDuration", "(I)V", "", "potionIcons", "Ljava/util/Map;", "NotroClient"})
/*     */   public static final class a {
/*     */     @NotNull
/*     */     private class_861 a;
/*     */     @NotNull
/*     */     private final Map<String, String> b;
/*     */     private int c;
/*     */     private final eu.shoroa.bridge.b.a.a d;
/*     */     
/*     */     public a(class_861 effect) {
/*     */       this.a = effect;
/*     */       Pair[] arrayOfPair = new Pair[23];
/*     */       arrayOfPair[0] = TuplesKt.to("moveSpeed", "speed");
/*     */       arrayOfPair[1] = TuplesKt.to("moveSlowdown", "slowness");
/*     */       arrayOfPair[2] = TuplesKt.to("digSpeed", "haste");
/*     */       arrayOfPair[3] = TuplesKt.to("digSlowDown", "mining_fatigue");
/*     */       arrayOfPair[4] = TuplesKt.to("damageBoost", "strength");
/*     */       arrayOfPair[5] = TuplesKt.to("heal", "instant_health");
/*     */       arrayOfPair[6] = TuplesKt.to("harm", "instant_damage");
/*     */       arrayOfPair[7] = TuplesKt.to("jump", "jump_boost");
/*     */       arrayOfPair[8] = TuplesKt.to("confusion", "nausea");
/*     */       arrayOfPair[9] = TuplesKt.to("regeneration", "regeneration");
/*     */       arrayOfPair[10] = TuplesKt.to("resistance", "resistance");
/*     */       arrayOfPair[11] = TuplesKt.to("fireResistance", "fire_resistance");
/*     */       arrayOfPair[12] = TuplesKt.to("waterBreathing", "water_breathing");
/*     */       arrayOfPair[13] = TuplesKt.to("invisibility", "invisibility");
/*     */       arrayOfPair[14] = TuplesKt.to("blindness", "blindness");
/*     */       arrayOfPair[15] = TuplesKt.to("nightVision", "night_vision");
/*     */       arrayOfPair[16] = TuplesKt.to("hunger", "hunger");
/*     */       arrayOfPair[17] = TuplesKt.to("weakness", "weakness");
/*     */       arrayOfPair[18] = TuplesKt.to("poison", "poison");
/*     */       arrayOfPair[19] = TuplesKt.to("wither", "wither");
/*     */       arrayOfPair[20] = TuplesKt.to("healthBoost", "health_boost");
/*     */       arrayOfPair[21] = TuplesKt.to("absorption", "absorption");
/*     */       arrayOfPair[22] = TuplesKt.to("saturation", "empty");
/*     */       this.b = MapsKt.mapOf(arrayOfPair);
/*     */       this.c = this.a.method_2453();
/*     */       this.d = eu.shoroa.bridge.b.a.a.a(a::i, a::j).a(a::k);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final class_861 a() {
/*     */       return this.a;
/*     */     }
/*     */     
/*     */     public final void a(class_861 <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "");
/*     */       this.a = <set-?>;
/*     */     }
/*     */     
/*     */     public final int b() {
/*     */       return this.c;
/*     */     }
/*     */     
/*     */     public final void a(int <set-?>) {
/*     */       this.c = <set-?>;
/*     */     }
/*     */     
/*     */     public final eu.shoroa.bridge.b.a.a c() {
/*     */       return this.d;
/*     */     }
/*     */     
/*     */     private static final Float i() {
/*     */       return Float.valueOf(180.0F);
/*     */     }
/*     */     
/*     */     private static final b j() {
/*     */       return b.EXPO_IN_OUT;
/*     */     }
/*     */     
/*     */     private static final Boolean k() {
/*     */       return Boolean.valueOf(true);
/*     */     }
/*     */     
/*     */     public final String d() {
/*     */       return class_1664.method_5934(this.a.method_2456(), new Object[0]);
/*     */     }
/*     */     
/*     */     public final String e() {
/*     */       return class_860.method_2436(this.a);
/*     */     }
/*     */     
/*     */     public final float f() {
/*     */       return this.a.method_2453() / this.c;
/*     */     }
/*     */     
/*     */     public final boolean g() {
/*     */       return (this.d.a() <= 0.001F && !this.d.c());
/*     */     }
/*     */     
/*     */     public final void a(boolean nvg, float x, float y, float w, float h) {
/*     */       class_1600 mc = class_1600.method_2965();
/*     */       float anim = this.d.a();
/*     */       if (this.a.method_2453() > this.c)
/*     */         this.c = this.a.method_2453(); 
/*     */       if (nvg) {
/*     */         d.a(d.a, x, y, w, h, 8.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().b()), 0.0F, 64, null);
/*     */         System.out.println("Potion ID = " + this.a.method_2450() + ", name = " + this.a.method_2456());
/*     */         class_860 potion = class_860.field_3164[this.a.method_2450()];
/*     */         Intrinsics.checkNotNullExpressionValue(potion.method_2433(), "");
/*     */         String potionName = StringsKt.replace$default(potion.method_2433(), "potion.", "", false, 4, null);
/*     */         d.a.a(potionName, x + 6.0F, y + 6.0F, h - 12.0F, h - 12.0F, 6.0F, anim);
/*     */         d.a.a(x + w - h / 2.0F, y + h / 2.0F, h / 3.0F, 360.0F, 360.0F - f() * 360.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().f()).a(3.0F));
/*     */         Intrinsics.checkNotNullExpressionValue(d(), "");
/*     */         d.b(d.a, d(), x + h, y + h / 2.0F, "medium", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */         Intrinsics.checkNotNullExpressionValue(e(), "");
/*     */         d.b(d.a, e(), x + w - h, y + h / 2.0F + true, "medium", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.RIGHT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */       } 
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final class_861 h() {
/*     */       return this.a;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final a b(class_861 effect) {
/*     */       Intrinsics.checkNotNullParameter(effect, "");
/*     */       return new a(effect);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Effect(effect=" + this.a + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.a.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof a))
/*     */         return false; 
/*     */       a a1 = (a)other;
/*     */       return !!Intrinsics.areEqual(this.a, a1.a);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */