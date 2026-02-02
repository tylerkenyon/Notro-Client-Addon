/*     */ package eu.shoroa.bridge.ui.b;
/*     */ 
/*     */ import eu.shoroa.bridge.b.a.b;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import java.awt.Color;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ final class a
/*     */   extends d
/*     */ {
/*     */   @NotNull
/*     */   private final String a;
/*     */   private final boolean b;
/*     */   @NotNull
/*     */   private final Function0<Unit> c;
/*     */   private boolean d;
/*     */   private final eu.shoroa.bridge.b.a.a e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   
/*     */   @NotNull
/*     */   public Object clone() {
/*  60 */     return super.clone(); } @NotNull
/*  61 */   public final String a() { return this.a; }
/*  62 */   public final boolean b() { return this.b; } @NotNull
/*  63 */   public final Function0<Unit> c() { return this.c; }
/*  64 */   public a(String icon, boolean togglable, Function0<Unit> action) { super(0.0F, 0.0F, 0.0F, 0.0F); this.a = icon; this.b = togglable;
/*     */     this.c = action;
/*  66 */     this.e = eu.shoroa.bridge.b.a.a.a(a::d, a::e); } private static final Float d() { return Float.valueOf(0.0F); } private static final b e() { return b.CUBIC_IN_OUT; }
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(float mx, float my, float delta) {
/*  71 */     this.e.a(d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/*     */     
/*  73 */     Color color = this.d ? eu.shoroa.bridge.d.e.a.a.k().f() : eu.shoroa.bridge.d.e.a.a.k().d();
/*  74 */     float alpha = this.d ? 1.0F : this.e.a();
/*     */ 
/*     */     
/*  77 */     if (alpha > 0.01F) {
/*  78 */       float corner = (
/*  79 */         this.f && this.g) ? 12.0F : (
/*  80 */         this.f ? 12.0F : (
/*  81 */         this.g ? 12.0F : 
/*  82 */         0.0F));
/*     */ 
/*     */       
/*  85 */       d.a(d.a, 
/*  86 */           getX(), getY(), getW(), getH(), 
/*  87 */           corner, 
/*  88 */           d.a.a(eu.shoroa.bridge.d.e.a.a.a(color, alpha)), 0.0F, 64, null);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  93 */     d.a.a(
/*  94 */         this.a, 
/*  95 */         getX() + 6.0F, 
/*  96 */         getY() + 6.0F, 
/*  97 */         getW() - 12.0F, 
/*  98 */         getH() - 12.0F, 
/*  99 */         1.0F, 
/* 100 */         1.0F, 
/* 101 */         eu.shoroa.bridge.d.e.a.a.k().e());
/*     */   }
/*     */ 
/*     */   
/*     */   public void click(float mx, float my, int button) {
/* 106 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 107 */       if (this.b) {
/* 108 */         this.d = !this.d;
/*     */       } else {
/* 110 */         this.c.invoke();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */   
/*     */   public final void a(float nx, float ny, float nw, float nh, boolean first, boolean last) {
/* 118 */     setX(nx);
/* 119 */     setY(ny);
/* 120 */     setW(nw);
/* 121 */     setH(nh);
/* 122 */     this.f = first;
/* 123 */     this.g = last;
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\b$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */