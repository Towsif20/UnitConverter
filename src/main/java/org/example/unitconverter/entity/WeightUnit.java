package org.example.unitconverter.entity;

public enum WeightUnit implements Unit {
    MG("Milligram", 1.0),
    G("Gram", 0.001),
    KG("Kilogram", 1e-6),
    LB("Pound", 2.2046e-6),
    OZ("Ounce", 3.5274e-5);
    private final String name;
    private final Double factor;

    WeightUnit(String name, Double factor) {
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

    @Override
    public Double getBias() {
        return 0.0;
    }
}
