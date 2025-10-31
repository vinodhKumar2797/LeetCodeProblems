package RemoveDuplicates;

class Solution {
    public int removeDuplicates(int[] nums) {


            int j = 0,count = 1;
            for(int i = 0; i < nums.length; i++){
                if(nums[i]==nums[j]){
                    for(int k = j; k < nums.length; k++){
                        if(nums[j] != nums[k]){
                            j = k;
                            nums[i+1]=nums[k];
                            count++;
                            break;
                        }
                    }
                }
            }

    return count;

    }
}
       
      