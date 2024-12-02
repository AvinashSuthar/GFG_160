
public class RotateAnArrayAntiClockWise {
    public static void main(String[] args) {

    }

    class Solution {
        // Function to rotate an array by d elements in counter-clockwise direction.
        static void rotateArr(int arr[], int d) {
            rotate(arr, d);
        }

        static void rotate(int[] nums, int k) {
            k %= nums.length;

            reverse(nums, 0, nums.length - 1);
            reverse(nums, nums.length - k, nums.length - 1);
            reverse(nums, 0, nums.length - k - 1);
        }

        static void reverse(int[] nums, int left, int right) {
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

    }
}
