/*    */ package eu.shoroa.bridge.b;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\013\n\002\020\024\n\002\b\005\b&\030\0002\0020\001B\007¢\006\004\b\002\020\003J7\020\016\032\0020\r2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013H&¢\006\004\b\016\020\017J\017\020\020\032\0020\rH&¢\006\004\b\020\020\003J\017\020\021\032\0020\rH&¢\006\004\b\021\020\003J7\020\024\032\0020\r2\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\022\032\0020\0062\006\020\023\032\0020\0062\006\020\n\032\0020\tH&¢\006\004\b\024\020\025J?\020\027\032\0020\r2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\026\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013H&¢\006\004\b\027\020\030J5\020\032\032\0020\0312\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013¢\006\004\b\032\020\033J7\020\005\032\0020\r2\006\020\005\032\0020\0042\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\n\032\0020\t2\006\020\f\032\0020\013H&¢\006\004\b\005\020\017J\027\020\034\032\0020\0062\006\020\005\032\0020\004H&¢\006\004\b\034\020\035¨\006\036"}, d2 = {"Leu/shoroa/bridge/render/VanillaRenderer;", "", "<init>", "()V", "", "text", "", "x", "y", "Ljava/awt/Color;", "color", "", "shadow", "", "centeredText", "(Ljava/lang/String;FFLjava/awt/Color;Z)V", "postScale", "preScale", "w", "h", "rect", "(FFFFLjava/awt/Color;)V", "size", "sizedCenteredText", "(Ljava/lang/String;FFFLjava/awt/Color;Z)V", "", "splitText", "(Ljava/lang/String;FFLjava/awt/Color;Z)[F", "textWidth", "(Ljava/lang/String;)F", "bridge"})
/*    */ public abstract class e
/*    */ {
/*    */   @NotNull
/*    */   public final float[] c(String text, float x, float y, Color color, boolean shadow) {
/* 15 */     Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(color, ""); String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; List lines = StringsKt.split$default(text, arrayOfString, false, 0, 6, null);
/* 16 */     float maxW = 0.0F;
/* 17 */     int i = 0;
/* 18 */     for (String line : lines) {
/* 19 */       float width = a(line);
/* 20 */       if (width > maxW) maxW = width; 
/* 21 */       if (lines.size() > 1) {
/* 22 */         b(line, x - width / 2, y + (i * 18), color, shadow);
/*    */       } else {
/* 24 */         b(line, x, y + (i * 18), color, shadow);
/*    */       } 
/* 26 */       i++;
/*    */     } 
/* 28 */     float[] arrayOfFloat = new float[2]; arrayOfFloat[0] = maxW; arrayOfFloat[1] = i * 18.0F; return arrayOfFloat;
/*    */   }
/*    */   
/*    */   public abstract void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Color paramColor);
/*    */   
/*    */   public abstract void a(String paramString, float paramFloat1, float paramFloat2, Color paramColor, boolean paramBoolean);
/*    */   
/*    */   public abstract void b(String paramString, float paramFloat1, float paramFloat2, Color paramColor, boolean paramBoolean);
/*    */   
/*    */   public abstract void a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, Color paramColor, boolean paramBoolean);
/*    */   
/*    */   public abstract float a(String paramString);
/*    */   
/*    */   public abstract void a();
/*    */   
/*    */   public abstract void b();
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\e.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */