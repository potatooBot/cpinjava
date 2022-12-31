package Greedy;
//Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
//Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
//        Output: 1
//        Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class interval{
    int start;
    int end;
    public interval(int s,int e){
         this.start=s;
         this.end=e;
    }
}
class mycompareforintervals implements Comparator<interval>{
    @Override

//    First we sort the array by below rules
//
//1) sort by end, smaller end in front
//2) if end is same, sort by start, bigger start in front
//    Then, visited array by end. If we visited next closest end interval, access the bigger start priority.
    public int compare(interval o1, interval o2) {

        if (o1.end != o2.end) return o1.end - o2.end;  //first sort by end
        return o2.start - o1.start;
    }
}

public class non_overlapping {

    public static int eraseOverlapIntervals(int[][] inter) {
int start[]=new int[inter.length];
int end[]=new int[inter.length];
        for (int i = 0; i <inter.length ; i++) {
            start[i]=inter[i][0];
        }
        for (int i = 0; i <inter.length ; i++) {
            end[i]=inter[i][1];
        }
        ArrayList <interval> list=new ArrayList<>();
        for (int i = 0; i <end.length ; i++) {
            list.add(new interval(start[i],end[i]));


        }
        int count=0;
       mycompareforintervals my_custom=new mycompareforintervals();
        Collections.sort(list,my_custom);
        int size= list.size();
        for (int i = 0; i <size ; i++) {
            System.out.print(list.get(i).start+" ");
            System.out.print(list.get(i).end);
            System.out.println();
        }
        for (int i = 0; i <list.size()-1 ; i++) {
  if(list.get(i).end>list.get(i+1).start){
      list.remove(i+1);
      count++;
      i=i-1;
  }
        }
        System.out.println(count);
        return 1;
    }
public static void main(String[] args) {
//       int [][]intervals = {{1,2},{2,3},{3,4},{1,3}};
//       int [][]intervals = {{1,100},{11,22},{1,11},{2,12}};
//       int [][]intervals = {{1,2},{1,2},{1,2}};
       int [][]intervals = {{1,2},{2,3}};
eraseOverlapIntervals(intervals);
    }
}
