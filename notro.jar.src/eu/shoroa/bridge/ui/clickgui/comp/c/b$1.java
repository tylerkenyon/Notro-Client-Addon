/*    */ package eu.shoroa.bridge.ui.clickgui.comp.c;
/*    */ import java.io.OutputStream;
/*    */ import java.net.HttpURLConnection;
/*    */ import kotlin.Unit;
/*    */ import kotlin.text.Regex;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\020\002\n\002\b\002\020\001\032\0020\000H\n¢\006\004\b\001\020\002"}, d2 = {"", "a", "()V"})
/*    */ @SourceDebugExtension({"SMAP\nImgurUploader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImgurUploader.kt\neu/shoroa/bridge/ui/clickgui/comp/screenshots/ImgurUploader$upload$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/*    */ final class null extends Lambda implements Function0<Unit> {
/*    */   public final void a() {
/*    */     try {
/* 12 */       URL url = new URL("https://api.imgur.com/3/image");
/* 13 */       Intrinsics.checkNotNull(url.openConnection()); HttpURLConnection conn = (HttpURLConnection)url.openConnection();
/* 14 */       conn.setRequestMethod("POST");
/* 15 */       conn.setDoOutput(true);
/* 16 */       conn.setRequestProperty("Authorization", "Client-ID YOUR_CLIENT_ID");
/*    */       
/* 18 */       byte[] imageBytes = FilesKt.readBytes(this.$a);
/* 19 */       String base64Image = Base64.getEncoder().encodeToString(imageBytes);
/* 20 */       String data = "image=" + base64Image;
/*    */       
/* 22 */       OutputStream outputStream = conn.getOutputStream(); Throwable throwable = null; try { OutputStream it = outputStream;
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
/* 35 */         int $i$a$-use-ImgurUploader$upload$1$1 = 0;
/*    */         Intrinsics.checkNotNullExpressionValue(data.getBytes(Charsets.UTF_8), "");
/*    */         it.write(data.getBytes(Charsets.UTF_8));
/*    */         Unit unit = Unit.INSTANCE; }
/*    */       catch (Throwable throwable1)
/*    */       { throwable = throwable1 = null;
/*    */         throw throwable1; }
/*    */       finally
/*    */       { CloseableKt.closeFinally(outputStream, throwable); }
/*    */       
/*    */       Intrinsics.checkNotNullExpressionValue(conn.getInputStream(), "");
/*    */       InputStream inputStream = conn.getInputStream();
/*    */       Charset charset = Charsets.UTF_8;
/*    */       InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
/*    */       char c = ' ';
/*    */       String response = TextStreamsKt.readText((inputStreamReader instanceof BufferedReader) ? inputStreamReader : new BufferedReader(inputStreamReader, c));
/*    */       (String)Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues().get(1);
/*    */       String link = (Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null) != null && Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues() != null && (String)Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues().get(1) != null) ? StringsKt.replace$default(Regex.find$default(new Regex("\"link\":\"(.*?)\""), response, 0, 2, null).getGroupValues().get(1), "\\/", "/", false, 4, null) : null;
/*    */       this.$b.invoke(link);
/*    */     } catch (Exception e) {
/*    */       e.printStackTrace();
/*    */       this.$b.invoke(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   null(File $file, Function1<String, Unit> $callback) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridg\\ui\clickgui\comp\c\b$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */