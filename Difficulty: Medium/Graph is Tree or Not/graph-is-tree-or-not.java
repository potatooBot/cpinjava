// User function Template for Java
class Solution {
    public static boolean dfs(int node,int vis[],ArrayList<ArrayList<Integer>> adj,int par)

{
    vis[node]=1;
    for(int it:adj.get(node)){
        if(vis[it]==0){
            if(dfs(it,vis,adj,node)) 
            return true;
        }
        else if(it!=par&&par!=-1) return true;
    }
 
return false;
}

    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edge) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int vis[]=new int[n];
        int path[]=new int[n];
        if(n==1&&m>0) return false;
        
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(ArrayList<Integer> arr:edge){
            adj.get(arr.get(0)).add(arr.get(1));
            adj.get(arr.get(1)).add(arr.get(0));
        }
        //System.out.println(adj);
        
        
    
if(dfs(0,vis,adj,-1)) return false;                
            
        
        
        
        for(int ele:vis) {
            if(ele==0) return false;
        }
        
        return true;
    }
}
