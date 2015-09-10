package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void basicSalesTaxIsTenPercentForAllGoods() {
        SalesTax salesTax = new SalesTax();

        assertEquals(salesTax.basicSalesTaxPercentage("xyz"), 10.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForChocolates() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("chocolates"),0.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForChocolate() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("chocolate"),0.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForBook() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("book"),0.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForPill() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("pill"),0.0);
    }

    @Test
    public void importTaxIsZeroPercentForAllItems() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.importTaxPercentage("pill"),0.0);
    }

    @Test
    public void importTaxIsFivePercentForImportedItems() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.importTaxPercentage("imported pill"),5.0);
    }
}
