package org.example.unitconverter.controller;

import org.example.unitconverter.entity.Unit;
import org.example.unitconverter.service.UnitConverterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UnitConverterController {

    private final UnitConverterService unitConverterService;

    public UnitConverterController(UnitConverterService unitConverterService) {
        this.unitConverterService = unitConverterService;
    }

    @GetMapping("/home")
    public String homePage(@RequestParam(defaultValue = "length") String type,
                           Model model) {
        List<Unit> units = unitConverterService.getUnitValues(type);

        model.addAttribute("view", "tab");
        model.addAttribute("type", type);
        model.addAttribute("units", units);

        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam String type,
                          @RequestParam Double value,
                          @RequestParam Unit sourceUnit,
                          @RequestParam Unit destinationUnit,
                          Model model) {

        model.addAttribute("type", type);

        Double converted = unitConverterService.convert(value, sourceUnit, destinationUnit);

        model.addAttribute("previous", value);
        model.addAttribute("converted", converted);
        model.addAttribute("sourceUnit", sourceUnit);
        model.addAttribute("destinationUnit", destinationUnit);
        model.addAttribute("view", "converted");

        return "index";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
