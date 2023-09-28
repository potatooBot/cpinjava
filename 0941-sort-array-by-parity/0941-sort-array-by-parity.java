class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
int idx=0;
        for(int ele:nums){
            if(ele%2==0)
ans[idx++]=ele;
        }
     for(int ele:nums){
            if(ele%2!=0)
ans[idx++]=ele;
        }
return ans;
    }
}