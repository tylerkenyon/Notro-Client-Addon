/*    */ package eu.shoroa.notro.mixin.client.renderer.entity;
/*    */ 
/*    */ import eu.shoroa.bridge.BridgeClient;
/*    */ import eu.shoroa.notro.client.feature.a.g;
/*    */ import net.minecraft.class_1599;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_1635;
/*    */ import net.minecraft.class_1699;
/*    */ import net.minecraft.class_518;
/*    */ import net.minecraft.class_988;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_1635.class})
/*    */ public abstract class MixinRendererLivingEntity<T extends class_1699>
/*    */ {
/*    */   @Shadow
/*    */   protected abstract <V extends class_1699, U extends net.minecraft.class_2508<V>> boolean method_10250(U paramU);
/*    */   
/*    */   @Overwrite
/*    */   public boolean method_5781(class_1699 entity) {
/* 28 */     g m = (g)BridgeClient.a.b().moduleManager().a(g.class);
/*    */     
/* 30 */     if (m.b() && ((Boolean)m.s().b()).booleanValue()) return false;
/*    */     
/* 32 */     class_518 self = (class_1600.method_2965()).field_10310;
/*    */     
/* 34 */     if (entity instanceof class_988) { class_988 player = (class_988)entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 41 */       class_1599 team = player.method_6135();
/* 42 */       class_1599 selfTeam = self.method_6135();
/* 43 */       if (team != null) {
/* 44 */         switch (team.method_9363()) { case field_10278: case field_10279: return 
/*    */               
/* 46 */               (selfTeam == null || team.method_5566(selfTeam));
/* 47 */           case field_10280: return (selfTeam == null || !team.method_5566(selfTeam)); }
/*    */         
/*    */         return true;
/*    */       } 
/* 51 */       return true; }
/*    */     
/* 53 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\mixin\client\renderer\entity\MixinRendererLivingEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */