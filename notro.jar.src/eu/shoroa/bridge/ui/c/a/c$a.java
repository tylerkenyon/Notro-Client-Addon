/*    */ package eu.shoroa.bridge.ui.c.a;
/*    */ 
/*    */ import eu.shoroa.bridge.b.a.b;
/*    */ import eu.shoroa.bridge.b.b.d;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.d.e.e;
/*    */ import eu.shoroa.bridge.ui.b.d;
/*    */ import java.awt.Color;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ final class a
/*    */   extends d
/*    */ {
/*    */   @NotNull
/*    */   private final String a;
/*    */   @NotNull
/*    */   private final e b;
/*    */   @NotNull
/*    */   private final Function0<Unit> c;
/*    */   private boolean d;
/*    */   private final eu.shoroa.bridge.b.a.a e;
/*    */   private final eu.shoroa.bridge.b.a.a f;
/*    */   
/*    */   @NotNull
/*    */   public Object clone() {
/* 58 */     return super.clone();
/*    */   }
/* 60 */   private static final Float a() { return Float.valueOf(180.0F); } public a(String icon, e iconType, Function0<Unit> onClick, float x, float y, float w, float h) { super(x, y, 
/* 61 */         w, h); this.a = icon;
/*    */     this.b = iconType;
/*    */     this.c = onClick;
/* 64 */     this.e = eu.shoroa.bridge.b.a.a.a(a::a, a::b);
/* 65 */     this.f = eu.shoroa.bridge.b.a.a.a(a::c, a::d); } private static final b b() { return b.LINEAR; } private static final Float c() { return Float.valueOf(100.0F); } private static final b d() { return b.LINEAR; }
/*    */    public void render(float mx, float my, float delta) {
/* 67 */     this.e.a(d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null));
/* 68 */     this.f.a(this.d);
/*    */ 
/*    */ 
/*    */     
/* 72 */     Intrinsics.checkNotNullExpressionValue(this.f.a(
/* 73 */           this.e.a(
/* 74 */             new Color(0.0F, 0.0F, 0.0F, 0.0F), 
/* 75 */             new Color(1.0F, 1.0F, 1.0F, 0.05F)), 
/* 76 */           new Color(1.0F, 1.0F, 1.0F, 0.2F)), ""); d.a(d.a, this, 13.0F, d.a.a(this.f.a(this.e.a(new Color(0.0F, 0.0F, 0.0F, 0.0F), new Color(1.0F, 1.0F, 1.0F, 0.05F)), new Color(1.0F, 1.0F, 1.0F, 0.2F))), 0.0F, 8, null);
/*    */ 
/*    */ 
/*    */     
/* 80 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.b(d.a, this.a, getX() + getW() / 2.0F, getY() + getH() / 2.0F, this.b.a(), 28.0F, Color.WHITE, d.a.CENTER_MIDDLE, 0.0F, 0.0F, 384, null);
/*    */   }
/*    */   
/*    */   public void click(float mx, float my, int button) {
/* 84 */     if (d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 85 */       this.d = true;
/*    */     }
/*    */   }
/*    */   
/*    */   public void release(float mx, float my, int button) {
/* 90 */     if (this.d && d.hovered$default(this, 0.0F, 0.0F, 0.0F, 0.0F, 15, null) && button == 0) {
/* 91 */       this.c.invoke();
/*    */     }
/* 93 */     this.d = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\c\a\c$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */