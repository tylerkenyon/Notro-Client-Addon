/*    */ package eu.shoroa.bridge.ui;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.b.b;
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
/*    */   public final void a(b other) {
/* 70 */     Intrinsics.checkNotNullParameter(other, ""); if (other != this.$a && other.b()) {
/*    */       
/* 72 */       if (Math.abs(this.$b.element - other.l() + other.n()) < this.$c) { this.$b.element = other.l() + other.n(); this.d.b(true); }
/* 73 */        if (Math.abs(this.$b.element + this.$a.n() - other.l()) < this.$c) { this.$b.element = other.l() - this.$a.n(); this.d.b(true); }
/* 74 */        if (Math.abs(this.$b.element - other.l()) < this.$c) { this.$b.element = other.l(); this.d.b(true); }
/*    */ 
/*    */       
/* 77 */       if (Math.abs(this.$e.element - other.m() + other.o()) < this.$c) { this.$e.element = other.m() + other.o(); this.d.c(true); }
/* 78 */        if (Math.abs(this.$e.element + this.$a.o() - other.m()) < this.$c) { this.$e.element = other.m() - this.$a.o(); this.d.c(true); }
/* 79 */        if (Math.abs(this.$e.element - other.m()) < this.$c) { this.$e.element = other.m(); this.d.c(true); }
/*    */     
/*    */     } 
/*    */   }
/*    */   
/*    */   null(b $s, Ref.FloatRef $targetX, float $snapThreshold, a $receiver, Ref.FloatRef $targetY) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */