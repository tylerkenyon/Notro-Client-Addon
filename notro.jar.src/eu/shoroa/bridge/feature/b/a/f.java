/*    */ package eu.shoroa.bridge.feature.b.a;
/*    */ public final class f extends b { @NotNull
/*    */   private final b b; @NotNull
/*    */   private final b c;
/*    */   
/*  6 */   public f() { super("Time Changer", "Change the time of the world", true, "timechanger", false, 16, null);
/*  7 */     this.b = a("Time", Long.valueOf(2300L), (ClosedRange)new LongRange(0L, 2400L), Long.valueOf(1L));
/*  8 */     this.c = a("Dynamic", false);
/*    */     
/* 10 */     this.d = a("Dynamic Length (Seconds)", Long.valueOf(1L), (ClosedRange)new LongRange(1L, 600L), Long.valueOf(1L)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return (Boolean)this.a.d().b(); } });
/* 11 */     this.e = a("Preset", a.SUNRISE); } @NotNull private final b d; @NotNull private final b e; private long f; @NotNull public final b<Long> c() { return this.b.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[4]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "time", "getTime()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "dynamic", "getDynamic()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "dynamicLength", "getDynamicLength()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(f.class, "timePreset", "getTimePreset()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @NotNull public final b<Boolean> d() { return this.c.a(this, a[1]); } @NotNull public final b<Long> s() { return this.d.a(this, a[2]); } @NotNull public final b<a> t() { return this.e.a(this, a[3]); }
/* 12 */   public final long u() { return this.f; } public final void a(long <set-?>) { this.f = <set-?>; }
/*    */    public void a(boolean nvg, int displayWidth, int displayHeight) {
/* 14 */     c().a(new Function1<b<Long>, Unit>(this) { public final void a(b $this$onChange) {
/* 15 */             Intrinsics.checkNotNullParameter($this$onChange, ""); if (this.a.t().b() != f.a.CUSTOM) {
/* 16 */               this.a.t().a(f.a.CUSTOM);
/*    */             }
/*    */           } }
/*    */       );
/* 20 */     t().a(new Function1<b<a>, Unit>(this) { public final void a(b $this$onChange) {
/* 21 */             Intrinsics.checkNotNullParameter($this$onChange, ""); if ($this$onChange.b() != f.a.CUSTOM && $this$onChange.b() != f.a.DYNAMIC) {
/* 22 */               this.a.c().a(Long.valueOf(((f.a)$this$onChange.b()).a()));
/* 23 */               this.a.d().a(Boolean.valueOf(false));
/* 24 */             } else if ($this$onChange.b() == f.a.DYNAMIC) {
/* 25 */               this.a.d().a(Boolean.valueOf(true));
/*    */             } 
/*    */           } }
/*    */       );
/* 29 */     long maxTime = ((Number)s().b()).longValue();
/* 30 */     this.f = (long)((float)(System.currentTimeMillis() % maxTime * 1000L) / (float)maxTime * 1000.0F * (float)24000L);
/*    */   } public void b(boolean nvg, int displayWidth, int displayHeight) {
/* 32 */     a(nvg, displayWidth, displayHeight);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\020\n\002\020\t\n\002\b\r\b\001\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\006\032\0020\002¢\006\004\b\007\020\bR\032\020\003\032\0020\0028\007X\004¢\006\f\n\004\b\003\020\004\032\004\b\003\020\005j\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017"}, d2 = {"Leu/shoroa/bridge/feature/b/a/f$a;", "", "", "a", "J", "()J", "p0", "<init>", "(Ljava/lang/String;IJ)V", "SUNRISE", "DAY", "SUNSET", "NIGHT", "MIDNIGHT", "DYNAMIC", "CUSTOM"})
/* 36 */   public enum a { SUNRISE(2300L),
/* 37 */     DAY(0L),
/* 38 */     SUNSET(1244L),
/* 39 */     NIGHT(1300L),
/* 40 */     MIDNIGHT(1800L),
/* 41 */     DYNAMIC(-1L),
/* 42 */     CUSTOM(-1L); private final long a; a(long time) { this.a = time; }
/*    */     @JvmName(name = "a") public final long a() { return this.a; }
/*    */     @NotNull
/*    */     public static EnumEntries<a> b() { return c; } }
/* 46 */   public final long v() { if (((Boolean)d().b()).booleanValue()) {
/* 47 */       return this.f;
/*    */     }
/* 49 */     return ((Number)c().b()).longValue() * 10L; }
/*    */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */