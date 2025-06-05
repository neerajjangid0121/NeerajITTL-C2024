package org.tests;

public class DivisorCalculator {

    public static int countPairs(int maxNumber) {
        int result = 0;

        for (int counter = 2; counter < maxNumber; ++counter) {
            if (countDivisors(counter) == countDivisors(counter + 1)) {
                ++result;
            }
        }
        return result;
    }

    private static int countDivisors(int number) {
        int count = 0;

        for (int index = 1; index * index <= number; ++index) {
            if (number % index == 0) {
                count += number / index == index ? 1 : 2;
            }
        }
        return count;
    }
}
