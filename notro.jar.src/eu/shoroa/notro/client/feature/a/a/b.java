/*    */ package eu.shoroa.notro.client.feature.a.a;
/*    */ 
/*    */ import eu.shoroa.bridge.a.e;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1600;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020\013\n\002\b\005\030\0002\0020\001B\007¢\006\004\b\030\020\031J\017\020\003\032\0020\002H\027¢\006\004\b\003\020\004J\027\020\b\032\0020\0072\006\020\006\032\0020\005H\007¢\006\004\b\b\020\tJ\027\020\b\032\0020\0072\006\020\006\032\0020\nH\002¢\006\004\b\b\020\013J\027\020\b\032\0020\0072\006\020\006\032\0020\fH\007¢\006\004\b\b\020\rJ\027\020\b\032\0020\0072\006\020\006\032\0020\016H\007¢\006\004\b\b\020\017J\017\020\020\032\0020\002H\027¢\006\004\b\020\020\004R\026\020\b\032\0020\n8\002@\002X\016¢\006\006\n\004\b\021\020\022R \020\021\032\b\022\004\022\0020\0240\0238\007X\004¢\006\f\n\004\b\b\020\025\032\004\b\026\020\027"}, d2 = {"Leu/shoroa/notro/client/feature/a/a/b;", "Leu/shoroa/bridge/feature/b/e;", "", "t", "()Ljava/lang/String;", "Leu/shoroa/notro/b/a;", "p0", "", "a", "(Leu/shoroa/notro/b/a;)V", "", "(I)V", "Leu/shoroa/bridge/a/d;", "(Leu/shoroa/bridge/a/d;)V", "Leu/shoroa/bridge/a/e;", "(Leu/shoroa/bridge/a/e;)V", "s", "b", "I", "Leu/shoroa/bridge/feature/c/b;", "", "Leu/shoroa/bridge/feature/c/b;", "u", "()Leu/shoroa/bridge/feature/c/b;", "<init>", "()V"})
/*    */ public final class b extends e {
/*    */   @NotNull
/*    */   private final eu.shoroa.bridge.feature.c.b<Boolean> a;
/*    */   
/* 13 */   public b() { super("Combo Counter", "Displays your hits towards your enemy", "combocounter");
/* 14 */     this.a = new eu.shoroa.bridge.feature.c.b("Only Show Counter", Boolean.valueOf(false));
/*    */ 
/*    */     
/* 17 */     g().add(this.a); }
/*    */   private int b; @NotNull
/*    */   @JvmName(name = "u")
/*    */   public final eu.shoroa.bridge.feature.c.b<Boolean> u() { return this.a; } @NotNull
/* 21 */   public String s() { return (!((Boolean)this.a.b()).booleanValue() ? "Combo: " : "") + (!((Boolean)this.a.b()).booleanValue() ? "Combo: " : ""); } @NotNull
/* 22 */   public String t() { return s(); }
/*    */   
/*    */   @Listen
/* 25 */   public final void a(d d1) { Intrinsics.checkNotNullParameter(d1, ""); a(d1.b()); } @Listen
/*    */   public final void a(e e1) {
/* 27 */     Intrinsics.checkNotNullParameter(e1, ""); a(e1.b() - 100);
/*    */   } @Listen
/*    */   public final void a(a a1) {
/* 30 */     Intrinsics.checkNotNullParameter(a1, ""); class_1600 mc = class_1600.method_2965();
/* 31 */     if (mc.field_3822 != null && mc.field_3822.field_595 == class_234.class_235.field_603 && mc.field_3822.field_601.method_8365() == a1.b().method_8365()) {
/* 32 */       int i = this.b; this.b = i + 1;
/*    */     } 
/*    */   }
/*    */   
/*    */   private final void a(int code) {
/* 37 */     class_1600 mc = class_1600.method_2965();
/* 38 */     if (code == mc.field_3823.field_940.method_6623() && 
/* 39 */       mc.field_3822 != null && 
/* 40 */       mc.field_3822.field_595 != class_234.class_235.field_603) this.b = 0; 
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */