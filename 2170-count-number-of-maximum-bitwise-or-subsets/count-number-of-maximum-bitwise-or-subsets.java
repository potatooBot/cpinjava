class Solution {
    public void backtrack(int nums[],TreeMap<Integer,Integer> map,int idx,ArrayList<Integer> ds)
{
    if(idx==nums.length){
        int val=0;

        for(int ele:ds)
        val=val|ele;

        map.put(val,map.getOrDefault(val,0)+1);
return ;
    }

    ds.add(nums[idx]);
    backtrack(nums,map,idx+1,ds);
    ds.remove(ds.size()-1);
    backtrack(nums,map,idx+1,ds);
}

    public int countMaxOrSubsets(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
    backtrack(nums,map,0,new ArrayList<>());
for(Map.Entry<Integer,Integer> entry:map.entrySet())
return entry.getValue();
    return -1;
    
    
    
    }
}