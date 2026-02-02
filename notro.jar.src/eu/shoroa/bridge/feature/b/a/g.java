/*    */ package eu.shoroa.bridge.feature.b.a;
/*    */ 
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public final class g extends e {
/*  7 */   public g() { super("Time Display", "Displays real time", "time");
/*  8 */     this.b = a("Time Format", a.H24); } @NotNull private final eu.shoroa.bridge.feature.c.b b; @NotNull public final eu.shoroa.bridge.feature.c.b<a> u() { return this.b.a(this, a[0]); } static { KProperty[] arrayOfKProperty = new KProperty[1]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "timeFormat", "getTimeFormat()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; }
/*    */    @NotNull
/*    */   public String s() {
/* 11 */     LocalDateTime now = LocalDateTime.now();
/* 12 */     switch (b.a[((a)u().b()).ordinal()]) { case 1: 
/*    */       case 2:
/* 14 */        }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String t() {
/* 19 */     return s();
/*    */   }
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005"}, d2 = {"Leu/shoroa/bridge/feature/b/a/g$a;", "", "<init>", "(Ljava/lang/String;I)V", "H24", "H12"})
/* 22 */   public enum a { H24, H12;
/*    */     
/*    */     @NotNull
/*    */     public static EnumEntries<a> a() {
/*    */       return b;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\g.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */