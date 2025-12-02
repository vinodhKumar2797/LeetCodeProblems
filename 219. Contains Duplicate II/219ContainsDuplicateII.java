import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            Integer a1 = map.get(nums[i]);
            if(a1 != null){
            if(a1 >= 0  && Math.abs(a1-i) <= k){
                return true;
            }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}