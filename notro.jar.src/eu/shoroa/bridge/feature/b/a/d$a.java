/*     */ package eu.shoroa.bridge.feature.b.a;
/*     */ 
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.b.a.b;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.b.e;
/*     */ import eu.shoroa.bridge.feature.c.a.d;
/*     */ import eu.shoroa.bridge.feature.c.a.k;
/*     */ import java.awt.Color;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\013\b\004\030\0002\0020\001BO\022\f\020\003\032\b\022\004\022\0020\0020\r\022\006\020\004\032\0020\b\022\006\020\033\032\0020\b\022\006\020\034\032\0020\b\022\006\020\035\032\0020\b\022\006\020\036\032\0020\026\022\020\b\002\020\037\032\n\022\004\022\0020\026\030\0010\r¢\006\004\b \020!J\035\020\006\032\0020\0052\006\020\003\032\0020\0022\006\020\004\032\0020\002¢\006\004\b\006\020\007R\027\020\006\032\0020\b8\007¢\006\f\n\004\b\t\020\n\032\004\b\013\020\fR \020\016\032\b\022\004\022\0020\0020\r8\007X\004¢\006\f\n\004\b\016\020\017\032\004\b\006\020\020R\032\020\021\032\0020\b8\007X\004¢\006\f\n\004\b\021\020\n\032\004\b\016\020\fR\027\020\022\032\0020\b8\007¢\006\f\n\004\b\022\020\n\032\004\b\021\020\fR\030\020\013\032\006*\0020\0230\0238\002X\004¢\006\006\n\004\b\024\020\025R\"\020\t\032\n\022\004\022\0020\026\030\0010\r8\007X\004¢\006\f\n\004\b\027\020\017\032\004\b\030\020\020R\032\020\030\032\0020\0268\007X\004¢\006\f\n\004\b\030\020\031\032\004\b\t\020\032R\032\020\027\032\0020\b8\007X\004¢\006\f\n\004\b\013\020\n\032\004\b\022\020\f"}, d2 = {"Leu/shoroa/bridge/feature/b/a/d$a;", "", "", "p0", "p1", "", "a", "(ZZ)V", "", "f", "F", "e", "()F", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "c", "d", "Leu/shoroa/bridge/b/a/a;", "i", "Leu/shoroa/bridge/b/a/a;", "", "h", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "p2", "p3", "p4", "p5", "p6", "<init>", "(Leu/shoroa/bridge/feature/b/a/d;Lkotlin/jvm/functions/Function0;FFFFLjava/lang/String;Lkotlin/jvm/functions/Function0;)V"})
/*     */ public final class a
/*     */ {
/*     */   @NotNull
/*     */   private final Function0<Boolean> b;
/*     */   private final float c;
/*     */   private final float d;
/*     */   private final float e;
/*     */   private final float f;
/*     */   @NotNull
/*     */   private final String g;
/*     */   @Nullable
/*     */   private final Function0<String> h;
/*     */   private final eu.shoroa.bridge.b.a.a i;
/*     */   
/*     */   @NotNull
/*     */   @JvmName(name = "a")
/*     */   public final Function0<Boolean> a() {
/*     */     return this.b;
/*     */   }
/*     */   
/*     */   @JvmName(name = "b")
/*     */   public final float b() {
/*     */     return this.c;
/*     */   }
/*     */   
/*     */   @JvmName(name = "c")
/*     */   public final float c() {
/*     */     return this.d;
/*     */   }
/*     */   
/*     */   @JvmName(name = "d")
/*     */   public final float d() {
/*     */     return this.e;
/*     */   }
/*     */   
/*     */   @JvmName(name = "e")
/*     */   public final float e() {
/*     */     return this.f;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   @JvmName(name = "f")
/*     */   public final String f() {
/*     */     return this.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   @JvmName(name = "g")
/*     */   public final Function0<String> g() {
/*     */     return this.h;
/*     */   }
/*     */   
/*     */   public a(d this$0, Function0<Boolean> keyDown, float kx, float ky, float width, float height, String text, Function0<String> subText) {
/*  85 */     this.b = keyDown; this.c = kx; this.d = ky; this.e = width; this.f = height; this.g = text; this.h = subText;
/*     */     
/*  87 */     this.i = eu.shoroa.bridge.b.a.a.a(a::h, a::i); } private static final Float h() { return Float.valueOf(150.0F); } private static final b i() { return b.SINE_IN_OUT; }
/*     */   
/*     */   public final void a(boolean nvg, boolean isDummy) {
/*  90 */     boolean active = isDummy ? ((Intrinsics.areEqual(this.g, "W") || Intrinsics.areEqual(this.g, "LMB"))) : ((Boolean)this.b.invoke()).booleanValue();
/*  91 */     this.i.a(active);
/*     */ 
/*     */     
/*  94 */     boolean useModern = (this.a.c().b() == k.MODERN || (this.a.c().b() == k.CUSTOM && this.a.w().b() == d.SMOOTH));
/*  95 */     boolean useClassic = (this.a.c().b() == k.CLASSIC || (this.a.c().b() == k.CUSTOM && this.a.w().b() == d.MINECRAFT));
/*     */ 
/*     */     
/*  98 */     switch (a.a[((k)this.a.c().b()).ordinal()]) { case 1: case 2: default: break; }  Color bgColor = 
/*     */ 
/*     */       
/* 101 */       new Color(0, 0, 0, 150);
/*     */ 
/*     */ 
/*     */     
/* 105 */     switch (a.a[((k)this.a.c().b()).ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       default:
/* 108 */         break; }  Color pColor = ((Boolean)this.a.v().b()).booleanValue() ? Color.getHSBColor((float)(System.currentTimeMillis() % 2000L) / 2000.0F, 0.7F, 1.0F) : Color.WHITE;
/*     */ 
/*     */     
/* 111 */     switch (a.a[((k)this.a.c().b()).ordinal()]) { case 1: 
/*     */       case 2:
/* 113 */         if (active && !((Boolean)this.a.v().b()).booleanValue());
/* 114 */       default: break; }  Color txtColor = (Color)this.a.z().b();
/*     */ 
/*     */ 
/*     */     
/* 118 */     if (nvg) {
/* 119 */       switch (a.a[((k)this.a.c().b()).ordinal()]) { case 1: case 2: default: break; }  float radius = 
/*     */ 
/*     */         
/* 122 */         0.0F;
/*     */       
/* 124 */       if (((Boolean)this.a.t().b()).booleanValue()) d.a(d.a, this.a.l() + this.c, this.a.m() + this.d, this.e, this.f, radius, d.a.a(), 0.0F, 64, null); 
/* 125 */       if (((Boolean)this.a.s().b()).booleanValue()) { Intrinsics.checkNotNullExpressionValue(this.i.a(bgColor, pColor), ""); d.a(d.a, this.a.l() + this.c, this.a.m() + this.d, this.e, this.f, radius, d.a.a(this.i.a(bgColor, pColor)), 0.0F, 64, null); }
/*     */     
/*     */     } 
/*     */     
/* 129 */     if (this.h == null || (String)this.h.invoke() == null) (String)this.h.invoke();  String subStr = (isDummy && this.h != null) ? "0 CPS" : "";
/* 130 */     boolean hasSub = (((CharSequence)subStr).length() > 0);
/*     */     
/* 132 */     if (useModern && nvg) {
/*     */ 
/*     */       
/* 135 */       Intrinsics.checkNotNull(txtColor); d.b(d.a, this.g, this.a.l() + this.c + this.e / 2, this.a.m() + this.d + this.f / 2 - (hasSub ? 5 : false), "semibold", 18.0F, txtColor, d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */       
/* 137 */       if (hasSub) {
/*     */         
/* 139 */         Intrinsics.checkNotNullExpressionValue(txtColor.darker(), ""); d.b(d.a, subStr, this.a.l() + this.c + this.e / 2, this.a.m() + this.d + this.f / 2 + 11, "medium", 9.0F, txtColor.darker(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */       } 
/* 141 */     } else if (useClassic) {
/* 142 */       Intrinsics.checkNotNull(BridgeClient.a.b()); e renderer = BridgeClient.a.b().vanillaRenderer();
/* 143 */       float centerX = this.a.l() + this.c + this.e / 2;
/* 144 */       float centerY = this.a.m() + this.d + this.f / 2;
/*     */       
/* 146 */       if (hasSub) {
/*     */         
/* 148 */         Intrinsics.checkNotNull(txtColor); renderer.b(this.g, centerX, centerY - 4, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/* 149 */         renderer.a("§7§o" + subStr, centerX - 17, centerY + 6, 1.2F, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/* 150 */       } else if (Intrinsics.areEqual(this.g, "————") || Intrinsics.areEqual(this.g, "_______")) {
/*     */ 
/*     */         
/* 153 */         int loops = 12;
/* 154 */         float offsetStep = 1.5F;
/*     */         
/* 156 */         float totalExtension = (loops - 1) * offsetStep;
/* 157 */         float startX = centerX - totalExtension / 2;
/*     */         
/* 159 */         for (int i = 0; i < loops; i++) {
/*     */           
/* 161 */           Intrinsics.checkNotNull(txtColor); renderer.b("§l" + this.g, startX + i * offsetStep, centerY - true, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/*     */         } 
/*     */       } else {
/*     */         
/* 165 */         Intrinsics.checkNotNull(txtColor); renderer.b(this.g, centerX, centerY, txtColor, ((Boolean)this.a.u().b()).booleanValue());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\d$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */