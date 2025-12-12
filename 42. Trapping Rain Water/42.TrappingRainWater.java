class Solution {
    public int trap(int[] height) {



        int n = height.length;
        int currval = 0;
        int i = 0;
        int l = 0;
        int r = 0; 
        int sl = 0;
        int slval = 0;
        int finalval = 0;

        while(i < n && height[i] == 0){
            i++;
        }
        
        while(i < n){
            sl = 0;
            slval = 0;
            l = i + 1;
            r = l;
            currval = height[i];
            while(l < n && currval > height[l]){
                if(slval < height[l]){
                slval = height[l];
                sl = l;
                }
                l++;
            }
            if(l < n){
                slval = height[l];
            }else{
                l = sl;
            }
            currval = Math.min(slval, currval);
            while(r < n && r < l){
                finalval = finalval + currval - height[r];
                r++;
            }
            i = r;
        }
        return finalval;
    }
}