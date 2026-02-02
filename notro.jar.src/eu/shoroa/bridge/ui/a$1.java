/*     */ package eu.shoroa.bridge.ui;
/*     */ 
/*     */ import eu.shoroa.bridge.feature.b.b;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/feature/b/b;", "p0", "", "a", "(Leu/shoroa/bridge/feature/b/b;)V"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function1<b, Unit>
/*     */ {
/*     */   public final void a(b it) {
/* 105 */     Intrinsics.checkNotNullParameter(it, ""); boolean hovered = (this.$a >= it.l() && this.$a <= it.l() + it.n() && this.$b >= it.m() && this.$b <= it.m() + it.o());
/* 106 */     if (hovered && this.$c == 0 && it.b()) {
/* 107 */       this.d.a(it);
/* 108 */       this.d.e().a(this.$a, this.$b, it.l(), it.m());
/*     */     } 
/*     */   }
/*     */   
/*     */   null(float $mx, float $my, int $button, a $receiver) {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */