package Graph.Word_Boggle;

import java.util.ArrayList;
import java.util.Arrays;

public class Word_boggle {
    public static boolean getWordsDfs(char [][]board,int row,int col,boolean vis[][],int idx,String str){

if(idx==str.length()) return true;
if(row<0||col<0||row== board.length||col==board[0].length||vis[row][col]==true||board[row][col]!=str.charAt(idx)){
    return false;
}
vis[row][col]=true;
        int dr[]={-1,-1,0,1,1,1,0,-1};
        int dc[]={0,1,1,1,0,-1,-1,-1};
        for (int i = 0; i <8 ; i++) {
            int neiRow=row+dr[i];
            int neiCol=col+dc[i];
if(getWordsDfs(board,neiRow,neiCol,vis,idx+1,str)){
    return true;
}
        }
        vis[row][col]=false;
        return false;
    }
    static    public String[] wordBoggle(char board[][], String[] dictionary)
    {

        ArrayList<String> list=new ArrayList<>();

int n= board.length;
int m=board[0].length;
        for (String str :
             dictionary) {
            int flag=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    boolean vis[][] = new boolean[n][m];
                    if (board[i][j] == str.charAt(0) && vis[i][j]==false) {
                        if (getWordsDfs(board, i, j, vis, 0, str)) {
                            list.add(str);
                            flag = 1;
                            break;
                        }
                    }
                }
            }
        }
        String ans[]=new String[list.size()];
        int idx=0;
        for (String str:
             list) {
            ans[idx++]=str;
        }
        System.out.println(list);
    return ans;
    }


    public static void main(String[] args) {
        String []dictionary = {"GEEKS","FOR","QUIZ","GO"};
        int R = 3, C = 3;
       char[][] board = {{'G','I','Z'},
                        {'U','E','K'},
                        {'Q','S','E'}};
       String ans[]=wordBoggle(board,dictionary);
        for (String str:
             ans) {
            System.out.println(str);
        }

    }
}
