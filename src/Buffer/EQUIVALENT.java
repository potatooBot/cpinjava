import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EQUIVALENT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t ;i++ ){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j]=sc.nextInt();
            }
            // frequency as value
            HashMap<Integer, Integer> freq = new HashMap<>();
            HashSet <Integer> set =new HashSet <Integer> ();
            for (int j = 0; j <n ; j++) {
                set.add(arr[j]);
            }
            if(set.size()==n){
                System.out.println(0);
            }

            for(int k = 0; k < n; k++)
                freq.put(arr[k], freq.getOrDefault(arr[k], 0) + 1);

            // Find maximum frequency among all frequencies.
            int max_freq = Integer.MIN_VALUE;
            for(Map.Entry<Integer,
                    Integer> entry : freq.entrySet())
                max_freq = Math.max(max_freq,
                        entry.getValue());
            System.out.println(max_freq-1);
        }
    }
}
