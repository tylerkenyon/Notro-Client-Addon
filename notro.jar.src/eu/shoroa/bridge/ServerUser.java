/*   */ package eu.shoroa.bridge;
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020$\n\002\b\002\n\002\020 \n\002\b\n\n\002\020\b\n\002\b\020\b\b\030\0002\0020\001BE\022\006\020\016\032\0020\002\022\006\020\017\032\0020\005\022\022\020\020\032\016\022\004\022\0020\002\022\004\022\0020\0020\b\022\030\020\021\032\024\022\020\022\016\022\004\022\0020\002\022\004\022\0020\0010\b0\013¢\006\004\b%\020&J\020\020\003\032\0020\002HÇ\003¢\006\004\b\003\020\004J\020\020\006\032\0020\005HÆ\003¢\006\004\b\006\020\007J\034\020\t\032\016\022\004\022\0020\002\022\004\022\0020\0020\bHÇ\003¢\006\004\b\t\020\nJ\"\020\f\032\024\022\020\022\016\022\004\022\0020\002\022\004\022\0020\0010\b0\013HÇ\003¢\006\004\b\f\020\rJV\020\022\032\0020\0002\b\b\002\020\016\032\0020\0022\b\b\002\020\017\032\0020\0052\024\b\002\020\020\032\016\022\004\022\0020\002\022\004\022\0020\0020\b2\032\b\002\020\021\032\024\022\020\022\016\022\004\022\0020\002\022\004\022\0020\0010\b0\013HÇ\001¢\006\004\b\022\020\023J\032\020\024\032\0020\0052\b\020\016\032\004\030\0010\001HÖ\003¢\006\004\b\024\020\025J\020\020\027\032\0020\026HÖ\001¢\006\004\b\027\020\030J\020\020\031\032\0020\002H×\001¢\006\004\b\031\020\004R,\020\032\032\024\022\020\022\016\022\004\022\0020\002\022\004\022\0020\0010\b0\0138\007X\004¢\006\f\n\004\b\032\020\033\032\004\b\034\020\rR\032\020\035\032\0020\0058\007X\004¢\006\f\n\004\b\035\020\036\032\004\b\035\020\007R\032\020\037\032\0020\0028\007X\004¢\006\f\n\004\b\037\020 \032\004\b!\020\004R&\020\"\032\016\022\004\022\0020\002\022\004\022\0020\0020\b8\007X\004¢\006\f\n\004\b\"\020#\032\004\b$\020\n"}, d2 = {"Leu/shoroa/bridge/ServerUser;", "", "", "component1", "()Ljava/lang/String;", "", "component2", "()Z", "", "component3", "()Ljava/util/Map;", "", "component4", "()Ljava/util/List;", "p0", "p1", "p2", "p3", "copy", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;)Leu/shoroa/bridge/ServerUser;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "cosmetics", "Ljava/util/List;", "getCosmetics", "isUser", "Z", "mcName", "Ljava/lang/String;", "getMcName", "rank", "Ljava/util/Map;", "getRank", "<init>", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;)V"})
/*   */ public final class ServerUser { @NotNull
/* 4 */   private final String mcName; private final boolean isUser; public ServerUser(String mcName, boolean isUser, Map<String, String> rank, List<Map<String, Object>> cosmetics) { this.mcName = mcName;
/* 5 */     this.isUser = isUser;
/* 6 */     this.rank = rank;
/* 7 */     this.cosmetics = cosmetics; } @NotNull private final Map<String, String> rank; @NotNull private final List<Map<String, Object>> cosmetics; @NotNull @JvmName(name = "getMcName") public final String getMcName() { return this.mcName; } @NotNull @JvmName(name = "getCosmetics") public final List<Map<String, Object>> getCosmetics() { return this.cosmetics; }
/*   */ 
/*   */   
/*   */   @JvmName(name = "isUser")
/*   */   public final boolean isUser() {
/*   */     return this.isUser;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   @JvmName(name = "getRank")
/*   */   public final Map<String, String> getRank() {
/*   */     return this.rank;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.mcName;
/*   */   }
/*   */   
/*   */   public final boolean component2() {
/*   */     return this.isUser;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Map<String, String> component3() {
/*   */     return this.rank;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final List<Map<String, Object>> component4() {
/*   */     return this.cosmetics;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final ServerUser copy(String mcName, boolean isUser, Map<String, String> rank, List<? extends Map<String, ? extends Object>> cosmetics) {
/*   */     Intrinsics.checkNotNullParameter(mcName, "");
/*   */     Intrinsics.checkNotNullParameter(rank, "");
/*   */     Intrinsics.checkNotNullParameter(cosmetics, "");
/*   */     return new ServerUser(mcName, isUser, rank, cosmetics);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "ServerUser(mcName=" + this.mcName + ", isUser=" + this.isUser + ", rank=" + this.rank + ", cosmetics=" + this.cosmetics + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.mcName.hashCode();
/*   */     result = result * 31 + Boolean.hashCode(this.isUser);
/*   */     result = result * 31 + this.rank.hashCode();
/*   */     return result * 31 + this.cosmetics.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof ServerUser))
/*   */       return false; 
/*   */     ServerUser serverUser = (ServerUser)other;
/*   */     return !Intrinsics.areEqual(this.mcName, serverUser.mcName) ? false : ((this.isUser != serverUser.isUser) ? false : (!Intrinsics.areEqual(this.rank, serverUser.rank) ? false : (!!Intrinsics.areEqual(this.cosmetics, serverUser.cosmetics))));
/*   */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\ServerUser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */