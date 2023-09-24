class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCnt=0;
        int n=nums.length;
int ans=0;
int start=0;
    for(int end=0;end<n;end++){
if(nums[end]==0){
    zeroCnt++;
}
while(zeroCnt>k){
    if(nums[start]==0){
        zeroCnt--;
    }
    start++;
}

ans=Math.max(ans,end-start+1);
    }
    return ans;
    }
}