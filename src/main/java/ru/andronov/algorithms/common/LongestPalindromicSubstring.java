package ru.andronov.algorithms.common;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        var p = new LongestPalindromicSubstring();
        System.out.println("p.longestPalindrome(\"a\") = " + p.longestPalindrome("lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc"));
    }

    public String longestPalindrome(String s) {
        var chars = s.toCharArray();
        var longest = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                var subStr = s.substring(i, j+1);
                if (isPolindrome(subStr)) {
                    if (longest.length() < subStr.length()) longest = subStr;
                }
            }
        }

        return longest;
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
