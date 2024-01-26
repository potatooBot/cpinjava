class Solution {
    public static long getWays(int n,int m,int row,int col,int maxM,long dp[][][]){
//System.out.println(row+" "+col+" moves= "+maxM);
if((row<0||col<0||row==n||col==m)&&maxM>=0 ){
return 1;
}
if(maxM<0) return 0;
int mod=(int)Math.pow(10,9)+7;
if(dp[row][col][maxM]!=-1) return dp[row][col][maxM];
long moveUp=getWays(n,m,row-1,col,maxM-1,dp)%mod;
long moveDown=getWays(n,m,row+1,col,maxM-1,dp)%mod;
long moveLeft=getWays(n,m,row,col-1,maxM-1,dp)%mod;
long moveRight=getWays(n,m,row,col+1,maxM-1,dp)%mod;


dp[row][col][maxM]=((moveUp%mod)+moveDown%mod+ moveLeft%mod +moveRight%mod)%mod;

return dp[row][col][maxM];
    }
    public int findPaths(int n, int m, int maxMove, int stR, int stC) {
        long dp[][][]=new long[n][m][maxMove+1];

        for(long c[][]:dp){
for(long row[]:c){
    Arrays.fill(row,-1);
}
        }

long ans=getWays(n,m,stR,stC,maxMove,dp);
return (int)ans;
    }
}