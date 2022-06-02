package ru.andronov.algorithms.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 10, 11, 24};
        int x1 = 2;
        int res1 = binarySearch(arr, x1);
        System.out.println("result of search " + x1 + ": " + res1);

        int x2 = 5;
        int res2 = binarySearch(arr, x2);
        System.out.println("result of search " + x2 + ": " + res2);

        int x3 = 25;
        int res3 = binarySearch(arr, x3);
        System.out.println("result of search " + x3 + ": " + res3);
    }

    public static int binarySearch(int[] arr, int x) {
        return BinarySearch.binSearch(arr, 0, arr.length - 1, x);
    }

    private static int binSearch(int[] arr, int start, int end, int x) {
        int middle = start + (int)Math.floor((end  - start) / 2.0);
        if (start == middle) {
            return -1;
        }
        if (x < arr[middle]) {
            return binSearch(arr, start, middle, x);
        } else if (x > arr[middle]) {
            return binSearch(arr, middle, end, x);
        } else {
            return middle;
        }
    }
}
