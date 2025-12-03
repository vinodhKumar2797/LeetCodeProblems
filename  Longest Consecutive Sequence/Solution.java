import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {



        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int lon = 0;
        for(int num : set){
            if(!set.contains(num -1))
            {
                int start = num;
                int count = 1;

                while(set.contains(start+1)){
                    start++;
                    count++;
                }
                if(lon < count){
                    lon = count;
                }
            }
        }

        return lon;
    }
}