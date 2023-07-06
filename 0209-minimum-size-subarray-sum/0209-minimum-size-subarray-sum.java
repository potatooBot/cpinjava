class Solution {
    public int minSubArrayLen(int target, int[] nums) {
                int prefSum=0;
        int start=0;
        int maxi=Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            prefSum+=nums[i];
            if(prefSum>=target){
                while(prefSum>=target){
                    maxi=Math.min(maxi,i-start+1);
                    prefSum=prefSum-nums[start];
                    start++;
                    
                }

            }

        }
if(maxi==Integer.MAX_VALUE){
    return 0;
}
        return maxi;
    }
}