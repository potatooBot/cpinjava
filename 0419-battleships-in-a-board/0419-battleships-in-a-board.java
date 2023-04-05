class Solution {
        public static void dfs(int row,int col,boolean vis[][],char [][] boards){
        vis[row][col]=true;
int dr[]={-1,0,1,0};
int dc[]={0,1,0,-1};

        for (int i = 0; i <4 ; i++) {
            int neiRow=row+dr[i];
            int neiCol=col+dc[i];
        if(neiRow>=0&&neiRow<boards.length&&neiCol>=0&&neiCol<boards[0].length&&vis[neiRow][neiCol]==false&&boards[neiRow][neiCol]=='X'){
            dfs(neiRow,neiCol,vis,boards);
        }
        }
    }
public int countBattleships(char[][] board) {

        int n= board.length;;
        int m= board[0].length;
        boolean vis[][]=new boolean[n][m];


        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
            if(board[i][j]=='X'&&vis[i][j]==false){
                dfs(i,j,vis,board);
                count++;
            }
            }
        }
        return count;
    }
}