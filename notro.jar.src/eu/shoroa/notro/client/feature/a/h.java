/*    */ package eu.shoroa.notro.client.feature.a;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.c.b;
/*    */ import eu.shoroa.notro.b.a;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.PropertyReference1;
/*    */ import kotlin.reflect.KProperty;
/*    */ import net.minecraft.class_1071;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_1699;
/*    */ import net.minecraft.class_2562;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J'\020\n\032\0020\t2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\006H\026¢\006\004\b\n\020\013J\025\020\016\032\0020\t2\006\020\r\032\0020\f¢\006\004\b\016\020\017J'\020\020\032\0020\t2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\006H\026¢\006\004\b\020\020\013J\037\020\024\032\0020\t2\006\020\022\032\0020\0212\006\020\r\032\0020\023H\002¢\006\004\b\024\020\025R!\020\033\032\b\022\004\022\0020\0040\0268FX\002¢\006\f\n\004\b\027\020\030\032\004\b\031\020\032R!\020\037\032\b\022\004\022\0020\0340\0268FX\002¢\006\f\n\004\b\035\020\030\032\004\b\036\020\032R\024\020!\032\0020 8\002X\004¢\006\006\n\004\b!\020\"¨\006#"}, d2 = {"Leu/shoroa/notro/client/feature/module/ModuleParticleMultiplier;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "", "nvg", "", "displayWidth", "displayHeight", "", "dummy", "(ZII)V", "Leu/shoroa/notro/event/EventEntityHurt;", "e", "onEntityHurt", "(Leu/shoroa/notro/event/EventEntityHurt;)V", "render", "Lnet/minecraft/class_2562;", "particleType", "Lnet/minecraft/class_1699;", "spawnParticles", "(Lnet/minecraft/class_2562;Lnet/minecraft/class_1699;)V", "Leu/shoroa/bridge/feature/setting/Setting;", "forceSharpness$delegate", "Leu/shoroa/bridge/feature/setting/Setting;", "getForceSharpness", "()Leu/shoroa/bridge/feature/setting/Setting;", "forceSharpness", "", "multiplyBy$delegate", "getMultiplyBy", "multiplyBy", "Ljava/util/Random;", "rand", "Ljava/util/Random;", "NotroClient"})
/*    */ public final class h extends b {
/*    */   @NotNull
/*    */   private final b b;
/*    */   
/* 19 */   public h() { super("Particle Multiplier", "Multiplies the hit particles by a set amount", true, "particlemultiplier", false, 16, null);
/* 20 */     this.b = a("Force Sharpness Particles", false);
/* 21 */     this.c = a("Multiplier", Float.valueOf(1.0F), (ClosedRange)RangesKt.rangeTo(1.0F, 20.0F), Float.valueOf(1.0F));
/* 22 */     this.d = new Random();
/*    */ 
/*    */     
/* 25 */     Client.instance.getBus().subscribe(a.class, this::a); }
/* 26 */   @NotNull private final b c; @NotNull private final Random d; @NotNull public final b<Boolean> c() { return this.b.a(this, a[0]); } private static final void a(h this$0, a event) { Intrinsics.checkNotNullParameter(this$0, ""); Intrinsics.checkNotNull(event); this$0.a(event); } static { KProperty[] arrayOfKProperty = new KProperty[2];
/*    */     arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(h.class, "forceSharpness", "getForceSharpness()Leu/shoroa/bridge/feature/setting/Setting;", 0));
/*    */     arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(h.class, "multiplyBy", "getMultiplyBy()Leu/shoroa/bridge/feature/setting/Setting;", 0));
/*    */     a = (KProperty<Object>[])arrayOfKProperty; }
/*    */   @NotNull public final b<Float> d() { return this.c.a(this, a[1]); }
/* 31 */   public final void a(a e) { Intrinsics.checkNotNullParameter(e, ""); class_1600 mc = class_1600.method_2965();
/*    */     
/* 33 */     if (e.b() instanceof net.minecraft.class_988 && !Intrinsics.areEqual(e.b(), mc.field_10310)) {
/* 34 */       if (((Boolean)c().b()).booleanValue()) {
/* 35 */         Intrinsics.checkNotNull(e.b()); a(class_2562.field_11513, (class_1699)e.b());
/*    */       } else {
/* 37 */         if (mc.field_10310.field_3197) { Intrinsics.checkNotNull(e.b()); a(class_2562.field_11512, (class_1699)e.b()); }
/* 38 */          Intrinsics.checkNotNullExpressionValue(mc.field_10310.method_2640(), ""); class_1071 heldItem = mc.field_10310.method_2640();
/* 39 */         if (heldItem.method_3421() instanceof net.minecraft.class_1101 && 
/* 40 */           heldItem.method_3452() && class_1129.method_3519(
/* 41 */             class_1127.field_9173.field_4476, 
/* 42 */             heldItem) >= 
/* 43 */           1) {
/*    */           
/* 45 */           Intrinsics.checkNotNull(e.b()); a(class_2562.field_11513, (class_1699)e.b());
/*    */         } 
/*    */       } 
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   private final void a(class_2562 particleType, class_1699 e) {
/* 53 */     for (int i = 0, j = 5 * (int)((Number)d().b()).floatValue(); i < j; i++)
/* 54 */       (class_1600.method_2965()).field_3807.method_9707((class_864)e, particleType); 
/*    */   }
/*    */   
/*    */   public void a(boolean nvg, int displayWidth, int displayHeight) {}
/*    */   
/*    */   public void b(boolean nvg, int displayWidth, int displayHeight) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\h.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */