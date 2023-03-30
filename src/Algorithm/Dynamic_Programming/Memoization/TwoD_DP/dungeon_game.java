package Algorithm.Dynamic_Programming.Memoization.TwoD_DP;

import java.util.Arrays;

public class dungeon_game {
    static   public int calculateMinimumHP(int[][] dungeon) {
int n=dungeon.length;
int m=dungeon[0].length;
        int dp[][]=new int[n+1][m+1];

        for (int rows[]:dungeon
             ) {
            Arrays.fill(rows,-1);
        }
        for (int i = 0; i <dp.length ; i++) {

        }

        return 0;
    }
    public static void main(String[] args) {
        int [][]    dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};

    }

}
