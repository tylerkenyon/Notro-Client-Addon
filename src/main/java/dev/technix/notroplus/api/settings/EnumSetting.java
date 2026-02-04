package dev.technix.notroplus.api.settings;

import java.util.Arrays;
import java.util.List;

public final class EnumSetting<T extends Enum<T>> extends Setting<T> {
    private final List<T> options;

    @SafeVarargs
    public EnumSetting(String name, T defaultValue, T... options) {
        super(name, defaultValue);
        this.options = Arrays.asList(options);
    }

    public List<T> getOptions() {
        return options;
    }
}
