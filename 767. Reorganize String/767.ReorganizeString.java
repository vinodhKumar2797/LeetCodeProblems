import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String reorganizeString(String s) {



        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> cmap = new HashMap<>();
        List<Integer> clist = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            clist.add(entry.getValue());
        }

        Collections.sort(clist);
        char val = '\0';
        int l = s.length()-1;
        char a[] = new char[s.length()];

        for(Integer it : clist){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() == it){
                    val = entry.getKey();
                }
            }
            if(val != '\0'){
            for(int i = 0; i < it; i++){
                a[l--] = val;
            }
            cmap.put(val, it);
            map.remove(val);
            val = '\0';
            }
        }

        char rs = a[0];
        int maxc = cmap.get(rs);
        char res[] = new char[s.length()];
        int ri = 0;


        if(maxc > (s.length() + 1 )/2){
            return "";
        }
        for(Map.Entry<Character, Integer> entry : cmap.entrySet()){
            if(entry.getKey() == rs){
                for(int i = 0; i < entry.getValue(); i++){
                        res[ri] = entry.getKey();
                        ri = ri + 2;
                    }
                }
        }

        cmap.remove(rs);


        for(Map.Entry<Character, Integer> entry : cmap.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                if(ri >= s.length()){
                ri = 1;
                }
                res[ri] = entry.getKey();
                ri = ri + 2;
            }
           }


           for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
           }

        
    return new String(res);
    }
}








// class Solution {
//     public String reorganizeString(String s) {
//         int n = s.length();
//         int[] freq = new int[26];
//         for (char c : s.toCharArray()) freq[c - 'a']++;

//         // find max frequency and its letter
//         int max = 0, letter = 0;
//         for (int i = 0; i < 26; i++) {
//             if (freq[i] > max) {
//                 max = freq[i];
//                 letter = i;
//             }
//         }

//         // impossible if one char appears > (n+1)/2
//         if (max > (n + 1) / 2) return "";

//         char[] res = new char[n];
//         int idx = 0;

//         // place the most frequent char at even indices first
//         while (freq[letter] > 0) {
//             res[idx] = (char) (letter + 'a');
//             idx += 2;
//             freq[letter]--;
//         }

//         // place remaining chars
//         for (int i = 0; i < 26; i++) {
//             while (freq[i] > 0) {
//                 if (idx >= n) idx = 1; // switch to odd indices
//                 res[idx] = (char) (i + 'a');
//                 idx += 2;
//                 freq[i]--;
//             }
//         }

//         return new String(res);
//     }
// }