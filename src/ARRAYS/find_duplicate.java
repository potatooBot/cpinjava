package ARRAYS;
import java.util.*;
public class find_duplicate {
    public int findDuplicate(int[] arr) {

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            arr[i]=0;
            int idx=Arrays.binarySearch(arr,min);
            if(idx>=0) return min;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
