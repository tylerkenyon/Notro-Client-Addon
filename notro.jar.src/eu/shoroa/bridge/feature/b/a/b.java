/*    */ package eu.shoroa.bridge.feature.b.a;
/*    */ 
/*    */ import org.joml.Vector3d;
/*    */ 
/*    */ public final class b extends a {
/*  6 */   public b() { super("Coords", "Shows your coordinates", "coords");
/*  7 */     this.b = a("Inline", false); } @NotNull private final eu.shoroa.bridge.feature.c.b b; @NotNull public final eu.shoroa.bridge.feature.c.b<Boolean> s() { return this.b.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[1]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(b.class, "inline", "getInline()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @NotNull
/*    */   public String[] c() {
/*  9 */     Intrinsics.checkNotNull(eu.shoroa.bridge.feature.a.b.a.i()); Vector3d pos = eu.shoroa.bridge.feature.a.b.a.i().position();
/*    */     
/* 11 */     pos.x = (int)(pos.x * true) / 1.0D;
/* 12 */     pos.y = (int)(pos.y * true) / 1.0D;
/* 13 */     pos.z = (int)(pos.z * true) / 1.0D;
/* 14 */     String inline = "X: " + (int)pos.x + "  Y: " + 
/* 15 */       (int)pos.y + "  Z: " + (int)pos.z;
/* 16 */     String[] arrayOfString = new String[1]; arrayOfString[0] = inline; arrayOfString = new String[3]; arrayOfString[0] = "X: " + pos.x; arrayOfString[1] = "Y: " + pos.y; arrayOfString[2] = "Z: " + pos.z; return ((Boolean)s().b()).booleanValue() ? arrayOfString : arrayOfString;
/*    */   } @NotNull
/*    */   public String[] d() {
/* 19 */     return c();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */