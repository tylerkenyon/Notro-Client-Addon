/*    */ package eu.shoroa.notro.client.feature.cosmetic;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\n\030\0002\0020\001B\035\022\f\020\004\032\b\022\004\022\0020\0030\002\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\r\020\n\032\0020\t¢\006\004\b\n\020\013R\026\020\f\032\0020\0058\002@\002X\016¢\006\006\n\004\b\f\020\rR\026\020\016\032\0020\0058\002@\002X\016¢\006\006\n\004\b\016\020\rR\032\020\004\032\b\022\004\022\0020\0030\0028\002X\004¢\006\006\n\004\b\004\020\017R\023\020\022\032\004\030\0010\0038F¢\006\006\032\004\b\020\020\021R\024\020\006\032\0020\0058\002X\004¢\006\006\n\004\b\006\020\r¨\006\023"}, d2 = {"Leu/shoroa/notro/client/feature/cosmetic/AnimatedResourceLocation;", "", "", "Lnet/minecraft/class_1653;", "frames", "", "ticksPerFrame", "<init>", "(Ljava/util/List;I)V", "", "update", "()V", "currentFrame", "I", "currentTick", "Ljava/util/List;", "getTexture", "()Lnet/minecraft/class_1653;", "texture", "NotroClient"})
/*    */ public final class a {
/*    */   @NotNull
/*    */   private final List<class_1653> a;
/*    */   
/*    */   public a(List<class_1653> frames, int ticksPerFrame) {
/*  9 */     this.a = frames;
/* 10 */     this.b = (int)Math.max(1.0D, ticksPerFrame);
/*    */   }
/*    */   private final int b; private int c;
/*    */   private int d;
/*    */   
/*    */   @Nullable
/*    */   public final class_1653 a() {
/* 17 */     if (this.a.isEmpty()) return null; 
/* 18 */     return this.a.get(this.d);
/*    */   }
/*    */   
/*    */   public final void b() {
/* 22 */     if (this.a.isEmpty())
/*    */       return; 
/* 24 */     int i = this.c; this.c = i + 1;
/* 25 */     if (this.c >= this.b) {
/* 26 */       this.c = 0;
/* 27 */       i = this.d; this.d = i + 1;
/* 28 */       if (this.d >= this.a.size())
/* 29 */         this.d = 0; 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\cosmetic\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */