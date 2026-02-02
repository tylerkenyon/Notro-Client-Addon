/*    */ package eu.shoroa.bridge.feature.b.a;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.c.b;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\020\003\032\0020\002*\b\022\004\022\0020\0010\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/feature/c/b;", "Leu/shoroa/bridge/feature/b/a/f$a;", "", "a", "(Leu/shoroa/bridge/feature/c/b;)V"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<b<f.a>, Unit>
/*    */ {
/*    */   public final void a(b $this$onChange) {
/* 21 */     Intrinsics.checkNotNullParameter($this$onChange, ""); if ($this$onChange.b() != f.a.CUSTOM && $this$onChange.b() != f.a.DYNAMIC) {
/* 22 */       this.a.c().a(Long.valueOf(((f.a)$this$onChange.b()).a()));
/* 23 */       this.a.d().a(Boolean.valueOf(false));
/* 24 */     } else if ($this$onChange.b() == f.a.DYNAMIC) {
/* 25 */       this.a.d().a(Boolean.valueOf(true));
/*    */     } 
/*    */   }
/*    */   
/*    */   null(f $receiver) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\f$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */