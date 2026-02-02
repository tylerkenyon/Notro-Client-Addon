/*    */ package eu.shoroa.bridge.b.b;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class a
/*    */ {
/*    */   private a() {}
/*    */   
/*    */   @NotNull
/*    */   public final d a(Color color) {
/* 36 */     Intrinsics.checkNotNullParameter(color, ""); return new d(color, c.SOLID, null);
/*    */   } @NotNull
/*    */   public final d a(Color from, Color to, b constrain) {
/* 39 */     Intrinsics.checkNotNullParameter(from, ""); Intrinsics.checkNotNullParameter(to, ""); Intrinsics.checkNotNullParameter(constrain, ""); return new d(from, to, constrain, c.SOLID, null);
/*    */   } @NotNull
/*    */   public final d a() {
/* 42 */     Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); return new d(Color.BLACK, c.BLUR, null);
/*    */   } @NotNull
/*    */   public final d b() {
/* 45 */     Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); return new d(Color.BLACK, c.TOPOLOGY, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\b\d$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */