//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class pair{
    int node;
    int level;
    pair(int node ,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        Queue <pair> q=new LinkedList<>();
        boolean vis[]=new boolean [V];
        q.add(new pair(0,0));
        vis[0]=true;
        while(!q.isEmpty())
        {
            pair it=q.peek();
            q.remove();
            if(it.node==X){
                    return it.level;
                }
            
            for(int adjNode: adj.get(it.node)){
                if(vis[adjNode]==false){
                q.add(new pair(adjNode,it.level+1));
                vis[adjNode]=true;
                }
            }
        }
        return -1;
    }
}