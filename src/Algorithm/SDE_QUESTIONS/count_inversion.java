package Algorithm.SDE_QUESTIONS;

import java.util.ArrayList;
import java.util.Locale;

public class count_inversion {
    public static long merge(long arr[],long low,long mid,long high){
        long left=low;
        long right=mid+1;
        long count=0;
        ArrayList<Long> temp=new ArrayList<>();
        while (left<=mid&&right<=high) {
            if (arr[(int)left] <= arr[(int)right]) {
                temp.add((arr[(int)left]));
                left++;
            } else {
                count=count+(mid-left+1);
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
        return count;
    }
    public static long mergeSort(long arr[],long low,long high){
        long count=0;
        if(low>=high){
            return count;
        }
        long mid=(low+high)/2;
       count=count+ mergeSort(arr,low,mid);
       count=count+ mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
    return count;
    }
    static long inversionCount(long arr[], long n)
    {

        long count=mergeSort(arr,0,n-1);
     return count;   // Your Code Here
    }
    public static void main(String[] args) {
        int  n=5 ;
        long arr[] = {2, 4, 1, 3, 5};
    long ans=inversionCount(arr,n);
        System.out.println(ans);
    }
}
