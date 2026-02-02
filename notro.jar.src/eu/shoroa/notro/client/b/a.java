/*    */ package eu.shoroa.notro.client.b;
/*    */ import java.io.File;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Enumeration;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\002\n\002\b\004\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\021\020\022J'\020\007\032\b\022\004\022\0020\0020\0062\006\020\003\032\0020\0022\b\020\005\032\004\030\0010\004H\007¢\006\004\b\007\020\bJ\027\020\007\032\0020\t2\006\020\003\032\0020\tH\007¢\006\004\b\007\020\nJ\025\020\007\032\0020\0132\006\020\003\032\0020\002¢\006\004\b\007\020\fJ%\020\007\032\0020\0162\f\020\003\032\b\022\004\022\0020\0020\r2\006\020\005\032\0020\002H\002¢\006\004\b\007\020\017J\027\020\020\032\0020\0132\006\020\003\032\0020\002H\002¢\006\004\b\020\020\f"}, d2 = {"Leu/shoroa/notro/client/b/a;", "", "Ljava/io/File;", "p0", "Ljava/io/FileFilter;", "p1", "", "a", "(Ljava/io/File;Ljava/io/FileFilter;)Ljava/util/List;", "", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/io/File;)Z", "Ljava/util/ArrayList;", "", "(Ljava/util/ArrayList;Ljava/io/File;)V", "b", "<init>", "()V"})
/*    */ public final class a {
/*    */   public final boolean a(File file) {
/* 13 */     Intrinsics.checkNotNullParameter(file, ""); if (file.isDirectory())
/* 14 */     { Intrinsics.checkNotNull(file.listFiles()); File[] arrayOfFile; byte b; int i; for (arrayOfFile = file.listFiles(), b = 0, i = arrayOfFile.length; b < i; ) { File sub = arrayOfFile[b];
/* 15 */         if (Intrinsics.areEqual(sub.getName(), "pack.mcmeta")) return true;  b++; }
/*    */        }
/* 17 */     else { Intrinsics.checkNotNullExpressionValue(file.getName(), ""); if (StringsKt.endsWith$default(file.getName(), ".zip", false, 2, null)) return b(file);  }
/* 18 */      return false;
/*    */   }
/*    */   @NotNull
/*    */   public static final a INSTANCE = new a();
/*    */   private final boolean b(File file) {
/*    */     try {
/* 24 */       ZipFile zip = new ZipFile(file);
/* 25 */       Intrinsics.checkNotNullExpressionValue(zip.entries(), ""); Enumeration<? extends ZipEntry> entries = zip.entries();
/* 26 */       while (entries.hasMoreElements()) {
/* 27 */         ZipEntry entry = entries.nextElement();
/* 28 */         if (Intrinsics.areEqual(entry.getName(), "pack.mcmeta")) return true; 
/*    */       } 
/* 30 */     } catch (IOException e) {
/* 31 */       return false;
/*    */     } 
/* 33 */     return false;
/*    */   }
/*    */   @NotNull
/*    */   public final List<File> a(File dirResources, FileFilter rpFilter) {
/* 37 */     Intrinsics.checkNotNullParameter(dirResources, ""); ArrayList<File> toReturn = new ArrayList();
/* 38 */     if (dirResources.isDirectory()) {
/* 39 */       Intrinsics.checkNotNull(dirResources.listFiles()); File[] arrayOfFile; byte b; int i; for (arrayOfFile = dirResources.listFiles(), b = 0, i = arrayOfFile.length; b < i; ) { File f = arrayOfFile[b];
/* 40 */         Intrinsics.checkNotNull(f); a(toReturn, f); b++; }
/*    */     
/*    */     } 
/* 43 */     return toReturn;
/*    */   }
/*    */   
/*    */   private final void a(ArrayList<File> list, File file) {
/* 47 */     if (file.isDirectory() && !a(file))
/* 48 */     { Intrinsics.checkNotNull(file.listFiles()); File[] arrayOfFile; byte b; int i; for (arrayOfFile = file.listFiles(), b = 0, i = arrayOfFile.length; b < i; ) { File lFile = arrayOfFile[b];
/* 49 */         Intrinsics.checkNotNull(lFile); a(list, lFile); b++; }
/*    */        }
/* 51 */     else { list.add(file); }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String a(String formated) {
/* 58 */     Intrinsics.checkNotNullParameter(formated, ""); String unformated = "";
/* 59 */     Intrinsics.checkNotNullExpressionValue(formated.toCharArray(), ""); char[] chars = formated.toCharArray();
/* 60 */     char formatChar = '§';
/* 61 */     boolean enterFormat = false;
/* 62 */     boolean obfuscated = false;
/* 63 */     boolean superFormat = false; byte b; int i;
/* 64 */     for (b = 0, i = chars.length; b < i; ) { char c = chars[b];
/* 65 */       if (c == formatChar) {
/* 66 */         enterFormat = true;
/*    */         continue;
/*    */       } 
/* 69 */       if (enterFormat) {
/* 70 */         if (c == 'k') {
/* 71 */           obfuscated = true;
/*    */           continue;
/*    */         } 
/* 74 */         if ((!superFormat && c == 'l') || c == 'm' || c == 'n' || c == 'o') {
/* 75 */           superFormat = true;
/*    */           continue;
/*    */         } 
/* 78 */         if (c == 'r' || c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f') {
/* 79 */           obfuscated = false;
/* 80 */           superFormat = false;
/* 81 */           enterFormat = false;
/*    */           continue;
/*    */         } 
/* 84 */         if (obfuscated) {
/*    */           continue;
/*    */         }
/*    */       } 
/* 88 */       unformated = unformated + unformated; continue; b++; }
/*    */     
/* 90 */     return unformated;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\b\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */