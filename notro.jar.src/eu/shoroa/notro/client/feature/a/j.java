/*    */ package eu.shoroa.notro.client.feature.a;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\013\020\fJ\017\020\003\032\0020\002H\027¢\006\004\b\003\020\004J\017\020\005\032\0020\002H\027¢\006\004\b\005\020\004R\026\020\b\032\0020\0028\002@\002X\016¢\006\006\n\004\b\006\020\007R\026\020\006\032\0020\t8\002@\002X\016¢\006\006\n\004\b\b\020\n"}, d2 = {"Leu/shoroa/notro/client/feature/a/j;", "Leu/shoroa/bridge/feature/b/e;", "", "t", "()Ljava/lang/String;", "s", "b", "Ljava/lang/String;", "a", "", "Z", "<init>", "()V"})
/*    */ public final class j extends e {
/*    */   private boolean a;
/*    */   
/*  7 */   public j() { super("ToggleSprint", "Allows you to auto-sprint like in newer versions", "togglesprint");
/*    */     
/*  9 */     this.b = ""; } @NotNull
/*    */   private String b; @NotNull
/*    */   public String s() {
/* 12 */     a.a(this.a, (class_1600.method_2965()).field_3823.field_7657);
/* 13 */     if ((class_1600.method_2965()).field_3823.field_7657.method_841()) {
/* 14 */       this.a = !this.a;
/*    */     }
/* 16 */     this.b = ((class_1600.method_2965()).field_10310.method_2514() || this.a) ? ("Sprinting: " + (
/* 17 */       this.a ? "Toggled" : "Vanilla")) : 
/*    */       
/* 19 */       "";
/*    */     
/* 21 */     return this.b;
/*    */   } @NotNull
/*    */   public String t() {
/* 24 */     return "Sprinting: Toggled";
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\j.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */