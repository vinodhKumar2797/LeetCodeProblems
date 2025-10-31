package MoveZeros;

class Solution {
    public void moveZeroes(int[] nums) {


        for(int i = 0 ; i < nums.length; i++){
            if(i==0){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == 0){
                    int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                    
                }
            }
            }
        }
        
    }
}