package Heap_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class frequency_sort {
    public static void frequency_sort(String str){
        HashMap <Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        PriorityQueue <Map.Entry<Character,Integer>> maxheap=new PriorityQueue<>(
                (n1,n2)->n2.getValue()- n1.getValue()
        );
        maxheap.addAll(map.entrySet());

        StringBuilder sb=new StringBuilder();
        ArrayList <Character> lst=new ArrayList<>();
        while (!maxheap.isEmpty()){
Map.Entry <Character,Integer> entry=maxheap.poll();
//            for (int i = 0; i <entry.getValue() ; i++) {
//                sb.append(entry.getKey());
//            }

            lst.add(entry.getKey());
        }
        System.out.println(lst);
    }
    public static void main(String[] args) {
        String str="CodingSimpliefied";
        String res;
        frequency_sort(str);
    }
}
