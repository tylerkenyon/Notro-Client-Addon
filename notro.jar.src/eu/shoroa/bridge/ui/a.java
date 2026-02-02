/*     */ package eu.shoroa.bridge.ui;
/*     */ 
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.feature.b.b;
/*     */ import java.awt.Color;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ 
/*     */ public final class a extends Screen {
/*     */   @Nullable
/*     */   private a a;
/*     */   
/*     */   @Nullable
/*  19 */   public final a a() { return this.a; } private boolean b; public final void a(a <set-?>) { this.a = <set-?>; }
/*  20 */   public final boolean b() { return this.b; } public final void a(boolean <set-?>) { this.b = <set-?>; }
/*  21 */    private final eu.shoroa.bridge.b.a.a c = eu.shoroa.bridge.b.a.a.a(a::j, a::k); @Nullable private b d; public final eu.shoroa.bridge.b.a.a c() { return this.c; } private static final Float j() { return Float.valueOf(180.0F); } private static final b k() { return b.LINEAR; } @Nullable
/*  22 */   public final b d() { return this.d; } public final void a(b <set-?>) { this.d = <set-?>; } @NotNull
/*  23 */   private final b e = new b(); @NotNull public final b e() { return this.e; }
/*     */ 
/*     */   
/*  26 */   private final float f = 5.0F; private float g; private boolean h; private float i; private boolean j;
/*  27 */   public final float f() { return this.g; } public final void a(float <set-?>) { this.g = <set-?>; }
/*  28 */   public final boolean g() { return this.h; } public final void b(boolean <set-?>) { this.h = <set-?>; }
/*  29 */   public final float h() { return this.i; } public final void b(float <set-?>) { this.i = <set-?>; }
/*  30 */   public final boolean i() { return this.j; } public final void c(boolean <set-?>) { this.j = <set-?>; }
/*     */   
/*     */   public void init() {
/*  33 */     this.a = a.a.a("Back", getWidth() / 2.0F - 80, getHeight() - 60.0F, 160.0F, 40.0F).b(null.a)
/*     */       
/*  35 */       .c("");
/*     */   }
/*     */   
/*     */   public void render(float mx, float my, float delta) {
/*  39 */     b.a.f(); this.b = (((b.a.f() != null) ? ((b.a.f().keyDown(eu.shoroa.bridge.d.d.a.b()) == true)) : false) || this.d != null);
/*  40 */     this.c.a(this.b);
/*     */ 
/*     */     
/*  43 */     Intrinsics.checkNotNull(BridgeClient.a.b()); BridgeClient.a.b().moduleManager().a(new Function1<b, Unit>(this, mx, my) { public final void a(b it) {
/*  44 */             Intrinsics.checkNotNullParameter(it, ""); if (it.b() && (this.a.d() == it || (this.$b >= it.l() && this.$b <= it.l() + it.n() && this.$c >= it.m() && this.$c <= it.m() + it.o())))
/*  45 */               d.a.a(new Function0<Unit>(it) { public final void a() {
/*  46 */                       Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.a(d.a, this.$a.l() - 4, this.$a.m() - 4, this.$a.n() + 8, this.$a.o() + 8, 8.0F, d.a.a(Color.WHITE).a(3.0F), 0.0F, 64, null);
/*     */                     } }
/*     */                 ); 
/*     */           } }
/*     */       );
/*  51 */     if (this.d != null) {
/*  52 */       Intrinsics.checkNotNull(this.d); b s = this.d;
/*  53 */       float snapThreshold = 6.0F;
/*  54 */       this.h = false;
/*  55 */       this.j = false;
/*     */ 
/*     */       
/*  58 */       Ref.FloatRef targetX = new Ref.FloatRef(); targetX.element = this.e.a(mx);
/*  59 */       Ref.FloatRef targetY = new Ref.FloatRef(); targetY.element = this.e.b(my);
/*     */ 
/*     */       
/*  62 */       if (Math.abs(targetX.element) < snapThreshold) { targetX.element = 0.0F; this.h = true; }
/*  63 */       else if (Math.abs(targetX.element + s.n() - getWidth()) < snapThreshold) { targetX.element = getWidth() - s.n(); this.h = true; }
/*     */       
/*  65 */       if (Math.abs(targetY.element) < snapThreshold) { targetY.element = 0.0F; this.j = true; }
/*  66 */       else if (Math.abs(targetY.element + s.o() - getHeight()) < snapThreshold) { targetY.element = getHeight() - s.o(); this.j = true; }
/*     */ 
/*     */       
/*  69 */       Intrinsics.checkNotNull(BridgeClient.a.b()); BridgeClient.a.b().moduleManager().a(new Function1<b, Unit>(s, targetX, snapThreshold, this, targetY) { public final void a(b other) {
/*  70 */               Intrinsics.checkNotNullParameter(other, ""); if (other != this.$a && other.b()) {
/*     */                 
/*  72 */                 if (Math.abs(this.$b.element - other.l() + other.n()) < this.$c) { this.$b.element = other.l() + other.n(); this.d.b(true); }
/*  73 */                  if (Math.abs(this.$b.element + this.$a.n() - other.l()) < this.$c) { this.$b.element = other.l() - this.$a.n(); this.d.b(true); }
/*  74 */                  if (Math.abs(this.$b.element - other.l()) < this.$c) { this.$b.element = other.l(); this.d.b(true); }
/*     */ 
/*     */                 
/*  77 */                 if (Math.abs(this.$e.element - other.m() + other.o()) < this.$c) { this.$e.element = other.m() + other.o(); this.d.c(true); }
/*  78 */                  if (Math.abs(this.$e.element + this.$a.o() - other.m()) < this.$c) { this.$e.element = other.m() - this.$a.o(); this.d.c(true); }
/*  79 */                  if (Math.abs(this.$e.element - other.m()) < this.$c) { this.$e.element = other.m(); this.d.c(true); }
/*     */               
/*     */               } 
/*     */             } }
/*     */         );
/*  84 */       s.a(targetX.element);
/*  85 */       s.b(targetY.element);
/*     */ 
/*     */       
/*  88 */       if (this.h || this.j) b(s);
/*     */     
/*     */     } 
/*  91 */     b.INSTANCE.c(1.0F - 0.5F * this.c.a());
/*  92 */     if (this.a != null) { this.a.render(mx, my, delta); } else {  }
/*  93 */      b.INSTANCE.c(1.0F);
/*     */   }
/*     */   
/*     */   private final void b(b s) {
/*  97 */     d.a.a(new Function0<Unit>(this, s) { public final void a() {
/*  98 */             if (this.a.g()) d.a(d.a, this.$b.l(), 0.0F, 1.0F, this.a.getHeight(), 2.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().e()), 0.0F, 64, null); 
/*  99 */             if (this.a.i()) d.a(d.a, 0.0F, this.$b.m(), this.a.getWidth(), 1.0F, 2.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().e()), 0.0F, 64, null); 
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/* 104 */   public void click(float mx, float my, int button) { if (BridgeClient.a.b() != null && BridgeClient.a.b().moduleManager() != null) { BridgeClient.a.b().moduleManager().a(new Function1<b, Unit>(mx, my, button, this) {
/* 105 */             public final void a(b it) { Intrinsics.checkNotNullParameter(it, ""); boolean hovered = (this.$a >= it.l() && this.$a <= it.l() + it.n() && this.$b >= it.m() && this.$b <= it.m() + it.o());
/* 106 */               if (hovered && this.$c == 0 && it.b()) {
/* 107 */                 this.d.a(it);
/* 108 */                 this.d.e().a(this.$a, this.$b, it.l(), it.m());
/*     */               }  } }); }
/*     */     else { BridgeClient.a.b().moduleManager(); }
/* 111 */      if (!this.b) if (this.a != null) { this.a.click(mx, my, button); }
/*     */       else
/*     */       {  }
/*     */         }
/* 115 */   public void release(float mx, float my, int button) { this.d = null;
/* 116 */     this.h = false;
/* 117 */     this.j = false;
/* 118 */     if (!this.b) if (this.a != null) { this.a.release(mx, my, button); }
/*     */       else
/*     */       {  }
/*     */         } public void onKey(int code, char char) {
/* 122 */     super.onKey(code, char);
/* 123 */     if (char == '[')
/* 124 */       if (BridgeClient.a.b() != null && BridgeClient.a.b().moduleManager() != null) { BridgeClient.a.b().moduleManager().a(null.a); } else { BridgeClient.a.b().moduleManager(); }
/*     */        
/*     */   }
/*     */   
/*     */   public void exit() {}
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */