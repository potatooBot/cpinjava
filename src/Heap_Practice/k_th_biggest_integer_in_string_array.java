package Heap_Practice;

import java.util.PriorityQueue;

public class k_th_biggest_integer_in_string_array {
    public static String kthLargestNumber(String[] nums, int k) {
        if (nums == null || nums.length == 0)
            return "";
        int length = nums.length;
        PriorityQueue<String> minHeap = new PriorityQueue<>((s1, s2) -> {
            if (s1.length() == s2.length())
                return s2.compareTo(s1);
            else
                return Integer.compare(s2.length(), s1.length());
        });
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
        }

        String str = "";
        for (int i = 1; i < k; i++) {
            str = minHeap.poll();

        }
        System.out.println(minHeap.poll());
        return "";
    }
    public static void main(String[] args) {

        String []nums = {"3","6","7","10"};int  k = 4;
        System.out.println(kthLargestNumber(nums,k));

    }
}
