package STRINGS_Pract;
import java.util.*;
public class check_if_sentence_is_panagram {
    public static boolean checkIfPangram(String str) {
        HashSet <Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                if(set.size()==26) return true;
            }
            set.add(str.charAt(i));

        }

        if(set.size()<26) return false;
        return true;
    }
    public static void main(String[] args) {
        String str="letcode";
        boolean check=checkIfPangram(str);
        System.out.println(check);
    }
}
