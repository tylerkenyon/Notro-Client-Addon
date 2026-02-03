package dev.technix.notroplus.api.module;

import dev.technix.notroplus.api.settings.BooleanSetting;
import dev.technix.notroplus.api.settings.ButtonSetting;
import dev.technix.notroplus.api.settings.ColorSetting;
import dev.technix.notroplus.api.settings.EnumSetting;
import dev.technix.notroplus.api.settings.HotkeySetting;
import dev.technix.notroplus.api.settings.Setting;
import dev.technix.notroplus.api.settings.ShapeSetting;
import dev.technix.notroplus.api.settings.SliderSetting;
import eu.shoroa.bridge.feature.b.b;
import eu.shoroa.bridge.feature.c.a.i;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class NotroModuleAdapter extends b {
    private final Module module;
    private final List<Setting<?>> apiSettings;

    public NotroModuleAdapter(Module module) {
        super(module.getName(), module.getDescription(), false, "notroplus", false, module.getKeybind(), null);
        this.module = module;
        this.apiSettings = new ArrayList<>(module.getSettings());
        syncSettings();
    }

    private void syncSettings() {
        for (Setting<?> setting : apiSettings) {
            if (setting instanceof BooleanSetting) {
                BooleanSetting booleanSetting = (BooleanSetting) setting;
                booleanSetting.bind(this, a(setting.getName(), booleanSetting.get()));
            } else if (setting instanceof SliderSetting) {
                SliderSetting sliderSetting = (SliderSetting) setting;
                sliderSetting.bind(this, a(setting.getName(), sliderSetting.getValue(),
                    sliderSetting.getMin(), sliderSetting.getMax(), sliderSetting.getStep()));
            } else if (setting instanceof EnumSetting) {
                EnumSetting<?> enumSetting = (EnumSetting<?>) setting;
                enumSetting.bind(this, a(setting.getName(), enumSetting.get()));
            } else if (setting instanceof ColorSetting) {
                ColorSetting colorSetting = (ColorSetting) setting;
                colorSetting.bind(this, a(setting.getName(), colorSetting.get()));
            } else if (setting instanceof ButtonSetting) {
                ButtonSetting buttonSetting = (ButtonSetting) setting;
                buttonSetting.bind(this, a(setting.getName(), buttonSetting.get()));
            } else if (setting instanceof ShapeSetting) {
                ShapeSetting shapeSetting = (ShapeSetting) setting;
                i shape = shapeSetting.getValue();
                shapeSetting.bind(this, a(setting.getName(), shape));
            } else if (setting instanceof HotkeySetting) {
                HotkeySetting hotkeySetting = (HotkeySetting) setting;
                hotkeySetting.bind(this, a(setting.getName(), hotkeySetting.getValue()));
            } else {
                setting.bind(this, a(setting.getName(), setting.get()));
            }
        }
    }

    @Override
    public void a(boolean nvg, int displayWidth, int displayHeight) {
        module.onRender(nvg, displayWidth, displayHeight);
    }

    @Override
    public void b(boolean nvg, int displayWidth, int displayHeight) {
        module.onPostRender(nvg, displayWidth, displayHeight);
    }

    @Override
    public void a(boolean enabled) {
        super.a(enabled);
        if (enabled) {
            module.onEnable();
        } else {
            module.onDisable();
        }
    }

    public void onPreMotion() {
        module.onPreMotion();
    }

    public Module getModule() {
        return module;
    }

    public static String toCategoryName(ModuleCategory category) {
        return category.name().toLowerCase(Locale.ROOT);
    }
}
