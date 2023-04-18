package Two_Pointers;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4_sum {
    static     public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(nums.length<4) return ans;

        for (int i = 0; i < nums.length-3 ; i++) {
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }

            for (int j = i+1; j < nums.length-2 ; j++) {
                int low=j+1;
                int high= nums.length-1;
                if (j!=i+1&&nums[j]==nums[j-1]) {
                    continue;
                }
                while (low<high){
                    long sum=nums[i]+nums[j]+nums[low]+nums[high];
                    
                    if(sum<target){
                      low++;
                    } else if (sum>target) {
                        high--;
                    }
else {
                        List<Integer> combination = new ArrayList<>();
                        combination.add(nums[i]);
                        combination.add(nums[j]);
                        combination.add(nums[low]);
                        combination.add(nums[high]);
ans.add(new ArrayList<>(combination));
low++;

high--;

while (low>high&&nums[low]==nums[low-1]){
    low++;
}
while (low>high&&nums[high]==nums[high+1]){
    high--;
}



                    }

                }




                }
            }


        return ans;
        // code here
    }
    public static void main(String[] args) {
        int N = 7, target = 23;
        int nums[] = {10,2,3,4,5,7,8};
ArrayList<ArrayList<Integer>> ans=fourSum(nums,target);
        System.out.println(ans);
    }
}
