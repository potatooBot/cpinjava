package Algorithm.SDE_QUESTIONS;
import java.util.*;
public class next_permutation {
    static List<Integer> nextPermutation(int N, int nums[]){
        int idx=-1;
        int n= nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }

        }
        System.out.println(idx);

        if(idx==-1) {
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i <nums.length ; i++) {
                list.add(nums[i]);
            }
            Collections.reverse(list);
            return list;
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

            Collections.reverse(ds);

            idx=idx+1;

            for (int i = 0; i <ds.size() ; i++) {
                nums[idx++]=ds.get(i);
            }
        }
        List<Integer> ds=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ds.add(nums[i]);
        }
        return ds;
    }

    public static void main(String[] args) {
int  N = 6;
        int[]arr = {1, 2, 3, 6, 5, 4};
        List<Integer> ans=nextPermutation(N,arr);
        System.out.println(ans);
    }
}
