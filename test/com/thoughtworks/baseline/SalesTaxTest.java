package com.thoughtworks.baseline;

import org.junit.Test;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void shouldReturnBasicSalesTaxAsTenPercentForAllGoods() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("xyz");
        SalesTax salesTax = new SalesTax(inputString);

        assertEquals(salesTax.basicSalesTaxPercentage("xyz"), 10.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolates() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("chocolates");
        SalesTax salesTax = new SalesTax(inputString);

        assertEquals(salesTax.basicSalesTaxPercentage("chocolates"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolate() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("chocolate");
        SalesTax salesTax = new SalesTax(inputString);

        assertEquals(salesTax.basicSalesTaxPercentage("chocolate"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForBook() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("book");
        SalesTax salesTax = new SalesTax(inputString);

        assertEquals(salesTax.basicSalesTaxPercentage("book"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForPill() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("pill");
        SalesTax salesTax = new SalesTax(inputString);

        assertEquals(salesTax.basicSalesTaxPercentage("pill"),0.0);
    }

    @Test
    public void shouldReturnImportTaxAsZeroPercentForAllItems() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("chocolates");
        SalesTax salesTax = new SalesTax(inputString);

        assertEquals(salesTax.importTaxPercentage("chocolates"),0.0);
    }

    @Test
    public void shouldReturnImportTaxAsFivePercentForImportedItems() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("imported pills");
        SalesTax salesTax = new SalesTax(inputString);

        assertEquals(salesTax.importTaxPercentage("imported pills"),5.0);
    }

    @Test
    public void shouldReturnTotalTaxedPriceOfAnItemWhichHasNoSalesTaxAndIsNotImported() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("pill at 3.00");
        SalesTax salesTax = new SalesTax(inputString);
        assertEquals(salesTax.totalTax("pill at 3.00"),3.0);
    }

    @Test
    public void shouldReturnTotalTaxedPriceOfAnItemWhichHasNoSalesTaxAndIsImported() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("imported pill at 10.00");
        SalesTax salesTax = new SalesTax(inputString);
        assertEquals(salesTax.totalTax("imported pill at 10.00"),10.50);
    }

    @Test
    public void shouldReturnTotalTaxedPriceOfAnItemWhichSalesTaxAndIsImported() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("imported perfume at 47.50");
        SalesTax salesTax = new SalesTax(inputString);
        assertEquals(salesTax.totalTax("imported perfume at 47.50"),54.625);
    }

    @Test
    public void shouldCalculateTheTotalTaxOfAListOfItems() {
        ArrayList<String> inputString = new ArrayList<String>();
        inputString.add("book at 12.49");
        inputString.add("CD at 14.99");
        inputString.add("chocolate at 0.85");

        SalesTax salesTax = new SalesTax(inputString);
        assertEquals(salesTax.performOperation(),29.829);
    }

}
