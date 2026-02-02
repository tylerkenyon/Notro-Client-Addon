/*    */ package eu.shoroa.bridge.ui.a.a.a;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\020\021\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\b\004\n\002\020!\n\002\b\002\n\002\020\013\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\025\020\016J#\020\007\032\0020\0062\006\020\003\032\0020\0022\f\020\005\032\b\022\004\022\0020\0020\004¢\006\004\b\007\020\bJ\031\020\007\032\004\030\0010\t2\006\020\003\032\0020\002H\007¢\006\004\b\007\020\nJ\025\020\f\032\b\022\004\022\0020\t0\013H\007¢\006\004\b\f\020\rJ\r\020\007\032\0020\006¢\006\004\b\007\020\016J\027\020\007\032\0020\0062\006\020\003\032\0020\tH\002¢\006\004\b\007\020\017R\032\020\007\032\b\022\004\022\0020\t0\0208\002X\004¢\006\006\n\004\b\021\020\022R\026\020\f\032\0020\0238\002@\002X\016¢\006\006\n\004\b\f\020\024"}, d2 = {"Leu/shoroa/bridge/ui/a/a/a/b;", "", "", "p0", "", "p1", "", "a", "(Ljava/lang/String;[Ljava/lang/String;)V", "Leu/shoroa/bridge/ui/a/a/a/a;", "(Ljava/lang/String;)Leu/shoroa/bridge/ui/a/a/a/a;", "", "b", "()Ljava/util/List;", "()V", "(Leu/shoroa/bridge/ui/a/a/a/a;)V", "", "c", "Ljava/util/List;", "", "Z", "<init>"})
/*    */ @SourceDebugExtension({"SMAP\nCommandManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandManager.kt\neu/shoroa/bridge/ui/console/comp/cmd/CommandManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/*    */ public final class b {
/*    */   @NotNull
/*  9 */   public static final b INSTANCE = new b(); private static boolean b; @NotNull private static final List<a> c = new ArrayList<>();
/*    */   
/*    */   public final void a() {
/* 12 */     if (!b) {
/* 13 */       b = true;
/* 14 */       a((a)new a());
/* 15 */       a((a)new b());
/*    */     } 
/*    */   }
/*    */   
/*    */   private final void a(a command) {
/* 20 */     c.add(command);
/*    */   }
/*    */   @Nullable
/*    */   public final a a(String name) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc ''
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: getstatic eu/shoroa/bridge/ui/a/a/a/b.c : Ljava/util/List;
/*    */     //   9: checkcast java/lang/Iterable
/*    */     //   12: astore_2
/*    */     //   13: aload_2
/*    */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   19: astore_3
/*    */     //   20: aload_3
/*    */     //   21: invokeinterface hasNext : ()Z
/*    */     //   26: ifeq -> 64
/*    */     //   29: aload_3
/*    */     //   30: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   35: astore #4
/*    */     //   37: aload #4
/*    */     //   39: checkcast eu/shoroa/bridge/ui/a/a/a/a
/*    */     //   42: astore #5
/*    */     //   44: iconst_0
/*    */     //   45: istore #6
/*    */     //   47: aload #5
/*    */     //   49: invokevirtual a : ()Ljava/lang/String;
/*    */     //   52: aload_1
/*    */     //   53: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   56: ifeq -> 20
/*    */     //   59: aload #4
/*    */     //   61: goto -> 65
/*    */     //   64: aconst_null
/*    */     //   65: checkcast eu/shoroa/bridge/ui/a/a/a/a
/*    */     //   68: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 6
/*    */     //   #40	-> 44
/*    */     //   #24	-> 47
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	69	0	this	Leu/shoroa/bridge/ui/a/a/a/b;
/*    */     //   0	69	1	name	Ljava/lang/String;
/*    */     //   44	12	5	it	Leu/shoroa/bridge/ui/a/a/a/a;
/*    */     //   47	9	6	$i$a$-find-CommandManager$getCommand$1	I
/*    */   }
/*    */   @NotNull
/*    */   public final List<a> b() {
/* 28 */     return c;
/*    */   }
/*    */   
/*    */   public final void a(String name, String[] args) {
/* 32 */     Intrinsics.checkNotNullParameter(name, ""); Intrinsics.checkNotNullParameter(args, ""); a command = a(name);
/* 33 */     if (command != null) {
/* 34 */       command.a(args);
/*    */     } else {
/* 36 */       eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Command not found!");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\a\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */