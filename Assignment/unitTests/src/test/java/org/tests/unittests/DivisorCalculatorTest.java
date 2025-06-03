package org.tests.unittests;

import org.testng.annotations.Test;
import org.tests.DivisorCalculator;
import static org.testng.Assert.assertEquals;

public class DivisorCalculatorTest {
    @Test
    public void testCountDivisorsPair_ValidPair() {
        assertEquals(DivisorCalculator.countPairs(3), 1);
    }
}