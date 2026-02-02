/*    */ package eu.shoroa.notro.client.feature.a;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\020\007\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\026\020\027J\025\020\005\032\0020\0042\006\020\003\032\0020\002¢\006\004\b\005\020\006J'\020\013\032\0020\0042\006\020\003\032\0020\0072\006\020\t\032\0020\b2\006\020\n\032\0020\bH\026¢\006\004\b\013\020\fJ'\020\r\032\0020\0042\006\020\003\032\0020\0072\006\020\t\032\0020\b2\006\020\n\032\0020\bH\026¢\006\004\b\r\020\fR!\020\r\032\b\022\004\022\0020\0020\0168GX\002¢\006\f\n\004\b\005\020\017\032\004\b\020\020\021R!\020\013\032\b\022\004\022\0020\0020\0168GX\002¢\006\f\n\004\b\022\020\017\032\004\b\023\020\021R!\020\025\032\b\022\004\022\0020\0240\0168GX\002¢\006\f\n\004\b\013\020\017\032\004\b\025\020\021R!\020\022\032\b\022\004\022\0020\0020\0168GX\002¢\006\f\n\004\b\025\020\017\032\004\b\022\020\021"}, d2 = {"Leu/shoroa/notro/client/feature/a/f;", "Leu/shoroa/bridge/feature/b/b;", "", "p0", "", "e", "(F)V", "", "", "p1", "p2", "b", "(ZII)V", "a", "Leu/shoroa/bridge/feature/c/b;", "Leu/shoroa/bridge/feature/c/b;", "t", "()Leu/shoroa/bridge/feature/c/b;", "d", "s", "Leu/shoroa/bridge/feature/c/a/j;", "c", "<init>", "()V"})
/*    */ public final class f extends b { @NotNull
/*    */   private final b b; @NotNull
/*    */   private final b c; @NotNull
/*    */   private final b d; @NotNull
/*    */   private final b e;
/*    */   
/*  8 */   public f() { super("Motion Blur", "Makes the game feel smooth", false, "motionblur", false, 20, null);
/*  9 */     this.b = a("Smooth Target", j.BOTH);
/*    */     
/* 11 */     this.c = a("Strength", Float.valueOf(5.0F), Float.valueOf(0.0F), Float.valueOf(10.0F), Float.valueOf(0.1F)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() != j.BOTH)); } }
/*    */       );
/* 13 */     this.d = a("Gui Strength", Float.valueOf(5.0F), Float.valueOf(0.0F), Float.valueOf(10.0F), Float.valueOf(0.1F)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() == j.BOTH)); } }
/*    */       );
/* 15 */     this.e = a("Game Strength", Float.valueOf(5.0F), Float.valueOf(0.0F), Float.valueOf(10.0F), Float.valueOf(0.1F)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return Boolean.valueOf((this.a.c().b() == j.BOTH)); } }); }
/*    */   @NotNull @JvmName(name = "c") public final b<j> c() { return this.b.a(this, a[0]); }
/*    */   static { KProperty[] arrayOfKProperty = new KProperty[4]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "smoothTarget", "getSmoothTarget()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "strength", "getStrength()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "guiStrength", "getGuiStrength()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "gameStrength", "getGameStrength()Leu/shoroa/bridge/feature/setting/Setting;", 0));
/* 18 */     a = (KProperty<Object>[])arrayOfKProperty; } public void a(boolean nvg, int displayWidth, int displayHeight) { a(-1000.0F); }
/*    */   @NotNull @JvmName(name = "d") public final b<Float> d() { return this.c.a(this, a[1]); }
/*    */   @NotNull @JvmName(name = "s") public final b<Float> s() { return this.d.a(this, a[2]); }
/* 21 */   @NotNull @JvmName(name = "t") public final b<Float> t() { return this.e.a(this, a[3]); } public void b(boolean nvg, int displayWidth, int displayHeight) { a(nvg, displayWidth, displayHeight); }
/*    */ 
/*    */   
/*    */   public final void e(float f1) {
/* 25 */     if (b()) {
/* 26 */       float v = (float)Math.min(0.98D, (f1 / 10.0F));
/* 27 */       GL11.glAccum(259, v);
/* 28 */       GL11.glAccum(256, 1.0F - v);
/* 29 */       GL11.glAccum(258, 1.0F);
/*    */     } 
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */