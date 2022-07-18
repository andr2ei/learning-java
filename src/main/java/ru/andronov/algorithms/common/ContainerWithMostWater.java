package ru.andronov.algorithms.common;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        var containerWithMostWater = new ContainerWithMostWater();
        System.out.println("containerWithMostWater.maxArea(height) = " + containerWithMostWater.maxArea(height));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int minHeight = Integer.min(leftHeight, rightHeight);
            int area = minHeight * (right - left);
            if (area > maxArea)  {
                maxArea = area;
            }
            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
