/*    */ package eu.shoroa.notro.client.feature.a;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\t\030\0002\0020\001B\007¢\006\004\b\023\020\024J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\004H\026¢\006\004\b\b\020\tJ'\020\n\032\0020\0072\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\004H\026¢\006\004\b\n\020\tR!\020\n\032\b\022\004\022\0020\0020\0138GX\002¢\006\f\n\004\b\f\020\r\032\004\b\016\020\017R!\020\b\032\b\022\004\022\0020\0020\0138GX\002¢\006\f\n\004\b\020\020\r\032\004\b\021\020\017R!\020\f\032\b\022\004\022\0020\0020\0138GX\002¢\006\f\n\004\b\016\020\r\032\004\b\022\020\017R!\020\016\032\b\022\004\022\0020\0020\0138GX\002¢\006\f\n\004\b\b\020\r\032\004\b\f\020\017"}, d2 = {"Leu/shoroa/notro/client/feature/a/a;", "Leu/shoroa/bridge/feature/b/b;", "", "p0", "", "p1", "p2", "", "b", "(ZII)V", "a", "Leu/shoroa/bridge/feature/c/b;", "c", "Leu/shoroa/bridge/feature/c/b;", "d", "()Leu/shoroa/bridge/feature/c/b;", "e", "t", "s", "<init>", "()V"})
/*    */ public final class a extends b { @NotNull
/*    */   private final b b; @NotNull
/*  5 */   private final b c; public a() { super("1.7 Animations", "Block hit animation from 1.7", false, "animations", false, 20, null);
/*  6 */     this.b = a("Third Person", true);
/*  7 */     this.c = a("Red Armor", true);
/*  8 */     this.d = a("Sword Blocking", true);
/*  9 */     this.e = a("Smooth Hitting", false); } @NotNull private final b d; @NotNull private final b e; @NotNull @JvmName(name = "c") public final b<Boolean> c() { return this.b.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[4]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(a.class, "thirdPerson", "getThirdPerson()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(a.class, "redArmor", "getRedArmor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(a.class, "swordBlocking", "getSwordBlocking()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(a.class, "smoothHitting", "getSmoothHitting()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @NotNull @JvmName(name = "d") public final b<Boolean> d() { return this.c.a(this, a[1]); } @NotNull @JvmName(name = "s") public final b<Boolean> s() { return this.d.a(this, a[2]); } @NotNull @JvmName(name = "t") public final b<Boolean> t() { return this.e.a(this, a[3]); }
/*    */   
/*    */   public void a(boolean nvg, int displayWidth, int displayHeight) {
/* 12 */     a(-100.0F).b(l());
/*    */   }
/*    */   public void b(boolean nvg, int displayWidth, int displayHeight) {
/* 15 */     a(nvg, displayWidth, displayHeight);
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */