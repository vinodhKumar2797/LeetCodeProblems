import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {



        int n = s.length();
        int pn = p.length();
        List<Integer> res = new ArrayList<>();
        if(pn > n){
            return res;
        }
        
        String array[] = new String[n-pn];
        HashMap <Character, Integer> pmap = new HashMap<>();
        HashMap <Character, Integer> smap = new HashMap<>();
        int count = 0;
        char pt[] = p.toCharArray();
        Arrays.sort(pt);

        for(int i = 0; i <= n-pn; i++){
            String st = s.substring(i,i+pn);
            char a[] = st.toCharArray();
            Arrays.sort(a);
            if(Arrays.equals(a, pt)){
                res.add(i);
            }
        }
        

        

    return res;
        
    }
}