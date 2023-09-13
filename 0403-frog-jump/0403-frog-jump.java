class Solution {
    public boolean canCross(int[] stones) {
        int n=stones.length;
        int dp[][]=new int[n][n];

        for(int rows[]:dp)
        Arrays.fill(rows,-1);
    
    return getJump(stones,0,0,dp)==1;
    }


    public static int getJump(int stones[],int idx,int jump,int dp[][]){
if(dp[idx][jump]!=-1) {
    return dp[idx][jump];
}
int idx2=Arrays.binarySearch(stones,idx+1,stones.length,stones[idx]+jump);
if(idx2>=0&&getJump(stones,idx2,jump,dp)==1){
    return dp[idx][jump]=1;
}

int idx1=Arrays.binarySearch(stones,idx+1,stones.length,stones[idx]+jump-1);
if(idx1>=0&&getJump(stones,idx1,jump-1,dp)==1){
    return dp[idx][jump-1]=1;
}




int idx3=Arrays.binarySearch(stones,idx+1,stones.length,stones[idx]+jump+1);
if(idx3>=0&&getJump(stones,idx3,jump+1,dp)==1){
    return dp[idx][jump+1]=1;
}



if(idx==stones.length-1){
    dp[idx][jump]=1;
}
else{
    dp[idx][jump]=0;
}


return dp[idx][jump];
    }
}