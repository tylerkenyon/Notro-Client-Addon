package dev.technix.notroplus.api.module;

import dev.technix.notroplus.api.settings.Setting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.Minecraft;

public abstract class Module {
    private final Minecraft minecraft;
    private final String name;
    private final ModuleCategory category;
    private final int keybind;
    private final List<Setting<?>> settings = new ArrayList<>();
    private String description = "";
    private boolean registered;

    protected Module(Minecraft minecraft, String name, ModuleCategory category, int keybind) {
        this.minecraft = minecraft;
        this.name = name;
        this.category = category;
        this.keybind = keybind;
    }

    public final Minecraft getMinecraft() {
        return minecraft;
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
