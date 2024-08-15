package Algorithm.Dynamic_Programming.Dp_On_Longest_Increasing_Subsequence.Maximum_Sum_of_Elements_Not_Part_of_LIS;
import java.util.*;
public class maximum_sum_of_elements_not_part_of_LIS {
 public static boolean isSorted(int arr[]){
     for (int i = 0; i < arr.length-1 ; i++) {
         if(arr[i]<arr[i+1]){
             return false;
         }
     }
     return true;
 }
       static int maxSumLis(int arr[], int n) {
//           int dp[]=new int[n];
//           Arrays.fill(dp,1);
//           int lastidx=0,max=0;
//           int hash[]=new int[n];
//           int sum=0;
//           for(int i=0;i<n;i++)
//           {
//               sum+=arr[i];
//               hash[i]=i;
//               for(int prev=0;prev<i;prev++)
//               {
//                   if(arr[i]>arr[prev])
//                   {
//                       if(dp[i]<dp[prev]+1)
//                       {
//                           dp[i]=dp[prev]+1;
//                           hash[i]=prev;
//                       }
//                       else if(dp[i]==dp[prev]+1)
//                       {
//                           if(arr[prev]<arr[i])
//                           {
//                               hash[i]=prev;
//                           }else{
//                               hash[i]=i;
//                           }
//                       }
//                   }
//               }
//
//               if(dp[i]>=max)
//               {
//                   max=dp[i];
//                   lastidx=i;
//               }
//           }
//
//           System.out.println(lastidx);
//           sum-=arr[lastidx];
//           System.out.println(Arrays.toString(hash));
//           //System.out.println(arr[lastidx]);
//
//           ArrayList<Integer> temp=new ArrayList<>();
//           temp.add(arr[lastidx]);
//           while(hash[lastidx]!=lastidx)
//           {
//
//               lastidx=hash[lastidx];
//               temp.add(arr[lastidx]);
//               //System.out.println(arr[lastidx]);
//               sum-=arr[lastidx];
//           }
//           System.out.println(temp);
//           return sum;
           int hash[] = new int[n];
           Arrays.fill(hash, 1);
           int dp[] = new int[n];
           Arrays.fill(dp, 1);
           int maxi = 0;
           int sum = 0;
           for (int i = 0; i < arr.length; i++) {
               sum += arr[i];
           }
           for (int ind = 0; ind < n; ind++) {

               hash[ind] = ind;
               for (int prev_ind = 0; prev_ind < ind; prev_ind++) {
                   if (arr[prev_ind] < arr[ind]) {
                       if (dp[ind] <= dp[prev_ind] + 1) {
                           dp[ind] = 1 + dp[prev_ind];
                           hash[ind] = prev_ind;

                       }
                   }

               }
           }
               int max = -1;
               int lastidx = -1;
               for (int i = 0; i < dp.length; i++) {
                   if (dp[i] >= max) {
                       max = dp[i];
                       lastidx = i;
                   }
               }
               ArrayList<Integer> temp = new ArrayList<>();

               temp.add(arr[lastidx]);
               sum = sum - arr[lastidx];
               while (hash[lastidx] != lastidx) {
                   lastidx = hash[lastidx];
                   temp.add(arr[lastidx]);
                   sum = sum - arr[lastidx];
               }
               System.out.println(temp);


           return sum;
       }

    public static void main(String[] args) {
int n = 9;
        int arr[] = {5, 13, 2, 11, 6, 8, 14, 8, 13};
    int ans=maxSumLis(arr,n);
        System.out.println(ans);
    }
}
