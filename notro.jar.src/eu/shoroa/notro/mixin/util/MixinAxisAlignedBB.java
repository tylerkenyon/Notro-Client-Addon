/*    */ package eu.shoroa.notro.mixin.util;
/*    */ 
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ 
/*    */ @Mixin({class_231.class})
/*    */ public class MixinAxisAlignedBB implements d {
/*    */   @Shadow
/*    */   @Final
/*    */   @Mutable
/*    */   public double field_582;
/*    */   @Shadow
/*    */   @Final
/*    */   @Mutable
/*    */   public double field_583;
/*    */   @Shadow
/*    */   @Final
/*    */   @Mutable
/*    */   public double field_584;
/*    */   
/* 21 */   public void setMinX(double minX) { this.field_582 = minX; } @Shadow @Final @Mutable public double field_585; @Shadow @Final
/*    */   @Mutable
/*    */   public double field_586; @Shadow
/*    */   @Final
/*    */   @Mutable
/* 26 */   public double field_587; public void setMinY(double minY) { this.field_583 = minY; }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMinZ(double minZ) {
/* 31 */     this.field_584 = minZ;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setMaxX(double maxX) {
/* 36 */     this.field_585 = maxX;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setMaxY(double maxY) {
/* 41 */     this.field_586 = maxY;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setMaxZ(double maxZ) {
/* 46 */     this.field_587 = maxZ;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixi\\util\MixinAxisAlignedBB.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */