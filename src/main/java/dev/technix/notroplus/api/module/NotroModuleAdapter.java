package dev.technix.notroplus.api.module;

import dev.technix.notroplus.api.settings.BooleanSetting;
import dev.technix.notroplus.api.settings.ButtonSetting;
import dev.technix.notroplus.api.settings.ColorSetting;
import dev.technix.notroplus.api.settings.EnumSetting;
import dev.technix.notroplus.api.settings.HotkeySetting;
import dev.technix.notroplus.api.settings.ShapeSetting;
import dev.technix.notroplus.api.settings.SliderSetting;
import eu.shoroa.bridge.a.g;
import eu.shoroa.bridge.feature.module.Module;
import eu.shoroa.bridge.feature.setting.Setting;
import eu.shoroa.bridge.feature.setting.misc.Shape;
import io.github.nevalackin.radbus.Listen;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class NotroModuleAdapter extends Module {
    private final dev.technix.notroplus.api.module.Module module;
    private final List<dev.technix.notroplus.api.settings.Setting<?>> apiSettings;

    public NotroModuleAdapter(dev.technix.notroplus.api.module.Module module) {
        super(module.getName(), module.getDescription(), false, "notroplus", false);
        this.module = module;
        this.apiSettings = new ArrayList<>(module.getSettings());
        syncSettings();
    }

    private void syncSettings() {
        for (dev.technix.notroplus.api.settings.Setting<?> setting : apiSettings) {
            if (setting instanceof BooleanSetting) {
                BooleanSetting booleanSetting = (BooleanSetting) setting;
                booleanSetting.bind(this, any(setting.getName(), booleanSetting.get()));
            } else if (setting instanceof SliderSetting) {
                SliderSetting sliderSetting = (SliderSetting) setting;
                sliderSetting.bind(this, slider(setting.getName(), sliderSetting.getValue(),
                    sliderSetting.getMin(), sliderSetting.getMax(), sliderSetting.getStep()));
            } else if (setting instanceof EnumSetting) {
                EnumSetting<?> enumSetting = (EnumSetting<?>) setting;
                enumSetting.bind(this, any(setting.getName(), enumSetting.get()));
            } else if (setting instanceof ColorSetting) {
                ColorSetting colorSetting = (ColorSetting) setting;
                colorSetting.bind(this, color(setting.getName(), colorSetting.get()));
            } else if (setting instanceof ButtonSetting) {
                ButtonSetting buttonSetting = (ButtonSetting) setting;
                buttonSetting.bind(this, any(setting.getName(), buttonSetting.get()));
            } else if (setting instanceof ShapeSetting) {
                ShapeSetting shapeSetting = (ShapeSetting) setting;
                Shape shape = shapeSetting.getValue();
                shapeSetting.bind(this, any(setting.getName(), shape));
            } else if (setting instanceof HotkeySetting) {
                HotkeySetting hotkeySetting = (HotkeySetting) setting;
                hotkeySetting.bind(this, any(setting.getName(), hotkeySetting.getValue()));
            } else {
                setting.bind(this, any(setting.getName(), setting.get()));
            }
        }
    }

    @Override
    public void render(boolean nvg, int displayWidth, int displayHeight) {
        module.onRender(nvg, displayWidth, displayHeight);
    }

    @Override
    public void dummy(boolean nvg, int displayWidth, int displayHeight) {
        // Bridge API requires overriding the "dummy" render hook; route it to our post-render callback.
        module.onPostRender(nvg, displayWidth, displayHeight);
    }

    @Override
    public void onState(boolean enabled) {
        super.onState(enabled);
        if (enabled) {
            module.onEnable();
        } else {
            module.onDisable();
        }
    }

    @Listen
    public void onUpdate(g event) {
        module.onPreMotion();
    }

    public void onPreMotion() {
        module.onPreMotion();
    }

    public dev.technix.notroplus.api.module.Module getModule() {
        return module;
    }

    public static String toCategoryName(ModuleCategory category) {
        return category.name().toLowerCase(Locale.ROOT);
    }
}
