package ru.andronov.tutorials.level1.module1;

public class Cycles {
    public static void main(String[] args) {
        int count = 0;
        while (count < 3) {
            System.out.println("in while, iter #" + count);
            count++;
        }

        System.out.println();

        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println( "arr, index = 2: " + arr[2]);

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            System.out.println("array value #" + i + " value: " + arr[i]);
        }

    }
}
