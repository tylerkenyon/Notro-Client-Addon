/*    */ package eu.shoroa.bridge.ui.clickgui.comp.d;
/*    */ 
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
/*    */ public final class b
/*    */ {
/*    */   @NotNull
/*    */   private final String a;
/*    */   @NotNull
/*    */   private final String b;
/*    */   @NotNull
/*    */   private final String c;
/*    */   
/*    */   public b(String title, String desc, String iconPath) {
/* 94 */     this.a = title; this.b = desc; this.c = iconPath; } @NotNull public final String a() { return this.a; } @NotNull public final String b() { return this.b; } @NotNull public final String c() { return this.c; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String d() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String e() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String f() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final b a(String title, String desc, String iconPath) {
/*    */     Intrinsics.checkNotNullParameter(title, "");
/*    */     Intrinsics.checkNotNullParameter(desc, "");
/*    */     Intrinsics.checkNotNullParameter(iconPath, "");
/*    */     return new b(title, desc, iconPath);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Profile(title=" + this.a + ", desc=" + this.b + ", iconPath=" + this.c + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.a.hashCode();
/*    */     result = result * 31 + this.b.hashCode();
/*    */     return result * 31 + this.c.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof b))
/*    */       return false; 
/*    */     b b1 = (b)other;
/*    */     return !Intrinsics.areEqual(this.a, b1.a) ? false : (!Intrinsics.areEqual(this.b, b1.b) ? false : (!!Intrinsics.areEqual(this.c, b1.c)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\d\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */