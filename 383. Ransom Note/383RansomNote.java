import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> mapr = new HashMap<>();
        HashMap<Character, Integer> mapm = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            mapr.put(c, mapr.getOrDefault(c,0)+1);
        }

        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            mapm.put(c, mapm.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entry : mapr.entrySet()){
            Integer a1 = entry.getValue();
            Integer a2 = mapm.get(entry.getKey());
            if(a2 == null){
                return false;
            }
            if(a1 > a2){
                return false;
            }
        }

        return true;
        
    }
}


// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         if (magazine.length() < ransomNote.length()) {
//             return false;
//         }

//         int[] record = new int[26];

//         for (int i = 0; i < magazine.length(); i++) {
//             record[magazine.charAt(i) - 'a']++;
//         }

//         for (int i = 0; i < ransomNote.length(); i++) {
//             record[ransomNote.charAt(i) - 'a']--;

//             if (record[ransomNote.charAt(i) - 'a'] < 0) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }