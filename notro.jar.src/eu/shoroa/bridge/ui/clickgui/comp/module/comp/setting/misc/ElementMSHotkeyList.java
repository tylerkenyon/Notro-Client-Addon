/*     */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting.misc;
/*     */ 
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.feature.b.b.a;
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import eu.shoroa.bridge.ui.b.h;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\020!\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\004\n\002\020\f\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001:\001\033B\033\022\022\020\005\032\016\022\n\022\b\022\004\022\0020\0030\0020\030¢\006\004\b\031\020\032J'\020\n\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\007H\026¢\006\004\b\n\020\013J\017\020\f\032\0020\004H\026¢\006\004\b\f\020\rJ\037\020\017\032\0020\t2\006\020\005\032\0020\0072\006\020\006\032\0020\016H\026¢\006\004\b\017\020\020J'\020\021\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\007H\026¢\006\004\b\021\020\013J'\020\022\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\004H\026¢\006\004\b\022\020\023R\036\020\026\032\f\022\b\022\0060\025R\0020\0000\0248\002X\004¢\006\006\n\004\b\026\020\027"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/b;", "", "Leu/shoroa/bridge/feature/b/b/a;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "offset", "()F", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList$ElementHotkey;", "hotkeyElements", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Leu/shoroa/bridge/feature/c/b;", "<init>", "(Leu/shoroa/bridge/feature/c/b;)V", "ElementHotkey"})
/*     */ @SourceDebugExtension({"SMAP\nElementMSHotkeyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementMSHotkeyList.kt\neu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1855#2,2:141\n1855#2,2:143\n1855#2,2:145\n1855#2,2:147\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 ElementMSHotkeyList.kt\neu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList\n*L\n24#1:141,2\n49#1:143,2\n60#1:145,2\n67#1:147,2\n74#1:149,2\n*E\n"})
/*     */ public final class ElementMSHotkeyList extends b<List<a>> {
/*     */   @NotNull
/*     */   private final CopyOnWriteArrayList<ElementHotkey> hotkeyElements;
/*     */   
/*  17 */   public ElementMSHotkeyList(b<List<a>> setting) { super(
/*  18 */         setting);
/*     */ 
/*     */     
/*  21 */     this.hotkeyElements = new CopyOnWriteArrayList<>();
/*     */ 
/*     */     
/*  24 */     Iterable $this$forEach$iv = (Iterable)setting.b(); int $i$f$forEach = 0;
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
/* 141 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-ElementMSHotkeyList$1 = 0; this.hotkeyElements.add(new ElementHotkey(it, 0.0F, 0.0F, getW() - 12.0F, 80.0F)); }  getElements().add(a.a.a("Add", getX() + getW() - 80, getY() + 4, 76.0F, 32.0F).b(new Function0<Unit>(setting) {
/*     */             public final void invoke() { a hotkey = new a("", 0, false); ElementMSHotkeyList.this.hotkeyElements.add(new ElementMSHotkeyList.ElementHotkey(hotkey, 0.0F, 0.0F, ElementMSHotkeyList.this.getW() - 12.0F, 80.0F)); ((List<a>)this.$$setting.b()).add(hotkey); }
/* 143 */           }).style((new g()).a(null.INSTANCE))); } @NotNull public Object clone() { return super.clone(); } public void render(float mx, float my, float delta) { d.a(d.a, (d)this, 8.0F, d.a.a(a.a.k().c()), 0.0F, 8, null); d.b(d.a, getSetting().a(), getX() + 10, getY() + 20.0F, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null); d btn = getElements().get(0); btn.setX(getX() + getW() - 80); btn.setY(getY() + 4); btn.render(mx, my, delta); Iterable<ElementHotkey> $this$forEach$iv = this.hotkeyElements; int $i$f$forEach = 0; Iterator<ElementHotkey> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ElementHotkey it = (ElementHotkey)element$iv; int $i$a$-forEach-ElementMSHotkeyList$render$1 = 0; it.setX(getX() + 6); it.setY(getY() + 40 + this.hotkeyElements.indexOf(it) * 84.0F); it.setW(getW() - 12.0F); it.setH(80.0F); it.render(mx, my, delta); }
/*     */      }
/* 145 */   public float offset() { return 40.0F + ((List)getSetting().b()).size() * 84.0F; } public void click(float mx, float my, int button) { ((d)getElements().get(0)).click(mx, my, button); Iterable<ElementHotkey> $this$forEach$iv = this.hotkeyElements; int $i$f$forEach = 0; Iterator<ElementHotkey> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ElementHotkey it = (ElementHotkey)element$iv; int $i$a$-forEach-ElementMSHotkeyList$click$1 = 0; it.click(mx, my, button); }
/*     */      } public void release(float mx, float my, int button) { ((d)getElements().get(0)).release(mx, my, button); Iterable<ElementHotkey> $this$forEach$iv = this.hotkeyElements; int $i$f$forEach = 0;
/* 147 */     Iterator<ElementHotkey> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ElementHotkey it = (ElementHotkey)element$iv; int $i$a$-forEach-ElementMSHotkeyList$release$1 = 0; it.release(mx, my, button); }
/*     */      } public void onKey(int code, char char) { super.onKey(code, char); Iterable<ElementHotkey> $this$forEach$iv = this.hotkeyElements; int $i$f$forEach = 0;
/* 149 */     Iterator<ElementHotkey> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ElementHotkey it = (ElementHotkey)element$iv; int $i$a$-forEach-ElementMSHotkeyList$onKey$1 = 0;
/*     */       it.onKey(code, char); }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\f\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\006\b\004\030\0002\0020\001B/\022\006\020\003\032\0020\023\022\006\020\004\032\0020\002\022\006\020\006\032\0020\002\022\006\020\037\032\0020\002\022\006\020 \032\0020\002¢\006\004\b!\020\"J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ\037\020\013\032\0020\0072\006\020\003\032\0020\0052\006\020\004\032\0020\nH\026¢\006\004\b\013\020\fJ'\020\r\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\r\020\tJ'\020\016\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\016\020\017R\024\020\021\032\0020\0208\002X\004¢\006\006\n\004\b\021\020\022R\032\020\024\032\0020\0238\007X\004¢\006\f\n\004\b\024\020\025\032\004\b\026\020\027R\026\020\031\032\0020\0308\002@\002X\016¢\006\006\n\004\b\031\020\032R\024\020\033\032\0020\0208\002X\004¢\006\006\n\004\b\033\020\022R\024\020\035\032\0020\0348\002X\004¢\006\006\n\004\b\035\020\036"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList$ElementHotkey;", "Leu/shoroa/bridge/ui/b/d;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "", "onKey", "(IC)V", "release", "render", "(FFF)V", "Leu/shoroa/bridge/ui/b/a;", "changeKeyButton", "Leu/shoroa/bridge/ui/b/a;", "Leu/shoroa/bridge/feature/b/b/a;", "hotkey", "Leu/shoroa/bridge/feature/b/b/a;", "getHotkey", "()Leu/shoroa/bridge/feature/b/b/a;", "", "listening", "Z", "removeButton", "Leu/shoroa/bridge/ui/b/h;", "textInput", "Leu/shoroa/bridge/ui/b/h;", "p3", "p4", "<init>", "(Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/misc/ElementMSHotkeyList;Leu/shoroa/bridge/feature/b/b/a;FFFF)V"})
/*     */   private final class ElementHotkey extends d {
/*     */     @NotNull
/*     */     private final a hotkey;
/*     */     private boolean listening;
/*     */     @NotNull
/*     */     private final h textInput;
/*     */     @NotNull
/*     */     private final a removeButton;
/*     */     @NotNull
/*     */     private final a changeKeyButton;
/*     */     
/*     */     public ElementHotkey(a hotkey, float x, float y, float w, float f1) {
/*     */       super(x, y, w, f1);
/*     */       this.hotkey = hotkey;
/*     */       h h1 = h.a.a("text", 0.0F, 0.0F, w - 96.0F, 40.0F), h2 = h1;
/*     */       ElementHotkey elementHotkey = this;
/*     */       int $i$a$-apply-ElementMSHotkeyList$ElementHotkey$textInput$1 = 0;
/*     */       h2.a(this.hotkey.a());
/*     */       elementHotkey.textInput = h1.a(new ElementMSHotkeyList$ElementHotkey$textInput$2());
/*     */       this.removeButton = a.a.a("", 0.0F, 0.0F, 40.0F, 40.0F).b(new ElementMSHotkeyList$ElementHotkey$removeButton$1(this)).c("");
/*     */       this.changeKeyButton = a.a.a("", 0.0F, 0.0F, 40.0F, 40.0F).b(new ElementMSHotkeyList$ElementHotkey$changeKeyButton$1()).c("");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     @JvmName(name = "getHotkey")
/*     */     public final a getHotkey() {
/*     */       return this.hotkey;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Object clone() {
/*     */       return super.clone();
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\n¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/ui/b/h;", "p0", "", "invoke", "(Leu/shoroa/bridge/ui/b/h;)V"})
/*     */     static final class ElementMSHotkeyList$ElementHotkey$textInput$2 extends Lambda implements Function1<h, Unit> {
/*     */       public final void invoke(h it) {
/*     */         Intrinsics.checkNotNullParameter(it, "");
/*     */         ElementMSHotkeyList.ElementHotkey.this.getHotkey().a(it.b());
/*     */       }
/*     */       
/*     */       ElementMSHotkeyList$ElementHotkey$textInput$2() {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "invoke", "()V"})
/*     */     static final class ElementMSHotkeyList$ElementHotkey$removeButton$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() {
/*     */         this.this$0.hotkeyElements.remove(ElementMSHotkeyList.ElementHotkey.this);
/*     */         ((List)this.this$0.getSetting().b()).remove(ElementMSHotkeyList.ElementHotkey.this.getHotkey());
/*     */       }
/*     */       
/*     */       ElementMSHotkeyList$ElementHotkey$removeButton$1(ElementMSHotkeyList.ElementHotkey elementHotkey) {
/*     */         super(0);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "invoke", "()V"})
/*     */     static final class ElementMSHotkeyList$ElementHotkey$changeKeyButton$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() {
/*     */         ElementMSHotkeyList.ElementHotkey.this.listening = true;
/*     */       }
/*     */       
/*     */       ElementMSHotkeyList$ElementHotkey$changeKeyButton$1() {
/*     */         super(0);
/*     */       }
/*     */     }
/*     */     
/*     */     public void render(float mx, float my, float delta) {
/*     */       d.a(d.a, this, 8.0F, d.a.a(a.a.k().b()), 0.0F, 8, null);
/*     */       if (b.a.f() == null || b.a.f().keyName(this.hotkey.b()) == null)
/*     */         b.a.f().keyName(this.hotkey.b()); 
/*     */       d.b((d)b.a.f().keyName(this.hotkey.b()), "Key: " + "NONE", getX() + 16, getY() + 20.0F, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */       d.a(d.a, getX() + getW() - 44.0F, getY() + getH() - 44.0F, 40.0F, 40.0F, 8.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 64, null);
/*     */       d.a(d.a, getX() + getW() - 88.0F, getY() + getH() - 44.0F, 40.0F, 40.0F, 8.0F, d.a.a(a.a.k().d()).a(2.0F), 0.0F, 64, null);
/*     */       if (this.listening)
/*     */         d.b(d.a, "Listening...", getX() + getW() - 16, getY() + 20.0F, "semibold", 18.0F, a.a.k().e(), d.a.RIGHT_MIDDLE, 0.0F, 0.0F, 384, null); 
/*     */       this.textInput.setW(getW() - 96.0F);
/*     */       this.textInput.setX(getX() + 4);
/*     */       this.textInput.setY(getY() + getH() - 44.0F);
/*     */       this.textInput.render(mx, my, delta);
/*     */       this.removeButton.setX(getX() + getW() - 44.0F);
/*     */       this.removeButton.setY(getY() + getH() - 44.0F);
/*     */       this.removeButton.render(mx, my, delta);
/*     */       this.changeKeyButton.setX(getX() + getW() - 88.0F);
/*     */       this.changeKeyButton.setY(getY() + getH() - 44.0F);
/*     */       this.changeKeyButton.render(mx, my, delta);
/*     */     }
/*     */     
/*     */     public void click(float mx, float my, int button) {
/*     */       this.listening = false;
/*     */       this.textInput.click(mx, my, button);
/*     */       this.removeButton.click(mx, my, button);
/*     */       this.changeKeyButton.click(mx, my, button);
/*     */     }
/*     */     
/*     */     public void release(float mx, float my, int button) {
/*     */       this.textInput.release(mx, my, button);
/*     */       this.removeButton.release(mx, my, button);
/*     */       this.changeKeyButton.release(mx, my, button);
/*     */     }
/*     */     
/*     */     public void onKey(int code, char char) {
/*     */       super.onKey(code, char);
/*     */       this.textInput.onKey(code, char);
/*     */       if (this.listening) {
/*     */         this.hotkey.a(code);
/*     */         this.listening = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\misc\ElementMSHotkeyList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */