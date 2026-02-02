/*    */ package eu.shoroa.notro.bridge;
/*    */ import eu.shoroa.bridge.feature.a.a.j;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_389;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\017\020\005\032\0020\004H\026¢\006\004\b\005\020\006J\017\020\007\032\0020\004H\026¢\006\004\b\007\020\006J\017\020\b\032\0020\004H\026¢\006\004\b\b\020\006R\034\020\013\032\n \n*\004\030\0010\t0\t8\002X\004¢\006\006\n\004\b\013\020\f¨\006\r"}, d2 = {"Leu/shoroa/notro/bridge/iScaledResolutionImpl;", "Leu/shoroa/bridge/feature/bridges/impl/iScaledResolution;", "<init>", "()V", "", "scaleFactor", "()I", "scaledHeight", "scaledWidth", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "NotroClient"})
/*    */ public final class iScaledResolutionImpl implements j {
/*  8 */   private final class_1600 mc = class_1600.method_2965();
/*    */   
/*    */   public int scaledWidth() {
/* 11 */     return (this.mc != null) ? this.mc.field_3801 : 1920;
/*    */   }
/*    */   
/*    */   public int scaledHeight() {
/* 15 */     return (this.mc != null) ? this.mc.field_3802 : 1080;
/*    */   }
/*    */   public int scaleFactor() {
/*    */     boolean bool;
/*    */     
/* 20 */     try { class_1600 it = this.mc; int $i$a$-let-iScaledResolutionImpl$scaleFactor$1 = 0;
/*    */       
/* 22 */       bool = (this.mc != null) ? (new class_389(it)).method_1049() : true; }
/* 23 */     catch (Exception e)
/* 24 */     { bool = true; }  return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\iScaledResolutionImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */