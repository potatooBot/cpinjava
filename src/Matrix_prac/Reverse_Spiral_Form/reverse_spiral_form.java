package Matrix_prac.Reverse_Spiral_Form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class reverse_spiral_form {
    static public int[] reverseSpiral(int R, int C, int[][] matrix)
    {

        int ans[]=new int[R*C];

        int dr[]={0,1,0,-1};
        int dc[]={1,0,-1,0};
boolean vis[][]=new boolean[R][C];

        ArrayList<Integer> list=new ArrayList<>() ;
int r=0,c=0,di=0;
        for (int i = 0; i <R*C ; i++) {
            list.add(matrix[r][c]);
            vis[r][c]=true;
            int cr= r+dr[di];
            int cc= c+dc[di];

            if(cr>=0&&cr<R&&cc>=0&&cc<C&&vis[cr][cc]==false){
                r=cr;
                c=cc;
            }
            else {
                di=(di+1)%4;
                r=r+dr[di];
                c=c+dc[di];
            }

        }
        Collections.reverse(list);
        for (int i = 0; i < list.size() ; i++) {
            ans[i]= list.get(i);
        }
        return ans;// code here
    }
    public static void main(String[] args) {
        int R = 4, C = 4;
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
int ans[]=reverseSpiral(R,C,matrix);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
