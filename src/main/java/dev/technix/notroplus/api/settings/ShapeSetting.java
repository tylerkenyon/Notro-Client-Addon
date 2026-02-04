package dev.technix.notroplus.api.settings;

import eu.shoroa.bridge.feature.c.a.i;

public final class ShapeSetting extends Setting<i> {
    public ShapeSetting(String name, i value) {
        super(name, value);
    }

    public i getValue() {
        return get();
    }
}
