import java.util.*;

public class Anagram {
    public static void main(String[] args) {

    }

    class Solution {
        // Function is to check whether two strings are anagram of each other or not.
        public static boolean areAnagrams(String s1, String s2) {

            // Your code here
            if (s1.length() != s2.length()) {
                return false;
            }
            HashMap<Character, Integer> hm = new HashMap<>();
            char[] str1 = s1.toCharArray();
            for (int i = 0; i < str1.length; i++) {
                hm.put(str1[i], hm.getOrDefault(str1[i], 0) + 1);
            }
            char[] str2 = s2.toCharArray();
            for (int i = 0; i < str2.length; i++) {
                if (hm.containsKey(str2[i]) && hm.get(str2[i]) > 0) {
                    hm.put(str2[i], hm.get(str2[i]) - 1);
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
