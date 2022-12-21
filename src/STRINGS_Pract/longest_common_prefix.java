package STRINGS_Pract;

import java.util.Arrays;
import java.util.HashSet;
public class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
//        Arrays.sort(strs);
StringBuilder res=new StringBuilder();
String first=strs[0];
String second=strs[strs.length-1];
int c=0;
while (c<first.length())
    {
    if(first.charAt(c)==second.charAt(c)){
    c++;
    }
    else  {
        break;
    }
    }
return c==0?"":first.substring(0,c);

    }
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
       String res=longestCommonPrefix(str);
        System.out.println(res);
    }
}
