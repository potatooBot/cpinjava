package Algorithm.Greedy.Hands_of_Straight;
import java.util.*;
public class hands_of_straight {

    public static String convert(String str){
        int cntLow=0;
        int cntUp=0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                cntUp++;
            }
            else{
                cntLow++;
            }
        }
        if(cntUp>cntLow) return str.toUpperCase();

        return str.toLowerCase();
    }

    public static int partition(int arr[],int low,int high){
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j) {
            while (arr[i] >= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] < pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
             return j;
    }
    public  static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pIdx=partition(arr,low,high);
            quickSort(arr,low,pIdx-1);
            quickSort(arr,pIdx+1,high);
        }

    }
    public static void main(String[] args) {
    int arr[]={3,1,4,2,8,2,6,-123};
    quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
