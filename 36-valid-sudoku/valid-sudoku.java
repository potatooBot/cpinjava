class Solution {
    boolean isValid(char board[][],int row,int col,char c){

    for(int i=0;i<9;i++){
if(board[row][i]==c)
return false;

if(board[i][col]==c)
return false;
if(board[3*(row/3)+i/3][3*(col/3) +i%3]==c) return false;

    }
    return true;
}
   public boolean solve(char[][]board){
        for(int i=0;i<board.length;i++){
             for(int j=0;j<board[0].length;j++){
                
            if(board[i][j]!='.'){
            char ch=board[i][j];
                board[i][j]='.';
              //  System.out.println(board[i][j]);
if(isValid(board,i,j,ch)==false){
return false;
}
board[i][j]=ch;
            }
        }
        }
        return true;
    }


    public boolean isValidSudoku(char[][] board) {
        boolean ans=solve(board);
return ans;
    }
}