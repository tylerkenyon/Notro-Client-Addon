/*    */ package eu.shoroa.bridge.ui.clickgui;
/*    */ 
/*    */ import eu.shoroa.bridge.b.a.a;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.d.e.a;
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.JvmName;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\005\n\002\020\f\n\002\b\005\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\030\0002\0020\001B\007¢\006\004\b\037\020\013J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\017\020\n\032\0020\007H\026¢\006\004\b\n\020\013J\017\020\f\032\0020\007H\026¢\006\004\b\f\020\013J\037\020\016\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\rH\026¢\006\004\b\016\020\017J'\020\020\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\020\020\tJ'\020\021\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\021\020\022R\026\020\026\032\0020\0238\002@\002X\016¢\006\006\n\004\b\024\020\025R\030\020\030\032\006*\0020\0270\0278\002X\004¢\006\006\n\004\b\030\020\031R$\020\036\032\004\030\0010\0328\007@\007X\016¢\006\022\n\004\b\026\020\033\032\004\b\026\020\034\"\004\b\026\020\035R\030\020\024\032\006*\0020\0270\0278\002X\004¢\006\006\n\004\b\036\020\031"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/b;", "Leu/shoroa/bridge/ui/Screen;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "exit", "()V", "init", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "", "d", "Z", "a", "Leu/shoroa/bridge/b/a/a;", "b", "Leu/shoroa/bridge/b/a/a;", "Leu/shoroa/bridge/ui/clickgui/a;", "Leu/shoroa/bridge/ui/clickgui/a;", "()Leu/shoroa/bridge/ui/clickgui/a;", "(Leu/shoroa/bridge/ui/clickgui/a;)V", "c", "<init>"})
/*    */ public final class b extends Screen {
/*    */   @Nullable
/*    */   @JvmName(name = "a")
/* 14 */   public final a a() { return this.a; } @JvmName(name = "a") public final void a(a <set-?>) { this.a = <set-?>; } @Nullable
/* 15 */   private a a; private final a b = a.a(b::b, b::c); private static final Float b() { return Float.valueOf(0.0F); } private static final eu.shoroa.bridge.b.a.b c() { return eu.shoroa.bridge.b.a.b.SINE_IN; }
/* 16 */    private final a c = a.a(b::d, b::e); private boolean d; private static final Float d() { return Float.valueOf(0.0F); } private static final eu.shoroa.bridge.b.a.b e() { return eu.shoroa.bridge.b.a.b.QUINT_IN; }
/*    */ 
/*    */   
/*    */   public void init() {
/* 20 */     float pw = 962.0F;
/* 21 */     float ph = 553.0F;
/* 22 */     this.a = new a(getWidth() / 2.0F - pw / 2.0F, getHeight() / 2.0F - ph / 2.0F, pw, ph);
/* 23 */     this.b.a(true);
/* 24 */     this.c.a(true);
/*    */   }
/*    */   public void render(float mx, float my, float delta) {
/* 27 */     float alpha = this.b.a();
/* 28 */     float scale = 0.9F + 0.1F * this.c.a();
/*    */     
/* 30 */     Color bgColor = a.a.b(a.a.k().b(), 0.3F * alpha);
/* 31 */     d.a(d.a, 0.0F, 0.0F, getWidth(), getHeight(), 0.0F, d.a.a(bgColor), 0.0F, 64, null);
/*    */     
/* 33 */     eu.shoroa.bridge.b.d.b.INSTANCE.c(alpha);
/* 34 */     if (this.a != null) { this.a.render(mx, my, delta); } else {  }
/* 35 */      eu.shoroa.bridge.b.d.b.INSTANCE.c(1.0F);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button)
/*    */   {
/* 40 */     if (this.a != null) { this.a.click(mx, my, button); }
/*    */     else
/*    */     {  }
/*    */   
/* 44 */   } public void release(float mx, float my, int button) { if (this.a != null) { this.a.release(mx, my, button); }
/*    */     else
/*    */     {  }
/*    */      } public void onKey(int code, char char) {
/* 48 */     super.onKey(code, char);
/* 49 */     if (this.a != null) { this.a.onKey(code, char); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   } public void exit() {
/* 54 */     this.b.a(false);
/* 55 */     (new Thread(
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 60 */         this::a)).start();
/*    */   }
/*    */   
/*    */   private static final void a(b this$0) {
/*    */     Intrinsics.checkNotNullParameter(this$0, "");
/*    */     while (this$0.b.a() > 0.01F)
/*    */       Thread.sleep(10L); 
/*    */     this$0.a = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */