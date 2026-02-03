package dev.technix.notroplus.mixins;

import dev.technix.notroplus.api.module.NotroModuleAdapter;
import dev.technix.notroplus.api.module.Module;
import dev.technix.notroplus.core.NotroBridge;
import eu.shoroa.bridge.BridgeClient;
import eu.shoroa.bridge.feature.b.b;
import eu.shoroa.bridge.feature.b.c;
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
        c manager = BridgeClient.a.b().moduleManager();
        manager.a((b module) -> {
            if (module instanceof NotroModuleAdapter) {
                Module apiModule = ((NotroModuleAdapter) module).getModule();
                apiModule.onPreMotion();
            }
            return kotlin.Unit.INSTANCE;
        });
    }
}
