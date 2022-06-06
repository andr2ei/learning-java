package ru.andronov.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] toSort = new int[]{3,7,30,3,26,43,11};
        sort(toSort, 0, toSort.length - 1);
        System.out.println("Arrays.toString(toSort) = " + Arrays.toString(toSort));
    }

    private static void sort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int p = partition(arr, lo, hi);
        sort(arr, lo, p);
        sort(arr, p+1, hi);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        while (true) {
            do i++; while (arr[i] < arr[lo]);
            do j--; while (arr[j] > arr[lo]);
            if (i > j) {
                int temp = arr[lo];
                arr[lo] = arr[j];
                arr[j] = temp;
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
