# NotroPlus Mod

NotroPlus is an extension mod for the Notro Client on Minecraft 1.8.9 using LegacyFabric. It runs as a separate JAR alongside the Notro Client JAR, providing an API to add custom modules and settings without directly dealing with obfuscated code in Notro Client.

## Features
- **Expandable Structure**: Modular design with packages for core hooks, mixins, API, and user modules.
- **API for Custom Modules**: Abstracted hooks for Notro Client's obfuscated methods, allowing easy module creation.
- **Settings Support**: Full hooking of Notro Client settings types, including:
  - Enum settings
  - Boolean settings
  - Float sliders
  - Int sliders
  - Color pickers
  - Button settings (and others as needed)
- **Runtime Integration**: Uses mixins to inject into Notro Client for seamless extension.

## Requirements
- Minecraft 1.8.9
- LegacyFabric loader
- Notro Client JAR (place in mods folder alongside NotroPlus.jar)
- Java 8

## Installation
1. Download the NotroPlus.jar from releases.
2. Place it in your Minecraft mods folder along with the Notro Client JAR and LegacyFabric.
3. Launch Minecraft with the LegacyFabric profile.
4. The mod will automatically hook into Notro Client.

## API Usage
The API allows creating custom modules that extend Notro Client's functionality. Modules follow this structure:

### Example Module Skeleton
```java
package your.package.module.impl;

import dev.technix.notroplus.api.Module;
import dev.technix.notroplus.api.ModuleCategory;
import dev.technix.notroplus.api.settings.SliderSetting;
import dev.technix.notroplus.api.settings.EnumSetting;
import dev.technix.notroplus.api.settings.ButtonSetting;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class YourModule extends Module {
    // Declare settings
    private final SliderSetting exampleSlider;
    private final EnumSetting exampleEnum;
    private final ButtonSetting exampleButton;

    public YourModule(Minecraft mc) {
        super(mc, "YourModule", ModuleCategory.COMBAT, Keyboard.KEY_NONE);
        setDescription("Description of your module");

        // Initialize settings
        exampleSlider = new SliderSetting("Slider Name", "unit", defaultValue, min, max, step);
        exampleEnum = new EnumSetting("Enum Name", "Default", "Option1", "Option2");
        exampleButton = new ButtonSetting("Button Name", false);

        // Register settings
        registerSetting(exampleSlider);
        registerSetting(exampleEnum);
        registerSetting(exampleButton);
    }

    // Override event methods as needed
    @Override
    public void onPreMotion() {
        // Your logic here, using settings like exampleSlider.get()
    }

    // Add other overrides or helpers
}
