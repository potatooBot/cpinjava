class Solution {
  public static void getSub(int nums[],int idx,ArrayList<Integer> ds,int k,ArrayList<ArrayList<Integer>> ans){

        if(idx==nums.length){
            if(ds.size()==0) return;
     ans.add(new ArrayList<>(ds));
            return ;
        }

      if(ds.contains(nums[idx]-k)==false){
ds.add(nums[idx]);
        getSub(nums,idx+1,ds,k,ans);
        ds.remove(ds.size()-1);
      }

        getSub(nums,idx+1,ds,k,ans);
    }
    public static int beautifulSubsets(int[] nums, int k) {
        ArrayList<Integer> ds=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        getSub(nums,0,ds,k,ans);
       // System.out.println(ans);
        return ans.size();
    }
}