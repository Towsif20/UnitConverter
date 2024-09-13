package org.example.unitconverter.service;

import org.example.unitconverter.entity.LengthUnit;
import org.example.unitconverter.entity.TemperatureUnit;
import org.example.unitconverter.entity.Unit;
import org.example.unitconverter.entity.WeightUnit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitConverterService {

    public Double convert(Double value, Unit sourceUnit, Unit destinationUnit) {
        double baseValue = (value - sourceUnit.getBias()) / sourceUnit.getFactor();

        return (baseValue * destinationUnit.getFactor()) + destinationUnit.getBias();
    }

    public List<Unit> getUnitValues(String type) {
        List<Unit> units = null;

        if (type.equals("length")) {
            units = List.of(LengthUnit.values());
        }
        if (type.equals("weight")) {
            units = List.of(WeightUnit.values());
        }
        if (type.equals("temperature")) {
            units = List.of(TemperatureUnit.values());
        }

        return units;
    }
}
