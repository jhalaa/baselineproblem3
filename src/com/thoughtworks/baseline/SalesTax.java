package com.thoughtworks.baseline;

public class SalesTax {

    public double basicSalesTax(String inputString) {
        if(inputString.contains("chocolates") || inputString.contains("chocolate"))
            return 0.0;
        return 10.0;
    }
}
