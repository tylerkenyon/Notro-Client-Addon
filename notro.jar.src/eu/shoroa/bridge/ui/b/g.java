/*    */ package eu.shoroa.bridge.ui.b;@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\0002\0020\001B\007¢\006\004\b\021\020\022J\035\020\007\032\0020\0062\006\020\003\032\0020\0022\006\020\005\032\0020\004¢\006\004\b\007\020\bJ\025\020\007\032\0020\0062\006\020\003\032\0020\002¢\006\004\b\007\020\tJ)\020\007\032\0020\0002\030\020\003\032\024\022\004\022\0020\002\022\004\022\0020\004\022\004\022\0020\0060\nH\007¢\006\004\b\007\020\013J#\020\007\032\0020\0002\022\020\003\032\016\022\004\022\0020\002\022\004\022\0020\0060\fH\007¢\006\004\b\007\020\rR(\020\007\032\024\022\004\022\0020\002\022\004\022\0020\004\022\004\022\0020\0060\n8\002@\002X\016¢\006\006\n\004\b\016\020\017R\"\020\016\032\016\022\004\022\0020\002\022\004\022\0020\0060\f8\002@\002X\016¢\006\006\n\004\b\007\020\020"}, d2 = {"Leu/shoroa/bridge/ui/b/g;", "", "Leu/shoroa/bridge/ui/b/d;", "p0", "", "p1", "", "a", "(Leu/shoroa/bridge/ui/b/d;Z)V", "(Leu/shoroa/bridge/ui/b/d;)V", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)Leu/shoroa/bridge/ui/b/g;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Leu/shoroa/bridge/ui/b/g;", "b", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "<init>", "()V"})
/*    */ public final class g {
/*    */   @NotNull
/*  4 */   private Function1<? super d, Unit> a = null.a; @NotNull
/*  5 */   private Function2<? super d, ? super Boolean, Unit> b = null.a;
/*    */   
/*    */   public final void a(d element) {
/*  8 */     Intrinsics.checkNotNullParameter(element, ""); this.a.invoke(element);
/*    */   }
/*    */   
/*    */   public final void a(d element, boolean hovered) {
/* 12 */     Intrinsics.checkNotNullParameter(element, ""); this.b.invoke(element, Boolean.valueOf(hovered));
/*    */   }
/*    */   @NotNull
/*    */   public final g a(Function1<? super d, Unit> call) {
/* 16 */     Intrinsics.checkNotNullParameter(call, ""); this.a = call;
/* 17 */     return this;
/*    */   }
/*    */   @NotNull
/*    */   public final g a(Function2<? super d, ? super Boolean, Unit> call) {
/* 21 */     Intrinsics.checkNotNullParameter(call, ""); this.b = call;
/* 22 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\b\g.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */