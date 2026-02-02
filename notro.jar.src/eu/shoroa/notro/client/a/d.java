/*    */ package eu.shoroa.notro.client.a;
/*    */ 
/*    */ import eu.shoroa.bridge.b.e;
/*    */ import eu.shoroa.notro.bridge.HolderScreen;
/*    */ import java.awt.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_2403;
/*    */ import net.minecraft.class_2520;
/*    */ import net.minecraft.class_389;
/*    */ import net.minecraft.class_520;
/*    */ import net.minecraft.class_533;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\016\n\002\020\006\n\002\b\004\030\000 \0372\0020\001:\001\037B\007¢\006\004\b\002\020\003J7\020\016\032\0020\r2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013H\026¢\006\004\b\016\020\017J\017\020\020\032\0020\rH\026¢\006\004\b\020\020\003J\017\020\021\032\0020\rH\026¢\006\004\b\021\020\003J7\020\024\032\0020\r2\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\022\032\0020\0062\006\020\023\032\0020\0062\006\020\n\032\0020\tH\026¢\006\004\b\024\020\025J?\020\027\032\0020\r2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\026\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013H\026¢\006\004\b\027\020\030J=\020\031\032\0020\r2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\026\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013¢\006\004\b\031\020\030J7\020\005\032\0020\r2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013H\026¢\006\004\b\005\020\017J\027\020\032\032\0020\0062\006\020\005\032\0020\004H\026¢\006\004\b\032\020\033R\024\020\035\032\0020\0348\002X\004¢\006\006\n\004\b\035\020\036¨\006 "}, d2 = {"Leu/shoroa/notro/client/render/VanillaRendererImpl;", "Leu/shoroa/bridge/render/VanillaRenderer;", "<init>", "()V", "", "text", "", "x", "y", "Ljava/awt/Color;", "color", "", "shadow", "", "centeredText", "(Ljava/lang/String;FFLjava/awt/Color;Z)V", "postScale", "preScale", "w", "h", "rect", "(FFFFLjava/awt/Color;)V", "size", "sizedCenteredText", "(Ljava/lang/String;FFFLjava/awt/Color;Z)V", "sizedText", "textWidth", "(Ljava/lang/String;)F", "", "sf", "D", "Companion", "NotroClient"})
/*    */ public final class d
/*    */   extends e
/*    */ {
/*    */   public d() {
/* 68 */     d d1 = this, d2 = this; int $i$a$-run-VanillaRendererImpl$sf$1 = 0;
/* 69 */     double d3 = 1.0D / (new class_389(class_1600.method_2965())).method_1049() / 2.0D; d2.b = d3;
/*    */   }
/*    */   public void a(float x, float y, float w, float h, Color color) { Intrinsics.checkNotNullParameter(color, ""); float f1 = color.getAlpha() / 255.0F; float r = color.getRed() / 255.0F; float g = color.getGreen() / 255.0F; float b = color.getBlue() / 255.0F; class_533 tessellator = class_533.method_9926(); class_520 worldRenderer = tessellator.method_9928(); class_2403.method_9843(); class_2403.method_9856(); class_2403.method_9805(770, 771, 1, 0); class_2403.method_9825(r, g, b, f1); worldRenderer.method_9737(7, class_2520.field_11206); worldRenderer.method_9742(x, y, 0.0D).method_9750(); worldRenderer.method_9742((x + w), y, 0.0D).method_9750(); worldRenderer.method_9742((x + w), (y + h), 0.0D).method_9750(); worldRenderer.method_9742(x, (y + h), 0.0D).method_9750(); tessellator.method_9927(); class_2403.method_9855(); class_2403.method_9842(); }
/* 72 */   public void a(String text, float x, float y, Color color, boolean shadow) { Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(color, ""); Intrinsics.checkNotNull(c.field_3816); boolean isEditorOpen = (c.field_3816 != null && c.field_3816 instanceof HolderScreen && ((HolderScreen)c.field_3816).getScreen() instanceof eu.shoroa.bridge.ui.a); c.field_3814.method_9417(text, x / 2.0F, y / 2.0F, color.getRGB(), shadow); } public final void b(String text, float x, float y, float size, Color color, boolean shadow) { Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(color, ""); class_2403.method_9791(); class_2403.method_9800(size / 2.0F, size / 2.0F, size / 2.0F); c.field_3814.method_9417(text, x / size, y / size, color.getRGB(), shadow); class_2403.method_9792(); } public void a() { class_2403.method_9796(this.b, this.b, this.b); }
/*    */   public void a(String text, float x, float y, float size, Color color, boolean shadow) { Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(color, ""); b(text, x, y, size, color, shadow); }
/*    */   public void b(String text, float x, float y, Color color, boolean shadow) { Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(color, ""); float sw = c.field_3814.method_954(text); a(text, x - sw, y - 8, color, shadow); }
/*    */   public float a(String text) { Intrinsics.checkNotNullParameter(text, "");
/* 76 */     return (c.field_3814.method_954(text) * 2); } public void b() { class_2403.method_9796(1.0D / this.b, 1.0D / this.b, 1.0D / this.b); }
/*    */    @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\034\020\006\032\n \005*\004\030\0010\0040\0048\002X\004¢\006\006\n\004\b\006\020\007¨\006\b"}, d2 = {"Leu/shoroa/notro/client/render/VanillaRendererImpl$Companion;", "", "<init>", "()V", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "NotroClient"})
/*    */   public static final class a {
/*    */     private a() {} } @NotNull
/* 80 */   public static final a a = new a(null); private final double b; private static final class_1600 c = class_1600.method_2965();
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\d.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */