class Solution {
    public int[] twoSum(int[] numbers, int target) {


        
        int r = 0;
        int l = numbers.length-1;
        while(r < l){
            if(numbers[r] + numbers[l] > target){
                l--;
            }else if (numbers[r] + numbers[l] < target){
                r++;
            }else{
                return new int[]{r+1,l+1};
            }
        }
        return new int[1];
    }
}



