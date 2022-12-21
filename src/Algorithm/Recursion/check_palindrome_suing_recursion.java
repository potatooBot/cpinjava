package Algorithm.Recursion;

public class check_palindrome_suing_recursion {
    public static boolean checkPalindrom(String str,int low,int n){
        if(low>=n/2) return true;
        if(str.charAt(low)!=str.charAt(n-low-1)){
          return false;
        }
        return (checkPalindrom(str, low+1, n));
    }
    public static void main(String[] args) {
        String str="MADAA";
        boolean check=checkPalindrom(str,0,str.length());
        System.out.println(check);
    }
}
