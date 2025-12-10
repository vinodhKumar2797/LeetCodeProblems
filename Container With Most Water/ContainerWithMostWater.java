class Solution {
    public int maxArea(int[] height) {


        int r = 0;
        int l = height.length-1;
        int sublen = l-r;
        int max = Integer.MIN_VALUE;
        while(r < l){
                int min = Math.min(height[r] , height[l]);
                if(max < min * sublen)
                {
                    max = min * sublen;

                }
                if(height[r] > height[l])
                {
                    l--;
                }else if(height[r] < height[l]){
                    r++;
                }else{
                    r++;
                    l--;
                }
                sublen = l-r;
        }
        return max;
        
    }
}



