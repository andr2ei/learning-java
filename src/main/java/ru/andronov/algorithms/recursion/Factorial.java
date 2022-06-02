package ru.andronov.algorithms.recursion;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial of " + n + ": " + Factorial.calculate(n));
        System.out.println("factorial of " + n + ": " + Factorial.fact(n));
    }

    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 2 * 1!
    public static int fact(int n) {
        if (n < 0) {
            System.err.println("Negative n");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }

    public static int calculate(int n) {
        return Factorial.calculate(n, 1, 1);
    }

    private static int calculate(int n, int curr, int acc) {
        if (curr > n) {
            return acc;
        }
        return Factorial.calculate(n, curr + 1, acc * curr);
    }
}
