package Algorithm.Recursion;

public class word_search {
   static int dr[]={-1,0,1,0};
    static int dc[]={0,-1,0,1};
    public static boolean explore(char [][]board,String word,int row,int col,int stridx){
        //If word ran out of length
        if(stridx==word.length()) return true;
        if(row<0||col<0||row>= board.length||col>=board[0].length) return false;
        if(word.charAt(stridx)!=board[row][col]) return false;
char myChar=board[row][col];
board[row][col]='@';
        for(int d=0;d<4;d++){
            boolean res=explore(board,word,row+dr[d],col+ dc[d],stridx+1);
            if(res==true){
board[row][col]=myChar;
return true;

            }
        }
        board[row][col]=myChar;
        return false;

    }
    public static boolean exist(char[][] board, String word) {

        int n=board.length;
        int m= board[0].length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(word.charAt(0)!=board[i][j]) continue;

                boolean res=explore(board,word,i,j,0);
                if(res==true) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
boolean res=exist(board,"ABCB");
        System.out.println(res);
    }
}
