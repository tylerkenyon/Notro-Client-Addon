/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.b.b;
/*    */ import eu.shoroa.bridge.ui.clickgui.comp.module.comp.a;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Ref;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/feature/b/b;", "p0", "", "a", "(Leu/shoroa/bridge/feature/b/b;)V"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<b, Unit>
/*    */ {
/*    */   public final void a(b module) {
/* 56 */     Intrinsics.checkNotNullParameter(module, ""); if (a.d(this.a)) {
/* 57 */       float f = this.$d.element; this.$d.element = f + 1.0F; a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70 + f * 70, this.$e - 20, 60.0F, a.d(this.a));
/* 58 */       this.a.f().add(elementModule);
/* 59 */       this.a.g().add(elementModule);
/*    */     } else {
/* 61 */       a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70, a.b(this.a), a.c(this.a), a.d(this.a));
/* 62 */       this.a.f().add(elementModule);
/* 63 */       this.a.g().add(elementModule);
/* 64 */       float f = this.$d.element; this.$d.element = f + 1.0F;
/*    */     } 
/*    */   }
/*    */   
/*    */   null(a $receiver, float $x, float $y, Ref.FloatRef $i, float $w) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\a$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */