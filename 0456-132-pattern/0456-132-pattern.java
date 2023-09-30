class Solution {
    public boolean find132pattern(int[] nums) {
     

        Stack<Integer> s = new Stack<>();

        int mx = Integer.MIN_VALUE;

        for(int i = nums.length-1;i >= 0;i--){
            if(nums[i] < mx){
                return true;
            }

            while(!s.isEmpty() && s.peek() < nums[i]){
                mx = s.pop();
            }

            s.add(nums[i]);
        }

        return false;
    }
    
}