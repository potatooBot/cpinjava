class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;

int n=nums.length;
int start=0;
int ans=1000000;
        for(int end=0;end<n;end++){
sum=sum+nums[end];
if(sum>=target)
ans=Math.min(ans,end-start+1);

while(sum>=target){
sum=sum-nums[start];
ans=Math.min(ans,end-start+1);
start++;
}
        }
 if(ans==1000000) return 0;
 return ans;
    }
}