/*    */ package eu.shoroa.bridge.ui.a;
/*    */ import eu.shoroa.bridge.b.d;
/*    */ import java.awt.Color;
/*    */ 
/*    */ @SourceDebugExtension({"SMAP\nConsoleUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsoleUI.kt\neu/shoroa/bridge/ui/console/ConsoleUI\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,77:1\n1183#2,3:78\n*S KotlinDebug\n*F\n+ 1 ConsoleUI.kt\neu/shoroa/bridge/ui/console/ConsoleUI\n*L\n19#1:78,3\n*E\n"})
/*    */ public final class a {
/*    */   @NotNull
/*  8 */   public static final a a = new a(); @NotNull private static final Color n = new Color(4081207); @NotNull public final Color a() { return n; } @NotNull
/*  9 */   private static final Color o = new Color(5003332); @NotNull public final Color b() { return o; } @NotNull
/* 10 */   private static final Color p = new Color(5925456); @NotNull public final Color c() { return p; } @NotNull
/* 11 */   private static final Color q = new Color(8951427); @NotNull public final Color d() { return q; } @NotNull
/* 12 */   private static final Color r = new Color(2962214); @NotNull public final Color e() { return r; } @NotNull
/* 13 */   private static final Color s = new Color(3949360); @NotNull public final Color f() { return s; } @NotNull public static final String b = "§0"; @NotNull public static final String c = "§1"; @NotNull public static final String d = "§2"; @NotNull public static final String e = "§3"; @NotNull
/*    */   public static final String f = "§4"; @NotNull
/* 15 */   public static final String g = "§5"; private static Color t = Color.WHITE; @NotNull public static final String h = "§6"; @NotNull public static final String i = "§7"; @NotNull public static final String j = "§8"; @NotNull public static final String k = "§9"; @NotNull public static final String l = "§a"; @NotNull public static final String m = "§b"; public final Color g() { return t; } public final void a(Color <set-?>) { t = <set-?>; }
/*    */    public final void a(String text, float x, float y, float size, Color primaryColor, d.a alignment) {
/* 17 */     Intrinsics.checkNotNullParameter(text, ""); Intrinsics.checkNotNullParameter(primaryColor, ""); Intrinsics.checkNotNullParameter(alignment, ""); float f = 0.0F; f = x;
/* 18 */     boolean coloring = false;
/* 19 */     CharSequence $this$forEachIndexed$iv = text; int $i$f$forEachIndexed = 0;
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
/* 78 */     int index$iv = 0;
/* 79 */     byte b = 0; if (b < $this$forEachIndexed$iv.length()) { char item$iv = $this$forEachIndexed$iv.charAt(b); char c = item$iv; int i = index$iv++, $i$a$-forEachIndexed-ConsoleUI$text$1 = 0;
/*    */       if (c == '§') {
/*    */         coloring = true;
/*    */       } else if (coloring) {
/*    */         char c1 = c;
/*    */         if (c1 == '0') {
/*    */           t = Color.BLACK;
/*    */         } else if (c1 == '1') {
/*    */           t = Color.BLUE;
/*    */         } else if (c1 == '2') {
/*    */           t = Color.GREEN;
/*    */         } else if (c1 == '3') {
/*    */           t = Color.CYAN;
/*    */         } else if (c1 == '4') {
/*    */           t = Color.RED;
/*    */         } else if (c1 == '5') {
/*    */           t = Color.MAGENTA;
/*    */         } else if (c1 == '6') {
/*    */           t = Color.YELLOW;
/*    */         } else if (c1 == '7') {
/*    */           t = Color.GRAY;
/*    */         } else if (c1 == '8') {
/*    */           t = Color.DARK_GRAY;
/*    */         } else if (c1 == '9') {
/*    */           t = Color.LIGHT_GRAY;
/*    */         } else if (c1 == 'a') {
/*    */           t = Color.ORANGE;
/*    */         } else if (c1 == 'b') {
/*    */           t = Color.PINK;
/*    */         } else {
/*    */           t = primaryColor;
/*    */         } 
/*    */         coloring = false;
/*    */       } else {
/*    */         Color color = t;
/*    */         Intrinsics.checkNotNull(color);
/*    */         Intrinsics.checkNotNullExpressionValue(t.darker().darker().darker(), "");
/*    */         d.a(d.a, String.valueOf(c), f, y, "console", size, color, t.darker().darker().darker(), alignment, 0.0F, 0.0F, 768, null);
/*    */         f += d.a.a(String.valueOf(c), "console", size);
/*    */       }  }
/*    */     
/*    */     t = Color.WHITE;
/*    */   }
/*    */   
/*    */   public final void a(float x, float y, float width, float height) {
/*    */     d.a(d.a, x, y, width, height, 0.0F, d.a.a(r), 0.0F, 64, null);
/*    */     d.a(d.a, x, y, width - 2, height - 2, 0.0F, d.a.a(q), 0.0F, 64, null);
/*    */     d.a(d.a, x, y + height - 2, 2.0F, 2.0F, 0.0F, d.a.a(s), 0.0F, 64, null);
/*    */     d.a(d.a, x + width - 2, y, 2.0F, 2.0F, 0.0F, d.a.a(s), 0.0F, 64, null);
/*    */     d.a(d.a, x + 2.0F, y + 2.0F, width - 4.0F, height - 4.0F, 0.0F, d.a.a(p), 0.0F, 64, null);
/*    */   }
/*    */   
/*    */   public final void b(float x, float y, float width, float height) {
/*    */     d.a(d.a, x, y, width, height, 0.0F, d.a.a(q), 0.0F, 64, null);
/*    */     d.a(d.a, x, y, width - 2, height - 2, 0.0F, d.a.a(s), 0.0F, 64, null);
/*    */     d.a(d.a, x, y + height - 2, 2.0F, 2.0F, 0.0F, d.a.a(n), 0.0F, 64, null);
/*    */     d.a(d.a, x + width - 2, y, 2.0F, 2.0F, 0.0F, d.a.a(n), 0.0F, 64, null);
/*    */     d.a(d.a, x + 2.0F, y + 2.0F, width - 4.0F, height - 4.0F, 0.0F, d.a.a(o), 0.0F, 64, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */