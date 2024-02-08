import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hm = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;

            if (hm.containsKey(rem)) {
                int index = hm.get(rem);
                if (index == i)
                    continue;
                return new int[] { i, index };

            }
        }

        return new int[] {};

    }
}

// class Solution {
// public int[] twoSum(int[] nums, int target) {
// HashMap<Integer, List<Integer> hm = new HashMap();

// for(int i=0; i<nums.length; i++){
// hm.put(nums[i], i);
// }

// //2 0,1
// //7,1
// for(int i=0; i<nums.length; i++){
// int num = nums[i];
// int rem = target - num;

// if(hm.containsKey(rem)){
// int index = hm.get(rem);
// if(index == i) continue;
// return new int[]{i, index};

// }
// }

// return new int[]{};

// }
// }