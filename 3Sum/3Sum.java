import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        int n = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){

            if(i > 0 && nums[i] == nums[i-1])
            continue;

            int left = i + 1;
            int right = n - 1;

            while(left < right){
                // System.out.println(nums[right]);
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }else{
                    lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    int leftval = nums[left];
                    while(left < right && nums[left] == leftval){
                        left++;
                    }

                    int rightval = nums[right];
                    while(left < right && nums[left] == rightval){
                        right--;
                    }

                }
            }

        }

        return lists;
    }
}