package Greedy;

import java.util.Arrays;

//class myCord {
//    int start;
//    int end;
//    myCord(int s,int e){
//        this.start=s;
//        this.end=e;
//    }
//    public int getStart(){
//        return start;
//    }
//    public int getEnd(){
//        return end;
//    }
//        }
//
//        class Mycomp implements Comparator<myCord>{
//            @Override
//            public int compare(myCord o1, myCord o2) {
//                return  o1.end-o2.end;
//            }
//        }
public class minimum_number_of_arrows_to_burst_balloons {
    public static int findMinArrowShots(int[][] points) {
//        int start[]=new int[points.length];
//        int end[]=new int[points.length];
//        for (int i = 0; i <points.length ; i++) {
//            start[i]=points[i][0];
//        }
//        for (int i = 0; i <points.length ; i++) {
//            end[i]=points[i][1];
//        }
//        ArrayList <myCord> list=new ArrayList<>();
//        for (int i = 0; i < points.length ; i++) {
//            list.add(new myCord(start[i],end[i]));
//        }


//        Collections.sort(list,(a,b)->a.getEnd()-b.getEnd());
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
       int arrow=1;
       int end=points[0][1];
        for (int i = 1; i < points.length ; i++) {
            if(points[i][0]>end){
                arrow++;
                end=points[i][1];
            }
        }

      return arrow;
    }
    public static void main(String[] args) {
        int points[][] = {{10,16},{2,8},{1,6},{7,12}};
//        int points[][] = {{1,2},{3,4},{5,6},{7,8}};
//        int points[][] = {{1,2},{2,3},{3,4},{4,5}};
        int count=findMinArrowShots(points);
        System.out.println(count);
    }
}
