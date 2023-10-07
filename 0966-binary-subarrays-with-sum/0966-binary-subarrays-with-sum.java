class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
int cnt=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum-goal;
if(map.containsKey(rem)){
    cnt=cnt+map.get(rem);
}
map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}