package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class chocolate_distribution_problem {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
Collections.sort(a);
int i=0;
        int j=m-1;
        long min=Integer.MAX_VALUE;

        while (j<a.size()){
            int diff=a.get(j)-a.get(i);
min= Math.min(min,diff);
i++;j++;
        }
return min;
    }
    public static void main(String[] args) {
        Integer arr[]= {3, 4, 1, 9, 56, 7, 9, 12};
        int n= arr.length;
        int m=3;
        ArrayList <Integer> lst=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            lst.add(arr[i]);
        }
        System.out.println(findMinDiff(lst,n,m));

    }
}
