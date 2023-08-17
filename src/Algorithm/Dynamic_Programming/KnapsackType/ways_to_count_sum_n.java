package Algorithm.Dynamic_Programming.KnapsackType;
import java.util.*;
public class ways_to_count_sum_n {
    public static int getSubsetUtil(int arr[],int dp[],int n,int target,int idx){
       if(target<0||idx<0)
           return 0;
        if(target==0) return 1;

        if(dp[target]!=-1) {
            return dp[target];
        }
    int count=0;
        int mod=(int) (Math.pow(10,9)+7);
        for (int i = 0; i <n ; i++) {
            count=(count +getSubsetUtil(arr,dp,n,target-arr[i],idx));
        }
        return dp[target]=count;
    }
    static public int countWays(int arr[], int n, int k)
    {
        int dp[]=new int[k+1];

            Arrays.fill(dp,-1);

        return getSubsetUtil(arr,dp,n,k,n-1);
    }
    public static void main(String[] args) {
int m = 3 ;int k= 7;
        int arr[] = {1,5,6};
    int ans=countWays(arr,m,k);
        System.out.println(ans);

    }
}
