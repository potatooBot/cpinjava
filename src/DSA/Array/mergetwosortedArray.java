package DSA.Array;

import java.util.Arrays;

public class mergetwosortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int m=3;
        int arr2[]={2,5,6};
        int n=3;
        int j=0;
    for (int i = m; i <m+n ; i++) {
            arr1[i]=arr2[j];
            j++;

    }
        Arrays.sort(arr1);
        for (int i = 0; i <m+n ; i++) {
            System.out.println(arr1[i]);
        }





    }
}
