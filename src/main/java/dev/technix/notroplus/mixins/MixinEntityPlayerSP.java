package dev.technix.notroplus.mixins;

import dev.technix.notroplus.api.module.NotroModuleAdapter;
import dev.technix.notroplus.api.module.Module;
import dev.technix.notroplus.core.NotroBridge;
import eu.shoroa.bridge.BridgeClient;
import eu.shoroa.bridge.feature.module.ModuleManager;
import net.minecraft.class_518;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(class_518.class)
public class MixinEntityPlayerSP {
    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void notroplus$onUpdate(CallbackInfo info) {
        if (!NotroBridge.isClientAvailable()) {
            return;
        }
        BridgeClient client = BridgeClient.Companion.instance();
        if (client == null) {
            return;
        }
        ModuleManager manager = client.moduleManager();
        manager.forEach(bridgeModule -> {
            if (bridgeModule instanceof NotroModuleAdapter) {
                Module apiModule = ((NotroModuleAdapter) bridgeModule).getModule();
                apiModule.onPreMotion();
            }
            return kotlin.Unit.INSTANCE;
        });
    }
}
