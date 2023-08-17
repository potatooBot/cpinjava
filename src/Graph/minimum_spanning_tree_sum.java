package Graph;
import java.util.*;
public class minimum_spanning_tree_sum {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        PriorityQueue <Pair> pq=new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
        int vis[]=new int[V];
        pq.add(new Pair(0,0));
        int sum=0;
        while(!pq.isEmpty()){
            int wt=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();

            if(vis[node]==1) continue;
            vis[node]=1;
            sum +=wt;
            for (ArrayList<Integer> it:
                 adj.get(node)) {
                int edW=it.get(1);
                int adjNode=it.get(0);
                if(vis[adjNode]==0){
                    pq.add(new Pair(edW,adjNode));
                }

            }
        }

        return sum;

    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
        int[][] edges =  {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        for (int i = 0; i < 6; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> tmp2 = new ArrayList<Integer>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }
        int ans=spanningTree(V,adj);
        System.out.println(ans);

    }
}
