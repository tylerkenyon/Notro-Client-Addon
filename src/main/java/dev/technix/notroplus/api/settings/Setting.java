package dev.technix.notroplus.api.settings;

import eu.shoroa.bridge.feature.c.b;

public abstract class Setting<T> {
    private final String name;
    private T value;
    private b<T> bridgeSetting;

    protected Setting(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T get() {
        return bridgeSetting != null ? bridgeSetting.b() : value;
    }

    public void set(T value) {
        this.value = value;
        if (bridgeSetting != null) {
            bridgeSetting.a(value);
            bridgeSetting.g();
        }
    }

    public boolean isBound() {
        return bridgeSetting != null;
    }

    public void bind(Object owner, b<T> setting) {
        this.bridgeSetting = setting;
        this.value = setting.b();
    }

    public b<T> getBridgeSetting() {
        return bridgeSetting;
    }
}
