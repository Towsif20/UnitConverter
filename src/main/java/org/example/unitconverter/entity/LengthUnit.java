package org.example.unitconverter.entity;

public enum LengthUnit implements Unit {
    MM("Millimeter", 1.0),
    CM("Centimeter", 0.1),
    M("meter", 0.001),
    KM("Kilometer", 1e6);

    private final String name;
    private final Double factor;

    LengthUnit(String name, Double factor) {
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