package Two_Pointers.Next_Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class next_permutation {
    static     public void nextPermutation(int[] nums) {
int idx=-1;
int n= nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }

        }


        if(idx==-1) {
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <nums.length ; i++) {
                list.add(nums[i]);
            }
            Collections.reverse(list);
            for (int i = 0; i <list.size() ; i++) {
                nums[i]=list.get(i);
            }
        }
        else {

            for (int i = n - 1; i > idx; i--) {
                if (nums[i] > nums[idx]) {
                    int temp = nums[idx];
                    nums[idx] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            ArrayList<Integer> ds=new ArrayList<>();
            for (int i = idx+1; i <n ; i++) {
                ds.add(nums[i]);
            }
            System.out.println(ds);
            Collections.reverse(ds);
            System.out.println(ds);
            idx=idx+1;
//        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            for (int i = 0; i <ds.size() ; i++) {
                nums[idx++]=ds.get(i);
            }
        }

    }
    public static void main(String[] args) {
        int nums []= {3,2,1};
    nextPermutation(nums);
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }
}
