package Graph.Dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class pair_flights{
    int node;
    int distance;
    public pair_flights(int node,int distance){
        this.distance=distance;
        this.node=node;
    }
}
class tuple_flights{
    int steps,node,distance;
    public tuple_flights(int steps,int node,int distance){
        this.steps=steps;
        this.node=node;
        this.distance=distance;
    }

}

public class cheapest_flight_with_k_stops {
    static public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<pair_flights>> adj=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            ArrayList<pair_flights> temp=new ArrayList<>();
adj.add(temp);
        }
        for (int i = 0; i <flights.length ; i++) {
            adj.get(flights[i][0]).add(new pair_flights(flights[i][1],flights[i][2]));
        }
        Queue <tuple_flights> q=new LinkedList<>();
        int distArr[]=new int[n];
        for (int i = 0; i <distArr.length ; i++) {
            distArr[i]=(int) 1e9;
        }
        q.add(new tuple_flights(0,src,0));
        distArr[src]=0;
        while (!q.isEmpty()){
            tuple_flights it=q.poll();
            int steps=it.steps;
            int cost=it.distance;
            int node=it.node;
if(steps>k)
    continue;
            for (pair_flights iter:adj.get(node)
                 ) {
                int edWt=iter.distance;
                int adjNode=iter.node;
                if(cost+edWt<distArr[adjNode]&&steps<=k){
                    distArr[adjNode]=cost+edWt;
                    q.add(new tuple_flights(steps+1,adjNode,cost+edWt));
                }
            }
        }
if(distArr[dst]==(int) 1e9) return -1;

        return distArr[dst];
    }
    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,10},{1,3,600},{2,3,200}};
        int src = 0, dst = 3, k = 1;
        int ans=findCheapestPrice(n,flights,src,dst,k);
        System.out.println(ans);
    }
}
