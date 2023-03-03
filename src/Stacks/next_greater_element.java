package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class next_greater_element {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];

        int k=0;
        Arrays.fill(res,-1);
        boolean check=true;
        for (int i = 0; i <nums1.length ; i++) {

            check=true;
             for (int j = 0; j < nums2.length ; j++) {
                if(nums2[j]>nums1[i]) {
                   res[k++]=nums2[j];
                   check=false;
                break;
                }
            }
             if (check==true) k++;
        }


        return res;
    }
    public static void main(String[] args) {
        int nums1 []= {4,1,2}; int nums2 []= {1,3,4,2};
        int res[]=nextGreaterElement(nums1,nums2);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }
}
