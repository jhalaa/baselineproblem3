package com.thoughtworks.baseline;

import static java.lang.Double.parseDouble;

//calculates the total tax of item
public class SalesTax {

    String inputString;

    public SalesTax(String inputString) {
        this.inputString = inputString;
    }

    public double basicSalesTaxPercentage() {
        if(inputString.contains("chocolates") || inputString.contains("chocolate") || inputString.contains("book") || inputString.contains("pill"))
            return 0.0;
        return 10.0;
    }

    public double importTaxPercentage() {
        if(inputString.contains("imported"))
            return 5.0;
        return 0.0;
    }

    public double totalTax() {
        String[] inputArray = inputString.split(" ");
        double total = parseDouble(inputArray[inputArray.length - 1]);
        double importTax = total * importTaxPercentage()/100;
        double salesTax =total * basicSalesTaxPercentage()/100;

        return  total+ salesTax +importTax;
    }
}
