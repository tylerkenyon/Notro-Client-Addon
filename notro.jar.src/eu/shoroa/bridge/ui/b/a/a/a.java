/*   */ package eu.shoroa.bridge.ui.b.a.a;
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\002\b\005\b\b\030\000*\004\b\000\020\0012\0020\002B\017\022\006\020\005\032\0028\000¢\006\004\b\025\020\017J\020\020\003\032\0028\000HÆ\003¢\006\004\b\003\020\004J \020\003\032\b\022\004\022\0028\0000\0002\b\b\002\020\005\032\0028\000HÇ\001¢\006\004\b\003\020\006J\032\020\b\032\0020\0072\b\020\005\032\004\030\0010\002HÖ\003¢\006\004\b\b\020\tJ\r\020\n\032\0028\000¢\006\004\b\n\020\004J\020\020\f\032\0020\013HÖ\001¢\006\004\b\f\020\rJ\025\020\n\032\0020\0162\006\020\005\032\0028\000¢\006\004\b\n\020\017J\020\020\021\032\0020\020H×\001¢\006\004\b\021\020\022R\"\020\023\032\0028\0008\007@\007X\016¢\006\022\n\004\b\023\020\024\032\004\b\023\020\004\"\004\b\023\020\017"}, d2 = {"Leu/shoroa/bridge/ui/b/a/a/a;", "T", "", "c", "()Ljava/lang/Object;", "p0", "(Ljava/lang/Object;)Leu/shoroa/bridge/ui/b/a/a/a;", "", "equals", "(Ljava/lang/Object;)Z", "b", "", "hashCode", "()I", "", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "<init>"})
/* 3 */ public final class a<T> { public a(Object value) { this.a = (T)value; } private T a; @JvmName(name = "a") public final T a() { return this.a; } @JvmName(name = "a") public final void a(Object <set-?>) { this.a = (T)<set-?>; } public final T b() {
/* 4 */     return this.a;
/*   */   } public final void b(Object value) {
/* 6 */     this.a = (T)value;
/*   */   }
/*   */   
/*   */   public final T c() {
/*   */     return this.a;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final a<T> c(Object value) {
/*   */     return new a((T)value);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "ValueHolder(value=" + this.a + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return (this.a == null) ? 0 : this.a.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof a))
/*   */       return false; 
/*   */     a a1 = (a)other;
/*   */     return !!Intrinsics.areEqual(this.a, a1.a);
/*   */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\a\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */