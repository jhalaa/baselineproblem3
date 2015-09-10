package com.thoughtworks.baseline;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

//calculates the total tax of item
public class SalesTax {

    private BasicSalesTaxCalculator basicSalesTaxCalculator = new BasicSalesTaxCalculator();
    private ArrayList<String> inputString;

    public SalesTax(ArrayList<String> inputString) {
        this.inputString = inputString;
    }
    public double performOperation() {
        int i =0;
        double tax =0;
        while(!(inputString.isEmpty())) {
            tax += totalTax(inputString.get(i));
            inputString.remove(i);
        }
        return tax;
    }

    public double basicSalesTaxPercentage(String inputString) {
        return basicSalesTaxCalculator.basicSalesTaxPercentage(inputString);
    }

    public double importTaxPercentage(String input) {
        if(input.contains("imported"))
            return 5.0;
        return 0.0;
    }

    public double totalTax(String input) {
        String[] inputArray = input.split(" ");
        double total = parseDouble(inputArray[inputArray.length - 1]);
        double importTax = total * importTaxPercentage(input)/100;
        double salesTax =total * basicSalesTaxCalculator.basicSalesTaxPercentage(input) /100;

        return  total+ salesTax +importTax;
    }
}
