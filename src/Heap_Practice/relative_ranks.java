package Heap_Practice;
import java.util.*;
public class relative_ranks {
    static  public String[] findRelativeRanks(int[] score) {
        PriorityQueue <Integer> maxHeap=new PriorityQueue<>();
        
    }
    public static void main(String[] args) {
        int score[] = {5,4,3,2,1};
        String ans[]=findRelativeRanks(score);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
