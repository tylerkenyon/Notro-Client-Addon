package dev.technix.notroplus.api.module;

import dev.technix.notroplus.core.NotroBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ModuleRegistry {
    private final List<Module> modules = new ArrayList<>();
    private boolean initialized;

    public void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
        NotroBridge.registerAllModules();
    }

    public void register(Module module) {
        if (!modules.contains(module)) {
            modules.add(module);
        }
        NotroBridge.registerModule(module);
    }

    public List<Module> getModules() {
        return Collections.unmodifiableList(modules);
    }
}
