package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFunction {

    @Test
    public void TestFirst() {
        first f = new first(2, 3, 0, 10);
        assertEquals(5.0, f.evaluate(1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> f.evaluate(-1));
    }

    @Test
    public void TestSecond() {
        second f = new second(2, Math.PI, 0, 1);
        assertEquals(0.0, f.evaluate(0));
    }

    @Test
    public void TestThird() {
        third f = new third(1, 2, 3, 4, 0, 10);
        assertEquals(0.5, f.evaluate(0));
    }

    @Test
    public void TestFourth() {
        fourth f = new fourth(2, 3, 0, 1);
        assertEquals(5.0, f.evaluate(0));
    }
}