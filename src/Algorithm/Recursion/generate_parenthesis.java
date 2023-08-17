package Algorithm.Recursion;
import java.util.*;
public class generate_parenthesis {
    public  static List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        getParen(n,ans,0,0,"");
        return ans;
    }

    public static void getParen(int n,List<String> ans,int open,int close,String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }

        if(open<n){
            getParen(n,ans,open+1,close,s+ "(");
        }
        if(close<open){
            getParen(n,ans,open,close+1,s+ ")");
        }
    }
    public static void main(String[] args) {
        int n=3;
        List<String> ans=generateParenthesis(n);
        System.out.println(ans);
    }
}
