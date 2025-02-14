package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondTest {

    @Test
    public void testSumFunctional() {
        first test = new first(2, 3, 0, 10);
        sum<first> sumFunctional_test = new sum<>();
        assertEquals(39.0, sumFunctional_test.calculate(test), 0.1);
    }

    @Test
    public void testIntegralFunctional() {
        first test = new first(2, 3, 0, 10);
        integral<first> integralFunctional_test = new integral<>(0, 10, 1000);
        assertEquals(130.0, integralFunctional_test.calculate(test));
    }

    @Test
    public void testIntegralFunctionalOutOfBounds() {
        first test = new first(2, 3, 5, 15);
        integral<first> integralFunctional_test = new integral<>(0, 10, 1000);
        assertThrows(IllegalArgumentException.class, () -> integralFunctional_test.calculate(test));
    }
}