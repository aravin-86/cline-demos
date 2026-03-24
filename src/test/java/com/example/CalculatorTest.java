package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddWithPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testAddWithNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(7, calculator.add(7, 0));
    }

    @Test
    void testSubtractWithPositiveNumbers() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testSubtractWithNegativeResult() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(7, calculator.subtract(7, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}