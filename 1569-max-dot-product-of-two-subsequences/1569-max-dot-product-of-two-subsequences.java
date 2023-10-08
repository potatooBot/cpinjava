class Solution {
     static int lcs(int nums1[], int nums2[]) {
    
    int n=nums1.length;
    int m=nums2.length;

    int dp[][]=new int[n+1][m+1]; 
 
    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(ind1==0||ind2==0)
            dp[ind1][ind2]=Integer.MIN_VALUE;
            else{
dp[ind1][ind2] =Math.max(nums1[ind1-1]*nums2[ind2-1] +Math.max(dp[ind1-1][ind2-1],0),Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]));
           
        }
    }
    }
   for(int rows[]:dp)
   System.out.println(Arrays.toString(rows));
  return dp[n][m];
}
public static boolean checkMin(int nums[]){
    boolean flag=false;
    for(int ele:nums){
        if(ele>0)
        flag=true;
    }
return flag;

}
    public int maxDotProduct(int[] nums1, int[] nums2) {
 int res=lcs(nums1,nums2);
 boolean flag1=checkMin(nums1);
boolean flag2=checkMin(nums2);
if(!flag1||!flag2){
int len=Math.min(nums1.length,nums2.length);
int len2=Math.max(nums1.length,nums2.length);
int ans=-100000;
for(int i=0;i<len-1;i++){
    for(int j=0;j<len2;j++){
ans=Math.max(nums1[i]*nums2[j],ans);
}
}
return ans;
}
       
 if(res==0) return -1;
 return res;
    }
}