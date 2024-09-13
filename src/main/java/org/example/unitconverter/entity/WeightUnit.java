package org.example.unitconverter.entity;

public enum WeightUnit implements Unit {
    ;
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
}
