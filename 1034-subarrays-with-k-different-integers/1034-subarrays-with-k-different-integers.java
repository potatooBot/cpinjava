class Solution {
    public int subarraysAtmost(int[] nums, int k) {
   HashMap<Integer,Integer> map=new HashMap<>();
        int start=0;
    
        int count=0;
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.size()>k){
              map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                 map.remove(nums[start]);
             }
                start++;
            }
           count=count+( end-start+1);   
        }
        return count;   
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
      return subarraysAtmost(nums,k)-subarraysAtmost(nums,k-1);
    }
}