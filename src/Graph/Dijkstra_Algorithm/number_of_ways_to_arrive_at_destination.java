package Graph.Dijkstra_Algorithm;
import java.util.*;
class pair_no_of_ways{
     int node,distance;
     public pair_no_of_ways(int node,int distance)
     {
         this.node=node;
         this.distance=distance;
     }
}
public class number_of_ways_to_arrive_at_destination {
      static int countPaths(int n, List<List<Integer>> roads) {
          ArrayList<ArrayList<pair_flights>> adj=new ArrayList<>();
          for (int i = 0; i <n ; i++) {
              ArrayList <pair_flights> temp=new ArrayList<>();
              adj.add(temp);
          } 
          for (int i = 0; i < roads.size() ; i++) {
             adj.get(roads.get(i).get(0)).add(new pair_flights(roads.get(i).get(1),roads.get(i).get(2)));
             adj.get(roads.get(i).get(1)).add(new pair_flights(roads.get(i).get(0),roads.get(i).get(2)));
          }
          int mod=(int)(1e9 +7);
          int distArr[]=new int[n];
          int ways[]=new int[n];
          PriorityQueue <pair_flights> pq=new PriorityQueue<>((x,y)-> x.distance- y.distance);

          for (int i = 0; i <n ; i++) {
              distArr[i]=(int)1e9;
          ways[i]=0;
          }
          ways[0]=1;
          distArr[0]=0;
          pq.add(new pair_flights(0,0));

          while (!pq.isEmpty()){
              pair_flights it=pq.peek();

              int dist=it.distance;
              int node=it.node;
pq.remove();
              for (pair_flights iter:
                   adj.get(node)) {
                  int adjNode=iter.node;
                  int edjWt=iter.distance;


                  if(dist+edjWt<distArr[adjNode]){
                      pq.add(new pair_flights(adjNode,edjWt+dist));
                      distArr[adjNode]=edjWt+dist;
                      ways[adjNode]=ways[node];
                  }
                 else if(dist+edjWt==distArr[adjNode]){
                      ways[adjNode]=(ways[adjNode]+ways[node])%mod;
                  }
              }
          }


          return ways[n-1]%mod;
        // Your code here
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
