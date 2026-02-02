/*     */ package eu.shoroa.bridge.ui.clickgui.comp;
/*     */ 
/*     */ import java.awt.datatransfer.DataFlavor;
/*     */ import java.awt.datatransfer.Transferable;
/*     */ import java.awt.image.BufferedImage;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a
/*     */   implements Transferable
/*     */ {
/*     */   a(BufferedImage $img) {}
/*     */   
/*     */   @NotNull
/*     */   public DataFlavor[] a() {
/* 168 */     DataFlavor[] arrayOfDataFlavor = new DataFlavor[1]; arrayOfDataFlavor[0] = DataFlavor.imageFlavor; return arrayOfDataFlavor;
/* 169 */   } public boolean a(DataFlavor flavor) { Intrinsics.checkNotNullParameter(flavor, ""); return Intrinsics.areEqual(flavor, DataFlavor.imageFlavor); } @NotNull
/*     */   public Object b(DataFlavor flavor) {
/* 171 */     Intrinsics.checkNotNullParameter(flavor, ""); if (Intrinsics.areEqual(flavor, DataFlavor.imageFlavor)) { Intrinsics.checkNotNullExpressionValue(this.a, ""); return this.a; }
/* 172 */      throw new UnsupportedOperationException("Unsupported flavor");
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\a$4$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */