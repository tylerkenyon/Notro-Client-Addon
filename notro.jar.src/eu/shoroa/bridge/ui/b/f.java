/*     */ package eu.shoroa.bridge.ui.b;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\f\n\002\b\f\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\005\030\000 \0162\0020\001:\001\016B/\022\006\020\005\032\0020\f\022\006\020\006\032\0020\004\022\006\020\b\032\0020\004\022\006\020\r\032\0020\004\022\006\020-\032\0020\004¢\006\004\b.\020/J\017\020\002\032\0020\000H\007¢\006\004\b\002\020\003J'\020\n\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\007H\026¢\006\004\b\n\020\013J/\020\016\032\0020\f2\006\020\005\032\0020\f2\006\020\006\032\0020\f2\006\020\b\032\0020\0042\006\020\r\032\0020\004H\002¢\006\004\b\016\020\017J\027\020\016\032\0020\0002\006\020\005\032\0020\007H\007¢\006\004\b\016\020\020J#\020\022\032\0020\0002\022\020\005\032\016\022\004\022\0020\000\022\004\022\0020\t0\021H\007¢\006\004\b\022\020\023J#\020\016\032\0020\0002\022\020\005\032\016\022\004\022\0020\000\022\004\022\0020\t0\021H\007¢\006\004\b\016\020\023J\037\020\025\032\0020\t2\006\020\005\032\0020\0072\006\020\006\032\0020\024H\026¢\006\004\b\025\020\026J\027\020\002\032\0020\0002\006\020\005\032\0020\fH\007¢\006\004\b\002\020\027J'\020\030\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\007H\026¢\006\004\b\030\020\013J'\020\031\032\0020\t2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\b\032\0020\004H\026¢\006\004\b\031\020\032R\026\020\016\032\0020\0078\002@\002X\016¢\006\006\n\004\b\033\020\034R\024\020\022\032\0020\f8\002X\004¢\006\006\n\004\b\022\020\035R\"\020\002\032\0020\f8\007@\007X\016¢\006\022\n\004\b\036\020\035\032\004\b\022\020\037\"\004\b\022\020 R\030\020$\032\006*\0020!0!8\002X\004¢\006\006\n\004\b\"\020#R\026\020%\032\0020\0078\002@\002X\016¢\006\006\n\004\b\002\020\034R\"\020(\032\016\022\004\022\0020\000\022\004\022\0020\t0\0218\002@\002X\016¢\006\006\n\004\b&\020'R\"\020\036\032\016\022\004\022\0020\000\022\004\022\0020\t0\0218\002@\002X\016¢\006\006\n\004\b)\020'R\026\020\033\032\0020\f8\002@\002X\016¢\006\006\n\004\b$\020\035R\026\020+\032\0020*8\002@\002X\016¢\006\006\n\004\b+\020,R\026\020\"\032\0020*8\002@\002X\016¢\006\006\n\004\b%\020,R\"\020)\032\0020\f8\007@\007X\016¢\006\022\n\004\b(\020\035\032\004\b\016\020\037\"\004\b\016\020 "}, d2 = {"Leu/shoroa/bridge/ui/b/f;", "Leu/shoroa/bridge/ui/b/d;", "c", "()Leu/shoroa/bridge/ui/b/f;", "", "p0", "p1", "", "p2", "", "click", "(FFI)V", "", "p3", "a", "(Ljava/lang/String;Ljava/lang/String;FF)Ljava/lang/String;", "(I)Leu/shoroa/bridge/ui/b/f;", "Lkotlin/Function1;", "b", "(Lkotlin/jvm/functions/Function1;)Leu/shoroa/bridge/ui/b/f;", "", "onKey", "(IC)V", "(Ljava/lang/String;)Leu/shoroa/bridge/ui/b/f;", "release", "render", "(FFF)V", "h", "I", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "Leu/shoroa/bridge/b/a/a;", "j", "Leu/shoroa/bridge/b/a/a;", "d", "e", "l", "Lkotlin/jvm/functions/Function1;", "f", "k", "", "i", "Z", "p4", "<init>", "(Ljava/lang/String;FFFF)V"})
/*     */ public final class f extends d { @NotNull
/*     */   public static final a a = new a(null); @NotNull
/*     */   private final String b; private int c; @NotNull
/*     */   private String d; private boolean e; @NotNull
/*     */   private String f; @NotNull
/*     */   private String g; private int h; private boolean i; private final eu.shoroa.bridge.b.a.a j; @NotNull
/*     */   private Function1<? super f, Unit> k;
/*     */   @NotNull
/*     */   private Function1<? super f, Unit> l;
/*     */   
/*     */   @NotNull
/*     */   public Object clone() {
/*  14 */     return super.clone();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public f(String display, float x, float y, float h, float w) {
/*  20 */     super(x, y, h, w);
/*     */     
/*     */     this.b = display;
/*  23 */     this.c = 40;
/*  24 */     this.d = "";
/*     */ 
/*     */ 
/*     */     
/*  28 */     this.f = "";
/*  29 */     this.g = "";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  34 */     this.j = eu.shoroa.bridge.b.a.a.a(f::d, f::e);
/*     */ 
/*     */     
/*  37 */     this.k = null.a;
/*  38 */     this.l = null.a;
/*     */   }
/*     */   @NotNull @JvmName(name = "a") public final String a() { return this.f; }
/*  41 */   @JvmName(name = "a") public final void a(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, ""); this.f = <set-?>; } @NotNull @JvmName(name = "b") public final String b() { return this.g; } public void render(float mx, float my, float delta) { this.j.a(this.i);
/*  42 */     Color borderColor = this.j.a(eu.shoroa.bridge.d.e.a.a.k().d(), eu.shoroa.bridge.d.e.a.a.k().f());
/*     */ 
/*     */     
/*  45 */     d.a(d.a, this, 10.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 8, null);
/*     */ 
/*     */     
/*  48 */     b.INSTANCE.e();
/*     */     
/*  50 */     float paddingLeft = 28.0F;
/*  51 */     float paddingRight = this.e ? 36.0F : 10.0F;
/*  52 */     float textAreaWidth = getW() - paddingLeft - paddingRight;
/*  53 */     String font = "mono semibold";
/*  54 */     float size = 16.0F;
/*     */ 
/*     */     
/*  57 */     d.a.a(
/*  58 */         "search", 
/*  59 */         getX() + 8.0F, 
/*  60 */         getY() + getH() / 2.0F - 8.0F, 
/*  61 */         16.0F, 
/*  62 */         16.0F, 
/*  63 */         1.0F, 
/*  64 */         1.0F, 
/*  65 */         eu.shoroa.bridge.d.e.a.a.k().e());
/*     */ 
/*     */ 
/*     */     
/*  69 */     boolean isEmpty = (((CharSequence)this.f).length() == 0);
/*  70 */     String displayText = (isEmpty && !this.i) ? this.d : this.f;
/*  71 */     Color textColor = (isEmpty && !this.i) ? 
/*  72 */       eu.shoroa.bridge.d.e.a.a.a(eu.shoroa.bridge.d.e.a.a.k().e(), 0.5F) : 
/*     */       
/*  74 */       eu.shoroa.bridge.d.e.a.a.k().e();
/*     */     
/*  76 */     String clippedText = a(displayText, font, size, textAreaWidth);
/*     */     
/*  78 */     d.b(d.a, 
/*  79 */         clippedText, 
/*  80 */         getX() + paddingLeft, 
/*  81 */         getY() + getH() / 2.0F + 1.0F, 
/*  82 */         font, 
/*  83 */         size, 
/*  84 */         textColor, 
/*  85 */         d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */ 
/*     */ 
/*     */     
/*  89 */     if (this.i) {
/*  90 */       float blink = (float)(System.currentTimeMillis() % 800L) / 800.0F;
/*  91 */       if (blink < 0.5F) {
/*  92 */         float cursorOffset = d.a.a(StringsKt.take(this.f, this.h), font, size);
/*  93 */         float cursorX = getX() + paddingLeft + cursorOffset;
/*  94 */         if (cursorX <= getX() + getW() - paddingRight) {
/*  95 */           d.a(d.a, 
/*  96 */               cursorX, 
/*  97 */               getY() + 8.0F, 
/*  98 */               2.0F, 
/*  99 */               getH() - 16.0F, 
/* 100 */               0.0F, 
/* 101 */               d.a.a(eu.shoroa.bridge.d.e.a.a.k().e()), 0.0F, 64, null);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 108 */     if (this.e) {
/* 109 */       d.a.a(
/* 110 */           "check", 
/* 111 */           getX() + getW() - 24.0F, 
/* 112 */           getY() + getH() / 2.0F - 8.0F, 
/* 113 */           16.0F, 
/* 114 */           16.0F, 
/* 115 */           1.0F, 
/* 116 */           1.0F, 
/* 117 */           eu.shoroa.bridge.d.e.a.a.k().f());
/*     */     }
/*     */ 
/*     */     
/* 121 */     b.INSTANCE.f(); }
/*     */   @JvmName(name = "b") public final void b(String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "");
/*     */     this.g = <set-?>; }
/*     */   private static final Float d() { return Float.valueOf(200.0F); }
/* 125 */   private static final b e() { return b.CUBIC_IN_OUT; } public void click(float mx, float my, int button) { this.i = (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0);
/* 126 */     if (this.i) this.h = this.f.length();  }
/*     */ 
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */   
/*     */   public void onKey(int code, char char) {
/* 132 */     if (!this.i)
/*     */       return; 
/* 134 */     int i = code;
/* 135 */     if (i == eu.shoroa.bridge.d.d.a.e())
/* 136 */     { if (this.h > 0 && ((((CharSequence)this.f).length() > 0))) {
/* 137 */         String str = this.f; int k = this.h - 1, m = this.h; this.f = StringsKt.removeRange(str, k, m).toString();
/* 138 */         int j = this.h; this.h = j + -1;
/* 139 */         this.l.invoke(this);
/*     */       }
/*     */        }
/*     */     
/* 143 */     else if (i == eu.shoroa.bridge.d.d.a.f())
/* 144 */     { this.g = this.f;
/* 145 */       this.i = false;
/* 146 */       this.k.invoke(this); }
/*     */     
/* 148 */     else if (i == eu.shoroa.bridge.d.d.a.g()) { this.h = Math.max(0, this.h - 1); }
/* 149 */     else if (i == eu.shoroa.bridge.d.d.a.h()) { this.h = Math.min(this.f.length(), this.h + 1); }
/*     */     else
/* 151 */     { boolean validChar = (char != '' && char != '§' && Intrinsics.compare(char, 32) >= 0);
/* 152 */       if (validChar && this.f.length() < this.c) {
/* 153 */         Intrinsics.checkNotNullExpressionValue(this.f.substring(0, this.h), ""); Intrinsics.checkNotNullExpressionValue(this.f.substring(this.h), ""); this.f = this.f.substring(0, this.h) + this.f.substring(0, this.h) + char;
/* 154 */         int j = this.h; this.h = j + 1;
/* 155 */         this.l.invoke(this);
/*     */       }  }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final String a(String text, String font, float size, float maxWidth) {
/* 163 */     if (d.a.a(text, font, size) <= maxWidth) return text; 
/* 164 */     String clipped = text;
/* 165 */     while (((((CharSequence)clipped).length() > 0)) && d.a.a(clipped + "…", font, size) > maxWidth) {
/* 166 */       clipped = StringsKt.dropLast(clipped, 1);
/*     */     }
/* 168 */     return clipped + "…";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final f c(String value) {
/* 173 */     Intrinsics.checkNotNullParameter(value, ""); this.d = value;
/* 174 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final f a(int value) {
/* 178 */     this.c = value;
/* 179 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final f c() {
/* 183 */     this.e = true;
/* 184 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final f a(Function1<? super f, Unit> callback) {
/* 188 */     Intrinsics.checkNotNullParameter(callback, ""); this.k = callback;
/* 189 */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final f b(Function1<? super f, Unit> callback) {
/* 194 */     Intrinsics.checkNotNullParameter(callback, ""); this.l = callback;
/* 195 */     return this;
/*     */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\f\020\rJ7\020\n\032\0020\t2\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\0042\006\020\b\032\0020\004H\007¢\006\004\b\n\020\013"}, d2 = {"Leu/shoroa/bridge/ui/b/f$a;", "", "", "p0", "", "p1", "p2", "p3", "p4", "Leu/shoroa/bridge/ui/b/f;", "a", "(Ljava/lang/String;FFFF)Leu/shoroa/bridge/ui/b/f;", "<init>", "()V"})
/*     */   public static final class a { private a() {} @NotNull
/*     */     public final f a(String display, float x, float y, float h, float w) {
/* 199 */       Intrinsics.checkNotNullParameter(display, ""); return new f(display, x, y, h, w);
/*     */     } }
/*     */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */