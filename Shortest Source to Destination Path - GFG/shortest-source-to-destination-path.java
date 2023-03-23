//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class pair_with_steps{
    int row,col,steps;
    public pair_with_steps(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}
class Solution {
    int shortestDistance(int N, int M, int mat[][], int destRow, int destCol) {
        // code here
                // code here
               
        Queue<pair_with_steps> q=new LinkedList<>();
        boolean vis[][]=new boolean[N][M];
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        int srcRow=0;
        int srcCol=0;
         if(mat[srcRow][srcCol]==0) return -1;
        q.add(new pair_with_steps(srcRow,srcCol,0));
        vis[srcRow][srcCol]=true;

        while (!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int steps=q.peek().steps;
            q.remove();
            for (int i = 0; i <4 ; i++) {
                int neirow=r+delrow[i];
                int neicol=c+delcol[i];

                if(neirow>=0&&neirow<N&&neicol>=0&&neicol<M&&mat[neirow][neicol]==1&&vis[neirow][neicol]==false){
                    if(neirow==destRow&&neicol==destCol)
                    {
                        return steps+1;
                    }
                    q.add(new pair_with_steps(neirow,neicol,steps+1));
                    vis[neirow][neicol]=true;
                }
            }

        }

    return -1;
    }
};