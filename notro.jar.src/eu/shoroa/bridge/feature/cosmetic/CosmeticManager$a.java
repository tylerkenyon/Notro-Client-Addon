/*     */ package eu.shoroa.bridge.feature.cosmetic;
/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\020\016\n\002\b\005\n\002\020\013\n\002\b\r\n\002\020\b\n\002\b\023\b\b\030\0002\0020\001B9\022\006\020\f\032\0020\002\022\006\020\r\032\0020\002\022\b\020\016\032\004\030\0010\002\022\006\020\017\032\0020\002\022\006\020\020\032\0020\b\022\006\020\021\032\0020\b¢\006\004\b(\020)J\020\020\003\032\0020\002HÇ\003¢\006\004\b\003\020\004J\020\020\005\032\0020\002HÇ\003¢\006\004\b\005\020\004J\022\020\006\032\004\030\0010\002HÇ\003¢\006\004\b\006\020\004J\020\020\007\032\0020\002HÇ\003¢\006\004\b\007\020\004J\020\020\t\032\0020\bHÆ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\bHÆ\003¢\006\004\b\013\020\nJN\020\022\032\0020\0002\b\b\002\020\f\032\0020\0022\b\b\002\020\r\032\0020\0022\n\b\002\020\016\032\004\030\0010\0022\b\b\002\020\017\032\0020\0022\b\b\002\020\020\032\0020\b2\b\b\002\020\021\032\0020\bHÇ\001¢\006\004\b\022\020\023J\032\020\024\032\0020\b2\b\020\f\032\004\030\0010\001HÖ\003¢\006\004\b\024\020\025J\020\020\027\032\0020\026HÖ\001¢\006\004\b\027\020\030J\020\020\031\032\0020\002H×\001¢\006\004\b\031\020\004R\032\020\032\032\0020\b8\007X\004¢\006\f\n\004\b\032\020\033\032\004\b\034\020\nR\032\020\035\032\0020\0028\007X\004¢\006\f\n\004\b\035\020\036\032\004\b\037\020\004R\032\020 \032\0020\0028\007X\004¢\006\f\n\004\b \020\036\032\004\b!\020\004R\032\020\"\032\0020\b8\007X\004¢\006\f\n\004\b\"\020\033\032\004\b#\020\nR\034\020$\032\004\030\0010\0028\007X\004¢\006\f\n\004\b$\020\036\032\004\b%\020\004R\032\020&\032\0020\0028\007X\004¢\006\f\n\004\b&\020\036\032\004\b'\020\004"}, d2 = {"Leu/shoroa/bridge/feature/cosmetic/CosmeticManager$a;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "component5", "()Z", "component6", "p0", "p1", "p2", "p3", "p4", "p5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Leu/shoroa/bridge/feature/cosmetic/CosmeticManager$a;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "animated", "Z", "getAnimated", "id", "Ljava/lang/String;", "getId", "name", "getName", "selected", "getSelected", "texture", "getTexture", "type", "getType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V"})
/*     */ final class a
/*     */ {
/*     */   @NotNull
/*     */   private final String id;
/*     */   @NotNull
/*     */   private final String name;
/*     */   @SerializedName("resourceLocation")
/*     */   @Nullable
/*     */   private final String texture;
/*     */   @NotNull
/*     */   private final String type;
/*     */   @SerializedName("isAnimated")
/*     */   private final boolean animated;
/*     */   private final boolean selected;
/*     */   
/*     */   public a(String id, String name, String texture, String type, boolean animated, boolean selected) {
/* 120 */     this.id = id;
/* 121 */     this.name = name;
/* 122 */     this.texture = texture;
/* 123 */     this.type = type;
/* 124 */     this.animated = animated;
/* 125 */     this.selected = selected; } @JvmName(name = "getSelected") public final boolean getSelected() { return this.selected; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   @JvmName(name = "getId")
/*     */   public final String getId() {
/*     */     return this.id;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   @JvmName(name = "getName")
/*     */   public final String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   @JvmName(name = "getTexture")
/*     */   public final String getTexture() {
/*     */     return this.texture;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   @JvmName(name = "getType")
/*     */   public final String getType() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   @JvmName(name = "getAnimated")
/*     */   public final boolean getAnimated() {
/*     */     return this.animated;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.id;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.texture;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component4() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   public final boolean component5() {
/*     */     return this.animated;
/*     */   }
/*     */   
/*     */   public final boolean component6() {
/*     */     return this.selected;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final a copy(String id, String name, String texture, String type, boolean animated, boolean selected) {
/*     */     Intrinsics.checkNotNullParameter(id, "");
/*     */     Intrinsics.checkNotNullParameter(name, "");
/*     */     Intrinsics.checkNotNullParameter(type, "");
/*     */     return new a(id, name, texture, type, animated, selected);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ServerCosmetic(id=" + this.id + ", name=" + this.name + ", texture=" + this.texture + ", type=" + this.type + ", animated=" + this.animated + ", selected=" + this.selected + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.id.hashCode();
/*     */     result = result * 31 + this.name.hashCode();
/*     */     result = result * 31 + ((this.texture == null) ? 0 : this.texture.hashCode());
/*     */     result = result * 31 + this.type.hashCode();
/*     */     result = result * 31 + Boolean.hashCode(this.animated);
/*     */     return result * 31 + Boolean.hashCode(this.selected);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof a))
/*     */       return false; 
/*     */     a a1 = (a)other;
/*     */     return !Intrinsics.areEqual(this.id, a1.id) ? false : (!Intrinsics.areEqual(this.name, a1.name) ? false : (!Intrinsics.areEqual(this.texture, a1.texture) ? false : (!Intrinsics.areEqual(this.type, a1.type) ? false : ((this.animated != a1.animated) ? false : (!(this.selected != a1.selected))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\cosmetic\CosmeticManager$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */