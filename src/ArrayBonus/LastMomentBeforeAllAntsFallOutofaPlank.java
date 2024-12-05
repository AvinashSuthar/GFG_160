package ArrayBonus;

public class LastMomentBeforeAllAntsFallOutofaPlank {
    public static void main(String[] args) {

    }

    // User function Template for Java
    class Solution {
        public int getLastMoment(int n, int left[], int right[]) {
            // code here
            int max = 0;
            for (int i = 0; i < left.length; i++) {
                max = Math.max(max, left[i]);
            }
            for (int i = 0; i < right.length; i++) {
                max = Math.max(max, n - right[i]);
            }
            return max;
        }
    }
}
