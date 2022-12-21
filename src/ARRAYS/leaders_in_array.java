package ARRAYS;

import java.util.ArrayList;

//Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.
//
//
//
//        Example 1:
//
//        Input:
//        n = 6
//        A[] = {16,17,4,3,5,2}
//        Output: 17 5 2
//        Explanation: The first leader is 17
//        as it is greater than all the elements
//        to its right.  Similarly, the next
//        leader is 5. The right most element
//        is always a leader so it is also
//        included.
public class leaders_in_array {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList <Integer> list=new ArrayList<>();
        for (int i = 1; i <n-1 ; i++) {
            if(arr[i]>arr[i+1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[n-1]);
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0};

        ArrayList <Integer> list=new ArrayList<>();
list=leaders(arr, arr.length);
        System.out.println(list);
    }
}
