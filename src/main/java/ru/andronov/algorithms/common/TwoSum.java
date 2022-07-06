package ru.andronov.algorithms.common;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.*/
public class TwoSum {

    public static void main(String[] args) {
        var arr = new int[]{ 1, 3, 5, 2, 8, 0};
        System.out.println("Arrays.toString(twoSum(arr, 7)) = " + Arrays.toString(twoSum(arr, 7)));
        System.out.println("Arrays.toString(twoSum2(arr, 7)) = " + Arrays.toString(twoSum2(arr, 7)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            var potential = map.get(target - nums[i]);
            if (potential != null && potential != i) {
                if (potential > i) {
                    return new int[]{i, potential};
                } else {
                    return new int[]{potential, i};
                }
            }
        }
        return new int[]{};
    }
}
