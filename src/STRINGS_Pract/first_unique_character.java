package STRINGS_Pract;
import  java.util.*;
public class first_unique_character {
    public static int firstUniqChar(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> it:map.entrySet()
             ) {

        }
        return 0;
    }

    public static void main(String[] args) {
        String s="aadadaad";
        int res=firstUniqChar(s);
        System.out.println(res);
    }
}
