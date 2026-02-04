package dev.technix.notroplus.api.module;

import dev.technix.notroplus.api.settings.Setting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Module {
    private final String name;
    private final ModuleCategory category;
    private final int keybind;
    private final List<Setting<?>> settings = new ArrayList<>();
    private String description = "";
    private boolean registered;

    protected Module(String name, ModuleCategory category, int keybind) {
        this.name = name;
        this.category = category;
        this.keybind = keybind;
    }

    public final String getName() {
        return name;
    }

    public final String getDescription() {
        return description;
    }

    public final ModuleCategory getCategory() {
        return category;
    }

    public final int getKeybind() {
        return keybind;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void registerSetting(Setting<?> setting) {
        if (!settings.contains(setting)) {
            settings.add(setting);
        }
    }

    public List<Setting<?>> getSettings() {
        return Collections.unmodifiableList(settings);
    }

    public void onEnable() {
    }

    public void onDisable() {
    }

    public void onPreMotion() {
    }

    public void onRender(boolean nvg, int displayWidth, int displayHeight) {
    }

    public void onPostRender(boolean nvg, int displayWidth, int displayHeight) {
    }

    public boolean isRegistered() {
        return registered;
    }

    public void markRegistered() {
        this.registered = true;
    }
}
