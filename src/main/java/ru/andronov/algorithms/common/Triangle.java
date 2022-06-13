package ru.andronov.algorithms.common;


import java.util.ArrayList;
import java.util.List;

/**
 * Given a triangle array, return the minimum path sum from top to bottom.
 *
 * For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 *
 *
 *
 * Example 1:
 *
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * Output: 11
 * Explanation: The triangle looks like:
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
 */

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3,4),
                List.of(6,5,7),
                List.of(4,1,8,3));
        System.out.println("minimumTotal(triangle) = " + minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        List<List<List<Integer>>> paths = new ArrayList<>();
        paths.add(
                new ArrayList<>(List.of(
                        new ArrayList<>(List.of(triangle.get(0).get(0))))));
        for (int level = 1; level < triangle.size(); level++) {
            List<Integer> levelList = triangle.get(level);

            List<List<Integer>> prevPathsLevel = paths.get(level-1);

            paths.add(new ArrayList<>());

            List<List<Integer>> currentPathsLevel = paths.get(level);

            for (int elemIndex = 0; elemIndex < levelList.size() - 1; elemIndex ++) {
                List<Integer> prevElements = prevPathsLevel.get(elemIndex);
                List<Integer> prevElementsCopy1 = new ArrayList<>(prevElements);
                List<Integer> prevElementsCopy2 = new ArrayList<>(prevElements);
                prevElementsCopy1.add(triangle.get(level).get(elemIndex));
                prevElementsCopy2.add(triangle.get(level).get(elemIndex+1));
                currentPathsLevel.add(prevElementsCopy1);
                currentPathsLevel.add(prevElementsCopy2);
            }
        }
        List<List<Integer>> lastLevelPaths = paths.get(paths.size() - 1);
        return lastLevelPaths.stream()
                .map((List<Integer> curPaths) -> curPaths.stream().mapToInt(Integer::intValue).sum())
                .min(Integer::compare).get();
    }
}
