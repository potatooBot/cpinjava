class Solution {
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        for(char row[]:board) Arrays.fill(row,'.');
boolean left[]=new boolean[n];
boolean upper[]=new boolean[2*n-1];
boolean lower []=new boolean[2*n-1];
int ans[]=new int[1];
 getAllComb(0,board,left,upper,lower,ans);
return ans[0];


    }
public static void getAllComb(int col,char board[][],boolean left[],boolean upper[],boolean lower[],int ans[]){
    if(col==board.length){
        ans[0]=ans[0]+1;
        return;
    }

    for(int row=0;row<board.length;row++){

        if(left[row]==false&&lower[row+col]==false&&upper[board.length-1+col-row]==false){
        board[row][col]='Q';
     
        left[row]=true;
        lower[row+col]=true;
        upper[board.length-1+col-row]=true;
        getAllComb(col+1,board,left,upper,lower,ans);
              left[row]=false;
        lower[row+col]=false;
        upper[board.length-1+col-row]=false;
    }
    }
}

}