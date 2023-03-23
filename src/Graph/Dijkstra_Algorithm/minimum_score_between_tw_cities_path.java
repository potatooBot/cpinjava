package Graph.Dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

class pair_score_between_cities{
    int node,distance;
    public pair_score_between_cities(int node,int distance){
        this.node=node;
        this.distance=distance;
    }
}

public class minimum_score_between_tw_cities_path {

    static    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<pair_score_between_cities>> adj=new ArrayList<>();
        for (int i = 0; i <n+1 ; i++) {
            adj.add(new ArrayList<pair_score_between_cities>());
        }
        for (int i = 0; i <roads.length ; i++) {
            adj.get(roads[i][0]).add(new pair_score_between_cities(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new pair_score_between_cities(roads[i][0],roads[i][2]));
        }
        int distArr[]=new int[n+1];
        for (int i = 0; i <n+1 ; i++) {
            distArr[i]=(int)1e9;
        }
        PriorityQueue <pair_score_between_cities> pq=new PriorityQueue<>((x,y)-> x.distance-y.distance);
        int src=1;
        int dest=n;
        pq.add(new pair_score_between_cities(src,0));
distArr[src]=0;
int mini=Integer.MAX_VALUE;

while (!pq.isEmpty()){
    int node=pq.peek().node;
    int dist=pq.peek().distance;
    pq.remove();
    for (pair_score_between_cities it:
         adj.get(node)) {

        int adjNode=it.node;
        int edWt=it.distance;
        mini=Math.min(mini,edWt);
        if(edWt+dist<distArr[adjNode]){
            distArr[adjNode]=edWt+dist;
            pq.add(new pair_score_between_cities(adjNode,edWt+dist));
        }
    }

}
//        System.out.println(mini);
        return mini;
    }
    public static void main(String[] args) {
        int    n = 4;int [][] roads = {{1,2,9},{2,3,6},{2,4,5},{1,4,7}};
int ans=minScore(n,roads);
        System.out.println(ans);
    }
}
