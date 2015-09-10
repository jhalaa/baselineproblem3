package com.thoughtworks.baseline;

//calculates the import tax
public class ImportTaxCalculator {

    public double importTaxPercentage(String input) {
        if (input.contains("imported"))
            return 5.0;
        return 0.0;
    }
}