class Solution {
    public double findMaxAverage(int[] nums, int k) {

            int n = nums.length;
            double max = Double.NEGATIVE_INFINITY;
            double oldMax = nums[0];
            for(int i = 1; i < k; i++){
                oldMax = oldMax + nums[i];
            }

            System.out.println(oldMax);
            max = oldMax;
            int flag = 0;
            for(int i = 0; i + k -1  < n; i++){
                // flag = 1;
                if(k+i < n){
                oldMax = oldMax - nums[i];
                oldMax = oldMax + nums[k+i];
                if(oldMax >= max){
                    flag = 1; 
                    max = oldMax;
                }
                }
            }

                return max / k;
            // System.out.println(max);
            // if(flag == 1 && max > oldMax)
            // return max/k;
            // else
            // return oldMax/k;
        //    System.out.println(max);

            

        // return 0.0;
        
    }
}