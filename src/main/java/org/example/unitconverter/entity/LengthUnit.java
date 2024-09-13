package org.example.unitconverter.entity;

public enum LengthUnit implements Unit {
    MM("Millimeter", 1.0),
    CM("Centimeter", 0.1),
    M("meter", 0.001),
    KM("Kilometer", 1e-6),
    INCH("Inch", 0.393701),
    FT("Foot", 0.0328),
    YD("Yard", 0.0109361),
    MI("Mile", 6.213693181818e-6);

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

    @Override
    public Double getBias() {
        return 0.0;
    }
}