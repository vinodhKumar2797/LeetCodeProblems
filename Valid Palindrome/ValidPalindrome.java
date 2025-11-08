class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int len = s.length();
        System.out.println(len);
        if(len == 0)
        return true;
        int i = 0, j = len-1; 

        if(len %2 == 0){
            len = len/2;
        }else{
            len = (len/2)+1; 
        }

        while(i <= len && j >= len){
            if(s.charAt(i) != s.charAt(j)){
               return false;
            }
            
            i++;
            j--;

        }

        // System.out.print(i+" "+j+" "+len);
        return true;
    }
}