/*     */ package eu.shoroa.notro.client.a.a;
/*     */ import eu.shoroa.notro.client.a.a.a.e;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GL20;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\020\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\020\b\n\002\b\004\n\002\020\007\n\002\b\007\030\0002\0020\001B\017\022\006\020\n\032\0020\f¢\006\004\b\030\020\031J\r\020\003\032\0020\002¢\006\004\b\003\020\004J\r\020\005\032\0020\002¢\006\004\b\005\020\004J\r\020\006\032\0020\002¢\006\004\b\006\020\004J%\020\003\032\0020\0022\026\020\n\032\022\022\004\022\0020\b0\007j\b\022\004\022\0020\b`\t¢\006\004\b\003\020\013J\031\020\005\032\0020\r2\b\020\n\032\004\030\0010\fH\002¢\006\004\b\005\020\016J\037\020\003\032\0020\r2\006\020\n\032\0020\r2\006\020\017\032\0020\fH\002¢\006\004\b\003\020\020J\027\020\003\032\0020\f2\006\020\n\032\0020\fH\002¢\006\004\b\003\020\021J-\020\003\032\0020\0022\006\020\n\032\0020\0222\006\020\017\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\022¢\006\004\b\003\020\025J\025\020\003\032\0020\0022\006\020\n\032\0020\b¢\006\004\b\003\020\026R\024\020\003\032\0020\r8\002X\004¢\006\006\n\004\b\005\020\027R\024\020\005\032\0020\r8\002X\004¢\006\006\n\004\b\003\020\027R\024\020\006\032\0020\r8\002X\004¢\006\006\n\004\b\006\020\027"}, d2 = {"Leu/shoroa/notro/client/a/a/a;", "", "", "a", "()V", "b", "c", "Ljava/util/ArrayList;", "Leu/shoroa/notro/client/a/a/a/e;", "Lkotlin/collections/a;", "p0", "(Ljava/util/ArrayList;)V", "", "", "(Ljava/lang/String;)I", "p1", "(ILjava/lang/String;)I", "(Ljava/lang/String;)Ljava/lang/String;", "", "p2", "p3", "(FFFF)V", "(Leu/shoroa/notro/client/a/a/a/e;)V", "I", "<init>", "(Ljava/lang/String;)V"})
/*     */ public final class a {
/*     */   private final int a;
/*     */   
/*     */   public a(String fragSrc) {
/*  14 */     this.a = GL20.glCreateProgram();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  19 */     this.c = a(35633, a("vertex"));
/*  20 */     this.b = a(35632, a(fragSrc));
/*  21 */     GL20.glAttachShader(this.a, this.c);
/*  22 */     GL20.glAttachShader(this.a, this.b);
/*  23 */     GL20.glLinkProgram(this.a);
/*     */   }
/*     */   private final int b; private final int c;
/*     */   private final int a(int type, String src) {
/*  27 */     int shader = GL20.glCreateShader(type);
/*  28 */     GL20.glShaderSource(shader, src);
/*  29 */     GL20.glCompileShader(shader);
/*  30 */     return shader;
/*     */   }
/*     */   
/*     */   private final String a(String fileName) {
/*  34 */     StringBuilder sb = new StringBuilder();
/*     */ 
/*     */     
/*  37 */     Intrinsics.checkNotNull(Client.class.getResourceAsStream("/assets/notro/shaders/" + 
/*  38 */           fileName + ".glsl")); BufferedReader br = new BufferedReader(new InputStreamReader(Client.class.getResourceAsStream("/assets/notro/shaders/" + fileName + ".glsl")));
/*     */ 
/*     */ 
/*     */     
/*  42 */     br.lines().forEach(new Function1<String, Unit>(sb) { public final void a(String line) { Intrinsics.checkNotNullParameter(line, ""); this.$a.append(line + "\n"); } }::a);
/*  43 */     Intrinsics.checkNotNullExpressionValue(sb.toString(), ""); return sb.toString(); } private static final void a(Function1 $tmp0, Object p0) {
/*     */     Intrinsics.checkNotNullParameter($tmp0, "");
/*     */     $tmp0.invoke(p0);
/*     */   } public final void a() {
/*  47 */     GL20.glUseProgram(this.a);
/*     */   }
/*     */   
/*     */   public final void b() {
/*  51 */     GL20.glUseProgram(0);
/*     */   }
/*     */   
/*     */   public final void a(float x, float y, float w, float h) {
/*  55 */     GL11.glBegin(7);
/*  56 */     GL11.glTexCoord2f(0.0F, 1.0F);
/*  57 */     GL11.glVertex2f(x, y);
/*     */     
/*  59 */     GL11.glTexCoord2f(0.0F, 0.0F);
/*  60 */     GL11.glVertex2f(x, y + h);
/*     */     
/*  62 */     GL11.glTexCoord2f(1.0F, 0.0F);
/*  63 */     GL11.glVertex2f(x + w, y + h);
/*     */     
/*  65 */     GL11.glTexCoord2f(1.0F, 1.0F);
/*  66 */     GL11.glVertex2f(x + w, y);
/*  67 */     GL11.glEnd();
/*     */   }
/*     */   
/*     */   public final void c() {
/*  71 */     GL20.glDeleteProgram(this.a);
/*  72 */     GL20.glDeleteShader(this.c);
/*  73 */     GL20.glDeleteShader(this.b);
/*     */   }
/*     */   
/*     */   public final void a(ArrayList uniforms) {
/*  77 */     Intrinsics.checkNotNullParameter(uniforms, ""); for (e u : uniforms) {
/*  78 */       Intrinsics.checkNotNull(u); a(u);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void a(e u) {
/*  83 */     Intrinsics.checkNotNullParameter(u, ""); e e1 = u;
/*  84 */     if (e1 instanceof d) { GL20.glUniform1i(b(u.c()), ((d)u).a()); }
/*  85 */     else if (e1 instanceof b) { GL20.glUniform1f(b(u.c()), ((b)u).a()); }
/*  86 */     else if (e1 instanceof f) { GL20.glUniform2f(b(u.c()), ((f)u).a(), ((f)u).b()); }
/*  87 */     else if (e1 instanceof g) { GL20.glUniform3f(b(u.c()), ((g)u).a(), ((g)u).b(), ((g)u).d()); }
/*  88 */     else if (e1 instanceof h) { GL20.glUniform4f(b(u.c()), ((h)u).a(), ((h)u).b(), ((h)u).d(), ((h)u).e()); }
/*  89 */     else if (e1 instanceof a)
/*  90 */     { GL13.glActiveTexture(((a)u).b().b());
/*  91 */       GL11.glBindTexture(3553, ((a)u).a());
/*  92 */       GL20.glUniform1i(b(u.c()), 0); }
/*     */     
/*  94 */     else if (e1 instanceof c)
/*  95 */     { GL20.glUniform1(b(u.c()), ((c)u).a()); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   private final int b(String name) {
/* 101 */     Intrinsics.checkNotNull(name); return GL20.glGetUniformLocation(this.a, name);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\a\a\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */