package Matrix_prac;

import java.util.Arrays;
import java.util.stream.Collectors;

public class find_a_peak_element {
    static    public int[] findPeakGrid(int[][] mat) {
int ans[]=new int[2];
int delrow[]={-1,0,1,0};
int delcol[]={0,1,0,-1};
boolean flag=false;

        for (int i = 0; i <mat.length ; i++) {
       if(flag==true) break;
            for (int j = 0; j < mat[0].length ; j++) {
                int count=0;
               if(flag==true) break;
                int val=mat[i][j];
                for (int k = 0; k <4 ; k++) {
                int neiRow=i+delrow[k];
                int neiCol=j+delcol[k];
                if((neiRow<0||neiRow>= mat.length||neiCol<0||neiCol>=mat[0].length)&&val> -1||val>mat[neiRow][neiCol]){
                  count++;
                }
                if(count==4){
                    ans[0]=i;
                    ans[1]=j;
                    flag=true;
                    break;
                }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int [][] mat = {{10,20,15},{21,30,14},{7,16,32}};
int ans[]=findPeakGrid(mat);
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));

    }
}
