package ArrayBonus;

public class RepetitiveAdditionOfdigits {
    public static void main(String[] args) {

    }

    class Solution {
        public int singleDigit(int n) {
            // code here
            String s = n + "";
            while (s.length() > 1) {
                s = addDigit(s);
            }
            return digit(s.charAt(0));
        }

        static String addDigit(String s) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += digit(s.charAt(i));
            }
            return sum + "";
        }

        static int digit(char ch) {
            return (int) (ch - '0');
        }
    }
}
