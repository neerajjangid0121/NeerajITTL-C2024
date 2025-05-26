package org.tests.unittests;

import org.testng.annotations.Test;
import org.tests.DivisorCalculator;

import static org.testng.Assert.assertEquals;

public class DivisorCalculatorTest {
    @Test
    public void testCountDivisorsPair_ValidPair() {
        assertEquals(DivisorCalculator.countPairs(3), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCountPairs_NegativeInput() {
        DivisorCalculator.countPairs(-5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCountPairs_ZeroInput() {
        DivisorCalculator.countPairs(0);
    }
}