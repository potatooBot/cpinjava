package Graph.rotten_oranges_ques;
import java.util.LinkedList;
import java.util.Queue;

class pair{
    int row,col,time;
    public pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}

public class rottenOranges {






        public static int orangesRotting(int[][] grid)
        {
            // Code here
            int n= grid.length;
            int m=grid[0].length;
            int vis[][]=new int[n][m];
            Queue<pair> q=new LinkedList<>();
            int cntFresh=0;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    if(grid[i][j]==2) {
                        vis[i][j]=2;
                        q.add(new pair(i,j,0));
                    }
                    else {
                        vis[i][j]=0;
                    }
                    if(grid[i][j]==1)
                        cntFresh++;
                }

            }

            int tm=0;
            int delrow[]={-1,0,1,0};
            int delcol[]={0,1,0,-1};
            int cnt=0;
            while (!q.isEmpty()){
                int r=q.peek().row;
                int c=q.peek().col;
                int t=q.peek().time;
                q.remove();
                tm=Math.max(tm,t);
                for (int i = 0; i <4 ; i++) {
                    int neirow=r+delrow[i];
                    int neicol=c+delcol[i];
                    if(neirow>=0&&neirow<n&&neicol>=0&&neicol<m&&grid[neirow][neicol]==1&&vis[neirow][neicol]==0){
                        q.add(new pair(neirow,neicol,t+1));
                        vis[neirow][neicol]=2;
                        cnt++;
                    }
                }

            }


            if(cnt!=cntFresh) return -1;


            return tm;
        }
        public static void main(String[] args) {
            int grid [][]= {{0,1,2},
                    {0,1,2},
                    {2,1,1}};
            int ans=orangesRotting(grid);
            System.out.println(ans);

        }
    }


