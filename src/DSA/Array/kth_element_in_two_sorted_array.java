package DSA.Array;

import java.util.ArrayList;
import java.util.Collections;

public class kth_element_in_two_sorted_array {
    static    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length ; i++) {
            list.add(arr2[i]);
        }
        Collections.sort(list);

        return list.get(k-1);
    }
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9},
        arr2[] = {1, 4, 8, 10};
        int k = 5;
        long ans=kthElement(arr1,arr2,arr1.length,arr2.length,k);
        System.out.println(ans);
    }
}
