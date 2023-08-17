package STRINGS_Pract.Password_Checking;
import java.util.*;
public class password_checking {
    public static int checkPassword(String str){
        boolean num=false;
        int charCount=0;
        boolean cap=false;
        boolean first=true;
        boolean punch=true;
        if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
            return 0;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&ch<='z'){
                charCount++;
            }
            if(ch==' '||ch=='/'){
                return 0;
            }
            if(ch>='A'&&ch<='Z'){
                charCount++;
                cap=true;
            }
            if(ch>='0'&&ch<='9'){
                num=true;
            }
        }

if(str.length()>=4&&cap==true&&num==true){
    return 1;
}
return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(checkPassword(str));
    }
}
