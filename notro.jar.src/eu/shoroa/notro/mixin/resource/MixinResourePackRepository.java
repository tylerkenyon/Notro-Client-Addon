/*    */ package eu.shoroa.notro.mixin.resource;
/*    */ 
/*    */ import eu.shoroa.notro.a.e;
/*    */ import eu.shoroa.notro.client.b.a;
/*    */ import java.io.File;
/*    */ import java.io.FileFilter;
/*    */ import java.util.List;
/*    */ import net.minecraft.class_1655;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1671;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.gen.Invoker;
/*    */ 
/*    */ @Mixin({class_1657.class})
/*    */ public abstract class MixinResourePackRepository implements e {
/*    */   @Shadow
/*    */   @Final
/*    */   private File field_6620;
/*    */   @Shadow
/*    */   @Final
/*    */   private static FileFilter field_6617;
/*    */   @Shadow
/*    */   @Final
/*    */   public class_1655 field_6618;
/*    */   @Shadow
/*    */   @Final
/*    */   private File field_8109;
/*    */   @Shadow
/*    */   @Final
/*    */   public class_1671 field_6619;
/*    */   @Shadow
/*    */   private class_1655 field_8110;
/*    */   @Shadow
/*    */   private List<class_1657.class_1659> field_6621;
/*    */   @Shadow
/*    */   private List<class_1657.class_1659> field_6622;
/*    */   
/*    */   @Shadow
/*    */   public abstract void method_7038(List<class_1657.class_1659> paramList);
/*    */   
/*    */   @Overwrite
/*    */   private List<File> method_5909() {
/* 46 */     return a.INSTANCE.a(this.field_6620, field_6617);
/*    */   }
/*    */   
/*    */   @Invoker("updateRepositoryEntriesAll")
/*    */   public abstract void notro$updateRepositoryEntriesAll();
/*    */   
/*    */   public File notro$dirResourcepacks() {
/* 53 */     return this.field_6620;
/*    */   }
/*    */ 
/*    */   
/*    */   public class_1655 notro$rprDefaultResourcePack() {
/* 58 */     return this.field_6618;
/*    */   }
/*    */ 
/*    */   
/*    */   public File notro$dirServerResourcepacks() {
/* 63 */     return this.field_8109;
/*    */   }
/*    */ 
/*    */   
/*    */   public class_1671 notro$rprMetadataSerializer() {
/* 68 */     return this.field_6619;
/*    */   }
/*    */ 
/*    */   
/*    */   public class_1655 notro$resourcePackInstance() {
/* 73 */     return this.field_8110;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<class_1657.class_1659> notro$repositoryEntriesAll() {
/* 78 */     return this.field_6621;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<class_1657.class_1659> notro$repositoryEntries() {
/* 83 */     return this.field_6622;
/*    */   }
/*    */ 
/*    */   
/*    */   public void notro$setActiveRepositories(List<class_1657.class_1659> entries) {
/* 88 */     method_7038(entries);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\resource\MixinResourePackRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */