/*    */ package eu.shoroa.notro.bridge;
/*    */ 
/*    */ import eu.shoroa.bridge.b.d.a;
/*    */ import eu.shoroa.bridge.b.d.b;
/*    */ import eu.shoroa.bridge.feature.a.b;
/*    */ import eu.shoroa.bridge.ui.b.a.d;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "invoke", "()V"})
/*    */ final class HolderScreen$drawScreen$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 32 */     Intrinsics.checkNotNull(HolderScreen.this.getScreen()); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.d()); HolderScreen.this.getScreen().render(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), 1.0F / b.a.d().fps());
/*    */ 
/*    */     
/* 35 */     if (!d.a.a().isEmpty()) {
/* 36 */       Intrinsics.checkNotNullExpressionValue(d.a.a().get(0), ""); d widget = (d)d.a.a().get(0);
/* 37 */       float anim = widget.e().a();
/*    */       
/* 39 */       if (((anim == 0.0F)) && !widget.f()) {
/* 40 */         d.a.a().remove(widget);
/*    */         
/*    */         return;
/*    */       } 
/* 44 */       b.INSTANCE.c(anim);
/* 45 */       Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.e()); a.a.a(1.0F - (true - anim) / 8.0F, b.a.e().width() / 2.0F, b.a.e().height() / 2.0F, new Function0<Unit>(widget) {
/* 46 */             public final void invoke() { Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.d()); this.$$widget.render(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), 1.0F / b.a.d().fps()); }
/*    */           });
/* 48 */       b.INSTANCE.c(1.0F);
/*    */     } 
/*    */   }
/*    */   
/*    */   HolderScreen$drawScreen$1() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\HolderScreen$drawScreen$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */