package eu.shoroa.bridge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "BridgeClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "eu.shoroa.bridge.BridgeClient$postInit$job$1")
@SourceDebugExtension({"SMAP\nBridgeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeClient.kt\neu/shoroa/bridge/BridgeClient$postInit$job$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1855#2,2:139\n*S KotlinDebug\n*F\n+ 1 BridgeClient.kt\neu/shoroa/bridge/BridgeClient$postInit$job$1\n*L\n72#1:139,2\n*E\n"})
final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int a;
  
  c(BridgeClient $receiver, Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: pop
    //   4: aload_0
    //   5: getfield a : I
    //   8: tableswitch default -> 243, 0 -> 28
    //   28: aload_1
    //   29: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   32: aload_0
    //   33: getfield b : Leu/shoroa/bridge/BridgeClient;
    //   36: invokevirtual getPlayerUuid : ()Ljava/lang/String;
    //   39: dup
    //   40: ifnull -> 237
    //   43: astore_2
    //   44: aload_0
    //   45: getfield b : Leu/shoroa/bridge/BridgeClient;
    //   48: astore_3
    //   49: aload_2
    //   50: astore #4
    //   52: iconst_0
    //   53: istore #5
    //   55: aload_3
    //   56: getfield socketClient : Leu/shoroa/bridge/SocketClient;
    //   59: aload #4
    //   61: invokevirtual getUser : (Ljava/lang/String;)Leu/shoroa/bridge/ServerUser;
    //   64: astore #6
    //   66: aload #6
    //   68: ifnull -> 233
    //   71: aload_3
    //   72: aload #6
    //   74: invokevirtual getMcName : ()Ljava/lang/String;
    //   77: aload #6
    //   79: invokevirtual getRank : ()Ljava/util/Map;
    //   82: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   87: invokevirtual log : (Ljava/lang/String;)V
    //   90: aload #6
    //   92: invokevirtual getCosmetics : ()Ljava/util/List;
    //   95: astore #7
    //   97: aload #7
    //   99: ifnull -> 227
    //   102: aload #7
    //   104: checkcast java/lang/Iterable
    //   107: astore #8
    //   109: iconst_0
    //   110: istore #9
    //   112: aload #8
    //   114: invokeinterface iterator : ()Ljava/util/Iterator;
    //   119: astore #10
    //   121: aload #10
    //   123: invokeinterface hasNext : ()Z
    //   128: ifeq -> 165
    //   131: aload #10
    //   133: invokeinterface next : ()Ljava/lang/Object;
    //   138: astore #11
    //   140: aload #11
    //   142: checkcast java/util/Map
    //   145: astore #12
    //   147: iconst_0
    //   148: istore #13
    //   150: aload_3
    //   151: aload #12
    //   153: <illegal opcode> makeConcatWithConstants : (Ljava/util/Map;)Ljava/lang/String;
    //   158: invokevirtual log : (Ljava/lang/String;)V
    //   161: nop
    //   162: goto -> 121
    //   165: nop
    //   166: new com/google/gson/Gson
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: astore #8
    //   175: aload #8
    //   177: aload #7
    //   179: invokevirtual toJson : (Ljava/lang/Object;)Ljava/lang/String;
    //   182: astore #9
    //   184: getstatic eu/shoroa/bridge/BridgeClient.a : Leu/shoroa/bridge/BridgeClient$a;
    //   187: invokevirtual b : ()Leu/shoroa/bridge/BridgeClient;
    //   190: dup
    //   191: ifnull -> 200
    //   194: getfield cosmeticManager : Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
    //   197: goto -> 202
    //   200: pop
    //   201: aconst_null
    //   202: astore #10
    //   204: aload #10
    //   206: dup
    //   207: ifnull -> 223
    //   210: aload #9
    //   212: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   215: aload #9
    //   217: invokevirtual syncFromServer : (Ljava/lang/String;)V
    //   220: goto -> 233
    //   223: pop
    //   224: goto -> 233
    //   227: aload_3
    //   228: ldc 'User has no cosmetics list (null).'
    //   230: invokevirtual log : (Ljava/lang/String;)V
    //   233: nop
    //   234: goto -> 239
    //   237: pop
    //   238: nop
    //   239: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   242: areturn
    //   243: new java/lang/IllegalStateException
    //   246: dup
    //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   249: invokespecial <init> : (Ljava/lang/String;)V
    //   252: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #63	-> 3
    //   #64	-> 32
    //   #65	-> 55
    //   #66	-> 66
    //   #67	-> 71
    //   #70	-> 90
    //   #71	-> 97
    //   #72	-> 102
    //   #139	-> 112
    //   #73	-> 150
    //   #74	-> 161
    //   #139	-> 162
    //   #140	-> 165
    //   #76	-> 166
    //   #77	-> 175
    //   #79	-> 184
    //   #80	-> 204
    //   #82	-> 227
    //   #85	-> 233
    //   #64	-> 234
    //   #86	-> 239
    //   #63	-> 243
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   32	211	0	this	Leu/shoroa/bridge/BridgeClient$c;
    //   32	211	1	$result	Ljava/lang/Object;
    //   52	14	4	uuid	Ljava/lang/String;
    //   55	179	5	$i$a$-let-BridgeClient$postInit$job$1$1	I
    //   66	31	6	user	Leu/shoroa/bridge/ServerUser;
    //   97	87	7	cosmeticsList	Ljava/util/List;
    //   109	12	8	$this$forEach$iv	Ljava/lang/Iterable;
    //   112	54	9	$i$f$forEach	I
    //   140	22	11	element$iv	Ljava/lang/Object;
    //   147	15	12	cosmetic	Ljava/util/Map;
    //   150	12	13	$i$a$-forEach-BridgeClient$postInit$job$1$1$1	I
    //   175	9	8	gson	Lcom/google/gson/Gson;
    //   184	40	9	jsonArray	Ljava/lang/String;
    //   204	20	10	cm	Leu/shoroa/bridge/feature/cosmetic/CosmeticManager;
  }
  
  @NotNull
  public final Continuation<Unit> create(Object value, Continuation<? super c> $completion) {
    return (Continuation<Unit>)new c(this.b, $completion);
  }
  
  @Nullable
  public final Object a(CoroutineScope p1, Continuation<?> p2) {
    return ((c)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\BridgeClient$c.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */