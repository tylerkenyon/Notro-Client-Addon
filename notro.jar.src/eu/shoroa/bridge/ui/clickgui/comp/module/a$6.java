/*     */ package eu.shoroa.bridge.ui.clickgui.comp.module;
/*     */ 
/*     */ import eu.shoroa.bridge.ui.clickgui.comp.module.comp.a;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "a", "()V"})
/*     */ @SourceDebugExtension({"SMAP\nPageModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageModule.kt\neu/shoroa/bridge/ui/clickgui/comp/module/PageModule$render$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,275:1\n1864#2,3:276\n*S KotlinDebug\n*F\n+ 1 PageModule.kt\neu/shoroa/bridge/ui/clickgui/comp/module/PageModule$render$8\n*L\n195#1:276,3\n*E\n"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void a() {
/* 195 */     ArrayList<a> arrayList = this.a.g(); a a1 = this.a; float f1 = this.$b; Ref.FloatRef floatRef = this.$c; float f2 = this.$d, f3 = this.$e, f4 = this.$f; int $i$f$forEachIndexed = 0;
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
/* 276 */     int index$iv = 0;
/* 277 */     Iterator<a> iterator = arrayList.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  a a2 = (a)item$iv; int index = i, $i$a$-forEachIndexed-PageModule$render$8$1 = 0;
/*     */       int row = index / a.a(a1);
/*     */       int col = index % a.a(a1);
/*     */       a2.setX(a1.getX() + 10 + col * (a.b(a1) + f1));
/*     */       a2.setY(a1.getY() + 70 + row * (a.c(a1) + f1) - floatRef.element);
/*     */       a2.setW(a.b(a1));
/*     */       a2.setH(a.c(a1));
/*     */       a2.render(f2, f3, f4); }
/*     */   
/*     */   }
/*     */   
/*     */   null(a $receiver, float $gap, Ref.FloatRef $scrollVal, float $mx, float $my, float $delta) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\a$6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */