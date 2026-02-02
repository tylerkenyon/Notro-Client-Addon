/*    */ package eu.shoroa.bridge.d.e;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\020\007\n\000\n\002\020\002\n\002\b\n\030\000 \0052\0020\001:\001\005B\017\022\006\020\003\032\0020\002¢\006\004\b\016\020\006J\025\020\005\032\0020\0042\006\020\003\032\0020\002¢\006\004\b\005\020\006J\035\020\005\032\0020\0042\006\020\003\032\0020\0022\006\020\007\032\0020\002¢\006\004\b\005\020\bJ\r\020\005\032\0020\002¢\006\004\b\005\020\tR\026\020\005\032\0020\0028\002@\002X\016¢\006\006\n\004\b\n\020\013R\026\020\r\032\0020\0028\002@\002X\016¢\006\006\n\004\b\f\020\013R\026\020\f\032\0020\0028\002@\002X\016¢\006\006\n\004\b\r\020\013"}, d2 = {"Leu/shoroa/bridge/d/e/g;", "", "", "p0", "", "a", "(F)V", "p1", "(FF)V", "()F", "d", "F", "c", "b", "<init>"})
/*    */ public final class g { @NotNull
/*    */   public static final a a = new a(null); private float b;
/*    */   
/*    */   public g(float initValue) {
/*  6 */     this.b = initValue;
/*  7 */     this.c = initValue;
/*  8 */     this.d = 0.1F;
/*    */   } private float c; private float d; public final void a(float raw, float speed) {
/* 10 */     if (Float.isNaN(this.b)) this.b = raw; 
/* 11 */     this.c = raw;
/* 12 */     this.d = speed;
/* 13 */     if (this.b > this.c)
/* 14 */       this.b += (this.c - this.b) * speed * a.a(); 
/* 15 */     if (this.b < this.c)
/* 16 */       this.b -= (this.b - this.c) * speed * a.a(); 
/*    */   }
/*    */   public final float a() {
/* 19 */     return this.b;
/*    */   } public final void a(float in) {
/* 21 */     this.c = in;
/* 22 */     this.b = in;
/*    */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\000\n\002\020\007\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\005\020\006J\r\020\003\032\0020\002¢\006\004\b\003\020\004"}, d2 = {"Leu/shoroa/bridge/d/e/g$a;", "", "", "a", "()F", "<init>", "()V"})
/*    */   public static final class a { private a() {} public final float a() {
/* 25 */       Intrinsics.checkNotNull(b.a.d()); return 1.0F / b.a.d().fps();
/*    */     } }
/*    */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\e\g.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */