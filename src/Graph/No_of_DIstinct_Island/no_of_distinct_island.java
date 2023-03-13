package Graph.No_of_DIstinct_Island;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;
public class no_of_distinct_island {
    private static void dfs(int row, int col, int grid[][], boolean vis[][], int row0, int col0, ArrayList<String> vec,int delrow[],int delcol[]){


        vis[row][col]=true;
int r=row-row0;
int c=col-col0;
String r1=String.valueOf(r);
String c1=String.valueOf(c);
String temp=r1+","+c1;
        vec.add(temp);
int n= grid.length;
int m=grid[0].length;
        for (int i = 0; i <4 ; i++) {
            int neirow=row+delrow[i];
            int neicol=col+delcol[i];

        if (neirow>=0&&neirow<n&&neicol>=0&&neicol<m&&vis[neirow][neicol]==false&&grid[neirow][neicol]==1){

            dfs(neirow,neicol,grid,vis,row0,col0,vec,delrow,delcol);
        }
        }

    }


    static  int countDistinctIslands(int[][] grid) {
        HashSet<ArrayList<String>> set=new HashSet<>();

        int n= grid.length;
        int m= grid[0].length;
        boolean vis[][]=new boolean[n][m];
        int delrow[]={-1,0,1,0};
        int delcol[]={0,-1,0,1};


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (vis[i][j]==false && grid[i][j]==1){
                    ArrayList<String> vec=new ArrayList<>();
                    dfs(i,j,grid,vis,i,j,vec,delrow,delcol);
                set.add(vec);
                }
            }
        }


        return set.size();
    }
    public static void main(String[] args) {
int grid[][] = {{1, 1, 0, 1, 1},
        {1, 0, 0, 0, 0},
        {0, 0, 0, 0, 1},
        {1, 1, 0, 1, 1}};
int ans=countDistinctIslands(grid);
        System.out.println(ans);
    }
}
