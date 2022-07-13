package ru.andronov.algorithms.common;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        var str = "pwwkew";
        var obj = new LongestSubstringWithoutRepeatingChar();
        System.out.println("obj.lengthOfLongestSubstring(str) = " + obj.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        var chars = s.toCharArray();
        int longest = 0;
        for (int i = 0; i < chars.length; i++) {
            var sb = new StringBuilder();
            for (int j = i; j < chars.length; j++) {
                if (sb.toString().contains(Character.toString(chars[j]))) {
                    break;
                } else {
                    sb.append(chars[j]);
                    if (sb.length() > longest) {
                        longest = sb.length();
                    }
                }
            }
        }
        return longest;
    }
}
