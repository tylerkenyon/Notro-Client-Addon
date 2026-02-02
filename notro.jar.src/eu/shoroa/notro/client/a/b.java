/*     */ package eu.shoroa.notro.client.a;
/*     */ import eu.shoroa.notro.a.a;
/*     */ import java.awt.Color;
/*     */ import net.minecraft.class_1071;
/*     */ import net.minecraft.class_1533;
/*     */ import net.minecraft.class_1600;
/*     */ import net.minecraft.class_2403;
/*     */ import net.minecraft.class_2422;
/*     */ import net.minecraft.class_2462;
/*     */ import net.minecraft.class_2520;
/*     */ import net.minecraft.class_2528;
/*     */ import net.minecraft.class_328;
/*     */ import net.minecraft.class_520;
/*     */ import net.minecraft.class_533;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class b {
/*  18 */   private static class_1600 a = class_1600.method_2965();
/*     */   private static class_2422 b;
/*     */   
/*     */   public static void a(float x, float y, float width, float height, float radius) {
/*  22 */     GL11.glShadeModel(7425);
/*  23 */     GL11.glDisable(3553);
/*  24 */     GL11.glEnable(3042);
/*  25 */     GL11.glBlendFunc(770, 771);
/*  26 */     GL11.glHint(3155, 4354);
/*     */     
/*  28 */     GL11.glBegin(9);
/*     */ 
/*     */     
/*  31 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); int rad;
/*  32 */     for (rad = 0; rad <= 90; rad++)
/*  33 */       GL11.glVertex2d((x + radius) + Math.sin(rad * Math.PI / 180.0D) * radius * -1.0D, (y + radius) + Math.cos(rad * Math.PI / 180.0D) * radius * -1.0D); 
/*  34 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  35 */     for (rad = 90; rad <= 180; rad++)
/*  36 */       GL11.glVertex2d((x + radius) + Math.sin(rad * Math.PI / 180.0D) * radius * -1.0D, (y + height - radius) + Math.cos(rad * Math.PI / 180.0D) * radius * -1.0D); 
/*  37 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  38 */     for (rad = 0; rad <= 90; rad++)
/*  39 */       GL11.glVertex2d((x + width - radius) + Math.sin(rad * Math.PI / 180.0D) * radius, (y + height - radius) + Math.cos(rad * Math.PI / 180.0D) * radius); 
/*  40 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  41 */     for (rad = 90; rad <= 180; rad++) {
/*  42 */       GL11.glVertex2d((x + width - radius) + Math.sin(rad * Math.PI / 180.0D) * radius, (y + radius) + Math.cos(rad * Math.PI / 180.0D) * radius);
/*     */     }
/*  44 */     GL11.glEnd();
/*  45 */     GL11.glEnable(3553);
/*  46 */     GL11.glShadeModel(7424);
/*     */     
/*  48 */     class_2403.method_9793();
/*     */   }
/*     */   
/*     */   public static void a(class_1071 p_175042_0_, float stack, float x) {
/*  52 */     if (b == null) {
/*  53 */       b = new class_2422(a.a().getModelManager());
/*     */     }
/*     */     
/*  56 */     class_2528 iBakedModel = a.method_9391().method_10224().method_9884(p_175042_0_);
/*  57 */     class_2403.method_9791();
/*  58 */     a.method_5570().method_5847(class_1533.field_6556);
/*  59 */     a.method_5570().method_5852(class_1533.field_6556).method_10323(false, false);
/*  60 */     class_2403.method_9788();
/*  61 */     class_2403.method_9825(1.0F, 1.0F, 1.0F, 1.0F);
/*  62 */     a(stack, x, iBakedModel.method_10374());
/*  63 */     iBakedModel.method_10377().method_10082(class_2462.class_2464.field_10996);
/*  64 */     a.method_9391().method_10243(p_175042_0_, iBakedModel);
/*  65 */     class_2403.method_9789();
/*  66 */     class_2403.method_9792();
/*  67 */     a.method_5570().method_5847(class_1533.field_6556);
/*  68 */     a.method_5570().method_5852(class_1533.field_6556).method_10322();
/*     */   }
/*     */   
/*     */   private static void a(float p_180452_0_, float xPosition, boolean yPosition) {
/*  72 */     class_2403.method_9816(p_180452_0_, xPosition, 100.0F + (a.method_9391()).field_2124);
/*  73 */     class_2403.method_9816(8.0F, 8.0F, 0.0F);
/*  74 */     class_2403.method_9800(1.0F, 1.0F, -1.0F);
/*  75 */     class_2403.method_9800(0.5F, 0.5F, 0.5F);
/*  76 */     if (yPosition) {
/*  77 */       class_2403.method_9800(40.0F, 40.0F, 40.0F);
/*  78 */       class_2403.method_9817(210.0F, 1.0F, 0.0F, 0.0F);
/*  79 */       class_2403.method_9817(-135.0F, 0.0F, 1.0F, 0.0F);
/*  80 */       class_2403.method_9830();
/*     */     } else {
/*  82 */       class_2403.method_9800(64.0F, 64.0F, 64.0F);
/*  83 */       class_2403.method_9817(180.0F, 1.0F, 0.0F, 0.0F);
/*  84 */       class_2403.method_9832();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void b(class_1071 p_180450_0_, float stack, float xPosition) {
/*  90 */     class_328.method_847();
/*  91 */     class_2403.method_9840();
/*  92 */     if (p_180450_0_ != null && p_180450_0_.method_3421() != null) {
/*  93 */       (a.method_9391()).field_2124 += 50.0F;
/*  94 */       a(p_180450_0_, stack, xPosition);
/*  95 */       (a.method_9391()).field_2124 -= 50.0F;
/*     */     } 
/*  97 */     class_2403.method_9838();
/*  98 */     class_328.method_843();
/*     */   }
/*     */   public static void a(float x, float y, float width, float height, Color color) {
/* 101 */     float alpha = color.getAlpha() / 255.0F;
/* 102 */     float red = color.getRed() / 255.0F;
/* 103 */     float green = color.getGreen() / 255.0F;
/* 104 */     float blue = color.getBlue() / 255.0F;
/* 105 */     class_520 wr = class_533.method_9926().method_9928();
/* 106 */     class_2403.method_9856();
/* 107 */     wr.method_9737(7, class_2520.field_11207);
/* 108 */     wr.method_9742(x, (y + height), 0.0D).method_9731(red, green, blue, alpha).method_9750();
/* 109 */     wr.method_9742((x + width), (y + height), 0.0D).method_9731(red, green, blue, alpha).method_9750();
/* 110 */     wr.method_9742((x + width), y, 0.0D).method_9731(red, green, blue, alpha).method_9750();
/* 111 */     wr.method_9742(x, y, 0.0D).method_9731(red, green, blue, alpha).method_9750();
/* 112 */     class_533.method_9926().method_9927();
/* 113 */     class_2403.method_9855();
/*     */   }
/*     */   
/*     */   public static void a(float x, float y, float texX, float texY, float width, float height) {
/* 117 */     float f = 0.00390625F;
/* 118 */     float g = 0.00390625F;
/* 119 */     class_533 tessellator = class_533.method_9926();
/* 120 */     class_520 worldRenderer = tessellator.method_9928();
/* 121 */     worldRenderer.method_9737(7, class_2520.field_11208);
/* 122 */     worldRenderer.method_9742(x, (y + height), (a.method_9391()).field_2124).method_9728((texX * f), ((texY + height) * g)).method_9750();
/* 123 */     worldRenderer.method_9742((x + width), (y + height), (a.method_9391()).field_2124).method_9728(((texX + width) * f), ((texY + height) * g)).method_9750();
/* 124 */     worldRenderer.method_9742((x + width), y, (a.method_9391()).field_2124).method_9728(((texX + width) * f), (texY * g)).method_9750();
/* 125 */     worldRenderer.method_9742(x, y, (a.method_9391()).field_2124).method_9728((texX * f), (texY * g)).method_9750();
/* 126 */     tessellator.method_9927();
/*     */   }
/*     */   
/*     */   public static void a(float i, float x, float y, float u, float v, float width, float height, float textureWidth) {
/* 130 */     float f = 1.0F / height;
/* 131 */     float g = 1.0F / textureWidth;
/* 132 */     class_533 tessellator = class_533.method_9926();
/* 133 */     class_520 worldRenderer = tessellator.method_9928();
/* 134 */     worldRenderer.method_9737(7, class_2520.field_11208);
/* 135 */     worldRenderer.method_9742(i, (x + width), 0.0D).method_9728((y * f), ((u + width) * g)).method_9750();
/* 136 */     worldRenderer.method_9742((i + v), (x + width), 0.0D).method_9728(((y + v) * f), ((u + width) * g)).method_9750();
/* 137 */     worldRenderer.method_9742((i + v), x, 0.0D).method_9728(((y + v) * f), (u * g)).method_9750();
/* 138 */     worldRenderer.method_9742(i, x, 0.0D).method_9728((y * f), (u * g)).method_9750();
/* 139 */     tessellator.method_9927();
/*     */   }
/*     */   
/*     */   public static void a(float x, float y, float u, float v, float texW, float textH, float w, float h, float tileW, float tileH) {
/* 143 */     float f = 1.0F / tileW;
/* 144 */     float g = 1.0F / tileH;
/* 145 */     class_533 tessellator = class_533.method_9926();
/* 146 */     class_520 worldRenderer = tessellator.method_9928();
/* 147 */     worldRenderer.method_9737(7, class_2520.field_11208);
/* 148 */     worldRenderer.method_9742(x, (y + h), 0.0D).method_9728((u * f), ((v + textH) * g)).method_9750();
/* 149 */     worldRenderer.method_9742((x + w), (y + h), 0.0D).method_9728(((u + texW) * f), ((v + textH) * g)).method_9750();
/* 150 */     worldRenderer.method_9742((x + w), y, 0.0D).method_9728(((u + texW) * f), (v * g)).method_9750();
/* 151 */     worldRenderer.method_9742(x, y, 0.0D).method_9728((u * f), (v * g)).method_9750();
/* 152 */     tessellator.method_9927();
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */