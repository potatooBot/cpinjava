package Leetcode;

import java.util.Arrays;
import java.util.*;
public class product_of_array_except_itself {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int leftProd[] = new int[length];
        int rightProd[] = new int[length];

        leftProd[0] = 1;
        for(int i=1;i<length;i++)
            leftProd[i]=leftProd[i-1]*nums[i-1];

        rightProd[length-1]=1;
        for(int i=length-1;i>=1;i--)
            rightProd[i-1] = rightProd[i]*nums[i];

        for(int i=0;i<length;i++)
            nums[i] = leftProd[i]*rightProd[i];

        return nums;

    }
    public static void main(String[] args) {
        int nums []= {-1,1,0,-3,3};
        int arr[]=new int[nums.length];
        arr=productExceptSelf(nums);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
