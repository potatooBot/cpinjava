package Graph.BFS.Steps_By_Knight;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class pair{

    int row,col,steps;
    pair(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;

    }
}
public class steps_by_knight {

    static public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {


        int board[][]=new int[N][N];



        Queue<pair> q=new LinkedList<>();
        boolean vis[][]=new boolean[N][N];
        q.add(new pair(KnightPos[0]-1,KnightPos[1]-1,0 ));
        int dr[]={-2,-2,-1,1,2,2,-1,1};
        int dc[]={-1,1,2,2,1,-1,-2,-2};
        vis[KnightPos[0]-1][KnightPos[1]-1]=true;
        int mini=Integer.MAX_VALUE;
        while (q.isEmpty()==false){

            pair it=q.peek();
            q.remove();

            int row=it.row;
            int col=it.col;
int steps=it.steps;

if(row==TargetPos[0]-1&&col==TargetPos[1]-1){
mini=Math.min(mini,steps);

}
            for (int i = 0; i <8 ; i++) {
                int neiRow= row +dr[i];
                int neiCol= col +dc[i];
                if (neiCol>=0&&neiCol<N&&neiRow>=0&&neiRow<N&&vis[neiRow][neiCol]==false) {
                    q.add(new pair(neiRow,neiCol,steps+1));
                    vis[neiRow][neiCol]=true;
                }
            }
        }


     return mini;
        // Code here
    }
    public static void main(String[] args) {
        int N=6;
        int knightPos[ ] = {4, 5};
        int targetPos[ ] = {1, 1};
        int ans=minStepToReachTarget(knightPos,targetPos,N);
        System.out.println(ans);
    }
}
