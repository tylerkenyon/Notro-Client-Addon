/*    */ package eu.shoroa.bridge.d.a;
/*    */ 
/*    */ import java.awt.FileDialog;
/*    */ import java.nio.ByteBuffer;
/*    */ import javax.swing.JFrame;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001:\001\006B\t\b\002¢\006\004\b\n\020\013J\037\020\006\032\0020\0052\006\020\003\032\0020\0022\006\020\004\032\0020\002H\007¢\006\004\b\006\020\007J\027\020\006\032\0020\b2\006\020\003\032\0020\002H\007¢\006\004\b\006\020\t"}, d2 = {"Leu/shoroa/bridge/d/a/b;", "", "", "p0", "p1", "Leu/shoroa/bridge/d/a/b$a;", "a", "(Ljava/lang/String;Ljava/lang/String;)Leu/shoroa/bridge/d/a/b$a;", "Ljava/nio/ByteBuffer;", "(Ljava/lang/String;)Ljava/nio/ByteBuffer;", "<init>", "()V"})
/*    */ public final class b {
/*    */   @NotNull
/* 12 */   public final a a(String extensions, String title) { Intrinsics.checkNotNullParameter(extensions, ""); Intrinsics.checkNotNullParameter(title, ""); return new a(extensions, title); } @NotNull public static final b INSTANCE = new b(); public static final class a { @NotNull private final String a; @NotNull
/*    */     private final String b; private boolean c; @Nullable
/* 14 */     private String d; public a(String extensions, String title) { this.a = extensions; this.b = title; } @NotNull public final String a() { return this.a; } @NotNull public final String b() { return this.b; }
/*    */     
/*    */     @Nullable
/*    */     public final String c() {
/* 18 */       this.d = null;
/* 19 */       this.c = true;
/* 20 */       ThreadsKt.thread$default(true, false, null, null, 0, new Function0<Unit>(this) {
/* 21 */             public final void a() { JFrame frame = new JFrame(this.a.b());
/* 22 */               frame.setDefaultCloseOperation(3);
/* 23 */               FileDialog dialog = new FileDialog(frame, this.a.b());
/* 24 */               dialog.setMultipleMode(false);
/* 25 */               dialog.setFile("*." + this.a.a());
/* 26 */               dialog.setVisible(true);
/* 27 */               if (dialog.getFile() == null) {
/* 28 */                 b.a.a(this.a, false);
/*    */                 return;
/*    */               } 
/* 31 */               b.a.a(this.a, dialog.getDirectory() + dialog.getDirectory());
/* 32 */               b.a.a(this.a, false); }
/*    */           }30, null);
/* 34 */       return this.d;
/*    */     }
/*    */     
/*    */     public final boolean d() {
/* 38 */       return (this.c && this.d == null);
/*    */     } }
/*    */   @NotNull
/*    */   public final ByteBuffer a(String path) {
/* 42 */     Intrinsics.checkNotNullParameter(path, ""); File file = new File(path);
/* 43 */     long size = file.length();
/* 44 */     ByteBuffer buffer = ByteBuffer.allocateDirect((int)size);
/* 45 */     FileChannel channel = (new FileInputStream(file)).getChannel();
/* 46 */     channel.read(buffer);
/* 47 */     channel.close();
/* 48 */     buffer.flip();
/* 49 */     Intrinsics.checkNotNull(buffer); return buffer;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */