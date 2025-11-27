import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxNumberOfBalloons(String text) {

        String balloon = "balloon";
        int min = Integer.MAX_VALUE;
        HashMap <Character, Integer> hashmap = new HashMap<>();
        Map <Character, Integer> baloon = new HashMap<>();
        for(char c : text.toCharArray()){
                if(balloon.contains(c+""))
                hashmap.put(c, hashmap.getOrDefault(c,0)+1);
        }
         for(char c : balloon.toCharArray()){
                baloon.put(c, baloon.getOrDefault(c,0)+1);
        }

        if(baloon.size() == hashmap.size()){
        for(Map.Entry<Character, Integer> entry : baloon.entrySet()){
            int kb = entry.getValue();
            int km = hashmap.get(entry.getKey());
            if(km >= kb ){
                if(min >= km/kb)
                min=km/kb;
            }else{
                return 0;
            }
            System.out.print(min);
            System.out.print(hashmap.get(entry.getKey())+" ");
        }
        return min;
        }

    return 0;
       
    }
}