/*    */ package eu.shoroa.bridge.feature.b.b;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\020$\n\002\020\016\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\020\b\n\002\b\f\030\000 \r2\0020\001:\001\rB\037\022\006\020\027\032\0020\003\022\006\020\030\032\0020\017\022\006\020\031\032\0020\t¢\006\004\b\032\020\033J\033\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\002H\007¢\006\004\b\004\020\005J\r\020\007\032\0020\006¢\006\004\b\007\020\bR\"\020\r\032\0020\t8\007@\007X\016¢\006\022\n\004\b\007\020\n\032\004\b\013\020\f\"\004\b\r\020\016R\"\020\021\032\0020\0178\007@\007X\016¢\006\022\n\004\b\013\020\020\032\004\b\021\020\022\"\004\b\r\020\023R\"\020\013\032\0020\0038\007@\007X\016¢\006\022\n\004\b\021\020\024\032\004\b\r\020\025\"\004\b\r\020\026"}, d2 = {"Leu/shoroa/bridge/feature/b/b/a;", "", "", "", "e", "()Ljava/util/Map;", "", "d", "()V", "", "Z", "c", "()Z", "a", "(Z)V", "", "I", "b", "()I", "(I)V", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;IZ)V"}) public final class a { @NotNull
/*    */   public static final a a = new a(null); @NotNull
/*  3 */   private String b; public a(String text, int key, boolean enabled) { this.b = text; this.c = key; this.d = enabled; } private int c; private boolean d; @NotNull @JvmName(name = "a") public final String a() { return this.b; } @JvmName(name = "a") public final void a(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.b = <set-?>; } @JvmName(name = "b") public final int b() { return this.c; } @JvmName(name = "a") public final void a(int <set-?>) { this.c = <set-?>; } @JvmName(name = "c") public final boolean c() { return this.d; } @JvmName(name = "a") public final void a(boolean <set-?>) { this.d = <set-?>; }
/*    */    public final void d() {
/*  5 */     this.d = !this.d;
/*    */   } @NotNull
/*    */   public final Map<String, Object> e() {
/*  8 */     Pair[] arrayOfPair = new Pair[3]; arrayOfPair[0] = TuplesKt.to("key", Integer.valueOf(this.c)); arrayOfPair[1] = 
/*  9 */       TuplesKt.to("text", this.b);
/* 10 */     arrayOfPair[2] = TuplesKt.to("enabled", Boolean.valueOf(this.d));
/*    */     return MapsKt.mapOf(arrayOfPair);
/*    */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\020$\n\002\020\016\n\000\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\b\020\tJ#\020\006\032\0020\0052\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\002H\007¢\006\004\b\006\020\007"}, d2 = {"Leu/shoroa/bridge/feature/b/b/a$a;", "", "", "", "p0", "Leu/shoroa/bridge/feature/b/b/a;", "a", "(Ljava/util/Map;)Leu/shoroa/bridge/feature/b/b/a;", "<init>", "()V"})
/*    */   public static final class a { private a() {} @NotNull
/*    */     public final a a(Map map) {
/* 15 */       Intrinsics.checkNotNullParameter(map, "");
/* 16 */       Intrinsics.checkNotNull(map.get("text"));
/* 17 */       Intrinsics.checkNotNull(map.get("key"));
/* 18 */       Object object = map.get("enabled"); (object instanceof Boolean) ? object : null; return new a((String)map.get("text"), ((Number)map.get("key")).intValue(), (((object instanceof Boolean) ? object : null) != null) ? ((object instanceof Boolean) ? object : null).booleanValue() : true);
/*    */     } }
/*    */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\b\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */