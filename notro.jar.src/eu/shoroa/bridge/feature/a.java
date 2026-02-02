/*    */ package eu.shoroa.bridge.feature;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ public class a {
/*    */   private boolean a;
/*    */   
/*    */   public final void a() {
/* 10 */     b(!b());
/* 11 */     a(b());
/*    */   }
/*    */   public void a(boolean in) {}
/*    */   public final void b(boolean in) {
/* 15 */     this.a = in;
/* 16 */     c();
/*    */   }
/*    */   
/*    */   private final void c() {
/* 20 */     if (b()) { Intrinsics.checkNotNull(BridgeClient.a.b()); BridgeClient.a.b().getBus().subscribe(this); } else { Intrinsics.checkNotNull(BridgeClient.a.b()); BridgeClient.a.b().getBus().unsubscribe(this); }
/*    */   
/*    */   } public final boolean b() {
/* 23 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */