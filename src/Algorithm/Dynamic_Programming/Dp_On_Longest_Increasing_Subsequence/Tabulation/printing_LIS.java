package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Tabulation;
import java.util.*;
public class printing_LIS {
    public static ArrayList<Integer> longestIncreasingSubsequence(int n, int arr[]){
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();

        int dp[]=new int[n];
        Arrays.fill(dp,1);
int hash[]=new int[n];
Arrays.fill(hash,1);

        for (int ind = 0; ind <n ; ind++) {
            hash[ind]=ind;
            for (int prev = 0; prev <ind ; prev++) {

                if(arr[prev]<arr[ind]&&1+dp[prev]>dp[ind]){
                    hash[ind]=prev;
           dp[ind]=1+dp[prev];
                }
            }
        }

        int maxi=-1;

        int lastIndex=-1;
        for (int i = 0; i <=n-1 ; i++) {
            if (dp[i]>maxi){
                maxi=dp[i];
                lastIndex=i;

            }
        }
ans.add(arr[lastIndex]);
        while (hash[lastIndex]!=lastIndex){
        lastIndex=hash[lastIndex];
            ans.add(arr[lastIndex]);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static   void main(String[] args) {
        int n = 6;
        int arr []= {4, 6, 1, 2, 4, 6};
        ArrayList<Integer> ans=longestIncreasingSubsequence(n,arr);
        System.out.println(ans);
    }
}
