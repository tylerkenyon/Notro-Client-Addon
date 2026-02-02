/*    */ package eu.shoroa.bridge.ui.a.a.a;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\020\021\n\002\020\016\n\000\n\002\020\002\n\002\b\007\n\002\020\013\n\002\b\n\b&\030\0002\0020\001B)\022\006\020\004\032\0020\003\022\006\020\023\032\0020\003\022\006\020\024\032\0020\003\022\b\b\002\020\025\032\0020\r¢\006\004\b\026\020\027J\035\020\006\032\0020\0052\f\020\004\032\b\022\004\022\0020\0030\002H&¢\006\004\b\006\020\007J\017\020\b\032\0020\003H\007¢\006\004\b\b\020\tJ\017\020\n\032\0020\003H\007¢\006\004\b\n\020\tR\032\020\006\032\0020\0038\007X\004¢\006\f\n\004\b\013\020\f\032\004\b\013\020\tR\032\020\013\032\0020\r8\007X\004¢\006\f\n\004\b\016\020\017\032\004\b\016\020\020R\"\020\022\032\0020\0038\007@\007X\016¢\006\022\n\004\b\006\020\f\032\004\b\006\020\t\"\004\b\006\020\021R\032\020\016\032\0020\0038\007X\004¢\006\f\n\004\b\022\020\f\032\004\b\022\020\t"}, d2 = {"Leu/shoroa/bridge/ui/a/a/a/a;", "", "", "", "p0", "", "a", "([Ljava/lang/String;)V", "f", "()Ljava/lang/String;", "e", "b", "Ljava/lang/String;", "", "d", "Z", "()Z", "(Ljava/lang/String;)V", "c", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V"}) public abstract class a { @NotNull
/*    */   private String a; @NotNull
/*  3 */   private final String b; public a(String name, String description, String usage, boolean excludeFromHelp) { this.a = name; this.b = description; this.c = usage; this.d = excludeFromHelp; } @NotNull private final String c; private final boolean d; @NotNull @JvmName(name = "a") public final String a() { return this.a; } @JvmName(name = "a") public final void a(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.a = <set-?>; } @NotNull @JvmName(name = "b") public final String b() { return this.b; } @NotNull @JvmName(name = "c") public final String c() { return this.c; } @JvmName(name = "d") public final boolean d() { return this.d; }
/*    */    public abstract void a(String[] paramArrayOfString);
/*    */   @NotNull
/*    */   public final String e() {
/*  7 */     return "    - " + this.a + " " + this.c;
/*    */   }
/*    */   @NotNull
/*    */   public final String f() {
/* 11 */     return "Usage: " + this.c;
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\a\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */