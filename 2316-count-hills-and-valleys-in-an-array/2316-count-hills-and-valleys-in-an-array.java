class Solution {
   public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 1;i < n-1; i ++){
			//assigning the immediate left from the index i
            int left = i-1;
			//assigning the immediate right from the index i
            int right = i+1;
			//Searching for the closest neighbour at the left whose value not equal to the ith index
            while(left != 0 && nums[left] == nums[i]){
                left--;
            }
			//Searching for the closest neighbour at the right whose value not equal to the ith index and not equal to the left closest neighbour
            while(right != n && nums[right] == nums[i] && nums[left] == nums[right]){
                right++;
            }
			//checking if any of the left and right index does meet the closest neighbour
            if(left == -1 || right == n){
                continue;
            }
			//check if its a hill
            if(nums[i] > nums[left] && nums[i] > nums[right]){
                count++;
				//if its a hill no need to check if its valley or not
                continue;
            }
			//check if its a valley
            if(nums[i] < nums[left] && nums[i] < nums[right]){
                count++;
            }
        }
        return count;
    }


}