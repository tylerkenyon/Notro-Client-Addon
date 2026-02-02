/*    */ package eu.shoroa.bridge.ui.a.a.a.a;
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ public final class b extends a {
/*    */   public b() {
/*  8 */     super("module", "Manage modules", "<enable|disable|list> <module>", false, 8, null);
/*    */   } public void a(String[] args) {
/* 10 */     Intrinsics.checkNotNullParameter(args, ""); if (args.length <= 2) {
/* 11 */       eu.shoroa.bridge.feature.b.b module; String str = args[0]; switch (str.hashCode()) { case -1298848381: if (!str.equals("enable"))
/*    */             break; 
/* 13 */           if (args.length != 2) {
/* 14 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Usage: " + e());
/*    */             return;
/*    */           } 
/* 17 */           Intrinsics.checkNotNull(BridgeClient.a.b()); module = BridgeClient.a.b().moduleManager().a(args[1]);
/* 18 */           if (module != null) {
/* 19 */             if (!module.b()) module.a(); 
/* 20 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§5Module [" + args[1] + "] enabled!");
/*    */           } else {
/* 22 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Module [" + args[1] + "] not found!");
/*    */           }  return;
/*    */         case 1671308008:
/*    */           if (!str.equals("disable"))
/* 26 */             break;  if (args.length != 2) {
/* 27 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Usage: " + e());
/*    */             return;
/*    */           } 
/* 30 */           Intrinsics.checkNotNull(BridgeClient.a.b()); module = BridgeClient.a.b().moduleManager().a(args[1]);
/* 31 */           if (module != null) {
/* 32 */             if (module.b()) module.a(); 
/* 33 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§5Module [" + args[1] + "] disabled!");
/*    */           } else {
/* 35 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Module [" + args[1] + "] not found!");
/*    */           }  return;
/*    */         case -868304044:
/*    */           if (!str.equals("toggle"))
/* 39 */             break;  if (args.length != 2) {
/* 40 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Usage: " + e());
/*    */             return;
/*    */           } 
/* 43 */           Intrinsics.checkNotNull(BridgeClient.a.b()); module = BridgeClient.a.b().moduleManager().a(args[1]);
/* 44 */           if (module != null) {
/* 45 */             module.a();
/* 46 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§5Module [" + args[1] + "] toggled!");
/* 47 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§5       new state [" + module.b() + "]!");
/*    */           } else {
/* 49 */             eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Module [" + args[1] + "] not found!");
/*    */           }  return;
/*    */         case 3322014:
/*    */           if (!str.equals("list"))
/* 53 */             break;  eu.shoroa.bridge.ui.a.a.b.a.a().a("§3Modules:");
/* 54 */           Intrinsics.checkNotNull(BridgeClient.a.b()); BridgeClient.a.b().moduleManager().a(null.a);
/*    */           return; }
/*    */ 
/*    */ 
/*    */       
/* 59 */       eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Unknown command!");
/* 60 */       eu.shoroa.bridge.ui.a.a.b.a.a().a("§4" + f());
/*    */     }
/*    */     else {
/*    */       
/* 64 */       eu.shoroa.bridge.ui.a.a.b.a.a().a("§4Unknown command!");
/* 65 */       eu.shoroa.bridge.ui.a.a.b.a.a().a("§4" + f());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\a\a\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */