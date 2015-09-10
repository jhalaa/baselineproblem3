package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void shouldReturnBasicSalesTaxAsTenPercentForAllGoods() {
        SalesTax salesTax = new SalesTax();

        assertEquals(salesTax.basicSalesTaxPercentage("xyz"), 10.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolates() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("chocolates"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolate() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("chocolate"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForBook() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("book"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForPill() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.basicSalesTaxPercentage("pill"),0.0);
    }

    @Test
    public void shouldReturnImportTaxAsZeroPercentForAllItems() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.importTaxPercentage("pill"),0.0);
    }

    @Test
    public void shouldReturnImportTaxAsFivePercentForImportedItems() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.importTaxPercentage("imported pill"),5.0);
    }

    @Test
    public void shouldReturnTotalTaxedPriceOfAnItemWhichHasNoSalesTaxAndIsNotImported() {
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.totalTax("pill at 3.00"),3.0);
    }

}
