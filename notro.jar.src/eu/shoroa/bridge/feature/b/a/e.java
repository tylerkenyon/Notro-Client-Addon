/*    */ package eu.shoroa.bridge.feature.b.a;public final class e extends b { @NotNull
/*    */   private final b b; @NotNull
/*    */   private final b c; @NotNull
/*    */   private final b d; @NotNull
/*  5 */   private final b e; public e() { super("Shader", "Options of UI shaders", false, "shaders", false, 20, null);
/*  6 */     this.b = a("Blur strength", Float.valueOf(25.0F), (ClosedRange)RangesKt.rangeTo(1.0F, 100.0F), Float.valueOf(1.0F));
/*  7 */     this.c = a("Topology speed", Float.valueOf(1.0F), (ClosedRange)RangesKt.rangeTo(1.0F, 10.0F), Float.valueOf(1.0F));
/*  8 */     this.d = a("Topology Color Background", 1973790);
/*  9 */     this.e = a("Topology Color Lines", 5526612);
/*    */ 
/*    */     
/* 12 */     a(); }
/*    */   @NotNull public final b<Float> c() { return this.b.a(this, a[0]); }
/*    */   static { KProperty[] arrayOfKProperty = new KProperty[4]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(e.class, "blurStrength", "getBlurStrength()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(e.class, "topologySpeed", "getTopologySpeed()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(e.class, "topologyColorBackground", "getTopologyColorBackground()Leu/shoroa/bridge/feature/setting/Setting;", 0));
/*    */     arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(e.class, "topologyColorLines", "getTopologyColorLines()Leu/shoroa/bridge/feature/setting/Setting;", 0));
/* 16 */     a = (KProperty<Object>[])arrayOfKProperty; } public void a(boolean nvg, int displayWidth, int displayHeight) { a(-100.0F); }
/*    */   @NotNull public final b<Float> d() { return this.c.a(this, a[1]); }
/*    */   @NotNull public final b<Color> s() { return this.d.a(this, a[2]); }
/* 19 */   @NotNull public final b<Color> t() { return this.e.a(this, a[3]); } public void b(boolean nvg, int displayWidth, int displayHeight) { a(nvg, displayWidth, displayHeight); }
/*    */ 
/*    */   
/*    */   public void a(boolean in) {
/* 23 */     super.a(in);
/*    */     
/* 25 */     if (!in)
/* 26 */       a(); 
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */