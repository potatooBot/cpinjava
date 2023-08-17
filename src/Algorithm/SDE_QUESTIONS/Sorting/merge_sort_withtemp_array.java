package Algorithm.SDE_QUESTIONS.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class merge_sort_withtemp_array {
    static void merge(int arr[], long low, long mid, long high)
    {
        long left=low;
        long right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while (left<=mid&&right<=high) {
            if (arr[(int)left] <= arr[(int)right]) {
                temp.add(arr[(int)left]);
                left++;
            } else {
temp.add(arr[(int) right]);
right++;
            }
        }
        while (left<=mid){
            temp.add(arr[(int)left] );
        left++;
        }
        while (right<=high){
            temp.add(arr[(int)right] );
            right++;
        }
//        System.out.println(temp);
        for (long i = low; i <= high; i++) {
            arr[(int)i] = temp.get((int)i-(int)low);
        }
//        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
    static void mergeSort(int arr[], long low, long high)
    {
        if(low>=high){
            return;
        }
        long mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int n= 17;
        int arr[] = {6334, 4098, 7968, 4523, 277, 6956, 4560, 2062, 5705, 5743, 879, 5626, 9961, 491, 2995, 741, 4827};
   mergeSort(arr,0,n-1);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}
