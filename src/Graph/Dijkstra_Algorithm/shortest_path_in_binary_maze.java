package Graph.Dijkstra_Algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class tuple{
    int steps,row,col;
    public tuple(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}

public class shortest_path_in_binary_maze {
    static  int shortestPath(int[][] grid, int[] source, int[] destination) {
        if (source[0]==destination[0]&&source[1]==destination[1]) return 0;

        Queue <Graph.Dijkstra_Algorithm.tuple> q=new LinkedList<>();
        int n= grid.length;;
        int m=grid[0].length;
int distace[][]=new int[n][m];
        for(int row[]:distace)
            Arrays.fill(row,(int)1e9);
distace[source[0]][source[1]]=0;
        q.add(new Graph.Dijkstra_Algorithm.tuple(source[0],source[1],0));
        int delrow[]={-1,0,1,0};
        int delcol[]={0,-1,0,1};
        while (!q.isEmpty()){

            int r=q.peek().row;
            int c=q.peek().col;
            int step=q.peek().steps;
q.remove();
            for (int i = 0; i <4 ; i++) {
                int nrow= r+delrow[i];
                int ncol= c+delcol[i];

                if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]==1&step+1<distace[nrow][ncol]){
                    distace[nrow][ncol]=step+1;

            if(nrow==destination[0]&&ncol==destination[1])
            {
                return step +1;
            }
                    q.add(new Graph.Dijkstra_Algorithm.tuple(nrow,ncol,step+1));
                }
            }
        }



    return -1;    // Your code here
    }
    public static void main(String[] args) {
        int grid[][] = {{1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {1, 0, 0, 1}};
        int source []= {0, 1};
        int []destination = {2, 2};
    int ans=shortestPath(grid,source,destination);
        System.out.println(ans);
    }
}
