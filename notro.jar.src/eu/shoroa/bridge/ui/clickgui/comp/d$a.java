/*     */ package eu.shoroa.bridge.ui.clickgui.comp;
/*     */ 
/*     */ import eu.shoroa.bridge.b.a.b;
/*     */ import eu.shoroa.bridge.b.b.d;
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.ui.b.d;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ final class a
/*     */   extends d
/*     */ {
/*     */   @NotNull
/*     */   private final b b;
/*     */   private final eu.shoroa.bridge.b.a.a c;
/*     */   
/*     */   @NotNull
/*     */   public final b a() {
/*     */     return this.b;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Object clone() {
/*     */     return super.clone();
/*     */   }
/*     */   
/*     */   public a(d this$0, b page, float x, float y, float w, float h) {
/* 124 */     super(x, y, w, h); this.b = page;
/* 125 */     this.c = eu.shoroa.bridge.b.a.a.a(a::b, a::c); } private static final Float b() { return Float.valueOf(180.0F); } private static final b c() { return b.LINEAR; }
/*     */   
/*     */   public void render(float mx, float my, float delta) {
/* 128 */     this.c.a(Intrinsics.areEqual(this.a.b(), this.b));
/*     */     
/* 130 */     if (Intrinsics.areEqual(this.a.b(), this.b)) {
/* 131 */       d.a(d.a, this, 12.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().c()), 0.0F, 8, null);
/* 132 */       d.a(d.a, this, 12.0F, d.a.a(eu.shoroa.bridge.d.e.a.a.k().d()).a(1.5F), 0.0F, 8, null);
/*     */     } 
/*     */     
/* 135 */     float iconSize = Math.min(getH() * 0.8F, 36.0F);
/* 136 */     float iconX = getX() + 10.0F;
/* 137 */     float iconY = getY() + (getH() - iconSize) / 2.0F;
/*     */     
/* 139 */     d.a.a(this.b.a(), iconX, iconY, iconSize, iconSize, 0.0F, 1.0F);
/* 140 */     d.b(d.a, this.b.b(), iconX + iconSize + 8.0F, getY() + getH() / 2.0F + 1.0F, "semibold", 16.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */   }
/*     */   
/*     */   public void click(float mx, float my, int button) {
/* 144 */     if (!(this.b instanceof c) && 
/* 145 */       d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null)) d.a(this.a, this.b); 
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\d$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */