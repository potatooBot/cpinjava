class Solution {
    public int destroyTargets(int[] nums, int space) {
  
       int maxi_freq=Integer.MIN_VALUE;

HashMap<Integer,Integer> map=new HashMap<>();
       for(int ele:nums){
          int r=ele%space;
           map.put(r,map.getOrDefault(r,0)+1);
       maxi_freq=Math.max(maxi_freq,map.get(r));
       }
int ans=Integer.MAX_VALUE;
for(int i=0;i<nums.length;i++){
int r=nums[i]%space;
if(map.get(r)==maxi_freq){
    ans=Math.min(ans,nums[i]);
}
}
return ans;
    }
}