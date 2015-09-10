package com.thoughtworks.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void basicSalesTaxIsTenPercentForAllGoods() {
        SalesTax salesTax = new SalesTax();

        assertEquals(salesTax.basicSalesTax(), 10.0);
    }
}
