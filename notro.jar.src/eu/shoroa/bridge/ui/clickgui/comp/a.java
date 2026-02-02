/*     */ package eu.shoroa.bridge.ui.clickgui.comp;
/*     */ 
/*     */ import java.awt.datatransfer.DataFlavor;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.HashMap;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.stb.STBImage;
/*     */ 
/*     */ @SourceDebugExtension({"SMAP\nElementScreenshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementScreenshot.kt\neu/shoroa/bridge/ui/clickgui/comp/ElementScreenshot\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1864#2,3:200\n1855#2,2:203\n*S KotlinDebug\n*F\n+ 1 ElementScreenshot.kt\neu/shoroa/bridge/ui/clickgui/comp/ElementScreenshot\n*L\n111#1:200,3\n133#1:203,2\n*E\n"})
/*     */ public final class a extends d {
/*     */   @NotNull
/*     */   private final File a;
/*     */   private final float b;
/*     */   private final float c;
/*     */   @NotNull
/*     */   private final Function1<File, Unit> d;
/*     */   
/*     */   @NotNull
/*  25 */   public Object clone() { return super.clone(); } @NotNull private final Function1<File, Unit> e; @NotNull private final List<eu.shoroa.bridge.ui.b.a> f; @Nullable private Integer g; @NotNull private final ConcurrentLinkedQueue<Function0<Unit>> h; private boolean i; @NotNull
/*  26 */   public final File a() { return this.a; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a(File file, float x, float y, float w, float h, float buttonSize, float fontSize, Function1<File, Unit> onDelete, Function1<File, Unit> onUpload) {
/*  35 */     super(x, y, w, h); this.a = file; this.b = buttonSize; this.c = fontSize; this.d = onDelete;
/*     */     this.e = onUpload;
/*  37 */     this.f = new ArrayList<>();
/*  38 */     this.g = (Integer)eu.shoroa.bridge.b.d.a.a.a().get(this.a.getAbsolutePath());
/*  39 */     this.h = new ConcurrentLinkedQueue<>();
/*     */ 
/*     */ 
/*     */     
/*  43 */     this.f.add(eu.shoroa.bridge.ui.b.a.a.a("", 0.0F, 0.0F, this.b, this.b)
/*  44 */         .c("").b(new Function0<Unit>(this) { public final void a() { a.a(this.a, "delete"); } }));
/*  45 */     this.f.add(eu.shoroa.bridge.ui.b.a.a.a("", 0.0F, 0.0F, this.b, this.b)
/*  46 */         .c("").b(new Function0<Unit>(this) { public final void a() { a.a(this.a, "copy"); } }));
/*  47 */     this.f.add(eu.shoroa.bridge.ui.b.a.a.a("", 0.0F, 0.0F, this.b, this.b)
/*  48 */         .c("").b(new Function0<Unit>(this) { public final void a() { a.a(this.a, "upload"); }
/*     */              }
/*     */         ));
/*     */   }
/*     */   public void render(float mx, float my, float delta) {
/*  53 */     if (this.g == null && !this.i) {
/*  54 */       this.i = true;
/*  55 */       ThreadsKt.thread$default(false, false, null, null, 0, new Function0<Unit>(this) { public final void a() {
/*     */               try {
/*  57 */                 int[] width = new int[1];
/*  58 */                 int[] height = new int[1];
/*  59 */                 int[] channels = new int[1];
/*  60 */                 ByteBuffer byteBuffer1 = STBImage.stbi_load(this.a.a().getAbsolutePath(), width, height, channels, 4); if (byteBuffer1 == null) {
/*  61 */                   throw new RuntimeException("Failed to load image: " + this.a.a().getName());
/*     */                 }
/*     */                 ByteBuffer buffer = byteBuffer1;
/*  64 */                 a.a(this.a).add(new Function0<Unit>(width, height, buffer, this.a) {
/*     */                       public final void a() { try {
/*  66 */                           int texId = GL11.glGenTextures();
/*  67 */                           GL11.glBindTexture(3553, texId);
/*  68 */                           GL11.glTexParameteri(3553, 10241, 9729);
/*  69 */                           GL11.glTexParameteri(3553, 10240, 9729);
/*  70 */                           GL11.glTexImage2D(
/*  71 */                               3553, 0, 6408, 
/*  72 */                               this.$a[0], this.$b[0], 0, 6408, 
/*  73 */                               5121, this.$c);
/*     */                           
/*  75 */                           STBImage.stbi_image_free(this.$c);
/*  76 */                           a.a(this.d, Integer.valueOf(texId));
/*  77 */                           HashMap<String, Integer> hashMap = eu.shoroa.bridge.b.d.a.a.a(); Intrinsics.checkNotNullExpressionValue(this.d.a().getAbsolutePath(), ""); String str = this.d.a().getAbsolutePath(); Integer integer = Integer.valueOf(texId); hashMap.put(str, integer);
/*  78 */                         } catch (Exception e) {
/*  79 */                           System.out.println("GL upload failed: " + e.getMessage());
/*  80 */                           STBImage.stbi_image_free(this.$c);
/*     */                         }  }
/*     */                     });
/*  83 */               } catch (Exception e) {
/*  84 */                 System.out.println("Failed to load screenshot " + this.a.a().getName() + ": " + e.getMessage());
/*     */               } 
/*     */             } }
/*     */           31, null);
/*     */     } 
/*     */     
/*  90 */     while (!this.h.isEmpty()) {
/*  91 */       if ((Function0)this.h.poll() != null) { ((Function0)this.h.poll()).invoke(); continue; }  (Function0)this.h.poll();
/*     */     } 
/*     */ 
/*     */     
/*  95 */     if (this.g != null) {
/*  96 */       Intrinsics.checkNotNull(this.g); GL11.glBindTexture(3553, this.g.intValue());
/*  97 */       d.a.a(getX(), getY(), getW(), getH(), 8.0F, 1.0F);
/*     */     } else {
/*  99 */       d.a(d.a, getX(), getY(), getW(), getH(), 8.0F, d.a.a(new Color(50, 50, 50)), 0.0F, 64, null);
/*     */     } 
/*     */ 
/*     */     
/* 103 */     a(mx, my);
/* 104 */     b();
/*     */   }
/*     */   
/*     */   private final void a(float mx, float my) {
/* 108 */     float iconGap = 8.0F;
/* 109 */     float startX = getX() + 10.0F;
/*     */     
/* 111 */     Iterable<eu.shoroa.bridge.ui.b.a> $this$forEachIndexed$iv = this.f; int $i$f$forEachIndexed = 0;
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
/* 200 */     int index$iv = 0;
/* 201 */     Iterator<eu.shoroa.bridge.ui.b.a> iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  eu.shoroa.bridge.ui.b.a a1 = (eu.shoroa.bridge.ui.b.a)item$iv; int i = j, $i$a$-forEachIndexed-ElementScreenshot$renderButtons$1 = 0; a1.setX(startX + i * (this.b + iconGap)); a1.setY(getY() + 5.0F); a1.setW(this.b); a1.setH(this.b); }
/*     */      } public void click(float mx, float my, int button) { Iterable<eu.shoroa.bridge.ui.b.a> $this$forEach$iv = this.f; int $i$f$forEach = 0;
/* 203 */     Iterator<eu.shoroa.bridge.ui.b.a> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); eu.shoroa.bridge.ui.b.a it = (eu.shoroa.bridge.ui.b.a)element$iv; int $i$a$-forEach-ElementScreenshot$click$1 = 0;
/*     */       if (d.hovered$default((d)it, 0.0F, 0.0F, 0.0F, 0.0F, 15, null)) {
/*     */         it.click(mx, my, button);
/*     */         return;
/*     */       }  }
/*     */     
/*     */     float f = getX();
/*     */     if ((mx <= getX() + getW()) ? ((f <= mx)) : false) {
/*     */       f = getY();
/*     */       if ((my <= getY() + getH()) ? ((f <= my)) : false)
/*     */         try {
/*     */           Desktop.getDesktop().open(this.a);
/*     */         } catch (Exception exception) {} 
/*     */     }  }
/*     */ 
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */   
/*     */   private final void b() {
/*     */     Intrinsics.checkNotNullExpressionValue(this.a.getName(), "");
/*     */     String str1 = this.a.getName();
/*     */     boolean bool = false;
/*     */     byte b = 27;
/*     */     Intrinsics.checkNotNullExpressionValue(str1.substring(bool, b), "");
/*     */     String truncated = (this.a.getName().length() > 30) ? (str1.substring(bool, b) + "...") : this.a.getName();
/*     */     Intrinsics.checkNotNull(truncated);
/*     */     d.b(d.a, truncated, getX() + getW() / 2, getY() + getH() - 20.0F, "regular", this.c, new Color(180, 180, 180), d.a.CENTER_TOP, 0.0F, 0.0F, 384, null);
/*     */   }
/*     */   
/*     */   private final void a(String action) {
/*     */     String str = action;
/*     */     switch (str.hashCode()) {
/*     */       case -838595071:
/*     */         if (!str.equals("upload"))
/*     */           break; 
/*     */         this.e.invoke(this.a);
/*     */         break;
/*     */       case 3059573:
/*     */         if (!str.equals("copy"))
/*     */           break; 
/*     */         c();
/*     */         break;
/*     */       case -1335458389:
/*     */         if (str.equals("delete")) {
/*     */           this.d.invoke(this.a);
/*     */           d();
/*     */         } 
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void c() {
/*     */     ThreadsKt.thread$default(false, false, null, null, 0, new Function0<Unit>(this) {
/*     */           public final void a() {
/*     */             try {
/*     */               BufferedImage img = ImageIO.read(this.a.a());
/*     */               a transferable = new a(img);
/*     */               Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transferable, null);
/*     */             } catch (Exception e) {
/*     */               System.out.println("Failed to copy screenshot: " + e.getMessage());
/*     */             } 
/*     */           }
/*     */           
/*     */           public static final class a implements Transferable {
/*     */             a(BufferedImage $img) {}
/*     */             
/*     */             @NotNull
/*     */             public DataFlavor[] a() {
/*     */               DataFlavor[] arrayOfDataFlavor = new DataFlavor[1];
/*     */               arrayOfDataFlavor[0] = DataFlavor.imageFlavor;
/*     */               return arrayOfDataFlavor;
/*     */             }
/*     */             
/*     */             public boolean a(DataFlavor flavor) {
/*     */               Intrinsics.checkNotNullParameter(flavor, "");
/*     */               return Intrinsics.areEqual(flavor, DataFlavor.imageFlavor);
/*     */             }
/*     */             
/*     */             @NotNull
/*     */             public Object b(DataFlavor flavor) {
/*     */               Intrinsics.checkNotNullParameter(flavor, "");
/*     */               if (Intrinsics.areEqual(flavor, DataFlavor.imageFlavor)) {
/*     */                 Intrinsics.checkNotNullExpressionValue(this.a, "");
/*     */                 return this.a;
/*     */               } 
/*     */               throw new UnsupportedOperationException("Unsupported flavor");
/*     */             }
/*     */           }
/*     */         }31, null);
/*     */   }
/*     */   
/*     */   private final void d() {
/*     */     try {
/*     */       if (this.g != null) {
/*     */         int it = this.g.intValue(), $i$a$-let-ElementScreenshot$deleteScreenshot$1 = 0;
/*     */         GL11.glDeleteTextures(it);
/*     */         (Integer)eu.shoroa.bridge.b.d.a.a.a().remove(this.a.getAbsolutePath());
/*     */       } else {
/*     */       
/*     */       } 
/*     */       if (this.a.exists())
/*     */         this.a.delete(); 
/*     */     } catch (Exception e) {
/*     */       System.out.println("Failed to delete screenshot " + this.a.getName() + ": " + e.getMessage());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */