package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Step2Test {
    @Test
    public void Test() {
        Step1 testStep1;
        Step2 testStep2;

        testStep1 = new Step1(1, -3, 2);
        testStep2 = new Step2(testStep1);

        assertEquals(2.0, testStep2.getMaxElement());


        testStep1 = new Step1(1, 0, 1);
        testStep2 = new Step2(testStep1);

        assertThrows(IllegalStateException.class, testStep2::getMaxElement);


        testStep1 = new Step1(1, -3, 2);
        testStep2 = new Step2(testStep1);

        assertEquals(2.0, testStep2.getMaxElement());

        assertThrows(IllegalArgumentException.class, () -> new Step2(null));

    }
}