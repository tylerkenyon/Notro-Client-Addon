/*    */ package eu.shoroa.bridge.d.a;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.Channels;
/*    */ import java.nio.channels.ReadableByteChannel;
/*    */ import org.lwjgl.BufferUtils;
/*    */ import org.lwjgl.system.MemoryUtil;
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/* 13 */   private static a a = new a();
/*    */   public static a a() {
/* 15 */     return a;
/*    */   }
/*    */   
/*    */   public ByteBuffer a(String resource, int bufferSize) {
/* 19 */     InputStream source = getClass().getResourceAsStream(resource);
/* 20 */     ReadableByteChannel rbc = Channels.newChannel(source);
/*    */     
/* 22 */     ByteBuffer buffer = BufferUtils.createByteBuffer(bufferSize);
/*    */     
/*    */     while (true) {
/* 25 */       int bytes = rbc.read(buffer);
/*    */       
/* 27 */       if (bytes == -1) {
/*    */         break;
/*    */       }
/*    */       
/* 31 */       if (buffer.remaining() == 0) {
/* 32 */         ByteBuffer newBuffer = BufferUtils.createByteBuffer(buffer.capacity() * 3 / 2);
/* 33 */         buffer.flip();
/* 34 */         newBuffer.put(buffer);
/* 35 */         buffer = newBuffer;
/*    */       } 
/*    */     } 
/*    */     
/* 39 */     buffer.flip();
/* 40 */     return MemoryUtil.memSlice(buffer);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */