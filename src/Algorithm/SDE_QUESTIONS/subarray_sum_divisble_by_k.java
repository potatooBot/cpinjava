package Algorithm.SDE_QUESTIONS;

import java.util.HashMap;

public class subarray_sum_divisble_by_k {
    static long subCount(long arr[] ,int n,int k)
    {
        HashMap<Long,Integer> map=new HashMap<>();

        map.put((long)0,1);
        long prefixSum=0;
        long count=0;

        for (int i = 0; i <n ; i++) {
            prefixSum =prefixSum+arr[i];
        long rem=prefixSum%k;
        if(rem<0){
            rem=rem+k;
        }

            if(map.containsKey(rem)){
                count=count+map.get(rem);
                map.put(rem, map.getOrDefault(rem,0)+1);
            }
            else
                map.put(rem, 1);
        }

return count;
    }
    public static void main(String[] args) {
        int n = 6;int k = 5;
       long arr[] = {4, 5, 0, -2, -3, 1};
    long ans=subCount(arr,n,k);
        System.out.println(ans);

    }
}
