package DAA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class non_overlapping_intervals {

    public static void non_overlapping(int mat[][]){
//        for (int i = 0; i < mat.length-1; i++) {
//            System.out.println(mat[i][1]); 2 3 4 3
//            if (mat[i][1] > mat[i + 1][1]) {
//                int temp = mat[i][1];
//                mat[i][1] = mat[i + 1][1];
//                mat[i + 1][1] = temp;
//            }
//
//        }
        List <Integer> rowlist=new ArrayList<>();
        List <Integer> collist=new ArrayList<>();
        for (int i = 0; i < mat.length ; i++) {
            rowlist.add(mat[i][0]);

        }
        for (int j = 0; j <mat.length ; j++) {
            collist.add(mat[j][1]);
        }

        for (int i = 0; i <rowlist.size() ; i++) {
            for (int j = 0; j <rowlist.size() ; j++) {
                if(collist.get(i)>collist.get(j)){
                    Collections.swap(collist,i,j);
                    Collections.swap(rowlist,i,j);
                }
            }
        }
Collections.reverse(rowlist);
Collections.reverse(collist);
int count=0;
        System.out.println(rowlist);
        System.out.println(collist);
        for (int i = 0; i < rowlist.size()-1 ; i++) {
            if(rowlist.get(i)<=rowlist.get(i+1)&&collist.get(i)<= collist.get(i+1)){
                count++;
            }
        }
        System.out.println(count-1);
    }
    public static void main(String[] args) {
        int mat[][]={{1,2},{1,2},{1,2}};
      non_overlapping(mat);
//        System.out.println(res);
    }
}
