//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java
class DisjoinSet{
    List <Integer> rank=new ArrayList<>();
    List <Integer> parent=new ArrayList<>();
    List <Integer> size=new ArrayList<>();
    public DisjoinSet(int n){
        for (int i = 0; i <=n ; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findUlp(int node){
        if(parent.get(node)==node){
            return node;
        }
        int ulp=findUlp(parent.get(node));
        parent.set(node,ulp);
return parent.get(node);
        }
        public void unionByRank(int u,int v) {
int ulp_u=findUlp(u);
int ulp_v=findUlp(v);
if(ulp_u==ulp_v) return;
if(rank.get(ulp_u)<rank.get(ulp_v)){
    parent.set(ulp_u,ulp_v);
}
else if(rank.get(ulp_v)<rank.get(ulp_u)){
    parent.set(ulp_v,ulp_u);
}
else {
    parent.set(ulp_v,ulp_u);
    int rankU=rank.get(ulp_u);
    rank.set(ulp_u,rankU+1);
}
        }
         public void unionBysize(int u,int v){
        int ulp_u=findUlp(u);
        int ulp_v=findUlp(v);
        if(rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
size.add(ulp_v, size.get(ulp_u)+ size.get(ulp_v));
        }

        else {
            parent.set(ulp_v,ulp_u);
            size.add(ulp_u, size.get(ulp_u)+ size.get(ulp_v));
        }
    }

    }
class Solution {
    
  public List<Integer> numOfIslands(int n, int m,  int[][] operators) {
        //Your code here
DisjoinSet ds=new DisjoinSet(n*m);
List<Integer> ans=new ArrayList<>();
boolean vis[][]=new boolean[n][m];
int count=0;
for (int i = 0; i < operators.length ; i++) {

            int row=operators[i][0];
            int col=operators[i][1];

            if (vis[row][col]==true){
              ans.add(count);
                continue;
            }
            vis[row][col]=true;
            count++;
int delrow[]={-1,0,1,0};
int delcol[]={0,1,0,-1};

    for (int j = 0; j <4 ; j++) {
        int adjRow=row+delrow[j];
        int adjCol=col+delcol[j];
    if(adjRow>=0&&adjRow<n&&adjCol>=0&&adjCol<m){
        if(vis[adjRow][adjCol]==true){
            int nodeNo=row*m+ col;
            int adjNodeNo=adjRow*m+adjCol;

            if(ds.findUlp(nodeNo)!=ds.findUlp(adjNodeNo)){
                count--;
                ds.unionBysize(nodeNo,adjNodeNo);
            }
        }


    }


    }
ans.add(count);
        }

return ans;
    }
    
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends