package Heap_Practice;

import java.util.*;
class CustomCom implements Comparator<Map.Entry<Integer, Integer>>{

    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2){

        if(m1.getValue() == m2.getValue())
            return m1.getKey() - m2.getKey();
        else
            return m2.getValue() - m1.getValue();
    }


}
public class frequncy_sort_for_numbers {
    public static void sortelemenybyfrequency(int []arr){
        {
            // add your code here
            HashMap <Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < arr.length ; i++) {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
            }

            PriorityQueue <Map.Entry<Integer,Integer>> maxHeap=new PriorityQueue<>(
                    new CustomCom()
            );
            maxHeap.addAll(map.entrySet());
            ArrayList <Integer> lst=new ArrayList<>();
            ArrayList <Integer> lst2=new ArrayList<>();
            while (!maxHeap.isEmpty())
            {
                Map.Entry<Integer,Integer> entry=maxHeap.poll();

                for (int i = 0; i <entry.getValue() ; i++) {
                    lst.add(entry.getKey());
                }
                lst2.add(entry.getKey());
            }
            System.out.println(lst);
            System.out.println(lst2);

        }
    }
    public static void main(String[] args) {
        int arr[]={-1,1,-6,4,5,-6,1,4,1};
        sortelemenybyfrequency(arr);
    }
}
