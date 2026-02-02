/*    */ package eu.shoroa.bridge.b;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public final class b {
/*    */   public b(ByteBuffer gifBytes) {
/*  9 */     this.a = gifBytes;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.f = new int[0];
/*    */ 
/*    */     
/* 17 */     this.h = System.currentTimeMillis();
/*    */ 
/*    */     
/* 20 */     e();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final ByteBuffer a;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private int b;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private int c;
/*    */ 
/*    */ 
/*    */   
/*    */   private int d;
/*    */ 
/*    */ 
/*    */   
/*    */   private int[] e;
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private int[] f;
/*    */ 
/*    */ 
/*    */   
/*    */   private int g;
/*    */ 
/*    */ 
/*    */   
/*    */   private long h;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final void e() {
/*    */     // Byte code:
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
/*    */     //   20: invokevirtual mallocPointer : (I)Lorg/lwjgl3/PointerBuffer;
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
/*    */     //   41: invokevirtual mallocInt : (I)Ljava/nio/IntBuffer;
/*    */     //   44: astore #8
/*    */     //   46: aload_3
/*    */     //   47: iconst_1
/*    */     //   48: invokevirtual mallocInt : (I)Ljava/nio/IntBuffer;
/*    */     //   51: astore #9
/*    */     //   53: aload_0
/*    */     //   54: getfield a : Ljava/nio/ByteBuffer;
/*    */     //   57: aload #5
/*    */     //   59: aload #6
/*    */     //   61: aload #7
/*    */     //   63: aload #8
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
/*    */     //   104: aload #6
/*    */     //   106: iconst_0
/*    */     //   107: invokevirtual get : (I)I
/*    */     //   110: putfield b : I
/*    */     //   113: aload_0
/*    */     //   114: aload #7
/*    */     //   116: iconst_0
/*    */     //   117: invokevirtual get : (I)I
/*    */     //   120: putfield c : I
/*    */     //   123: aload_0
/*    */     //   124: aload #9
/*    */     //   126: iconst_0
/*    */     //   127: invokevirtual get : (I)I
/*    */     //   130: putfield d : I
/*    */     //   133: aload #5
/*    */     //   135: iconst_0
/*    */     //   136: invokevirtual get : (I)J
/*    */     //   139: aload_0
/*    */     //   140: getfield d : I
/*    */     //   143: invokestatic memIntBuffer : (JI)Ljava/nio/IntBuffer;
/*    */     //   146: astore #10
/*    */     //   148: aload_0
/*    */     //   149: iconst_0
/*    */     //   150: istore #12
/*    */     //   152: aload_0
/*    */     //   153: getfield d : I
/*    */     //   156: istore #13
/*    */     //   158: iload #13
/*    */     //   160: newarray int
/*    */     //   162: astore #14
/*    */     //   164: astore #15
/*    */     //   166: iload #12
/*    */     //   168: iload #13
/*    */     //   170: if_icmpge -> 198
/*    */     //   173: iload #12
/*    */     //   175: istore #16
/*    */     //   177: aload #14
/*    */     //   179: iload #16
/*    */     //   181: aload #10
/*    */     //   183: iload #16
/*    */     //   185: invokevirtual get : (I)I
/*    */     //   188: bipush #10
/*    */     //   190: imul
/*    */     //   191: iastore
/*    */     //   192: iinc #12, 1
/*    */     //   195: goto -> 166
/*    */     //   198: aload #15
/*    */     //   200: aload #14
/*    */     //   202: putfield f : [I
/*    */     //   205: aload_0
/*    */     //   206: aload_0
/*    */     //   207: getfield d : I
/*    */     //   210: newarray int
/*    */     //   212: putfield e : [I
/*    */     //   215: aload_0
/*    */     //   216: getfield b : I
/*    */     //   219: aload_0
/*    */     //   220: getfield c : I
/*    */     //   223: imul
/*    */     //   224: iconst_4
/*    */     //   225: imul
/*    */     //   226: istore #12
/*    */     //   228: iconst_0
/*    */     //   229: istore #13
/*    */     //   231: aload_0
/*    */     //   232: getfield d : I
/*    */     //   235: istore #14
/*    */     //   237: iload #13
/*    */     //   239: iload #14
/*    */     //   241: if_icmpge -> 401
/*    */     //   244: iload #12
/*    */     //   246: invokestatic memAlloc : (I)Ljava/nio/ByteBuffer;
/*    */     //   249: astore #16
/*    */     //   251: iload #13
/*    */     //   253: iload #12
/*    */     //   255: imul
/*    */     //   256: istore #17
/*    */     //   258: iconst_0
/*    */     //   259: istore #18
/*    */     //   261: iload #18
/*    */     //   263: iload #12
/*    */     //   265: if_icmpge -> 292
/*    */     //   268: aload #16
/*    */     //   270: iload #18
/*    */     //   272: aload #11
/*    */     //   274: iload #17
/*    */     //   276: iload #18
/*    */     //   278: iadd
/*    */     //   279: invokevirtual get : (I)B
/*    */     //   282: invokevirtual put : (IB)Ljava/nio/ByteBuffer;
/*    */     //   285: pop
/*    */     //   286: iinc #18, 1
/*    */     //   289: goto -> 261
/*    */     //   292: aload_0
/*    */     //   293: getfield e : [I
/*    */     //   296: dup
/*    */     //   297: ifnonnull -> 307
/*    */     //   300: pop
/*    */     //   301: ldc ''
/*    */     //   303: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*    */     //   306: aconst_null
/*    */     //   307: iload #13
/*    */     //   309: invokestatic glGenTextures : ()I
/*    */     //   312: iastore
/*    */     //   313: sipush #3553
/*    */     //   316: aload_0
/*    */     //   317: getfield e : [I
/*    */     //   320: dup
/*    */     //   321: ifnonnull -> 331
/*    */     //   324: pop
/*    */     //   325: ldc ''
/*    */     //   327: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*    */     //   330: aconst_null
/*    */     //   331: iload #13
/*    */     //   333: iaload
/*    */     //   334: invokestatic glBindTexture : (II)V
/*    */     //   337: sipush #3553
/*    */     //   340: iconst_0
/*    */     //   341: ldc 32856
/*    */     //   343: aload_0
/*    */     //   344: getfield b : I
/*    */     //   347: aload_0
/*    */     //   348: getfield c : I
/*    */     //   351: iconst_0
/*    */     //   352: sipush #6408
/*    */     //   355: sipush #5121
/*    */     //   358: aload #16
/*    */     //   360: invokestatic glTexImage2D : (IIIIIIIILjava/nio/ByteBuffer;)V
/*    */     //   363: sipush #3553
/*    */     //   366: sipush #10241
/*    */     //   369: sipush #9729
/*    */     //   372: invokestatic glTexParameteri : (III)V
/*    */     //   375: sipush #3553
/*    */     //   378: sipush #10240
/*    */     //   381: sipush #9729
/*    */     //   384: invokestatic glTexParameteri : (III)V
/*    */     //   387: aload #16
/*    */     //   389: checkcast java/nio/Buffer
/*    */     //   392: invokestatic memFree : (Ljava/nio/Buffer;)V
/*    */     //   395: iinc #13, 1
/*    */     //   398: goto -> 237
/*    */     //   401: aload #11
/*    */     //   403: invokestatic stbi_image_free : (Ljava/nio/ByteBuffer;)V
/*    */     //   406: nop
/*    */     //   407: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   410: astore_3
/*    */     //   411: aload_1
/*    */     //   412: aload_2
/*    */     //   413: invokestatic closeFinally : (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
/*    */     //   416: goto -> 432
/*    */     //   419: astore_3
/*    */     //   420: aload_3
/*    */     //   421: astore_2
/*    */     //   422: aload_3
/*    */     //   423: athrow
/*    */     //   424: astore_3
/*    */     //   425: aload_1
/*    */     //   426: aload_2
/*    */     //   427: invokestatic closeFinally : (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
/*    */     //   430: aload_3
/*    */     //   431: athrow
/*    */     //   432: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 0
/*    */     //   #25	-> 18
/*    */     //   #26	-> 25
/*    */     //   #27	-> 32
/*    */     //   #28	-> 39
/*    */     //   #29	-> 46
/*    */     //   #32	-> 53
/*    */     //   #33	-> 57
/*    */     //   #34	-> 59
/*    */     //   #35	-> 61
/*    */     //   #36	-> 63
/*    */     //   #37	-> 65
/*    */     //   #38	-> 67
/*    */     //   #31	-> 68
/*    */     //   #39	-> 76
/*    */     //   #31	-> 92
/*    */     //   #41	-> 103
/*    */     //   #42	-> 113
/*    */     //   #43	-> 123
/*    */     //   #45	-> 133
/*    */     //   #46	-> 148
/*    */     //   #48	-> 205
/*    */     //   #50	-> 215
/*    */     //   #51	-> 228
/*    */     //   #52	-> 244
/*    */     //   #53	-> 251
/*    */     //   #54	-> 258
/*    */     //   #55	-> 268
/*    */     //   #54	-> 286
/*    */     //   #58	-> 292
/*    */     //   #59	-> 313
/*    */     //   #60	-> 337
/*    */     //   #61	-> 352
/*    */     //   #60	-> 360
/*    */     //   #62	-> 363
/*    */     //   #63	-> 375
/*    */     //   #65	-> 387
/*    */     //   #51	-> 395
/*    */     //   #67	-> 401
/*    */     //   #68	-> 406
/*    */     //   #24	-> 410
/*    */     //   #69	-> 432
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	433	0	this	Leu/shoroa/bridge/b/b;
/*    */     //   15	392	3	stack	Lorg/lwjgl/system/MemoryStack;
/*    */     //   18	389	4	$i$a$-use-GifCape$loadGif$1	I
/*    */     //   25	382	5	delaysPtr	Lorg/lwjgl3/PointerBuffer;
/*    */     //   32	375	6	w	Ljava/nio/IntBuffer;
/*    */     //   39	368	7	h	Ljava/nio/IntBuffer;
/*    */     //   46	361	8	comp	Ljava/nio/IntBuffer;
/*    */     //   53	354	9	framesCount	Ljava/nio/IntBuffer;
/*    */     //   103	304	11	pixels	Ljava/nio/ByteBuffer;
/*    */     //   148	259	10	delaysBuffer	Ljava/nio/IntBuffer;
/*    */     //   228	179	12	frameSize	I
/*    */     //   231	170	13	i	I
/*    */     //   251	144	16	framePixels	Ljava/nio/ByteBuffer;
/*    */     //   258	137	17	startPos	I
/*    */     //   261	31	18	j	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	411	419	java/lang/Throwable
/*    */     //   9	411	424	finally
/*    */     //   419	424	424	finally
/*    */     //   424	425	424	finally
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void a() {
/* 72 */     long now = System.currentTimeMillis();
/* 73 */     if (now - this.h >= this.f[this.g]) {
/* 74 */       this.g = (this.g + 1) % this.d;
/* 75 */       this.h = now;
/*    */     } 
/*    */   }
/*    */   
/* 79 */   public final int b() { return this.g; } public final int a(int frame) {
/* 80 */     if (this.e == null) Intrinsics.throwUninitializedPropertyAccessException("");  return null[frame];
/*    */   }
/* 82 */   public final int c() { return this.b; } public final int d() {
/* 83 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */