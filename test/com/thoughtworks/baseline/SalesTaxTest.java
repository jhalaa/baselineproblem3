package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void basicSalesTaxIsTenPercentForAllGoods() {
        SalesTax salesTax = new SalesTax();

        assertEquals(salesTax.basicSalesTax("xyz"), 10.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForChocolates() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTax("chocolates"),0.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForChocolate() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTax("chocolate"),0.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForBook() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTax("book"),0.0);
    }

    @Test
    public void basicSalesTaxIsZeroPercentForPill() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTax("pill"),0.0);
    }
}
