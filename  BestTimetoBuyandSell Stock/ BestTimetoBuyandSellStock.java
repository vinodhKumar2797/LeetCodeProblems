class Solution {
   
    public int maxProfit(int[] prices) {
        
      int len = prices.length;
      int a = Integer.MAX_VALUE, sum = 0, j = 0, max = 0;
      for(int i = 0; i < len; i++){
        if(a > prices[i]){
         a = prices[i];
         
        }
         else{
            
            sum = prices[i] - a;
            System.out.println(a+" "+sum);
            if(max < sum){
                max = sum;
            }
         }

      }
      return max;
    
    }
}