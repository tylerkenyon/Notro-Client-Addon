/*    */ package eu.shoroa.bridge.ui.clickgui.comp;
/*    */ 
/*    */ import eu.shoroa.bridge.b.d.a;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.HashMap;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import org.lwjgl.stb.STBImage;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "a", "()V"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void a() {
/*    */     try {
/* 57 */       int[] width = new int[1];
/* 58 */       int[] height = new int[1];
/* 59 */       int[] channels = new int[1];
/* 60 */       ByteBuffer byteBuffer1 = STBImage.stbi_load(this.a.a().getAbsolutePath(), width, height, channels, 4); if (byteBuffer1 == null) {
/* 61 */         throw new RuntimeException("Failed to load image: " + this.a.a().getName());
/*    */       }
/*    */       ByteBuffer buffer = byteBuffer1;
/* 64 */       a.a(this.a).add(new Function0<Unit>(width, height, buffer, this.a) {
/*    */             public final void a() { try {
/* 66 */                 int texId = GL11.glGenTextures();
/* 67 */                 GL11.glBindTexture(3553, texId);
/* 68 */                 GL11.glTexParameteri(3553, 10241, 9729);
/* 69 */                 GL11.glTexParameteri(3553, 10240, 9729);
/* 70 */                 GL11.glTexImage2D(
/* 71 */                     3553, 0, 6408, 
/* 72 */                     this.$a[0], this.$b[0], 0, 6408, 
/* 73 */                     5121, this.$c);
/*    */                 
/* 75 */                 STBImage.stbi_image_free(this.$c);
/* 76 */                 a.a(this.d, Integer.valueOf(texId));
/* 77 */                 HashMap<String, Integer> hashMap = a.a.a(); Intrinsics.checkNotNullExpressionValue(this.d.a().getAbsolutePath(), ""); String str = this.d.a().getAbsolutePath(); Integer integer = Integer.valueOf(texId); hashMap.put(str, integer);
/* 78 */               } catch (Exception e) {
/* 79 */                 System.out.println("GL upload failed: " + e.getMessage());
/* 80 */                 STBImage.stbi_image_free(this.$c);
/*    */               }  }
/*    */           });
/* 83 */     } catch (Exception e) {
/* 84 */       System.out.println("Failed to load screenshot " + this.a.a().getName() + ": " + e.getMessage());
/*    */     } 
/*    */   }
/*    */   
/*    */   null(a $receiver) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\a$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */