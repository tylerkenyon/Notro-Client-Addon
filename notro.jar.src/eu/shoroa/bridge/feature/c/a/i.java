/*    */ package eu.shoroa.bridge.feature.c.a;public final class i { private final int a; private final int b; @NotNull
/*    */   private BufferedImage c; @NotNull
/*    */   private final a[][] d; private final int e;
/*    */   @NotNull
/*    */   private final ByteBuffer f;
/*    */   @NotNull
/*    */   private Function2<? super Integer, ? super Integer, ? extends Color> g;
/*    */   
/*  9 */   public i(int width, int height) { this.a = width; this.b = height;
/* 10 */     this.c = new BufferedImage(this.a, this.b, 2); int j; a[][] arrayOfA; i i1;
/* 11 */     for (byte b = 0; b < j; ) { byte b1; byte b2; int k; a[] arrayOfA1; a[][] arrayOfA2; byte b3; for (b1 = b, b2 = 0, k = this.b, arrayOfA1 = new a[k], b3 = b1, arrayOfA2 = arrayOfA; b2 < k; ) { byte b4 = b2; arrayOfA1[b4] = null; b2++; }  arrayOfA2[b3] = arrayOfA1; b++; }  i1.d = arrayOfA;
/* 12 */     this.e = GL11.glGenTextures();
/* 13 */     Intrinsics.checkNotNullExpressionValue(BufferUtils.createByteBuffer(this.a * this.b * 4), ""); this.f = BufferUtils.createByteBuffer(this.a * this.b * 4);
/*    */     
/* 15 */     for (int x = 0; x < j; x++) {
/* 16 */       for (int y = 0, k = this.b; y < k; y++) {
/* 17 */         this.d[x][y] = new a(x, y, new Color(0, true));
/* 18 */         this.c.setRGB(x, y, 0);
/* 19 */         this.f.put((byte)0);
/* 20 */         this.f.put((byte)0);
/* 21 */         this.f.put((byte)0);
/* 22 */         this.f.put((byte)0);
/*    */       } 
/*    */     } 
/* 25 */     this.f.flip();
/* 26 */     GL11.glBindTexture(3553, this.e);
/* 27 */     GL11.glTexParameteri(3553, 10241, 9728);
/* 28 */     GL11.glTexParameteri(3553, 10240, 9728);
/* 29 */     GL11.glTexImage2D(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, this.f);
/* 30 */     GL11.glBindTexture(3553, 0);
/*    */     
/* 32 */     this.g = new b(this); } public final int a() { return this.a; } public final int b() { return this.b; } public final int c() { return this.e; } @NotNull public final Function2<Integer, Integer, Color> d() { return (Function2)this.g; } public final void a(Function2<? super Integer, ? super Integer, ? extends Color> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.g = <set-?>; } static final class b extends Lambda implements Function2<Integer, Integer, Color> { b(i $receiver) { super(2); } @NotNull public final Color a(int x, int y) { Intrinsics.checkNotNull(i.a(this.a)[x][y]); return i.a(this.a)[x][y].c(); }
/*    */      }
/* 34 */    public final void a(int x, int y, Color color) { Intrinsics.checkNotNullParameter(color, ""); Intrinsics.checkNotNull(this.d[x][y]); this.d[x][y].a(color);
/* 35 */     int j = color.getRGB();
/*    */     
/* 37 */     Intrinsics.checkNotNullExpressionValue(BufferUtils.createByteBuffer(4), ""); ByteBuffer pixelBuffer = BufferUtils.createByteBuffer(4);
/* 38 */     pixelBuffer.put((byte)(j >> 16 & 0xFF));
/* 39 */     pixelBuffer.put((byte)(j >> 8 & 0xFF));
/* 40 */     pixelBuffer.put((byte)(j & 0xFF));
/* 41 */     pixelBuffer.put((byte)(j >> 24 & 0xFF));
/* 42 */     pixelBuffer.flip();
/*    */     
/* 44 */     GL11.glBindTexture(3553, this.e);
/* 45 */     GL11.glTexSubImage2D(3553, 0, x, y, 1, 1, 6408, 5121, pixelBuffer); }
/*    */   public final int e() { return this.a; }
/*    */   public final int f() { return this.b; }
/*    */   @NotNull
/* 49 */   public final i a(int width, int height) { return new i(width, height); } public final void a(BufferedImage shape) { Intrinsics.checkNotNullParameter(shape, ""); this.c = shape;
/* 50 */     this.f.clear();
/* 51 */     int x = 0, j = this.a; if (x <= j)
/* 52 */       while (true) { int y = 0, k = this.b; if (y <= k)
/* 53 */           while (true) { int color = shape.getRGB(x, y);
/* 54 */             Intrinsics.checkNotNull(this.d[x][y]); this.d[x][y].a(new Color(color));
/* 55 */             this.f.put((byte)(color >> 16 & 0xFF));
/* 56 */             this.f.put((byte)(color >> 8 & 0xFF));
/* 57 */             this.f.put((byte)(color & 0xFF));
/* 58 */             this.f.put((byte)(color >> 24 & 0xFF)); if (y != k) { y++; continue; }  break; }
/*    */             if (x != j) { x++; continue; }
/*    */          break; }
/* 61 */         this.f.flip();
/* 62 */     GL11.glBindTexture(3553, this.e);
/* 63 */     GL11.glTexParameteri(3553, 10241, 9728);
/* 64 */     GL11.glTexParameteri(3553, 10240, 9728);
/* 65 */     GL11.glTexImage2D(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, this.f);
/* 66 */     GL11.glBindTexture(3553, 0); }
/*    */   @NotNull public String toString() { return "Shape(width=" + this.a + ", height=" + this.b + ")"; } public int hashCode() { result = Integer.hashCode(this.a); return result * 31 + Integer.hashCode(this.b); } public boolean equals(Object other) { if (this == other) return true;  if (!(other instanceof i)) return false;  i i1 = (i)other; return (this.a != i1.a) ? false : (!(this.b != i1.b)); } public static final class a
/*    */   {
/* 69 */     private final int a; private final int b; @NotNull private Color c; public a(int x, int y, Color color) { this.a = x; this.b = y; this.c = color; } public final int a() { return this.a; } public final int b() { return this.b; } @NotNull public final Color c() { return this.c; } public final void a(Color <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.c = <set-?>; }
/*    */ 
/*    */     
/*    */     public final int d() {
/*    */       return this.a;
/*    */     }
/*    */     
/*    */     public final int e() {
/*    */       return this.b;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Color f() {
/*    */       return this.c;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final a a(int x, int y, Color color) {
/*    */       Intrinsics.checkNotNullParameter(color, "");
/*    */       return new a(x, y, color);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Pixel(x=" + this.a + ", y=" + this.b + ", color=" + this.c + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = Integer.hashCode(this.a);
/*    */       result = result * 31 + Integer.hashCode(this.b);
/*    */       return result * 31 + this.c.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof a))
/*    */         return false; 
/*    */       a a1 = (a)other;
/*    */       return (this.a != a1.a) ? false : ((this.b != a1.b) ? false : (!!Intrinsics.areEqual(this.c, a1.c)));
/*    */     }
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\c\a\i.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */