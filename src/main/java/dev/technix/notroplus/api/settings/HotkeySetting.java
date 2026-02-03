package dev.technix.notroplus.api.settings;

import eu.shoroa.bridge.feature.b.b.a;
import java.util.ArrayList;
import java.util.List;

public final class HotkeySetting extends Setting<List<a>> {
    public HotkeySetting(String name) {
        super(name, new ArrayList<>());
    }

    public List<a> getValue() {
        return get();
    }
}
