class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }

        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(set.contains(ele-1)==false){
                int count=1;
                int curEle=ele;
                while(set.contains(curEle+1)==true){
                    count++;
                    curEle=curEle+1;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}