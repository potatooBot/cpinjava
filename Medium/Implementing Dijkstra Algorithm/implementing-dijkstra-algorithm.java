//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class pair{
    int distance;
    int node;
    public pair(int node,int distance){
        this.distance=distance;
        this.node=node;

    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src)
    {
        // Write your code here
               // Write your code here
        int dist[]=new int[V];
        PriorityQueue <pair> q=new PriorityQueue<>((a,b)->a.distance-b.distance);
    Arrays.fill(dist,(int)1e9);
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
}

