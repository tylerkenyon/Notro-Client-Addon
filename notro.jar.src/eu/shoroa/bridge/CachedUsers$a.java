/*    */ package eu.shoroa.bridge;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   public final long a;
/*    */   public final ServerUser b;
/*    */   public final int c;
/*    */   
/*    */   public a(ServerUser user) {
/* 18 */     this.b = user;
/* 19 */     this.a = System.currentTimeMillis();
/* 20 */     this.c = CachedUsers.computeUserHash(user);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\CachedUsers$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */