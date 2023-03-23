package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.WeakHashMap;

class pair_with_steps{
    int row,col,steps;
    public pair_with_steps(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}

public class shortest_source_to_destination_path {
    static   int shortestDistance(int N, int M, int mat[][], int destRow, int destCol) {
        // code here
        Queue<pair_with_steps> q=new LinkedList<>();
        boolean vis[][]=new boolean[N][M];
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        int srcRow=0;
        int srcCol=0;
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
    public static void main(String[] args) {
        int    N=3;
        int M=4;
        int [][]mat={{1,0,0,0},
                {1,1,0,1},{0,1,1,1}};
        int ans=shortestDistance(N,M,mat,2,3);
        System.out.println(ans);

    }

}
