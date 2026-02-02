/*    */ package eu.shoroa.bridge.d.e;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.a.b;
/*    */ 
/*    */ public final class f {
/*    */   private float a;
/*    */   private float b;
/*    */   
/*  9 */   public final float a() { return this.a; } private float c; private float d; private float e; public final void a(float <set-?>) { this.a = <set-?>; }
/*    */   
/* 11 */   public final float b() { return this.c; } public final void b(float <set-?>) { this.c = <set-?>; }
/*    */   
/*    */   public final float c() {
/* 14 */     Intrinsics.checkNotNull(b.a.c()); float wheel = b.a.c().scrollY();
/* 15 */     Intrinsics.checkNotNull(b.a.d()); float delta = 1.0F / b.a.d().fps();
/* 16 */     if (this.g) this.b = this.h ? (this.b - wheel / 120.0F * this.a) : (this.b + wheel / 120.0F * this.a); 
/* 17 */     float divider = (float)((delta * 2) * Math.min(this.f, this.d));
/* 18 */     if (this.c > this.b) {
/* 19 */       this.c -= (this.c - this.b) / 50 * divider;
/*    */     }
/* 21 */     if (this.c < this.b) {
/* 22 */       this.c += (this.b - this.c) / 50 * divider;
/*    */     }
/* 24 */     this.b = c.a(0.0F, (this.d > this.e) ? (this.d - this.e) : 0.0F, this.b);
/* 25 */     this.b = (int)(this.b * 100) / 100.0F;
/* 26 */     return this.c;
/*    */   }
/*    */   
/*    */   public final void d() {
/* 30 */     this.b = 0.0F;
/* 31 */     this.c = 0.0F;
/*    */   }
/*    */   
/* 34 */   public final float e() { return this.d; } public final void c(float <set-?>) { this.d = <set-?>; }
/* 35 */   public final float f() { return this.e; } public final void d(float <set-?>) { this.e = <set-?>; }
/* 36 */    private float f = 300.0F; public final float g() { return this.f; } public final void e(float <set-?>) { this.f = <set-?>; } private boolean g = true; private boolean h;
/* 37 */   public final boolean h() { return this.g; } public final void a(boolean <set-?>) { this.g = <set-?>; }
/* 38 */   public final boolean i() { return this.h; } public final void b(boolean <set-?>) { this.h = <set-?>; }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\e\f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */