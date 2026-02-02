/*    */ package eu.shoroa.notro.client.a.a.a;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\004\030\0002\0020\001:\001\004B!\022\b\020\003\032\004\030\0010\r\022\006\020\016\032\0020\002\022\006\020\017\032\0020\002¢\006\004\b\020\020\021J\027\020\004\032\0020\0022\006\020\003\032\0020\002H\002¢\006\004\b\004\020\005R\032\020\004\032\0020\0068\007X\004¢\006\f\n\004\b\007\020\b\032\004\b\t\020\nR\032\020\t\032\0020\0028\007X\004¢\006\f\n\004\b\t\020\013\032\004\b\004\020\f"}, d2 = {"Leu/shoroa/notro/client/a/a/a/a;", "Leu/shoroa/notro/client/a/a/a/e;", "", "p0", "a", "(I)I", "Leu/shoroa/notro/client/a/a/a/a$a;", "c", "Leu/shoroa/notro/client/a/a/a/a$a;", "b", "()Leu/shoroa/notro/client/a/a/a/a$a;", "I", "()I", "", "p1", "p2", "<init>", "(Ljava/lang/String;II)V"})
/*    */ public final class a extends e { private final int b; @NotNull
/*    */   private final a c;
/*    */   
/*  5 */   public a(String name, int texture, int slot) { super(name); this.b = texture;
/*    */ 
/*    */ 
/*    */     
/*  9 */     this.c = new a(slot, a(slot)); }
/*    */   @JvmName(name = "a")
/*    */   public final int a() {
/*    */     return this.b;
/* 13 */   } private final int a(int s) { int min = 33984;
/* 14 */     return min + s; } @NotNull
/*    */   @JvmName(name = "b")
/*    */   public final a b() { return this.c; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\007\n\002\020\000\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\006\b\b\030\0002\0020\001B\027\022\006\020\006\032\0020\002\022\006\020\007\032\0020\002¢\006\004\b\024\020\025J\020\020\003\032\0020\002HÆ\003¢\006\004\b\003\020\004J\020\020\005\032\0020\002HÆ\003¢\006\004\b\005\020\004J$\020\b\032\0020\0002\b\b\002\020\006\032\0020\0022\b\b\002\020\007\032\0020\002HÇ\001¢\006\004\b\b\020\tJ\032\020\f\032\0020\0132\b\020\006\032\004\030\0010\nHÖ\003¢\006\004\b\f\020\rJ\020\020\016\032\0020\002HÖ\001¢\006\004\b\016\020\004J\020\020\020\032\0020\017H×\001¢\006\004\b\020\020\021R\027\020\b\032\0020\0028\007¢\006\f\n\004\b\022\020\023\032\004\b\022\020\004R\027\020\022\032\0020\0028\007¢\006\f\n\004\b\b\020\023\032\004\b\b\020\004"}, d2 = {"Leu/shoroa/notro/client/a/a/a/a$a;", "Ljava/lang/Record;", "", "c", "()I", "d", "p0", "p1", "a", "(II)Leu/shoroa/notro/client/a/a/a/a$a;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "b", "I", "<init>", "(II)V"})
/*    */   public static final class a extends Record {
/* 18 */     private final int a; private final int b; public a(int slot, int glFunc) { this.a = slot; this.b = glFunc; } @JvmName(name = "a") public final int a() { return this.a; } @JvmName(name = "b") public final int b() { return this.b; }
/*    */ 
/*    */     
/*    */     public final int c() {
/*    */       return this.a;
/*    */     }
/*    */     
/*    */     public final int d() {
/*    */       return this.b;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final a a(int slot, int glFunc) {
/*    */       return new a(slot, glFunc);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "TexSlot(slot=" + this.a + ", glFunc=" + this.b + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = Integer.hashCode(this.a);
/*    */       return result * 31 + Integer.hashCode(this.b);
/*    */     }
/*    */     
/*    */     public boolean equals(Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof a))
/*    */         return false; 
/*    */       a a1 = (a)other;
/*    */       return (this.a != a1.a) ? false : (!(this.b != a1.b));
/*    */     }
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\a\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */