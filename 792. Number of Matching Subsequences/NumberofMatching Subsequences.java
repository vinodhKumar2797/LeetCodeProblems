import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return 0;
        }


        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> innermap = new HashMap<>();
        HashMap<String, Integer> store = new HashMap<>();

        int flag = 0;
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1 );
        }

        for(String word : words){
            flag = 1;
            for(int i = 0 ; i < word.length(); i++){
                 innermap.put(word.charAt(i), innermap.getOrDefault(word.charAt(i), 0) + 1 );
            }

            for(Map.Entry<Character, Integer> entry : innermap.entrySet()){
                if(map.containsKey(entry.getKey()) && map.get(entry.getKey()) >= entry.getValue()){
                    continue;
                }else{
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                store.put(word, store.getOrDefault(word, 0) + 1);
            }
            innermap = new HashMap<>();
        }

        // int c = 0;
        // for(Map.Entry<String, Integer> entry : store.entrySet()){
        //     String word = entry.getKey();
        //     int count = (int)entry.getValue();
        //     if(word.length == 1){
        //         c++;
        //         continue;
        //     }
        //     int start = 0;
        //     int end = word.length()-1;
        //     int mid = end/2;
        //     for(int i = 0; i < word.length(); i++){

        //     }

        // }

        int prevIndex = -1;
        int c = 0, count = 0;
        for(Map.Entry<String, Integer> entry : store.entrySet()){
            String word = entry.getKey();
            int value = entry.getValue();
            c = 0;
            prevIndex = -1;
            for(int i = 0; i < word.length(); i++){
                prevIndex = s.indexOf(word.charAt(i), prevIndex+1);
                if(prevIndex != -1){
                    c++;
                }else{
                    c = 0;
                    break;
                }
            }
            if(c == word.length()){
                count++;
                count =  count + value -1;
            }
        }

        return count;
    }
}





