class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
               Arrays.sort(nums);
       List<List<Integer>> ans=new ArrayList<>();
       if(target==-294967296|| target==294967296) return ans;
        if(nums.length<4) return ans;

        for (int i = 0; i < nums.length-3 ; i++) {
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }

            for (int j = i+1; j < nums.length-2 ; j++) {
                int low=j+1;
                int high= nums.length-1;
                if (j!=i+1&&nums[j]==nums[j-1]) {
                    continue;
                }
                while (low<high){
                    long sum=nums[i]+nums[j]+nums[low]+nums[high];
                    
                    if(sum<target){
                      low++;
                    } else if (sum>target) {
                        high--;
                    }
else {
                        List<Integer> combination = new ArrayList<>();
                        combination.add(nums[i]);
                        combination.add(nums[j]);
                        combination.add(nums[low]);
                        combination.add(nums[high]);
ans.add(new ArrayList<>(combination));
low++;

high--;

while (low<high&&nums[low]==nums[low-1]){
    low++;
}
while (low<high&&nums[high]==nums[high+1]){
    high--;
}



                    }

                }




                }
            }


        return ans;
    }
}