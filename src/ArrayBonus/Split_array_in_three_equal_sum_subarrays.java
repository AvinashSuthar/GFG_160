package ArrayBonus;

import java.util.ArrayList;
import java.util.List;

public class Split_array_in_three_equal_sum_subarrays {
    public static void main(String[] args) {

    }

    class Solution {

        public List<Integer> findSplit(int[] arr) {
            // Return an array of possible answer, driver code will judge and return true or
            // false based on
            int j = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int k = arr.length - 1;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            if (sum % 3 != 0) {
                list.add(-1);
                list.add(-1);
                return list;
            }
            sum = sum / 3;

            int leftSum = 0;
            int rightSum = 0;
            while (leftSum < sum) {
                leftSum += arr[j];
                j++;
            }
            while (rightSum < sum) {
                rightSum += arr[k];
                k--;
            }
            if (leftSum == sum && rightSum == sum) {
                list.add(j - 1);
                list.add(k);
                return list;
            }
            list.add(-1);
            list.add(-1);
            return list;
        }
    }
}
