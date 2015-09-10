package com.thoughtworks.baseline;

import static java.lang.Double.parseDouble;

//calculates the total tax of item
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

    public double totalTax(String inputString) {
        String[] inputArray = inputString.split(" ");
        double importedTax = 0.0;
        double total = parseDouble(inputArray[inputArray.length - 1]);

        if(importTaxPercentage(inputString)!=0)
            importedTax = importTaxPercentage(inputString)/10;
        return importedTax + total;
    }
}
