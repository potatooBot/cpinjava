package ARRAYS;
import java.util.*;
public class Find_Missing_And_Repeating {
    static void findTwoElement(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int miss=0;
int dup=0;
        HashSet <Integer> set=new HashSet<>();
        for (int i = 1; i <=n ; i++) {
            if(set.contains(arr[i])){
                dup=arr[i];
                break;
            }
        set.add(arr[i]);
        }

        for (int i = 0; i <n ; i++) {
            if(!set.contains(i)) {
                miss=i;
            }
        }
        int arr2[]=new int[2];

        arr[0]=dup;
        arr[1]=miss;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3};
        findTwoElement(arr, arr.length);
    }
}
