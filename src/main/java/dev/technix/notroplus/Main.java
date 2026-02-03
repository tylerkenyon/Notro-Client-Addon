package dev.technix.notroplus;

import dev.technix.notroplus.api.NotroPlus;
import dev.technix.notroplus.core.NotroBridge;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
    @Override
    public void onInitialize() {
        NotroBridge.initialize();
        NotroPlus.getApi().initialize();
    }
}
