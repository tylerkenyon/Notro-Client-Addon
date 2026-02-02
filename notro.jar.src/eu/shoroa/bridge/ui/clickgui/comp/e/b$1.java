/*     */ package eu.shoroa.bridge.ui.clickgui.comp.e;
/*     */ 
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "a", "()V"})
/*     */ @SourceDebugExtension({"SMAP\nPageThemes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageThemes.kt\neu/shoroa/bridge/ui/clickgui/comp/themes/PageThemes$render$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1864#2,3:150\n*S KotlinDebug\n*F\n+ 1 PageThemes.kt\neu/shoroa/bridge/ui/clickgui/comp/themes/PageThemes$render$2\n*L\n106#1:150,3\n*E\n"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void a() {
/* 106 */     List list = this.a.getElements(); b b1 = this.a; float f1 = this.$b, f2 = this.$c, f3 = this.$d, f4 = this.$e; int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     int index$iv = 0;
/* 151 */     Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  d d = (d)item$iv; int index = i, $i$a$-forEachIndexed-PageThemes$render$2$1 = 0;
/*     */       int row = index / b.a(b1);
/*     */       int col = index % b.a(b1);
/*     */       d.setX(b1.getX() + b.b(b1) + col * (b.c(b1) + b.d(b1)));
/*     */       d.setY(b1.getY() + b.e(b1) + b.d(b1) + row * (b.f(b1) + b.d(b1)) - f1); }
/*     */   
/*     */   }
/*     */   
/*     */   null(b $receiver, float $scrl, float $mx, float $my, float $delta) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\e\b$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */