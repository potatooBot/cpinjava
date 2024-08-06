class Solution {
      public static int bfs(ArrayList<ArrayList<Integer>> adj,int n){
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Queue <Integer> q=new LinkedList<>();
        q.add(0);
        dist[0]=0;
        while (!q.isEmpty()){
            int node=q.peek();
            q.remove();
            for (int adjNode:adj.get(node)){
                if(dist[node]+1<dist[adjNode]){
                    dist[adjNode]=1+dist[node];
                    q.add(adjNode);
                }
            }
        }
        return dist[n-1];
    }
    public static int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <n+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <n ; i++) {
            adj.get(i).add(i+1);
           // adj.get(i+1).add(i);
        }
        int ans[] = new int[queries.length];
        for (int i = 0; i <queries.length ; i++) {
            adj.get(queries[i][0]).add(queries[i][1]);
          //  adj.get(queries[i][1]).add(queries[i][0]);
            ans[i]=bfs(adj,n);

        }
        return ans;
    }
}