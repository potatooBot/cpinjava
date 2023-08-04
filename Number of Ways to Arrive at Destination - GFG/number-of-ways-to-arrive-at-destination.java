//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
// Position this line where user code will be pasted.

class GFG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    int x = sc.nextInt();
                    temp.add(x);
                }
                adj.add(temp);
            }

            Solution obj = new Solution();
            System.out.println(obj.countPaths(n, adj));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class  pair {
    int node;
    long dist;

    pair(int node, long dist) {
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
 static int countPaths(int n, List<List<Integer>> roads) {
ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < roads.size() ; i++) {
       adj.get(roads.get(i).get(0)).add(new pair(roads.get(i).get(1),roads.get(i).get(2)));
       adj.get(roads.get(i).get(1)).add(new pair(roads.get(i).get(0),roads.get(i).get(2)));
        }
PriorityQueue<long[]> pq=new PriorityQueue<long[]>((x,y)-> {
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

        return ways[n-1];  
}
}
