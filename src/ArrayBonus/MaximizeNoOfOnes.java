package ArrayBonus;

public class MaximizeNoOfOnes {
    public static void main(String[] args) {

    }

    class Solution {
        // k is the maximum number of zeros allowed to flip
        public int maxOnes(int arr[], int k) {
            // code here
            int s = 0;
            int e = 0;
            int ans = 0;
            while (e < arr.length) {
                while (k >= 0 && e < arr.length) {
                    if (arr[e] == 0) {
                        k--;
                    }
                    e++;
                }

                if (k < 0) {
                    if (arr[s] == 0) {
                        k++;
                    }
                    s++;
                }
                int size = e - s + 1;
                ans = Math.max(ans, size);
            }
            return ans - 1;
        }
    }
}
