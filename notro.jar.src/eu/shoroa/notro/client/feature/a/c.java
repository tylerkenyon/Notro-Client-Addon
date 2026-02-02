/*     */ package eu.shoroa.notro.client.feature.a;
/*     */ 
/*     */ import kotlin.reflect.KProperty;
/*     */ import net.minecraft.class_231;
/*     */ import net.minecraft.class_520;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\016\n\002\020\007\n\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\025\020\007\032\0020\0062\006\020\005\032\0020\004¢\006\004\b\007\020\bJ'\020\016\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\0132\006\020\r\032\0020\013H\026¢\006\004\b\016\020\017J\025\020\022\032\0020\0062\006\020\021\032\0020\020¢\006\004\b\022\020\023J\025\020\024\032\0020\0062\006\020\021\032\0020\020¢\006\004\b\024\020\023J'\020\025\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\0132\006\020\r\032\0020\013H\026¢\006\004\b\025\020\017R!\020\033\032\b\022\004\022\0020\t0\0268FX\002¢\006\f\n\004\b\027\020\030\032\004\b\031\020\032R!\020\036\032\b\022\004\022\0020\t0\0268FX\002¢\006\f\n\004\b\034\020\030\032\004\b\035\020\032R!\020!\032\b\022\004\022\0020\t0\0268FX\002¢\006\f\n\004\b\037\020\030\032\004\b \020\032R!\020$\032\b\022\004\022\0020\0040\0268FX\002¢\006\f\n\004\b\"\020\030\032\004\b#\020\032R!\020(\032\b\022\004\022\0020%0\0268FX\002¢\006\f\n\004\b&\020\030\032\004\b'\020\032R!\020+\032\b\022\004\022\0020\0040\0268FX\002¢\006\f\n\004\b)\020\030\032\004\b*\020\032¨\006,"}, d2 = {"Leu/shoroa/notro/client/feature/module/ModuleBlockOverlay;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "Ljava/awt/Color;", "clr", "", "color", "(Ljava/awt/Color;)V", "", "nvg", "", "displayWidth", "displayHeight", "dummy", "(ZII)V", "Lnet/minecraft/class_231;", "box", "fillAABB", "(Lnet/minecraft/class_231;)V", "outlineAABB", "render", "Leu/shoroa/bridge/feature/setting/Setting;", "doDepth$delegate", "Leu/shoroa/bridge/feature/setting/Setting;", "getDoDepth", "()Leu/shoroa/bridge/feature/setting/Setting;", "doDepth", "doFill$delegate", "getDoFill", "doFill", "doOutline$delegate", "getDoOutline", "doOutline", "filLColor$delegate", "getFilLColor", "filLColor", "", "outlienThickness$delegate", "getOutlienThickness", "outlienThickness", "outlineColor$delegate", "getOutlineColor", "outlineColor", "NotroClient"})
/*     */ public final class c extends b {
/*     */   @NotNull
/*     */   private final b b;
/*     */   @NotNull
/*     */   private final b c;
/*     */   @NotNull
/*     */   private final b d;
/*     */   @NotNull
/*     */   private final b e;
/*     */   @NotNull
/*     */   private final b f;
/*     */   @NotNull
/*     */   private final b g;
/*     */   
/*  23 */   public c() { super("BlockOverlay", "Custom block selection", true, "blockoverlay", false, 16, null);
/*  24 */     this.b = a("Fill", false);
/*  25 */     this.c = a("Outline", true);
/*     */     
/*  27 */     this.d = a("Outline Thickness", Float.valueOf(1.0F), Float.valueOf(0.0F), Float.valueOf(8.0F), Float.valueOf(0.1F)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return (Boolean)this.a.d().b(); } }
/*     */       );
/*  29 */     this.e = a("Fill Color", 0, 0, 0, 0).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return (Boolean)this.a.c().b(); } }
/*     */       );
/*  31 */     this.f = b.a(this, "Outline Color", 0, 0, 0, 0, 16, null).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return (Boolean)this.a.d().b(); } });
/*  32 */     this.g = a("Depth", true); } @NotNull public final b<Boolean> c() { return this.b.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[6]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "doFill", "getDoFill()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "doOutline", "getDoOutline()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "outlienThickness", "getOutlienThickness()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "filLColor", "getFilLColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[4] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "outlineColor", "getOutlineColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[5] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "doDepth", "getDoDepth()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @NotNull public final b<Boolean> d() { return this.c.a(this, a[1]); } @NotNull public final b<Float> s() { return this.d.a(this, a[2]); } @NotNull public final b<Boolean> v() { return this.g.a(this, a[5]); }
/*     */   @NotNull
/*     */   public final b<Color> t() { return this.e.a(this, a[3]); } @NotNull
/*     */   public final b<Color> u() {
/*     */     return this.f.a(this, a[4]);
/*     */   } public void a(boolean nvg, int displayWidth, int displayHeight) {} public void b(boolean nvg, int displayWidth, int displayHeight) {} public final void a(class_231 box) {
/*  38 */     Intrinsics.checkNotNullParameter(box, ""); class_533 tessellator = class_533.method_9926();
/*  39 */     class_520 worldRenderer = tessellator.method_9928();
/*  40 */     worldRenderer.method_9737(7, class_2520.field_11206);
/*  41 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/*  42 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/*  43 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/*  44 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/*  45 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/*  46 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/*  47 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/*  48 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/*  49 */     tessellator.method_9927();
/*  50 */     worldRenderer.method_9737(7, class_2520.field_11206);
/*  51 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/*  52 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/*  53 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/*  54 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/*  55 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/*  56 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/*  57 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/*  58 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/*  59 */     tessellator.method_9927();
/*  60 */     worldRenderer.method_9737(7, class_2520.field_11206);
/*  61 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/*  62 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/*  63 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/*  64 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/*  65 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/*  66 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/*  67 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/*  68 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/*  69 */     tessellator.method_9927();
/*  70 */     worldRenderer.method_9737(7, class_2520.field_11206);
/*  71 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/*  72 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/*  73 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/*  74 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/*  75 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/*  76 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/*  77 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/*  78 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/*  79 */     tessellator.method_9927();
/*  80 */     worldRenderer.method_9737(7, class_2520.field_11206);
/*  81 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/*  82 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/*  83 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/*  84 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/*  85 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/*  86 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/*  87 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/*  88 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/*  89 */     tessellator.method_9927();
/*  90 */     worldRenderer.method_9737(7, class_2520.field_11206);
/*  91 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/*  92 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/*  93 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/*  94 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/*  95 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/*  96 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/*  97 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/*  98 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/*  99 */     tessellator.method_9927();
/*     */   }
/*     */   public final void b(class_231 box) {
/* 102 */     Intrinsics.checkNotNullParameter(box, ""); class_533 tessellator = class_533.method_9926();
/* 103 */     class_520 worldRenderer = tessellator.method_9928();
/* 104 */     worldRenderer.method_9737(3, class_2520.field_11206);
/* 105 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/* 106 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/* 107 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/* 108 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/* 109 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/* 110 */     tessellator.method_9927();
/* 111 */     worldRenderer.method_9737(3, class_2520.field_11206);
/* 112 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/* 113 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/* 114 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/* 115 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/* 116 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/* 117 */     tessellator.method_9927();
/* 118 */     worldRenderer.method_9737(1, class_2520.field_11206);
/* 119 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_584).method_9750();
/* 120 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_584).method_9750();
/* 121 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_584).method_9750();
/* 122 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_584).method_9750();
/* 123 */     worldRenderer.method_9742(box.field_585, box.field_583, box.field_587).method_9750();
/* 124 */     worldRenderer.method_9742(box.field_585, box.field_586, box.field_587).method_9750();
/* 125 */     worldRenderer.method_9742(box.field_582, box.field_583, box.field_587).method_9750();
/* 126 */     worldRenderer.method_9742(box.field_582, box.field_586, box.field_587).method_9750();
/* 127 */     tessellator.method_9927();
/*     */   }
/*     */   
/*     */   public final void a(Color clr) {
/* 131 */     Intrinsics.checkNotNullParameter(clr, ""); GL11.glColor4f(clr.getRed() / 255.0F, clr.getGreen() / 255.0F, clr.getBlue() / 255.0F, clr.getAlpha() / 255.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */