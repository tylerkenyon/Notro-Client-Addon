package dev.technix.notroplus.api.settings;

public final class SliderSetting extends Setting<Number> {
    private final Number min;
    private final Number max;
    private final Number step;

    public SliderSetting(String name, Number value, Number min, Number max, Number step) {
        super(name, value);
        this.min = min;
        this.max = max;
        this.step = step;
    }

    public Number getMin() {
        return min;
    }

    public Number getMax() {
        return max;
    }

    public Number getStep() {
        return step;
    }

    public Number getValue() {
        return get();
    }
}
