package Algorithm.Persistent_Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class q1 {
    public static int markerPlaced(ArrayList<Integer> startX,ArrayList<Integer> endX) {
        int n=startX.size();
        int points[][]=new int[n][n];
        for (int i = 0; i <n ; i++) {
            points[i][0]=startX.get(i);
            points[i][1]=endX.get(i);
        }
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int val=1;
        int end=points[0][1];
        for (int i = 1; i < points.length ; i++) {
            if(points[i][0]>end){
                val++;
                end=points[i][1];
            }
        }
        return val;
    }
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
        ArrayList<Integer> xS=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            xS.add(sc.nextInt());
        }

        int m=sc.nextInt();
        ArrayList <Integer> xE=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            xE.add(sc.nextInt());
        }

        int ans=markerPlaced(xS,xE);
        System.out.println(ans);

    }
}
