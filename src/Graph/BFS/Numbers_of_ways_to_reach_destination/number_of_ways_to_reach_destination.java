package Graph.BFS.Numbers_of_ways_to_reach_destination;
import java.util.*;
import java.util.stream.Collectors;

class  pair {
    int node;
    long dist;

    pair(int node, long dist) {
        this.node = node;
        this.dist = dist;
    }
}

public class number_of_ways_to_reach_destination {
    static int countPaths(int n, List<List<Integer>> roads) {
ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < roads.size() ; i++) {
       adj.get(roads.get(i).get(0)).add(new pair(roads.get(i).get(1),roads.get(i).get(2)));
       adj.get(roads.get(i).get(1)).add(new pair(roads.get(i).get(0),roads.get(i).get(2)));
        }
PriorityQueue<long[]> pq=new PriorityQueue<>((x,y)-> {
    return  (int)(x[0]-y[0]);
});
        pq.add(new  long[]{0,0});
     long dist[]=new long[n];
        int ways[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        HashMap<Integer,Integer> map=new HashMap<>();
        int mod=(int)Math.pow(10,9)+7;
Arrays.fill(ways,0);
ways[0]=1;
dist[0]=0;
        while (!pq.isEmpty())
        {
            long val[]=pq.poll();
           long node=val[0];
       long distance=val[1];

            for (pair it: adj.get((int)node)
                 ) {
               long edgWt=it.dist;
                int adjNode=it.node;
            if (edgWt+distance<dist[adjNode]){
                pq.add(new long[]{adjNode,edgWt+distance});
                dist[adjNode]=edgWt+distance;
              ways[adjNode]=ways[(int) node];
            }
            else if(edgWt+distance==dist[adjNode]){
              ways[adjNode]=(ways[(int) node]+ways[adjNode])%mod;
            }
            }
        }
//System.out.println(Arrays.stream(ways).boxed().collect(Collectors.toList()));
//System.out.println(Arrays.stream(dist).boxed().collect(Collectors.toList()));

        return ways[n-1];        // Your code here
    }
    public static void main(String[] args) {



        int n = 7;
        List < List < Integer >> roads = new ArrayList < > () {
            {
                add(new ArrayList<Integer>(Arrays.asList(0, 6, 7)));
                add(new ArrayList<Integer>(Arrays.asList(0, 1, 2)));
                add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
                add(new ArrayList<Integer>(Arrays.asList(1, 3, 3)));
                add(new ArrayList<Integer>(Arrays.asList(6, 3, 3)));
                add(new ArrayList<Integer>(Arrays.asList(3, 5, 1)));
                add(new ArrayList<Integer>(Arrays.asList(6, 5, 1)));
                add(new ArrayList<Integer>(Arrays.asList(2, 5, 1)));
                add(new ArrayList<Integer>(Arrays.asList(0, 4, 5)));
                add(new ArrayList<Integer>(Arrays.asList(4, 6, 2)));

            }
        };
int ans=countPaths(n,roads);
        System.out.println(ans);
    }
}
