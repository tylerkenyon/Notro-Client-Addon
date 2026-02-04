package dev.technix.notroplus.api.settings;

import eu.shoroa.bridge.feature.module.misc.TextHotkey;
import java.util.ArrayList;
import java.util.List;

public final class HotkeySetting extends Setting<List<TextHotkey>> {
    public HotkeySetting(String name) {
        super(name, new ArrayList<>());
    }

    public List<TextHotkey> getValue() {
        return get();
    }
}
