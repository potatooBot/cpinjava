package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subsets_sum_basic {
    public static void printSubse(int arr[], int idx, ArrayList<Integer> arrdq, int n, int sum) {
        if (idx == n) {



           arrdq.add(sum);
            return;
        }

//        arrdq.add(arr[idx]);
sum=sum+arr[idx];
       printSubse(arr, idx+1, arrdq, n,sum);
//        arrdq.remove(Integer.valueOf(arr[idx]));
sum=sum-arr[idx];
    printSubse(arr, idx+1, arrdq, n,sum);

}
    public static void main(String[] args) {
        ArrayList<Integer> arrdq=new ArrayList<>();
        ArrayList<Integer> sumList=new ArrayList<>();

        int arr[]={2,3};
int sum=0;
        printSubse(arr,0,arrdq,arr.length,sum);
        System.out.println(arrdq);
    }
}
