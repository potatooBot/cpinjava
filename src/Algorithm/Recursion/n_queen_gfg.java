package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class n_queen_gfg {
    public static void solve(int col, char[][] board, List<List<String>> ans, int leftRow[], int lowerDiag[], int upperDiag[]){
        if(col==board.length){
            ans.add(construct(board));

            return;
        }
        for (int row = 0; row <board.length ; row++) {
            if(leftRow[row]==0&&lowerDiag[row+col]==0&&upperDiag[board.length-1+col-row]==0)
            {
                board[row][col]='Q';
                leftRow[row]=1;
                lowerDiag[row+col]=1;
                upperDiag[board.length-1+col-row]=1;
                solve(col+1,board,ans,leftRow,lowerDiag,upperDiag);
                board[row][col]='.';
                leftRow[row]=0;
                lowerDiag[row+col]=0;
                upperDiag[board.length-1+col-row]=0;
            }
        }

    }
    public static List<String> construct(char board[][]){
        List<String> res=new ArrayList<>();
        for (int i = 0; i <board.length ; i++) {
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static List<List<String>> solveNQueens(int n) {
        char [][] board=new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j]='.';
            }
        }
        List<List<String>> ans= new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
ArrayList <ArrayList<Integer>> result=new ArrayList<>();
ArrayList <ArrayList<Integer>> result2=new ArrayList<>();
        int leftRow[]=new int[n];
        int lowerDiag[]=new int[2*n-1];
        int upperDiag[]=new int[2*n-1];
        solve(0,board,ans,leftRow,lowerDiag,upperDiag);
        for (List ele:
             ans) {
            for (int i = 0; i < ele.size() ; i++) {
                String str=new String((String) ele.get(i));

                for (int j = 0; j <str.length() ; j++) {
                    if(str.charAt(j)=='Q'){
                       list.add(j+1);
                    }
                }
            }
            result.add(new ArrayList<>(list));
            list.clear();
        }
        for (int i=result.size()-1;i>=0 ;--i) {
            result2.add(new ArrayList<>(result.get(i)));
        }
        System.out.println(result2);
        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> ans= new ArrayList<>();
        ans=solveNQueens(4);
//        System.out.println(ans);
    }
}
