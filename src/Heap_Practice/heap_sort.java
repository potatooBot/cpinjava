package Heap_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class heap_sort {

    static ArrayList<Integer> heap_sort(int []arr){

            PriorityQueue <Integer> mp=new PriorityQueue<>();
            for (int j = 0; j < arr.length ; j++) {
                mp.add(arr[j]);
            }
            ArrayList <Integer> lst=new ArrayList<>();
            for (int j = 0; j < arr.length ; j++) {
                lst.add(mp.poll());
            }
            return lst;

        }


    public static void main(String[] args) {
        int arr[]={5,41,2,5,85,63,1,0,789};
        List<Integer> lst=new ArrayList<>();
        lst=heap_sort(arr);
        System.out.println(lst);
    }
}
