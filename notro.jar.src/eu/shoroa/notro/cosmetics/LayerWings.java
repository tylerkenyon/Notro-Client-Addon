/*     */ package eu.shoroa.notro.cosmetics;
/*     */ 
/*     */ import eu.shoroa.notro.client.feature.cosmetic.b;
/*     */ import net.minecraft.class_1600;
/*     */ import net.minecraft.class_1631;
/*     */ import net.minecraft.class_1653;
/*     */ import net.minecraft.class_1699;
/*     */ import net.minecraft.class_2403;
/*     */ import net.minecraft.class_2508;
/*     */ import net.minecraft.class_444;
/*     */ import net.minecraft.class_466;
/*     */ import net.minecraft.class_467;
/*     */ import net.minecraft.class_570;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LayerWings
/*     */   implements class_2508<class_1631>
/*     */ {
/*     */   private final class_570 renderPlayer;
/*     */   private final class_467 wing;
/*     */   private final class_467 wingTip;
/*     */   
/*     */   public LayerWings(class_570 renderPlayer) {
/*  27 */     this.renderPlayer = renderPlayer;
/*     */     
/*  29 */     int textureWidth = 30;
/*  30 */     int textureHeight = 30;
/*     */     
/*  32 */     this.wing = new class_467(new class_444(this) {  }, 0, 0);
/*  33 */     this.wing.method_1194(textureWidth, textureHeight);
/*  34 */     this.wing.method_1187(-2.0F, 0.0F, 0.0F);
/*  35 */     this.wing.field_1606.add(new class_466(this.wing, 0, 0, -10.0F, -1.0F, -1.0F, 10, 2, 2, 0.0F, false));
/*  36 */     this.wing.field_1606.add(new class_466(this.wing, -10, 8, -10.0F, 0.0F, 0.5F, 10, 0, 10, 0.0F, false));
/*     */     
/*  38 */     this.wingTip = new class_467(new class_444(this) {  }, 0, 0);
/*  39 */     this.wingTip.method_1194(textureWidth, textureHeight);
/*  40 */     this.wingTip.method_1187(-10.0F, 0.0F, 0.0F);
/*  41 */     this.wingTip.field_1606.add(new class_466(this.wingTip, 0, 5, -10.0F, -0.5F, -0.5F, 10, 1, 1, 0.0F, false));
/*  42 */     this.wingTip.field_1606.add(new class_466(this.wingTip, -10, 18, -10.0F, 0.0F, 0.5F, 10, 0, 10, 0.0F, false));
/*     */     
/*  44 */     this.wing.method_1191(this.wingTip);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void doRenderLayer(class_1631 player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
/*  52 */     if (player.method_4446())
/*  53 */       return;  if (player.field_3999.field_3965[3] != null)
/*     */       return; 
/*  55 */     String name = player.method_8429().getName();
/*  56 */     int currentTick = player.field_3220;
/*     */     
/*  58 */     c.b(name);
/*  59 */     if (!c.c(name))
/*     */       return; 
/*  61 */     class_1653 newWing = b.a.b(name, null);
/*  62 */     class_1653 lastWing = c.d(name);
/*  63 */     class_1653 pending = c.e(name);
/*  64 */     int lastChange = c.f(name);
/*     */     
/*  66 */     class_1653 renderWing = lastWing;
/*     */     
/*  68 */     if (newWing != null && (lastWing == null || !lastWing.equals(newWing))) {
/*  69 */       if (pending == null || !pending.equals(newWing)) {
/*  70 */         c.a(name, newWing, currentTick);
/*  71 */         renderWing = (lastWing != null) ? lastWing : newWing;
/*  72 */       } else if (currentTick - lastChange >= c.a()) {
/*  73 */         c.a(name, newWing);
/*  74 */         renderWing = newWing;
/*     */       } else {
/*  76 */         renderWing = (lastWing != null) ? lastWing : newWing;
/*     */       } 
/*  78 */     } else if (newWing == null && lastWing != null) {
/*  79 */       renderWing = lastWing;
/*  80 */     } else if (newWing != null) {
/*  81 */       renderWing = newWing;
/*     */     } 
/*     */     
/*  84 */     if (renderWing == null)
/*     */       return; 
/*  86 */     class_1600 mc = class_1600.method_2965();
/*  87 */     GL11.glPushMatrix();
/*     */     
/*  89 */     if (player.method_2513()) {
/*  90 */       class_2403.method_9817(20.0F, 1.0F, 0.0F, 0.0F);
/*  91 */       class_2403.method_9814(0.0D, 0.2D, -0.05D);
/*     */     } 
/*     */     
/*  94 */     mc.method_5570().method_5847(renderWing);
/*  95 */     class_2403.method_9832();
/*  96 */     class_2403.method_9796(0.65D, 0.65D, 0.65D);
/*  97 */     class_2403.method_9817(20.0F, 1.0F, 0.0F, 0.0F);
/*  98 */     class_2403.method_9814(0.0D, 0.2D, 0.09D);
/*     */     
/* 100 */     for (int j = 0; j < 2; j++) {
/* 101 */       float f11 = (float)(System.currentTimeMillis() % 1000L) / 1000.0F * 3.1415927F * 2.0F;
/* 102 */       this.wing.field_1600 = (float)Math.toRadians(-80.0D) - (float)Math.cos(f11) * 0.4F;
/* 103 */       this.wing.field_1601 = (float)Math.toRadians(30.0D) + (float)Math.sin(f11) * 0.2F;
/* 104 */       this.wing.field_1602 = (float)Math.toRadians(20.0D);
/* 105 */       this.wingTip.field_1602 = -((float)Math.sin((f11 + 2.0F)) + 0.9F) * 0.75F;
/*     */       
/* 107 */       this.wing.method_1186(scale);
/* 108 */       class_2403.method_9800(-1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */     
/* 111 */     class_2403.method_9830();
/* 112 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean method_10296() {
/* 117 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\cosmetics\LayerWings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */