package Heap_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class top_k_largest_value {
    static ArrayList<Integer> findtopklargestminHeap(int []arr,int k){
        PriorityQueue <Integer> minheap=new PriorityQueue<>();
        for (int i = 0; i <k ; i++) {
            minheap.add(arr[i]);
        }
        for (int i = k; i < arr.length ; i++) {
            if(arr[i]> minheap.peek()){
                minheap.poll();
                minheap.add(arr[i]);
            }
        }
        ArrayList <Integer> lst=new ArrayList<>();
        for (int i = 0; i <k ; i++) {
            lst.add(minheap.poll());
        }
        return lst;
    }
    public static void main(String[] args) {
        int arr[]={5,41,2,5,85,63,1,0,789};
        int k=3;
        List <Integer> lst=new ArrayList<>();
        lst=findtopklargestminHeap(arr,k);
        System.out.println(lst);
    }
}
