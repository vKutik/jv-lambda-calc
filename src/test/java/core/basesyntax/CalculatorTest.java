package core.basesyntax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void addition_Two_Positive_ok() {
        double sum = calculator.calculate(5, 4, '+');
        assertTrue(sum == 9);
    }

    @Test
    void addition_Two_Negative_ok() {
        double sum = calculator.calculate(-5, -2, '+');
        assertTrue(sum == -7);
    }

    @Test
    void addition_Positive_Negative_ok() {
        double sum = calculator.calculate(10, -20, '+');
        assertTrue(sum == -10);
    }

    @Test
    void addition_First_Zero_ok() {
        double sum = calculator.calculate(0, 5, '+');
        assertTrue(sum == 5);
    }

    @Test
    void addition_Second_Zero_ok() {
        double sum = calculator.calculate(4, 0, '+');
        assertTrue(sum == 4);
    }

    @Test
    void addition_Min_Max_Double_ok() {
        double sum = calculator.calculate(Double.MAX_VALUE, Double.MIN_VALUE, '+');
        assertTrue(sum == Double.MAX_VALUE + Double.MIN_VALUE);
    }

    @Test
    void subtraction_Two_Positive_ok() {
        double sum = calculator.calculate(5, 4, '-');
        assertTrue(sum == 1);
    }

    @Test
    void subtraction_Two_Negative_ok() {
        double sum = calculator.calculate(-5, -2, '-');
        assertTrue(sum == -3);
    }

    @Test
    void subtraction_Positive_Negative_ok() {
        double sum = calculator.calculate(10, -20, '-');
        assertTrue(sum == 30);
    }

    @Test
    void subtraction_First_Zero_ok() {
        double sum = calculator.calculate(0, 5, '-');
        assertTrue(sum == -5);
    }

    @Test
    void subtraction_Second_Zero_ok() {
        double sum = calculator.calculate(4, 0, '-');
        assertTrue(sum == 4);
    }

    @Test
    void subtraction_Min_Max_Double_ok() {
        double sum = calculator.calculate(Double.MAX_VALUE, Double.MIN_VALUE, '-');
        assertTrue(sum == Double.MAX_VALUE - Double.MIN_VALUE);
    }

    @Test
    void multiplication_Two_Positive_ok() {
        double sum = calculator.calculate(1, 2, '*');
        assertTrue(sum == 2);
    }

    @Test
    void multiplication_Two_Negative_ok() {
        double sum = calculator.calculate(-5, -2, '*');
        assertTrue(sum == 10);
    }

    @Test
    void multiplication_Positive_Negative_ok() {
        double sum = calculator.calculate(2, -20, '*');
        assertTrue(sum == -40);
    }

    @Test
    void multiplication_First_Zero_ok() {
        double sum = calculator.calculate(0, 5, '*');
        assertTrue(sum == 0);
    }

    @Test
    void multiplication_Second_Zero_ok() {
        double sum = calculator.calculate(4, 0, '*');
        assertTrue(sum == 0);
    }

    @Test
    void multiplication_Min_Max_Double_ok() {
        double sum = calculator.calculate(Double.MAX_VALUE, Double.MIN_VALUE, '*');
        assertTrue(sum == Double.MAX_VALUE * Double.MIN_VALUE);
    }

    @Test
    void division_Two_Positive_ok() {
        double sum = calculator.calculate(2, 1, '/');
        assertTrue(sum == 2);
    }

    @Test
    void division_Two_Negative_ok() {
        double sum = calculator.calculate(-6, -2, '/');
        assertTrue(sum == 3);
    }

    @Test
    void division_Positive_Negative_ok() {
        double sum = calculator.calculate(20, -5, '/');
        assertTrue(sum == -4);
    }

    @Test
    void division_First_Zero_ok() {
        double sum = calculator.calculate(0, 5, '/');
        assertTrue(sum == 0);
    }

    @Test
    void division_Second_Zero_ok() {
        double sum = calculator.calculate(4, 0, '/');
        assertTrue(sum == 0);
    }

    @Test
    void division_Min_Max_Double_ok() {
        double sum = calculator.calculate(Double.MAX_VALUE, Double.MIN_VALUE, '/');
        assertTrue(sum == Double.MAX_VALUE / Double.MIN_VALUE);
    }

    @Test
    void raising_PositiveToPositive_ok() {
        double sum = calculator.calculate(2, 2, '^');
        assertTrue(sum == 4);
    }

    @Test
    void raising_NegativeToPositive_ok() {
        double sum = calculator.calculate(-2, 2, '^');
        assertTrue(sum == 4);
    }

    @Test
    void raising_PositiveToNegative_ok() {
        double sum = calculator.calculate(2, -2, '^');
        assertTrue(sum == 0.25D);
    }

    @Test
    void raising_NegativeToNegative_ok() {
        double sum = calculator.calculate(-5, -2, '^');
        assertTrue(sum == 0.04D);
    }

    @Test
    void raising_PositiveToZero_ok() {
        double sum = calculator.calculate(2, 0, '^');
        assertTrue(sum == 1);
    }

    @Test
    void raising_NegativeToZero_ok() {
        double sum = calculator.calculate(-5, 0, '^');
        assertTrue(sum == 1);
    }

    @Test
    void raising_ZeroToPositive_ok() {
        double sum = calculator.calculate(0, 2, '^');
        assertTrue(sum == 0);
    }

    @Test
    void illegal_operator_ok() {
        double sum = calculator.calculate(0, 2, '%');
        assertTrue(sum == 0);
    }

}