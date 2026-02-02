/*    */ package eu.shoroa.notro.bridge;
/*    */ import eu.shoroa.bridge.ui.Screen;
/*    */ import java.util.HashMap;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_327;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\031\020\007\032\0020\0062\b\020\005\032\004\030\0010\004H\026¢\006\004\b\007\020\bJ\031\020\n\032\0020\t2\b\020\005\032\004\030\0010\004H\026¢\006\004\b\n\020\013J\031\020\f\032\0020\t2\b\020\005\032\004\030\0010\004H\026¢\006\004\b\f\020\013J\031\020\020\032\0020\0172\b\020\016\032\004\030\0010\rH\026¢\006\004\b\020\020\021J+\020\025\032\0020\0172\b\020\022\032\004\030\0010\0042\b\020\023\032\004\030\0010\0042\006\020\024\032\0020\006H\026¢\006\004\b\025\020\026R4\020\032\032\"\022\006\022\004\030\0010\004\022\004\022\0020\0300\027j\020\022\006\022\004\030\0010\004\022\004\022\0020\030`\0318\002X\004¢\006\006\n\004\b\032\020\033¨\006\034"}, d2 = {"Leu/shoroa/notro/bridge/IUtilsImpl;", "Leu/shoroa/bridge/feature/bridges/impl/IUtils;", "<init>", "()V", "", "bindName", "", "bindCode", "(Ljava/lang/String;)I", "", "bindDown", "(Ljava/lang/String;)Z", "bindPressed", "Leu/shoroa/bridge/ui/Screen;", "screen", "", "displayScreen", "(Leu/shoroa/bridge/ui/Screen;)V", "keyName", "category", "key", "registerBind", "(Ljava/lang/String;Ljava/lang/String;I)V", "Ljava/util/HashMap;", "Lnet/minecraft/class_327;", "Lkotlin/collections/HashMap;", "registeredBinds", "Ljava/util/HashMap;", "NotroClient"})
/*    */ public final class IUtilsImpl implements h {
/*    */   @NotNull
/* 10 */   private final HashMap<String, class_327> registeredBinds = new HashMap<>();
/*    */   public void registerBind(String keyName, String category, int key) {
/* 12 */     class_327 bind = new class_327(keyName, key, category);
/* 13 */     KeyBindingHelper.registerKeyBinding(bind);
/* 14 */     this.registeredBinds.put(keyName, bind);
/*    */   }
/*    */   
/* 17 */   public boolean bindDown(String bindName) { Intrinsics.checkNotNull(this.registeredBinds.get(bindName)); return this.registeredBinds.get(bindName).method_6619(); }
/* 18 */   public boolean bindPressed(String bindName) { Intrinsics.checkNotNull(this.registeredBinds.get(bindName)); return this.registeredBinds.get(bindName).method_841(); } public int bindCode(String bindName) {
/* 19 */     Intrinsics.checkNotNull(this.registeredBinds.get(bindName)); return this.registeredBinds.get(bindName).method_6623();
/*    */   } public void displayScreen(Screen screen) {
/* 21 */     class_1600.method_2965().method_2928(new HolderScreen(screen));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\IUtilsImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */