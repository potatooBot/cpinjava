package Heap_Practice;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
public class top_k_frequent_element {

    public static void topKFrequentlyOccurredNumbersUsingMinHeap(int []arr, int k){
        Map <Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue <Map.Entry<Integer,Integer>> minheap=new PriorityQueue<>((n1, n2) -> n1.getValue() - n2.getValue());

        for(Map.Entry <Integer,Integer> entry :map.entrySet()){
            if(minheap.size()<k){
                minheap.add(entry);
            }
            else {
                if(entry.getValue()>minheap.peek().getValue()){
minheap.poll();
minheap.add(entry);
                }


            }
        }
        List<Integer> list = new ArrayList<>();

        while(!minheap.isEmpty()) {
            list.add(minheap.poll().getKey());
        }
        int arr2[]=new int[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            arr2[i]=list.get(i);
        }

    }
    public static void main(String[] args) {
        int[] arr = {8, 10, 7, 8, 11, 30, 11, 8, 38, 11, 2, 45, 2, 8};
        int k = 4;

        topKFrequentlyOccurredNumbersUsingMinHeap(arr, k);
    }
}
