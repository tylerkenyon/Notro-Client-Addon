/*    */ package eu.shoroa.bridge.feature.c.a;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Pair;
/*    */ 
/*    */ public final class g extends b<i> {
/*  7 */   public g(String name, i def) { super(name, def); this.a = def; } @NotNull private final i a; @NotNull public Object h() { byte b1;
/*    */     int j;
/*    */     Integer[][] arrayOfInteger1;
/* 10 */     for (b1 = 0, j = ((i)b()).a(), arrayOfInteger1 = new Integer[j][]; b1 < j; ) { byte b2 = b1; byte b3; int k; Integer arrayOfInteger[], arrayOfInteger2[][]; byte b4;
/* 11 */       for (b3 = 0, k = ((i)b()).b(), arrayOfInteger = new Integer[k], b4 = b2, arrayOfInteger2 = arrayOfInteger1; b3 < k; ) { byte b5 = b3; arrayOfInteger[b5] = 
/* 12 */           Integer.valueOf(((Color)((i)b()).d().invoke(Integer.valueOf(b2), Integer.valueOf(b5))).getRGB()); b3++; }
/*    */        arrayOfInteger2[b4] = arrayOfInteger;
/*    */       b1++; }
/*    */     
/*    */     Integer[][] pixelData = arrayOfInteger1;
/* 17 */     Pair[] arrayOfPair = new Pair[3]; arrayOfPair[0] = TuplesKt.to("width", Integer.valueOf(((i)b()).a())); arrayOfPair[1] = 
/* 18 */       TuplesKt.to("height", Integer.valueOf(((i)b()).b()));
/* 19 */     arrayOfPair[2] = TuplesKt.to("pixels", pixelData);
/*    */     return MapsKt.mapOf(arrayOfPair); }
/*    */ 
/*    */   
/*    */   public void e(Object v) {
/* 24 */     if (!(v instanceof Map))
/*    */       return; 
/* 26 */     Object object1 = ((Map)v).get("width"); (object1 instanceof Number) ? object1 : null; int width = (((object1 instanceof Number) ? object1 : null) != null) ? ((object1 instanceof Number) ? object1 : null).intValue() : this.a.a();
/* 27 */     Object object2 = ((Map)v).get("height"); (object2 instanceof Number) ? object2 : null; int height = (((object2 instanceof Number) ? object2 : null) != null) ? ((object2 instanceof Number) ? object2 : null).intValue() : this.a.b();
/* 28 */     object2 = ((Map)v).get("pixels"); List<Object> pixels = (object2 instanceof List) ? (List)object2 : null;
/*    */ 
/*    */     
/* 31 */     i newShape = new i(width, height);
/*    */     
/* 33 */     if (pixels != null) {
/* 34 */       for (int x = 0; x < width; x++) {
/* 35 */         List list = (List)pixels.get(x); if (((list instanceof List) ? list : null) == null) { (list instanceof List) ? list : null; }
/* 36 */         else { Object object; for (int y = 0; y < height; y++) {
/* 37 */             Number number = (Number)object.get(y); (number instanceof Number) ? number : null; int argb = (((number instanceof Number) ? number : null) != null) ? ((number instanceof Number) ? number : null).intValue() : 0;
/* 38 */             newShape.a(x, y, new Color(argb, true));
/*    */           }  }
/*    */       
/*    */       } 
/*    */     }
/* 43 */     a(newShape);
/* 44 */     g();
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\c\a\g.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */