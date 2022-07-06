package ru.andronov.algorithms.common;

public class Polindrome {

    public static void main(String[] args) {
        System.out.println("isPolindrome(\"sahas\") = " + isPolindrome("sahas"));
        System.out.println("isPolindrome(\"haah\") = " + isPolindrome("haah"));
        System.out.println("isPolindrome(\"sahes\") = " + isPolindrome("sahes"));
    }

    public static boolean isPolindrome(String str) {
        char[] chars = str.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start <= end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end --;
        }
        return true;
    }

}
