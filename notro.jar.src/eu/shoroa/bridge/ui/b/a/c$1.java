/*    */ package eu.shoroa.bridge.ui.b.a;
/*    */ 
/*    */ import eu.shoroa.bridge.ui.b.c;
/*    */ import eu.shoroa.bridge.ui.b.h;
/*    */ import java.awt.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.CharsKt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/ui/b/h;", "p0", "", "a", "(Leu/shoroa/bridge/ui/b/h;)V"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<h, Unit>
/*    */ {
/*    */   public final void a(h it) {
/* 23 */     Intrinsics.checkNotNullParameter(it, ""); String t = it.b();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     int r = a(t, 1, 3);
/* 33 */     int g = a(t, 3, 5);
/* 34 */     int b = a(t, 5, 7);
/* 35 */     int a = (t.length() > 7) ? a(t, 7, 9) : 255;
/* 36 */     Intrinsics.checkNotNull(this.a.getElements().get(0)); ((c)this.a.getElements().get(0)).b(new Color(r, g, b, a));
/*    */   }
/*    */   
/*    */   private static final int a(String colorString, int start, int end) {
/*    */     boolean bool;
/*    */     try {
/*    */       Intrinsics.checkNotNullExpressionValue(colorString.substring(start, end), "");
/*    */       bool = Integer.parseInt(colorString.substring(start, end), CharsKt.checkRadix(16));
/*    */     } catch (Exception e) {
/*    */       bool = false;
/*    */     } 
/*    */     return bool;
/*    */   }
/*    */   
/*    */   null(c $receiver) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\a\c$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */