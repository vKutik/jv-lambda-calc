package core.basesyntax;

public class Calculator {
    public double calculate(double a, double b, char operation) {
        if (operation == '+') {
            return a + b;
        }
        if (operation == '-') {
            return a - b;
        }
        if (operation == '/' && a != 0 && b != 0) {
            return a / b;
        }
        if (operation == '*' && a != 0 && b != 0) {
            return a * b;
        }
        if (operation == '^') {
            return a != 0 || b != 0 ? Math.pow(a, b) : a != 0 && b == 0 ? 1.0 : 0;
        }
        return 0;
    }
}
