package STRINGS_Pract;
import  java.util.*;
public class Remove_Letter_To_Equalize_Frequency {
    public static boolean equalFrequency(String word) {
   Hashtable <Character,Integer> map=new Hashtable<>();
        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        for (Object val: map.values()
             ) {

        }
        return true;
    }


    public static void main(String[] args) {
        String str= "abc";
        boolean check=equalFrequency(str);
        System.out.println(check);

    }
}
