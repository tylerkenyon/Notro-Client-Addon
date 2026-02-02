/*     */ package eu.shoroa.notro.bridge;
/*     */ import eu.shoroa.bridge.d.c.a;
/*     */ import eu.shoroa.notro.a.a;
/*     */ import eu.shoroa.notro.a.f;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.class_1600;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1723;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\006\n\002\030\002\n\002\020\b\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\030\0002\0020\001B\007¢\006\004\b\002\020\003J\037\020\007\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006H\026¢\006\004\b\007\020\bJ\037\020\t\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006H\026¢\006\004\b\t\020\bJ\027\020\f\032\n \013*\004\030\0010\n0\nH\026¢\006\004\b\f\020\rJ\017\020\017\032\0020\016H\026¢\006\004\b\017\020\003J\017\020\020\032\0020\016H\026¢\006\004\b\020\020\003J\027\020\021\032\n \013*\004\030\0010\n0\nH\026¢\006\004\b\021\020\rJ'\020\023\032\0020\0162\026\020\022\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006H\026¢\006\004\b\023\020\024R;\020\032\032&\022\004\022\0020\026\022\b\022\0060\027R\0020\0300\025j\022\022\004\022\0020\026\022\b\022\0060\027R\0020\030`\0318\006¢\006\f\n\004\b\032\020\033\032\004\b\034\020\035¨\006\036"}, d2 = {"Leu/shoroa/notro/bridge/IResourcePackRepositoryImpl;", "Leu/shoroa/bridge/feature/bridges/impl/IResourcePackRepository;", "<init>", "()V", "Ljava/util/ArrayList;", "Leu/shoroa/bridge/utils/resource/PackEntry;", "Lkotlin/collections/ArrayList;", "activeEntries", "()Ljava/util/ArrayList;", "allEntries", "Ljava/io/File;", "kotlin.jvm.PlatformType", "dir", "()Ljava/io/File;", "", "openDir", "refresh", "serverDir", "list", "setActiveEntries", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "", "Lnet/minecraft/class_1657$class_1659;", "Lnet/minecraft/class_1657;", "Lkotlin/collections/HashMap;", "packCahce", "Ljava/util/HashMap;", "getPackCahce", "()Ljava/util/HashMap;", "NotroClient"})
/*     */ @SourceDebugExtension({"SMAP\nIResourcePackRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IResourcePackRepositoryImpl.kt\neu/shoroa/notro/bridge/IResourcePackRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1855#2,2:106\n1855#2,2:108\n1855#2:110\n1856#2:112\n1#3:111\n*S KotlinDebug\n*F\n+ 1 IResourcePackRepositoryImpl.kt\neu/shoroa/notro/bridge/IResourcePackRepositoryImpl\n*L\n24#1:106,2\n40#1:108,2\n57#1:110\n57#1:112\n*E\n"})
/*     */ public final class IResourcePackRepositoryImpl implements g {
/*     */   @NotNull
/*  18 */   private final HashMap<Integer, class_1657.class_1659> packCahce = new HashMap<>(); @NotNull public final HashMap<Integer, class_1657.class_1659> getPackCahce() { return this.packCahce; }
/*     */   
/*  20 */   public File dir() { return a.c().notro$dirResourcepacks(); }
/*  21 */   public File serverDir() { return a.c().notro$dirServerResourcepacks(); }
/*     */   @NotNull
/*  23 */   public ArrayList<a> allEntries() { ArrayList<a> toReturn = new ArrayList();
/*  24 */     Intrinsics.checkNotNullExpressionValue(a.c().notro$repositoryEntriesAll(), ""); Iterable $this$forEach$iv = a.c().notro$repositoryEntriesAll(); int $i$f$forEach = 0;
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
/* 106 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); class_1657.class_1659 it = (class_1657.class_1659)element$iv; int $i$a$-forEach-IResourcePackRepositoryImpl$allEntries$1 = 0; Intrinsics.checkNotNull(it); f e = (f)it; it.method_5911(class_1600.method_2965().method_5570()); Intrinsics.checkNotNull(e.resourcePackFile()); Intrinsics.checkNotNullExpressionValue(e.reResourcePack().method_5899(), ""); Intrinsics.checkNotNull(e.rePackMetadataSection().method_5976().method_7471()); }
/*     */      CollectionsKt.reverse(toReturn); return toReturn; } @NotNull public ArrayList<a> activeEntries() { ArrayList<a> toReturn = new ArrayList(); Intrinsics.checkNotNullExpressionValue(a.c().notro$repositoryEntries(), ""); Iterable $this$forEach$iv = a.c().notro$repositoryEntries(); int $i$f$forEach = 0;
/* 108 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); class_1657.class_1659 it = (class_1657.class_1659)element$iv; int $i$a$-forEach-IResourcePackRepositoryImpl$activeEntries$1 = 0; Intrinsics.checkNotNull(it); f e = (f)it; it.method_5911(class_1600.method_2965().method_5570()); Intrinsics.checkNotNull(e.resourcePackFile()); Intrinsics.checkNotNullExpressionValue(e.reResourcePack().method_5899(), ""); Intrinsics.checkNotNull(e.rePackMetadataSection().method_5976().method_7471()); }
/*     */      CollectionsKt.reverse(toReturn); return toReturn; } public void setActiveEntries(ArrayList list) { Intrinsics.checkNotNullParameter(list, ""); ArrayList<class_1657.class_1659> returnList = new ArrayList(); CollectionsKt.reverse(list); Iterable $this$forEach$iv = list; int $i$f$forEach = 0;
/* 110 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); a it = (a)element$iv; int $i$a$-forEach-IResourcePackRepositoryImpl$setActiveEntries$1 = 0; if ((class_1657.class_1659)this.packCahce.get(Integer.valueOf(it.b())) != null) {
/* 111 */         class_1657.class_1659 entry = this.packCahce.get(Integer.valueOf(it.b())); int $i$a$-let-IResourcePackRepositoryImpl$setActiveEntries$1$1 = 0;
/*     */         returnList.add(entry);
/*     */       } else {
/*     */         (class_1657.class_1659)this.packCahce.get(Integer.valueOf(it.b()));
/*     */       }  }
/*     */     
/*     */     a.c().notro$setActiveRepositories(returnList); }
/*     */ 
/*     */   
/*     */   public void openDir() {
/*     */     Intrinsics.checkNotNullExpressionValue(class_1600.method_2965().method_5572().method_5907(), "");
/*     */     File file = class_1600.method_2965().method_5572().method_5907();
/*     */     String string = file.getAbsolutePath();
/*     */     if (class_1723.method_6318() == class_1723.class_342.field_9090) {
/*     */       try {
/*     */         String[] arrayOfString = new String[2];
/*     */         arrayOfString[0] = "/usr/bin/open";
/*     */         arrayOfString[1] = string;
/*     */         Runtime.getRuntime().exec(arrayOfString);
/*     */         return;
/*     */       } catch (IOException iOException) {}
/*     */     } else if (class_1723.method_6318() == class_1723.class_342.field_925) {
/*     */       String str1 = "cmd.exe /C start \"Open file\" \"%s\"";
/*     */       Object[] arrayOfObject = new Object[1];
/*     */       arrayOfObject[0] = string;
/*     */       arrayOfObject = arrayOfObject;
/*     */       Intrinsics.checkNotNullExpressionValue(String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "");
/*     */       String string2 = String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length));
/*     */       try {
/*     */         Runtime.getRuntime().exec(string2);
/*     */         return;
/*     */       } catch (IOException iOException) {}
/*     */     } 
/*     */     boolean bl = false;
/*     */     try {
/*     */       Class<?> class_ = Class.forName("java.awt.Desktop");
/*     */       Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/*     */       Class[] arrayOfClass = new Class[1];
/*     */       arrayOfClass[0] = URI.class;
/*     */       Object[] arrayOfObject = new Object[1];
/*     */       arrayOfObject[0] = file.toURI();
/*     */       class_.getMethod("browse", arrayOfClass).invoke(object, arrayOfObject);
/*     */     } catch (Throwable var7) {
/*     */       bl = true;
/*     */     } 
/*     */     if (bl)
/*     */       Sys.openURL("file://" + string); 
/*     */   }
/*     */   
/*     */   public void refresh() {
/*     */     System.out.println("Refreshing resource packs..");
/*     */     System.out.println("Clearing client pack cache..");
/*     */     this.packCahce.clear();
/*     */     a.c().notro$updateRepositoryEntriesAll();
/*     */     class_1600.method_2965().method_5576();
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\IResourcePackRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */