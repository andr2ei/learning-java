package ru.andronov.tutorials.level1.module2;

public class Methods {

    public static void main(String[] args) {
        System.out.println(Methods.getMax(3, 1));
    }

    public static int getMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
