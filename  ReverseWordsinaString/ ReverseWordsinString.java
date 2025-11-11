class Solution {
    public String reverseWords(String s) {

        String a[] = s.trim().split("\\s+");
        String k = "";
        for(int i = a.length-1; i >=0; i--)
        {

            k = k + a[i];
            if(i != 0)
            {
                k = k + " ";
            }
        }

        return k;
    }
}