package STRINGS_Pract.Letter_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedSet;

public class letter_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
//        map.put('A',1);
//        map.put('B',10);
//        map.put('C',100);
//        map.put('D',1000);
//        map.put('E',10000);
//        map.put('F',100000);
//        map.put('G',1000000);
long sum=0;
int arr[]=new int[7];
int val=1;
        for (int i = 0; i <7; i++) {
            arr[i]=val;
            val=val*10;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <str.length() ; i++) {
      char ch=str.charAt(i);
      int ascii=str.charAt(i);
            System.out.println(ascii);
           sum=sum + arr[str.charAt(i)-'A'];
        }
        System.out.println(sum);
    }
}
