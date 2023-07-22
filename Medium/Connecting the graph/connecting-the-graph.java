//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] edge = new int[m][2];
            for (int i = 0; i < m; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            int ans = obj.Solve(n, edge);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class DisjointSet{


        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        public DisjointSet(int n) {
            for (int i = 0; i <= n; i++) {
                rank.add(0);
                parent.add(i);
                size.add(1);
            }
        }

        public int findUlp(int node) {
            if (node == parent.get(node)) {
                return node;
            }
            int ulp = findUlp(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }

        public void unionByRank(int u, int v) {
            int ulp_u = findUlp(u);
            int ulp_v = findUlp(v);
            if (ulp_u == ulp_v) return;
            if (rank.get(ulp_u) < rank.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
            } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
                parent.set(ulp_v, ulp_u);
            } else {
                parent.set(ulp_v, ulp_u);
                int rankU = rank.get(ulp_u);
                rank.set(ulp_u, rankU + 1);
            }
        }

        public void unionBysize(int u, int v) {
            int ulp_u = findUlp(u);
            int ulp_v = findUlp(v);
            if (ulp_u == ulp_v) return;
            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
            }
        }
    }
class Solution {

    public int Solve(int n, int[][] edges) {
        // Code here


int count=0;
DisjointSet ds=new DisjointSet(n);
      for (int i = 0; i <edges.length ; i++) {
          if(ds.findUlp(edges[i][0])==ds.findUlp(edges[i][1])){
            count++;
          }
          else {
              ds.unionBysize(edges[i][0],edges[i][1]);
          }
      }
      int comp=0;
      for(int i=0;i<n;i++){
          if(i==ds.parent.get(i)){
              comp++;
          }
      }
      
    //   System.out.println(comp);
      int m=edges.length;
      int ans=comp-1;
      
      if(count>=ans) return ans;
      return -1;
    }
}