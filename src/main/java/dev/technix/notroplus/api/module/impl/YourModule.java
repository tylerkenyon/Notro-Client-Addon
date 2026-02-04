package dev.technix.notroplus.api.module.impl;

import dev.technix.notroplus.api.module.Module;
import dev.technix.notroplus.api.module.ModuleCategory;
import dev.technix.notroplus.api.settings.ButtonSetting;
import dev.technix.notroplus.api.settings.EnumSetting;
import dev.technix.notroplus.api.settings.SliderSetting;
import org.lwjgl.input.Keyboard;

        public final class YourModule extends Module {
        private final SliderSetting horizontalSpeed;
        private final EnumSetting<Mode> mode;
        private final ButtonSetting trigger;

        public YourModule() {
        super("YourModule", ModuleCategory.COMBAT, Keyboard.KEY_NONE);
        setDescription("Description of your module");

        horizontalSpeed = new SliderSetting("Speed", 2.0f, 0.0f, 10.0f, 0.1f);
        mode = new EnumSetting<>("Mode", Mode.DEFAULT, Mode.DEFAULT, Mode.ADVANCED);
        trigger = new ButtonSetting("Trigger", false);

        registerSetting(horizontalSpeed);
        registerSetting(mode);
        registerSetting(trigger);
        }

        @Override
        public void onPreMotion() {
        // logic here
        }

        public enum Mode {
        DEFAULT,
        ADVANCED
        }
        }
