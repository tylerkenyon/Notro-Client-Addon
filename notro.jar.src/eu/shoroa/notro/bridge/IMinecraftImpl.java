/*    */ package eu.shoroa.notro.bridge;
/*    */ import eu.shoroa.bridge.feature.a.a.d;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.class_1600;
/*    */ import net.minecraft.class_383;
/*    */ import net.minecraft.class_388;
/*    */ import net.minecraft.class_391;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\005\n\002\020\021\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\017\020\005\032\0020\004H\026¢\006\004\b\005\020\006J\017\020\007\032\0020\004H\026¢\006\004\b\007\020\006J\017\020\t\032\0020\bH\026¢\006\004\b\t\020\003J\017\020\n\032\0020\bH\026¢\006\004\b\n\020\003J\017\020\013\032\0020\bH\026¢\006\004\b\013\020\003J\017\020\f\032\0020\bH\026¢\006\004\b\f\020\003J\017\020\r\032\0020\bH\026¢\006\004\b\r\020\003J\025\020\020\032\b\022\004\022\0020\0170\016H\026¢\006\004\b\020\020\021R\034\020\024\032\n \023*\004\030\0010\0220\0228\002X\004¢\006\006\n\004\b\024\020\025¨\006\026"}, d2 = {"Leu/shoroa/notro/bridge/IMinecraftImpl;", "Leu/shoroa/bridge/feature/bridges/impl/IMinecraft;", "<init>", "()V", "", "currentPerspective", "()I", "fps", "", "guiMods", "guiMultiplayer", "guiSelectWorld", "guiSettings", "shutdown", "", "", "version", "()[Ljava/lang/String;", "Lnet/minecraft/class_1600;", "kotlin.jvm.PlatformType", "mc", "Lnet/minecraft/class_1600;", "NotroClient"})
/*    */ public final class IMinecraftImpl implements d {
/* 13 */   private final class_1600 mc = class_1600.method_2965();
/*    */   
/*    */   public int fps() {
/* 16 */     return class_1600.method_9393();
/* 17 */   } public void guiSelectWorld() { this.mc.method_2928((class_388)new class_391(this.mc.field_3816)); }
/* 18 */   public void guiSettings() { this.mc.method_2928((class_388)new class_383(this.mc.field_3816, this.mc.field_3823)); } public void guiMultiplayer() {
/* 19 */     this.mc.method_2928((class_388)new class_376(this.mc.field_3816));
/*    */   }
/*    */   public void guiMods() {
/* 22 */     if (FabricLoader.getInstance().isModLoaded("modmenu")) {
/* 23 */       Class<?> guiClass = Class.forName("io.github.prospector.modmenu.gui.ModsScreen");
/* 24 */       Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = this.mc.field_3816; Intrinsics.checkNotNull(guiClass.getConstructors()[0].newInstance(arrayOfObject)); this.mc.method_2928((class_388)guiClass.getConstructors()[0].newInstance(arrayOfObject));
/*    */     } 
/*    */   }
/*    */   
/* 28 */   public void shutdown() { this.mc.method_2949(); }
/* 29 */   public int currentPerspective() { return this.mc.field_3823.field_949; } @NotNull
/* 30 */   public String[] version() { String[] arrayOfString = new String[2]; Intrinsics.checkNotNull(this.mc.method_9402()); arrayOfString[0] = this.mc.method_9402(); Intrinsics.checkNotNull(class_1600.method_9395().get("X-Minecraft-Version")); arrayOfString[1] = (String)class_1600.method_9395().get("X-Minecraft-Version"); return arrayOfString; }
/*    */ 
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\notro\bridge\IMinecraftImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */