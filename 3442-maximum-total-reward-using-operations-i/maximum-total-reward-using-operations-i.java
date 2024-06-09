class Solution {
//static int ans[]=new int[1];
    public static int getMax(int arr[],int dp[][],int idx,int x){
        //if(idx==0&&x<arr[idx]) return x+arr[idx];
        if(idx>=arr.length ||x>arr[arr.length-1]) return 0;
    if(dp[idx][x]!=-1) return dp[idx][x];

 // System.out.println("val out "+x+" "+arr[idx]);
 int ans=0;
    if(x<arr[idx]){
    
ans= Math.max(arr[idx]+getMax(arr,dp,idx+1,x+arr[idx]),getMax(arr,dp,idx+1,x));
    }
    else{
        ans=getMax(arr,dp,idx+1,x);
    }
return dp[idx][x]=ans;
    }
    public int maxTotalReward(int[] rew) {
        Arrays.sort(rew);
    
int x=Arrays.stream(rew).sum();
int n=rew.length;
    int dp[][]=new int[n+1][rew[n-1]+1];
        for(int row[]:dp)
        Arrays.fill(row,-1);



//int ans[]=new int[1];
         int res= getMax(rew,dp,0,0);

   return res;
    }
}