package STRINGS_Pract.Repeated_String_Matching;

import java.util.HashSet;

public class repeated_string_mtaching {
    static int repeatedStringMatch(String str1, String str2)
    {

        int n1=str1.length();
        int n2=str2.length();
        if(str1.contains(str2)) return 1;

        int count=0;
        String val="";

        while(val.length()<str2.length()) {
            val=val +str1;
            count++;
        }

        if(val.contains(str2)==true){
            return count;
        }
        val=val+str1;
        count++;
        if(val.contains(str2)==true){
            return count;
        }

        return -1;


    }
    public static void main(String[] args) {
        String A = "abcd", B = "cdabcdab";
        int ans=repeatedStringMatch(A,B);
        System.out.println(ans);
    }
}
