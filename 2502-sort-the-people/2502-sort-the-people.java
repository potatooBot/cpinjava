class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        String ans[]=new String[names.length];
        int idx=0;
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            ans[idx]=entry.getValue();
            idx++;
        }
        return ans;
    }
}