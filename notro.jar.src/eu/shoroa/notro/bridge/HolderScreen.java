/*    */ package eu.shoroa.notro.bridge;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.a.b;
/*    */ import eu.shoroa.bridge.ui.Screen;
/*    */ import eu.shoroa.bridge.ui.b.a.d;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\007\n\000\n\002\020\002\n\002\b\004\n\002\020\f\n\002\b\n\n\002\030\002\n\002\b\t\030\0002\0020\001B\021\022\b\020\003\032\004\030\0010\002¢\006\004\b\004\020\005J\017\020\007\032\0020\006H\026¢\006\004\b\007\020\bJ'\020\017\032\0020\0162\006\020\n\032\0020\t2\006\020\013\032\0020\t2\006\020\r\032\0020\fH\026¢\006\004\b\017\020\020J\017\020\021\032\0020\016H\026¢\006\004\b\021\020\022J\037\020\026\032\0020\0162\006\020\024\032\0020\0232\006\020\025\032\0020\tH\024¢\006\004\b\026\020\027J'\020\032\032\0020\0162\006\020\030\032\0020\t2\006\020\013\032\0020\t2\006\020\031\032\0020\tH\024¢\006\004\b\032\020\033J'\020\034\032\0020\0162\006\020\n\032\0020\t2\006\020\013\032\0020\t2\006\020\031\032\0020\tH\024¢\006\004\b\034\020\033J\017\020\035\032\0020\016H\026¢\006\004\b\035\020\022J'\020\"\032\0020\0162\006\020\037\032\0020\0362\006\020 \032\0020\t2\006\020!\032\0020\tH\026¢\006\004\b\"\020#R\031\020\003\032\004\030\0010\0028\006¢\006\f\n\004\b\003\020$\032\004\b%\020&¨\006'"}, d2 = {"Leu/shoroa/notro/bridge/HolderScreen;", "Lnet/minecraft/class_388;", "Leu/shoroa/bridge/ui/Screen;", "screen", "<init>", "(Leu/shoroa/bridge/ui/Screen;)V", "", "doesGuiPauseGame", "()Z", "", "mouseX", "mouseY", "", "partialTicks", "", "drawScreen", "(IIF)V", "initGui", "()V", "", "p_73869_0_", "typedChar", "keyTyped", "(CI)V", "mosueX", "button", "mouseClicked", "(III)V", "mouseReleased", "onGuiClosed", "Lnet/minecraft/class_1600;", "m", "w", "h", "onResize", "(Lnet/minecraft/class_1600;II)V", "Leu/shoroa/bridge/ui/Screen;", "getScreen", "()Leu/shoroa/bridge/ui/Screen;", "NotroClient"})
/*    */ public final class HolderScreen extends class_388 {
/*    */   @Nullable
/*    */   private final Screen screen;
/*    */   
/* 17 */   public HolderScreen(Screen screen) { this.screen = screen; } @Nullable public final Screen getScreen() { return this.screen; }
/*    */    public void method_1044() {
/* 19 */     if (this.screen == null) {
/* 20 */       this.field_1229.method_2928(null);
/*    */       return;
/*    */     } 
/* 23 */     Intrinsics.checkNotNull(b.a.e()); this.screen.setWidth(b.a.e().width());
/* 24 */     Intrinsics.checkNotNull(b.a.e()); this.screen.setHeight(b.a.e().height());
/* 25 */     d.a.a().clear();
/* 26 */     this.screen.init();
/* 27 */     super.method_1044();
/*    */   }
/*    */   
/*    */   public void method_1025(int mouseX, int mouseY, float partialTicks) {
/* 31 */     d.a.a(new HolderScreen$drawScreen$1());
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     super.method_1025(mouseX, mouseY, partialTicks);
/*    */   }
/*    */   
/*    */   protected void method_1026(int mosueX, int mouseY, int button) {
/* 55 */     if (d.a.a().isEmpty()) {
/* 56 */       Intrinsics.checkNotNull(this.screen); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); this.screen.click(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), button);
/*    */     } else {
/* 58 */       Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); ((d)d.a.a().get(0)).click(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), button);
/* 59 */     }  super.method_1026(mosueX, mouseY, button);
/*    */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "invoke", "()V"}) static final class HolderScreen$drawScreen$1 extends Lambda implements Function0<Unit> {
/*    */     public final void invoke() { Intrinsics.checkNotNull(HolderScreen.this.getScreen()); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.d()); HolderScreen.this.getScreen().render(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), 1.0F / b.a.d().fps()); if (!d.a.a().isEmpty()) { Intrinsics.checkNotNullExpressionValue(d.a.a().get(0), ""); d widget = (d)d.a.a().get(0); float anim = widget.e().a(); if (((anim == 0.0F)) && !widget.f()) { d.a.a().remove(widget); return; }  b.INSTANCE.c(anim); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.e()); a.a.a(1.0F - (true - anim) / 8.0F, b.a.e().width() / 2.0F, b.a.e().height() / 2.0F, new Function0<Unit>(widget) { public final void invoke() { Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.d()); this.$$widget.render(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), 1.0F / b.a.d().fps()); } }
/*    */           ); b.INSTANCE.c(1.0F); }  } HolderScreen$drawScreen$1() { super(0); }
/* 63 */   } protected void method_1032(int mouseX, int mouseY, int button) { if (d.a.a().isEmpty()) {
/* 64 */       Intrinsics.checkNotNull(this.screen); Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); this.screen.release(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), button);
/*    */     } else {
/* 66 */       Intrinsics.checkNotNull(b.a.c()); Intrinsics.checkNotNull(b.a.e()); Intrinsics.checkNotNull(b.a.c()); ((d)d.a.a().get(0)).release(b.a.c().mouseX(), b.a.e().height() - b.a.c().mouseY(), button);
/* 67 */     }  super.method_1032(mouseX, mouseY, button); }
/*    */ 
/*    */   
/*    */   protected void method_1024(char p_73869_0_, int typedChar) {
/* 71 */     if (d.a.a().isEmpty()) {
/* 72 */       Intrinsics.checkNotNull(this.screen); this.screen.onKey(typedChar, p_73869_0_);
/*    */     } else {
/* 74 */       ((d)d.a.a().get(0)).onKey(typedChar, p_73869_0_);
/* 75 */     }  super.method_1024(p_73869_0_, typedChar);
/*    */   }
/*    */   
/*    */   public void method_1030() {
/* 79 */     Intrinsics.checkNotNull(this.screen); this.screen.exit();
/* 80 */     d.a.a().clear();
/* 81 */     super.method_1030();
/*    */   }
/*    */   
/*    */   public boolean method_1037() {
/* 85 */     return false;
/*    */   }
/*    */   
/*    */   public void method_9582(class_1600 m, int w, int h) {
/* 89 */     Intrinsics.checkNotNullParameter(m, ""); super.method_9582(this.field_1229, w, h);
/* 90 */     Intrinsics.checkNotNull(this.screen); Intrinsics.checkNotNull(b.a.e()); this.screen.setWidth(b.a.e().width());
/* 91 */     Intrinsics.checkNotNull(b.a.e()); this.screen.setHeight(b.a.e().height());
/* 92 */     this.screen.exit();
/* 93 */     this.screen.init();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\HolderScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */