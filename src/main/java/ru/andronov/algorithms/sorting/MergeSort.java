package ru.andronov.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{6,7,33,1,47,66,12,9};
        int[] temp = new int[arr.length];
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        sort(arr, 0, arr.length-1, temp);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }

    public static void sort(int[] arr, int l, int r, int[] temp) {
        if (l < r) {
            int m = (int)Math.floor((r - l) / 2.0) + l;
            sort(arr, l, m, temp);
            sort(arr, m+1, r, temp);
            merge(arr, l, m, r, temp);
        }
    }

    public static void merge(int[] arr, int l, int m, int r, int[] temp) {
        if (r + 1 - l >= 0) System.arraycopy(arr, l, temp, l, r + 1 - l);
        int i = l;
        int j = m + 1;
        int k = l;
        while (i <= m || j <= r) {
            if (i <= m && j <= r) {
                if (temp[i] < temp[j]) {
                    arr[k] = temp[i];
                    i++;
                    k++;
                } else {
                    arr[k] = temp[j];
                    j++;
                    k++;
                }
            } else if (i <= m) {
                arr[k] = temp[i];
                i++;
                k++;
            } else {
                arr[k] = temp[j];
                j++;
                k++;
            }
        }
    }

}
