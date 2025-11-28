import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int c = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int k = entry.getValue();
            c = (k * (k -1)/2) + c;
            System.out.print(c+" ");
        }

        return c;


    }
}