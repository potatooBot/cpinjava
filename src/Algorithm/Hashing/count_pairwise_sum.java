package Algorithm.Hashing;
import java.util.*;
public class count_pairwise_sum {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){

            if(map.containsKey(k-arr[i])){
                count=count+map.get(k-arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
return count;
    }
    public static void main(String[] args) {
        int N = 4, K = 2;
      int  arr[] = {1, 1, 1, 1};
      int ans=getPairsCount(arr,N,K);
        System.out.println(ans);
    }
}
