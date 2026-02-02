/*    */ package eu.shoroa.notro.client.feature.a;
/*    */ import java.math.RoundingMode;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1442;
/*    */ import net.minecraft.class_966;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J'\020\n\032\0020\t2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\006H\026¢\006\004\b\n\020\013J\025\020\017\032\0020\0162\006\020\r\032\0020\f¢\006\004\b\017\020\020J'\020\021\032\0020\t2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\006H\026¢\006\004\b\021\020\013¨\006\022"}, d2 = {"Leu/shoroa/notro/client/feature/module/ModuleTNTTImer;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "", "nvg", "", "displayWidth", "displayHeight", "", "dummy", "(ZII)V", "Lnet/minecraft/class_966;", "e", "", "getText", "(Lnet/minecraft/class_966;)Ljava/lang/String;", "render", "NotroClient"})
/*    */ public final class i extends b {
/*    */   public i() {
/* 10 */     super("TNT Timer", "Shows how long till TNT explodes", true, "tnttimer", false, 16, null);
/*    */   } public void a(boolean nvg, int displayWidth, int displayHeight) {} public void b(boolean nvg, int displayWidth, int displayHeight) {
/* 12 */     a(nvg, displayWidth, displayHeight);
/*    */   } @NotNull
/*    */   public final String a(class_966 e) {
/* 15 */     Intrinsics.checkNotNullParameter(e, ""); float timeLeft = BigDecimal.valueOf(e.field_3913 / 20.0D).setScale(1, RoundingMode.HALF_UP).floatValue();
/* 16 */     Intrinsics.checkNotNullExpressionValue(class_1442.field_5485.toString(), ""); String colorCode = class_1442.field_5485.toString();
/* 17 */     if (timeLeft <= 2.0F) { Intrinsics.checkNotNullExpressionValue(class_1442.field_5487.toString(), ""); colorCode = class_1442.field_5487.toString(); }
/* 18 */      if (timeLeft <= 3.0F && timeLeft > 2.0F) { Intrinsics.checkNotNullExpressionValue(class_1442.field_5489.toString(), ""); colorCode = class_1442.field_5489.toString(); }
/* 19 */      return colorCode + colorCode + "s";
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\i.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */