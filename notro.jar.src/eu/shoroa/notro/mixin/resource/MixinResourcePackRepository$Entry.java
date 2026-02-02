/*    */ package eu.shoroa.notro.mixin.resource;
/*    */ 
/*    */ import eu.shoroa.notro.a.a;
/*    */ import eu.shoroa.notro.a.f;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.File;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_1636;
/*    */ import net.minecraft.class_1638;
/*    */ import net.minecraft.class_1653;
/*    */ import net.minecraft.class_1655;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1680;
/*    */ import net.minecraft.class_319;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ 
/*    */ 
/*    */ @Mixin({class_1657.class_1659.class})
/*    */ public class MixinResourcePackRepository$Entry
/*    */   implements f
/*    */ {
/*    */   @Shadow
/*    */   @Final
/*    */   private File field_6624;
/*    */   @Shadow
/*    */   private class_1655 field_6625;
/*    */   @Shadow
/*    */   private class_1680 field_6626;
/*    */   @Shadow
/*    */   private BufferedImage field_6627;
/*    */   @Shadow
/*    */   private class_1653 field_6628;
/*    */   
/*    */   public File resourcePackFile() {
/* 37 */     return this.field_6624;
/*    */   }
/*    */ 
/*    */   
/*    */   public class_1655 reResourcePack() {
/* 42 */     return this.field_6625;
/*    */   }
/*    */ 
/*    */   
/*    */   public class_1680 rePackMetadataSection() {
/* 47 */     return this.field_6626;
/*    */   }
/*    */ 
/*    */   
/*    */   public BufferedImage texturePackIcon() {
/* 52 */     return this.field_6627;
/*    */   }
/*    */ 
/*    */   
/*    */   public class_1653 locationTexturePackIcon() {
/* 57 */     return this.field_6628;
/*    */   }
/*    */ 
/*    */   
/*    */   public int iconTexture() {
/* 62 */     if (this.field_6628 == null) {
/* 63 */       this.field_6628 = class_1600.method_2965().method_5570().method_5851("texturepackicon", new class_1636(this.field_6627));
/*    */     }
/*    */     
/* 66 */     class_319 iTextureObject = (class_319)a.b().getTextureMap().get(this.field_6628);
/* 67 */     if (iTextureObject == null) {
/* 68 */       class_1638 class_1638 = new class_1638(this.field_6628);
/* 69 */       class_1600.method_2965().method_5570().method_5849(this.field_6628, (class_319)class_1638);
/*    */     } 
/* 71 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\resource\MixinResourcePackRepository$Entry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */