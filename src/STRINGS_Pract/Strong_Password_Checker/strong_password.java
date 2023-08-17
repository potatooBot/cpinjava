package STRINGS_Pract.Strong_Password_Checker;

public class strong_password {
    public static boolean strongPasswordCheckerII(String str) {
        boolean num=false;
        int charCount=0;
        boolean cap=false;
        boolean first=true;
        boolean lower=false;

        boolean punch=false;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
if(i!=str.length()-1&&ch==str.charAt(i+1)) {
    return false;
}
            if(ch>='a'&ch<='z'){
                lower=true;
                charCount++;
            }
            if(ch==' '||ch=='/'){
                return false;
            }
            if(ch>='A'&&ch<='Z'){
                charCount++;
                cap=true;
            }
            if(ch>='0'&&ch<='9'){
                num=true;
            }
            if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='-'||ch=='+'){
                punch=true;
            }
        }

        if(str.length()>=8&&cap==true&&num==true&&punch&&lower){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
String password = "Ranjan@123";
        System.out.println(strongPasswordCheckerII(password));
    }
}
