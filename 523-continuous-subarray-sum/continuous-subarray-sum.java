class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       // map.put(0,1);
int sum=0;
        for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];

          int rem=sum%k;

        if(rem==0&&i>0){
            return true;
        }  

        if(map.containsKey(rem)){
            if(map.get(rem)<i)
            return true;
        }
else
        map.put(rem,i+1);
        }
        return false;
    }
}