/*    */ package eu.shoroa.bridge.ui.c;
/*    */ 
/*    */ import eu.shoroa.bridge.ui.b.d;
/*    */ import eu.shoroa.bridge.ui.c.a.a;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Unit;
/*    */ 
/*    */ @SourceDebugExtension({"SMAP\nMainMenuPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMenuPanel.kt\neu/shoroa/bridge/ui/mainmenu/MainMenuPanel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1855#2,2:61\n1855#2,2:63\n1855#2,2:65\n*S KotlinDebug\n*F\n+ 1 MainMenuPanel.kt\neu/shoroa/bridge/ui/mainmenu/MainMenuPanel\n*L\n50#1:61,2\n54#1:63,2\n58#1:65,2\n*E\n"})
/*    */ public final class a extends d {
/* 10 */   public a(float x, float y, float w, float h) { super(x, y, w, h);
/* 11 */     Intrinsics.checkNotNull(getBridge().e()); this.a = getBridge().e();
/*    */ 
/*    */     
/* 14 */     float gap = 20.0F;
/* 15 */     float buttonCount = 3.0F;
/* 16 */     float buttonHeight = (h - gap * (buttonCount + true)) / buttonCount;
/*    */ 
/*    */     
/* 19 */     a[] arrayOfA = new a[3]; arrayOfA[0] = (new a("singleplayer", "", x + 28, y + gap, w - 56.0F, buttonHeight)).a(new Function0<Unit>(this) {
/* 20 */           public final void a() { Intrinsics.checkNotNull(a.a(this.a).d()); a.a(this.a).d().guiSelectWorld(); }
/*    */         });
/* 22 */     arrayOfA[1] = (new a("multiplayer", "", x + 28, y + gap * 2.0F + buttonHeight, w - 56.0F, buttonHeight)).a(new Function0<Unit>(this) {
/* 23 */           public final void a() { Intrinsics.checkNotNull(a.a(this.a).d()); a.a(this.a).d().guiMultiplayer(); }
/*    */         });
/* 25 */     arrayOfA[2] = (new a("options", "", x + 28, y + (gap + buttonHeight) * 2.0F + gap, w - 56.0F, buttonHeight)).a(new Function0<Unit>(this) {
/* 26 */           public final void a() { Intrinsics.checkNotNull(a.a(this.a).d()); a.a(this.a).d().guiSettings(); }
/*    */         });
/*    */     CollectionsKt.addAll(getElements(), (Object[])arrayOfA); } @NotNull
/*    */   private final eu.shoroa.bridge.feature.a.a.a a; @NotNull
/*    */   public Object clone() {
/*    */     return super.clone();
/*    */   } public void render(float mx, float my, float delta) {
/* 33 */     float nativeImgW = 1920.0F;
/* 34 */     float nativeImgH = 1165.0F;
/*    */     
/* 36 */     float rationH = this.a.height() / nativeImgH;
/* 37 */     float rationW = this.a.width() / nativeImgW;
/*    */     
/* 39 */     float ratio = (rationH < rationW) ? rationW : rationH;
/*    */     
/* 41 */     float imgW = nativeImgW * ratio;
/* 42 */     float imgH = nativeImgH * ratio;
/*    */     
/* 44 */     float imgX = (this.a.width() - imgW) / 2;
/* 45 */     float imgY = (this.a.height() - imgH) / 2;
/* 46 */     d.a.a(getX(), getY(), getW(), getH(), 30.0F, "bg1-blur-a", imgX, imgY, imgW, imgH);
/* 47 */     d.a.a(getX(), getY(), getW(), getH(), 30.0F, 100.0F, new Color(0, 0, 0, 100), true);
/* 48 */     d.a(d.a, getX(), getY(), getW(), getH(), 30.0F, d.a.a(new Color(807543330, true)), 0.0F, 64, null);
/*    */     
/* 50 */     Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
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
/* 61 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-MainMenuPanel$render$1 = 0; it.render(mx, my, delta); }
/*    */      } public void click(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/* 63 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-MainMenuPanel$click$1 = 0; it.click(mx, my, button); }
/*    */      } public void release(float mx, float my, int button) { Iterable $this$forEach$iv = getElements(); int $i$f$forEach = 0;
/* 65 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); d it = (d)element$iv; int $i$a$-forEach-MainMenuPanel$release$1 = 0;
/*    */       it.release(mx, my, button); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\c\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */