/*    */ package eu.shoroa.bridge.d.b;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\002\020\t\n\000\n\002\020\013\n\002\b\002\020\003\032\0020\0022\006\020\001\032\0020\000H\013¢\006\004\b\003\020\004"}, d2 = {"", "p0", "", "a", "(Ljava/lang/Long;)Ljava/lang/Boolean;"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Long, Boolean>
/*    */ {
/*    */   null(long $currentTime) {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Boolean a(Long t) {
/* 31 */     Intrinsics.checkNotNullParameter(t, ""); return Boolean.valueOf((this.$a - t.longValue() > 1000L));
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\d\b\a$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */