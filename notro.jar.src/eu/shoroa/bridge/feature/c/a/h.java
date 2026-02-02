/*    */ package eu.shoroa.bridge.feature.c.a;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.c.b;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public final class h<T extends Comparable<? super T>> extends b<T> {
/*    */   @NotNull
/*    */   private final T a;
/*    */   
/*    */   public h(String name, Comparable defaultValue, Comparable min, Comparable max, Comparable step) {
/* 11 */     super(name, defaultValue);
/*    */     
/*    */     this.a = (T)defaultValue;
/* 14 */     b(min);
/* 15 */     c(max);
/* 16 */     d(step);
/*    */   } @NotNull
/*    */   public Object h() {
/* 19 */     return b();
/*    */   }
/*    */   
/*    */   public void e(Object v) {
/* 23 */     if (!(v instanceof Number))
/*    */       return; 
/* 25 */     T t = this.a; a(
/* 26 */         (t instanceof Float) ? Float.valueOf(((Number)v).floatValue()) : (
/* 27 */         (t instanceof Double) ? Double.valueOf(((Number)v).doubleValue()) : (
/* 28 */         (t instanceof Integer) ? Integer.valueOf(((Number)v).intValue()) : (
/* 29 */         (t instanceof Long) ? Long.valueOf(((Number)v).longValue()) : 
/* 30 */         b()))));
/*    */ 
/*    */     
/* 33 */     g();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\c\a\h.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */