class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int ele: nums1)
        map1.put(ele,map1.getOrDefault(ele,0)+1);

        for(int ele: nums2)
        map2.put(ele,map2.getOrDefault(ele,0)+1);
    
    
    ArrayList<Integer> ds=new ArrayList<>();
    for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
if(map2.containsKey(entry.getKey())){
    int val=Math.min(map2.get(entry.getKey()),entry.getValue());
    int ele=entry.getKey();

    for(int i=1;i<=val;i++){
ds.add(ele);
    }

    
}
    }
    int ans[]=new int[ds.size()];

    for(int i=0;i<ds.size();i++){
ans[i]=ds.get(i);
    }
    return ans;
    }
}