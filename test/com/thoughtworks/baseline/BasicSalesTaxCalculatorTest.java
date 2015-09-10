package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BasicSalesTaxCalculatorTest {
    @Test
    public void shouldReturnBasicSalesTaxAsTenPercentForAllGoods() {
        BasicSalesTaxCalculator basicSalesTaxCalculator = new BasicSalesTaxCalculator();

        assertEquals(basicSalesTaxCalculator.basicSalesTaxPercentage("xyz"), 10.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolates() {
        BasicSalesTaxCalculator basicSalesTaxCalculator = new BasicSalesTaxCalculator();

        assertEquals(basicSalesTaxCalculator.basicSalesTaxPercentage("chocolates"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForChocolate() {
        BasicSalesTaxCalculator basicSalesTaxCalculator = new BasicSalesTaxCalculator();

        assertEquals(basicSalesTaxCalculator.basicSalesTaxPercentage("chocolate"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForBook() {
        BasicSalesTaxCalculator basicSalesTaxCalculator = new BasicSalesTaxCalculator();

        assertEquals(basicSalesTaxCalculator.basicSalesTaxPercentage("book"),0.0);
    }

    @Test
    public void shouldReturnBasicSalesTaxAsZeroPercentForPill() {
        BasicSalesTaxCalculator basicSalesTaxCalculator = new BasicSalesTaxCalculator();

        assertEquals(basicSalesTaxCalculator.basicSalesTaxPercentage("pill"),0.0);
    }
}
