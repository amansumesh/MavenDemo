package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(2, app.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(15, app.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        App app = new App();
        assertEquals(2, app.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        App app = new App();
        app.divide(5, 0);
    }
}