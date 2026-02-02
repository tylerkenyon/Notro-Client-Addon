/*     */ package eu.shoroa.bridge.ui.clickgui.comp.a;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final String b;
/*     */   @NotNull
/*     */   private final String c;
/*     */   private final eu.shoroa.bridge.b.a.a d;
/*     */   
/*     */   @NotNull
/*     */   public Object clone() {
/*     */     return super.clone();
/*     */   }
/*     */   
/*     */   public a(a this$0, String name, String type, float x, float y, float w, float h) {
/* 219 */     super(x, y, w, h); this.b = name; this.c = type;
/* 220 */     this.d = eu.shoroa.bridge.b.a.a.a(a::a, a::b); } private static final Float a() { return Float.valueOf(180.0F); } private static final b b() { return b.LINEAR; }
/*     */    public void render(float mx, float my, float delta) {
/* 222 */     this.d.a(Intrinsics.areEqual(a.a(this.a), this.c));
/* 223 */     Intrinsics.checkNotNullExpressionValue(this.d.a(eu.shoroa.bridge.d.e.a.a.k().c(), eu.shoroa.bridge.d.e.a.a.k().d()), ""); d.a(d.a, getX() - 10, getY(), getW() + 10, getH() - 10, 2.0F, d.a.a(this.d.a(eu.shoroa.bridge.d.e.a.a.k().c(), eu.shoroa.bridge.d.e.a.a.k().d())), 0.0F, 64, null);
/* 224 */     d.b(d.a, this.b, getX() + getW() / 2.0F - 4.0F, getY() + getH() - 20.0F + 2.0F, "semibold", 14.0F, eu.shoroa.bridge.d.e.a.a.k().e(), d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*     */   } public void click(float mx, float my, int button) {
/* 226 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && !Intrinsics.areEqual(a.a(this.a), this.c)) a.a(this.a, this.c); 
/*     */   }
/*     */   
/*     */   public void release(float mx, float my, int button) {}
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\a\a$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */