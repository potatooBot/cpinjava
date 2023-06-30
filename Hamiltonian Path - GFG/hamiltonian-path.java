//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>(); 
            for(int i = 0; i < M; i++){
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[2*i]));
                e.add(Integer.parseInt(input_line[2*i+1]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            if(ob.check(N, M, Edges)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
      public static boolean dfs(int node,int V,ArrayList<ArrayList<Integer>> adj,boolean vis[],int count){
        if (count==V) {
            return true;
        }
        vis[node]=true;


        for (int it:
             adj.get(node)) {
            if(vis[it]==false){
                if(dfs(it,V,adj,vis,count+1)==true){
                    return true;
                }
            }

        }
        vis[node]=false;
        return false;
    }
    static   boolean check(int N, int M, ArrayList<ArrayList<Integer>> edges)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <=N ; i++) {
            adj.add(new ArrayList<>());
        }
        for (ArrayList<Integer> list :edges) {
         adj.get(list.get(0)).add(list.get(1));
         adj.get(list.get(1)).add(list.get(0));
        }
boolean vis[]=new boolean[N+1];

        for (int i = 1; i <=N ; i++) {
            if(vis[i]==false){
                if(dfs(i,N,adj,vis,1)==true){
                    return true;
                }
            }
        }


     return false;   // code here
    }
} 