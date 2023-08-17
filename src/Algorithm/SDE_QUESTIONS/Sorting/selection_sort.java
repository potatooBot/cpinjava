package Algorithm.SDE_QUESTIONS.Sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class selection_sort {
   static int  select(int arr[], int i)
    {
        int minValidx=-1;
        int val=arr[i];
        for (int j = i; j <arr.length ; j++) {
            if(arr[j]<=val){
                val=arr[j];
                minValidx=j;
            }
        }
        // code here such that selectionSort() sorts arr[]
    return minValidx;
    }

  static   void selectionSort(int arr[], int n)
    {

        for (int i = 0; i <n-1 ; i++) {
            int mini=i;
            int j=select(arr,i);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //code here
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        selectionSort(arr,N);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}
