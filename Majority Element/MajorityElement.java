class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length/2,count = 1,val = 0;
        for(int i = 0; i < nums.length; i++){
            count = 1;
            for(int j = i+1; j < nums.length; j++){
                if((nums[i] == nums[j])&&(nums[i]!=-1)&&(nums[j]!=-1)){
                    count++;
                    System.out.println(nums[i]);
                    nums[j]=-1;
                }
            }
            if(count>n){
                val = nums[i];
                break;
            }
        }
        return val;
    }
}