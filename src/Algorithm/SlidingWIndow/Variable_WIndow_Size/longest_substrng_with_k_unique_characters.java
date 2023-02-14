package Algorithm.SlidingWIndow.Variable_WIndow_Size;
import java.util.*;
public class longest_substrng_with_k_unique_characters {
    public static int longestkSubstr(String s, int k) {
        // code here
        int start=0;
        Map<Character,Integer> map=new HashMap<Character,Integer> ();

int maxi=Integer.MIN_VALUE;
        for(int end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            while (map.size()>k){
                map.replace(s.charAt(start),map.get(s.charAt(start))-1);
                if(map.get(s.charAt(start))==0) {
                    map.remove(s.charAt(start));
                }
                start++;
            }
            if(map.size()==k){
                maxi=Math.max(maxi,end-start+1);
            }
        }
        if(maxi==Integer.MIN_VALUE) return -1;
        return maxi;
    }
    public static void main(String[] args) {
        String str="gbwkfnqduxwfn";
        int k=15;
        int ans=longestkSubstr(str,k);
        System.out.println(ans);
    }
}
