/*     */ package eu.shoroa.notro.client;
/*     */ import eu.shoroa.bridge.BridgeClient;
/*     */ import eu.shoroa.bridge.a.d;
/*     */ import eu.shoroa.bridge.a.e;
/*     */ import eu.shoroa.bridge.a.f;
/*     */ import eu.shoroa.bridge.a.g;
/*     */ import eu.shoroa.bridge.b.c.a;
/*     */ import eu.shoroa.bridge.b.c.b;
/*     */ import eu.shoroa.bridge.b.e;
/*     */ import eu.shoroa.bridge.d.b.a;
/*     */ import eu.shoroa.bridge.d.e.a;
/*     */ import eu.shoroa.bridge.feature.a.a;
/*     */ import eu.shoroa.bridge.feature.a.b;
/*     */ import eu.shoroa.bridge.feature.b.a.e;
/*     */ import eu.shoroa.bridge.feature.b.b;
/*     */ import eu.shoroa.bridge.feature.cosmetic.CosmeticManager;
/*     */ import eu.shoroa.bridge.feature.cosmetic.b;
/*     */ import eu.shoroa.bridge.ui.Screen;
/*     */ import eu.shoroa.bridge.ui.a.b;
/*     */ import eu.shoroa.bridge.ui.clickgui.b;
/*     */ import eu.shoroa.notro.bridge.IDisplayImpl;
/*     */ import eu.shoroa.notro.bridge.IInputImpl;
/*     */ import eu.shoroa.notro.bridge.IKeyboardImpl;
/*     */ import eu.shoroa.notro.bridge.IMouseImpl;
/*     */ import eu.shoroa.notro.bridge.IPlayerImpl;
/*     */ import eu.shoroa.notro.bridge.IResourcePackRepositoryImpl;
/*     */ import eu.shoroa.notro.bridge.iScaledResolutionImpl;
/*     */ import eu.shoroa.notro.client.a.a;
/*     */ import eu.shoroa.notro.client.a.c;
/*     */ import eu.shoroa.notro.client.a.d;
/*     */ import eu.shoroa.notro.client.feature.a.a;
/*     */ import eu.shoroa.notro.client.feature.a.a.d;
/*     */ import eu.shoroa.notro.client.feature.a.a.e;
/*     */ import eu.shoroa.notro.client.feature.a.a.g;
/*     */ import eu.shoroa.notro.client.feature.a.e;
/*     */ import eu.shoroa.notro.client.feature.a.f;
/*     */ import eu.shoroa.notro.client.feature.a.g;
/*     */ import eu.shoroa.notro.client.feature.a.h;
/*     */ import eu.shoroa.notro.client.feature.a.i;
/*     */ import eu.shoroa.notro.client.feature.a.j;
/*     */ import eu.shoroa.notro.client.feature.cosmetic.b;
/*     */ import io.github.nevalackin.radbus.Listen;
/*     */ import java.sql.DriverManager;
/*     */ import kotlin.Unit;
/*     */ import net.legacyfabric.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
/*     */ import net.minecraft.class_1600;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ 
/*     */ public class Client extends BridgeClient implements ClientModInitializer {
/*  52 */   public static final Logger LOGGER = LoggerFactory.getLogger("Notro Client");
/*     */   
/*  54 */   public static final Client instance = new Client();
/*     */   public static Client getInstance() {
/*  56 */     return instance;
/*     */   }
/*     */   
/*     */   public void onInitializeClient() {
/*  60 */     LOGGER.info("Initializing client...");
/*     */ 
/*     */ 
/*     */     
/*  64 */     a.b(this);
/*  65 */     b.a.a((a)new IUtilsImpl());
/*  66 */     b.a.a((a)new IMouseImpl());
/*  67 */     b.a.a((a)new IMinecraftImpl());
/*  68 */     b.a.a((a)new IDisplayImpl());
/*  69 */     b.a.a((a)new IKeyboardImpl());
/*  70 */     b.a.a((a)new IInputImpl());
/*  71 */     b.a.a((a)new IResourcePackRepositoryImpl());
/*  72 */     b.a.a((a)new IPlayerImpl());
/*  73 */     b.a.a((a)new iScaledResolutionImpl());
/*     */     
/*  75 */     preInit(false);
/*  76 */     LOGGER.info("Client initialized.");
/*  77 */     ClientTickEvents.END_CLIENT_TICK.register(client -> DriverManager.println("Updating Animations"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void start() {
/*  84 */     LOGGER.info("Starting client...");
/*  85 */     LOGGER.info("Bridge client post INIT");
/*     */ 
/*     */     
/*  88 */     String uuid = String.valueOf(class_1600.method_2965().method_5568().method_6669().getId());
/*     */ 
/*     */     
/*  91 */     LOGGER.info("SYSTEM TEST: " + class_1600.method_2965().method_5568().method_6667());
/*     */     
/*  93 */     BridgeClient.a.b().setPlayerUuid(class_1600.method_2965().method_5568().method_5583());
/*  94 */     CosmeticManager manager = (BridgeClient.a.b()).cosmeticManager;
/*     */ 
/*     */     
/*  97 */     manager.setOnCosmeticsUpdated(() -> b.a.a());
/*     */ 
/*     */     
/* 100 */     postInit();
/* 101 */     LOGGER.info("Initializing shaders...");
/* 102 */     d.a.a((a)new a(), (b)new c());
/* 103 */     LOGGER.info("Initializing Client-Side modules...");
/*     */ 
/*     */ 
/*     */     
/* 107 */     moduleManager().a((b)new j());
/* 108 */     moduleManager().a((b)new a());
/* 109 */     moduleManager().a((b)new f());
/* 110 */     moduleManager().a((b)new c());
/* 111 */     moduleManager().a((b)new d());
/* 112 */     moduleManager().a((b)new f());
/* 113 */     moduleManager().a((b)new b());
/* 114 */     moduleManager().a((b)new e());
/* 115 */     moduleManager().a((b)new i());
/* 116 */     moduleManager().a((b)new h());
/* 117 */     moduleManager().a((b)new c());
/* 118 */     moduleManager().a((b)new e());
/* 119 */     moduleManager().a((b)new g());
/* 120 */     moduleManager().a((b)new g());
/* 121 */     moduleManager().a((b)new a());
/* 122 */     moduleManager().a((b)new b());
/* 123 */     moduleManager().c();
/*     */ 
/*     */     
/* 126 */     LOGGER.info("Initializing Client-Side cosmetics...");
/* 127 */     b.a.a();
/*     */     
/* 129 */     ((e)moduleManager().a(e.class)).t().a(a.a.k().f());
/* 130 */     ((e)moduleManager().a(e.class)).s().a(a.a.k().b());
/*     */     
/* 132 */     LOGGER.info("Client started.");
/*     */   }
/*     */ 
/*     */   
/*     */   public void log(String message) {
/* 137 */     LOGGER.info(message);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stop() {
/* 142 */     LOGGER.info("Stopping client...");
/* 143 */     (BridgeClient.a.b()).socketClient.sendRequest("end_tutorial", class_1600.method_2965().method_5568().method_6667() + ":true");
/* 144 */     moduleManager().b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearWingCache(String name) {
/* 149 */     c.g(name);
/*     */   }
/*     */   
/*     */   @Listen
/*     */   public void event_update(g e) {
/* 154 */     class_1600 mc = class_1600.method_2965();
/* 155 */     if (mc.field_10310 != null && BridgeClient.a.b().getPlayerUuid() == null) {
/* 156 */       String realUuid = mc.field_10310.method_2518();
/* 157 */       BridgeClient.a.b().setPlayerUuid(realUuid);
/* 158 */       LOGGER.info("[BridgeClient] Updated UUID from entity: " + realUuid);
/*     */ 
/*     */       
/* 161 */       BridgeClient.a.b().getWebSocket().startTutorial(realUuid);
/*     */     } 
/*     */     
/* 164 */     a.INSTANCE.a(instance -> {
/*     */           instance.b((class_1600.method_2965()).field_3823.field_941.method_6623());
/*     */           
/*     */           instance.a((class_1600.method_2965()).field_3823.field_940.method_6623());
/*     */           return Unit.INSTANCE;
/*     */         });
/* 170 */     if (b.a.a().bindDown("notro.key.clickgui")) {
/* 171 */       b.a.a().displayScreen((Screen)(this.clickgui = new b()));
/*     */     }
/* 173 */     if (b.a.a().bindDown("notro.key.Console")) {
/* 174 */       b.a.a().displayScreen((Screen)(this.Console = new b()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Listen
/*     */   public void event_tick(f e) {
/* 181 */     if (this.cosmeticManager.getCurrentCape() != null)
/* 182 */       for (b c : this.cosmeticManager.byType("cape")) {
/* 183 */         if (!c.equals(this.cosmeticManager.getCurrentCape())) c.a(); 
/*     */       }  
/*     */   }
/*     */   
/*     */   @Listen
/*     */   public void event_mouseclick(e e1) {
/* 189 */     a.INSTANCE.c(e1.b() - 100);
/*     */   }
/*     */   @Listen
/*     */   public void event_keyboard(d e) {
/* 193 */     a.INSTANCE.c(e.b());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public e vanillaRenderer() {
/* 198 */     return (e)new d();
/*     */   }
/*     */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\client\Client.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */