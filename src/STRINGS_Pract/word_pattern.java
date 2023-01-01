//Given a pattern and a string s, find if s follows the same pattern.
//
//        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
//
//
//        Example 1:
//
//        Input: pattern = "abba", s = "dog cat cat dog"
//        Output: true
//        Example 2:
//
//        Input: pattern = "abba", s = "dog cat cat fish"
//        Output: false
//        Example 3:
//
//        Input: pattern = "aaaa", s = "dog cat cat dog"
//        Output: false





package STRINGS_Pract;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class word_pattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap <Character,String> map=new HashMap<>();

        String str[]=s.split(" ");
        if(pattern.length()!=str.length) return false;
        for (int i = 0; i <pattern.length() ; i++) {
            map.put(pattern.charAt(i),str[i]);
        }

        //Remove duplicate values from hashmap
        Set<String> mySet = new HashSet<String>();
        for (Iterator itr = map.entrySet().iterator(); itr.hasNext();)
        {
            Map.Entry<String, String> entrySet = (Map.Entry) itr.next();
            String value = entrySet.getValue();
            if (!mySet.add(value))
            {
                itr.remove();
            }
        }
        System.out.println(map);

        boolean check=true;

          for (int i = 0; i < str.length ; i++) {


            if(str[i].equals(map.get(pattern.charAt(i)))) {
            check=true;
            }
            else return false;
          }
return true;
    }
    public static void main(String[] args) {
String pattern = "abba", s = "dog dog dog dog";
        boolean check=wordPattern(pattern,s);
        System.out.println(check);
    }



}
