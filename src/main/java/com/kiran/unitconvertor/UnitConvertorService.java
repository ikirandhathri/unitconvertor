package com.kiran.unitconvertor;

import org.springframework.stereotype.Service;

@Service
public class UnitConvertorService {
    public double celsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }
    public double fahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public double metersToFeet(double m) { return m * 3.28084; }
    public double feetToMeters(double ft) { return ft / 3.28084; }
    public double kilogramsToPounds(double kg) { return kg * 2.20462; }
    public double poundsToKilograms(double lb) { return lb / 2.20462; }
    public double litersToGallons(double l) { return l * 0.264172; }
    public double gallonsToLiters(double gal) { return gal / 0.264172; }
    public double kilometersToMiles(double km) { return km * 0.621371; }
    public double milesToKilometers(double mi) { return mi / 0.621371; }
}
