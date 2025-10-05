class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length==0) return ans;
    getAllCombination(0,nums,target,new ArrayList<>(),ans);

    return ans;
    }
    public static void getAllCombination(int ind,int nums[],int target,ArrayList<Integer> ds,List<List<Integer>> ans){
        if(ind==nums.length)
        {
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            return;
        }


        if(nums[ind]<=target){
            ds.add(nums[ind]);
            getAllCombination(ind,nums,target-nums[ind],ds,ans);
            ds.remove(ds.size()-1);
        }
        getAllCombination(ind+1,nums,target,ds,ans);
    }
}