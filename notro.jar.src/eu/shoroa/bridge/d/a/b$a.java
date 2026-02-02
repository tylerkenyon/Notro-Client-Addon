/*    */ package eu.shoroa.bridge.d.a;
/*    */ 
/*    */ import java.awt.FileDialog;
/*    */ import javax.swing.JFrame;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public final class a {
/*    */   @NotNull
/*    */   private final String a;
/*    */   @NotNull
/*    */   private final String b;
/*    */   
/* 14 */   public a(String extensions, String title) { this.a = extensions; this.b = title; } private boolean c; @Nullable private String d; @NotNull public final String a() { return this.a; } @NotNull public final String b() { return this.b; }
/*    */   
/*    */   @Nullable
/*    */   public final String c() {
/* 18 */     this.d = null;
/* 19 */     this.c = true;
/* 20 */     ThreadsKt.thread$default(true, false, null, null, 0, new Function0<Unit>(this) {
/* 21 */           public final void a() { JFrame frame = new JFrame(this.a.b());
/* 22 */             frame.setDefaultCloseOperation(3);
/* 23 */             FileDialog dialog = new FileDialog(frame, this.a.b());
/* 24 */             dialog.setMultipleMode(false);
/* 25 */             dialog.setFile("*." + this.a.a());
/* 26 */             dialog.setVisible(true);
/* 27 */             if (dialog.getFile() == null) {
/* 28 */               b.a.a(this.a, false);
/*    */               return;
/*    */             } 
/* 31 */             b.a.a(this.a, dialog.getDirectory() + dialog.getDirectory());
/* 32 */             b.a.a(this.a, false); }
/*    */         }30, null);
/* 34 */     return this.d;
/*    */   }
/*    */   
/*    */   public final boolean d() {
/* 38 */     return (this.c && this.d == null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\a\b$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */