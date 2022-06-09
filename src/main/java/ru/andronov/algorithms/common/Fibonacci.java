package ru.andronov.algorithms.common;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("fib(3) = " + fib(3));
        System.out.println("fib(4) = " + fib(4));
        System.out.println("fib(5) = " + fib(5));
        System.out.println("fib(6) = " + fib(6));
        System.out.println("fib(7) = " + fib(7));
    }

    public static int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n cannot be negative");
        int a = 0, b = 1, c;
        int i = 2;
        while (i != n) {
            c = a + b;
            i++;
            a = b;
            b = c;
        }
        return b;
    }

}
