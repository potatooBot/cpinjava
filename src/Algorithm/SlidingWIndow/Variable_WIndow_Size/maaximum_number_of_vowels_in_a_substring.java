package Algorithm.SlidingWIndow.Variable_WIndow_Size;

import java.util.HashSet;

public class maaximum_number_of_vowels_in_a_substring {
    static   public int maxVowels(String s, int k) {

        HashSet<Integer> set=new HashSet<>();
        set.add((int)'a');
        set.add((int)'e');
        set.add((int)'i');
        set.add((int)'o');
        set.add((int)'u');
        int start=0;
        int maxVolwels=Integer.MIN_VALUE;
        int sum=0;
        for (int end = 0; end <s.length() ; end++) {

               if (set.contains((int) s.charAt(end))) {
                   sum = sum + 1;
               }


          if(end-start+1==k){
                maxVolwels=Math.max(maxVolwels,sum);
               if(set.contains((int)s.charAt(start))){
                   sum--;
               }
               start++;
            }

        }
        return maxVolwels;
    }
    public static void main(String[] args) {
        String str= "abciiidef";int  k = 3;
int ans=maxVowels(str,k);
        System.out.println(ans);
    }
}
