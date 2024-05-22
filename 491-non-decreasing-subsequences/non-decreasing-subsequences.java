class Solution {
 
      public static void getSub(int nums[],List<List<Integer>> ans,List<Integer> ds,int idx,int prev,HashSet<List<Integer>> set){
      // System.out.println(ds);
        if(idx==nums.length||prev==nums.length){
            boolean flag=true;
if(ds.size()>=2){
set.add(new ArrayList<>(ds));
}
return;
        }

     if(prev==-1||nums[idx]>=nums[prev]){
        List<Integer> ds1=new ArrayList<>(ds);
        ds1.add(nums[idx]);
        getSub(nums,ans,ds1,idx+1,idx,set);
        
     }

        getSub(nums,ans,ds,idx+1,prev,set);
     
  
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
 HashSet<List<Integer>> set=new HashSet<>();
        getSub(nums,ans,new ArrayList<>(),0,-1,set);

        for(List<Integer> ele:set) ans.add(new ArrayList<>(ele));
        return ans;
    }
}