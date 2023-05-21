class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List <Integer> ans=new ArrayList<>();
ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <edges.size() ; i++) {
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        int indegree[]=new int[n];
        for (int i = 0; i <n ; i++) {
            for (int it:
                 adj.get(i)) {
                indegree[it]++;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (indegree[i]==0) {
                ans.add(i);
            }
        }


return ans;
    }
}