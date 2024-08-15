package Algorithm.TCSVITA;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class shashi_bhaiay_exam {

    public static String  varsityParty(String arr[],int num){
        String ans="";
        for (int i = 0; i < arr.length ; i++) {
            String str[]=arr[i].split("\\s");

            for (int j = 0; j <str.length ; j++) {
                ans=ans+str[j].charAt(0);
            }
        }

        return ans;
    }


    public static int getMaximumSCore(int input1,int input2,int [] input3){
        int start=0;
        int maxi=-1;
        for (int i = 0; i <= input3.length-input2; i++) {
            int cnt=1;
            int sum=0;
            for (int j = i; j <=input3.length; j++) {
                sum=sum +input3[j]*cnt;
        cnt++;
                if(cnt==input2+1) break;
            }
          maxi=Math.max(maxi,sum);
        }

        return maxi;
    }
    public static void main(String[] args){
 int a=9;
 int b=8;
 int c=10;

        for (int i = 5; i <=8 ; i++) {
            b=11^b;

        }

        for (int i = 4; i <=7 ; i++) {
            b=(a+5)&c;
        }

 System.out.println(a+b);
    }
}
