package Greedy;

import java.util.*;

public class netcracker {
    public static int sumProduct(int num){
        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();

        int sum=0;
if(num%2==0) {
    for (int i = 0; i <digits.length; i++) {
        sum = sum + digits[i];
    }
    return sum;
}
int pro=1;
        if(num%2!=0) {
            for (int i = 0; i <digits.length; i++) {
                pro= pro * digits[i];
            }
        }
        return pro;
    }
    public static void main(String[] args) {
//        int  num=464;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
int res=sumProduct(num);
        System.out.println(res);
    }
}
