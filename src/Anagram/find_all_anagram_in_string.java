package Anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class find_all_anagram_in_string {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        System.out.println(map1);

        int start=0;
        //int end=0;

        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            if(map1.containsKey(ch)==false)
            {
                start=end+1;

                map2.clear();
                continue;
            }
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            //  System.out.println(ch);
            while(map2.containsKey(ch)&&map2.get(ch)>map1.get(ch)){
                map2.put(s.charAt(start),map2.get(s.charAt(start))-1);
                if(map2.get(s.charAt(start))==null)
                {
                    map2.remove(s.charAt(start));
                }
                start++;
            }

            if(map1.equals(map2)){
                ans.add(start);

            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(findAnagrams("abab","ab"));

    }
}
