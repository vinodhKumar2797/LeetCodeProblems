package SubArraySumPrefix;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {




        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int prefix = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0; i < n; i++){
            prefix += nums[i];
            count += map.getOrDefault(prefix-k, 0);
            map.put(prefix, map.getOrDefault(prefix,0)+ 1);
        }
        return count;
    }
}

