class Solution {
    public boolean increasingTriplet(int[] arr) {
        /* int n=arr.length;
     int dp[]=new int[n+1]  ;
     int maxi=1;
     Arrays.fill(dp,1);
    for(int i=0;i<n;i++){
        for(int prev=0;prev<i;prev++){
            if(arr[i]>arr[prev]&&dp[i]<1+dp[prev]){
                dp[i]=1+dp[prev];
            maxi=Math.max(maxi,dp[i]);
            }
            if(maxi==3) return true;
        }
    }*/

    int first=Integer.MAX_VALUE;
    int sec=Integer.MAX_VALUE;
    for(int ele:arr){
if(ele<=first){
    first=ele;
}
else if(ele<=sec){
    sec=ele;
}
else{
    return true;
}
    }
    return false;
    }
}