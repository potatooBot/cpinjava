package Graph.Dijkstra_Algorithm.Minimum_cost_path_gfg_hard;

import java.util.PriorityQueue;

class tuple{
    int dist;int row;int col;
    public tuple(int row,int col,int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}

public class minimum_cost_path {
    static   public int minimumCostPath(int[][] grid)
    {
        PriorityQueue<tuple> pq=new PriorityQueue<tuple>((x,y)->x.dist-y.dist);

        int dist[][]=new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                dist[i][j]=(int)1e9;
            }
        }
int delrow[]={-1,0,1,0};
int delcol[]={0,1,0,-1};
        pq.add(new tuple(0,0,grid[0][0]));
      while (pq.isEmpty()==false) {
          tuple it = pq.peek();
          pq.remove();
          for (int k = 0; k < 4; k++) {


              int neiRow = it.row + delrow[k];
              int neiCol = it.col + delcol[k];

              int adjDist = it.dist;
              if (neiRow >= 0 && neiCol >= 0 && neiRow < grid.length && neiCol < grid[0].length && grid[neiRow][neiCol] + adjDist<dist[neiRow][neiCol]) {

                  dist[neiRow][neiCol]=grid[neiRow][neiCol] +adjDist;
                  pq.add(new tuple(neiRow,neiCol,dist[neiRow][neiCol]));
              if(neiRow== grid.length-1&&neiCol==grid[0].length-1){
                  return adjDist+grid[neiRow][neiCol];
              }
              }
          }

      }
       return 0;
    }
    public static void main(String[] args) {
        int grid [][]= {{4,4},{3,7}};
int ans=minimumCostPath(grid);
        System.out.println(ans);
    }
}
