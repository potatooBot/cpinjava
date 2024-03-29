class Solution {
    public long countSubarrays(int[] nums, int k) {
      int maxi=-1;

      for(int ele:nums) 
      maxi=Math.max(maxi,ele);


      long cnt=0;
int start=0;
long ans=0;

      for(int i=0;i<nums.length;i++){
   if(nums[i]==maxi) cnt++;
      while(cnt>=k){
        System.out.println(start+" "+i);
        if(nums[start]==maxi) cnt--;
        start++;
      }
ans=ans+start;
      
      }

      return ans;

    }
}