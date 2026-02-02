/*    */ package eu.shoroa.notro.client.feature.a.a;
/*    */ 
/*    */ import net.minecraft.class_1600;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\007\030\0002\0020\001B\007¢\006\004\b\024\020\025J\017\020\003\032\0020\002H\027¢\006\004\b\003\020\004J\027\020\b\032\0020\0072\006\020\006\032\0020\005H\007¢\006\004\b\b\020\tJ\017\020\n\032\0020\002H\027¢\006\004\b\n\020\004R\024\020\b\032\0020\0138\002X\004¢\006\006\n\004\b\f\020\rR\"\020\f\032\0020\0168\007@\007X\016¢\006\022\n\004\b\b\020\017\032\004\b\020\020\021\"\004\b\022\020\023"}, d2 = {"Leu/shoroa/notro/client/feature/a/a/f;", "Leu/shoroa/bridge/feature/b/e;", "", "t", "()Ljava/lang/String;", "Leu/shoroa/notro/b/a;", "p0", "", "a", "(Leu/shoroa/notro/b/a;)V", "s", "Ljava/text/DecimalFormat;", "b", "Ljava/text/DecimalFormat;", "", "F", "u", "()F", "e", "(F)V", "<init>", "()V"})
/*    */ public final class f extends e {
/*    */   private float a;
/*    */   @NotNull
/*    */   private final DecimalFormat b;
/*    */   
/* 12 */   public f() { super("ReachDisplay", "Shows your reach", "reachdisplay");
/*    */     
/* 14 */     this.b = new DecimalFormat("#.#"); }
/*    */   @JvmName(name = "u")
/*    */   public final float u() { return this.a; } @NotNull
/* 17 */   public String s() { return this.b.format(Float.valueOf(this.a)) + " blocks"; } @JvmName(name = "e")
/*    */   public final void e(float <set-?>) {
/*    */     this.a = <set-?>;
/*    */   } @Listen
/*    */   public final void a(a a1) {
/* 22 */     Intrinsics.checkNotNullParameter(a1, ""); class_1600 mc = class_1600.method_2965();
/* 23 */     if (mc.field_3822 != null && mc.field_3822.field_595 == class_234.class_235.field_603 && mc.field_3822.field_601.method_8365() == a1.b().method_8365()) {
/* 24 */       Intrinsics.checkNotNullExpressionValue(mc.method_9388().method_10958(1.0F), ""); class_236 vec3 = mc.method_9388().method_10958(1.0F);
/* 25 */       this.a = (float)(mc.field_3822.field_600.method_618(vec3) * 100 / 100.0F);
/*    */     } 
/*    */   } @NotNull
/*    */   public String t() {
/* 29 */     return s();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */