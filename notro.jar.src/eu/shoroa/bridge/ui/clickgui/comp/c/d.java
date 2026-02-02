/*    */ package eu.shoroa.bridge.ui.clickgui.comp.c;
/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @SourceDebugExtension({"SMAP\nScreenshotManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotManager.kt\neu/shoroa/bridge/ui/clickgui/comp/screenshots/ScreenshotManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,26:1\n6523#2:27\n*S KotlinDebug\n*F\n+ 1 ScreenshotManager.kt\neu/shoroa/bridge/ui/clickgui/comp/screenshots/ScreenshotManager\n*L\n20#1:27\n*E\n"})
/*    */ public final class d {
/*    */   public d() {
/* 10 */     this.a = new File("screenshots");
/* 11 */     this.b = CollectionsKt.emptyList();
/*    */ 
/*    */ 
/*    */     
/* 15 */     b();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final File a;
/*    */   @NotNull
/*    */   private List<? extends File> b;
/*    */   
/*    */   @NotNull
/*    */   public final List<File> a() {
/*    */     return (List)this.b;
/*    */   }
/*    */   
/*    */   public final void b() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_0
/*    */     //   2: getfield a : Ljava/io/File;
/*    */     //   5: invokevirtual exists : ()Z
/*    */     //   8: ifeq -> 60
/*    */     //   11: aload_0
/*    */     //   12: getfield a : Ljava/io/File;
/*    */     //   15: invokevirtual isDirectory : ()Z
/*    */     //   18: ifeq -> 60
/*    */     //   21: aload_0
/*    */     //   22: getfield a : Ljava/io/File;
/*    */     //   25: invokevirtual listFiles : ()[Ljava/io/File;
/*    */     //   28: dup
/*    */     //   29: ifnull -> 53
/*    */     //   32: astore_1
/*    */     //   33: iconst_0
/*    */     //   34: istore_2
/*    */     //   35: aload_1
/*    */     //   36: new eu/shoroa/bridge/ui/clickgui/comp/c/d$1
/*    */     //   39: dup
/*    */     //   40: invokespecial <init> : ()V
/*    */     //   43: checkcast java/util/Comparator
/*    */     //   46: invokestatic sortedWith : ([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;
/*    */     //   49: dup
/*    */     //   50: ifnonnull -> 63
/*    */     //   53: pop
/*    */     //   54: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   57: goto -> 63
/*    */     //   60: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   63: putfield b : Ljava/util/List;
/*    */     //   66: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     //   #20	-> 21
/*    */     //   #27	-> 35
/*    */     //   #20	-> 49
/*    */     //   #21	-> 60
/*    */     //   #19	-> 63
/*    */     //   #22	-> 66
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	67	0	this	Leu/shoroa/bridge/ui/clickgui/comp/c/d;
/*    */     //   33	16	1	$this$sortedByDescending$iv	[Ljava/lang/Object;
/*    */     //   35	14	2	$i$f$sortedByDescending	I
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */