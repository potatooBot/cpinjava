package HashTable_Pract;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class minimum_indexed_character {
    public static int minIndexChar(String str, String patt)
    {
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            if(map.containsKey(str.charAt(i))) continue;;
            map.put(str.charAt(i),i);
        }
        System.out.println(map);
        int mini=Integer.MAX_VALUE;
            for (Map.Entry<Character,Integer> entry:
                    map.entrySet()) {
                for (int i = 0; i <patt.length() ; i++) {

                    if (map.containsKey(patt.charAt(i))) {
                        mini=Math.min(mini,map.get(patt.charAt(i)));
                    }
                }
            }

if(mini!=Integer.MAX_VALUE) return mini;

     return -1;   // Your code here
    }



    public static void main(String[] args) {
//        String str = "abcdefgh";
//        String patt = "mgh";
        String str = "geeksforgeeks";
        String patt = "set";
        int ans=minIndexChar(str,patt);
        System.out.println(ans);
    }
}
