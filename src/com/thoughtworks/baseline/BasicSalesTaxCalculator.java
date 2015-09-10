package com.thoughtworks.baseline;

//calculates the basic sales tax
public class BasicSalesTaxCalculator {

    public double basicSalesTaxPercentage(String inputString) {
        if (inputString.contains("chocolates") || inputString.contains("chocolate") || inputString.contains("book") || inputString.contains("pill"))
            return 0.0;
        return 10.0;
    }
}