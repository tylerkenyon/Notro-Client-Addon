/*   */ package eu.shoroa.bridge;public final class a { @NotNull
/*   */   private final String a; @NotNull
/*   */   private final String b; @NotNull
/* 4 */   private final String c; public a(String id, String name, String type, String resourceLocation, boolean isAnimated, boolean selected) { this.a = id;
/* 5 */     this.b = name;
/* 6 */     this.c = type;
/* 7 */     this.d = resourceLocation;
/* 8 */     this.e = isAnimated;
/* 9 */     this.f = selected; } @NotNull private final String d; private final boolean e; private final boolean f; @NotNull public final String a() { return this.a; } @NotNull public final String b() { return this.b; } public final boolean f() { return this.f; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String c() {
/*   */     return this.c;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String d() {
/*   */     return this.d;
/*   */   }
/*   */   
/*   */   public final boolean e() {
/*   */     return this.e;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String g() {
/*   */     return this.a;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String h() {
/*   */     return this.b;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String i() {
/*   */     return this.c;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String j() {
/*   */     return this.d;
/*   */   }
/*   */   
/*   */   public final boolean k() {
/*   */     return this.e;
/*   */   }
/*   */   
/*   */   public final boolean l() {
/*   */     return this.f;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final a a(String id, String name, String type, String resourceLocation, boolean isAnimated, boolean selected) {
/*   */     Intrinsics.checkNotNullParameter(id, "");
/*   */     Intrinsics.checkNotNullParameter(name, "");
/*   */     Intrinsics.checkNotNullParameter(type, "");
/*   */     Intrinsics.checkNotNullParameter(resourceLocation, "");
/*   */     return new a(id, name, type, resourceLocation, isAnimated, selected);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "Cosmetic(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ", resourceLocation=" + this.d + ", isAnimated=" + this.e + ", selected=" + this.f + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.a.hashCode();
/*   */     result = result * 31 + this.b.hashCode();
/*   */     result = result * 31 + this.c.hashCode();
/*   */     result = result * 31 + this.d.hashCode();
/*   */     result = result * 31 + Boolean.hashCode(this.e);
/*   */     return result * 31 + Boolean.hashCode(this.f);
/*   */   }
/*   */   
/*   */   public boolean equals(Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof a))
/*   */       return false; 
/*   */     a a1 = (a)other;
/*   */     return !Intrinsics.areEqual(this.a, a1.a) ? false : (!Intrinsics.areEqual(this.b, a1.b) ? false : (!Intrinsics.areEqual(this.c, a1.c) ? false : (!Intrinsics.areEqual(this.d, a1.d) ? false : ((this.e != a1.e) ? false : (!(this.f != a1.f))))));
/*   */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */