class Solution {
    public boolean checkSubarraySum(int[] nums, int target) {
                      HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
    if(nums.length==1) return false;
        for (int i = 0; i <nums.length ; i++) {
            sum=sum+nums[i];
            int rem=sum%target ;
if(rem==0&&i>0) return true;
            if(map.containsKey(rem)){
                if(map.get(rem)<i){
                    return true;
                }
            }
             else
            map.put(rem, i+1);
        }
return false;
    }
}