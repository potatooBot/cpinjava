class Solution {
   public void eraseMidNodes(TreeSet<Integer> s, int l, int r) {
        SortedSet<Integer> toRemove = s.subSet(l, true, r, true);
        List<Integer> tempList = new ArrayList<>(toRemove);
        s.removeAll(tempList);
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
       TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++) set.add(i);
int ans[]=new int[queries.length];
int i=0;
for(int q[]:queries){
    int x=q[0];
    int y=q[1];
    eraseMidNodes(set,x+1,y-1);
ans[i]=set.size()-1;
i++;

}

return ans;
    }
}