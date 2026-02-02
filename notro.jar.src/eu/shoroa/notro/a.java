/*     */ package eu.shoroa.notro;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.util.UUID;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
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
/*     */ public final class a
/*     */ {
/*     */   private static final String a = "https://api.mojang.com/users/profiles/minecraft/";
/*  29 */   private static final Pattern b = Pattern.compile("\"id\"\\s*:\\s*\"(.*?)\"");
/*     */   
/*     */   private a() {
/*  32 */     throw new UnsupportedOperationException();
/*     */   }
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
/*     */   public static UUID a(String name) {
/*  68 */     String output = c("https://api.mojang.com/users/profiles/minecraft/" + name);
/*  69 */     Matcher m = b.matcher(output);
/*  70 */     if (m.find()) {
/*  71 */       return UUID.fromString(b(m.group(1)));
/*     */     }
/*  73 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String b(String uuid) {
/*  83 */     StringBuilder sb = new StringBuilder(uuid);
/*  84 */     sb.insert(8, '-');
/*  85 */     sb.insert(13, '-');
/*  86 */     sb.insert(18, '-');
/*  87 */     sb.insert(23, '-');
/*  88 */     return sb.toString();
/*     */   }
/*     */   
/*     */   private static String c(String urlStr) {
/*  92 */     StringBuilder sb = new StringBuilder();
/*     */     
/*  94 */     BufferedReader br = null;
/*  95 */     InputStreamReader in = null;
/*     */     try {
/*  97 */       URLConnection conn = (new URL(urlStr)).openConnection();
/*  98 */       if (conn != null) {
/*  99 */         conn.setReadTimeout(60000);
/*     */       }
/* 101 */       if (conn != null && conn.getInputStream() != null) {
/* 102 */         in = new InputStreamReader(conn.getInputStream(), "UTF-8");
/* 103 */         br = new BufferedReader(in);
/* 104 */         String line = br.readLine();
/* 105 */         while (line != null) {
/* 106 */           sb.append(line).append("\n");
/* 107 */           line = br.readLine();
/*     */         } 
/*     */       } 
/* 110 */     } catch (Throwable t) {
/* 111 */       t.printStackTrace();
/*     */     } finally {
/* 113 */       if (br != null) {
/*     */         try {
/* 115 */           br.close();
/* 116 */         } catch (Throwable throwable) {}
/*     */       }
/*     */       
/* 119 */       if (in != null) {
/*     */         try {
/* 121 */           in.close();
/* 122 */         } catch (Throwable throwable) {}
/*     */       }
/*     */     } 
/*     */     
/* 126 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */