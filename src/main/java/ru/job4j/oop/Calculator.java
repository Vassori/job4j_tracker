package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int a) {
        return a + x;
    }

    public int multiply(int b) {
        return b * x;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumOfAllOperations(int e) {
        return sum(e) + multiply(e) + minus(e) + divide(e);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = sum(10);
        System.out.println("Sum is: " + sum);
        int minus = minus(3);
        System.out.println("Subtraction is: " + minus);
        int multiply = calculator.multiply(5);
        System.out.println("Multiplication is: " + multiply);
        int divide = calculator.divide(5);
        System.out.println("Division is: " + divide);
        int sumAll = calculator.sumOfAllOperations(10);
        System.out.println("Sum of all operations is: " + sumAll);

    }
}
