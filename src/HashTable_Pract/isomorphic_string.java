package HashTable_Pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class isomorphic_string {
    static  public boolean isIsomorphic(String s, String t) {

        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        if (s.length()!=t.length()) return false;
        for (int i = 0; i <s.length() ; i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for (Map.Entry<Character,Integer> entry:map1.entrySet()
             ) {
            list.add((int) entry.getValue());
        }     for (Map.Entry<Character,Integer> entry:map2.entrySet()
             ) {
            list2.add((int) entry.getValue());
        }
        System.out.println(list);
        System.out.println(list2);
        if(list.equals(list2)) return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "bbbaaaba", t ="aaabbbba";
        System.out.println(isIsomorphic(s,t));

    }
}
