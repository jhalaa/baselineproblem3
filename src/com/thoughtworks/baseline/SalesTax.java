package com.thoughtworks.baseline;

public class SalesTax {

    public double basicSalesTax(String inputString) {
        if(inputString.contains("chocolates") || inputString.contains("chocolate") || inputString.contains("book") || inputString.contains("pill"))
            return 0.0;
        return 10.0;
    }

    public double importTax(String pill) {
        return 0.0;
    }
}
