/*    */ package eu.shoroa.notro.client.a;
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.bridge.feature.b.a.e;
/*    */ import eu.shoroa.notro.client.a.a.a;
/*    */ import eu.shoroa.notro.client.a.a.a.e;
/*    */ import java.awt.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_1862;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.lwjgl.nanovg.NanoVGGL2;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\017\020\005\032\0020\004H\026¢\006\004\b\005\020\003J\017\020\006\032\0020\004H\026¢\006\004\b\006\020\003R\026\020\b\032\0020\0078\002@\002X\016¢\006\006\n\004\b\b\020\tR\034\020\f\032\n \013*\004\030\0010\n0\n8\002X\004¢\006\006\n\004\b\f\020\rR\024\020\017\032\0020\0168\002X\004¢\006\006\n\004\b\017\020\020R\026\020\022\032\0020\0218\002@\002X\016¢\006\006\n\004\b\022\020\023¨\006\024"}, d2 = {"Leu/shoroa/notro/client/render/TopologyRendererImpl;", "Leu/shoroa/bridge/render/post/TopologyRenderer;", "<init>", "()V", "", "render", "resize", "Lnet/minecraft/class_1862;", "framebuffer", "Lnet/minecraft/class_1862;", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "Leu/shoroa/notro/client/render/shader/Shader;", "shader", "Leu/shoroa/notro/client/render/shader/Shader;", "", "time", "F", "NotroClient"})
/*    */ public final class c extends b {
/* 17 */   private final class_1600 a = class_1600.method_2965(); @NotNull
/* 18 */   private class_1862 b = new class_1862(this.a.field_3801, this.a.field_3802, false); @NotNull
/* 19 */   private final a c = new a("topology"); private float d;
/*    */   
/*    */   public void b() {
/* 22 */     Intrinsics.checkNotNull(BridgeClient.a.b()); e shaderModule = (e)BridgeClient.a.b().moduleManager().a(e.class);
/*    */     
/* 24 */     float delta = 1.0F / class_1600.method_9393() * 4;
/* 25 */     this.d += delta * ((Number)shaderModule.d().b()).floatValue();
/*    */     
/* 27 */     if (Float.isInfinite(this.d) || Float.isNaN(this.d)) {
/* 28 */       this.d = 0.0F;
/*    */     }
/*    */     
/* 31 */     if (a() == -8) {
/* 32 */       a(NanoVGGL2.nvglCreateImageFromHandle(
/* 33 */             b.INSTANCE.a(), this.b.field_7987, 
/* 34 */             this.a.field_3801, 
/* 35 */             this.a.field_3802, 0));
/*    */     }
/*    */     
/* 38 */     GL11.glPushAttrib(1048575);
/* 39 */     this.b.method_6894(true);
/* 40 */     this.c.a();
/* 41 */     this.c.a((e)e.a.a("resolution", this.a.field_3801, this.a.field_3802));
/* 42 */     this.c.a((e)e.a.b("color1", (Color)shaderModule.s().b()));
/* 43 */     this.c.a((e)e.a.b("color2", (Color)shaderModule.t().b()));
/* 44 */     this.c.a((e)e.a.a("time", this.d));
/* 45 */     this.c.a(0.0F, 0.0F, this.a.field_3801, this.a.field_3802);
/* 46 */     this.c.b();
/* 47 */     GL11.glPopAttrib();
/* 48 */     this.a.method_6633().method_6894(true);
/*    */   }
/*    */   
/*    */   public void c() {
/* 52 */     this.b.method_6890();
/* 53 */     this.b = new class_1862(this.a.field_3801, this.a.field_3802, false);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */