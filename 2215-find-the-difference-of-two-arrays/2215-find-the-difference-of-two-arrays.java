class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }

HashSet<Integer> ds=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])){
ds.add(nums1[i]);
            }
        }

        ans.add(new ArrayList<>(ds));

        ds.clear();
        set.clear();


           for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
    for(int i=0;i<nums2.length;i++){
            if(!set.contains(nums2[i])){
ds.add(nums2[i]);
            }
        }

        ans.add(new ArrayList<>(ds));

        return ans;
    }
}