package org.tests.unittests;

import org.testng.annotations.Test;
import org.tests.DivisorCalculator;
import static org.testng.Assert.assertEquals;

public class DivisorCalculatorTest {
    @Test
    public void testCountDivisorsPair_For_3() {
        assertEquals(DivisorCalculator.countPairs(3), 1);
    }
    @Test
    public void testCountDivisorsPair_For_15() {
        assertEquals(DivisorCalculator.countPairs(15), 2);
    }
    @Test
    public void testCountDivisorsPair_For_100() {
        assertEquals(DivisorCalculator.countPairs(100), 15);
    }
}