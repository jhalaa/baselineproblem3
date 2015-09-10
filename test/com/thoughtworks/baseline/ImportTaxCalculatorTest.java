package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ImportTaxCalculatorTest {

    @Test
    public void shouldReturnImportTaxAsZeroPercentForAllItems() {
        ImportTaxCalculator importTaxCalculator = new ImportTaxCalculator();

        assertEquals(importTaxCalculator.importTaxPercentage("chocolates"),0.0);
    }

    @Test
    public void shouldReturnImportTaxAsFivePercentForImportedItems() {
        ImportTaxCalculator importTaxCalculator = new ImportTaxCalculator();

        assertEquals(importTaxCalculator.importTaxPercentage("imported pills"),5.0);
    }
}
