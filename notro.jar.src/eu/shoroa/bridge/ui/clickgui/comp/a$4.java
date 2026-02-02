/*     */ package eu.shoroa.bridge.ui.clickgui.comp;
/*     */ 
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.datatransfer.DataFlavor;
/*     */ import java.awt.datatransfer.Transferable;
/*     */ import java.awt.image.BufferedImage;
/*     */ import javax.imageio.ImageIO;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "a", "()V"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void a() {
/*     */     try {
/* 166 */       BufferedImage img = ImageIO.read(this.a.a());
/* 167 */       a transferable = new a(img);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 175 */       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transferable, null);
/* 176 */     } catch (Exception e) {
/* 177 */       System.out.println("Failed to copy screenshot: " + e.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   null(a $receiver) {
/*     */     super(0);
/*     */   }
/*     */   
/*     */   public static final class a implements Transferable {
/*     */     a(BufferedImage $img) {}
/*     */     
/*     */     @NotNull
/*     */     public DataFlavor[] a() {
/*     */       DataFlavor[] arrayOfDataFlavor = new DataFlavor[1];
/*     */       arrayOfDataFlavor[0] = DataFlavor.imageFlavor;
/*     */       return arrayOfDataFlavor;
/*     */     }
/*     */     
/*     */     public boolean a(DataFlavor flavor) {
/*     */       Intrinsics.checkNotNullParameter(flavor, "");
/*     */       return Intrinsics.areEqual(flavor, DataFlavor.imageFlavor);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Object b(DataFlavor flavor) {
/*     */       Intrinsics.checkNotNullParameter(flavor, "");
/*     */       if (Intrinsics.areEqual(flavor, DataFlavor.imageFlavor)) {
/*     */         Intrinsics.checkNotNullExpressionValue(this.a, "");
/*     */         return this.a;
/*     */       } 
/*     */       throw new UnsupportedOperationException("Unsupported flavor");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\a$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */