/*     */ package eu.shoroa.bridge.ui.clickgui.comp;
/*     */ 
/*     */ import eu.shoroa.bridge.b.d;
/*     */ import eu.shoroa.bridge.d.e.a;
/*     */ import eu.shoroa.bridge.ui.b.d;
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
/*     */ final class b
/*     */   extends d
/*     */ {
/*     */   @NotNull
/*     */   private final b b;
/*     */   
/*     */   public b(d this$0, b page, float x, float y, float w, float h) {
/* 153 */     super(x, y, w, h); this.b = page; } @NotNull public final b a() { return this.b; } @NotNull public Object clone() { return super.clone(); }
/*     */    public void render(float mx, float my, float delta) {
/* 155 */     d.b(d.a, this.b.b(), getX(), getY() + getH() / 2.0F + 1.0F, "extrabold", 16.0F, a.a.k().e(), d.a.LEFT_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */   }
/*     */   
/*     */   public void click(float mx, float my, int button) {
/* 159 */     if (!(this.b instanceof c) && 
/* 160 */       d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null)) d.a(this.a, this.b); 
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\d$b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */