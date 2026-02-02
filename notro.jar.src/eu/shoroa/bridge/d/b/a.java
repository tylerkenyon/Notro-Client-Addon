/*    */ package eu.shoroa.bridge.d.b;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\020!\n\002\020\t\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\n\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\025\020\026J\035\020\006\032\0020\0052\f\020\004\032\b\022\004\022\0020\0030\002H\002¢\006\004\b\006\020\007J\025\020\t\032\0020\b2\006\020\004\032\0020\005¢\006\004\b\t\020\nJ&\020\006\032\0020\b2\027\020\004\032\023\022\004\022\0020\000\022\004\022\0020\b0\013¢\006\002\b\f¢\006\004\b\006\020\rR\034\020\006\032\b\022\004\022\0020\0030\0028\002@\002X\016¢\006\006\n\004\b\t\020\016R\034\020\017\032\b\022\004\022\0020\0030\0028\002@\002X\016¢\006\006\n\004\b\017\020\016R\021\020\t\032\0020\0058G¢\006\006\032\004\b\t\020\020R\"\020\021\032\0020\0058\007@\007X\016¢\006\022\n\004\b\021\020\022\032\004\b\006\020\020\"\004\b\006\020\nR\021\020\023\032\0020\0058G¢\006\006\032\004\b\021\020\020R\"\020\024\032\0020\0058\007@\007X\016¢\006\022\n\004\b\023\020\022\032\004\b\017\020\020\"\004\b\017\020\n"}, d2 = {"Leu/shoroa/bridge/d/b/a;", "", "", "", "p0", "", "a", "(Ljava/util/List;)I", "", "c", "(I)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/util/List;", "b", "()I", "d", "I", "e", "f", "<init>", "()V"})
/*    */ public final class a {
/*    */   @NotNull
/*  4 */   public static final a INSTANCE = new a(); @NotNull private static List<Long> b = new ArrayList<>(); @NotNull
/*  5 */   private static List<Long> c = new ArrayList<>();
/*    */   private static int d; private static int e; @JvmName(name = "a")
/*  7 */   public final int a() { return d; } @JvmName(name = "a") public final void a(int <set-?>) { d = <set-?>; } @JvmName(name = "b")
/*  8 */   public final int b() { return e; } @JvmName(name = "b") public final void b(int <set-?>) { e = <set-?>; }
/*    */   
/*    */   public final void a(Function1 update) {
/* 11 */     Intrinsics.checkNotNullParameter(update, ""); update.invoke(this);
/*    */   }
/*    */   
/*    */   public final void c(int code) {
/* 15 */     long currentTime = System.currentTimeMillis();
/* 16 */     if (code == d)
/*    */     {
/* 18 */       if (c.isEmpty() || currentTime - ((Number)CollectionsKt.last(c)).longValue() > 10L) {
/* 19 */         c.add(Long.valueOf(currentTime));
/*    */       }
/*    */     }
/* 22 */     if (code == e && (
/* 23 */       b.isEmpty() || currentTime - ((Number)CollectionsKt.last(b)).longValue() > 10L)) {
/* 24 */       b.add(Long.valueOf(currentTime));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private final int a(List list) {
/* 30 */     long currentTime = System.currentTimeMillis();
/* 31 */     list.removeIf(new Function1<Long, Boolean>(currentTime) { @NotNull public final Boolean a(Long t) { Intrinsics.checkNotNullParameter(t, ""); return Boolean.valueOf((this.$a - t.longValue() > 1000L)); } }::a);
/* 32 */     return list.size();
/*    */   } private static final boolean a(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "");
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @JvmName(name = "c")
/* 35 */   public final int c() { return a(c); } @JvmName(name = "d")
/* 36 */   public final int d() { return a(b); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\b\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */