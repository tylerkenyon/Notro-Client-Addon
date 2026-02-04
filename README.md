# NotroPlus

NotroPlus is an extension mod for Notro Client on Minecraft 1.8.9 using LegacyFabric. It runs as a separate JAR alongside the Notro Client JAR, exposing a clean API to add modules and settings without touching obfuscated code directly.

## Requirements
- Minecraft 1.8.9
- LegacyFabric loader
- Notro Client JAR (place in the mods folder alongside NotroPlus.jar)
- Java 8

## Installation
1. Build or download `notroplus.jar`.
2. Place `notroplus.jar` and the Notro Client JAR in your mods folder.
3. Launch Minecraft with the LegacyFabric profile.

## API Usage
The API mirrors Notro Client’s module and setting model while hiding obfuscated hooks. A module skeleton looks like this:

```java
package your.package.module.impl;

import dev.technix.notroplus.api.module.Module;
import dev.technix.notroplus.api.module.ModuleCategory;
import dev.technix.notroplus.api.settings.ButtonSetting;
import dev.technix.notroplus.api.settings.EnumSetting;
import dev.technix.notroplus.api.settings.SliderSetting;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public final class YourModule extends Module {
    private final SliderSetting horizontalSpeed;
    private final EnumSetting<Mode> mode;
    private final ButtonSetting trigger;

    public YourModule(Minecraft mc) {
        super(mc, "YourModule", ModuleCategory.COMBAT, Keyboard.KEY_NONE);
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
```

Register your module with:

```java
NotroPlus.getApi().getModuleRegistry().register(new YourModule(Minecraft.getMinecraft()));
```

## Structure Overview
- `dev.technix.notroplus.Main` – LegacyFabric entrypoint
- `dev.technix.notroplus.core` – core hooks into Notro Client
- `dev.technix.notroplus.api` – public API surface
- `dev.technix.notroplus.api.module` – Module base classes and registry
- `dev.technix.notroplus.api.settings` – Setting wrappers (enum, boolean, sliders, color, hotkey, shape)
- `dev.technix.notroplus.mixins` – mixins that inject runtime hooks

## Notes
- NotroPlus mirrors Notro Client setting types: enum, boolean, sliders, color picker, hotkey list, and shape settings.
- Modules can subscribe to events (e.g., `onPreMotion`) without referencing obfuscated classes.
