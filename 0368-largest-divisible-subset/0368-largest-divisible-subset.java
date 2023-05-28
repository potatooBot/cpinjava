class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n= nums.length;
         List<Integer> ans=new ArrayList<>();
         Arrays.sort(nums);
    int dp[]=new int[n];
    Arrays.fill(dp,1);
    int hash[]=new int[n];
    Arrays.fill(hash,1);

        for (int ind = 0; ind <=n-1 ; ind++) {
            hash[ind]=ind;
            for (int prev_ind = 0; prev_ind <=ind-1 ; prev_ind++) {
                if(nums[ind]%nums[prev_ind]==0&&dp[ind]<dp[prev_ind]+1){
                    dp[ind]=1+dp[prev_ind];
                    hash[ind]=prev_ind;
                }
            }
        }
        int maxi=-1;
        int lastIndex=-1;
        for (int i = 0; i <dp.length ; i++) {
            if(dp[i]>maxi){
                maxi=dp[i];
                lastIndex=i;
            }
        }
        ans.add(nums[lastIndex]);
        while (hash[lastIndex]!=lastIndex){
            lastIndex=hash[lastIndex];
            ans.add(nums[lastIndex]);
        }

    return ans;
    }
}