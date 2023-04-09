package Two_Pointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class valid_triangle {
    static    public int triangleNumber(int[] nums) {
int ans=0;
if(nums.length<3) return 0;
        Arrays.sort(nums);
        for (int i = 2; i <nums.length ; i++) {

            int left=0;
            int right=i-1;
            while (left<right){

                if(nums[left]+nums[right]>nums[i])
                {
                    ans=ans+(right-left);
                    right--;
                }
                else {
                    left++;
                }
                }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {2,2,3,4};
int ans=triangleNumber(nums);
        System.out.println(ans);
    }
}
