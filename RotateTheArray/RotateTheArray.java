package RotateTheArray;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {  

       
       if(nums.length>=k){
       int f[] = new int[nums.length-k];
       int e[] = new int[k];
       int j = 0;

     
       for(int i = 0; i < nums.length-k; i++){
        f[j++] = nums[i];
       }

       j = 0;
       for(int i = nums.length-k; i < nums.length; i++){
        e[j++] = nums[i];
       }

       for(int i = 0 ; i < e.length; i++){
         nums[i] = e[i];
       }

        j = 0;
       for(int i = k; i < nums.length; i++){
        nums[i] = f[j++];
       }
       }
    else
    {
        nums = rotater(nums,Arrays.copyOfRange(nums,0,nums.length-1),nums[nums.length-1],k);
    }

        

    }

    public static int[] rotater(int nums[],int tempnums[],int element, int k){
        int j = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(i == 0)
            nums[i] = element;
            else
            nums[i] = tempnums[j++];
        }
        k--;
        if(k != 0){
            rotater(nums, Arrays.copyOfRange(nums,0,nums.length-1), nums[nums.length-1], k);
        }
        return nums;
    }
}