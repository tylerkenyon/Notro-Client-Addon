/*    */ package eu.shoroa.notro.client.feature.a;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.b.b.a;
/*    */ import java.util.Iterator;
/*    */ import kotlin.reflect.KProperty;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020!\n\002\030\002\n\002\b\005\030\0002\0020\001B\007¢\006\004\b\023\020\024J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\004H\026¢\006\004\b\b\020\tJ\027\020\013\032\0020\0072\006\020\003\032\0020\nH\007¢\006\004\b\013\020\fJ'\020\013\032\0020\0072\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\004H\026¢\006\004\b\013\020\tR'\020\013\032\016\022\n\022\b\022\004\022\0020\0170\0160\r8CX\002¢\006\f\n\004\b\b\020\020\032\004\b\021\020\022"}, d2 = {"Leu/shoroa/notro/client/feature/a/b;", "Leu/shoroa/bridge/feature/b/b;", "", "p0", "", "p1", "p2", "", "b", "(ZII)V", "Leu/shoroa/bridge/a/d;", "a", "(Leu/shoroa/bridge/a/d;)V", "Leu/shoroa/bridge/feature/c/b;", "", "Leu/shoroa/bridge/feature/b/b/a;", "Leu/shoroa/bridge/feature/c/b;", "c", "()Leu/shoroa/bridge/feature/c/b;", "<init>", "()V"})
/*    */ public final class b extends b {
/*  9 */   public b() { super("Autotext", "Automatically sends a message when you press a key.", true, "autotext", false, 16, null);
/* 10 */     this.b = a("Keys", new ArrayList()); } @NotNull private final eu.shoroa.bridge.feature.c.b b; @JvmName(name = "c") private final eu.shoroa.bridge.feature.c.b<List<a>> c() { return this.b.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[1]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(b.class, "hotkeys", "getHotkeys()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; }
/*    */   
/*    */   public void a(boolean nvg, int displayWidth, int displayHeight) {}
/*    */   public void b(boolean nvg, int displayWidth, int displayHeight) {}
/*    */   @Listen
/*    */   public final void a(d e) {
/* 16 */     Intrinsics.checkNotNullParameter(e, ""); Iterator<a> it = ((List)c().b()).iterator();
/* 17 */     while (it.hasNext()) {
/* 18 */       a hotkey = it.next();
/* 19 */       if (hotkey.b() == e.b())
/* 20 */         (class_1600.method_2965()).field_10310.method_9720(hotkey.a()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */