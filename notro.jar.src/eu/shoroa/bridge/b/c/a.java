/*    */ package eu.shoroa.bridge.b.c;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class a
/*    */ {
/*  7 */   private int a = -8; public final int a() { return this.a; } public final void a(int <set-?>) { this.a = <set-?>; }
/*    */    public abstract void a(float paramFloat);
/*    */   protected final float a(float x, float sigma) {
/* 10 */     double PI = 3.141592653D;
/* 11 */     double output = 1.0D / Math.sqrt(2.0D * PI * (sigma * sigma));
/* 12 */     return (float)(output * Math.exp(-(x * x) / 2.0D * (sigma * sigma)));
/*    */   }
/*    */   
/*    */   public abstract void b();
/*    */   
/*    */   public abstract void c();
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\c\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */