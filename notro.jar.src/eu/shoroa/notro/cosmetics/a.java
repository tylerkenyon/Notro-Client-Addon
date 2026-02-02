/*    */ package eu.shoroa.notro.cosmetics;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_444;
/*    */ import net.minecraft.class_466;
/*    */ import net.minecraft.class_467;
/*    */ import net.minecraft.class_518;
/*    */ import net.minecraft.class_864;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\t\030\0002\0020\001B\007¢\006\004\b\002\020\003JI\020\016\032\0020\r2\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\006H\026¢\006\004\b\016\020\017J-\020\025\032\0020\r2\006\020\021\032\0020\0202\006\020\022\032\0020\0062\006\020\023\032\0020\0062\006\020\024\032\0020\006¢\006\004\b\025\020\026R\024\020\027\032\0020\0208\002X\004¢\006\006\n\004\b\027\020\030¨\006\031"}, d2 = {"Leu/shoroa/notro/cosmetics/Fedora;", "Leu/shoroa/notro/client/feature/cosmetic/Model;", "<init>", "()V", "Lnet/minecraft/class_864;", "entity", "", "handSwing", "handSwingAmount", "ageInTtcsk", "headYaw", "headPitch", "scale", "", "render", "(Lnet/minecraft/class_864;FFFFFF)V", "Lnet/minecraft/class_467;", "modelRenderer", "x", "y", "z", "setRotationAngle", "(Lnet/minecraft/class_467;FFF)V", "bb_main", "Lnet/minecraft/class_467;", "NotroClient"})
/*    */ public final class a extends d {
/*    */   public a() {
/* 13 */     super("fedora");
/*    */ 
/*    */ 
/*    */     
/* 17 */     this.field_1494 = 64;
/* 18 */     this.field_1495 = 64;
/* 19 */     this.a = new class_467((class_444)this);
/* 20 */     this.a.method_1187(0.0F, 24.0F, 0.0F);
/* 21 */     this.a.field_1606.add(new class_466(this.a, 0, 0, -7.0F, -7.0F, -7.0F, 14, 1, 14, 0.0F, false));
/* 22 */     this.a.field_1606.add(new class_466(this.a, 0, 15, -6.0F, -11.0F, -6.0F, 12, 4, 12, 0.0F, false));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final class_467 a;
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(class_864 entity, float handSwing, float handSwingAmount, float ageInTtcsk, float headYaw, float headPitch, float scale) {
/* 34 */     class_518 en = (class_1600.method_2965()).field_10310;
/* 35 */     Intrinsics.checkNotNull(entity); if (!Intrinsics.areEqual(entity.method_2518(), en.method_2518()))
/* 36 */       return;  if (en.field_3999.field_3965[3] != null) {
/*    */       return;
/*    */     }
/* 39 */     a().method_10308(); Intrinsics.checkNotNull((a() != null && a().method_10308() != null) ? (a().method_10308()).field_1473 : null);
/* 40 */     a().method_10308(); Intrinsics.checkNotNull((a() != null && a().method_10308() != null) ? (a().method_10308()).field_1473 : null); a(this.a, ((class_467)((a() != null && a().method_10308() != null) ? (a().method_10308()).field_1473 : null)).field_1600, ((class_467)((a() != null && a().method_10308() != null) ? (a().method_10308()).field_1473 : null)).field_1601, 
/* 41 */         0.0F);
/*    */     
/* 43 */     this.a.field_1597 = 0.0F;
/* 44 */     this.a.field_1598 = 0.0F;
/*    */     
/* 46 */     class_1600.method_2965().method_5570().method_5847(b());
/* 47 */     float varScale = 0.8F;
/* 48 */     class_2403.method_9800(varScale, varScale, varScale);
/* 49 */     this.a.method_1186(scale);
/*    */   }
/*    */   
/*    */   public final void a(class_467 modelRenderer, float x, float y, float z) {
/* 53 */     Intrinsics.checkNotNullParameter(modelRenderer, ""); modelRenderer.field_1600 = x;
/* 54 */     modelRenderer.field_1601 = y;
/* 55 */     modelRenderer.field_1602 = z;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\cosmetics\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */