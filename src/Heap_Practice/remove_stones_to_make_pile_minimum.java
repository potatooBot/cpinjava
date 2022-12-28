package Heap_Practice;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
//You are given a 0-indexed integer array piles, where piles[i] represents the number of stones in the ith pile, and an integer k. You should apply the following operation exactly k times:
//
//        Choose any piles[i] and remove floor(piles[i] / 2) stones from it.
//        Notice that you can apply the operation on the same pile more than once.
//
//        Return the minimum possible total number of stones remaining after applying the k operations.
//
//        floor(x) is the greatest integer that is smaller than or equal to x (i.e., rounds x down).
public class remove_stones_to_make_pile_minimum {
    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue <Double> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < piles.length ; i++) {
            maxHeap.add((double)piles[i]);
        }
        for (int i = 1; i <=k ; i++) {
            maxHeap.add((double) Math.ceil(maxHeap.poll()/2));
        }
        System.out.println(maxHeap);
   double sum=0;
   int size= maxHeap.size();
        for (int i = 0; i <size ; i++) {
            sum=sum+maxHeap.poll();
        }

return (int)sum;
    }
    public static void main(String[] args) {
        int piles[] = {5,4,9};
int res=minStoneSum(piles,2);
        System.out.println(res);

    }
}
