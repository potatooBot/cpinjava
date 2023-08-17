package Algorithm.Brute_Force;

import java.util.HashSet;

public class complte_subarray {
    static  public int countCompleteSubarrays(int[] nums) {
HashSet<Integer> set=new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
int ans=0;

        for (int i = 0; i <nums.length ; i++) {
            HashSet<Integer> set2=new HashSet<>();
            for (int j = i; j < nums.length ; j++) {
                set2.add(nums[j]);

                if(set2.size()==set.size()){
          ans++;
                }
                else if(set2.size()> set.size()){
                    break;
                }
            }
        }


        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {5,5,5,5};
    int ans=countCompleteSubarrays(nums);
        System.out.println(ans);
        }
}
