/*     */ package eu.shoroa.notro.client.feature.cosmetic;
/*     */ 
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_1653;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\b\n\002\020\021\n\002\b\003\030\0002\0020\001B'\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\004\b\b\020\tJ\r\020\013\032\0020\n¢\006\004\b\013\020\fJ\017\020\016\032\0020\rH\002¢\006\004\b\016\020\017J\r\020\020\032\0020\r¢\006\004\b\020\020\017R\024\020\003\032\0020\0028\002X\004¢\006\006\n\004\b\003\020\021R\026\020\022\032\0020\0058\002@\002X\016¢\006\006\n\004\b\022\020\023R\026\020\024\032\0020\0058\002@\002X\016¢\006\006\n\004\b\024\020\023R\024\020\006\032\0020\0058\002X\004¢\006\006\n\004\b\006\020\023R\024\020\007\032\0020\0058\002X\004¢\006\006\n\004\b\007\020\023R\026\020\025\032\0020\0058\002@\002X\016¢\006\006\n\004\b\025\020\023R\024\020\004\032\0020\0028\002X\004¢\006\006\n\004\b\004\020\021R\034\020\027\032\n\022\006\022\004\030\0010\n0\0268\002X\004¢\006\006\n\004\b\027\020\030¨\006\031"}, d2 = {"Leu/shoroa/notro/client/feature/cosmetic/ClientCapeHelper$AnimatedCape;", "", "", "basePath", "textureName", "", "frameCount", "frameDelay", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "Lnet/minecraft/class_1653;", "getCurrentFrame", "()Lnet/minecraft/class_1653;", "", "preloadNextFrame", "()V", "update", "Ljava/lang/String;", "currentFrame", "I", "currentTick", "nextFrameToLoad", "", "textures", "[Lnet/minecraft/class_1653;", "NotroClient"})
/*     */ public final class a
/*     */ {
/*     */   @NotNull
/*     */   private final String a;
/*     */   @NotNull
/*     */   private final String b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   @NotNull
/*     */   private final class_1653[] h;
/*     */   
/*     */   public a(String basePath, String textureName, int frameCount, int frameDelay) {
/* 111 */     this.a = basePath;
/* 112 */     this.b = textureName;
/* 113 */     this.c = frameCount;
/* 114 */     this.d = frameDelay;
/*     */ 
/*     */ 
/*     */     
/* 118 */     this.g = 1;
/*     */ 
/*     */     
/* 121 */     this.h = new class_1653[this.c];
/*     */ 
/*     */ 
/*     */     
/* 125 */     this.h[0] = new class_1653("notro", this.a + "/" + this.a + "0.png");
/* 126 */     if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("[AnimatedCape] Loaded first frame -> " + this.a + "/" + this.b + "0.png"); } else { BridgeClient.a.b(); }
/*     */   
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final class_1653 a() {
/* 132 */     if (this.h[this.f] == null) {
/* 133 */       this.h[this.f] = new class_1653("notro", this.a + "/" + this.a + this.b + ".png");
/* 134 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("[AnimatedCape] Lazy loaded frame " + this.f); } else { BridgeClient.a.b(); }
/*     */     
/* 136 */     }  Intrinsics.checkNotNull(this.h[this.f]); return this.h[this.f];
/*     */   }
/*     */ 
/*     */   
/*     */   public final void b() {
/* 141 */     int i = this.e; this.e = i + 1;
/* 142 */     if (this.e >= this.d) {
/* 143 */       this.e = 0;
/* 144 */       this.f = (this.f + 1) % this.c;
/*     */     } 
/*     */ 
/*     */     
/* 148 */     c();
/*     */   }
/*     */ 
/*     */   
/*     */   private final void c() {
/* 153 */     if (this.g >= this.c)
/* 154 */       return;  if (this.h[this.g] == null) {
/* 155 */       this.h[this.g] = new class_1653("notro", this.a + "/" + this.a + this.b + ".png");
/* 156 */       if (BridgeClient.a.b() != null) { BridgeClient.a.b().log("[AnimatedCape] Preloaded frame " + this.g); } else { BridgeClient.a.b(); }
/*     */     
/* 158 */     }  int i = this.g; this.g = i + 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\cosmetic\b$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */