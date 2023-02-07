import java.util.HashSet;
import java.util.Scanner;

public class pattern {
    public static boolean checkPalindrome(String s,int start,int end){

        while (start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;

    }
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;

            } else return checkPalindrome(s, i + 1, j) || checkPalindrome(s, i, j - 1);
        }

        return true;
    }
    public static void main(String[] args) {
        String s="eccer";
        System.out.println(validPalindrome(s));
    }
}
