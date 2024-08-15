package Algorithm.Design.SnapShot_Array.ValidTicTacToe;

public class valid_tic_tac_toe {
    public static boolean checkWin(char board[],char pc){

        for (int i = 0; i <9 ; i=i+3) {
            if(board[i]==pc&&board[i+1]==pc&&board[i+2]==pc) return true;
        }
        for (int i = 0; i <3 ; i++) {
            if(board[i]==pc&&board[i+3]==pc&&board[i+6]==pc) return true;
        }

        if(board[0]==pc&&board[4]==pc&&board[8]==pc) return true;
        if(board[2]==pc&&board[4]==pc&&board[6]==pc) return true;

        return false;
    }
    static boolean isValid(char[] board) {
        int countX=0;
        int countO=0;
        for(int i=0;i<board.length;i++){

                if(board[i]=='X') countX++;
                else countO++;
            }

 if(countX-countO!=1) return false;
        boolean flagX=checkWin(board,'X');
        boolean flagO=checkWin(board,'O');
        if(flagX&&flagO) return false;

        return true;
    }

    public static void main(String[] args) {
char board[]= {'O', 'X', 'X',
        'O', 'X', 'X',
        'O', 'O', 'X'};
        System.out.println(isValid(board));
    }
}
