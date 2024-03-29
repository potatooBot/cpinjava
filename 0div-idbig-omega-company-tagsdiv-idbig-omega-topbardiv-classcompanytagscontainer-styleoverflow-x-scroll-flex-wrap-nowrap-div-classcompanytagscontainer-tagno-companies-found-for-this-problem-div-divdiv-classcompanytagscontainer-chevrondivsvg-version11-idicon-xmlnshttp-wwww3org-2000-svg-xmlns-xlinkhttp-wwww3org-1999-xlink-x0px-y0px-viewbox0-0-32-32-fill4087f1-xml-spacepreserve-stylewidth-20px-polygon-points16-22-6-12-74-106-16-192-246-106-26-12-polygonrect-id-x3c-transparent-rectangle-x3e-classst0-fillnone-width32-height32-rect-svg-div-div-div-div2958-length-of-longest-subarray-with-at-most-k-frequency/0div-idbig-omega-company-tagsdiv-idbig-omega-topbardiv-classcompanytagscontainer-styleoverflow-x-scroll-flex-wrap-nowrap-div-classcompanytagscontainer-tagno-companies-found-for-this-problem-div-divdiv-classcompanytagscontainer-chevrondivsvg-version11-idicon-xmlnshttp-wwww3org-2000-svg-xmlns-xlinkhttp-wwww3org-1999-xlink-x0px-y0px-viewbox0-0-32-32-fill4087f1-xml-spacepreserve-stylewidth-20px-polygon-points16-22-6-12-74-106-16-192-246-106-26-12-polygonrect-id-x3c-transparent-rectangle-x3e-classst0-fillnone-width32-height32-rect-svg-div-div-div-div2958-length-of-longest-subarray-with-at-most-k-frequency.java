class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start=0;
int ans=0;
HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for( i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
              int store=nums[i];
            while(map.get(store)>k){
            System.out.println(start);
int val=map.get(nums[start]);
map.put(nums[start],val-1);
start++;
            }
//System.out.println("Storing answer "+(i-start+1)+" start = "+start);
ans=Math.max(ans,(i-start+1));
        }
        //ans=Math.max(ans,(i-start+1));

        return ans;
    }
}