/*    */ package eu.shoroa.bridge.ui.a.a.a.a;
/*    */ 
/*    */ import eu.shoroa.bridge.ui.a.a.b;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ @SourceDebugExtension({"SMAP\nCmdHelp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CmdHelp.kt\neu/shoroa/bridge/ui/console/comp/cmd/impl/CmdHelp\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n766#2:28\n857#2,2:29\n1855#2,2:31\n*S KotlinDebug\n*F\n+ 1 CmdHelp.kt\neu/shoroa/bridge/ui/console/comp/cmd/impl/CmdHelp\n*L\n13#1:28\n13#1:29,2\n13#1:31,2\n*E\n"})
/*    */ public final class a extends a {
/*  8 */   public a() { super("help", "Shows all commands", "", false, 8, null); } public void a(String[] args) {
/*    */     Iterator iterator;
/* 10 */     Intrinsics.checkNotNullParameter(args, ""); if ((args.length == 0))
/* 11 */     { List commands = b.INSTANCE.b();
/* 12 */       b.a.a().a("§2Commands:");
/* 13 */       Iterable $this$filter$iv = commands; int $i$f$filter = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 28 */       Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 29 */       for (Object element$iv$iv : iterable1) { a it = (a)element$iv$iv; int $i$a$-filter-CmdHelp$execute$1 = 0; if (!it.d()) destination$iv$iv.add(element$iv$iv);  }
/* 30 */        $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 31 */       iterator = $this$filter$iv.iterator(); } else { a command = b.INSTANCE.a(args[0]); if (command != null && !command.d()) { b.a.a().a("§2   - " + args[0]); b.a.a().a("§2        - " + command.b()); b.a.a().a("§2        - " + command.e()); } else { b.a.a().a("§4Command [" + args[0] + "] not found!"); }  return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-CmdHelp$execute$2 = 0;
/*    */       b.a.a().a("§2" + it.e() + " - " + it.b()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\a\a\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */