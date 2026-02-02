/*     */ package eu.shoroa.notro.client.feature.a.a;
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\f\030\0002\0020\001B\007¢\006\004\b\002\020\003J\037\020\t\032\0020\b2\006\020\005\032\0020\0042\b\020\007\032\004\030\0010\006¢\006\004\b\t\020\nJ'\020\016\032\0020\b2\006\020\005\032\0020\0042\006\020\f\032\0020\0132\006\020\r\032\0020\013H\026¢\006\004\b\016\020\017J'\020\020\032\0020\b2\006\020\005\032\0020\0042\006\020\f\032\0020\0132\006\020\r\032\0020\013H\026¢\006\004\b\020\020\017R!\020\026\032\b\022\004\022\0020\0040\0218FX\002¢\006\f\n\004\b\022\020\023\032\004\b\024\020\025R!\020\032\032\b\022\004\022\0020\0270\0218FX\002¢\006\f\n\004\b\030\020\023\032\004\b\031\020\025R!\020\035\032\b\022\004\022\0020\0040\0218FX\002¢\006\f\n\004\b\033\020\023\032\004\b\034\020\025R!\020 \032\b\022\004\022\0020\0270\0218FX\002¢\006\f\n\004\b\036\020\023\032\004\b\037\020\025R!\020#\032\b\022\004\022\0020\0040\0218FX\002¢\006\f\n\004\b!\020\023\032\004\b\"\020\025R$\020%\032\004\030\0010$8\006@\006X\016¢\006\022\n\004\b%\020&\032\004\b'\020(\"\004\b)\020*R$\020\007\032\004\030\0010\0068\006@\006X\016¢\006\022\n\004\b\007\020+\032\004\b,\020-\"\004\b.\020/¨\0060"}, d2 = {"Leu/shoroa/notro/client/feature/module/ui/ModuleScoreboard;", "Leu/shoroa/bridge/feature/module/Module;", "<init>", "()V", "", "nvg", "Lnet/minecraft/class_1467;", "scoreObjective", "", "draw", "(ZLnet/minecraft/class_1467;)V", "", "displayWidth", "displayHeight", "dummy", "(ZII)V", "render", "Leu/shoroa/bridge/feature/setting/Setting;", "background$delegate", "Leu/shoroa/bridge/feature/setting/Setting;", "getBackground", "()Leu/shoroa/bridge/feature/setting/Setting;", "background", "Ljava/awt/Color;", "backgroundColor$delegate", "getBackgroundColor", "backgroundColor", "blur$delegate", "getBlur", "blur", "headerColor$delegate", "getHeaderColor", "headerColor", "redNumbers$delegate", "getRedNumbers", "redNumbers", "Lnet/minecraft/class_389;", "resolution", "Lnet/minecraft/class_389;", "getResolution", "()Lnet/minecraft/class_389;", "setResolution", "(Lnet/minecraft/class_389;)V", "Lnet/minecraft/class_1467;", "getScoreObjective", "()Lnet/minecraft/class_1467;", "setScoreObjective", "(Lnet/minecraft/class_1467;)V", "NotroClient"})
/*     */ @SourceDebugExtension({"SMAP\nModuleScoreboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleScoreboard.kt\neu/shoroa/notro/client/feature/module/ui/ModuleScoreboard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n766#2:225\n857#2,2:226\n1864#2,3:228\n766#2:231\n857#2,2:232\n1855#2,2:234\n1864#2,3:236\n*S KotlinDebug\n*F\n+ 1 ModuleScoreboard.kt\neu/shoroa/notro/client/feature/module/ui/ModuleScoreboard\n*L\n55#1:225\n55#1:226,2\n133#1:228,3\n167#1:231\n167#1:232,2\n173#1:234,2\n190#1:236,3\n*E\n"})
/*     */ public final class g extends b { @NotNull
/*     */   private final b b;
/*     */   @NotNull
/*     */   private final b c;
/*     */   @NotNull
/*     */   private final b d;
/*     */   @NotNull
/*     */   private final b e;
/*     */   @NotNull
/*     */   private final b f;
/*     */   @Nullable
/*     */   private class_1467 g;
/*     */   @Nullable
/*     */   private class_389 h;
/*     */   
/*  19 */   public g() { super("Scoreboard", "Shows the scoreboard", false, "scoreboard", false, 20, null);
/*  20 */     this.b = a("Red Numbers", true);
/*  21 */     this.c = a("Background", true);
/*  22 */     this.d = a("Blur", true);
/*     */     
/*  24 */     this.e = a("Background Color", new Color(1342177280, true)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return (Boolean)this.a.d().b(); } }
/*     */       );
/*  26 */     this.f = a("Header Color", new Color(1610612736, true)).a(new Function0<Boolean>(this) { @NotNull public final Boolean a() { return (Boolean)this.a.d().b(); } }); }
/*     */   @NotNull public final b<Boolean> c() { return this.b.a(this, a[0]); }
/*  28 */   static { KProperty[] arrayOfKProperty = new KProperty[5]; arrayOfKProperty[0] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "redNumbers", "getRedNumbers()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[1] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "background", "getBackground()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[2] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "blur", "getBlur()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[3] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "backgroundColor", "getBackgroundColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); arrayOfKProperty[4] = (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl(g.class, "headerColor", "getHeaderColor()Leu/shoroa/bridge/feature/setting/Setting;", 0)); a = (KProperty<Object>[])arrayOfKProperty; } @NotNull public final b<Boolean> d() { return this.c.a(this, a[1]); } @Nullable public final class_1467 v() { return this.g; } @NotNull public final b<Boolean> s() { return this.d.a(this, a[2]); } @NotNull public final b<Color> t() { return this.e.a(this, a[3]); } @NotNull public final b<Color> u() { return this.f.a(this, a[4]); } public final void a(class_1467 <set-?>) { this.g = <set-?>; } @Nullable
/*  29 */   public final class_389 w() { return this.h; } public final void a(class_389 <set-?>) { this.h = <set-?>; }
/*     */    public void a(boolean nvg, int displayWidth, int displayHeight) {
/*  31 */     c(200.0F).d(90.0F);
/*  32 */     a(nvg, this.g);
/*     */   }
/*     */   
/*     */   public void b(boolean nvg, int displayWidth, int displayHeight) {
/*  36 */     class_1600 mc = class_1600.method_2965();
/*  37 */     Intrinsics.checkNotNull(BridgeClient.a.b()); e vr = BridgeClient.a.b().vanillaRenderer();
/*     */     
/*  39 */     boolean inServer = (mc.field_3803 != null && 
/*  40 */       mc.field_10310 != null && 
/*  41 */       !mc.method_2907());
/*     */     
/*  43 */     mc.field_10310.method_5445(); class_1467 scoreboardObj = (mc.field_10310 != null && mc.field_10310.method_5445() != null) ? mc.field_10310.method_5445().method_4875(1) : null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     if (inServer && scoreboardObj != null)
/*     */     
/*  53 */     { class_1471 scoreboard = scoreboardObj.method_4845();
/*  54 */       Collection scores = scoreboard.method_4903(scoreboardObj);
/*  55 */       Intrinsics.checkNotNull(scores); Iterable $this$filter$iv = scores; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 225 */       Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 226 */       for (Object element$iv$iv : iterable1) { class_1469 it = (class_1469)element$iv$iv; int $i$a$-filter-ModuleScoreboard$dummy$filtered$1 = 0; Intrinsics.checkNotNullExpressionValue(it.method_4872(), ""); if ((it.method_4872() != null && !StringsKt.startsWith$default(it.method_4872(), "#", false, 2, null))) destination$iv$iv.add(element$iv$iv);  }
/* 227 */        List filtered = (List)destination$iv$iv; List collection = (filtered.size() > 15) ? CollectionsKt.takeLast(filtered, 15) : filtered; Intrinsics.checkNotNullExpressionValue(scoreboardObj.method_4849(), ""); float f1 = vr.a(scoreboardObj.method_4849()); for (class_1469 score : collection) { class_1468 team = scoreboard.method_4904(score.method_4872()); String playerName = class_1468.method_5565((class_1599)team, score.method_4872()); String scoreText = "" + class_1442.field_5495 + class_1442.field_5495; String fullText = playerName + ": " + playerName; f1 = Math.max(f1, vr.a(fullText)); }  float f2 = (collection.size() + 1) * 18.0F; c(f1); d(f2); a(nvg, scoreboardObj); return; }  String headerFmt = "" + class_1442.field_5493 + class_1442.field_5493; String after = "" + class_1442.field_5504 + class_1442.field_5504; String[] arrayOfString = new String[5]; arrayOfString[0] = "§lScoreboard"; arrayOfString[1] = headerFmt + "Rank: " + headerFmt + "Normal"; arrayOfString[2] = headerFmt + "Level: " + headerFmt + "[" + class_1442.field_5504 + "✫10" + class_1442.field_5489 + "]"; arrayOfString[3] = "----------------"; arrayOfString[4] = "" + class_1442.field_5497 + "Playtime: " + class_1442.field_5497 + "1h 30m"; List lines = CollectionsKt.listOf((Object[])arrayOfString); float maxWidth = 0.0F; for (String line : lines) maxWidth = Math.max(maxWidth, vr.a(line));  maxWidth += 12.0F; float totalHeight = lines.size() * 18.0F + 4.0F; c(maxWidth); d(totalHeight); if (nvg) { if (((Boolean)s().b()).booleanValue())
/* 228 */         d.a(d.a, l(), m(), maxWidth, totalHeight, 0.0F, d.a.a(), 0.0F, 64, null);  d.a(d.a, l(), m(), maxWidth, 18.0F, 0.0F, d.a.a((Color)u().b()), 0.0F, 64, null); d.a(d.a, l(), m() + 18.0F, maxWidth, totalHeight - 18.0F, 0.0F, d.a.a((Color)t().b()), 0.0F, 64, null); } else { Iterable $this$forEachIndexed$iv = lines; int $i$f$forEachIndexed = 0; int index$iv = 0;
/* 229 */       Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  String str = (String)item$iv; int index = i, $i$a$-forEachIndexed-ModuleScoreboard$dummy$1 = 0; float yPos = m() + 18.0F * index + 2.0F; Intrinsics.checkNotNullExpressionValue(Color.WHITE, ""); vr.a(str, l() + 6.0F, yPos, Color.WHITE, false); }  }
/*     */      } public final void a(boolean nvg, class_1467 scoreObjective) { if (scoreObjective == null)
/* 231 */       return;  class_1600 mc = class_1600.method_2965(); int displayWidth = Display.getWidth(); int displayHeight = Display.getHeight(); Intrinsics.checkNotNull(BridgeClient.a.b()); e vr = BridgeClient.a.b().vanillaRenderer(); Intrinsics.checkNotNullExpressionValue(scoreObjective.method_4845(), ""); class_1471 scoreboard = scoreObjective.method_4845(); Collection scores = scoreboard.method_4903(scoreObjective); Intrinsics.checkNotNull(scores); Iterable $this$filter$iv = scores; int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 232 */     for (Object element$iv$iv : iterable1) { class_1469 it = (class_1469)element$iv$iv; int $i$a$-filter-ModuleScoreboard$draw$list$1 = 0; Intrinsics.checkNotNullExpressionValue(it.method_4872(), ""); if ((it.method_4872() != null && !StringsKt.startsWith$default(it.method_4872(), "#", false, 2, null))) destination$iv$iv.add(element$iv$iv);  }
/* 233 */      List list = (List)destination$iv$iv; List collection = (list.size() > 15) ? CollectionsKt.takeLast(list, 15) : list; float maxStringWidth = 0.0F; Intrinsics.checkNotNullExpressionValue(scoreObjective.method_4849(), ""); maxStringWidth = vr.a(scoreObjective.method_4849()) + 4.0F; float totalHeight = collection.size() * 18.0F + 18.0F; Iterable $this$forEach$iv = collection; int $i$f$forEach = 0;
/* 234 */     Iterator iterator1 = $this$forEach$iv.iterator(); if (iterator1.hasNext()) { Object element$iv = iterator1.next(); class_1469 score = (class_1469)element$iv; int $i$a$-forEach-ModuleScoreboard$draw$1 = 0; class_1468 scorePlayerTeam = scoreboard.method_4904(score.method_4872()); }
/*     */      float cx = l() + n() / 2.0F; float cy = m() + o() / 2.0F; float x = (cx > displayWidth / 2.0F) ? (l() - maxStringWidth + n()) : l(); float y = (cy > displayHeight / 2.0F) ? (m() - totalHeight + o()) : m(); Iterable $this$forEachIndexed$iv = collection; int $i$f$forEachIndexed = 0;
/* 236 */     int index$iv = 0;
/* 237 */     Iterator iterator2 = $this$forEachIndexed$iv.iterator(); if (iterator2.hasNext()) { Object item$iv = iterator2.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  class_1469 class_1469 = (class_1469)item$iv; int index = i, $i$a$-forEachIndexed-ModuleScoreboard$draw$2 = 0;
/*     */       class_1468 scorePlayerTeam = scoreboard.method_4904(class_1469.method_4872());
/*     */       String playerName = class_1468.method_5565((class_1599)scorePlayerTeam, class_1469.method_4872());
/*     */       String scorePoints = "" + class_1442.field_5495 + class_1442.field_5495;
/*     */       float yPosition = y + collection.size() * 18.0F - index * 18.0F;
/*     */       float xEnd = maxStringWidth + 2.0F; }
/*     */      }
/*     */    }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\feature\a\a\g.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */