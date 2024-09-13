package org.example.unitconverter.entity;

public enum TemperatureUnit implements Unit {
    ;

    private final String name;
    private final Double factor;

    TemperatureUnit(String name, Double factor) {
        this.name = name;
        this.factor = factor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getFactor() {
        return factor;
    }
}
