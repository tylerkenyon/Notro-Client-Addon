/*    */ package eu.shoroa.notro.cosmetics;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_2403;
/*    */ import net.minecraft.class_444;
/*    */ import net.minecraft.class_466;
/*    */ import net.minecraft.class_467;
/*    */ import net.minecraft.class_518;
/*    */ import net.minecraft.class_864;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003JI\020\016\032\0020\r2\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\006H\026¢\006\004\b\016\020\017R\024\020\021\032\0020\0208\002X\004¢\006\006\n\004\b\021\020\022R\024\020\023\032\0020\0208\002X\004¢\006\006\n\004\b\023\020\022¨\006\024"}, d2 = {"Leu/shoroa/notro/cosmetics/Wings;", "Leu/shoroa/notro/client/feature/cosmetic/Model;", "<init>", "()V", "Lnet/minecraft/class_864;", "entity", "", "limbSwing", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "scale", "", "render", "(Lnet/minecraft/class_864;FFFFFF)V", "Lnet/minecraft/class_467;", "wing", "Lnet/minecraft/class_467;", "wingTip", "NotroClient"})
/*    */ public final class d extends d {
/*    */   public d() {
/* 15 */     super("wings");
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.field_1494 = 30;
/* 21 */     this.field_1495 = 30;
/*    */ 
/*    */     
/* 24 */     this.a = new class_467((class_444)this, "wing");
/* 25 */     this.a.method_1187(-2.0F, 0.0F, 0.0F);
/* 26 */     this.a.field_1606.add(new class_466(this.a, 0, 0, -10.0F, -1.0F, -1.0F, 10, 2, 2, 0.0F, false));
/* 27 */     this.a.field_1606.add(new class_466(this.a, -10, 8, -10.0F, 0.0F, 0.5F, 10, 0, 10, 0.0F, false));
/*    */ 
/*    */     
/* 30 */     this.b = new class_467((class_444)this, "wingtip");
/* 31 */     this.b.method_1187(-10.0F, 0.0F, 0.0F);
/* 32 */     this.b.field_1606.add(new class_466(this.b, 0, 5, -10.0F, -0.5F, -0.5F, 10, 1, 1, 0.0F, false));
/* 33 */     this.b.field_1606.add(new class_466(this.b, -10, 18, -10.0F, 0.0F, 0.5F, 10, 0, 10, 0.0F, false));
/*    */     
/* 35 */     this.a.method_1191(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final class_467 a;
/*    */   
/*    */   @NotNull
/*    */   private final class_467 b;
/*    */ 
/*    */   
/*    */   public void a(class_864 entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
/* 47 */     class_1600 mc = class_1600.method_2965();
/* 48 */     class_518 player = mc.field_10310;
/* 49 */     if (entity == null || !Intrinsics.areEqual(entity.method_2518(), player.method_2518()))
/* 50 */       return;  if (player.field_3999.field_3965[3] != null)
/*    */       return; 
/* 52 */     GL11.glPushMatrix();
/*    */ 
/*    */     
/* 55 */     if (player.method_2513()) {
/* 56 */       class_2403.method_9817(20.0F, 1.0F, 0.0F, 0.0F);
/* 57 */       class_2403.method_9814(0.0D, 0.2D, -0.05D);
/*    */     } 
/*    */     
/* 60 */     mc.method_5570().method_5847(b());
/*    */     
/* 62 */     class_2403.method_9832();
/* 63 */     class_2403.method_9796(0.65D, 0.65D, 0.65D);
/* 64 */     class_2403.method_9817(20.0F, 1.0F, 0.0F, 0.0F);
/* 65 */     class_2403.method_9814(0.0D, 0.2D, 0.09D);
/*    */     
/* 67 */     for (int j = 0; j < 2; j++) {
/* 68 */       float f11 = (float)(System.currentTimeMillis() % 1000L) / 1000.0F * 3.1415927F * 2.0F;
/*    */ 
/*    */       
/* 71 */       this.a.field_1600 = (float)Math.toRadians(-80.0D) - (float)Math.cos(f11) * 0.4F;
/* 72 */       this.a.field_1601 = (float)Math.toRadians(30.0D) + (float)Math.sin(f11) * 0.2F;
/* 73 */       this.a.field_1602 = (float)Math.toRadians(20.0D);
/* 74 */       this.b.field_1602 = -((float)((Math.sin((f11 + 2.0F)) + 0.9D) * 0.75D));
/* 75 */       this.a.method_1186(0.0625F);
/* 76 */       class_2403.method_9800(-1.0F, 1.0F, 1.0F);
/*    */     } 
/*    */     
/* 79 */     class_2403.method_9830();
/* 80 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\cosmetics\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */