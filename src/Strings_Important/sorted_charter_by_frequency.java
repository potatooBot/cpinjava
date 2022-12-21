//Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
//
//        Return the sorted string. If there are multiple answers, return any of them.
//
//
//
//        Example 1:
//
//        Input: s = "tree"
//        Output: "eert"
//        Explanation: 'e' appears twice while 'r' and 't' both appear once.
//        So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//        Example 2:
//
//        Input: s = "cccaaa"
//        Output: "aaaccc"
//        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//        Note that "cacaca" is incorrect, as the same characters must be together.
//        Example 3:
//
//        Input: s = "Aabb"
//        Output: "bbAa"
//        Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//        Note that 'A' and 'a' are treated as two different characters.
package Strings_Important;

import java.util.Comparator;
import java.util.Map;
import java.util.*;

public class sorted_charter_by_frequency {
    public static  <K,V extends Comparable<V>>Map <K,V>
    sortbyValues(final Map<K,V> map){
        Comparator <K> valueComp=new Comparator<K>() {

            public int compare(K o1, K o2) {
                int compare= map.get(o2).compareTo(map.get(o1));
                if(compare==0) return 1;
                else return compare;
            }
        };
        Map <K,V> sortbyValues=new TreeMap<K,V>(valueComp);
        sortbyValues.putAll(map);
        return sortbyValues;
    }
    public static void frequencySort(String s) {
        TreeMap <Character,Integer> tmap=new TreeMap<>();
        for (int i = 0; i <s.length() ; i++) {
            tmap.put(s.charAt(i),tmap.getOrDefault(s.charAt(i),0)+1);
        }
        Map sortByval=sortbyValues(tmap);
        System.out.println(sortByval);
        Set set = sortByval.entrySet();

        // Get an iterator
        Iterator i = set.iterator();
String str="";
        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            int v=(int)me.getValue();
            for (int j = 0; j <v ; j++) {
                System.out.println(me.getKey());
                str=str+me.getKey();
            }

//            System.out.println(me.getValue());
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String s= "tree";
        frequencySort(s);
    }
}
