package Heap_Practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class last_weight_of_stone {
    public static void lastStoneweight(int arr[]){
        PriorityQueue <Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length ; i++) {
            maxheap.add(arr[i]);
        }
      while (maxheap.size()!=1){
          int x=maxheap.poll();
          int y=maxheap.poll();
          if(x!=y){
              maxheap.add(x-y);
          }
          else if(x==y){
              maxheap.add(0);
          }
      }
        int arr2[]=new int[maxheap.size()];
        for (int i = 0; i <maxheap.size() ; i++) {
            arr2[i]=maxheap.poll();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,2};
        lastStoneweight(arr);
    }
}
