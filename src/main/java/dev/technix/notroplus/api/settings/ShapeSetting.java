package dev.technix.notroplus.api.settings;

import eu.shoroa.bridge.feature.setting.misc.Shape;

public final class ShapeSetting extends Setting<Shape> {
    public ShapeSetting(String name, Shape value) {
        super(name, value);
    }

    public Shape getValue() {
        return get();
    }
}
