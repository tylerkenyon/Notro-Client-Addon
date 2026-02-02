/*   */ package eu.shoroa.bridge;
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\n\b\b\030\0002\0020\001B\027\022\006\020\006\032\0020\002\022\006\020\007\032\0020\002¢\006\004\b\026\020\027J\020\020\003\032\0020\002HÇ\003¢\006\004\b\003\020\004J\020\020\005\032\0020\002HÇ\003¢\006\004\b\005\020\004J$\020\b\032\0020\0002\b\b\002\020\006\032\0020\0022\b\b\002\020\007\032\0020\002HÇ\001¢\006\004\b\b\020\tJ\032\020\013\032\0020\n2\b\020\006\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\016\032\0020\rHÖ\001¢\006\004\b\016\020\017J\020\020\020\032\0020\002H×\001¢\006\004\b\020\020\004R\032\020\021\032\0020\0028\007X\004¢\006\f\n\004\b\021\020\022\032\004\b\023\020\004R\032\020\024\032\0020\0028\007X\004¢\006\f\n\004\b\024\020\022\032\004\b\025\020\004"}, d2 = {"Leu/shoroa/bridge/Rank;", "", "", "component1", "()Ljava/lang/String;", "component2", "p0", "p1", "copy", "(Ljava/lang/String;Ljava/lang/String;)Leu/shoroa/bridge/Rank;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "name", "Ljava/lang/String;", "getName", "resource", "getResource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V"})
/*   */ public final class Rank { @NotNull
/* 4 */   private final String name; public Rank(String name, String resource) { this.name = name;
/* 5 */     this.resource = resource; } @NotNull private final String resource; @NotNull @JvmName(name = "getName") public final String getName() { return this.name; } @NotNull @JvmName(name = "getResource") public final String getResource() { return this.resource; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.name;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component2() {
/*   */     return this.resource;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Rank copy(String name, String resource) {
/*   */     Intrinsics.checkNotNullParameter(name, "");
/*   */     Intrinsics.checkNotNullParameter(resource, "");
/*   */     return new Rank(name, resource);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "Rank(name=" + this.name + ", resource=" + this.resource + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.name.hashCode();
/*   */     return result * 31 + this.resource.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof Rank))
/*   */       return false; 
/*   */     Rank rank = (Rank)other;
/*   */     return !Intrinsics.areEqual(this.name, rank.name) ? false : (!!Intrinsics.areEqual(this.resource, rank.resource));
/*   */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\Rank.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */