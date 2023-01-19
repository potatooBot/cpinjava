package Matrix_prac;
import java.util.*;
public class no_of_island_but_modified {
    public static void checkforIsland(int mat[][],int vis[][],int row,int col) {

        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length||mat[row][col]!=1||vis[row][col]==1) {
            return;
        } else {
            vis[row][col] = 1;


            checkforIsland(mat, vis, row + 1, col);
            checkforIsland(mat, vis, row - 1, col);
            checkforIsland(mat, vis, row, col + 1);
            checkforIsland(mat, vis, row, col - 1);



        }
    }
    public static List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        int mat[][]=new int[rows][cols];
        List <Integer> ans=new ArrayList<>();
        for (int i = 0; i <operators.length ; i++) {

                mat[operators[i][0]][operators[i][1]]=1;
                int vis[][]=new int[rows][cols];
                int count=0;
            for (int j = 0; j <rows ; j++) {
                for (int k = 0; k <cols ; k++) {

                    if (mat[j][k] == 1 && vis[j][k] == 0) {
                        count++;
                        checkforIsland(mat, vis,j,k);
                    }
                }
            }
            System.out.println(count);
            ans.add(count);

        }

        return ans;
    }
    public static void main(String[] args) {
       int n = 4,m = 5,k = 4;
        int [][]arr = {{1,1},{0,1},{3,3},{3,4}};
       List<Integer> ans=numOfIslands(n,m,arr);
        System.out.println(ans);
    }
}
