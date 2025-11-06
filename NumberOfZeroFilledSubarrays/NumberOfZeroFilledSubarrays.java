package NumberOfZeroFilledSubarrays;

class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long count = 0, fcount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                fcount++;
                count = count + fcount * 1;
            }else{
            fcount = 0;
            }
        }
        return count;

    }
}
//                 long count = 0,scount = 0,scount1 = 0,scount2 = 0;
//                 for(int i = 0; i < nums.length; i++){
//                     if(nums[i] == 0){
//                        count++;
//                        if(i == nums.length-1){
//                         scount1 += findSub(count);
//                        }
//                     }else{
//                         if(count > 0){
//                             scount2 +=  findSub(count);
//                             System.out.println(scount2);
//                             count = 0;
//                         }
//                     }
//                     scount = scount1 + scount2;
//                 }
//              return scount;
//     }
               


//     public static long findSub(long count){
//             if(count == 1 || count == 0)
//             return 1;
//             else
//             return count + findSub(count-1);
//         }
// }