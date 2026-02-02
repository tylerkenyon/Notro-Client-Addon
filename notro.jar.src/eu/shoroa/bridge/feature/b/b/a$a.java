/*    */ package eu.shoroa.bridge.feature.b.b;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\020$\n\002\020\016\n\000\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\b\020\tJ#\020\006\032\0020\0052\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\002H\007¢\006\004\b\006\020\007"}, d2 = {"Leu/shoroa/bridge/feature/b/b/a$a;", "", "", "", "p0", "Leu/shoroa/bridge/feature/b/b/a;", "a", "(Ljava/util/Map;)Leu/shoroa/bridge/feature/b/b/a;", "<init>", "()V"})
/*    */ public final class a {
/*    */   private a() {}
/*    */   
/*    */   @NotNull
/*    */   public final a a(Map map) {
/* 15 */     Intrinsics.checkNotNullParameter(map, "");
/* 16 */     Intrinsics.checkNotNull(map.get("text"));
/* 17 */     Intrinsics.checkNotNull(map.get("key"));
/* 18 */     Object object = map.get("enabled"); (object instanceof Boolean) ? object : null; return new a((String)map.get("text"), ((Number)map.get("key")).intValue(), (((object instanceof Boolean) ? object : null) != null) ? ((object instanceof Boolean) ? object : null).booleanValue() : true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\b\b\a$a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */