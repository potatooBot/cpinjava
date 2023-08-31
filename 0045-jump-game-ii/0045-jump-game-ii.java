class Solution {
    public int jump(int[] nums) {
        int left=0;
        int right=0;


int ans=0;
while(right<nums.length-1){
    int farthest=0;
        for(int i=left;i<right+1;i++){
            farthest=Math.max(farthest,i+nums[i]);
        }
        System.out.println(farthest);
        left=right+1;
        right=farthest;
        ans++;
    
    
    }
    return ans;
    }

}