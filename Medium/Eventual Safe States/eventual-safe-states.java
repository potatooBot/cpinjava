//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int v, List<List<Integer>> a) {
  
           
        List<Integer> ans = new LinkedList<>();
        List<List<Integer>> adj=new ArrayList<>();
        int[] indeg = new int[v];
          for(int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < v; i++) {
            for(int it : a.get(i)) {
                adj.get(it).add(i);
                indeg[i]++;
            }
        }
       
        // for(int it:indeg){
        //     System.out.print(it+" ");
        // }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < v; i++) {
            if(indeg[i] == 0) q.add(i);
        }
//   System.out.println(q);
       while(!q.isEmpty()) {
            int temp = q.poll();
            ans.add(temp);
            for(int j : adj.get(temp)) {
                indeg[j]--;
                if(indeg[j] == 0) q.add(j);
            }
        }
        Collections.sort(ans);
        return ans;
      
    }
}
