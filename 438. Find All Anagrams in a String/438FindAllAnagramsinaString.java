import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {



            HashMap<Character,Integer> store = new HashMap<>();
            HashMap<Character,Integer> pstore = new HashMap<>();
            List<Integer> res = new ArrayList<>();
            int pl = p.length();
            int sl = s.length();
            if(pl > sl){
                return new ArrayList<>();
            }
            for(int i = 0; i < pl; i++){
                pstore.put(p.charAt(i), pstore.getOrDefault(p.charAt(i),0) + 1);
            }
            for(int i = 0; i < pl; i++){
                store.put(s.charAt(i), store.getOrDefault(s.charAt(i) , 0) + 1);
            }



            for(int i = 0; i < sl - pl + 1; i++){
                int flag = 0;
                for(Map.Entry<Character, Integer> entry : pstore.entrySet())
                {    
                    char a = entry.getKey();
                    int b = entry.getValue();
                    if(pstore.size() == store.size()){
                        if(store.containsKey(a) && store.getOrDefault(a,0) == b){
                            flag = 1;
                        }else{
                            flag = 0;
                            break;
                        }
                    }else{
                        break;
                    }
                }
                if(flag == 1){
                    res.add(i);
                }
                char out = s.charAt(i);
                int val = store.getOrDefault(out, 0);
                if(val - 1 > 0){
                    store.put(out, val - 1);
                }else{
                    store.remove(out);
                }
                if(i + pl < sl){
                char in = s.charAt(i + pl);
                store.put(in , store.getOrDefault(in , 0) + 1);
                System.out.println(store.size() +" "+ pstore.size());}
               
            }

    return res;



    
        
    }
}