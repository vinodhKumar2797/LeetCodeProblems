class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
        return strs[0];
        return findPrefix(strs, strs[0], 0);
    }
    public static String findPrefix(String strs[], String str, int i){
        int j = 0, k = 0;
        String it = "";
        String returnValue = "";
        
        if(i+1 < strs.length){     
        it = strs[i+1];
        int len  =  str.length();  // i = 0
        int len2 =  it.length();   // i = 1
        
        if(len > len2){
            len = len2;
        }
        
        while(j < len){
            if(str.charAt(j) == it.charAt(k)){
                returnValue = returnValue + str.charAt(j);
                j++;
                k++;
            }else{
                break;
            }
        }
        System.out.println(i+" "+returnValue+ " "+it);
        i++;
        if(j>0 && i+1 < strs.length){
        returnValue = findPrefix(strs, returnValue, i);
        }
        else
        return returnValue;
        }
        return returnValue;
    }

}






