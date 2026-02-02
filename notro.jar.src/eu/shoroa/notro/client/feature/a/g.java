/*    */ package eu.shoroa.notro.client.feature.a;
/*    */ 
/*    */ import net.minecraft.class_2403;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\006\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J7\020\013\032\0020\n2\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\0042\006\020\b\032\0020\0042\006\020\t\032\0020\004H\002¢\006\004\b\013\020\fJ'\020\021\032\0020\n2\006\020\016\032\0020\r2\006\020\017\032\0020\0042\006\020\020\032\0020\004H\026¢\006\004\b\021\020\022J'\020\023\032\0020\n2\006\020\016\032\0020\r2\006\020\017\032\0020\0042\006\020\020\032\0020\004H\026¢\006\004\b\023\020\022R!\020\031\032\b\022\004\022\0020\r0\0248FX\002¢\006\f\n\004\b\025\020\026\032\004\b\027\020\030R!\020\034\032\b\022\004\022\0020\r0\0248FX\002¢\006\f\n\004\b\032\020\026\032\004\b\033\020\030R!\020\037\032\b\022\004\022\0020\r0\0248FX\002¢\006\f\n\004\b\035\020\026\032\004\b\036\020\030R\034\020\"\032\n !*\004\030\0010 0 8\002X\004¢\006\006\n\004\b\"\020#¨\006$"}, d2 = {"Leu/shoroa/notro/client/feature/module/ModuleNametags;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "", "left", "top", "right", "bottom", "color", "", "drawRect", "(IIIII)V", "", "nvg", "displayWidth", "displayHeight", "dummy", "(ZII)V", "render", "Leu/shoroa/bridge/feature/setting/Setting;", "disabled$delegate", "Leu/shoroa/bridge/feature/setting/Setting;", "getDisabled", "()Leu/shoroa/bridge/feature/setting/Setting;", "disabled", "drawBackground$delegate", "getDrawBackground", "drawBackground", "drawInF3$delegate", "getDrawInF3", "drawInF3", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "NotroClient"})
/*    */ public final class g extends b {
/*    */   private final class_1600 b;
/*    */   @NotNull
/*    */   private final b c;
/*    */   
/* 11 */   public g() { super("Nametags", "Custom nametag options", true, "nametags", false, 16, null);
/* 12 */     this.b = class_1600.method_2965();
/*    */     
/* 14 */     this.c = a("Draw in F3", false);
/* 15 */     this.d = a("Draw Background", true);
/* 16 */     this.e = a("Disable", false); } @NotNull private final b d; @NotNull private final b e; @NotNull public final b<Boolean> c() { return this.c.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[3]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "drawInF3", "getDrawInF3()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "drawBackground", "getDrawBackground()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "disabled", "getDisabled()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @NotNull public final b<Boolean> d() { return this.d.a(this, a[1]); } @NotNull public final b<Boolean> s() { return this.e.a(this, a[2]); }
/*    */   
/*    */   public void a(boolean nvg, int displayWidth, int displayHeight) {
/* 19 */     if (((Boolean)s().b()).booleanValue())
/* 20 */       return;  if (!((Boolean)c().b()).booleanValue() && this.b.field_3823.field_950)
/*    */       return; 
/* 22 */     Intrinsics.checkNotNullExpressionValue(this.b.field_3814, ""); class_370 fontRenderer = this.b.field_3814;
/*    */     
/* 24 */     for (class_864 entity : this.b.field_3803.field_4541) {
/* 25 */       if (!(entity instanceof class_988) || Intrinsics.areEqual(entity, this.b.field_10310))
/*    */         continue; 
/* 27 */       double x = entity.field_3252 - (this.b.method_9390()).field_2105;
/* 28 */       double y = entity.field_3253 + entity.field_3207 + 0.5D - (this.b.method_9390()).field_2106;
/* 29 */       double z = entity.field_3254 - (this.b.method_9390()).field_2107;
/*    */       
/* 31 */       float scale = 0.02666667F;
/* 32 */       String name = ((class_988)entity).method_2518();
/*    */       
/* 34 */       class_2403.method_9791();
/* 35 */       class_2403.method_9814(x, y, z);
/* 36 */       class_2403.method_9817(-(this.b.method_9390()).field_2102, 0.0F, 1.0F, 0.0F);
/* 37 */       class_2403.method_9817((this.b.method_9390()).field_2103, 1.0F, 0.0F, 0.0F);
/* 38 */       class_2403.method_9800(-scale, -scale, scale);
/*    */       
/* 40 */       class_2403.method_9832();
/* 41 */       class_2403.method_9838();
/* 42 */       class_2403.method_9843();
/*    */       
/* 44 */       int width = fontRenderer.method_954(name) / 2;
/* 45 */       if (((Boolean)d().b()).booleanValue()) {
/* 46 */         a(-width - 2, -2, width + 2, fontRenderer.field_1141 + 1, 1426063360);
/*    */       }
/*    */       
/* 49 */       fontRenderer.method_4247(name, -width, 0, 16777215);
/*    */       
/* 51 */       class_2403.method_9840();
/* 52 */       class_2403.method_9830();
/* 53 */       class_2403.method_9842();
/* 54 */       class_2403.method_9792();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(boolean nvg, int displayWidth, int displayHeight) {}
/*    */ 
/*    */   
/*    */   private final void a(int left, int top, int right, int bottom, int color) {
/* 63 */     float a = (color >> 24 & 0xFF) / 255.0F;
/* 64 */     float r = (color >> 16 & 0xFF) / 255.0F;
/* 65 */     float f1 = (color >> 8 & 0xFF) / 255.0F;
/* 66 */     float f2 = (color & 0xFF) / 255.0F;
/*    */     
/* 68 */     GL11.glDisable(3553);
/* 69 */     GL11.glColor4f(r, f1, f2, a);
/* 70 */     GL11.glBegin(7);
/* 71 */     GL11.glVertex2f(left, bottom);
/* 72 */     GL11.glVertex2f(right, bottom);
/* 73 */     GL11.glVertex2f(right, top);
/* 74 */     GL11.glVertex2f(left, top);
/* 75 */     GL11.glEnd();
/* 76 */     GL11.glEnable(3553);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\g.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */