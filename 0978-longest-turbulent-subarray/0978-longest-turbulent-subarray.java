class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int dp[]=new int[arr.length];

if(arr.length==1) return 1;
dp[0]=1;
if(arr[1]!=arr[0]){
    dp[1]=2;
}
else {
    dp[1]=0;
}
        for (int i = 2; i <arr.length ; i++) {
            if(arr[i-2]>arr[i-1]&&arr[i-1]<arr[i]|| arr[i-2]<arr[i-1]&&arr[i-1]>arr[i]){
                dp[i]=dp[i-1]+1;
            }
            else {
                if(arr[i]!=arr[i-1]){
                    dp[i]=2;
                }
                else {
                    dp[i]=1;
                }
            }
        }
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            maxi=Math.max(maxi,dp[i]);
        }

        return maxi;
    }
}