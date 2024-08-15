package Algorithm.Merge_Interval.Minimum_number_of_taps_to_water_garden.m;

import java.util.Arrays;

public class minimum_number_of_taps_reqiure_to_water_garden {
    static   public int minTaps(int n, int[] ranges) {
int val[][]=new int[ranges.length][2];
        for (int i = 0; i < ranges.length ; i++) {
            val[i][0]=i-ranges[i];
            val[i][1]=i+ranges[i];
        }
Arrays.sort(val,(a,b)->Integer.compare(a[1],b[1]));
        for (int i = 0; i < val.length ; i++) {
            for (int j = 0; j <val[0].length ; j++) {
                System.out.print(val[i][j]+" ");
            }
            System.out.println();
        }
        int minTaps=-1;
        int len=val.length;
        int end=val[0][1];

        if(val[0][1]-val[0][0]>=n) return 1;
        for (int i = 1; i <len ; i++) {
           if(val[i][1]-val[i][0]>=n) return 1;
           if(val[i][1]==val[i][0]) continue;

            if(end<val[i][0]){
                minTaps++;
                end=val[i][1];
            }
        }



        return minTaps;
    }
    public static void main(String[] args) {
        int n = 3, ranges []= {0,0,0,0};
int ans=minTaps(n,ranges);
        System.out.println(ans);
    }
}
