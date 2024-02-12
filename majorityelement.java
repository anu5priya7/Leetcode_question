class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;

     int ans =0;
        for(int i =0; i<n; i++){
            if(hm.containsKey(nums[i])){
              hm.put(nums[i], hm.get(nums[i]) +1);
            }else{
                hm.put(nums[i] , 1);
            }
        }
       
       for(int key:hm.keySet()){
           if(hm.get(key)>n/2){
               ans = key;
           }
       }

       return ans;
    }
}