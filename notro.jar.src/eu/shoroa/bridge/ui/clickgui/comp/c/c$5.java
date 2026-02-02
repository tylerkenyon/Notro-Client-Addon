/*     */ package eu.shoroa.bridge.ui.clickgui.comp.c;
/*     */ 
/*     */ import eu.shoroa.bridge.ui.clickgui.comp.a;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "a", "()V"})
/*     */ @SourceDebugExtension({"SMAP\nPageScreenshots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageScreenshots.kt\neu/shoroa/bridge/ui/clickgui/comp/screenshots/PageScreenshots$render$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1864#2,3:129\n*S KotlinDebug\n*F\n+ 1 PageScreenshots.kt\neu/shoroa/bridge/ui/clickgui/comp/screenshots/PageScreenshots$render$1\n*L\n89#1:129,3\n*E\n"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void a() {
/*  89 */     List list = c.a(this.a); int i = this.$b; c c1 = this.a; float f1 = this.$c, f2 = this.$d, f3 = this.$e, f4 = this.$f, f5 = this.$g, f6 = this.$h; int $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 129 */     int index$iv = 0;
/* 130 */     Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  a a = (a)item$iv; int idx = j, $i$a$-forEachIndexed-PageScreenshots$render$1$1 = 0;
/*     */       int row = idx / i;
/*     */       int col = idx % i;
/*     */       float posX = c1.getX() + 10.0F + col * (c.b(c1) + c.c(c1));
/*     */       float posY = f1 + 10.0F + row * (c.d(c1) + c.c(c1)) - f2; }
/*     */   
/*     */   }
/*     */   
/*     */   null(c $receiver, int $perRow, float $listY, float $scrollVal, float $listH, float $mx, float $my, float $delta) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c\c$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */