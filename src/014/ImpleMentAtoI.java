
public class ImpleMentAtoI {
    public static void main(String[] args) {

    }

    class Solution {
        public int myAtoi(String s) {
            // Your code here
            long ans = 0;
            int negative = 1;
            for (int i = 0; i < s.length(); i++) {
                if (!isDigit(s.charAt(i))) {
                    if (s.charAt(i) == '-' && ans == 0) {
                        negative *= -1;
                    } else if (s.charAt(i) == ' ') {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    if (ans == 0 && digit(s.charAt(i)) == 0) {
                        continue;
                    } else {
                        ans += digit(s.charAt(i));
                        ans *= 10;
                    }
                }
            }
            if (ans > Integer.MAX_VALUE) {
                if (negative < 0) {
                    return (negative * Integer.MAX_VALUE) - 1;
                } else {
                    return (negative * Integer.MAX_VALUE);
                }
            }
            return (negative * (int) (ans)) / 10;
        }

        private int digit(char ch) {
            return (int) (ch - '0');
        }

        private boolean isDigit(char ch) {
            return (ch >= '0' && ch <= '9');
        }
    }
}
