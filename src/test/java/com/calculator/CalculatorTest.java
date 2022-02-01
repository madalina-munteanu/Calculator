package com.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Addition should work")
    void testAddition() throws CalculatorException {
        assertEquals(3, calculator.calculate("ADDITION", 1, 2), "Addition is not working");
    }

    @Test
    @DisplayName("Addition exception should be thrown in case first number > 9")
    void testAdditionException() throws CalculatorException {
        assertThrows(CalculatorException.class,
                () -> { calculator.calculate("ADDITION", 10, 8); }, "Addition Exception Not Thrown");
    }

    @Test
    @DisplayName("Subtraction should work")
    void testSubtraction() throws CalculatorException {
        assertEquals(2, calculator.calculate("SUBTRACTION", 8, 6), "Subtraction is not working");
    }

    @Test
    @DisplayName("Subtraction exception should be thrown in case first number > 9")
    void testSubtractionException() throws CalculatorException {
        assertThrows(CalculatorException.class,
                () -> { calculator.calculate("SUBTRACTION", 25, 17); }, "Subtraction Exception Not Thrown");
    }

    @Test
    @DisplayName("Multiplication should work")
    void testMultiplication() throws CalculatorException {
        assertEquals(40, calculator.calculate("MULTIPLICATION", 5, 8), "Multiplication is not working");
    }

    @Test
    @DisplayName("Multiplication exception should be thrown in case first number > 9")
    void testMultiplicationException() throws CalculatorException {
        assertThrows(CalculatorException.class,
                () -> { calculator.calculate("MULTIPLICATION", 27, 45); }, "Multiplication Exception Not Thrown");
    }

    @Test
    @DisplayName("Division should work")
    void testDivision() throws CalculatorException {
        assertEquals(4, calculator.calculate("DIVISION", 8, 2), "Division is not working");
    }

    @Test
    @DisplayName("Division exception should be thrown in case first number > 9")
    void testDivisionException() throws CalculatorException {
        assertThrows(CalculatorException.class,
                () -> { calculator.calculate("DIVISION", 54, 3); }, "Division Exception Not Thrown");
    }

}