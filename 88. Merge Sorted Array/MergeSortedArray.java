class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int len = m + n - 1;
        int i = m-1;
        int j = n-1;
        // if(i < 0 || j < 0){
        //     return;
        // }
        


        while(len >= 0 && j >= 0){
            System.out.println(i +" "+j);
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[len--] = nums1[i];
                i--;
            }else if(i >= 0 && j >= 0 && nums2[j] >= nums1[i] ){
                nums1[len--] = nums2[j];
                j--;
            }else if(i < 0){
                nums1[len--] = nums2[j];
                j--;
            }
        }  


    }
            
}
   