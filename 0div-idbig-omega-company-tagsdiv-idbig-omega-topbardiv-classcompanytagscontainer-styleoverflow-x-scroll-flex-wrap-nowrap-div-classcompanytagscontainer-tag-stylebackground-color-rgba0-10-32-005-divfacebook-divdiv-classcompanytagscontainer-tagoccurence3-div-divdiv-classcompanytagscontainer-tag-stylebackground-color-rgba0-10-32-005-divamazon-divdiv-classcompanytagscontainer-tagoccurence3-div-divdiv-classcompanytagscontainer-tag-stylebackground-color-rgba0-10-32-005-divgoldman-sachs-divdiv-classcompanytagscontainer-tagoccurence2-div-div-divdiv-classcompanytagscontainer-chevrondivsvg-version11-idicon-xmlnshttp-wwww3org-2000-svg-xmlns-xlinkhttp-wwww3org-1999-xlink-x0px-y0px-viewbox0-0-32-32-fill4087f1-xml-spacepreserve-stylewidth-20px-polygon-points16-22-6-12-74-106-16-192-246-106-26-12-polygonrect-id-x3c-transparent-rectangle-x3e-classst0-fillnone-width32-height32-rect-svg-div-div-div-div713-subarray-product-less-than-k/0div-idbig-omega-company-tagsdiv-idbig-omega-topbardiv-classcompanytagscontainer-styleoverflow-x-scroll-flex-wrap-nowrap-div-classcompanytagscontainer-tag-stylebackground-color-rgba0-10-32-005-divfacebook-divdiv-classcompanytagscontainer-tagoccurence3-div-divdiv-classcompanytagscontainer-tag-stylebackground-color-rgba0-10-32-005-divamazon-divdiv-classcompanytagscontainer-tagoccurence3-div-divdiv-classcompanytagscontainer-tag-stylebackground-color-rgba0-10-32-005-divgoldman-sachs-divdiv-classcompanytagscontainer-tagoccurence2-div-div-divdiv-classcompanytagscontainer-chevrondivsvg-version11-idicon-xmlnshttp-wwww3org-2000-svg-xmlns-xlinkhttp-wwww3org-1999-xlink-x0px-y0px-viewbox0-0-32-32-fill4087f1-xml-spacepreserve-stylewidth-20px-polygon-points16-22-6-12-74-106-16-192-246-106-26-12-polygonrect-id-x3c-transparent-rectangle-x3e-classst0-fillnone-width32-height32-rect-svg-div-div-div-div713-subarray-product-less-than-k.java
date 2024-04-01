class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    if(k<=1) return 0;
        int start=0;
        int prod=1;
        int cnt=0;
        int end=0;
 for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];
            while(prod>=k){
                prod=prod/nums[start];
                start++;
            }      
                cnt=cnt+(i-start+1);
            
            end++;
        }
        return cnt;
    }
}