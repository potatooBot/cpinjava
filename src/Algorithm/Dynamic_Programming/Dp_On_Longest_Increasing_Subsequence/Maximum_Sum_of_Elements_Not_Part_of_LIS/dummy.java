package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Maximum_Sum_of_Elements_Not_Part_of_LIS;
import java.util.*;
public class dummy {

    public static int getAns(String val){
        int num= Integer.parseInt(val);
        int n=100;
        String s=String.valueOf(n);
        System.out.println(s);
        StringBuilder sb=new StringBuilder(s);
        System.out.println(num);
        return Integer.parseInt(val,2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String inputStr = "a3b5c2a9";
int ans=getAns("1101");
        System.out.println(ans);
    }
}
