package ru.netology.services.lackagesandloops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MonthCalculationTest {
    @Test
    void monthCalculationRest() {
        MonthCalculation service = new MonthCalculation();

        int income = 10000;
        int expense = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
