
public class NextPermutation {
    public static void main(String[] args) {

    }

    class Solution {
        void nextPermutation(int[] arr) {
            int n = arr.length;
            // code here
            int pivot = -1;
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    pivot = i;
                    break;
                }
            }
            if (pivot == -1) {
                reverse(arr, 0, n - 1);
                return;
            }
            for (int i = n - 1; i > pivot; i--) {
                if (arr[i] > arr[pivot]) {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
            reverse(arr, pivot + 1, n - 1);
        }

        static void reverse(int[] arr, int left, int right) {
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
