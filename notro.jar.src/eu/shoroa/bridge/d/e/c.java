/*    */ package eu.shoroa.bridge.d.e;
/*    */ 
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ public final class c {
/*  6 */   public final boolean a() { return this.a; } private boolean a; public final void a(boolean <set-?>) { this.a = <set-?>; }
/*    */    public final void b() {
/*  8 */     this.a = true;
/*    */   }
/*    */   
/*    */   public final void c() {
/* 12 */     this.a = false;
/*    */   }
/*    */   
/*    */   public final void a(Function1 setX, Function1 setY) {
/* 16 */     Intrinsics.checkNotNullParameter(setX, ""); Intrinsics.checkNotNullParameter(setY, ""); if (this.a) {
/* 17 */       Intrinsics.checkNotNull(b.a.c()); setX.invoke(Float.valueOf(b.a.c().mouseX()));
/* 18 */       Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); setY.invoke(Float.valueOf(b.a.e().height() - b.a.c().mouseY()));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\e\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */