package Graph.Dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class pair_double{
    int node;
    double prob;
    public pair_double(int node,double prob){
        this.node=node;
        this.prob=prob;
    }

}
public class path_with_maximum_probability {
    static   public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
double ans=0;
        ArrayList <ArrayList<pair_double>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<pair_double>());
        }
        for (int i = 0; i < edges.length ; i++) {
            adj.get(edges[i][0]).add(new pair_double(edges[i][1],succProb[i]));
            adj.get(edges[i][1]).add(new pair_double(edges[i][0],succProb[i]));
        }
        PriorityQueue <pair_double> pq=new PriorityQueue<>((x,y)-> (int) (y.prob-x.prob));
        double probArr[]=new double[n];
        Arrays.fill(probArr,(int)-1);
        probArr[start]=0;
        double mul=1;
        pq.add(new pair_double(0,1));
        while (!pq.isEmpty())
        {
            int node=pq.peek().node;
            double prob=pq.peek().prob;
            if(node==end) break;
            pq.remove();
            for (pair_double iter:adj.get(node)
                 ) {
                int adjNode=iter.node;
                double edProb=iter.prob;
                if(prob*edProb>probArr[adjNode]){
                   mul=Math.max(mul,edProb*prob);
                probArr[adjNode]=edProb*prob;
                pq.add(new pair_double(adjNode,edProb*prob));
                }
            }
        }
        System.out.println(mul);
        for (int i = 0; i <probArr.length ; i++) {
            System.out.println(probArr[i]);
        }
if(probArr[end]==(int)-1) return 0;
return (double) probArr[end];
    }
    public static void main(String[] args) {
       int n = 3;
//       int [][]edges = {{0,1},{1,2},{0,2}};
       int [][]edges = {{0,1}};
//       double succProb []= {0.5,0.5,0.3};
       double succProb []= {0.5};
       int  start = 0, end = 2;
       double ans=maxProbability(n,edges,succProb,start,end);
        System.out.println(ans);
    }
}
