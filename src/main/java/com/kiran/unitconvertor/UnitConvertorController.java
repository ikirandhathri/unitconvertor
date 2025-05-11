package com.kiran.unitconvertor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/convert")
public class UnitConvertorController {

    @Autowired
    private UnitConvertorService convertorService;

    @GetMapping
    public String convert(@RequestParam String type, @RequestParam double value) {
        double result;
        String unit;

        switch (type.toLowerCase()) {
            case "celsius-to-fahrenheit":
                result = convertorService.celsiusToFahrenheit(value);
                unit = "°F";
                break;
            case "fahrenheit-to-celsius":
                result = convertorService.fahrenheitToCelsius(value);
                unit = "°C";
                break;
            case "meters-to-feet":
                result = convertorService.metersToFeet(value);
                unit = "ft";
                break;
            case "feet-to-meters":
                result = convertorService.feetToMeters(value);
                unit = "m";
                break;
            case "kilograms-to-pounds":
                result = convertorService.kilogramsToPounds(value);
                unit = "lb";
                break;
            case "pounds-to-kilograms":
                result = convertorService.poundsToKilograms(value);
                unit = "kg";
                break;
            case "liters-to-gallons":
                result = convertorService.litersToGallons(value);
                unit = "gal";
                break;
            case "gallons-to-liters":
                result = convertorService.gallonsToLiters(value);
                unit = "L";
                break;
            case "kilometers-to-miles":
                result = convertorService.kilometersToMiles(value);
                unit = "mi";
                break;
            case "miles-to-kilometers":
                result = convertorService.milesToKilometers(value);
                unit = "km";
                break;
            default:
                return "Invalid conversion type.";
        }
        return String.format("%.2f %s", result, unit);
    }
}
