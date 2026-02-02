/*    */ package eu.shoroa.notro.cosmetics;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_1653;
/*    */ import net.minecraft.class_444;
/*    */ import net.minecraft.class_466;
/*    */ import net.minecraft.class_467;
/*    */ import net.minecraft.class_864;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\030\000 \0312\0020\001:\001\031B\007¢\006\004\b\002\020\003JI\020\016\032\0020\r2\b\020\005\032\004\030\0010\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\006H\026¢\006\004\b\016\020\017R\024\020\021\032\0020\0208\002X\004¢\006\006\n\004\b\021\020\022R\024\020\023\032\0020\0208\002X\004¢\006\006\n\004\b\023\020\022R\024\020\024\032\0020\0208\002X\004¢\006\006\n\004\b\024\020\022R\024\020\025\032\0020\0208\002X\004¢\006\006\n\004\b\025\020\022R\024\020\027\032\0020\0268\002X\004¢\006\006\n\004\b\027\020\030¨\006\032"}, d2 = {"Leu/shoroa/notro/cosmetics/Halo;", "Leu/shoroa/notro/client/feature/cosmetic/Model;", "<init>", "()V", "Lnet/minecraft/class_864;", "entity", "", "handSwing", "handSwingAmount", "ageInTtcsk", "headYaw", "headPitch", "scale", "", "render", "(Lnet/minecraft/class_864;FFFFFF)V", "Lnet/minecraft/class_467;", "halo1", "Lnet/minecraft/class_467;", "halo2", "halo3", "halo4", "Lnet/minecraft/class_1653;", "haloTexture", "Lnet/minecraft/class_1653;", "Companion", "NotroClient"})
/*    */ public final class b extends d {
/*    */   public b() {
/* 13 */     super("halo");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 22 */     this.field_1494 = 64;
/* 23 */     this.field_1495 = 32;
/*    */ 
/*    */     
/* 26 */     this.f = new class_1653("notro", "textures/cosmetic/halo.png");
/*    */ 
/*    */     
/* 29 */     this.b = new class_467((class_444)this);
/* 30 */     this.b.method_1187(-5.0F, -11.0F, 4.0F);
/* 31 */     this.b.field_1606.add(new class_466(this.b, 0, 0, 0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));
/*    */ 
/*    */     
/* 34 */     this.c = new class_467((class_444)this);
/* 35 */     this.c.method_1187(-5.0F, -11.0F, -5.0F);
/* 36 */     this.c.field_1606.add(new class_466(this.c, 0, 0, 0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));
/*    */ 
/*    */     
/* 39 */     this.d = new class_467((class_444)this);
/* 40 */     this.d.method_1187(4.0F, -11.0F, -4.0F);
/* 41 */     this.d.field_1606.add(new class_466(this.d, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
/*    */ 
/*    */     
/* 44 */     this.e = new class_467((class_444)this);
/* 45 */     this.e.method_1187(-5.0F, -11.0F, -4.0F);
/* 46 */     this.e.field_1606.add(new class_466(this.e, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
/*    */   }
/*    */   @NotNull
/*    */   public static final a a = new a(null); @NotNull
/*    */   private final class_467 b; @NotNull
/*    */   private final class_467 c; @NotNull
/*    */   private final class_467 d; @NotNull
/*    */   private final class_467 e;
/*    */   @NotNull
/*    */   private final class_1653 f;
/*    */   
/*    */   public void a(class_864 entity, float handSwing, float handSwingAmount, float ageInTtcsk, float headYaw, float headPitch, float scale) {
/* 58 */     class_518 en = (class_1600.method_2965()).field_10310;
/* 59 */     Intrinsics.checkNotNull(entity); if (!Intrinsics.areEqual(entity.method_2518(), en.method_2518())) {
/*    */       return;
/*    */     }
/*    */     try {
/* 63 */       class_1600.method_2965().method_5570().method_5847(this.f);
/* 64 */     } catch (Exception e) {
/*    */       
/* 66 */       System.out.println("Failed to load halo texture: " + e.getMessage());
/*    */       
/*    */       return;
/*    */     } 
/* 70 */     GL11.glPushMatrix();
/*    */ 
/*    */     
/* 73 */     if (en.method_2513()) {
/* 74 */       class_2403.method_9816(0.0F, 0.225F, 0.0F);
/*    */     }
/*    */ 
/*    */     
/* 78 */     float time = ageInTtcsk / 100.0F;
/* 79 */     float floatOffset = -((float)((float)Math.sin((time * 3.1415927F + 2.0F)) + 0.5D)) * 0.08F;
/* 80 */     class_2403.method_9816(0.0F, floatOffset, 0.0F);
/*    */ 
/*    */     
/* 83 */     class_2403.method_9800(0.9F, 0.9F, 0.9F);
/*    */     
/* 85 */     this.b.method_1186(scale);
/* 86 */     this.c.method_1186(scale);
/* 87 */     this.d.method_1186(scale);
/* 88 */     this.e.method_1186(scale);
/*    */     
/* 90 */     GL11.glPopMatrix();
/*    */   }
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\000\n\002\020\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\005\020\004J\r\020\003\032\0020\002¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/notro/cosmetics/b$a;", "", "", "a", "()V", "<init>"})
/*    */   public static final class a { private a() {}
/*    */     
/*    */     public final void a() {
/* 96 */       class_1600.method_2965().method_5570().method_5847(new class_1653("notro", "textures/cosmetic/halo.png"));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\cosmetics\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */