/*     */ package eu.shoroa.bridge.c;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.json.JSONObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\002\020\016\n\000\n\002\020\000\n\000\n\002\020\002\n\002\b\002\020\005\032\0020\0042\006\020\001\032\0020\0002\b\020\003\032\004\030\0010\002H\n¢\006\004\b\005\020\006"}, d2 = {"", "p0", "", "p1", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)V"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function2<String, Object, Unit>
/*     */ {
/*     */   public final void a(String type, Object data) {
/*     */     JSONObject cosmetic, category;
/*     */     String cosmeticId;
/*     */     Pair[] arrayOfPair;
/*  58 */     Intrinsics.checkNotNullParameter(type, ""); String str1 = type; switch (str1.hashCode()) { case -1704678544: if (!str1.equals("COSMETIC_ADDED")) {
/*     */           break;
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  79 */         cosmetic = new JSONObject(String.valueOf(data));
/*  80 */         cosmeticId = cosmetic.getString("id");
/*     */         
/*  82 */         this.a.b("Player Ranks", "Ranks for players");
/*     */         return;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case -1670732769:
/*     */         if (!str1.equals("USER_COSMETICS_DETAILED")) {
/*     */           break;
/*     */         }
/* 102 */         a.a(this.a, new JSONObject(String.valueOf(data)));
/* 103 */         a.c(this.a).countDown(); return;case 511875668: if (!str1.equals("USER_CREATED")) break;  System.out.println("User Created: " + data); this.a.a("Hats", "Various hat cosmetics"); return;case 496172090: if (!str1.equals("RANK_CATEGORY_CREATED"))
/*     */           break;  category = new JSONObject(String.valueOf(data)); a.b(this.a, category.getString("id")); Intrinsics.checkNotNull(a.b(this.a)); arrayOfPair = new Pair[5]; arrayOfPair[0] = TuplesKt.to("name", "Default"); arrayOfPair[1] = TuplesKt.to("displayName", "Default Rank"); arrayOfPair[2] = TuplesKt.to("color", "#00FF00"); arrayOfPair[3] = TuplesKt.to("permissions", CollectionsKt.listOf("basic_access")); arrayOfPair[4] = TuplesKt.to("hierarchy", Integer.valueOf(1)); this.a.b(a.b(this.a), MapsKt.mapOf(arrayOfPair)); return;case 66247144: if (!str1.equals("ERROR"))
/* 105 */           break;  System.out.println("Error: " + data); return;case 1666941943: if (!str1.equals("COSMETIC_CATEGORY_CREATED")) break;  category = new JSONObject(String.valueOf(data)); a.a(this.a, category.getString("id")); Intrinsics.checkNotNull(a.a(this.a)); arrayOfPair = new Pair[4]; arrayOfPair[0] = TuplesKt.to("name", "Legendary Hat"); arrayOfPair[1] = TuplesKt.to("description", "A legendary hat"); arrayOfPair[2] = TuplesKt.to("texture", "legendary_hat_texture.png"); arrayOfPair[3] = TuplesKt.to("rarity", "LEGENDARY"); this.a.a(a.a(this.a), MapsKt.mapOf(arrayOfPair)); return;case -1139776610: if (!str1.equals("USER_DATA")) break;  System.out.println("User Data Received:"); System.out.println((new JSONObject(String.valueOf(data))).toString(4)); return;case 698836473: if (!str1.equals("USER_COSMETICS_RETRIEVED")) break;  System.out.println(new JSONObject(new Function0<String>(data) { @NotNull public final String a() { return String.valueOf(this.$a); } }
/* 106 */             )); return; }  System.out.println("Received message type: " + type);
/*     */   }
/*     */   
/*     */   null(a $receiver) {
/*     */     super(2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\c\a$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */