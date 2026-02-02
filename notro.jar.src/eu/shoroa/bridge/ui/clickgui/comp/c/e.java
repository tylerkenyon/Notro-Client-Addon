/*    */ package eu.shoroa.bridge.ui.clickgui.comp.c;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import eu.shoroa.bridge.ui.b.a;
/*    */ import java.awt.Color;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\020\007\n\002\b\006\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\020\020\tJ\035\020\007\032\0020\0062\006\020\003\032\0020\0022\006\020\005\032\0020\004¢\006\004\b\007\020\bJ\r\020\007\032\0020\006¢\006\004\b\007\020\tR\026\020\007\032\0020\n8\002@\002X\016¢\006\006\n\004\b\013\020\fR\026\020\016\032\0020\n8\002@\002X\016¢\006\006\n\004\b\r\020\fR\030\020\013\032\004\030\0010\0028\002@\002X\016¢\006\006\n\004\b\016\020\017"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/c/e;", "", "", "p0", "Leu/shoroa/bridge/ui/b/a;", "p1", "", "a", "(Ljava/lang/String;Leu/shoroa/bridge/ui/b/a;)V", "()V", "", "c", "F", "d", "b", "Ljava/lang/String;", "<init>"})
/*    */ public final class e {
/*    */   @NotNull
/*    */   public static final e INSTANCE = new e();
/*    */   @Nullable
/*    */   private static String b;
/*    */   
/*    */   public final void a(String t, a button) {
/* 14 */     Intrinsics.checkNotNullParameter(t, ""); Intrinsics.checkNotNullParameter(button, ""); if (d.hovered$default((d)button, 0.0F, 0.0F, 0.0F, 0.0F, 15, null)) {
/* 15 */       b = t;
/* 16 */       c = button.getX() + button.getW() + 8.0F;
/* 17 */       d = button.getY() + 5.0F;
/*    */     } 
/*    */   }
/*    */   private static float c; private static float d;
/*    */   public final void a() {
/* 22 */     String it = b; int $i$a$-let-TooltipManager$renderTooltip$1 = 0;
/* 23 */     float padding = 8.0F;
/* 24 */     float textWidth = d.a.a(it, "regular", 12.0F);
/* 25 */     float boxWidth = textWidth + padding * 2;
/* 26 */     float boxHeight = 22.0F;
/*    */ 
/*    */     
/* 29 */     d.a(d.a, c, d, boxWidth, boxHeight, 5.0F, d.a.a(new Color(0, 0, 0, 180)), 0.0F, 64, null);
/*    */ 
/*    */     
/* 32 */     Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); d.b(d.a, it, c + padding, d + 6.0F, "regular", 12.0F, Color.WHITE, d.a.LEFT_TOP, 0.0F, 0.0F, 384, null);
/*    */     
/* 34 */     b = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */