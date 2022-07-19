package ru.andronov.algorithms.common;

import java.util.Arrays;
import java.util.List;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
//        System.out.println(regularExpressionMatching.isMatch("aa", "a")); // false
//        System.out.println(regularExpressionMatching.isMatch("aa", "a*")); // true
//        System.out.println(regularExpressionMatching.isMatch("aa", ".*")); // true
//        System.out.println(regularExpressionMatching.isMatch("aab", "c*a*b")); // true
//        System.out.println(regularExpressionMatching.isMatch("mississipi", "mis*is*p*.")); // false
//        System.out.println(regularExpressionMatching.isMatch("ab", ".*c")); // false
//        System.out.println(regularExpressionMatching.isMatch("aaa", "a*a")); // true
//        System.out.println(regularExpressionMatching.isMatch("aaa", "ab*a*c*a")); // true
//        System.out.println(regularExpressionMatching.isMatch("aaba", "ab*a*c*a")); // false
//        System.out.println(regularExpressionMatching.isMatch("a", "ab*")); // true
//        System.out.println(regularExpressionMatching.isMatch("bbbba", ".*a*a")); // true
//        System.out.println(regularExpressionMatching.isMatch("aasdfasdfasdfasdfas", "aasdf.*asdf.*asdf.*asdf.*s")); // true
        System.out.println(regularExpressionMatching.isMatch("aabcbcbcaccbcaabc", ".*a*aa*.*b*.c*.*a*")); // true
    }

    public boolean isMatch(String s, String p) {
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        int is = 0, ip = 0;
        while (ip < pChars.length) {
            if ((pChars[ip] == '.' && ip+1 < pChars.length && pChars[ip+1] != '*')
                    || ((pChars[ip] == '.' && ip+1 == pChars.length))) {
                is++;
                ip++;
            } else if (pChars[ip] == '.' && ip+1 < pChars.length && pChars[ip+1] == '*') {
                ip+=2;
                int astericsCounter = 0;
                for (int i = ip; i < pChars.length; i++) {
                    if (pChars[i] == '*' && pChars[i-1] != '.') astericsCounter++;
                }
                int pCharsToEndCount = pChars.length - ip - astericsCounter*2;
                while (is < sChars.length - pCharsToEndCount) {
                    is++;
                }
            } else if (ip+1 < pChars.length && pChars[ip+1] == '*') {
                char prevChar = pChars[ip];
                ip+=2;
                int astericsCounter = 0;
                for (int i = ip; i < pChars.length; i++) {
                    if (pChars[i] == '*' && pChars[i-1] != '.') astericsCounter++;
                }
                int pCharsToEndCount = pChars.length - ip - astericsCounter*2;
                while (is < sChars.length - pCharsToEndCount && sChars[is] == prevChar) {
                    is++;
                }
            } else {
                if (is < sChars.length && sChars[is] == pChars[ip]) {
                    is++;
                    ip++;
                } else {
                    return false;
                }
            }

        }
        return is == sChars.length && ip == pChars.length;
    }
}
