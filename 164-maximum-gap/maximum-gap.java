class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length-1;i++)
{
    ans=Math.max(ans,nums[i+1]-nums[i]);
}

return ans;
    }
}