/*    */ package eu.shoroa.bridge.ui.clickgui.comp;public abstract class b extends d { @NotNull
/*    */   private final String a; @NotNull
/*    */   private String b; @NotNull
/*    */   private String c; private final a d;
/*    */   @NotNull
/*    */   private final f e;
/*    */   
/*  8 */   public b(String icon, String name, String placeholder, float x, float y, float w, float h) { super(x, y, w, h); this.a = icon; this.b = name; this.c = placeholder;
/*  9 */     this.d = a.a(b::f, b::g);
/* 10 */     this.e = new f(); } @NotNull public final String a() { return this.a; } @NotNull public final String b() { return this.b; } public final void a(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.b = <set-?>; } @NotNull public final String c() { return this.c; } @NotNull public final f e() { return this.e; }
/*    */   public final void b(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.c = <set-?>; }
/* 12 */   @NotNull public Object clone() { return super.clone(); } public final a d() { return this.d; } private static final Float f() { return Float.valueOf(180.0F); } private static final eu.shoroa.bridge.b.a.b g() { return eu.shoroa.bridge.b.a.b.LINEAR; } public void c(String query) { Intrinsics.checkNotNullParameter(query, ""); }
/*    */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */