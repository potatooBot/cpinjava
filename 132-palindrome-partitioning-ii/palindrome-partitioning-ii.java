class Solution {
    public static boolean isPalin(String s,int i,int j  ){
        int x=i;
        int y=j;
while(x<y){
    if(s.charAt(x)!=s.charAt(y)){
    return false;
    }
        x++;
        y--;
    
}
        return true;

    }
    public static int getMin(int i,int n,String s,int dp[]){
        if(i==n) return 0;

if(dp[i]!=-1) return dp[i];

        int mini=Integer.MAX_VALUE;

        for(int j=i;j<n;j++){
            if(isPalin(s,i,j)){
                int cost=1+getMin(j+1,n,s,dp);
                mini=Math.min(mini,cost);
            }
        }
        return dp[i]=mini;
    }
    public int minCut(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return getMin(0,n,s,dp)-1;
    }
}