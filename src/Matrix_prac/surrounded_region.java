package Matrix_prac;

public class surrounded_region {
    public static void checkForit(char board[][],int row,int col,int vis[][]){
        if(row<0||col<0||row>= board.length||col>=board[0].length||board[row][col]!='O'||vis[row][col]==1||vis[row-1][col+1]==1){
            return;
        }
        else {
            vis[row][col]=1;

            checkForit(board,row+1,col,vis);
            checkForit(board,row-1,col,vis);
            checkForit(board,row,col+1,vis);
            checkForit(board,row,col-1,vis);
            board[row][col]='X';
        }
    }
    public static void solve(char[][] board) {
        int n= board.length;
        int m= board[0].length;
        int vis[][]=new int[n][m];
        if(board.length<=2) return;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (board[i][j]=='O'){

                    checkForit(board,i,j,vis);
                }
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
           System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//       char [][] board = {{'X','X','X','X'},
//                {'X','O','O','X'},
//                {'X','X','O','X'},
//                {'X','O','X','X'}};

       char [][] board = {{'O'}};
       solve(board);
    }
}
