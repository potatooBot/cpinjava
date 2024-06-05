class Solution {
    public int lengthOfLIS(int[] arr) {
   int n=arr.length;
     int dp[]=new int[n+1]  ;
     int maxi=1;
     Arrays.fill(dp,1);
    for(int i=0;i<n;i++){
        for(int prev=0;prev<i;prev++){
            if(arr[i]>arr[prev]&&dp[i]<1+dp[prev]){
                dp[i]=1+dp[prev];
            maxi=Math.max(maxi,dp[i]);
            }
        }
    }
    return maxi;
    }
}