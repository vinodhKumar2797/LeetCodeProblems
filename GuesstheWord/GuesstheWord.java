/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
class Solution {
    static int c = 0;
    public void findSecretWord(String[] words, Master master) {
        c = 0;
       findWord(words, words[0], master.guess(words[0]), 10, master);
    }


    public static String[] findWord(String words[], String sw, int value, int ag, Master master){

        List<String> st = new ArrayList<>();
        ag = ag - 1;
        if(value == 6)
        return words;
        else if(value == 0){
            words = getFilteredWords(words, sw);
            c++;
        }else{
            words = getFilteredWordsV(words, sw, value);
        }
        System.out.println(words.length+" "+value +" "+ag);
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i]+" ");
        }
        System.out.println();
        if(words.length > 0  && 10 > ag){ 
        sw = words[0];
        findWord(words, sw, master.guess(sw), ag, master);
        }else {return words;}
     return words;
    }


    public static String[] getFilteredWords(String words[], String sw){
        int count = 0, l = 0;
        List<String> st = new ArrayList<>();
        for(int i = 1 ; i < words.length; i++){
            String w = words[i];
            for(int j = 0; j < w.length(); j++){
                if(sw.charAt(j) == w.charAt(j))
                 count++;
            }
            if(count == 0){
            st.add(w);
            }
            count = 0;
        }
        System.out.println(st.size() +" "+words.length);
        if(st.size() > words.length/2)
        Collections.reverse(st);
        return st.toArray(new String[0]);
    }

    public static String[] getFilteredWordsV(String words[], String sw, int value){
        int count = 0, l = 0;
        List<String> st = new ArrayList<>();
        for(int i = 1 ; i < words.length; i++){
            String w = words[i];
            for(int j = 0; j < w.length(); j++){
                if(sw.charAt(j) == w.charAt(j))
                 count++;
            }
            if(count == value)
            st.add(w);
            count = 0;
        }
        if(st.size() > words.length/2)
        Collections.reverse(st);
        return st.toArray(new String[0]);
    }
}


