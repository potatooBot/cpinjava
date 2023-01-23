import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;


public class alice {
    public static void main(String[] args) {

   int size;
   Scanner sc=new Scanner(System.in);
   size=sc.nextInt();
   String arr[]=new String[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.next();
        }

HashMap<Character,Integer> map=new HashMap<>();
   int s=arr[0].length();

            for (int j = 0; j <s ; j++) {
                int as=arr[0].charAt(j);
             map.put(arr[0].charAt(j),as);
            }
int b=0;
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <s ; j++) {
                for (Map.Entry entry:
                     map.entrySet()) {
                 if((int)entry.getValue()!=arr[i].charAt(j)) {
                      b=i;
                     break;
                 }
                }
            }
        }



        System.out.println(arr[b]);
    }
}



