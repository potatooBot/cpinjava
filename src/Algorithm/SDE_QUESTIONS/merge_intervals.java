package Algorithm.SDE_QUESTIONS;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class merge_intervals {
    static public int[][] merge(int[][] inval) {

Arrays.sort(inval,(a,b)->Integer.compare(a[0],b[0]));
int idx=0;
ArrayList<ArrayList<Integer>> interval=new ArrayList<>();

        for (int i = 0; i <inval.length ; i++) {
            interval.add(new ArrayList<>());
        }
        for (int i = 0; i <inval.length ; i++) {
            for (int it:
                 inval[i]) {
                interval.get(i).add(it);
            }
        }
        System.out.println(interval);
        for (int i = 0; i <interval.size()-1 ; i++) {
            if(interval.get(i).get(1)>=interval.get(i+1).get(0)){
                if(interval.get(i+1).get(1)>interval.get(i).get(1)) {
                    interval.get(i).set(1, interval.get(i + 1).get(1));
                    interval.remove(i + 1);
                }
                else {
                    interval.get(i).set(1, interval.get(i).get(1));
                    interval.remove(i + 1);
                }
                i--;
            }
        }
        int ans[][]=new int[interval.size()][2];
        for (int i = 0; i <interval.size() ; i++) {

                ans[i][0]=interval.get(i).get(0);
                ans[i][1]=interval.get(i).get(1);

        }
return ans;
    }
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        int [][] intervals = {{1,4},{2,3}};
//        int [][] intervals = {{1,4},{0,2},{3,5}};
int ans[][]=merge(intervals);
        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j <ans[0].length ; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}
