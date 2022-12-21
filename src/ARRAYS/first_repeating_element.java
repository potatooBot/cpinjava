package ARRAYS;
import java.util.*;
public class first_repeating_element {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here'
        HashSet <Integer> set=new HashSet<>();
        int min=-1;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(set.contains(arr[i])) min= i+1;

                set.add(arr[i]);

        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        int res=firstRepeated(arr,arr.length);
        System.out.println(res);
    }
}
