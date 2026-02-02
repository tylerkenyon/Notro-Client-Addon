/*    */ package eu.shoroa.bridge.b;
/*    */ 
/*    */ public final class a {
/*    */   @NotNull
/*    */   private final ByteBuffer a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/* 10 */   public a(ByteBuffer gifBytes) { this.a = gifBytes;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     d();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 69 */     this.h = System.currentTimeMillis(); }
/*    */   private long e; private int[] f; private int g; private long h; private final void d() { // Byte code:
/*    */     //   0: invokestatic stackPush : ()Lorg/lwjgl/system/MemoryStack;
/*    */     //   3: checkcast java/lang/AutoCloseable
/*    */     //   6: astore_1
/*    */     //   7: aconst_null
/*    */     //   8: astore_2
/*    */     //   9: nop
/*    */     //   10: aload_1
/*    */     //   11: checkcast org/lwjgl/system/MemoryStack
/*    */     //   14: astore_3
/*    */     //   15: iconst_0
/*    */     //   16: istore #4
/*    */     //   18: aload_3
/*    */     //   19: iconst_1
/*    */     //   20: invokevirtual mallocInt : (I)Ljava/nio/IntBuffer;
/*    */     //   23: astore #5
/*    */     //   25: aload_3
/*    */     //   26: iconst_1
/*    */     //   27: invokevirtual mallocInt : (I)Ljava/nio/IntBuffer;
/*    */     //   30: astore #6
/*    */     //   32: aload_3
/*    */     //   33: iconst_1
/*    */     //   34: invokevirtual mallocInt : (I)Ljava/nio/IntBuffer;
/*    */     //   37: astore #7
/*    */     //   39: aload_3
/*    */     //   40: iconst_1
/*    */     //   41: invokevirtual mallocPointer : (I)Lorg/lwjgl3/PointerBuffer;
/*    */     //   44: astore #8
/*    */     //   46: aload_3
/*    */     //   47: iconst_1
/*    */     //   48: invokevirtual mallocInt : (I)Ljava/nio/IntBuffer;
/*    */     //   51: astore #9
/*    */     //   53: aload_0
/*    */     //   54: getfield a : Ljava/nio/ByteBuffer;
/*    */     //   57: aload #8
/*    */     //   59: aload #5
/*    */     //   61: aload #6
/*    */     //   63: aload #7
/*    */     //   65: aload #9
/*    */     //   67: iconst_4
/*    */     //   68: invokestatic stbi_load_gif_from_memory : (Ljava/nio/ByteBuffer;Lorg/lwjgl3/PointerBuffer;Ljava/nio/IntBuffer;Ljava/nio/IntBuffer;Ljava/nio/IntBuffer;Ljava/nio/IntBuffer;I)Ljava/nio/ByteBuffer;
/*    */     //   71: dup
/*    */     //   72: ifnonnull -> 92
/*    */     //   75: pop
/*    */     //   76: new java/lang/RuntimeException
/*    */     //   79: dup
/*    */     //   80: invokestatic stbi_failure_reason : ()Ljava/lang/String;
/*    */     //   83: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   91: athrow
/*    */     //   92: astore #10
/*    */     //   94: aload #10
/*    */     //   96: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   99: aload #10
/*    */     //   101: astore #11
/*    */     //   103: aload_0
/*    */     //   104: aload #5
/*    */     //   106: iconst_0
/*    */     //   107: invokevirtual get : (I)I
/*    */     //   110: putfield b : I
/*    */     //   113: aload_0
/*    */     //   114: aload #6
/*    */     //   116: iconst_0
/*    */     //   117: invokevirtual get : (I)I
/*    */     //   120: putfield c : I
/*    */     //   123: aload_0
/*    */     //   124: aload #7
/*    */     //   126: iconst_0
/*    */     //   127: invokevirtual get : (I)I
/*    */     //   130: putfield d : I
/*    */     //   133: aload #8
/*    */     //   135: iconst_0
/*    */     //   136: invokevirtual get : (I)J
/*    */     //   139: aload_0
/*    */     //   140: getfield d : I
/*    */     //   143: iconst_4
/*    */     //   144: imul
/*    */     //   145: invokestatic memIntBuffer : (JI)Ljava/nio/IntBuffer;
/*    */     //   148: astore #10
/*    */     //   150: aload_0
/*    */     //   151: aload #10
/*    */     //   153: iconst_0
/*    */     //   154: invokevirtual get : (I)I
/*    */     //   157: i2l
/*    */     //   158: putfield e : J
/*    */     //   161: aload_0
/*    */     //   162: aload_0
/*    */     //   163: getfield d : I
/*    */     //   166: newarray int
/*    */     //   168: putfield f : [I
/*    */     //   171: iconst_0
/*    */     //   172: istore #12
/*    */     //   174: aload_0
/*    */     //   175: getfield d : I
/*    */     //   178: istore #13
/*    */     //   180: iload #12
/*    */     //   182: iload #13
/*    */     //   184: if_icmpge -> 262
/*    */     //   187: aload_0
/*    */     //   188: getfield f : [I
/*    */     //   191: dup
/*    */     //   192: ifnonnull -> 202
/*    */     //   195: pop
/*    */     //   196: ldc ''
/*    */     //   198: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*    */     //   201: aconst_null
/*    */     //   202: iload #12
/*    */     //   204: invokestatic glGenTextures : ()I
/*    */     //   207: iastore
/*    */     //   208: sipush #3553
/*    */     //   211: aload_0
/*    */     //   212: getfield f : [I
/*    */     //   215: dup
/*    */     //   216: ifnonnull -> 226
/*    */     //   219: pop
/*    */     //   220: ldc ''
/*    */     //   222: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*    */     //   225: aconst_null
/*    */     //   226: iload #12
/*    */     //   228: iaload
/*    */     //   229: invokestatic glBindTexture : (II)V
/*    */     //   232: sipush #3553
/*    */     //   235: sipush #10241
/*    */     //   238: sipush #9729
/*    */     //   241: invokestatic glTexParameteri : (III)V
/*    */     //   244: sipush #3553
/*    */     //   247: sipush #10240
/*    */     //   250: sipush #9729
/*    */     //   253: invokestatic glTexParameteri : (III)V
/*    */     //   256: iinc #12, 1
/*    */     //   259: goto -> 180
/*    */     //   262: nop
/*    */     //   263: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   266: astore_3
/*    */     //   267: aload_1
/*    */     //   268: aload_2
/*    */     //   269: invokestatic closeFinally : (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
/*    */     //   272: goto -> 288
/*    */     //   275: astore_3
/*    */     //   276: aload_3
/*    */     //   277: astore_2
/*    */     //   278: aload_3
/*    */     //   279: athrow
/*    */     //   280: astore_3
/*    */     //   281: aload_1
/*    */     //   282: aload_2
/*    */     //   283: invokestatic closeFinally : (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
/*    */     //   286: aload_3
/*    */     //   287: athrow
/*    */     //   288: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     //   #23	-> 18
/*    */     //   #24	-> 25
/*    */     //   #25	-> 32
/*    */     //   #26	-> 39
/*    */     //   #27	-> 46
/*    */     //   #29	-> 53
/*    */     //   #30	-> 76
/*    */     //   #29	-> 92
/*    */     //   #32	-> 103
/*    */     //   #33	-> 113
/*    */     //   #34	-> 123
/*    */     //   #36	-> 133
/*    */     //   #37	-> 150
/*    */     //   #39	-> 161
/*    */     //   #40	-> 171
/*    */     //   #41	-> 187
/*    */     //   #42	-> 208
/*    */     //   #45	-> 232
/*    */     //   #46	-> 244
/*    */     //   #40	-> 256
/*    */     //   #48	-> 262
/*    */     //   #22	-> 266
/*    */     //   #49	-> 288
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	289	0	this	Leu/shoroa/bridge/b/a;
/*    */     //   15	248	3	stack	Lorg/lwjgl/system/MemoryStack;
/*    */     //   18	245	4	$i$a$-use-Gif$loadGif$1	I
/*    */     //   25	238	5	widthBuffer	Ljava/nio/IntBuffer;
/*    */     //   32	231	6	heightBuffer	Ljava/nio/IntBuffer;
/*    */     //   39	224	7	comp	Ljava/nio/IntBuffer;
/*    */     //   46	217	8	delays	Lorg/lwjgl3/PointerBuffer;
/*    */     //   53	210	9	thing	Ljava/nio/IntBuffer;
/*    */     //   103	160	11	gif	Ljava/nio/ByteBuffer;
/*    */     //   150	113	10	delayBuffer	Ljava/nio/IntBuffer;
/*    */     //   174	88	12	i	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	267	275	java/lang/Throwable
/*    */     //   9	267	280	finally
/*    */     //   275	280	280	finally
/*    */     //   280	281	280	finally } public final int a() {
/*    */     return this.d;
/*    */   } public final void a(float x, float y, float w, float h, float radius, float alpha, long d) {
/* 73 */     if (System.currentTimeMillis() - this.h >= d) {
/* 74 */       int i = this.g; this.g = i + 1;
/* 75 */       this.h = System.currentTimeMillis();
/* 76 */       if (this.g >= this.d) this.g = 0;
/*    */     
/*    */     } 
/* 79 */     GL11.glBindTexture(3553, a(this.g));
/* 80 */     d.a.a(x, y, w, h, radius, alpha);
/* 81 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); d.a(d.a, "Current Frame: " + this.g, x, y, "console", 14.0F, Color.WHITE, Color.BLACK, d.a.LEFT_TOP, 0.0F, 0.0F, 768, (Object)null);
/* 82 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); d.a(d.a, "Frames: " + a(), x, y + 14, "console", 14.0F, Color.WHITE, Color.BLACK, d.a.LEFT_TOP, 0.0F, 0.0F, 768, (Object)null);
/* 83 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); Intrinsics.checkNotNullExpressionValue(Color.BLACK, ""); d.a(d.a, "Current Texture: " + GL11.glGetInteger(32873), x, y + 28, "console", 14.0F, Color.WHITE, Color.BLACK, d.a.LEFT_TOP, 0.0F, 0.0F, 768, (Object)null);
/*    */   }
/*    */   
/*    */   public final int a(int frame) {
/*    */     if (this.f == null)
/*    */       Intrinsics.throwUninitializedPropertyAccessException(""); 
/*    */     return null[frame];
/*    */   }
/*    */   
/*    */   public final int b() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   public final int c() {
/*    */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */