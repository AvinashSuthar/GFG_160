
public class KadanesAlgorithm {
    public static void main(String[] args) {

    }

    // User function Template for Java
    class Solution {

        // arr: input array
        // Function to find the sum of contiguous subarray with maximum sum.
        int maxSubarraySum(int[] arr) {

            // Your code here
            int ans = 0;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                if (sum < 0) {
                    sum = 0;
                }
                ans = Math.max(ans, sum);
            }
            int min = Integer.MIN_VALUE;
            if (ans == 0) {
                for (int i = 0; i < arr.length; i++) {
                    ans = Math.max(arr[i], min);
                    min = Math.max(min, arr[i]);
                }
            }
            return ans;
        }
    }

}
