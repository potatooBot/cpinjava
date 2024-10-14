class Solution {
    public int sumOfBeauties(int[] nums) 
    {
        int n=nums.length;
        int max_left[]=new int[n];
        int min_right[]=new int[n];
        int ans=0;
        
        for(int i=1;i<n;i++)
        {
            max_left[i]=Math.max(max_left[i-1],nums[i-1]);
        }
        
        min_right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            min_right[i]=Math.min(min_right[i+1],nums[i+1]);
        }
        
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>max_left[i] && nums[i]<min_right[i])
            ans+=2;
            
            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1])
            ans++;
        }
        
        return ans;
    }
}