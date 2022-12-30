package Algorithm.SlidingWIndow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class check_permutation {
    public static boolean checkInclusion(String s1, String s2) {
        int array1[]=new int[26];
        int array2[]=new int [26];
        if(s1.length()>s2.length()||s2.length()==0){
            return false;
        }
        if(s1.length()==0) return true;


        for(int i=0;i<s1.length();i++){
            array1[s1.charAt(i)-'a']++;
            array2[s2.charAt(i)-'a']++;
        }

        for(int i=s1.length();i<s2.length();i++){

            if(Arrays.equals(array1,array2)) {


                return true;
            }
            array2[s2.charAt(i-s1.length())-'a']--;
            array2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(array1,array2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";

//        String s1="ky";
//        String s2="ainwkckifykxlribaypk";
        boolean check=checkInclusion(s1,s2);
        System.out.println(check);
    }
}
