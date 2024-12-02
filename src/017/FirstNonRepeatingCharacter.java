import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

    }

    class Solution {
        // Function to find the first non-repeating character in a string.
        static char nonRepeatingChar(String s) {
            // Your code here
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (int i = 0; i < s.length(); i++) {
                if (hm.get(s.charAt(i)) == 1) {
                    return s.charAt(i); // Return the first non-repeating character
                }
            }
            return '$';
        }
    }

}
