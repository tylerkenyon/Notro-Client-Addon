/*    */ package eu.shoroa.bridge.d.b;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import org.lwjgl.system.MemoryUtil;
/*    */ 
/*    */ public class b
/*    */ {
/*    */   private static a a;
/*    */   
/*    */   public static void a(Object val) {
/* 11 */     a newObj = new a(val);
/* 12 */     a it = a(a);
/* 13 */     if (it == null) { a = newObj; }
/* 14 */     else { it.a = newObj; }
/*    */   
/*    */   }
/*    */   private static a a(a head) {
/*    */     a it;
/* 19 */     for (it = head; it != null && it.a != null; it = it.a);
/* 20 */     return it;
/*    */   }
/*    */   
/*    */   public static void a() {
/* 24 */     if (a != null) {
/*    */       
/* 26 */       for (a it = a; it.a != null; it = it.a) {
/* 27 */         if (it.b instanceof Buffer) {
/* 28 */           MemoryUtil.memFree((Buffer)it.b);
/*    */         }
/*    */       } 
/* 31 */       a = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   private static class a { a a;
/*    */     Object b;
/*    */     
/*    */     a(Object v) {
/* 39 */       this.b = v;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\b\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */