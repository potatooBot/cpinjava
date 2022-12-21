package Heap_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class min_cost_of_ropes {
    static long minCost(long arr[], int n)
    {
        PriorityQueue <Long> minHeap=new PriorityQueue<>();
        for (int i = 0; i <n ; i++) {
            minHeap.add(arr[i]);
        }
        List <Long> lst=new ArrayList<>();
        while (minHeap.size()!=1){
            long x=minHeap.poll();
            long y=minHeap.poll();
            minHeap.add(x+y);
            lst.add(x+y);
        }


            long sum = lst.stream().mapToLong(Long::longValue).sum();


        return sum;
    }
    public static void main(String[] args) {
        long arr[] = {4, 3, 2, 6};
        long res=minCost(arr, arr.length);
        System.out.println(res);
    }
}
