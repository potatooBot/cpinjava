class Solution {
    public boolean canJump(int[] nums) {
     
     int goal=0;
        for(int i=nums.length-1;i>=0;i--) {
            if(i+nums[i]>=goal)
                goal=i;
                }
      
    
    
      return goal==0?true:false;
}
}