package ru.andronov.algorithms.sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 3, 2, 1, 7};
        int[] sortedArr = sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }

    private static int[] sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
