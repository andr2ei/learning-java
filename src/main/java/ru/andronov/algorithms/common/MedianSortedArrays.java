package ru.andronov.algorithms.common;

import java.util.Arrays;

public class MedianSortedArrays {


    public static void main(String[] args) {
        MedianSortedArrays medianSortedArrays = new MedianSortedArrays();
        int[] nums1 = new int[]{1, 3, 7, 9};
        int[] nums2 = new int[]{1, 2, 3, 6, 9};
        System.out.println(medianSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resultNums = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i <= nums1.length && j <= nums2.length) {
            if (i == nums1.length && j == nums2.length) break;
            if (i == nums1.length) {
                resultNums[k] = nums2[j];
                k++;
                j++;
            } else if (j == nums2.length) {
                resultNums[k] = nums1[i];
                k++;
                i++;
            } else if (nums1[i] < nums2[j]) {
                resultNums[k] = nums1[i];
                k++;
                i++;
            } else {
                resultNums[k] = nums2[j];
                k++;
                j++;
            }
        }
        if (resultNums.length % 2 != 0) {
            return resultNums[(int)Math.floor(resultNums.length/2.0)];
        } else {
            var left = (int)Math.floor((resultNums.length - 1)/2.0);
            var right = left + 1;
            return (resultNums[left] + resultNums[right]) / 2.0;
        }
    }

}
