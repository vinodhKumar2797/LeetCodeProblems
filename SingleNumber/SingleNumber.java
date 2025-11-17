package SingleNumber;

import java.math.BigInteger;
class Solution {
    public int singleNumber(int[] nums) {  
        long value = 000,value2 = 000; 
        for(int i = 0; i < nums.length; i++){
        if(nums[i] >=0){
            String s = Long.toBinaryString(nums[i]);
            value = value ^ Long.parseLong(s);
        }else{
            int v = Math.abs(nums[i]);
            String s = Long.toBinaryString(v);
            value2 = value2 ^ Long.parseLong(s);
        }
        }


        System.out.println(value+" "+value2);
        if(value != 0)
        return Integer.parseInt(value+"", 2);
        else
        return Integer.parseInt("-"+value2,2);

        
    }
}