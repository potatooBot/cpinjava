package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class median_of_two_sorted_array {
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};
        int arr3[]=new int[arr.length+ arr2.length];
      int k=0;
        for (int i = 0; i < arr.length ; i++) {
           arr3[k]=arr[i];
           k++;
        }

        for (int i = 0; i < arr2.length ; i++) {
            arr3[k]=arr2[i];
            k++;
        }

        Arrays.sort(arr3);
        for (int i = 0; i < arr3.length ; i++) {
            System.out.println(arr3[i]);
        }
        double median=0;
int low=0;
int high= arr3.length-1;
int mid=(low+high/2);
int midInc=mid+1;

        if(arr3.length%2!=0){
median=(double)arr3[mid];
            System.out.println(median);
        }
        else{
median=(double) (arr3[mid]+arr3[midInc])/2;
            System.out.println(median);
        }

    }
}
