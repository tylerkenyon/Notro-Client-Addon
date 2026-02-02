/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.bridge.feature.b.b;
/*    */ import eu.shoroa.bridge.ui.clickgui.comp.module.comp.a;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "a", "()V"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void a() {
/* 25 */     a.a(this.a, !a.d(this.a));
/*    */     
/* 27 */     this.a.g().clear();
/* 28 */     this.a.f().clear();
/* 29 */     Ref.FloatRef i = new Ref.FloatRef();
/* 30 */     if (BridgeClient.a.b() != null && BridgeClient.a.b().moduleManager() != null) { BridgeClient.a.b().moduleManager().a(new Function1<b, Unit>(this.a, this.$b, this.$c, i, this.$d) { public final void a(b module) {
/* 31 */               Intrinsics.checkNotNullParameter(module, ""); if (a.d(this.a)) {
/* 32 */                 float f = this.$d.element; this.$d.element = f + 1.0F; a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70 + f * 70, this.$e - 20, 60.0F, a.d(this.a));
/* 33 */                 this.a.f().add(elementModule);
/* 34 */                 this.a.g().add(elementModule);
/*    */               } else {
/* 36 */                 a elementModule = new a(module, this.a, this.$b + 10, this.$c + 70, a.b(this.a), a.c(this.a), a.d(this.a));
/* 37 */                 this.a.f().add(elementModule);
/* 38 */                 this.a.g().add(elementModule);
/* 39 */                 float f = this.$d.element; this.$d.element = f + 1.0F;
/*    */               } 
/*    */             } }
/*    */         ); }
/*    */     else
/*    */     { BridgeClient.a.b().moduleManager(); }
/*    */   
/*    */   }
/*    */   
/*    */   null(a $receiver, float $x, float $y, float $w) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\a$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */