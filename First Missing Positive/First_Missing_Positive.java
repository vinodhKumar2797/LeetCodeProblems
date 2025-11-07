class Solution {
    public int firstMissingPositive(int[] nums) {

        // int fi = Integer.MAX_VALUE;
        int temp[] = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] <= fi && nums[i] >0)
        //         fi = nums[i];
        // }

        // if(fi != 1)
        // return 1;
        // else{
            for(int i = 0 ; i < nums.length;i++){
                // System.out.println(nums[i]);
                if(nums[i]<=nums.length && nums[i]>0)
                    temp[nums[i]-1] = nums[i];
            }
        // }

            for(int i = 0; i < temp.length; i++){
                if(temp[i]==0){
                    return i+1;
                }
            }

            // for(int i = 0; i < temp.length; i++){
            //     if(temp[i] == 0 ){
            //         return temp[i-1]+1;
            //     }

            // }
    return temp[temp.length-1]+1;
}
}