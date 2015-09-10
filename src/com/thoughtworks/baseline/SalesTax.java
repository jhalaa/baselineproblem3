package com.thoughtworks.baseline;

public class SalesTax {

    public double basicSalesTaxPercentage(String inputString) {
        if(inputString.contains("chocolates") || inputString.contains("chocolate") || inputString.contains("book") || inputString.contains("pill"))
            return 0.0;
        return 10.0;
    }

    public double importTaxPercentage(String inputString) {
        if(inputString.contains("imported"))
            return 5.0;
        return 0.0;
    }
}
