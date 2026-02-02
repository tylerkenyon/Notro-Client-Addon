/*    */ package eu.shoroa.bridge.d.a;
/*    */ 
/*    */ import java.awt.FileDialog;
/*    */ import javax.swing.JFrame;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/* 21 */     JFrame frame = new JFrame(this.a.b());
/* 22 */     frame.setDefaultCloseOperation(3);
/* 23 */     FileDialog dialog = new FileDialog(frame, this.a.b());
/* 24 */     dialog.setMultipleMode(false);
/* 25 */     dialog.setFile("*." + this.a.a());
/* 26 */     dialog.setVisible(true);
/* 27 */     if (dialog.getFile() == null) {
/* 28 */       b.a.a(this.a, false);
/*    */       return;
/*    */     } 
/* 31 */     b.a.a(this.a, dialog.getDirectory() + dialog.getDirectory());
/* 32 */     b.a.a(this.a, false);
/*    */   }
/*    */   
/*    */   null(b.a $receiver) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\a\b$a$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */