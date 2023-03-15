package Graph.Dijkstra_Algorithm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
class pair{
    int distance;
    int node;
    public pair(int node,int distance){
        this.distance=distance;
        this.node=node;

    }
}
public class implementing_dikstra_algo {
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src)
    {
        // Write your code here
        int dist[]=new int[V];
        PriorityQueue <pair> q=new PriorityQueue<>((a,b)->a.distance-b.distance);
        for (int i = 0; i < dist.length ; i++) {
            dist[i]=(int)1e9;
        }
        dist[src]=0;
        q.add(new pair(src,0));
        while (!q.isEmpty()){

            int node=q.peek().node;
            int distance=q.peek().distance;


            q.remove();
            for (int i = 0; i <adj.get(node).size() ; i++) {
                int adjNode=adj.get(node).get(i).get(0);
                int adjDist=adj.get(node).get(i).get(1);
            if(adjDist+distance<dist[adjNode]){
                dist[adjNode]=adjDist+distance;
            q.add(new pair(adjNode,adjDist+distance));
            }
            }


        }
        for (int i = 0; i < dist.length ; i++) {
            if(dist[i]==1e9)
                dist[i]=-1;
        }
        return dist;
    }
    public static void main(String[] args) throws IOException {
        int V = 3, E=3,S=2;
        ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(1);add(1);}};
        ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(2);add(6);}};
        ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(2);add(3);}};
        ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(0);add(1);}};
        ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(1);add(3);}};
        ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(0);add(6);}};

        ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node1);
                add(node2);
            }
        };
        ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node3);
                add(node4);
            }
        };
        ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node5);
                add(node6);
            }
        };
        ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
            {
                add(inter1); // for 1st node
                add(inter2); // for 2nd node
                add(inter3); // for 3rd node
            }
        };
        //add final values of adj here.
       implementing_dikstra_algo obj = new implementing_dikstra_algo();
        int[] res= obj.dijkstra(V,adj,S);

        for(int i=0;i<V;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
}

