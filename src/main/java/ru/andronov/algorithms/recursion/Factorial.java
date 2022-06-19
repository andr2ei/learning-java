package ru.andronov.algorithms.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("fact(0) = " + fact(0));
        System.out.println("fact(1) = " + fact(1));
        System.out.println("fact(2) = " + fact(2));
        System.out.println("fact(3) = " + fact(3));
        System.out.println("fact(4) = " + fact(4));
    }

    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 2 * 1!
    public static int fact(int n) {
        if (n < 0) throw new IllegalArgumentException("n cannot be negative");
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
