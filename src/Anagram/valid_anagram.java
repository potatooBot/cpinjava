package Anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class valid_anagram {
    public static void main(String[] args) {
        String str="car";
        String t = "rat";


        char [] s=str.toCharArray();
        char [] tstr=t.toCharArray();
        Arrays.sort(s);
        Arrays.sort(tstr);
       String sorted1=new String(s);
       String sorted2=new String(tstr);
        if(sorted1.equals(sorted2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
