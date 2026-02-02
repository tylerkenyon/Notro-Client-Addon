/*     */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting.misc;
/*     */ 
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.d.e.a;
/*     */ import eu.shoroa.bridge.feature.a.b;
/*     */ import eu.shoroa.bridge.feature.b.b.a;
/*     */ import eu.shoroa.bridge.ui.b.a;
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import eu.shoroa.bridge.ui.b.h;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\f\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\006\b\004\030\0002\0020\001B/\022\006\020\003\032\0020\023\022\006\020\004\032\0020\002\022\006\020\006\032\0020\002\022\006\020\037\032\0020\002\022\006\020 \032\0020\002¢\006\004\b!\020\"J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\037\020\013\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\nH\026¢\006\004\b\013\020\fJ'\020\r\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\r\020\tJ'\020\016\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\016\020\017R\024\020\021\032\0020\0208\002X\004¢\006\006\n\004\b\021\020\022R\032\020\024\032\0020\0238\007X\004¢\006\f\n\004\b\024\020\025\032\004\b\026\020\027R\026\020\031\032\0020\0308\002@\002X\016¢\006\006\n\004\b\031\020\032R\024\020\033\032\0020\0208\002X\004¢\006\006\n\004\b\033\020\022R\024\020\035\032\0020\0348\002X\004¢\006\006\n\004\b\035\020\036"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList$ElementHotkey;", "Leu/shoroa/bridge/ui/b/d;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "Leu/shoroa/bridge/ui/b/a;", "changeKeyButton", "Leu/shoroa/bridge/ui/b/a;", "Leu/shoroa/bridge/feature/b/b/a;", "hotkey", "Leu/shoroa/bridge/feature/b/b/a;", "getHotkey", "()Leu/shoroa/bridge/feature/b/b/a;", "", "listening", "Z", "removeButton", "Leu/shoroa/bridge/ui/b/h;", "textInput", "Leu/shoroa/bridge/ui/b/h;", "p3", "p4", "<init>", "(Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList;Leu/shoroa/bridge/feature/b/b/a;FFFF)V"})
/*     */ final class ElementHotkey
/*     */   extends d
/*     */ {
/*     */   @NotNull
/*     */   private final a hotkey;
/*     */   private boolean listening;
/*     */   @NotNull
/*     */   private final h textInput;
/*     */   @NotNull
/*     */   private final a removeButton;
/*     */   @NotNull
/*     */   private final a changeKeyButton;
/*     */   
/*     */   public ElementHotkey(a hotkey, float x, float y, float w, float f1) {
/*  79 */     super(x, y, w, f1); this.hotkey = hotkey;
/*     */ 
/*     */     
/*  82 */     h h1 = h.a.a("text", 0.0F, 0.0F, w - 96.0F, 40.0F), h2 = h1; ElementHotkey elementHotkey = 
/*     */ 
/*     */       
/*  85 */       this; int $i$a$-apply-ElementMSHotkeyList$ElementHotkey$textInput$1 = 0; h2.a(this.hotkey.a()); elementHotkey.textInput = h1.a(new ElementMSHotkeyList$ElementHotkey$textInput$2());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     this.removeButton = a.a.a("", 0.0F, 0.0F, 40.0F, 40.0F).b(new ElementMSHotkeyList$ElementHotkey$removeButton$1(this)).c("");
/*     */ 
/*     */     
/*  95 */     this.changeKeyButton = a.a.a("", 0.0F, 0.0F, 40.0F, 40.0F).b(new ElementMSHotkeyList$ElementHotkey$changeKeyButton$1()).c("");
/*     */   } @NotNull @JvmName(name = "getHotkey") public final a getHotkey() { return this.hotkey; } @NotNull public Object clone() { return super.clone(); }
/*  97 */   public void render(float mx, float my, float delta) { d.a(d.a, this, 8.0F, d.a.a(a.a.k().b()), 0.0F, 8, null);
/*  98 */     if (b.a.f() == null || b.a.f().keyName(this.hotkey.b()) == null) b.a.f().keyName(this.hotkey.b());  d.b((d)b.a.f().keyName(this.hotkey.b()), "Key: " + "NONE", getX() + 16, getY() + 20.0F, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*  99 */     d.a(d.a, getX() + getW() - 44.0F, getY() + getH() - 44.0F, 40.0F, 40.0F, 8.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 64, null);
/* 100 */     d.a(d.a, getX() + getW() - 88.0F, getY() + getH() - 44.0F, 40.0F, 40.0F, 8.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 64, null);
/*     */     
/* 102 */     if (this.listening) {
/* 103 */       d.b(d.a, "Listening...", getX() + getW() - 16, getY() + 20.0F, "semibold", 18.0F, a.a.k().e(), d.a.RIGHT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */     }
/* 105 */     this.textInput.setW(getW() - 96.0F);
/* 106 */     this.textInput.setX(getX() + 4);
/* 107 */     this.textInput.setY(getY() + getH() - 44.0F);
/* 108 */     this.textInput.render(mx, my, delta);
/* 109 */     this.removeButton.setX(getX() + getW() - 44.0F);
/* 110 */     this.removeButton.setY(getY() + getH() - 44.0F);
/* 111 */     this.removeButton.render(mx, my, delta);
/* 112 */     this.changeKeyButton.setX(getX() + getW() - 88.0F);
/* 113 */     this.changeKeyButton.setY(getY() + getH() - 44.0F);
/* 114 */     this.changeKeyButton.render(mx, my, delta); }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/ui/b/h;", "p0", "", "invoke", "(Leu/shoroa/bridge/ui/b/h;)V"}) static final class ElementMSHotkeyList$ElementHotkey$textInput$2 extends Lambda implements Function1<h, Unit> {
/*     */     public final void invoke(h it) { Intrinsics.checkNotNullParameter(it, "");
/*     */       ElementMSHotkeyList.ElementHotkey.this.getHotkey().a(it.b()); }
/* 118 */     ElementMSHotkeyList$ElementHotkey$textInput$2() { super(1); } } public void click(float mx, float my, int button) { this.listening = false;
/*     */     
/* 120 */     this.textInput.click(mx, my, button);
/* 121 */     this.removeButton.click(mx, my, button);
/* 122 */     this.changeKeyButton.click(mx, my, button); }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "invoke", "()V"}) static final class ElementMSHotkeyList$ElementHotkey$removeButton$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() { ElementMSHotkeyList.access$getHotkeyElements$p(this.this$0).remove(ElementMSHotkeyList.ElementHotkey.this); ((List)this.this$0.getSetting().b()).remove(ElementMSHotkeyList.ElementHotkey.this.getHotkey()); }
/*     */     ElementMSHotkeyList$ElementHotkey$removeButton$1(ElementMSHotkeyList.ElementHotkey elementHotkey) { super(0); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "invoke", "()V"}) static final class ElementMSHotkeyList$ElementHotkey$changeKeyButton$1 extends Lambda implements Function0<Unit> {
/* 126 */     public final void invoke() { ElementMSHotkeyList.ElementHotkey.this.listening = true; } ElementMSHotkeyList$ElementHotkey$changeKeyButton$1() { super(0); } } public void release(float mx, float my, int button) { this.textInput.release(mx, my, button);
/* 127 */     this.removeButton.release(mx, my, button);
/* 128 */     this.changeKeyButton.release(mx, my, button); }
/*     */ 
/*     */   
/*     */   public void onKey(int code, char char) {
/* 132 */     super.onKey(code, char);
/* 133 */     this.textInput.onKey(code, char);
/* 134 */     if (this.listening) {
/* 135 */       this.hotkey.a(code);
/* 136 */       this.listening = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\misc\ElementMSHotkeyList$ElementHotkey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */