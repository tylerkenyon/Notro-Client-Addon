/*     */ package eu.shoroa.notro.client.feature.a.a;
/*     */ 
/*     */ import java.util.Map;
/*     */ import net.minecraft.class_1699;
/*     */ import net.minecraft.class_231;
/*     */ import net.minecraft.class_864;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.joml.Vector3f;
/*     */ import org.joml.Vector4f;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\007\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\027\020\007\032\0020\0062\006\020\005\032\0020\004H\007¢\006\004\b\007\020\bJ'\020\016\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\0132\006\020\r\032\0020\013H\026¢\006\004\b\016\020\017J\025\020\022\032\0020\0212\006\020\005\032\0020\020¢\006\004\b\022\020\023J\025\020\025\032\0020\0212\006\020\024\032\0020\021¢\006\004\b\025\020\026J'\020\027\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\0132\006\020\r\032\0020\013H\026¢\006\004\b\027\020\017R\034\020\032\032\n \031*\004\030\0010\0300\0308\002X\004¢\006\006\n\004\b\032\020\033R\034\020\035\032\n \031*\004\030\0010\0340\0348\002X\004¢\006\006\n\004\b\035\020\036R!\020%\032\b\022\004\022\0020 0\0378FX\002¢\006\f\n\004\b!\020\"\032\004\b#\020$R\034\020&\032\n \031*\004\030\0010\0340\0348\002X\004¢\006\006\n\004\b&\020\036R!\020*\032\b\022\004\022\0020'0\0378FX\002¢\006\f\n\004\b(\020\"\032\004\b)\020$R0\020.\032\036\022\004\022\0020\020\022\004\022\0020,0+j\016\022\004\022\0020\020\022\004\022\0020,`-8\002X\004¢\006\006\n\004\b.\020/R\034\0201\032\n \031*\004\030\00100008\002X\004¢\006\006\n\004\b1\0202R\024\0203\032\0020\0348\002X\004¢\006\006\n\004\b3\020\036¨\0064"}, d2 = {"Leu/shoroa/notro/client/feature/module/ui/ModuleSilly;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "Leu/shoroa/bridge/event/Event3D;", "e", "", "3D!", "(Leu/shoroa/bridge/event/Event3D;)V", "", "nvg", "", "displayWidth", "displayHeight", "dummy", "(ZII)V", "Lnet/minecraft/class_1699;", "Lorg/joml/Vector3f;", "entityVec", "(Lnet/minecraft/class_1699;)Lorg/joml/Vector3f;", "pos", "project", "(Lorg/joml/Vector3f;)Lorg/joml/Vector3f;", "render", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "Ljava/nio/FloatBuffer;", "modelMatrix", "Ljava/nio/FloatBuffer;", "Leu/shoroa/bridge/feature/setting/Setting;", "Ljava/awt/Color;", "outlineColor$delegate", "Leu/shoroa/bridge/feature/setting/Setting;", "getOutlineColor", "()Leu/shoroa/bridge/feature/setting/Setting;", "outlineColor", "projectionMatrix", "", "reach$delegate", "getReach", "reach", "Ljava/util/HashMap;", "Lorg/joml/Vector4f;", "Lkotlin/collections/HashMap;", "vecMap", "Ljava/util/HashMap;", "Ljava/nio/IntBuffer;", "viewport", "Ljava/nio/IntBuffer;", "windowPosition", "NotroClient"})
/*     */ @SourceDebugExtension({"SMAP\nModuleSilly.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleSilly.kt\neu/shoroa/notro/client/feature/module/ui/ModuleSilly\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,121:1\n1855#2,2:122\n215#3,2:124\n*S KotlinDebug\n*F\n+ 1 ModuleSilly.kt\neu/shoroa/notro/client/feature/module/ui/ModuleSilly\n*L\n40#1:122,2\n82#1:124,2\n*E\n"})
/*     */ public final class h extends b {
/*     */   @NotNull
/*     */   private final FloatBuffer b;
/*     */   private final IntBuffer c;
/*     */   private final FloatBuffer d;
/*     */   private final FloatBuffer e;
/*     */   private final class_1600 f;
/*     */   @NotNull
/*     */   private final HashMap<class_1699, Vector4f> g;
/*     */   @NotNull
/*     */   private final b h;
/*     */   @NotNull
/*     */   private final b i;
/*     */   
/*  27 */   public h() { super("Silly", "Silly module", true, "silly", false, 16, null);
/*  28 */     Intrinsics.checkNotNullExpressionValue(class_329.method_854(4), ""); this.b = class_329.method_854(4);
/*  29 */     this.c = class_329.method_853(16);
/*  30 */     this.d = class_329.method_854(16);
/*  31 */     this.e = class_329.method_854(16);
/*  32 */     this.f = class_1600.method_2965();
/*  33 */     this.g = new HashMap<>();
/*     */     
/*  35 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); this.h = a("Outline", Color.WHITE);
/*  36 */     this.i = a("Reach", Float.valueOf(3.0F), (ClosedRange)RangesKt.rangeTo(0.0F, 8.0F), Float.valueOf(0.1F)); } @NotNull public final b<Color> c() { return this.h.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[2]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(h.class, "outlineColor", "getOutlineColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(h.class, "reach", "getReach()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @NotNull public final b<Float> d() { return this.i.a(this, a[1]); }
/*     */ 
/*     */   
/*     */   @Listen
/*  40 */   public final void a(b e) { Intrinsics.checkNotNullParameter(e, ""); Intrinsics.checkNotNullExpressionValue(this.f.field_3803.field_4541, ""); Iterable $this$forEach$iv = this.f.field_3803.field_4541; int $i$f$forEach = 0;
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
/* 122 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); class_864 it = (class_864)element$iv; int $i$a$-forEach-ModuleSilly$3D!$1 = 0; if (!Intrinsics.areEqual(it, this.f.field_10310) && it instanceof class_1699 && ((class_1699)it).method_2476() && it instanceof net.minecraft.class_988) { Vector3f entVec = a((class_1699)it); double wx = entVec.x - (this.f.method_9390()).field_2105; double wy = entVec.y - (this.f.method_9390()).field_2106; double wz = entVec.z - (this.f.method_9390()).field_2107; double halfWidth = it.field_3206 / 2.0D + 0.18F; class_231 bb = new class_231(wx - halfWidth, wy, wz - halfWidth, wx + halfWidth, wy + it.field_3207 + 0.18D, wz + halfWidth); double arrayOfDouble1[][] = new double[8][], arrayOfDouble[] = new double[3]; arrayOfDouble[0] = bb.field_582; arrayOfDouble[1] = bb.field_583; arrayOfDouble[2] = bb.field_584; arrayOfDouble1[0] = arrayOfDouble; arrayOfDouble = new double[3]; arrayOfDouble[0] = bb.field_582; arrayOfDouble[1] = bb.field_586; arrayOfDouble[2] = bb.field_584; arrayOfDouble1[1] = arrayOfDouble; arrayOfDouble = new double[3]; arrayOfDouble[0] = bb.field_582; arrayOfDouble[1] = bb.field_586; arrayOfDouble[2] = bb.field_587; arrayOfDouble1[2] = arrayOfDouble; arrayOfDouble = new double[3]; arrayOfDouble[0] = bb.field_582; arrayOfDouble[1] = bb.field_583; arrayOfDouble[2] = bb.field_587; arrayOfDouble1[3] = arrayOfDouble; arrayOfDouble = new double[3]; arrayOfDouble[0] = bb.field_585; arrayOfDouble[1] = bb.field_583; arrayOfDouble[2] = bb.field_584; arrayOfDouble1[4] = arrayOfDouble; arrayOfDouble = new double[3]; arrayOfDouble[0] = bb.field_585; arrayOfDouble[1] = bb.field_586; arrayOfDouble[2] = bb.field_584; arrayOfDouble1[5] = arrayOfDouble; arrayOfDouble = new double[3]; arrayOfDouble[0] = bb.field_585; arrayOfDouble[1] = bb.field_586; arrayOfDouble[2] = bb.field_587; arrayOfDouble1[6] = arrayOfDouble; arrayOfDouble = new double[3]; arrayOfDouble[0] = bb.field_585; arrayOfDouble[1] = bb.field_583; arrayOfDouble[2] = bb.field_587; arrayOfDouble1[7] = arrayOfDouble; double[][] vectors = arrayOfDouble1; Vector4f position = new Vector4f(Float.MAX_VALUE, Float.MAX_VALUE, -1.0F, -1.0F); byte b1; int i; for (b1 = 0, i = ((Object[])vectors).length; b1 < i; ) { double[] vec = vectors[b1]; Vector3f projection = a(new Vector3f((float)vec[0], (float)vec[1], (float)vec[2])); if (projection.z >= 0.0F && projection.z < 1.0F) { position.x = RangesKt.coerceAtMost(position.x, projection.x); position.y = RangesKt.coerceAtMost(position.y, projection.y); position.z = RangesKt.coerceAtLeast(position.z, projection.x); position.w = RangesKt.coerceAtLeast(position.w, projection.y); }  b1++; }  float x = position.x; float y = position.y; float w = position.z - position.x; float f1 = position.w - position.y; this.g.put(it, new Vector4f(x, y, w, f1)); }
/*     */        }
/* 124 */      } public void a(boolean nvg, int displayWidth, int displayHeight) { Iterator<Map.Entry> iterator; if (nvg) { Map<class_1699, Vector4f> $this$forEach$iv = this.g; int $i$f$forEach = 0; iterator = $this$forEach$iv.entrySet().iterator(); } else { return; }  if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-ModuleSilly$render$1 = 0;
/*     */       class_1699 e = (class_1699)it.getKey();
/*     */       Vector4f vec = (Vector4f)it.getValue(); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void b(boolean nvg, int displayWidth, int displayHeight) {}
/*     */   
/*     */   @NotNull
/*     */   public final Vector3f a(Vector3f pos) {
/*     */     Intrinsics.checkNotNullParameter(pos, "");
/*     */     GL11.glGetFloat(2982, this.d);
/*     */     GL11.glGetFloat(2983, this.e);
/*     */     GL11.glGetInteger(2978, this.c);
/*     */     GLU.gluProject(pos.x, pos.y, pos.z, this.d, this.e, this.c, this.b);
/*     */     return new Vector3f(this.b.get(0), Display.getHeight() - this.b.get(1), this.b.get(2));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Vector3f a(class_1699 e) {
/*     */     Intrinsics.checkNotNullParameter(e, "");
/*     */     float delta = (a.a().getTimer()).field_1038;
/*     */     double x = e.field_3211 + (e.field_3252 - e.field_3211) * delta;
/*     */     double y = e.field_3212 + (e.field_3253 - e.field_3212) * delta;
/*     */     double z = e.field_3213 + (e.field_3254 - e.field_3213) * delta;
/*     */     return new Vector3f((float)x, (float)y, (float)z);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\h.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */