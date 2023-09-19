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
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.isBridge(V,list,c,d));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            size.add(1);
            parent.add(i);
        }
    }
    
    
    public int findUpar(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ulp=findUpar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    } 
    
    public void unionBySize(int u,int v){
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        if (ulp_u == ulp_v) return;
        if(size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }
        else{
                  parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
        
    }
    
}
class Solution
{
    //Function to find if the given edge is a bridge in graph.
  int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
     DisjointSet db=new DisjointSet(V);
         DisjointSet da=new DisjointSet(V);
        for(int i=0;i<V;i++){
        for(int adjNode:adj.get(i)){
            int u=i;
            int v=adjNode;
            da.unionBySize(u,v);
            if((u==c&&v==d)||(u==d&&v==c)){
                continue;
            }
            db.unionBySize(u,v);
            
        }
        }
        int before=0;
        int after=0;
        for(int i=0;i<V;i++){
            if(db.parent.get(i)==i){
                before++;
            }
               if(da.parent.get(i)==i){
                after++;
            }
            
        }
          // System.out.println(before);
           //System.out.println(after);
        if(before==after){
            return 0;
        }
   
       // System.out.println(V);
        return 1;
    }
}