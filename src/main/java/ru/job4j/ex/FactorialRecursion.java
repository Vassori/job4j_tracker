package ru.job4j.ex;

public class FactorialRecursion {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Value \"n\" mustn't be less than \"0\".");
        }
        return n <= 1 ? 1 : calc(n - 1) * n;
    }

    public static void main(String[] args) {
            int result = calc(-3);
            System.out.println(result);
    }
}
