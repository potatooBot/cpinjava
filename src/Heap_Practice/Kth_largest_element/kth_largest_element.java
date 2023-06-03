package Heap_Practice.Kth_largest_element;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class kth_largest_element {
    static   int[] kLargest(int[] arr, int n, int k) {

        int ans[]=new int[k];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length ; i++) {
            pq.add(arr[i]);
        }
        int idx=0;
        for (int i = 0; i <k ; i++) {
            ans[idx++]=pq.poll();
        }
        System.out.println(Arrays.stream(ans).boxed().collect(Collectors.toList()));
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;int k = 2;
        int arr[] = {12, 5, 787, 1, 23};
int ans[]=kLargest(arr,n,k);
    }
}
