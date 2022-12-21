package ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class rotate_array_optimised {


    public static void rotate_brute_force(int[] nums, int k) {
        k=k%nums.length;
        for(int j=0;j<k;j++){
            int temp=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
        }
    }

    public static void rotate(int[] nums, int k) {
     k=k% nums.length;
       rev(nums,0, nums.length-1);
       rev(nums,0, k-1);
       rev(nums,k, nums.length-1);
    }

    private static void rev(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

}
