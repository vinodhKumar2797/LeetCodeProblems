class Solution {
    public String convert(String s, int numRows) {

        int len = s.length();
        int flag = 1;
        int i = 0, j = 0;
        char ar[][] = new char[numRows][len * 2];
        if(numRows == 1)
        return s;
        for(int k = 0; k < len; k++){
            if(i < numRows && flag == 1){
                ar[i][j] = s.charAt(k);
                if(i+1 < numRows)
                i++;
                else{
                i--;
                j++;
                flag=2;
                }
            }else if(i >= 0 && flag == 2){
                ar[i][j] = s.charAt(k);
                if(i-1>=0){
                i--;j++;}
                else{
                flag = 1;
                i++;
                }
            }
        }
        

        String result = "";
        int count = 0;
        for(int k = 0 ; k < numRows; k++){
            for(int l = 0; l < ar[i].length; l++){
                // System.out.print(ar[k][l]+" ");
                if(ar[k][l] != '\u0000'){
                    result = result + ar[k][l];
                    count++;
                }
                }
                if(count > s.length())
                return result;
            }
            System.out.println();
        return result;
        
    }
}