/*    */ package eu.shoroa.bridge.feature.c.a;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class a
/*    */ {
/*    */   private final int a;
/*    */   private final int b;
/*    */   @NotNull
/*    */   private Color c;
/*    */   
/*    */   public a(int x, int y, Color color) {
/* 69 */     this.a = x; this.b = y; this.c = color; } public final int a() { return this.a; } public final int b() { return this.b; } @NotNull public final Color c() { return this.c; } public final void a(Color <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.c = <set-?>; }
/*    */ 
/*    */   
/*    */   public final int d() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public final int e() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Color f() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final a a(int x, int y, Color color) {
/*    */     Intrinsics.checkNotNullParameter(color, "");
/*    */     return new a(x, y, color);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Pixel(x=" + this.a + ", y=" + this.b + ", color=" + this.c + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.a);
/*    */     result = result * 31 + Integer.hashCode(this.b);
/*    */     return result * 31 + this.c.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof a))
/*    */       return false; 
/*    */     a a1 = (a)other;
/*    */     return (this.a != a1.a) ? false : ((this.b != a1.b) ? false : (!!Intrinsics.areEqual(this.c, a1.c)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\c\a\i$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */