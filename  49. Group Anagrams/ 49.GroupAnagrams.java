import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, String> map = new HashMap<>();
        List<List<String>> list  = new ArrayList<>();


        for(int i = 0; i < strs.length; i++){

            char a[] = strs[i].toCharArray();
            Arrays.sort(a);
            String s = new String(a);
            String mapvalue = map.get(s);
            // System.out.println(mapvalue +" "+s);
            if(mapvalue != null){
                mapvalue = mapvalue+" "+i;
                map.put(s,mapvalue);
            }else{
            map.put(s,i+"");
            }

        }

        for(Map.Entry<String,String> entry : map.entrySet()){
            String [] it = entry.getValue().split(" ");
            List<String> s = new ArrayList<>();
            for(int i = 0; i < it.length; i++){
                s.add(strs[Integer.parseInt(it[i])]);
            }
            list.add(s);
        }
        
        return list; 
    }

    
}