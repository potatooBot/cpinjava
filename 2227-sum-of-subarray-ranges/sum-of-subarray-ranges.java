class Solution {
    public long subArrayRanges(int[] nums) {
     long sum=0;
int n=nums.length;
     for(int i=0;i<n;i++){
int mini=Integer.MAX_VALUE;
int maxi=Integer.MIN_VALUE;
for(int j=i;j<n;j++){
    mini=Math.min(mini,nums[j]);
    maxi=Math.max(maxi,nums[j]);
    sum=sum+(maxi-mini);
}


     }
return sum;
    }
}