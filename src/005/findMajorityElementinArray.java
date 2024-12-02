import java.util.*;

public class findMajorityElementinArray {
    public static void main(String[] args) {

    }

    class Solution {
        // Function to find the majority elements in the array
        public List<Integer> findMajority(int[] nums) {
            // Your code goes here.
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);

            }
            hm.forEach((k, v) -> {
                if (v > nums.length / 3) {
                    list.add(k);
                }
            });
            return list;
        }
    }

}
