import java.util.HashMap;

class Solution {
    public int numSplits(String s) {
    
            HashMap<Character, Integer> mapFirst = new HashMap<>();
            HashMap<Character, Integer> mapSecond = new HashMap<>();
            int n = s.length();
            int count = 0;
             mapFirst.put(s.charAt(0), mapFirst.getOrDefault(s.charAt(0), 0) + 1);
            for(int i = 1; i < n; i++){
               mapSecond.put(s.charAt(i), mapSecond.getOrDefault(s.charAt(i), 0) + 1);
            }
            if(mapFirst.size() == 1 && mapSecond.size() == 1){
            return n-1;
           }
           
            for(int i = 1; i < n; i++){
                mapFirst.put(s.charAt(i), mapFirst.getOrDefault(s.charAt(i), 0) + 1);
                mapSecond.put(s.charAt(i) , mapSecond.getOrDefault(s.charAt(i), 0) - 1);
                if(mapSecond.get(s.charAt(i)) == 0){
                    mapSecond.remove(s.charAt(i));
                }
                if(mapFirst.size() == mapSecond.size() ){
                    count++;
                }
            }





    return count;

    }
}