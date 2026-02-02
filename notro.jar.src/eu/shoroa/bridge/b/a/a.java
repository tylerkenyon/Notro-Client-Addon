/*    */ package eu.shoroa.bridge.b.a;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   private Supplier<Float> b;
/*    */   private Supplier<b> c;
/*    */   
/*    */   public a(Supplier<Float> longSupplier, Supplier<b> easing) {
/* 13 */     this.b = longSupplier;
/* 14 */     this.c = easing;
/* 15 */     this.d = ((b)easing.get()).a;
/*    */   }
/*    */   private c d; private long e; boolean a;
/*    */   public a(Supplier<Float> longSupplier, c customEasing) {
/* 19 */     this.b = longSupplier;
/* 20 */     this.d = customEasing;
/*    */   }
/*    */   
/*    */   public static a a(Supplier<Float> longSupplier, Supplier<b> easing) {
/* 24 */     return new a(longSupplier, easing);
/*    */   }
/*    */   
/*    */   public static a a(Supplier<Float> longSupplier, c customEasing) {
/* 28 */     return new a(longSupplier, customEasing);
/*    */   }
/*    */   
/*    */   public a a(Supplier<Boolean> a_state) {
/* 32 */     a(((Boolean)a_state.get()).booleanValue());
/* 33 */     return this;
/*    */   }
/*    */   
/*    */   public float a() {
/* 37 */     return this.d.get(Float.valueOf(b()));
/*    */   }
/*    */   
/*    */   public float b() {
/* 41 */     float t = (float)(System.currentTimeMillis() - this.e) / ((Float)this.b.get()).floatValue();
/* 42 */     return this.a ? a(t) : a((1.0F - t));
/*    */   }
/*    */   
/*    */   public void a(boolean state) {
/* 46 */     float lin = b();
/* 47 */     if (this.a != state) {
/* 48 */       this.e = state ? (System.currentTimeMillis() - (long)(lin * ((Float)this.b.get()).floatValue())) : (System.currentTimeMillis() - (long)((1.0F - lin) * ((Float)this.b.get()).floatValue()));
/*    */     }
/* 50 */     this.a = state;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 54 */     return this.a;
/*    */   }
/*    */   
/*    */   public Color a(Color from, Color to) {
/* 58 */     return a(from, to, 1.0F);
/*    */   }
/*    */   public Color a(Color from, Color to, float max) {
/* 61 */     float t = a() * max;
/* 62 */     return new Color(from
/* 63 */         .getRed() + (int)((to.getRed() - from.getRed()) * t), from
/* 64 */         .getGreen() + (int)((to.getGreen() - from.getGreen()) * t), from
/* 65 */         .getBlue() + (int)((to.getBlue() - from.getBlue()) * t), from
/* 66 */         .getAlpha() + (int)((to.getAlpha() - from.getAlpha()) * t));
/*    */   }
/*    */ 
/*    */   
/*    */   private float a(double in) {
/* 71 */     return (in < 0.0D) ? 0.0F : (float)Math.min(in, 1.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */