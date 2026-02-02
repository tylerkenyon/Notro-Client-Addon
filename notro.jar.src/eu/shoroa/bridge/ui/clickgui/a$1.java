/*    */ package eu.shoroa.bridge.ui.clickgui;
/*    */ 
/*    */ import eu.shoroa.bridge.ui.b.f;
/*    */ import eu.shoroa.bridge.ui.clickgui.comp.b;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/ui/b/f;", "p0", "", "a", "(Leu/shoroa/bridge/ui/b/f;)V"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<f, Unit>
/*    */ {
/*    */   public final void a(f it) {
/* 49 */     Intrinsics.checkNotNullParameter(it, ""); String query = StringsKt.trim(it.a()).toString();
/* 50 */     b page = this.a.a().b(); int $i$a$-let-Panel$1$1 = 0;
/*    */     try {
/* 52 */       page.c(query);
/* 53 */     } catch (Exception exception) {}
/*    */     this.a.a().b();
/*    */   }
/*    */   
/*    */   null(a $receiver) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\a$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */