import java.util.HashMap;
import java.util.Objects;

class Solution {
    public boolean isIsomorphic(String s, String t) {



            HashMap<Character, Integer> maps = new HashMap<>();
            HashMap<Character, Integer> mapt = new HashMap<>();

            for(int i = 0; i < s.length(); i++){
                Integer a1 = maps.get(s.charAt(i));
                Integer a2 = mapt.get(t.charAt(i));
                if(!Objects.equals(a1,a2)){
                    System.out.println(a1);
                    System.out.println(a2);
                    return false;
                }
                maps.put(s.charAt(i), i);
                mapt.put(t.charAt(i), i);
            }
            return true;
    }}
    //         // System.out.print(s.charAt(0)+1);
    //         boolean ret = true;
    //         for(int i = 0; i < s.length(); i++){
    //             if(!findIsomorp(s, t, s.charAt(i), t.charAt(i), i)){
    //                 ret =  false;
    //                 break;
    //             }
    //         }
            
    //         String s1 = s;
    //         String t1 = t;
    //         for(int i = 0; i < t.length(); i++){
    //             if(!findIsomorp(t, s, t.charAt(i), s.charAt(i), i)){
    //                 ret =  false;
    //                 break;
    //             }
    //         }
    //         return ret;
        
    // }



    // public static boolean findIsomorp(String s, String t, char cs, char st, int j){

    //     for(int i = j+1; i < s.length(); i++){
    //         if(st == t.charAt(i)){
    //             if(s.charAt(i) != cs){
    //                 return false;
    //             }else{
    //                 continue;
    //             }
    //         }
    //     }
    //     return true;

    // }

 // The below code is using ascii value method

    //  int[] lastS = new int[256];
    //     int[] lastT = new int[256];

    //     for (int i = 0; i < s.length(); i++) {
    //         char a = s.charAt(i);
    //         char b = t.charAt(i);

    //         // If last seen positions differ, mapping is inconsistent
    //         if (lastS[a] != lastT[b]) {
    //             return false;
    //         }

    //         // Update last seen positions (use i+1 because default is 0)
    //         lastS[a] = i + 1;
    //         lastT[b] = i + 1;
    //     }

    //     return true;
// }