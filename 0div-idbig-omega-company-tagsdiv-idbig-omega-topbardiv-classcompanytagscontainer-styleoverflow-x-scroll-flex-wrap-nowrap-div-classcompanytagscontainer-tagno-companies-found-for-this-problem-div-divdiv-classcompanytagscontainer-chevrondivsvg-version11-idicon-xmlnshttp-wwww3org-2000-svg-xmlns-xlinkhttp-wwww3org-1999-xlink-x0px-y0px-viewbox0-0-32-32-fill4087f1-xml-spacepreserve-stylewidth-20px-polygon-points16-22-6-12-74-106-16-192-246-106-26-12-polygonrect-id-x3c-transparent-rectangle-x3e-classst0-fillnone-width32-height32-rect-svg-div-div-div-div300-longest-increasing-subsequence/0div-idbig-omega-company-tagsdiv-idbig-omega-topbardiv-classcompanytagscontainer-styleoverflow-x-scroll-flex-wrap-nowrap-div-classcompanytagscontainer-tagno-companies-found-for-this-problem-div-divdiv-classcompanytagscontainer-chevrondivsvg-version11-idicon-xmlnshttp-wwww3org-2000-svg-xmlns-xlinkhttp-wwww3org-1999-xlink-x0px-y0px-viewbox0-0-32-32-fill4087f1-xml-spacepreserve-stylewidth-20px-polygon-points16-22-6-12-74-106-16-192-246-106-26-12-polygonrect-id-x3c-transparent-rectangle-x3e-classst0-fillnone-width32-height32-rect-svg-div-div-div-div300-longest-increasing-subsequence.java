class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
         int count[]=new int[n];
  int dp[]=new int[n];
  Arrays.fill(dp,1);
Arrays.fill(count,1);  
  int maxi=-1;
  for(int ind=0;ind<n;ind++){
      for(int prev=0;prev<ind;prev++){
          if(arr[ind]>arr[prev]&&dp[ind]<dp[prev]+1){
              dp[ind]=dp[prev]+1;
              count[ind]=count[prev];
          }
          else if(arr[ind]>arr[prev]&&dp[ind]==dp[prev]+1){
              count[ind]= count[ind]+count[prev];
          }
          
      }
      maxi=Math.max(maxi,dp[ind]);
  }
  
  
  int cnt=0;
  
  for(int i=0;i<n;i++){
      if(maxi==dp[i]){
          cnt=cnt+count[i];
      }
  }
  
  return maxi;
    }
}