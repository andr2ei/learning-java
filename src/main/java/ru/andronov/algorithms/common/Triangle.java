package ru.andronov.algorithms.common;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

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
//        List<List<Integer>> triangle = List.of(
//                List.of(2),
//                List.of(3,4),
//                List.of(6,5,7),
//                List.of(4,1,8,3));
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3,4),
                List.of(6,5,9),
                List.of(4,4,8,0));
        System.out.println("minimumTotal(triangle) = " + minimumTotal(triangle));
    }

    public static class KeyListPair {
        public KeyListPair(Integer key, List<Integer> list) {
            this.key = key;
            this.list = list;
        }

        private final Integer key;
        private final List<Integer> list;

        public Integer getKey() {
            return key;
        }

        public List<Integer> getList() {
            return list;
        }
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        List<List<KeyListPair>> paths = new ArrayList<>();
        paths.add(
                new ArrayList<>(List.of(
                        new KeyListPair(0, new ArrayList<>(List.of(triangle.get(0).get(0)))))));
        for (int level = 1; level < triangle.size(); level++) {
            List<Integer> levelList = triangle.get(level);
            List<Integer> prevLevelList = triangle.get(level-1);

            List<KeyListPair> prevPathsLevel = paths.get(level-1);
            List<KeyListPair> newPathsLevel = new ArrayList<>();
            paths.add(newPathsLevel);

            for (int elemIndex = 0; elemIndex < prevLevelList.size(); elemIndex ++) {
                for (int i = 0; i < prevPathsLevel.size(); i++) {
                    KeyListPair prevElements = prevPathsLevel.get(i);
                    if (prevElements.getKey().equals(elemIndex)) {

                        KeyListPair prevElementsCopy1 = new KeyListPair(elemIndex, new ArrayList<>(prevElements.getList()));
                        KeyListPair prevElementsCopy2 = new KeyListPair(elemIndex+1, new ArrayList<>(prevElements.getList()));

                        prevElementsCopy1.getList().add(levelList.get(elemIndex));
                        prevElementsCopy2.getList().add(levelList.get(elemIndex + 1));

                        newPathsLevel.add(prevElementsCopy1);
                        newPathsLevel.add(prevElementsCopy2);
                    }
                }
            }
        }
        List<KeyListPair> lastLevelPaths = paths.get(paths.size() - 1);
        return lastLevelPaths.stream()
                .map((KeyListPair curPaths) -> curPaths.getList().stream().mapToInt(Integer::intValue).sum())
                .min(Integer::compare).get();
    }
}
