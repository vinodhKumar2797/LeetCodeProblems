class Solution {
    public int maxProfit(int[] prices) {

        int val = prices[0],sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(val > prices[i]){
                val = prices[i];   
            }else{
                sum = sum + prices[i] - val;
                val = prices[i];
            }
        } 
        return sum;
    }
}