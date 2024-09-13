package org.example.unitconverter.entity;

public enum TemperatureUnit implements Unit {
    C("Celsius",1.0, 0.0),
    F("Fahrenheit",9.0 / 5, 32.0),
    K("Kelvin",1.0, 273.15);

    private final String name;
    private final Double factor;

    private final Double bias;

    TemperatureUnit(String name, Double factor, Double bias) {
        this.name = name;
        this.factor = factor;
        this.bias = bias;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getFactor() {
        return factor;
    }

    @Override
    public Double getBias() {
        return bias;
    }
}
