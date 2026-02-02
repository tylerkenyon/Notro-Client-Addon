/*    */ package eu.shoroa.notro.c;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import java.nio.ByteBuffer;
/*    */ import org.lwjgl.opengl.GLContext;
/*    */ import org.lwjgl.system.FunctionProvider;
/*    */ 
/*    */ public class a
/*    */   implements FunctionProvider
/*    */ {
/*    */   private final Method a;
/*    */   
/*    */   public a() {
/*    */     try {
/* 15 */       this.a = GLContext.class.getDeclaredMethod("getFunctionAddress", new Class[] { String.class });
/* 16 */       this.a.setAccessible(true);
/* 17 */     } catch (Exception e) {
/* 18 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public long getFunctionAddress(CharSequence functionName) {
/*    */     try {
/* 25 */       return ((Long)this.a.invoke(null, new Object[] { functionName.toString() })).longValue();
/* 26 */     } catch (Exception e) {
/* 27 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public long getFunctionAddress(ByteBuffer byteBuffer) {
/* 33 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\c\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */