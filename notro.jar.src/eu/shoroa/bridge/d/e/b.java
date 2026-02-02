/*    */ package eu.shoroa.bridge.d.e;
/*    */ import java.util.function.Consumer;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ public final class b {
/*    */   private float a;
/*    */   private float b;
/*    */   private float c;
/*    */   private float d;
/*    */   private float e;
/*    */   private float f;
/*    */   private boolean g;
/*    */   
/*    */   public final void a(float mx, float my, float dragX, float dragY) {
/* 15 */     this.a = dragX - mx;
/* 16 */     this.b = dragY - my;
/* 17 */     this.g = false;
/*    */   }
/*    */   
/*    */   public final void a(float mx, float my, Consumer<Float> setX, Consumer<Float> setY) {
/* 21 */     Intrinsics.checkNotNullParameter(setX, ""); Intrinsics.checkNotNullParameter(setY, ""); this.g = true;
/* 22 */     setX.accept(Float.valueOf(mx + this.a));
/* 23 */     setY.accept(Float.valueOf(my + this.b));
/*    */   }
/*    */   
/* 26 */   public final float a(float mx) { return mx + this.a; }
/* 27 */   public final float b(float my) { return my + this.b; }
/* 28 */   public final boolean a() { return this.g; } public final void b() {
/* 29 */     this.g = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\e\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */