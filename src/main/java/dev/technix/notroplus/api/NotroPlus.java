package dev.technix.notroplus.api;

import dev.technix.notroplus.api.module.ModuleRegistry;

public final class NotroPlus {
    private static final NotroPlus INSTANCE = new NotroPlus();

    private final ModuleRegistry moduleRegistry = new ModuleRegistry();
    private boolean initialized;

    private NotroPlus() {
    }

    public static NotroPlus getApi() {
        return INSTANCE;
    }

    public void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
        moduleRegistry.initialize();
    }

    public ModuleRegistry getModuleRegistry() {
        return moduleRegistry;
    }
}
