/*    */ package eu.shoroa.notro.client.feature.a.a;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\020\b\n\002\b\n\n\002\020\t\n\002\b\006\030\0002\0020\001B\007¢\006\004\b\027\020\030J\017\020\003\032\0020\002H\027¢\006\004\b\003\020\004J\017\020\005\032\0020\002H\027¢\006\004\b\005\020\004R \020\b\032\b\022\004\022\0020\0070\0068\007X\004¢\006\f\n\004\b\b\020\t\032\004\b\n\020\013R\"\020\021\032\0020\0078\007@\007X\016¢\006\022\n\004\b\f\020\r\032\004\b\016\020\017\"\004\b\b\020\020R\"\020\f\032\0020\0228\007@\007X\016¢\006\022\n\004\b\021\020\023\032\004\b\024\020\025\"\004\b\b\020\026"}, d2 = {"Leu/shoroa/notro/client/feature/a/a/d;", "Leu/shoroa/bridge/feature/b/e;", "", "t", "()Ljava/lang/String;", "s", "Leu/shoroa/bridge/feature/c/b;", "", "a", "Leu/shoroa/bridge/feature/c/b;", "u", "()Leu/shoroa/bridge/feature/c/b;", "c", "I", "w", "()I", "(I)V", "b", "", "J", "v", "()J", "(J)V", "<init>", "()V"})
/*    */ public final class d extends e {
/*    */   @NotNull
/*    */   private final b<Integer> a;
/*    */   private long b;
/*    */   private int c;
/*    */   
/* 10 */   public d() { super("Ping", "Shows your ping", "ping");
/* 11 */     this.a = (new b("Interval", Integer.valueOf(10))).a(Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(1));
/*    */     
/* 13 */     this.b = System.currentTimeMillis();
/* 14 */     this.c = -1;
/*    */ 
/*    */     
/* 17 */     g().add(this.a); }
/*    */   @NotNull @JvmName(name = "u") public final b<Integer> u() { return this.a; }
/*    */   @JvmName(name = "v")
/*    */   public final long v() { return this.b; } @NotNull
/* 21 */   public String s() { class_485 data = class_1600.method_2965().method_6625();
/* 22 */     if (data != null && System.currentTimeMillis() - this.b >= (((Number)this.a.b()).intValue() * 10))
/* 23 */     { this.b = System.currentTimeMillis();
/*    */       try {
/* 25 */         (new class_1848()).method_6855(data);
/* 26 */       } catch (UnknownHostException unknownHostException) {
/* 27 */         System.out.println("Unknown host!");
/*    */       } 
/* 29 */       if (data.field_1690 != -1L) this.c = (int)data.field_1690;  }
/* 30 */     else { this.c = -1; }
/* 31 */      return "" + this.c + " ms"; }
/*    */   @JvmName(name = "a") public final void a(long <set-?>) { this.b = <set-?>; }
/*    */   @JvmName(name = "w") public final int w() { return this.c; }
/* 34 */   @JvmName(name = "a") public final void a(int <set-?>) { this.c = <set-?>; } @NotNull public String t() { return s(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */