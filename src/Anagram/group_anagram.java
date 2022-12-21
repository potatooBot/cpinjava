package Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class group_anagram {
    public static void groupAnagrams(String[] strs) {


        char arr[][]=new char[strs.length][strs[0].length()];
        for (int i = 0; i < strs.length ; i++) {
            for (int j = 0; j < strs[0].length() ; j++) {
                arr[i][j]=strs[i].charAt(j);
            }
        }
        for (int i = 0; i < strs.length ; i++) {
            for (int j = 0; j < strs[0].length() ; j++) {
                Arrays.sort(arr[i]);
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        String str[] = {"eat","tea","tan","ate","nat","bat"};
        ArrayList <ArrayList<String>> lol=new ArrayList<>(5);
        groupAnagrams(str);
    }
}
