/*    */ package eu.shoroa.notro.client.feature.a.a;
/*    */ 
/*    */ import eu.shoroa.bridge.feature.c.a.i;
/*    */ import eu.shoroa.bridge.feature.c.b;
/*    */ import kotlin.jvm.internal.PropertyReference1;
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\025\020\026J'\020\b\032\0020\0072\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\004H\026¢\006\004\b\b\020\tJ'\020\n\032\0020\0072\006\020\003\032\0020\0022\006\020\005\032\0020\0042\006\020\006\032\0020\004H\026¢\006\004\b\n\020\tR!\020\n\032\b\022\004\022\0020\0020\0138CX\002¢\006\f\n\004\b\b\020\f\032\004\b\r\020\016R!\020\b\032\b\022\004\022\0020\0170\0138CX\002¢\006\f\n\004\b\020\020\021\032\004\b\022\020\016R!\020\r\032\b\022\004\022\0020\0230\0138CX\002¢\006\f\n\004\b\r\020\024\032\004\b\020\020\016"}, d2 = {"Leu/shoroa/notro/client/feature/a/a/c;", "Leu/shoroa/bridge/feature/b/b;", "", "p0", "", "p1", "p2", "", "b", "(ZII)V", "a", "Leu/shoroa/bridge/feature/c/b;", "Leu/shoroa/bridge/feature/c/b;", "c", "()Leu/shoroa/bridge/feature/c/b;", "Leu/shoroa/bridge/feature/c/a/i;", "d", "Leu/shoroa/bridge/feature/c/a/g;", "s", "", "Leu/shoroa/bridge/feature/c/a/h;", "<init>", "()V"})
/*    */ public final class c extends b {
/*    */   @NotNull
/*    */   private final b b;
/*    */   
/* 15 */   public c() { super("Crosshair", "Custom crosshair", true, "crosshair", false, 16, null);
/* 16 */     this.b = a("Blend", true);
/* 17 */     this.c = b("Size", Float.valueOf(1.0F), (ClosedRange)RangesKt.rangeTo(0.1F, 10.0F), Float.valueOf(0.1F));
/* 18 */     this.d = a("Shape", new i(15, 15)); } @NotNull private final h c; @NotNull private final g d; @JvmName(name = "c") private final b<Boolean> c() { return this.b.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[3]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "blend", "getBlend()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "size", "getSize()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(c.class, "shape", "getShape()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @JvmName(name = "d") private final b<Float> d() { return this.c.a(this, a[1]); } @JvmName(name = "s") private final b<i> s() { return this.d.a(this, a[2]); }
/*    */ 
/*    */   
/*    */   public void a(boolean nvg, int displayWidth, int displayHeight) {
/* 22 */     if (!nvg) {
/* 23 */       float cx = displayWidth / 4.0F;
/* 24 */       float cy = displayHeight / 4.0F;
/*    */       
/* 26 */       GL11.glPushAttrib(1048575);
/* 27 */       GL11.glEnable(3008);
/* 28 */       if (((Boolean)c().b()).booleanValue()) {
/* 29 */         GL11.glEnable(3042);
/* 30 */         GL14.glBlendFuncSeparate(775, 769, 1, 0);
/*    */       } 
/*    */       
/* 33 */       GL11.glTranslatef(cx, cy, 0.0F);
/* 34 */       GL11.glScalef(((Number)d().b()).floatValue(), ((Number)d().b()).floatValue(), 1.0F);
/* 35 */       class_2403.method_9839(((i)s().b()).c());
/* 36 */       class_372.method_6674(-7, -7, 0.0F, 0.0F, 15, 15, 15.0F, 15.0F);
/* 37 */       GL11.glTranslatef(-cx, -cy, 0.0F);
/* 38 */       GL11.glPopAttrib();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b(boolean nvg, int displayWidth, int displayHeight) {}
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */