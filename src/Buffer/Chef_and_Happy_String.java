package Buffer;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Chef_and_Happy_String {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t ;i++ ){
String str= sc.next();
int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'){
                    count++;
                    System.out.println("count become ++");
                }
                else{
                    System.out.println("count become zero");
                    count=0;
                }

                if(count>2){
                    System.out.println("Happy");
                    break;
                }
            }
            if(count<2){
                System.out.println("Sad");
            }
        }
    }
}
