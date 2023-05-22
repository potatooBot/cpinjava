//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends

class pair{
    int row;int col;
int steps;
    public pair(int row,int col,int steps){
    this.row=row;
    this.col=col;
this.steps=steps;
}
}
class Solution
{
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n)
    {
       int vis[][]=new int[n+1][n+1];
int row=knightPos[0];
int col=knightPos[1];
        int [] delrow = {-2,-1,1,2,2,1,-1,-2};
        int [] delcol ={1,2,2,1,-1,-2,-2,-1};
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(row,col,0));
    if(row>=0&&col>=0&&row<n+1&&col<n+1){
        vis[row][col]=1;
    }
int findrow=targetPos[0];
int findcol=targetPos[1];
int minmove=Integer.MAX_VALUE;
        while (q.size()>0){
         int r=q.peek().row;
int c=q.peek().col;
int steps=q.peek().steps;
q.remove();
            if(r==findrow&&c==findcol){
            return Math.min(minmove,steps);
            }
            for (int i = 0; i <8 ; i++) {
                int neiRow=r+delrow[i];
                int neiCol=c+delcol[i];
            if (neiRow>=0&&neiRow<n+1&&neiCol>=0&&neiCol<n+1&&vis[neiRow][neiCol]==0){
vis[neiRow][neiCol]=1;
                q.add(new pair(neiRow,neiCol,steps+1));
            }
            }

        }
        return -1;

    }
}