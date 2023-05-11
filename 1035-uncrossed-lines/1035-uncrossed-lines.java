class Solution {
        public int getSub(int idx1,int idx2,int nums1[],int  nums2[],int dp[][]){
if(idx1<0||idx2<0) return 0;


if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        if(nums1[idx1]==nums2[idx2]) {
            return dp[idx1][idx2]=1+getSub(idx1-1,idx2-1,nums1,nums2,dp);
        }
        return dp[idx1][idx2]= 0+Math.max(getSub(idx1-1,idx2,nums1,nums2,dp),getSub(idx1,idx2-1,nums1,nums2,dp));
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
           int n=nums1.length;
        int m=nums2.length;
        int dp[][]=new int[n+1][m+1];
        for(int rows[]:dp){
Arrays.fill(rows,-1);
        }



return getSub(n-1,m-1,nums1,nums2,dp);
    }
}