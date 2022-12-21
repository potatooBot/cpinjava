package Greedy;

import java.util.ArrayList;
import java.util.List;

public class min_coins {
    public static int MinCoin(int[] curency, int n)
    {
        int temp=n;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < curency.length ; i++) {
            if(n<=0) break;
            if(n>curency[i]){
                System.out.println("entered");
                n=n-curency[curency.length-1];
                list.add(curency[curency.length-1]);
                i=0;
                System.out.println("value of n "+n);
            }


            if(n<curency[i]){
                n=n-curency[i-1];
                list.add(curency[i-1]);
                i=0;
            }
            if(n==curency[i]){
                n=n-curency[i];
                list.add(curency[i]);
                i=0;
            }
        }
        System.out.println(list);
        int sum=list.stream().mapToInt(Integer::intValue).sum();
        if(sum==temp) return list.size();
       return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,7,11};
        int k=14;
int res=MinCoin(arr,k);
        System.out.println(res);
    }
}
