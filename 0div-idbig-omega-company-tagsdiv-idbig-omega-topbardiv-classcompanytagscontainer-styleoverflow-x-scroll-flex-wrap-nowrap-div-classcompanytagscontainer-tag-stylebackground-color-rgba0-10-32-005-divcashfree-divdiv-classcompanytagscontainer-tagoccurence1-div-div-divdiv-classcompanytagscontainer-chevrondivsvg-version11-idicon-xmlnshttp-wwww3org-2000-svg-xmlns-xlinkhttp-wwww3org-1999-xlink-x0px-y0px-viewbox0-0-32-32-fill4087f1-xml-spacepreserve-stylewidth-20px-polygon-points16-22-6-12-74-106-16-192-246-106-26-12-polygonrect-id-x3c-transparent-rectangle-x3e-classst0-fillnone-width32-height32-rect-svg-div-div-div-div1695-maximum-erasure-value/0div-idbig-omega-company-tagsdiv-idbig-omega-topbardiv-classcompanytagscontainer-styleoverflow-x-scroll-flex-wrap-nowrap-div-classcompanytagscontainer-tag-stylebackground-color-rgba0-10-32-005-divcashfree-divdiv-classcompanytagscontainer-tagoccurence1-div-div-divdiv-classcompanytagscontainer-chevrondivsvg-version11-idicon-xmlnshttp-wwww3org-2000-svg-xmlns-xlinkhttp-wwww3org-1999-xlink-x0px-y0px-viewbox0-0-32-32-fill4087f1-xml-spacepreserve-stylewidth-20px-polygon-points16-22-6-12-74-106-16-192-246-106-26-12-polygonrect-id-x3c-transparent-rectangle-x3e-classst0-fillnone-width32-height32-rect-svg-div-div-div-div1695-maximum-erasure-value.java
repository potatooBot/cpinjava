class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
int start=0;
int ans=0;
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    sum=sum+nums[i];
map.put(nums[i],map.getOrDefault(nums[i],0)+1);

if(map.get(nums[i])>1){
    while(map.get(nums[i])>1){
        sum=sum-nums[start];
        map.put(nums[start],map.get(nums[start])-1);
        start++;
    }
}
ans=Math.max(sum,ans);
}
return ans;
    }
}