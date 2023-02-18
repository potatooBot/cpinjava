package HashTable_Pract;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class k_diff_pair {
    public static int findPairs(int[] nums, int k) {
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        HashSet <Integer> set=new HashSet<>();
        int cout=0;
        for (int i = 0; i <nums.length ; i++) {
            set.add(nums[i]);
        }
        if(set.size()==1&&k==0)return 1;
       else if(k==0&&set.size()!=1) {
           set.clear();
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(nums[i] + k)) {
                    set.add(nums[i]);
                } else {
                    cout++;
                set.remove(nums[i]+k);
                }

            }
            return cout;
        }
        for (int i = 0; i <nums.length ; i++) {
     set.add(nums[i]);
        }

        for (int i = 0; i <nums.length ; i++) {
    if(set.contains(nums[i]+k)) {
        cout++;
    set.remove(nums[i]+k);
    }
        }
        return cout;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2},k=0;
        int ans=findPairs(arr,k);
        System.out.println(ans);
    }
}
