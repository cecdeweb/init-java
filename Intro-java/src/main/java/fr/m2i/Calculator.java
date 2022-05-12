package fr.m2i;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Il est impossible d'effectuer une division par 0 !");
        }

        return a / b;
    }
}