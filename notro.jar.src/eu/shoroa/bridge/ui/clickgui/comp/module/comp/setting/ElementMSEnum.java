/*    */ package eu.shoroa.bridge.ui.clickgui.comp.module.comp.setting;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\020\020\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\0002\f\022\b\022\006\022\002\b\0030\0020\001:\001!B\031\022\020\020\004\032\f\022\b\022\006\022\002\b\0030\0020\036¢\006\004\b\037\020 J'\020\t\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\t\020\nJ\017\020\013\032\0020\003H\026¢\006\004\b\013\020\fJ'\020\r\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\006H\026¢\006\004\b\r\020\nJ'\020\016\032\0020\b2\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\003H\026¢\006\004\b\016\020\017R,\020\023\032\032\022\b\022\0060\021R\0020\0000\020j\f\022\b\022\0060\021R\0020\000`\0228\002X\004¢\006\006\n\004\b\023\020\024R&\020\025\032\006\022\002\b\0030\0028\007@\007X\016¢\006\022\n\004\b\025\020\026\032\004\b\027\020\030\"\004\b\031\020\032R\024\020\034\032\0020\0338\002X\004¢\006\006\n\004\b\034\020\035"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/b;", "", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "offset", "()F", "release", "render", "(FFF)V", "Ljava/util/ArrayList;", "Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum$EnumButton;", "Lkotlin/collections/a;", "enums", "Ljava/util/ArrayList;", "selected", "Ljava/lang/Enum;", "getSelected", "()Ljava/lang/Enum;", "setSelected", "(Ljava/lang/Enum;)V", "Leu/shoroa/bridge/d/e/g;", "smooth", "Leu/shoroa/bridge/d/e/g;", "Leu/shoroa/bridge/feature/c/b;", "<init>", "(Leu/shoroa/bridge/feature/c/b;)V", "EnumButton"})
/*    */ @SourceDebugExtension({"SMAP\nElementMSEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementMSEnum.kt\neu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n13309#2,2:74\n1855#3,2:76\n1855#3,2:78\n*S KotlinDebug\n*F\n+ 1 ElementMSEnum.kt\neu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum\n*L\n19#1:74,2\n36#1:76,2\n47#1:78,2\n*E\n"})
/*    */ public final class ElementMSEnum extends b<Enum<?>> {
/*    */   @NotNull
/*    */   private final ArrayList<EnumButton> enums;
/*    */   @NotNull
/*    */   private Enum<?> selected;
/*    */   @NotNull
/*    */   private final g smooth;
/*    */   
/* 13 */   public ElementMSEnum(b setting) { super(setting); Enum[] arrayOfEnum; byte b1;
/*    */     int i;
/* 15 */     this.enums = new ArrayList<>();
/*    */ 
/*    */ 
/*    */     
/* 19 */     if ((Enum)setting.b() != null && ((Enum)setting.b()).getClass() != null && (Enum[])((Enum)setting.b()).getClass().getEnumConstants() != null) { arrayOfEnum = (Enum[])((Enum)setting.b()).getClass().getEnumConstants(); int $i$f$forEach = 0;
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
/* 74 */       b1 = 0; i = arrayOfEnum.length; } else { (Enum[])((Enum)setting.b()).getClass().getEnumConstants(); this.selected = (Enum)setting.b(); this.smooth = new g(-1.0F); }  if (b1 < i) { Object element$iv = arrayOfEnum[b1], object1 = element$iv; int $i$a$-forEach-ElementMSEnum$1 = 0; Intrinsics.checkNotNull(object1); this.enums.add(new EnumButton((Enum<?>)object1)); }  }
/*    */   @NotNull public Object clone() { return super.clone(); }
/* 76 */   public float offset() { return 50.0F; } public void render(float mx, float my, float delta) { if (this.enums.isEmpty()) return;  Intrinsics.checkNotNullExpressionValue(this.enums.get(this.selected.ordinal()), ""); EnumButton se = this.enums.get(this.selected.ordinal()); if (this.smooth.a() < 0.0F) this.smooth.a(se.getX() - 4);  this.smooth.a(se.getX() - 4, 10.0F); d.a(d.a, (d)this, 8.0F, d.a.a(a.a.k().c()), 0.0F, 8, null); d.b(d.a, getSetting().a(), getX() + 10, getY() + getH() / 2.0F, "semibold", 18.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null); d.a(d.a, this.smooth.a(), getY() + 8, se.getW() + 8, se.getH() + 8, 12.0F, d.a.a(a.a.k().f()), 0.0F, 64, null); float offset = 0.0F; Iterable<EnumButton> $this$forEach$iv = this.enums; int $i$f$forEach = 0; Iterator<EnumButton> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EnumButton it = (EnumButton)element$iv; int $i$a$-forEach-ElementMSEnum$render$1 = 0; it.setW(10.0F + d.a.a(it.getEnum().name(), "semibold", 16.0F)); it.setH(10.0F + d.a.a("semibold", 16.0F)); it.setY(getY() + getH() / 2.0F - it.getH() / 2.0F); it.setX(getX() + getW() - it.getH() / 2.0F - it.getW() - offset); offset += 10 + it.getW(); it.render(mx, my, delta); }  }
/*    */   @NotNull @JvmName(name = "getSelected") public final Enum<?> getSelected() { return this.selected; }
/* 78 */   @JvmName(name = "setSelected") public final void setSelected(Enum<?> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.selected = <set-?>; } public void click(float mx, float my, int button) { Iterable<EnumButton> $this$forEach$iv = this.enums; int $i$f$forEach = 0; Iterator<EnumButton> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); EnumButton it = (EnumButton)element$iv; int $i$a$-forEach-ElementMSEnum$click$1 = 0;
/*    */       it.click(mx, my, button); }
/*    */      }
/*    */ 
/*    */   
/*    */   public void release(float mx, float my, int button) {}
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020\020\n\002\b\006\b\004\030\0002\0020\001B\023\022\n\020\003\032\006\022\002\b\0030\022¢\006\004\b\027\020\030J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\b\020\tJ'\020\n\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\005H\026¢\006\004\b\n\020\tJ'\020\013\032\0020\0072\006\020\003\032\0020\0022\006\020\004\032\0020\0022\006\020\006\032\0020\002H\026¢\006\004\b\013\020\fR\036\020\016\032\006*\0020\r0\r8\007X\004¢\006\f\n\004\b\016\020\017\032\004\b\020\020\021R\036\020\023\032\006\022\002\b\0030\0228\007X\004¢\006\f\n\004\b\023\020\024\032\004\b\025\020\026"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum$EnumButton;", "Leu/shoroa/bridge/ui/b/d;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "release", "render", "(FFF)V", "Leu/shoroa/bridge/b/a/a;", "anim", "Leu/shoroa/bridge/b/a/a;", "getAnim", "()Leu/shoroa/bridge/b/a/a;", "", "enum", "Ljava/lang/Enum;", "getEnum", "()Ljava/lang/Enum;", "<init>", "(Leu/shoroa/bridge/ui/clickgui/comp/module/comp/setting/ElementMSEnum;Ljava/lang/Enum;)V"})
/*    */   private final class EnumButton extends d {
/*    */     @NotNull
/*    */     private final Enum<?> enum;
/*    */     private final a anim;
/*    */     
/*    */     public EnumButton(Enum<?> enum) {
/*    */       super(0.0F, 0.0F, 0.0F, 0.0F);
/*    */       this.enum = enum;
/*    */       this.anim = a.a(EnumButton::anim$lambda$0, EnumButton::anim$lambda$1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     @JvmName(name = "getEnum")
/*    */     public final Enum<?> getEnum() {
/*    */       return this.enum;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Object clone() {
/*    */       return super.clone();
/*    */     }
/*    */     
/*    */     @JvmName(name = "getAnim")
/*    */     public final a getAnim() {
/*    */       return this.anim;
/*    */     }
/*    */     
/*    */     private static final Float anim$lambda$0() {
/*    */       return Float.valueOf(200.0F);
/*    */     }
/*    */     
/*    */     private static final b anim$lambda$1() {
/*    */       return b.LINEAR;
/*    */     }
/*    */     
/*    */     public void render(float mx, float my, float delta) {
/*    */       this.anim.a(this.enum.equals(ElementMSEnum.this.getSelected()));
/*    */       d.a(d.a, getX() - 2, getY() - 2, getW() + 4, getH() + 4, 10.0F, d.a.a(a.a.k().c()), 0.0F, 64, null);
/*    */       d.a(d.a, this, 8.0F, d.a.a(a.a.k().b()), 0.0F, 8, null);
/*    */       Intrinsics.checkNotNullExpressionValue(this.anim.a(a.a.k().e(), a.a.k().f()), "");
/*    */       d.b(d.a, this.enum.name(), getX() + getW() / 2.0F, getY() + getH() / 2.0F + true, "semibold", 16.0F, this.anim.a(a.a.k().e(), a.a.k().f()), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */     }
/*    */     
/*    */     public void click(float mx, float my, int button) {
/*    */       if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/*    */         ElementMSEnum.this.setSelected(this.enum);
/*    */         ElementMSEnum.this.getSetting().a(ElementMSEnum.this.getSelected());
/*    */         ElementMSEnum.this.getSetting().g();
/*    */       } 
/*    */     }
/*    */     
/*    */     public void release(float mx, float my, int button) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\module\comp\setting\ElementMSEnum.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */