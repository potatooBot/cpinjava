class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxi=0;
        for(int i=0;i<n-2;i++){
for(int j=i+1;j<n-1;j++){
    for(int k=j+1;k<n;k++){
maxi=Math.max(maxi,((long)nums[i]-(long)nums[j])*nums[k]);
    }
}

        }
return maxi;
    }
}