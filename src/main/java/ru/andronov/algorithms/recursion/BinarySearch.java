package ru.andronov.algorithms.recursion;

import java.util.Optional;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 8, 9};
        System.out.println("search(arr, 7) = " + search(arr, 7));
        System.out.println("search(arr, 10) = " + search(arr, 10));
        System.out.println("search(arr, -1) = " + search(arr, -1));
        System.out.println("search(arr, 1) = " + search(arr, 1));
        System.out.println("search(arr, 9) = " + search(arr, 9));
    }

    public static Optional search(int[] arr, int elem) {
        return search(arr, elem, 0, arr.length);
    }

    private static Optional search(int[] arr, int elem, int start, int end) {
        if (elem < arr[0] || elem > arr[arr.length - 1]) return Optional.empty();
        if (start > end) return Optional.empty();
        int pivot = start + (int)Math.floor((end - start) / 2.0);
        if (arr[pivot] == elem) {
            return Optional.of(elem);
        } else if (elem > arr[pivot]) {
            return search(arr, elem, pivot + 1, end);
        } else {
            return search(arr, elem, start, pivot - 1);
        }
    }
}
