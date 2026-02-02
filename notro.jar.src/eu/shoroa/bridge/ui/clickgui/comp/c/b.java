/*    */ package eu.shoroa.bridge.ui.clickgui.comp.c;
/*    */ import java.io.OutputStream;
/*    */ import java.net.HttpURLConnection;
/*    */ import kotlin.Unit;
/*    */ import kotlin.text.Regex;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\020\002\n\002\b\007\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\f\020\rJ+\020\b\032\0020\0062\006\020\003\032\0020\0022\024\020\007\032\020\022\006\022\004\030\0010\005\022\004\022\0020\0060\004¢\006\004\b\b\020\tR\024\020\b\032\0020\0058\002XT¢\006\006\n\004\b\n\020\013"}, d2 = {"Leu/shoroa/bridge/ui/clickgui/comp/c/b;", "", "Ljava/io/File;", "p0", "Lkotlin/Function1;", "", "", "p1", "a", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "b", "Ljava/lang/String;", "<init>", "()V"})
/*    */ public final class b {
/*    */   public final void a(File file, Function1<? super String, Unit> callback) {
/* 10 */     Intrinsics.checkNotNullParameter(file, ""); Intrinsics.checkNotNullParameter(callback, ""); ThreadsKt.thread$default(false, false, null, null, 0, new Function0<Unit>(file, callback) { public final void a() {
/*    */             try {
/* 12 */               URL url = new URL("https://api.imgur.com/3/image");
/* 13 */               Intrinsics.checkNotNull(url.openConnection()); HttpURLConnection conn = (HttpURLConnection)url.openConnection();
/* 14 */               conn.setRequestMethod("POST");
/* 15 */               conn.setDoOutput(true);
/* 16 */               conn.setRequestProperty("Authorization", "Client-ID YOUR_CLIENT_ID");
/*    */               
/* 18 */               byte[] imageBytes = FilesKt.readBytes(this.$a);
/* 19 */               String base64Image = Base64.getEncoder().encodeToString(imageBytes);
/* 20 */               String data = "image=" + base64Image;
/*    */               
/* 22 */               OutputStream outputStream = conn.getOutputStream(); Throwable throwable = null; try { OutputStream it = outputStream;
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
/* 35 */                 int $i$a$-use-ImgurUploader$upload$1$1 = 0;
/*    */                 Intrinsics.checkNotNullExpressionValue(data.getBytes(Charsets.UTF_8), "");
/*    */                 it.write(data.getBytes(Charsets.UTF_8));
/*    */                 Unit unit = Unit.INSTANCE; }
/*    */               catch (Throwable throwable1)
/*    */               { throwable = throwable1 = null;
/*    */                 throw throwable1; }
/*    */               finally
/*    */               { CloseableKt.closeFinally(outputStream, throwable); }
/*    */               
/*    */               Intrinsics.checkNotNullExpressionValue(conn.getInputStream(), "");
/*    */               InputStream inputStream = conn.getInputStream();
/*    */               Charset charset = Charsets.UTF_8;
/*    */               InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
/*    */               char c = ' ';
/*    */               String response = TextStreamsKt.readText((inputStreamReader instanceof BufferedReader) ? inputStreamReader : new BufferedReader(inputStreamReader, c));
/*    */               (String)Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues().get(1);
/*    */               String link = (Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null) != null && Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues() != null && (String)Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues().get(1) != null) ? StringsKt.replace$default(Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues().get(1), "\\/", "/", false, 4, null) : null;
/*    */               this.$b.invoke(link);
/*    */             } catch (Exception e) {
/*    */               e.printStackTrace();
/*    */               this.$b.invoke(null);
/*    */             } 
/*    */           } }
/*    */         31, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final b INSTANCE = new b();
/*    */   @NotNull
/*    */   private static final String b = "YOUR_CLIENT_ID";
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */