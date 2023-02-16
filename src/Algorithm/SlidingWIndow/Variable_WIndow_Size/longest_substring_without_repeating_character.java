package Algorithm.SlidingWIndow.Variable_WIndow_Size;

import java.util.HashMap;

public class longest_substring_without_repeating_character {
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

        int start=0;
        int maxi=Integer.MIN_VALUE;
        for (int end = 0; end <s.length() ; end++) {

         map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);

            if(map.size()==end-start+1) {
                maxi=Math.max(maxi,end-start+1);
            }


         while(map.size()<end-start+1){
             map.replace(s.charAt(start),map.get(s.charAt(start))-1);
             if (map.get(s.charAt(start))==0) {
                 map.remove(s.charAt(start));
             }
             start++;
         }



        }
return maxi;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
