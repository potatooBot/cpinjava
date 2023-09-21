class Solution {
public static boolean getAns(int []nums,int target,int idx,int dp[][],int mul,int ans[]){
    if(idx>nums.length||idx<=0) return false;
if(target==0){
    ans[0]=Math.max(ans[0],mul);
    return true;
}
if(idx==2){
    if(nums[2]==target){
        ans[0]=Math.max(ans[0],mul*nums[2]); 
    return true;
    }
    else{
        return false;
    }
}

if(dp[idx][target]!=-1){
    return dp[idx][target]==1?true:false;
}
boolean notTake=getAns(nums,target,idx-1,dp,mul,ans);
boolean take=false;
if(nums[idx]<=target){
take= getAns(nums,target-nums[idx],idx,dp,mul*nums[idx],ans);
}
if(notTake||take){
    dp[idx][target]=1;
}
else{
    dp[idx][target]=0;
}
return notTake||take;
}
    public int integerBreak(int n) {
if (n == 2 || n == 3) return (n-1);
if(n==4) return 4;
        int nums[]=new int [n];
        for(int i=1;i<n;i++){
            nums[i]=i;
        }

        int dp[][]=new int[n][n+1];

        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
int ans[]=new int [1];
        getAns(nums,n,n-2,dp,1,ans);
return ans[0];
    }
}