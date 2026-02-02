/*    */ package eu.shoroa.notro.client.feature.a;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\030\0002\0020\001B\007¢\006\004\b\002\020\003J'\020\n\032\0020\t2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\006H\026¢\006\004\b\n\020\013J\r\020\r\032\0020\f¢\006\004\b\r\020\016J\r\020\017\032\0020\f¢\006\004\b\017\020\016J\017\020\020\032\0020\004H\002¢\006\004\b\020\020\021J\017\020\022\032\0020\004H\002¢\006\004\b\022\020\021J\027\020\025\032\0020\t2\006\020\024\032\0020\023H\007¢\006\004\b\025\020\026J\r\020\027\032\0020\004¢\006\004\b\027\020\021J\017\020\030\032\0020\004H\002¢\006\004\b\030\020\021J'\020\031\032\0020\t2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\006H\026¢\006\004\b\031\020\013R\026\020\032\032\0020\f8\002@\002X\016¢\006\006\n\004\b\032\020\033R!\020!\032\b\022\004\022\0020\0040\0348BX\002¢\006\f\n\004\b\035\020\036\032\004\b\037\020 R!\020$\032\b\022\004\022\0020\0040\0348BX\002¢\006\f\n\004\b\"\020\036\032\004\b#\020 R\034\020'\032\n &*\004\030\0010%0%8\002X\004¢\006\006\n\004\b'\020(R!\020,\032\b\022\004\022\0020)0\0348BX\002¢\006\f\n\004\b*\020\036\032\004\b+\020 R!\0200\032\b\022\004\022\0020-0\0348BX\002¢\006\f\n\004\b.\020\036\032\004\b/\020 R\026\0201\032\0020\0068\002@\002X\016¢\006\006\n\004\b1\0202R!\0205\032\b\022\004\022\0020\0040\0348BX\002¢\006\f\n\004\b3\020\036\032\004\b4\020 R\026\0206\032\0020\0048\002@\002X\016¢\006\006\n\004\b6\0207¨\0068"}, d2 = {"Leu/shoroa/notro/client/feature/module/ModuleFreelook;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "", "nvg", "", "displayWidth", "displayHeight", "", "dummy", "(ZII)V", "Lorg/joml/Vector2f;", "getPrevRotation", "()Lorg/joml/Vector2f;", "getRotation", "keyDown", "()Z", "keyPressed", "Leu/shoroa/bridge/event/EventUpdate;", "e", "onUpdate", "(Leu/shoroa/bridge/event/EventUpdate;)V", "overrideMouse", "perspectiveState", "render", "cameraRotation", "Lorg/joml/Vector2f;", "Leu/shoroa/bridge/feature/setting/Setting;", "invertX$delegate", "Leu/shoroa/bridge/feature/setting/Setting;", "getInvertX", "()Leu/shoroa/bridge/feature/setting/Setting;", "invertX", "invertY$delegate", "getInvertY", "invertY", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "Leu/shoroa/bridge/feature/setting/misc/FreeLookMode;", "mode$delegate", "getMode", "mode", "Leu/shoroa/bridge/feature/setting/misc/FreeLookPerspective;", "perspective$delegate", "getPerspective", "perspective", "prevPerspective", "I", "toggle$delegate", "getToggle", "toggle", "toggleState", "Z", "NotroClient"})
/*    */ public final class d extends b { @NotNull
/*    */   private final b b; @NotNull
/*    */   private final b c;
/*    */   @NotNull
/*    */   private final b d;
/*    */   @NotNull
/*    */   private final b e;
/*    */   @NotNull
/*    */   private final b f;
/*    */   private boolean g;
/*    */   private final class_1600 h;
/*    */   @NotNull
/*    */   private Vector2f i;
/*    */   private int j;
/*    */   
/* 17 */   public d() { super("FreeLook", "Better F5", true, "freelook", false, 16, null);
/* 18 */     this.b = a("Mode", e.FULL);
/* 19 */     this.c = a("Perspective", f.BACK);
/* 20 */     this.d = a("Toggle", false);
/* 21 */     this.e = a("Invert X", false);
/* 22 */     this.f = a("Invert Y", false);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.h = class_1600.method_2965();
/* 31 */     this.i = new Vector2f();
/*    */     
/* 33 */     this.j = -1; }
/*    */   private final b<e> t() { return this.b.a(this, a[0]); }
/*    */   static { KProperty[] arrayOfKProperty = new KProperty[5]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "mode", "getMode()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "perspective", "getPerspective()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "toggle", "getToggle()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "invertX", "getInvertX()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[4] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(d.class, "invertY", "getInvertY()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; }
/* 36 */   private final b<f> u() { return this.c.a(this, a[1]); } private final b<Boolean> v() { return this.d.a(this, a[2]); } private final b<Boolean> w() { return this.e.a(this, a[3]); } private final boolean A() { return (b() && (((Boolean)v().b()).booleanValue() ? this.g : y())); }
/*    */   private final b<Boolean> x() { return this.f.a(this, a[4]); }
/*    */   public void a(boolean nvg, int displayWidth, int displayHeight) {}
/*    */   public void b(boolean nvg, int displayWidth, int displayHeight) {} private final boolean y() { Intrinsics.checkNotNull(b.a.a());
/*    */     return b.a.a().bindDown("notro.key.freelook"); } private final boolean z() { Intrinsics.checkNotNull(b.a.a());
/* 41 */     return b.a.a().bindPressed("notro.key.freelook"); } @Listen public final void a(g e) { Intrinsics.checkNotNullParameter(e, ""); if (((Boolean)v().b()).booleanValue() && z()) {
/* 42 */       this.g = !this.g;
/*    */     }
/*    */     
/* 45 */     if (A()) {
/* 46 */       if (this.j == -1) {
/* 47 */         this.j = this.h.field_3823.field_949;
/* 48 */         this.i = new Vector2f(this.h.field_10310.field_3193, this.h.field_10310.field_3258);
/*    */       } 
/* 50 */       this.h.field_3823.field_949 = ((Number)((f)u().b()).a().invoke()).intValue();
/*    */     } else {
/* 52 */       if (this.j != -1)
/* 53 */         this.h.field_3823.field_949 = this.j; 
/* 54 */       this.j = -1;
/*    */     }  }
/*    */   
/*    */   @NotNull
/* 58 */   public final Vector2f c() { return (A() && t().b() == e.FULL) ? this.i : new Vector2f(this.h.field_10310.field_3193, this.h.field_10310.field_3258); } @NotNull
/* 59 */   public final Vector2f d() { return (A() && t().b() == e.FULL) ? this.i : new Vector2f(this.h.field_10310.field_3195, this.h.field_10310.field_3194); }
/*    */   
/*    */   public final boolean s() {
/* 62 */     if (t().b() == e.LIMITED) return true;
/*    */     
/* 64 */     if (this.h.field_3765 && Display.isActive())
/* 65 */       if (A())
/* 66 */       { this.h.field_3760.method_863();
/* 67 */         float sensitivity = this.h.field_3823.field_972 * 0.6F + 0.2F;
/* 68 */         float deltaSensitivity = (float)Math.pow(sensitivity, 3.0F) * 8.0F;
/* 69 */         float deltaX = this.h.field_3760.field_931 * deltaSensitivity;
/* 70 */         float deltaY = this.h.field_3760.field_932 * deltaSensitivity;
/*    */         
/* 72 */         if (((Boolean)w().b()).booleanValue()) deltaX *= -1; 
/* 73 */         if (((Boolean)x().b()).booleanValue()) deltaY *= -1;
/*    */         
/* 75 */         this.i.add(deltaY * 0.15F, deltaX * 0.15F);
/* 76 */         this.i.x = Math.max(-90.0F, Math.min(90.0F, this.i.x)); }
/* 77 */       else { return true; }
/*    */        
/* 79 */     return false;
/*    */   } }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */