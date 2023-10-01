class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
      int count=0;
int n=nums.length;
      if(n<3)
      return 0;
int arth=0;
      for(int i=2;i<n;i++){
          if((nums[i]-nums[i-1])==(nums[i-1]-nums[i-2])){
              arth++;
              count=count+arth;
          }
          else{
              arth=0;
          }
      }  

      return count;
    }
}