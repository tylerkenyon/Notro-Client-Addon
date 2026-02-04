package dev.technix.notroplus.core;

import dev.technix.notroplus.api.NotroPlus;
import dev.technix.notroplus.api.module.NotroModuleAdapter;
import dev.technix.notroplus.api.module.Module;
import dev.technix.notroplus.api.module.ModuleRegistry;
import eu.shoroa.bridge.BridgeClient;
import eu.shoroa.bridge.feature.b.c;

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
        return BridgeClient.a.b() != null;
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
        c manager = BridgeClient.a.b().moduleManager();
        manager.a(new NotroModuleAdapter(module));
        module.markRegistered();
    }
}
