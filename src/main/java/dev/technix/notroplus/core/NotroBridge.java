package dev.technix.notroplus.core;

import dev.technix.notroplus.api.NotroPlus;
import dev.technix.notroplus.api.module.NotroModuleAdapter;
import dev.technix.notroplus.api.module.Module;
import dev.technix.notroplus.api.module.ModuleRegistry;
import eu.shoroa.bridge.BridgeClient;
import eu.shoroa.bridge.feature.module.ModuleManager;

public final class NotroBridge {
    private static boolean initialized;

    private NotroBridge() {
    }

    public static void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
    }

    public static boolean isClientAvailable() {
        return BridgeClient.Companion.instance() != null;
    }

    public static void registerModule(Module module) {
        if (module.isRegistered()) {
            return;
        }
        if (isClientAvailable()) {
            registerWithClient(module);
        }
    }

    public static void registerAllModules() {
        if (!isClientAvailable()) {
            return;
        }
        for (Module module : NotroPlus.getApi().getModuleRegistry().getModules()) {
            if (!module.isRegistered()) {
                registerWithClient(module);
            }
        }
    }

    private static void registerWithClient(Module module) {
        BridgeClient client = BridgeClient.Companion.instance();
        if (client == null) {
            return;
        }
        ModuleManager manager = client.moduleManager();
        manager.plus(new NotroModuleAdapter(module));
        module.markRegistered();
    }
}
