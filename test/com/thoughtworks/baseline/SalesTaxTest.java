package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void shouldReturnBasicSalesTaxAsTenPercentForAllGoods() {
        SalesTax salesTax = new SalesTax("xyz");

        assertEquals(salesTax.basicSalesTaxPercentage(), 10.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolates() {
        SalesTax salesTax = new SalesTax("chocolates");
        assertEquals(salesTax.basicSalesTaxPercentage(),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolate() {
        SalesTax salesTax = new SalesTax("chocolate");
        assertEquals(salesTax.basicSalesTaxPercentage(),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForBook() {
        SalesTax salesTax = new SalesTax("book");
        assertEquals(salesTax.basicSalesTaxPercentage(),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForPill() {
        SalesTax salesTax = new SalesTax("pill");
        assertEquals(salesTax.basicSalesTaxPercentage(),0.0);
    }

    @Test
    public void shouldReturnImportTaxAsZeroPercentForAllItems() {
        SalesTax salesTax = new SalesTax("pill");
        assertEquals(salesTax.importTaxPercentage(),0.0);
    }

    @Test
    public void shouldReturnImportTaxAsFivePercentForImportedItems() {
        SalesTax salesTax = new SalesTax("imported pill");
        assertEquals(salesTax.importTaxPercentage(),5.0);
    }

    @Test
    public void shouldReturnTotalTaxedPriceOfAnItemWhichHasNoSalesTaxAndIsNotImported() {
        SalesTax salesTax = new SalesTax("pill at 3.00");
        assertEquals(salesTax.totalTax(),3.0);
    }

    @Test
    public void shouldReturnTotalTaxedPriceOfAnItemWhichHasNoSalesTaxAndIsImported() {
        SalesTax salesTax = new SalesTax("imported pill at 10.00");
        assertEquals(salesTax.totalTax(),10.50);
    }

    @Test
    public void shouldReturnTotalTaxedPriceOfAnItemWhichSalesTaxAndIsImported() {
        SalesTax salesTax = new SalesTax("imported perfume at 47.50");
        assertEquals(salesTax.totalTax(),54.625);
    }

}
