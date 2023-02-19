package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum_3_sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length==0|| nums.length<3) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2 ; i++) {
            if(nums[i]>0) break;

            if(i>0&&nums[i]==nums[i-1])
                continue;
        int j=i+1;
        int k=nums.length-1;

        while (j<k){
            if(nums[j]+nums[i]>0)
                break;


            if(j>i+1&&nums[j]==nums[j-1]) {
                j++;
                continue;
            }
            if(nums[i]+nums[j]+nums[k]<0)
                j++;

            else if(nums[i]+nums[j]+nums[k]>0)
                k--;
            else {
                ans.add( Arrays.asList(nums[i],nums[j],nums[k]));
j++;
k--;
            }
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=threeSum(nums);
        System.out.println(ans);

    }
}
