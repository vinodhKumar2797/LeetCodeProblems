class Solution {
    public int[] productExceptSelf(int[] nums) {
        return findProducts(nums,0, 1, 1);
    }

    public static int[] findProducts(int nums[], int i, int a, int b){
        

        for(int j = i; j < nums.length; j++){ 
            if(i != j)
            b = b * nums[j];
        }

         if(i != 0){
            b = a * b;
            a = nums[i] * a;
            nums[i] = b;
         }else{
            a=nums[i];
            nums[i] = b;
         }
        i++;

        if(a == 1 && b == 1 && nums[i] == 1){
            return nums;
        }
        if(i < nums.length){
            findProducts(nums, i, a, 1);
        }
        
        return nums;
    }

    
}