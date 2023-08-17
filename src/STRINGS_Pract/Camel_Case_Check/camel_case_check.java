package STRINGS_Pract.Camel_Case_Check;
import java.util.*;
public class camel_case_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
    StringBuilder sb=new StringBuilder("");
    String x="";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(Character.isLowerCase(ch)){
            sb.append(Character.toUpperCase(ch));
        }
    else if(Character.isUpperCase(ch)){
        sb.append(Character.toLowerCase(ch));
        }
    if(i!=str.length()-1&&(ch>='a'&&ch<='z')&&str.charAt(i+1)>='A'&&str.charAt(i+1)<='Z'){
        System.out.println(sb.toString());
        sb.delete(0,sb.length());
    }
    }
    System.out.println(sb.toString());
    }
}
