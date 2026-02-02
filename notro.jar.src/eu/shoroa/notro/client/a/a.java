/*     */ package eu.shoroa.notro.client.a;
/*     */ 
/*     */ import eu.shoroa.bridge.feature.b.a.e;
/*     */ import eu.shoroa.notro.client.a.a.a.e;
/*     */ import net.minecraft.class_1862;
/*     */ import net.minecraft.class_389;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\t\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\037\020\b\032\0020\0072\006\020\005\032\0020\0042\006\020\006\032\0020\004H\002¢\006\004\b\b\020\tJ\027\020\f\032\0020\0072\006\020\013\032\0020\nH\026¢\006\004\b\f\020\rJ\017\020\016\032\0020\007H\026¢\006\004\b\016\020\003J\017\020\017\032\0020\007H\026¢\006\004\b\017\020\003R\026\020\021\032\0020\0208\002@\002X\016¢\006\006\n\004\b\021\020\022R\026\020\023\032\0020\0208\002@\002X\016¢\006\006\n\004\b\023\020\022R\026\020\024\032\0020\0208\002@\002X\016¢\006\006\n\004\b\024\020\022R\026\020\025\032\0020\0208\002@\002X\016¢\006\006\n\004\b\025\020\022R\026\020\027\032\0020\0268\002@\002X\016¢\006\006\n\004\b\027\020\030R\034\020\033\032\n \032*\004\030\0010\0310\0318\002X\004¢\006\006\n\004\b\033\020\034R\026\020\013\032\0020\n8\002@\002X\016¢\006\006\n\004\b\013\020\035R\024\020\037\032\0020\0368\002X\004¢\006\006\n\004\b\037\020 R\036\020\"\032\n \032*\004\030\0010!0!8\002@\002X\016¢\006\006\n\004\b\"\020#¨\006$"}, d2 = {"Leu/shoroa/notro/client/render/BlurRendererImpl;", "Leu/shoroa/bridge/render/post/BlurRenderer;", "<init>", "()V", "", "texture", "id", "", "bindTexture", "(II)V", "", "radius", "cacheRadius", "(F)V", "render", "resize", "Lnet/minecraft/class_1862;", "framebuffer", "Lnet/minecraft/class_1862;", "framebuffer1", "framebuffer2", "framebuffer3", "", "lastUpdate", "J", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "F", "Leu/shoroa/notro/client/render/shader/Shader;", "shader", "Leu/shoroa/notro/client/render/shader/Shader;", "Ljava/nio/FloatBuffer;", "weightBuffer", "Ljava/nio/FloatBuffer;", "NotroClient"})
/*     */ public final class a extends a {
/*     */   private final class_1600 a;
/*     */   @NotNull
/*     */   private class_1862 b;
/*     */   @NotNull
/*     */   private class_1862 c;
/*     */   @NotNull
/*     */   private class_1862 d;
/*     */   
/*  19 */   public a() { this.a = class_1600.method_2965();
/*  20 */     this.b = new class_1862(this.a.field_3801, this.a.field_3802, false);
/*  21 */     this.c = new class_1862(this.a.field_3801, this.a.field_3802, false);
/*  22 */     this.d = new class_1862(this.a.field_3801, this.a.field_3802, false);
/*  23 */     this.e = new class_1862(this.a.field_3801, this.a.field_3802, false);
/*  24 */     this.f = BufferUtils.createFloatBuffer(128);
/*     */     
/*  26 */     this.h = 25.0F;
/*     */     
/*  28 */     a(this.h);
/*  29 */     this.g = new a("slosa_blur");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  39 */     this.i = System.currentTimeMillis(); }
/*     */   @NotNull private class_1862 e; private FloatBuffer f; @NotNull private final a g; private float h; private long i; public void a(float radius) { this.f = BufferUtils.createFloatBuffer(128); int i = 0, j = (int)radius; if (i <= j)
/*     */       while (true) { this.f.put(a(i, radius / 2.0F)); if (i != j) { i++; continue; }  break; }
/*  42 */         this.f.rewind(); } public void b() { this.b.method_6890();
/*  43 */     this.b = new class_1862(this.a.field_3801 / 2, this.a.field_3802 / 2, false);
/*  44 */     this.c.method_6890();
/*  45 */     this.c = new class_1862(this.a.field_3801 / 2, this.a.field_3802 / 2, false);
/*  46 */     this.d.method_6890();
/*  47 */     this.d = new class_1862(this.a.field_3801 / 6, this.a.field_3802 / 6, false);
/*  48 */     this.e.method_6890();
/*  49 */     this.e = new class_1862(this.a.field_3801 / 6, this.a.field_3802 / 6, false); }
/*     */ 
/*     */   
/*     */   public void c() {
/*  53 */     Intrinsics.checkNotNull(BridgeClient.a.b()); e m = (e)BridgeClient.a.b().moduleManager().a(e.class);
/*  54 */     if (!((this.h == ((Number)m.c().b()).floatValue()) ? 1 : 0)) {
/*  55 */       this.h = ((Number)m.c().b()).floatValue();
/*  56 */       a(this.h);
/*     */     } 
/*     */     
/*  59 */     if (a() == -8) {
/*  60 */       a(NanoVGGL2.nvglCreateImageFromHandle(
/*  61 */             b.INSTANCE.a(), this.e.field_7987, 
/*  62 */             this.a.field_3801, 
/*  63 */             this.a.field_3802, 
/*  64 */             8));
/*     */     }
/*     */     
/*  67 */     class_389 sr = new class_389(this.a);
/*  68 */     if (System.currentTimeMillis() - this.i > 15L) {
/*  69 */       this.i = System.currentTimeMillis();
/*  70 */       this.b.method_6894(true);
/*  71 */       GL11.glPushAttrib(1048575);
/*  72 */       this.g.a();
/*  73 */       a((this.a.method_6633()).field_7987, 10);
/*  74 */       this.g.a((e)e.a.a("texture", 10));
/*  75 */       this.g.a((e)e.a.a("direction", 1.0F, 0.0F));
/*  76 */       this.g.a((e)e.a.a(
/*  77 */             "texelSize", 1.0F / (this.a.method_6633()).field_7983, 
/*  78 */             1.0F / (this.a.method_6633()).field_7984));
/*     */       
/*  80 */       Intrinsics.checkNotNullExpressionValue(this.f, ""); this.g.a((e)e.a.a("kernels", this.f));
/*  81 */       this.g.a(0.0F, 0.0F, sr.method_1045(), sr.method_1046());
/*     */       
/*  83 */       this.c.method_6894(true);
/*  84 */       a(this.b.field_7987, 10);
/*  85 */       this.g.a((e)e.a.a("texture", 10));
/*  86 */       this.g.a((e)e.a.a("direction", 0.0F, 1.0F));
/*  87 */       this.g.a((e)e.a.a("texelSize", 1.0F / this.c.field_7983, 1.0F / this.c.field_7984));
/*  88 */       this.g.a(0.0F, 0.0F, sr.method_1045(), sr.method_1046());
/*     */       
/*  90 */       this.d.method_6894(true);
/*  91 */       a(this.c.field_7987, 10);
/*  92 */       this.g.a((e)e.a.a("texture", 10));
/*  93 */       this.g.a((e)e.a.a("direction", 1.0F, 0.0F));
/*  94 */       this.g.a((e)e.a.a("texelSize", 1.0F / this.d.field_7983, 1.0F / this.d.field_7984));
/*  95 */       this.g.a(0.0F, 0.0F, sr.method_1045(), sr.method_1046());
/*     */       
/*  97 */       this.e.method_6894(true);
/*  98 */       a(this.d.field_7987, 10);
/*  99 */       this.g.a((e)e.a.a("texture", 10));
/* 100 */       this.g.a((e)e.a.a("direction", 0.0F, 1.0F));
/* 101 */       this.g.a((e)e.a.a("texelSize", 1.0F / this.e.field_7983, 1.0F / this.e.field_7984));
/* 102 */       this.g.a(0.0F, 0.0F, sr.method_1045(), sr.method_1046());
/*     */       
/* 104 */       this.g.b();
/* 105 */       GL11.glPopAttrib();
/*     */     } 
/* 107 */     this.a.method_6633().method_6894(true);
/*     */   }
/*     */   
/*     */   private final void a(int texture, int id) {
/* 111 */     GL13.glActiveTexture(33984 + id);
/* 112 */     GL11.glBindTexture(3553, texture);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */