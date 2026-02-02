/*    */ package eu.shoroa.bridge.feature.b.a;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.JvmName;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\020\n\002\020\t\n\002\b\r\b\001\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\006\032\0020\002¢\006\004\b\007\020\bR\032\020\003\032\0020\0028\007X\004¢\006\f\n\004\b\003\020\004\032\004\b\003\020\005j\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017"}, d2 = {"Leu/shoroa/bridge/feature/b/a/f$a;", "", "", "a", "J", "()J", "p0", "<init>", "(Ljava/lang/String;IJ)V", "SUNRISE", "DAY", "SUNSET", "NIGHT", "MIDNIGHT", "DYNAMIC", "CUSTOM"})
/*    */ public enum a
/*    */ {
/* 36 */   SUNRISE(2300L),
/* 37 */   DAY(0L),
/* 38 */   SUNSET(1244L),
/* 39 */   NIGHT(1300L),
/* 40 */   MIDNIGHT(1800L),
/* 41 */   DYNAMIC(-1L),
/* 42 */   CUSTOM(-1L);
/*    */   private final long a;
/*    */   
/*    */   a(long time) {
/*    */     this.a = time;
/*    */   }
/*    */   
/*    */   @JvmName(name = "a")
/*    */   public final long a() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static EnumEntries<a> b() {
/*    */     return c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\a\f$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */