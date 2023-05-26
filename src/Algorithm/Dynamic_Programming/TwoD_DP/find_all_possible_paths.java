package Algorithm.Dynamic_Programming.TwoD_DP;
import java.util.*;
public class find_all_possible_paths {
    public static void getWays(int row,int col,int dp[][],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds,int grid[][]){
        if(row>=grid.length||col>=grid[0].length) return;
        ds.add(grid[row][col]);
        if(row== grid.length-1&&col==grid[0].length-1) {
            ans.add(new ArrayList<>(ds));
            ds.remove(ds.size()-1);
            return;
        }

        getWays(row,col+1,dp,ans,ds,grid);
        getWays(row+1,col,dp,ans,ds,grid);
    ds.remove(ds.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        int dp[][]=new int[n][m];
        getWays(0,0,dp,ans,ds,grid);
        return ans;
    }
    public static void main(String[] args) {
        int grid[][]={{1, 2},
                      {3 ,4}};


ArrayList<ArrayList<Integer>> list=findAllPossiblePaths(grid.length,grid[0].length,grid);
Collections.reverse(list);
        System.out.println(list);

    }
}
