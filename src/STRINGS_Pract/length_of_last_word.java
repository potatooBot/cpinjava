package STRINGS_Pract;

import java.util.ArrayList;

public class length_of_last_word {
    public static void lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            else count++;

//        System.out.println(temp.length());
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        String s = "Hello World";
lengthOfLastWord(s);
    }
}
