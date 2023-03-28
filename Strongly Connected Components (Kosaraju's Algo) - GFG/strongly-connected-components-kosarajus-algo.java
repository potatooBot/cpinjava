//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
     public static void dfs(boolean vis[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> stk,int node){
        vis[node]=true;
        for (Integer it :
             adj.get(node)) {
            if(vis[it]==false)
        dfs(vis,adj,stk,it);
        }
        stk.push(node);
    }
    private static void dfsLast(boolean visLast[],ArrayList<ArrayList<Integer>> adjTranspose,int node){
        visLast[node]=true;

        for (Integer it:
             adjTranspose.get(node)) {
            if(visLast[it]==false){
                dfsLast(visLast,adjTranspose,it);
            }
        }

    }
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {



        //code here
// !Store vertices in Sorted manner according to finishing ime
        Stack<Integer> stk=new Stack<>();
        boolean vis[]=new boolean[V];
        for (int i = 0; i <V ; i++) {
            if(vis[i]==false){
                dfs(vis,adj,stk,i);
            }
        }

        //! Reverse the graph
        ArrayList<ArrayList<Integer>> adjTranpose=new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            adjTranpose.add(new ArrayList<>());
        }
        for (int i = 0; i <V ; i++) {
            for (Integer it:
                 adj.get(i)) {
                adjTranpose.get(it).add(i);
            }
        }
//! Find again Dfs
        int sccCount=0;
boolean visLast[]=new boolean[V];
while (stk.isEmpty()==false){
    int node=stk.peek();
    stk.pop();

    if(visLast[node]==false)
    {
        sccCount++;
        dfsLast(visLast,adjTranpose,node);
    }
}
        return sccCount;

    }
}
