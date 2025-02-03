class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int cnt=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                cnt++;
                ans=Math.max(ans,cnt);
            }
            else{
                cnt=1;
            }
        }
System.out.println(ans);
cnt=1;
for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                cnt++;
                ans=Math.max(ans,cnt);
            }
            else{
                cnt=1;
            }
        }
System.out.println(ans);
    return ans;
    }
}