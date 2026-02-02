/*    */ package eu.shoroa.notro.client.a.a.a;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmName;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\007\n\002\020\000\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\006\b\b\030\0002\0020\001B\027\022\006\020\006\032\0020\002\022\006\020\007\032\0020\002¢\006\004\b\024\020\025J\020\020\003\032\0020\002HÆ\003¢\006\004\b\003\020\004J\020\020\005\032\0020\002HÆ\003¢\006\004\b\005\020\004J$\020\b\032\0020\0002\b\b\002\020\006\032\0020\0022\b\b\002\020\007\032\0020\002HÇ\001¢\006\004\b\b\020\tJ\032\020\f\032\0020\0132\b\020\006\032\004\030\0010\nHÖ\003¢\006\004\b\f\020\rJ\020\020\016\032\0020\002HÖ\001¢\006\004\b\016\020\004J\020\020\020\032\0020\017H×\001¢\006\004\b\020\020\021R\027\020\b\032\0020\0028\007¢\006\f\n\004\b\022\020\023\032\004\b\022\020\004R\027\020\022\032\0020\0028\007¢\006\f\n\004\b\b\020\023\032\004\b\b\020\004"}, d2 = {"Leu/shoroa/notro/client/a/a/a/a$a;", "Ljava/lang/Record;", "", "c", "()I", "d", "p0", "p1", "a", "(II)Leu/shoroa/notro/client/a/a/a/a$a;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "b", "I", "<init>", "(II)V"})
/*    */ public final class a
/*    */   extends Record
/*    */ {
/*    */   private final int a;
/*    */   private final int b;
/*    */   
/*    */   public a(int slot, int glFunc) {
/* 18 */     this.a = slot; this.b = glFunc; } @JvmName(name = "a") public final int a() { return this.a; } @JvmName(name = "b") public final int b() { return this.b; }
/*    */ 
/*    */   
/*    */   public final int c() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public final int d() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final a a(int slot, int glFunc) {
/*    */     return new a(slot, glFunc);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TexSlot(slot=" + this.a + ", glFunc=" + this.b + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.a);
/*    */     return result * 31 + Integer.hashCode(this.b);
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof a))
/*    */       return false; 
/*    */     a a1 = (a)other;
/*    */     return (this.a != a1.a) ? false : (!(this.b != a1.b));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\a\a\a$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */