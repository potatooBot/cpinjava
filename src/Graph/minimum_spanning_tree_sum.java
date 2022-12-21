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
            for(int i=0;i<adj.get(node).size();i++){
                int edwt=adj.get(node).get(i).get(1);
                int adjnode=adj.get(node).get(i).get(0);
                if(vis[adjnode]==0){
                    pq.offer(new Pair(edwt,adjnode));
                }
            }
        }

        return sum;

    }
    public static void main(String[] args) {

    }
}
