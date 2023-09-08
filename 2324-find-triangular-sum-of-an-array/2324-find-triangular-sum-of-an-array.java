class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> ds=new ArrayList<>();

     List<List<Integer>> ans=new ArrayList<>(); 
for(int i=0;i<nums.length;i++){
    ds.add(nums[i]);
}

ans.add(new ArrayList<>(ds));
for(int i=1;i<ds.size();i++){
List<Integer> prev=ans.get(i-1);

List<Integer> list=new ArrayList<>();
int carry=0;
for(int j=0;j<prev.size()-1;j++){
    int sum=prev.get(j)+prev.get(j+1) ;
list.add(sum%10);

}

ans.add(new ArrayList<>(list));
}

return ans.get(ds.size()-1).get(0);

    }
}