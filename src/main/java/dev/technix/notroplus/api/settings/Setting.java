package dev.technix.notroplus.api.settings;

public abstract class Setting<T> {
    private final String name;
    private T value;
    private eu.shoroa.bridge.feature.setting.Setting<T> bridgeSetting;

    protected Setting(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T get() {
        return bridgeSetting != null ? bridgeSetting.getValue() : value;
    }

    public void set(T value) {
        this.value = value;
        if (bridgeSetting != null) {
            bridgeSetting.setValue(value);
            bridgeSetting.callChange();
        }
    }

    public boolean isBound() {
        return bridgeSetting != null;
    }

    public void bind(Object owner, eu.shoroa.bridge.feature.setting.Setting<T> setting) {
        this.bridgeSetting = setting;
        this.value = setting.getValue();
    }

    public eu.shoroa.bridge.feature.setting.Setting<T> getBridgeSetting() {
        return bridgeSetting;
    }
}
