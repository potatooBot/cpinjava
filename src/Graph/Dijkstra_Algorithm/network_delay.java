package Graph.Dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class network_delay {
    static   public int networkDelayTime(int[][] times, int n, int src) {
        PriorityQueue <pair> pq=new PriorityQueue<>((x,y)->x.distance-y.distance);
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <times.length ; i++) {
            adj.get(times[i][0]).add(new pair(times[i][1],times[i][2]));

        }
        int distance[]=new int[n+1];
        for (int i = 1; i <distance.length ; i++) {
            distance[i]=(int) 1e9;
        }
                distance[src]=0;
        pq.add(new pair(src,0));
while (!pq.isEmpty()){
    int node=pq.peek().node;
    int dist=pq.peek().distance;
pq.remove();
    for (pair iter:
            adj.get(node)) {
        int adjNode=iter.node;
        int edjWt=iter.distance;

        if(dist+edjWt<distance[adjNode]){
            distance[adjNode]=dist+edjWt;
            pq.add(new pair(adjNode,dist+edjWt));
        }
    }

}

int mini=Integer.MIN_VALUE;
        for (int i = 0; i <distance.length ; i++) {
            if(distance[i]==(int)1e9){
               return -1;
            }
        }
        for (int i = 1; i <distance.length ; i++) {
         //  System.out.println(distance[i]);
 mini=Math.max(mini,distance[i]);
        }

return mini;
    }
    public static void main(String[] args) {
        int times[][] = {{2,1,1},{2,3,1},{3,4,1}};int n = 4, k = 2;
//        int times[][] = {{1,2,1}};
//        int n = 2, k = 2;
     int ans=networkDelayTime(times,n, k);
        System.out.println(ans);
    }
}
