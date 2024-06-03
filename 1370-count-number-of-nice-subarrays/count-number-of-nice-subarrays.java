class Solution {
     public int subarraySum(int[] nums, int target) {
                HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            sum=sum+nums[i];
            int remSum=sum-target ;
            if(map.containsKey(remSum)){
                count=count+map.get(remSum);
            }
           
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
      for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0) nums[i]=0;
        else{
            nums[i]=1;
        }
      }
      int ans=subarraySum(nums,k);
 return ans;
    }
}