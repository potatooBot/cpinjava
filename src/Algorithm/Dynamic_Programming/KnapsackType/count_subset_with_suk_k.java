package Algorithm.Dynamic_Programming.KnapsackType;

import java.util.Arrays;

public class count_subset_with_suk_k {



    public static int findWaysUtil(int arr[],int idx,int target,int dp[][]){
        if(idx==0){
            if(target==0 && arr[0]==target) return 2;
            else if(arr[0]==target || target==0) return 1;
            else return 0;
        }

        if(dp[idx][target]!=-1) return dp[idx][target];
        int notTake = findWaysUtil(arr,idx-1,target,dp);
        int take = 0;
        if(arr[idx]<=target) take =findWaysUtil(arr,idx-1,target-arr[idx],dp);

        return dp[idx][target] = (notTake + take)%1000000007;
    }

    public int perfectSum(int arr[],int n, int sum)
    {
        // Your code goes here
        int dp[][]=new int[n][sum+1];
        for(int row[]:dp) Arrays.fill(row,-1);

        return findWaysUtil(arr,n-1,sum,dp);

    }

    static int findWaysMemo(int[] num, int k){
            int n = num.length;
            int dp[][]=new int[n][k+1];
            for(int row[]: dp)
                Arrays.fill(row,-1);

            return findWaysUtil(num,n-1,k,dp);
        }

        static int findWaysTabula(int[] num, int k){
            int n = num.length;

            int[][] dp=new int[n][k+1];

            for(int i=0; i<n; i++){
                dp[i][0] = 1;
            }

            if(num[0]<=k)
                dp[0][num[0]] = 1;

            for(int ind = 1; ind<n; ind++){
                for(int target= 1; target<=k; target++){

                    int notTaken = dp[ind-1][target];

                    int taken = 0;
                    if(num[ind]<=target)
                        taken = dp[ind-1][target-num[ind]];

                    dp[ind][target]= notTaken + taken;
                }
            }

            return dp[n-1][k];
        }

        public static void main(String args[]) {

            int arr[] = {1,2,2,3};
            int k=3;

//            System.out.println("The number of subsets found are "+findWaysMemo(arr,k));
            System.out.println("The number of subsets found are "+findWaysTabula(arr,k));
        }
    }

