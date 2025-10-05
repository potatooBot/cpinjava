class Solution {
    public static void getAllCombination(int ind,int nums[],int target,List<List<Integer>> ans,ArrayList<Integer> ds){
        Arrays.sort(nums);
        if(target==0){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }

        for(int i=ind;i<nums.length;i++){
if(ind<i &&nums[i]==nums[i-1]) continue;

if(nums[i]>target) break;
ds.add(nums[i]);
getAllCombination(i+1,nums,target-nums[i],ans,ds);
ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        getAllCombination(0,nums,target,ans,new  ArrayList<>());
        return ans;
    }
}