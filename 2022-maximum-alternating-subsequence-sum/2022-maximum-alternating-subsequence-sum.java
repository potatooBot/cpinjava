class Solution {
    public static long getAns(int nums[],long dp[][],int idx,boolean flag){

if(idx>=nums.length) return 0;
if(dp[idx][flag==true?1:0]!=-1) return dp[idx][flag==true?1:0];
long sum=0;
//System.out.println(count);
long nottake=getAns(nums,dp,idx+1,flag);
long value=0;
if(flag==false)
 value=-nums[idx];
else{
    value=nums[idx];
}
long take=value+getAns(nums,dp,idx+1,!flag);


return dp[idx][flag==true?1:0]=Math.max(take,nottake);
    }
    public long maxAlternatingSum(int[] nums) {
     long dp[][]=new long[nums.length][2];
    for(long rows[]:dp)
     Arrays.fill(rows,-1);
     return (long)getAns(nums,dp,0,true)   ;
    }
}