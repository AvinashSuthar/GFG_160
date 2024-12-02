public class secondLargest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    class Solution {
        public int getSecondLargest(int[] arr) {
            // Code Here
            int[] max = new int[] { -1, -1 };
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max[0]) {
                    max[0] = arr[i];
                }

            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < max[0] && arr[i] > max[1]) {
                    max[1] = arr[i];
                }
            }
            return max[1];

        }
    }
}
