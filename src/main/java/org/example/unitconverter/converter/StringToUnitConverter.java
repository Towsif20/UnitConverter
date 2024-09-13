package org.example.unitconverter.converter;

import org.example.unitconverter.entity.LengthUnit;
import org.example.unitconverter.entity.TemperatureUnit;
import org.example.unitconverter.entity.Unit;
import org.example.unitconverter.entity.WeightUnit;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToUnitConverter implements Converter<String, Unit> {

    @Override
    public Unit convert(String source) {
        for (LengthUnit unit : LengthUnit.values()) {
            if (unit.name().equalsIgnoreCase(source)) {
                return unit;
            }
        }
        for (WeightUnit unit : WeightUnit.values()) {
            if (unit.name().equalsIgnoreCase(source)) {
                return unit;
            }
        }
        for (TemperatureUnit unit : TemperatureUnit.values()) {
            if (unit.name().equalsIgnoreCase(source)) {
                return unit;
            }
        }
        throw new IllegalArgumentException("Invalid unit: " + source);
    }
}
