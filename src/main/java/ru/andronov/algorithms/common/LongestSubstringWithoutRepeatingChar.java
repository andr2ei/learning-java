package ru.andronov.algorithms.common;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        var str = "abcabcbb";
        var obj = new LongestSubstringWithoutRepeatingChar();
        System.out.println("obj.lengthOfLongestSubstring(str) = " + obj.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        var chars = s.toCharArray();
        if (chars.length == 0) return 0;
        int longest = 1;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                var sbStr = s.substring(i, j);
                if (sbStr.contains(Character.toString(chars[j]))) {
                    break;
                } else {
                    var newSbStrLenght = s.substring(i, j + 1).length();
                    if (newSbStrLenght > longest) {
                        longest = newSbStrLenght;
                    }
                }
            }
        }
        return longest;
    }
}
