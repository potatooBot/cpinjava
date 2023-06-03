package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Maximum_Sum_of_Element_not_part_of_LIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class maximum_sum_of_element_not_part_of_LIS {
      static int maxSumLis(int arr[], int n) {
     int dp[]=new int[n];
          Arrays.fill(dp,1);

          int hash[]=new int[n];
          Arrays.fill(hash,1);
          for (int ind = 0; ind <n ; ind++) {
              hash[ind]=ind;
              for (int prev = 0; prev <ind ; prev++) {
                  if(arr[ind]>arr[prev]&&dp[prev]+1>dp[ind]){
                      hash[ind]=prev;
                      dp[ind]=1+dp[prev];
                  }
              }
          }
          int maxi=-1;
          int lastofIndex=-1;
          for (int i = 0; i <n ; i++) {
              if(dp[i]>maxi){
                  maxi=dp[i];
                  lastofIndex=i;
              }
          }
          ArrayList<Integer> lis=new ArrayList<>();
lis.add(arr[lastofIndex] );
          while (hash[lastofIndex]!=lastofIndex){
    lastofIndex=hash[lastofIndex];
    lis.add(arr[lastofIndex]);
}
          Collections.reverse(lis);
          System.out.println(lis);
    return 0;    // code here
    }
    public static void main(String[] args) {
        int n = 5;
        int []arr = {5, 4, 3, 2, 1};
int ans=maxSumLis(arr,n);
        System.out.println(ans);
    }
}
