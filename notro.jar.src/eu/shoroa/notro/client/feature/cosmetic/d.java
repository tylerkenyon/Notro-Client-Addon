/*   */ package eu.shoroa.notro.client.feature.cosmetic;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\005\b\026\030\0002\0020\001B\017\022\006\020\003\032\0020\002¢\006\004\b\004\020\005R$\020\007\032\004\030\0010\0068\006@\006X\016¢\006\022\n\004\b\007\020\b\032\004\b\t\020\n\"\004\b\013\020\fR\027\020\016\032\0020\r8\006¢\006\f\n\004\b\016\020\017\032\004\b\020\020\021¨\006\022"}, d2 = {"Leu/shoroa/notro/client/feature/cosmetic/Model;", "Lnet/minecraft/class_444;", "", "texturePath", "<init>", "(Ljava/lang/String;)V", "Lnet/minecraft/class_570;", "renderPlayer", "Lnet/minecraft/class_570;", "getRenderPlayer", "()Lnet/minecraft/class_570;", "setRenderPlayer", "(Lnet/minecraft/class_570;)V", "Lnet/minecraft/class_1653;", "texture", "Lnet/minecraft/class_1653;", "getTexture", "()Lnet/minecraft/class_1653;", "NotroClient"})
/*   */ public class d extends class_444 {
/*   */   @Nullable
/*   */   private class_570 a;
/*   */   
/* 9 */   public d(String texturePath) { this.b = new class_1653("notro", "cosmetics/" + texturePath + ".png"); } @NotNull private final class_1653 b; @NotNull public final class_1653 b() { return this.b; }
/*   */ 
/*   */   
/*   */   @Nullable
/*   */   public final class_570 a() {
/*   */     return this.a;
/*   */   }
/*   */   
/*   */   public final void a(class_570 <set-?>) {
/*   */     this.a = <set-?>;
/*   */   }
/*   */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\cosmetic\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */